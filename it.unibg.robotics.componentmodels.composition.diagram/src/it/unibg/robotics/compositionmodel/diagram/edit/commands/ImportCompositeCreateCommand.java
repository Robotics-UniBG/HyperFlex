package it.unibg.robotics.compositionmodel.diagram.edit.commands;

import it.unibg.robotics.componentmodels.roscompositionmodel.ROSMsgConsumer;
import it.unibg.robotics.componentmodels.roscompositionmodel.ROSMsgProducer;
import it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelFactory;
import it.unibg.robotics.componentmodels.shared.filters.ViewerFileFilter;
import it.unibg.robotics.compositionmodel.Composite;
import it.unibg.robotics.compositionmodel.System;
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
public class ImportCompositeCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public ImportCompositeCreateCommand(CreateElementRequest req) {
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

		Composite newElement;

		IFile file;

		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				Display.getDefault().getActiveShell(),
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());

		dialog.addFilter(new ViewerFileFilter("roscomponentmodel"));
		dialog.addFilter(new ViewerFileFilter("orocoscomponentmodel"));

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

				if ((ecoreResource.getContents().get(0) instanceof ArchitectureModel)) {


					newElement = roscompositionmodelFactory.eINSTANCE.createROSComposite();
					
					Package originalComposite = ((ArchitectureModel) ecoreResource
							.getContents().get(0)).getPackage();

					newElement.setName(originalComposite.getName());

					
					for (it.unibg.robotics.roscomponentmodel.PackageMsgProducer msgProducer : originalComposite.getMsgProducers()) {

						ROSMsgProducer providedInterface = roscompositionmodelFactory.eINSTANCE
								.createROSMsgProducer();
						providedInterface.setName(msgProducer.getName());
						providedInterface.setMsgProducer(msgProducer);
						newElement.getProvInterfaces().add(providedInterface);

					}

					for (it.unibg.robotics.roscomponentmodel.PackageMsgConsumer msgConsumer : originalComposite.getMsgConsumers()) {

						ROSMsgConsumer requiredInterface = roscompositionmodelFactory.eINSTANCE
								.createROSMsgConsumer();
						requiredInterface.setName(msgConsumer.getName());
						requiredInterface.setMsgConsumer(msgConsumer);
						newElement.getReqInterfaces().add(requiredInterface);

					}

					System owner = (System) getElementToEdit();
					owner.getComposites().add(newElement);

					doConfigure(newElement, monitor, info);

					((CreateElementRequest) getRequest()).setNewElement(newElement);
					return CommandResult.newOKCommandResult(newElement);
				}else if ((ecoreResource.getContents().get(0) instanceof 
						it.unibg.robotics.orocoscomponentmodel.System)) {
					//TODO
				}
				else{
					return CommandResult
							.newErrorCommandResult("The selected file is not a ROS package model");
				}

			}

			return CommandResult.newErrorCommandResult("File Selection Error");

		} else {
			return CommandResult.newErrorCommandResult("File Selection Error");
		}

	}

	/**
	 * @generated
	 */
	protected void doConfigure(Composite newElement, IProgressMonitor monitor,
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
