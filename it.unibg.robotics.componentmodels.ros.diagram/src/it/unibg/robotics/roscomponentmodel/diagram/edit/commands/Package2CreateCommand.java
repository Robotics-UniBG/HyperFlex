package it.unibg.robotics.roscomponentmodel.diagram.edit.commands;

import it.unibg.robotics.componentmodels.shared.filters.ViewerFileFilter;
import it.unibg.robotics.roscomponentmodel.ArchitectureModel;
import it.unibg.robotics.roscomponentmodel.Package;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @generated
 */
public class Package2CreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public Package2CreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		IFile file;

		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				Display.getDefault().getActiveShell(),
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());

		dialog.addFilter(new ViewerFileFilter("roscomponentmodel"));

		dialog.setTitle("Model Selection");
		dialog.setMessage("Select the model from the tree:");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

		if (dialog.open() == ElementTreeSelectionDialog.OK) {

			Object obj = dialog.getFirstResult();

			if (obj instanceof IFile) {

				file = (IFile) obj;
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource ecoreResource = resourceSet.getResource(
						URI.createPlatformResourceURI(file.getFullPath()
								.toFile().getAbsolutePath(), true), true);

				try {
					ecoreResource.load(null);
				} catch (IOException e) {

					e.printStackTrace();
					return CommandResult
							.newErrorCommandResult("File Selection Error");
				}

				ArchitectureModel ePackage = (ArchitectureModel) ecoreResource
						.getContents().get(0);
				Package newElement = ePackage.getPackage();

				Package owner = (Package) getElementToEdit();

				owner.getNodes().add(newElement);

				doConfigure(newElement, monitor, info);

				((CreateElementRequest) getRequest()).setNewElement(newElement);
				return CommandResult.newOKCommandResult(newElement);

			}

		} else {
			return CommandResult.newErrorCommandResult("File Selection Error");
		}

		//		Package newElement = it.unibg.robotics.roscomponentmodel.roscomponentmodelFactory.eINSTANCE
		//				.createPackage();

		//		
		return null;
	}

	/**
	 * @generated
	 */
	protected void doConfigure(Package newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
