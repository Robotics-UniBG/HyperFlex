/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package it.unibg.robotics.resolutionmodel.rtt.commands.resolution.handlers;

import it.unibg.robotics.featuremodels.Feature;
import it.unibg.robotics.featuremodels.FeatureModel;
import it.unibg.robotics.featuremodels.Instance;
import it.unibg.robotics.featuremodels.featuremodelsPackage;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelDiagramEditor;
import it.unibg.robotics.resolutionmodel.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodel.RMRequiredComponent;
import it.unibg.robotics.resolutionmodel.RMRequiredConnection;
import it.unibg.robotics.resolutionmodel.RMResolutionElement;
import it.unibg.robotics.resolutionmodel.ResolutionModel;
import it.unibg.robotics.resolutionmodel.impl.resolutionmodelFactoryImpl;
import it.unibg.robotics.resolutionmodel.presentation.resolutionmodelEditor;
import it.unibg.robotics.resolutionmodel.rtt.RTTConnection;
import it.unibg.robotics.resolutionmodel.rtt.RTTTransfConnection;
import it.unibg.robotics.resolutionmodel.rtt.RTTTransfImplementation;
import it.unibg.robotics.resolutionmodel.rtt.RTTTransfProperty;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.orocos.model.rtt.Activity;
import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.IActivity;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.Operation;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.Property;
import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.TaskContext;
import org.orocos.model.rtt.diagram.edit.parts.PackageEditPart;
import org.orocos.model.rtt.diagram.part.RttDiagramEditor;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorPlugin;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorUtil;
import org.orocos.model.rtt.impl.RttFactoryImpl;



/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RTTResolutionHandler extends AbstractHandler {

	private Hashtable<String, InputPort> inputPortHashTable;
	private Hashtable<String, OutputPort> outputPortHashTable;
	private Hashtable<String, TaskContext> taskContextHashTable;
	private Hashtable<String, Property> propertyHashTable;
	private Hashtable<String, ConnectionPolicy> connectionHashTable;

	//	private Hashtable<InputPort, TaskContext> sourceInputPortTaskContextHashTable;
	//	private Hashtable<OutputPort, TaskContext> sourceOutputPortTaskContextHashTable;
	//	
	//	private Hashtable<InputPort, TaskContext> targetInputPortTaskContextHashTable;
	//	private Hashtable<OutputPort, TaskContext> targetOutputPortTaskContextHashTable;

	private Package targetOrocosModel = null;
	private Package sourceRttModel = null;
	private FeatureModel sourceFeatureModel = null;
	private ResolutionModel resolutionModel = null;

	/**
	 * The constructor.
	 */
	public RTTResolutionHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		resolutionmodelEditor resolutionModelEditor = null;

		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);


		if(activeEditor instanceof resolutionmodelEditor){

			resolutionModelEditor = (resolutionmodelEditor)activeEditor;
			StructuredSelection structSelect = (StructuredSelection)resolutionModelEditor.getSite().getSelectionProvider().getSelection();

			if(structSelect.getFirstElement() instanceof ResolutionModel){

				resolutionModel = (ResolutionModel)structSelect.getFirstElement();

				sourceFeatureModel = getSourceFeatureModel();

				sourceRttModel =  getSourceRttModel();
				cloneRttPackage(sourceRttModel);
				
				// Creating a copy is not enough
				// We have to fill the hashtables
				//targetOrocosModel = EcoreUtil.copy(sourceRttModel);


				Instance instance = sourceFeatureModel.getInstances().get(0);

				if(instance == null){
					MessageDialog.openWarning(null, "Warning", 
							"You have to select an instance!!!");
					return null;
				}

				doTransformation(instance);

				// Create a resource set to hold the resources.
				ResourceSet resourceSet = new ResourceSetImpl();

				// Register the appropriate resource factory to handle all file extensions.
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				(Resource.Factory.Registry.DEFAULT_EXTENSION, 
						new XMIResourceFactoryImpl());

				// Register the package to ensure it is available during loading.
				resourceSet.getPackageRegistry().put(featuremodelsPackage.eNS_URI, featuremodelsPackage.eINSTANCE);

				// If there are no arguments, emit an appropriate usage message.
				try {

					IEditorInput editorPart = activeEditor.getEditorInput();
					IFileEditorInput fileEditorInput = null;

					String modelfilePath = "";
					String diagramfilePath = "";
					if(editorPart instanceof IFileEditorInput){
						fileEditorInput = (IFileEditorInput)editorPart;
					}
					IProject currentProject = fileEditorInput.getFile().getProject();

					String tmp = fileEditorInput.getFile().getLocation().toOSString();
					tmp = tmp.substring(0,modelfilePath.lastIndexOf('/')+1) + targetOrocosModel.getName();
					modelfilePath = tmp + "-configured.rtt";
					diagramfilePath = tmp + "-configured.rtt_diagram";
					IPath modelLocation = new Path(modelfilePath);
					IFile modelfile = currentProject.getFile(modelLocation.lastSegment());
					if(modelfile.exists()){
						FileDialog fileDialog = new FileDialog(new Shell(), SWT.SAVE);
						fileDialog.setFilterNames(new String[]{"RTT","All files"});
						fileDialog.setFilterExtensions(new String[]{"*.rtt","*.*"});
						modelfilePath = fileDialog.open();
						if(modelfilePath == null){
							return null;
						}
						diagramfilePath = modelfilePath + "_diagram";
						modelLocation = new Path(modelfilePath);
						modelfile = currentProject.getFile(modelLocation.lastSegment());
					}
					URI modelURI = URI.createFileURI(modelLocation.toOSString());
					Resource modelResource = resourceSet.createResource(modelURI);

					IPath diagramLocation = new Path(diagramfilePath);
					IFile diagramFile = currentProject.getFile(diagramLocation.lastSegment());
					URI diagramURI = URI.createFileURI(diagramLocation.toString());
					Resource diagramResource = resourceSet.createResource(diagramURI);

					// create the new model and save it
					modelResource.getContents().add(targetOrocosModel);

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					modelResource.save(baos, null);

					ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
					modelfile.create(bais, false, null);
					baos.close();
					bais.close();

					// create the new diagram and save it
					Diagram diagram = ViewService.createDiagram(targetOrocosModel,
							PackageEditPart.MODEL_ID,
							RttDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					if (diagram != null) {
						diagramResource.getContents().add(diagram);
						diagram.setName(modelLocation.lastSegment());
						diagram.setElement(targetOrocosModel);
					}

					//						diagramResource.save(RttDiagramEditorUtil.getSaveOptions());
					baos = new ByteArrayOutputStream();
					diagramResource.save(baos, null);
					bais = new ByteArrayInputStream(baos.toByteArray());
					diagramFile.create(bais, false, null);
					baos.close();
					bais.close();

					//				RttDiagramEditorUtil.openDiagram(diagramResource);

					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					page.openEditor(new FileEditorInput(diagramFile), RttDiagramEditor.ID);


				}
				catch (IOException exception) {
					exception.printStackTrace();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		//		MessageDialog.openInformation(
		//				window.getShell(),
		//				"New Model",
		//				"File Saved");
		return null;
	}


	private void doTransformation(Instance featureModelInstance){

		//ResolutionModel resolutionModel = resolutionmodelFactoryImpl.eINSTANCE.createResolutionModel();

		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			for(RMAbstractTransformation currentTransf : currentResElem.getTransformations()){

				if(currentTransf instanceof RTTTransfImplementation){
					RTTTransfImplementation transf = (RTTTransfImplementation)currentTransf;
					TaskContext targetTaskContext = taskContextHashTable.get(getTaskContextHashTableKey(transf.getTargetTaskContext()));
					targetTaskContext.setNamespace(transf.getClassNamespace());
					targetTaskContext.setType(transf.getClassName());

				}else if(currentTransf instanceof RTTTransfConnection){
					RTTTransfConnection transf = (RTTTransfConnection)currentTransf;

					// It's not anymore necessary remove connections, because they are removed later when
					// required elements are iterated

					//ConnectionPolicy connection = connectionHashTable.get(getConnectionPolicyHashTableKey(transf.getOldConnection()));
					//connection.setInputPort(null);
					//connection.setOutputPort(null);
					//targetOrocosModel.getConnectionPolicy().remove(connection);

					for(RTTConnection newRttConnection : transf.getNewConnections()){

						ConnectionPolicy newConnection = RttFactoryImpl.eINSTANCE.createConnectionPolicy();
						newConnection.setName(newRttConnection.getName());
						newConnection.setLockPolicy(newRttConnection.getLockPolicy());
						newConnection.setType(newRttConnection.getType());
						newConnection.setBufferSize(newRttConnection.getBufferSize());

						InputPort targetInputPort = inputPortHashTable.get(getPortHashTableKey(
								(TaskContext)newRttConnection.getInputPort().eContainer(), 
								newRttConnection.getInputPort().getName()));
						targetInputPort.setInputConnectionPolicy(newConnection);

						OutputPort targetOutputPort = outputPortHashTable.get(getPortHashTableKey(
								(TaskContext)newRttConnection.getOutputPort().eContainer(), 
								newRttConnection.getOutputPort().getName()));
						targetOutputPort.setOutputConnectionPolicy(newConnection);

						newConnection.setInputPort(targetInputPort);
						newConnection.setOutputPort(targetOutputPort);

						targetOrocosModel.getConnectionPolicy().add(newConnection);
					}

				}else if(currentTransf instanceof RTTTransfProperty){
					RTTTransfProperty transf = (RTTTransfProperty)currentTransf;

					Property targetProperty = propertyHashTable.get(getPropertyHashTableKey(transf.getTargetProperty()));
					targetProperty.setValue(transf.getValue());

				}

			}
		}

		// Here we should check and remove components that are not anymore used


		//		for(TaskContext taskContext : targetOrocosModel.getTaskContext()){
		//			if(! isConnected(taskContext)){
		//				targetOrocosModel.getTaskContext().remove(taskContext);
		//			}
		//		}

	}


	private void cloneRttPackage(Package source){

		targetOrocosModel = RttFactoryImpl.eINSTANCE.createPackage();

		targetOrocosModel.setName(source.getName());

		taskContextHashTable = new Hashtable<String, TaskContext>();
		inputPortHashTable = new Hashtable<String, InputPort>();
		//		targetInputPortTaskContextHashTable = new Hashtable<InputPort, TaskContext>();
		//		sourceInputPortTaskContextHashTable = new Hashtable<InputPort, TaskContext>();
		outputPortHashTable  = new Hashtable<String, OutputPort>();
		//		targetOutputPortTaskContextHashTable = new Hashtable<OutputPort, TaskContext>();
		//		sourceOutputPortTaskContextHashTable = new Hashtable<OutputPort, TaskContext>();
		propertyHashTable = new Hashtable<String, Property>();
		for (TaskContext sourceTaskContext : source.getTaskContext()) {
			targetOrocosModel.getTaskContext().add(cloneRttTaskContext(sourceTaskContext));
		}

		connectionHashTable = new Hashtable<String, ConnectionPolicy>();
		for (ConnectionPolicy sourceConnPolicy : source.getConnectionPolicy()) {
			targetOrocosModel.getConnectionPolicy().add(cloneRttConnectionPolicy(sourceConnPolicy));
		}

		for (IActivity sourceActivity: source.getActivity()){
			targetOrocosModel.getActivity().add(cloneRttIActivity(sourceActivity,null, source));
		}

	}

	private TaskContext cloneRttTaskContext(TaskContext source){

		TaskContext target = RttFactoryImpl.eINSTANCE.createTaskContext();

		target.setName(source.getName());
		target.setNamespace(source.getNamespace());
		target.setType(source.getType());

		for(InputPort sourceInputPort : source.getInputPort()){
			target.getInputPort().add(cloneRttInputPort(sourceInputPort, source, target));
		}

		for(OutputPort sourceOutputPort : source.getOutputPort()){
			target.getOutputPort().add(cloneRttOutputPort(sourceOutputPort, source, target));

		}

		for(Property sourceProperty : source.getProperty()){
			target.getProperty().add(cloneRttProperty(sourceProperty));
		}

		for(Operation sourceOperation : source.getOperacion()){
			target.getOperacion().add(cloneRttOperation(sourceOperation));
		}

		taskContextHashTable.put(getTaskContextHashTableKey(source), target);

		return target;

	}

	private InputPort cloneRttInputPort(InputPort source, TaskContext sourceOwner, TaskContext targetOwner){

		InputPort target = RttFactoryImpl.eINSTANCE.createInputPort();

		target.setName(source.getName());
		target.setIsEventPort(source.getIsEventPort());
		target.setType(source.getType());

		inputPortHashTable.put(getPortHashTableKey(sourceOwner, source.getName()), target);
		//		targetInputPortTaskContextHashTable.put(target, targetOwner);
		//		sourceInputPortTaskContextHashTable.put(source, sourceOwner);

		return target;

	}

	private OutputPort cloneRttOutputPort(OutputPort source, TaskContext sourceOwner, TaskContext targetOwner){

		OutputPort target = RttFactoryImpl.eINSTANCE.createOutputPort();

		target.setName(source.getName());
		target.setType(source.getType());

		outputPortHashTable.put(getPortHashTableKey(sourceOwner, source.getName()), target);
		//		targetOutputPortTaskContextHashTable.put(target, targetOwner);
		//		sourceOutputPortTaskContextHashTable.put(source, sourceOwner);

		return target;

	}

	private Property cloneRttProperty(Property source){

		Property target = RttFactoryImpl.eINSTANCE.createProperty();

		target.setName(source.getName());
		target.setDescription(source.getDescription());
		target.setType(source.getType());
		target.setValue(source.getValue());

		propertyHashTable.put(getPropertyHashTableKey(source), target);

		return target;

	}

	private Operation cloneRttOperation(Operation source){

		Operation target = RttFactoryImpl.eINSTANCE.createOperation();

		target.setName(source.getName());
		target.setDocumentation(source.getDocumentation());
		target.setReturnType(source.getReturnType());

		return target;

	}

	private ConnectionPolicy cloneRttConnectionPolicy(ConnectionPolicy source){

		ConnectionPolicy target = RttFactoryImpl.eINSTANCE.createConnectionPolicy();

		target.setName(source.getName());
		target.setLockPolicy(source.getLockPolicy());
		target.setType(source.getType());
		target.setBufferSize(source.getBufferSize());

		InputPort sourceInputPort = source.getInputPort();
		//		TaskContext sourceInputPortOwner1 = sourceInputPortTaskContextHashTable.get(sourceInputPort);
		TaskContext sourceInputPortOwner = (TaskContext)sourceInputPort.eContainer();
		InputPort targetInputPort = inputPortHashTable.get(getPortHashTableKey(sourceInputPortOwner, sourceInputPort.getName()));
		targetInputPort.setInputConnectionPolicy(target);
		target.setInputPort(targetInputPort);

		OutputPort sourceOutputPort = source.getOutputPort();
		//		TaskContext sourceOutputPortOwner1 = targetOutputPortTaskContextHashTable.get(sourceOutputPort);
		TaskContext sourceOutputPortOwner = (TaskContext)sourceOutputPort.eContainer();
		OutputPort targetOutputPort = outputPortHashTable.get(getPortHashTableKey(sourceOutputPortOwner, sourceOutputPort.getName()));
		targetOutputPort.setOutputConnectionPolicy(target);
		target.setOutputPort(targetOutputPort);

		connectionHashTable.put(getConnectionPolicyHashTableKey(source), target);

		return target;

	}

	private IActivity cloneRttIActivity(IActivity source, Activity parent, Package rttPackage){

		IActivity target; 

		TaskContext sourceOwner = source.getTaskContext();


		// the first call of this method always enter the else branch
		// for the slave activities contained in the activity this method
		// will enter the if branch

		if(source instanceof Activity){
			target = RttFactoryImpl.eINSTANCE.createActivity();
			Activity sourceActivity = (Activity)source;
			((Activity)target).setPeriod(sourceActivity.getPeriod());
			((Activity)target).setCpuAffinity(sourceActivity.getCpuAffinity());
			((Activity)target).setScheduler(sourceActivity.getScheduler());
			((Activity)target).setPriority(sourceActivity.getPriority());

			for(Slave sourceSlave : sourceActivity.getSlave()){
				Slave targetSlave = (Slave)cloneRttIActivity(sourceSlave, (Activity)target, rttPackage);
				((Activity)target).getSlave().add(targetSlave);
				rttPackage.getActivity().add(targetSlave);
			}

		}else{
			target = RttFactoryImpl.eINSTANCE.createSlave();
		}

		target.setName(source.getName());
		target.setTaskContext(taskContextHashTable.get(getTaskContextHashTableKey(sourceOwner)));


		return target;

	}

	private String getPortHashTableKey(TaskContext owner, String portName){
		return getTaskContextHashTableKey(owner) + ":" + portName;
	}

	private String getTaskContextHashTableKey(TaskContext taskContext){
		return taskContext.getNamespace() + ":" + taskContext.getType() + ":" + taskContext.getName();
	}

	private String getPropertyHashTableKey(Property property){
		return getTaskContextHashTableKey((TaskContext)property.eContainer()) + ":" + property.getName();
	}

	private String getConnectionPolicyHashTableKey(ConnectionPolicy connection){
		return connection.getName() + ":" + connection.getInputPort().getName() + 
				":" + connection.getOutputPort().getName();
	}

	private String printModel(Package model){

		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		result += "<rtt:Package xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" " +
				"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:rtt=\"http://rtt/1.0\" name=\"" +
				model.getName() + "\">\n";

		for(TaskContext tc : model.getTaskContext()){
			result += printTaskContext(tc);
		}

		for(ConnectionPolicy cp : model.getConnectionPolicy()){
			result += printConnectionPolicy(cp);
		}

		for(IActivity a : model.getActivity()){
			result += printIActivity(a);
		}

		result += "</rtt:Package>\n";

		return result;

	}

	private String printTaskContext(TaskContext tc){

		String result = "\t" + "<taskContext name=\"" + tc.getName() + "\" namespace=\"" +
				tc.getNamespace() + "\" type=\"" + tc.getType() + "\">\n";


		for(InputPort ip : tc.getInputPort()){
			result += printInputPort(ip);
		}

		for(OutputPort op : tc.getOutputPort()){
			result += printOutputPort(op);
		}

		for(Property p : tc.getProperty()){
			result += printProperty(p);
		}

		for(Operation o : tc.getOperacion()){
			result += printOperation(o);
		}

		return result;
	}

	private String printInputPort(InputPort ip){

		return "\t\t" + "<inputPort isEventPort=\"" + ip.getIsEventPort() + "\" name=\"" + ip.getName() +
				"\" type=\"" + ip.getType().toString() + "\" inputConnectionPolicy=\"" + 
				ip.getInputConnectionPolicy().getName() + "\"/>\n"; //@connectionPolicy.0"/>;

	}

	private String printOutputPort(OutputPort op){

		return "\t\t" + "<oututPort name=\"" + op.getName() +	"\" type=\"" + op.getType().toString() + 
				"\" inputConnectionPolicy=\"" +op.getOutputConnectionPolicy().getName() + "\"/>\n"; //@connectionPolicy.0"/>;

	}

	private String printProperty(Property p){
		return "\t\t" + "<property name=\"" + p.getName() + "\" description=\"" + p.getDescription() + "\" type=\"" +
				p.getType().toString() + "\" value=\"" + p.getValue() + "\"/>\n";
	}

	private String printOperation(Operation o){
		return "";
	}

	private String printConnectionPolicy(ConnectionPolicy cp){
		return "\t" + "<connectionPolicy inputPort=\"" + cp.getInputPort().getName() + //@taskContext.2/@inputPort.0
				"\" outputPort=\"" + cp.getOutputPort().getName() + //@taskContext.0/@outputPort.0
				"\" bufferSize=\"" + cp.getBufferSize() + "\" name=\"" + cp.getName() + 
				"\" lockPolicy=\"" + cp.getLockPolicy().toString() + "\" type=\"" + cp.getType().toString() + "\"/>\n";
	}

	private String printIActivity(IActivity ia){
		if(ia instanceof Activity){
			Activity a = (Activity)ia;
			return "\t" + "<activity xsi:type=\"rtt:Activity\" name=\"" + a.getName() + "\" taskContext=\"" +
			a.getTaskContext().getName() + //@taskContext.0
			"\" scheduler=\"" + a.getScheduler().toString() + "\" cpuAffinity=\"" + a.getCpuAffinity() + 
			"\" period=\"" + a.getPeriod() + "\" priority=\"" + a.getPriority() + "\"/>\n";
		}else 
			return "";
	}

	private boolean isConnected(TaskContext taskContext){

		for (Iterator<InputPort> iterator = taskContext.getInputPort().iterator(); iterator.hasNext();) {
			InputPort port = (InputPort) iterator.next();
			if(port.getInputConnectionPolicy() != null){
				return true;
			}
		}

		for (Iterator<OutputPort> iterator = taskContext.getOutputPort().iterator(); iterator.hasNext();) {
			OutputPort port = (OutputPort) iterator.next();
			if(port.getOutputConnectionPolicy() != null){
				return true;
			}
		}

		return false;

	}

	private FeatureModel getSourceFeatureModel(){

		Feature currentFeature;

		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			currentFeature = currentResElem.getFeature();

			if(currentFeature != null){

				return currentFeature.getFeatureModel();

			}

		}

		return null;


	}

	private Package getSourceRttModel(){

		Package rttPackage = null;

		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			for(RMAbstractTransformation currentTransf : currentResElem.getTransformations()){

				if(currentTransf instanceof RTTTransfImplementation){

					RTTTransfImplementation transfImpl = (RTTTransfImplementation) currentTransf;
					return (Package)transfImpl.getTargetTaskContext().eContainer();

				}else if(currentTransf instanceof RTTTransfProperty){

					RTTTransfProperty transfProperty = (RTTTransfProperty) currentTransf;
					TaskContext taskContext = (TaskContext)transfProperty.getTargetProperty().eContainer();
					return (Package)taskContext.eContainer();

				}

			}

			for(RMRequiredComponent currentReqComp : currentResElem.getRequiredComponents()){

				//TODO

			}

			for(RMRequiredConnection currentReqConn : currentResElem.getRequiredConnections()){

				//TODO

			}



		}

		return rttPackage;

	}

}
