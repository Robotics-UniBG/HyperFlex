package it.unibg.robotics.featuremodels.ui.views;


import it.unibg.robotics.featuremodels.constraints.utility.ConstraintChecker;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureModelEditPart;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelDiagramEditor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import featureModel.CompositeFeature;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.Instance;
import featureModel.featureModelFactory;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class InstanceView extends ViewPart implements ISelectionListener, PropertyChangeListener{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "it.unibg.robotics.featuremodels.ui.views.instanceview";

	private TableViewer viewer;
	private Action actionSelect;
	private Action actionRemove;
	private Action actionAdd;
	private Action actionValidate;

	private FeatureModel model;
	private FeatureModelEditPart modelEditPart;
	private TransactionalEditingDomain editingDomain;

	private FeatureModelDiagramEditor lastEditor;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			Object o[] = new Object[0];
			IEditorPart activeEditor = null;
			try{
				activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			}catch(NullPointerException e){
				return o;
			}
			FeatureModelDiagramEditor featureEditor = null;
			if(activeEditor instanceof FeatureModelDiagramEditor){
				featureEditor = (FeatureModelDiagramEditor)activeEditor;
				editingDomain = featureEditor.getEditingDomain();
				DiagramEditPart diagramEditPart = featureEditor.getDiagramEditPart();
				if(diagramEditPart instanceof FeatureModelEditPart){
					modelEditPart = (FeatureModelEditPart)diagramEditPart;
					setCurrentModel(modelEditPart);
					return model.getInstances().toArray();
				}
			}
			return o;
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public InstanceView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		viewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION |SWT.BORDER);
		createColumns(parent, viewer);
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);


		viewer.setContentProvider(new ViewContentProvider());
		//viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.horizontalSpan = 3;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;

		viewer.getControl().setLayoutData(gridData);
		viewer.getControl().update();

		viewer.refresh();

		getSite().setSelectionProvider(viewer);

		getViewSite().getPage().addSelectionListener(this);

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "it.unibg.robotics.featureModel.view.ui.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	public void createViewer(){

	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				InstanceView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(actionSelect);
		manager.add(new Separator());
		manager.add(actionAdd);
		manager.add(actionRemove);
		manager.add(new Separator());
		manager.add(actionValidate);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(actionSelect);
		manager.add(new Separator());
		manager.add(actionAdd);
		manager.add(actionRemove);
		manager.add(new Separator());
		manager.add(actionValidate);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(new Separator());
		manager.add(actionSelect);
		manager.add(new Separator());
		manager.add(actionAdd);
		manager.add(actionRemove);
		manager.add(new Separator());
		manager.add(actionValidate);
	}

	private void makeActions() {

		actionAdd = new Action() {
			public void run() {
				addInstance();
			}
		};
		actionAdd.setText("Create new instance");
		actionAdd.setToolTipText("Create new instance");
		actionAdd.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_ADD));

		actionSelect = new Action() {
			public void run() {
				selectInstance();
			}
		};
		actionSelect.setText("Select instance");
		actionSelect.setToolTipText("Select selected instance");
		actionSelect.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER));

		actionRemove = new Action() {
			public void run() {
				removeInstance();
			}
		};
		actionRemove.setText("Remove instance");
		actionRemove.setToolTipText("Remove selected instance");
		actionRemove.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_DELETE));

		actionValidate = new Action() {
			public void run() {
				validateInstance();
			}
		};
		actionValidate.setText("Validate instance");
		actionValidate.setToolTipText("Validate selected instance");
		actionValidate.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				actionSelect.run();
			}
		});
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	private void createColumns(final Composite parent, final TableViewer viewer) {
		String[] titles = { "Id", "Description", "Selected"};
		int[] bounds = {150, 600, 150};

		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Instance i = (Instance) element;
				return i.getId();
			}
		});

		col = createTableViewerColumn(titles[1], bounds[1], 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Instance i = (Instance) element;
				return i.getDescritpion();
			}
		});

		col = createTableViewerColumn(titles[2], bounds[2], 2);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Instance i = (Instance) element;
				if(model.getSelectedInstance()!= null && 
						model.getSelectedInstance().equals(i)){
					return "Selected";
				}else{
					return "";
				}
			}
		});

	}

	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if(selection instanceof IStructuredSelection && part instanceof FeatureModelDiagramEditor && 
				!((FeatureModelDiagramEditor)part).equals(lastEditor)){ // The last is needed in case I have more than one feature diagram editor open

			lastEditor = (FeatureModelDiagramEditor)part;
			viewer.refresh();
		}

	}

	private void addInstance(){
		IInputValidator validator = new IInputValidator() {
			public String isValid(String newText) {
				if(newText.length()>0)
					return null;
				else
					return "";
			}
		};

		InputDialog idDialog = new InputDialog(null, "Instance id", 
				"Define instance id", "", validator);
		idDialog.open();
		final String id = idDialog.getValue();
		InputDialog descriptionDialog = new InputDialog(null, "Instance description", 
				"Define instance description", "", validator);
		descriptionDialog.open();
		final String instDescription = descriptionDialog.getValue();

		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
			@SuppressWarnings("unchecked")
			@Override
			protected void doExecute() {
				Instance instance = featureModelFactory.eINSTANCE.createInstance();
				model.getInstances().add(instance);
				instance.setId(id);
				instance.setDescritpion(instDescription);
				model.setSelectedInstance(instance);
				addAllMandatoryFeaures(instance, model);
				updateAllFigures();
				viewer.refresh();
				StructuredSelection selection = new StructuredSelection(instance);
				viewer.setSelection(selection);
			}
		});


	}

	private void removeInstance(){

		ISelection selection = viewer.getSelection();
		if(selection instanceof StructuredSelection){
			StructuredSelection structuredSel = (StructuredSelection)selection;
			if(structuredSel.getFirstElement() instanceof Instance){
				final Instance instance = (Instance)structuredSel.getFirstElement();
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
					@SuppressWarnings("unchecked")
					@Override
					protected void doExecute() {
						model.getInstances().remove(instance);
					}
				});
				model.setSelectedInstance(null);
				updateAllFigures();
				viewer.refresh();
			}else{
				return;
			}
		}

	}

	private void selectInstance(){

		
		ISelection selection = viewer.getSelection();
		if(selection instanceof StructuredSelection){
			StructuredSelection structuredSel = (StructuredSelection)selection;
			if(structuredSel.getFirstElement() instanceof Instance){
				Instance instance = (Instance)structuredSel.getFirstElement();

				model.setSelectedInstance(instance);
				MessageDialog.openInformation(
						null,
						"Instance Selection",
						"Instance " + instance.getId() + " selected as working instance");
//				MessageDialog.openWarning(null, "Message", 
//						"Instance " + instance.getId() + " selected as working instance");
				updateAllFigures();

				viewer.refresh();

				selection = new StructuredSelection(instance);
				viewer.setSelection(selection);


			}else{
				return;
			}
		}

	}

	private void validateInstance(){

		if(model.getSelectedInstance() == null){
			MessageDialog.openError(null, "ERROR", "An instance has to be selected in order to validate it!");
			return;
		}

		ConstraintChecker cc = new ConstraintChecker(model);
		if(cc.checkConstraints()){
			MessageDialog.openInformation(null, "Selection validation", 
					"All the constraints are satisfied");
		}
	
	}

	private void addAllMandatoryFeaures(Instance instance, FeatureModel model){
		Feature root = model.getRootFeature();
		addSubMandatoryFeatures(instance, root);
	}
	private void addSubMandatoryFeatures(Instance instance, Feature feature){
		if(feature.isRequired()){
			instance.getSelectedFeatures().add(feature);
		}
		for(Iterator<Feature> it = feature.getSubFeatures().iterator(); it.hasNext();){
			addSubMandatoryFeatures(instance, it.next());
		}
		for(Iterator<CompositeFeature> cfIt = feature.getSubCompositeFeatures().iterator(); cfIt.hasNext();){
			CompositeFeature cf = cfIt.next();
			for(Iterator<Feature> fIt = cf.getSubFeatures().iterator();fIt.hasNext();){
				addSubMandatoryFeatures(instance, fIt.next());
			}
		}

	}
	private void updateAllFigures(){
		Iterator<EditPart> it = modelEditPart.getChildren().iterator();
		while(it.hasNext()){
			EditPart ep = it.next();
			if(ep instanceof Feature2EditPart){
				((Feature2EditPart)ep).getPrimaryShape().updateColor();
			}
		}
	}

	private void setCurrentModel(FeatureModelEditPart modelEditPart){
		if(model != null){
			model.removePropertyChangeListener(this);

		}
		model = (FeatureModel)modelEditPart.resolveSemanticElement();
		model.addPropertyChangeListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {

		if(event.equals(FeatureModel.INSTANCE_SELECTED_PROPERTY)){

		}

	}
}