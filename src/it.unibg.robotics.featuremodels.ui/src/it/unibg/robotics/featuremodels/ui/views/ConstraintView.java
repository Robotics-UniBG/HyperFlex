package it.unibg.robotics.featuremodels.ui.views;


import it.unibg.robotics.featuremodels.Constraint;
import it.unibg.robotics.featuremodels.ConstraintType;
import it.unibg.robotics.featuremodels.FeatureModel;
import it.unibg.robotics.featuremodels.featuremodelsFactory;
import it.unibg.robotics.featuremodels.constraints.utility.ConstraintChecker;
import it.unibg.robotics.featuremodels.constraints.utility.ConstraintRuleDialog;
import it.unibg.robotics.featuremodels.diagram.edit.parts.FeatureModelEditPart;
import it.unibg.robotics.featuremodels.diagram.part.FeatureModelDiagramEditor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
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
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;



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

public class ConstraintView extends ViewPart implements PropertyChangeListener{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "it.unibg.robotics.featuremodels.ui.views.constraintview";

	private TableViewer viewer;
	private Action actionEdit;
	private Action actionRemove;
	private Action actionAdd;

	private FeatureModel model;
	private FeatureModelEditPart modelEditPart;
	private TransactionalEditingDomain editingDomain;
	private ConstraintChecker constraintChecker;

	//private FeatureModelDiagramEditor lastEditor;

	//private Instance currentInstance = null;

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
					setCurrentModel();
					constraintChecker = new ConstraintChecker(model);
					return model.getConstraints().toArray();
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
	public ConstraintView() {
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

		//getViewSite().getPage().addSelectionListener(this);
		//getViewSite().getWorkbenchWindow().getSelectionService().addSelectionListener(InstanceView.ID, this);


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
				ConstraintView.this.fillContextMenu(manager);
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
		manager.add(actionEdit);
		manager.add(new Separator());
		manager.add(actionAdd);
		manager.add(actionRemove);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(actionEdit);
		manager.add(new Separator());
		manager.add(actionAdd);
		manager.add(actionRemove);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(new Separator());
		manager.add(actionEdit);
		manager.add(new Separator());
		manager.add(actionAdd);
		manager.add(actionRemove);
	}

	private void makeActions() {

		actionAdd = new Action() {
			public void run() {
				addConstraint();
			}
		};
		actionAdd.setText("Create new constraint");
		actionAdd.setToolTipText("Create new constraint");
		actionAdd.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_ADD));

		actionEdit = new Action() {
			public void run() {
				editConstraint();
			}
		};
		actionEdit.setText("Edit constraint");
		actionEdit.setToolTipText("Edit constraint");
		actionEdit.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER));

		actionRemove = new Action() {
			public void run() {
				removeConstraint();
			}
		};
		actionRemove.setText("Remove constraint");
		actionRemove.setToolTipText("Remove selected constraint");
		actionRemove.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_DELETE));

	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				actionEdit.run();
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
		String[] titles = { "Id", "Rule", "Satisfied"};
		int[] bounds = {150, 600, 150};

		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Constraint c = (Constraint) element;
				return c.getName();
			}
		});

		col = createTableViewerColumn(titles[1], bounds[1], 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Constraint c = (Constraint) element;
				return c.getRule();
			}
		});

		col = createTableViewerColumn(titles[2], bounds[2], 2);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if(model.getSelectedInstance() == null){
					return "Select an instace";
				}
				Constraint c = (Constraint) element;
				int result = constraintChecker.checkExplicitConstraint(c);
				if(result == ConstraintChecker.CONSTRAINT_SATISFIED)
					return "True";
				else if(result == ConstraintChecker.CONSTRAINT_VIOLATED)
					return "False";
				else  if(result == ConstraintChecker.CONSTRAINT_NOT_ACTIVE)
					return "Not Active";
				else
					return "";
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

	private void addConstraint(){
		ConstraintRuleDialog dialog = new ConstraintRuleDialog(null, model,"","");
		int answer = dialog.open();
		if(answer==IDialogConstants.OK_ID){
			final String rule = dialog.getRule();
			final String name = dialog.getName();
			editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
				@Override
				protected void doExecute() {
					Constraint newConstraint = featuremodelsFactory.eINSTANCE.createConstraint();
					newConstraint.setRule(rule);
					newConstraint.setName(name);
					if (rule.contains("REQUIRES"))
						newConstraint.setType(ConstraintType.REQUIRES);
					else if (rule.contains("EXCLUDES"))
						newConstraint.setType(ConstraintType.EXCLUDES);
					model.getConstraints().add(newConstraint);
				}
			});
		}
		viewer.refresh();


	}

	private void editConstraint(){

		ISelection selection = viewer.getSelection();
		if(selection instanceof StructuredSelection){
			StructuredSelection structuredSel = (StructuredSelection)selection;
			if(structuredSel.getFirstElement() instanceof Constraint){
				final Constraint constraint = (Constraint)structuredSel.getFirstElement();

				ConstraintRuleDialog dialog = new ConstraintRuleDialog(null, model,
						constraint.getRule(), constraint.getName());

				int answer = dialog.open();
				final String rule = dialog.getRule();
				final String name = dialog.getName();

				if(answer==IDialogConstants.OK_ID){
					editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
						@Override
						protected void doExecute() {
							constraint.setRule(rule);
							constraint.setName(name);
							if (rule.contains("REQUIRES"))
								constraint.setType(ConstraintType.REQUIRES);
							else if (rule.contains("EXCLUDES"))
								constraint.setType(ConstraintType.EXCLUDES);
						}	
					});
				}
				viewer.refresh();
			}else{
				return;
			}
		}

	}

	private void removeConstraint(){

		ISelection selection = viewer.getSelection();
		if(selection instanceof StructuredSelection){
			StructuredSelection structuredSel = (StructuredSelection)selection;
			if(structuredSel.getFirstElement() instanceof Constraint){
				final Constraint constraint = (Constraint)structuredSel.getFirstElement();
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
					@Override
					protected void doExecute() {
						model.getConstraints().remove(constraint);
					}
				});
				viewer.refresh();
			}else{
				return;
			}
		}

	}

	private void setCurrentModel(){
		if(model != null){
			model.removePropertyChangeListener(this);
		}
		model = (FeatureModel)modelEditPart.resolveSemanticElement();
		model.addPropertyChangeListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {

		String propertyName = event.getPropertyName();
		if(propertyName.equals(FeatureModel.INSTANCE_SELECTED_PROPERTY) || propertyName.equals(FeatureModel.INSTANCE_UPDATED_PROPERTY)){
			//currentInstance = (Instance)event.getNewValue();
			viewer.refresh();
		}

	}


}