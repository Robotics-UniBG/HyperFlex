/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.ros.commands.resolution.handlers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.featuremodels.featuremodelsPackage;
import org.hyperflex.featuremodels.constraints.utility.ConstraintChecker;
import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.RMTransformation;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.presentation.resolutionmodelsEditor;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsFactoryImpl;
import org.hyperflex.roscomponentmodel.AbstractComponent;
import org.hyperflex.roscomponentmodel.Composite;
import org.hyperflex.roscomponentmodel.CompositeMsgConsumer;
import org.hyperflex.roscomponentmodel.CompositeMsgInterface;
import org.hyperflex.roscomponentmodel.CompositeMsgProducer;
import org.hyperflex.roscomponentmodel.CompositeProperty;
import org.hyperflex.roscomponentmodel.CompositeSrvConsumer;
import org.hyperflex.roscomponentmodel.CompositeSrvProducer;
import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.NodeMsgConsumer;
import org.hyperflex.roscomponentmodel.NodeMsgProducer;
import org.hyperflex.roscomponentmodel.NodeProperty;
import org.hyperflex.roscomponentmodel.NodeSrvConsumer;
import org.hyperflex.roscomponentmodel.NodeSrvProducer;
import org.hyperflex.roscomponentmodel.Property;
import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;
import org.hyperflex.roscomponentmodel.System;
import org.hyperflex.roscomponentmodel.Topic;
import org.hyperflex.roscomponentmodel.Wire;
import org.hyperflex.roscomponentmodel.roscomponentmodelFactory;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditor;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;



/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ROSResolutionHandler extends AbstractHandler {

	private Hashtable<AbstractComponent, AbstractComponent> abstractComponentHashTable;
	private Hashtable<MsgInterface, MsgInterface> msgInterfaceHashTable;
	private Hashtable<Topic, Topic> topicHashTable;
	private Hashtable<SrvProducer, SrvProducer> srvProducerHashTable;
	private Hashtable<SrvConsumer, SrvConsumer> srvConsumerHashTable;
	private Hashtable<Wire, Wire> wireHashTable;
	private Hashtable<Property, Property> propertyHashTable;
	//	private Hashtable<Publisher, Publisher> publisherHashTable;
	//	private Hashtable<Subscriber, Subscriber> subscriberHashTable;
	//	private Hashtable<ServiceServer, ServiceServer> serviceServerHashTable;
	//	private Hashtable<ServiceClient, ServiceClient> serviceClientHashTable;

	//	private Hashtable<ActionServer, ActionServer> actionServerHashTable;
	//	private Hashtable<ActionClient, ActionClient> actionClientHashTable;
	//	private Hashtable<Action, Action> actionHashTable;
	//	private Hashtable<Node, Node> nodeHashTable;
	//private Hashtable<ROSTopicConnection, ROSTopicConnection> topicConnectionHashTable;
	//private Hashtable<ROSServiceConnection, ROSServiceConnection> serviceConnectionHashTable;
	//private Hashtable<ROSActionConnection, ROSActionConnection> actionConnectionHashTable;
	//	private Hashtable<SMACHStateMachine, SMACHStateMachine> stateMachineHashTable;

	private System targetRosArchModel = null;
	private System sourceRosArchModel = null;
	private FeatureModel sourceFeatureModel = null;
	private ResolutionModel resolutionModel = null;

	/*
	 * We don't use treeSet because there is a problem due to the fact that TaskContext
	 * doesn't implement comparable
	 */
	private ArrayList<Node> requiredComponents;
	private ArrayList<ROSTopicConnection> requiredTopicConnections;
	private ArrayList<Wire> requiredServiceConnections;
	//	private ArrayList<ROSExistingActionConnection> requiredExistingActionConnections;


	/**
	 * The constructor.
	 */
	public ROSResolutionHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		resolutionmodelsEditor resolutionModelEditor = null;

		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);


		if(activeEditor instanceof resolutionmodelsEditor){

			resolutionModelEditor = (resolutionmodelsEditor)activeEditor;
			StructuredSelection structSelect = (StructuredSelection)resolutionModelEditor.getSite().getSelectionProvider().getSelection();

			if(structSelect.getFirstElement() instanceof ResolutionModel){

				// Find and set the resolution model

				resolutionModel = (ResolutionModel)structSelect.getFirstElement();

				// Find and set the feature model

				if(resolutionModel.getFeatureModel() != null){

					sourceFeatureModel = resolutionModel.getFeatureModel();

				}else{
					MessageDialog.openError(null, "Error", 
							"It wasn't possible to find the Feature Model !!!");
					return null;
				}

				// Find and set the template system model

				if(resolutionModel.getTemplateSystemModel() instanceof ROSTemplateSystemModel){

					sourceRosArchModel = ((ROSTemplateSystemModel)resolutionModel.getTemplateSystemModel()).getSystem();

				}else{
					MessageDialog.openError(null, "Error", 
							"It wasn't possible to find the Template System Model !!!");
					return null;
				}

				Instance instance;

				if(sourceFeatureModel.getInstances().size() < 1){
					MessageDialog.openWarning(null, "Warning", 
							"You have to create at least an instance!!!");
					return null;
				}

				ElementListSelectionDialog instanceDialog = 
						new ElementListSelectionDialog(
								PlatformUI.getWorkbench().getDisplay().getActiveShell(), new LabelProvider());
				instanceDialog.setTitle("Instance Selection");
				instanceDialog.setMessage("Select the desired instance");
				instanceDialog.setElements(sourceFeatureModel.getInstances().toArray());
				if(instanceDialog.open() != Window.OK){
					return null;
				}
				instance = (Instance)instanceDialog.getResult()[0];
				sourceFeatureModel.setSelectedInstance(instance);

				ConstraintChecker cc = new ConstraintChecker(sourceFeatureModel);
				if(cc.checkConstraints()){
					MessageDialog.openInformation(null, "Selection validation", 
							"All the constraints are satisfied, the model will be generated");
				}else{
					return null;
				}

				cloneRosArchitecture(sourceRosArchModel);

				/* 
				 * Creating a copy is not enough
				 * We have to fill the hashtables
				 */ 
				//				targetOrocosModel = EcoreUtil.copy(sourceRttModel);

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
					tmp = tmp.substring(0,modelfilePath.lastIndexOf('/')+1) + instance.getId();
					modelfilePath = tmp + "-configured.roscomponentmodel";
					diagramfilePath = tmp + "-configured.roscomponentmodel_diagram";
					IPath modelLocation = new Path(modelfilePath);
					IFile modelfile = currentProject.getFile(modelLocation.lastSegment());
					if(modelfile.exists()){
						FileDialog fileDialog = new FileDialog(new Shell(), SWT.SAVE);
						fileDialog.setFilterNames(new String[]{"ROS","All files"});
						fileDialog.setFilterExtensions(new String[]{"*.roscomponentmodel","*.*"});
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
					modelResource.getContents().add(targetRosArchModel);

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					modelResource.save(baos, null);

					ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
					modelfile.create(bais, false, null);
					baos.close();
					bais.close();

					// create the new diagram and save it
					Diagram diagram = ViewService.createDiagram(targetRosArchModel,
							ArchitectureModelEditPart.MODEL_ID,
							RosComponentModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					if (diagram != null) {
						diagramResource.getContents().add(diagram);
						diagram.setName(modelLocation.lastSegment());
						diagram.setElement(targetRosArchModel);
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
					page.openEditor(new FileEditorInput(diagramFile), RosComponentModelDiagramEditor.ID);


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

		requiredComponents = new ArrayList<Node>();
		requiredTopicConnections = new ArrayList<ROSTopicConnection>();
		requiredServiceConnections = new ArrayList<Wire>();

		//		requiredComponents = new ArrayList<Node>();
		//		requiredTopicConnections = new ArrayList<ROSExistingTopicConnection>();
		//		requiredServiceConnections = new ArrayList<ROSExistingServiceConnection>();
		//		requiredExistingActionConnections = new ArrayList<ROSExistingActionConnection>();

		//topicConnectionHashTable = new Hashtable<ROSTopicConnection, ROSTopicConnection>();
		//serviceConnectionHashTable = new Hashtable<ROSServiceConnection, ROSServiceConnection>();
		//actionConnectionHashTable = new Hashtable<ROSActionConnection, ROSActionConnection>();

		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			boolean isActive = featureModelInstance.getSelectedFeatures().contains(currentResElem.getFeature()) ==
					currentResElem.isActiveIfSelected();

			if( ! isActive ){

				// The feature associated to the resolution element is not selected
				// or the resolution element has to be applied when the feature is not selected
				continue;

			}

			if(currentResElem.getRequiredElements() != null){ 

				if(currentResElem.getRequiredElements() instanceof ROSRequiredElements){

					ROSRequiredElements reqElements = (ROSRequiredElements)currentResElem.getRequiredElements();

					for(Node node : reqElements.getRequiredNodes()){
						if(requiredComponents.contains((Node)abstractComponentHashTable.get(node)) == false){
							requiredComponents.add((Node)abstractComponentHashTable.get(node));
						}

					}

					for(ROSTopicConnection topicConn : reqElements.getRequiredTopicConnections()){

						if(topicConn instanceof ROSExistingTopicConnection == false){
							continue;
						}

						ROSExistingTopicConnection existingConn = (ROSExistingTopicConnection)topicConn;

						if(requiredTopicConnections.contains(existingConn) == false){
							ROSExistingTopicConnection newTopicConnection = rosresolutionmodelsFactoryImpl.eINSTANCE.
									createROSExistingTopicConnection();

							newTopicConnection.setName(existingConn.getName());
							newTopicConnection.setTopic(topicHashTable.get(existingConn.getTopic()));
							newTopicConnection.setMessageInterface(msgInterfaceHashTable.get(existingConn.getMessageInterface()));

							if(requiredTopicConnections.contains(newTopicConnection)==false){
								requiredTopicConnections.add(newTopicConnection);
							}
						}
					}

					for(Wire wire : reqElements.getRequiredServiceConnections()){
						if(requiredServiceConnections.contains(wireHashTable.get(wire))==false){
							requiredServiceConnections.add(wireHashTable.get(wire));
						}
					}

				}else{

					MessageDialog.openError(null, "Error", 
							"The ROS resolution model contains a RMRequiredElements that is instance of " +
									currentResElem.getName() +
							" !!!");
					return;

				}


			}

			for(RMTransformation currentTransf : currentResElem.getTransformations()){

				if(currentTransf instanceof ROSTransfImplementation){

					ROSTransfImplementation transf = (ROSTransfImplementation)currentTransf;

					Node targetNode = (Node)abstractComponentHashTable.get(transf.getTargetNode());

					targetNode.setPackageName(transf.getClassNamespace());
					targetNode.setType(transf.getClassName());


					// add the target nod to the required components list
					// it should be already there,
					// This is done for the case in which the user forget to add it
					if(requiredComponents.contains(targetNode) == false){
						requiredComponents.add(targetNode);
					}


				}else if(currentTransf instanceof ROSTransfConnection){

					ROSTransfConnection transf = (ROSTransfConnection)currentTransf;

					for(ROSConnection newRosConnection : transf.getNewConnections()){

						if(newRosConnection instanceof ROSTopicConnection){

							ROSTopicConnection conn = (ROSTopicConnection)newRosConnection;

							MsgInterface msgInterface = msgInterfaceHashTable.get(conn.getMessageInterface());
							Topic topic = null;
							ROSExistingTopicConnection newRequiredConn = rosresolutionmodelsFactory.eINSTANCE.createROSExistingTopicConnection();

							if(newRosConnection instanceof ROSExistingTopicConnection){
								topic = topicHashTable.get(((ROSExistingTopicConnection)conn).getTopic());
								newRequiredConn.setTopic(topic);
							}else if(newRosConnection instanceof ROSNewTopicConnection){


								ROSNewTopicConnection newConn = (ROSNewTopicConnection)conn;
								Composite composite = ((Composite)newConn.getMessageInterface().eContainer().eContainer());
								if(composite == null){
									MessageDialog.openError(null, "Error", 
											"The ROS resolution model contains a RMTransfConnection that is related to "
													+ "a msg interface the parent of which is not cotained in a composite "
													+ "(Resolution Element name:" +
													currentResElem.getName() +
											" ) !!!");
									return;
								}
								for(Topic existingTopic : ((Composite)abstractComponentHashTable.get(composite)).getTopics()){
									if(existingTopic.getName().equals(newConn.getTopicName())){
										topic = existingTopic;
										break;
									}
								}

								if(topic == null){
									topic = roscomponentmodelFactory.eINSTANCE.createTopic();
									topic.setName(newConn.getTopicName());
									((Composite)abstractComponentHashTable.get(composite)).getTopics().add(topic);

								}
								newRequiredConn.setTopic(topic);

							}else{
								continue;
							}

							msgInterface.setConnection(topic);
							newRequiredConn.setMessageInterface(msgInterface);

							// add the new connection to the required connections list
							if(requiredTopicConnections.contains(newRequiredConn)==false){
								requiredTopicConnections.add(newRequiredConn);
							}

							// we add also the connected component
							if(msgInterface.eContainer() instanceof Node){
								Node node = (Node)abstractComponentHashTable.get((Node)msgInterface.eContainer());
								if(requiredComponents.contains(node)==false){
									requiredComponents.add(node);
								}
							}

							//							Topic targetTopic;
							//							Publisher pub;
							//							Subscriber sub;
							//
							//							if(newRosConnection instanceof ROSExistingTopicConnection){
							//
							//								ROSExistingTopicConnection currentConn = (ROSExistingTopicConnection)newRosConnection;
							//								targetTopic = topicHashTable.get(currentConn.getTopic());
							//
							//								pub = publisherHashTable.get(currentConn.getPublisher());
							//								sub = subscriberHashTable.get(currentConn.getSubscriber());
							//
							//								// update the topic source and target
							//								targetTopic.setPublisher(pub);
							//								targetTopic.setSubscriber(sub);
							//
							//							}else{
							//
							//								ROSNewTopicConnection currentConn = (ROSNewTopicConnection)newRosConnection;
							//								targetTopic = getTopicFromName(currentConn.getTopicName());
							//
							//								pub = publisherHashTable.get(currentConn.getPublisher());
							//								sub = subscriberHashTable.get(currentConn.getSubscriber());
							//
							//								// create the new topic connection
							//								targetTopic.setPublisher(pub);
							//								targetTopic.setSubscriber(sub);
							//
							//								if(! targetRosArchModel.getTopic().contains(targetTopic)){
							//									targetRosArchModel.getTopic().add(targetTopic);
							//								}
							//
							//							}
							//
							//							// add the new connection to the required connections list
							//							ROSExistingTopicConnection newRequiredConn = rosresolutionmodelsFactoryImpl.eINSTANCE.createROSExistingTopicConnection();
							//							newRequiredConn.setTopic(targetTopic);
							//							newRequiredConn.setPublisher(pub);
							//							newRequiredConn.setSubscriber(sub);
							//
							//							if(! requiredTopicConnections.contains(newRequiredConn)){
							//								requiredTopicConnections.add(newRequiredConn);
							//							}
							//
							//							// we add also the connected components
							//							if(! requiredComponents.contains((Node)pub.eContainer())){
							//								requiredComponents.add((Node)pub.eContainer());
							//							}
							//							if(! requiredComponents.contains((Node)sub.eContainer())){
							//								requiredComponents.add((Node)sub.eContainer());
							//							}

						}else if(newRosConnection instanceof ROSServiceConnection){

							ROSServiceConnection conn = (ROSServiceConnection)newRosConnection;

							SrvProducer srvProducer = srvProducerHashTable.get(conn.getServiceProducer());
							SrvConsumer srvConsumer = srvConsumerHashTable.get(conn.getServiceConsumer());

							Wire wire = roscomponentmodelFactory.eINSTANCE.createWire();
							wire.setSource(srvProducer);
							wire.setTarget(srvConsumer);

							boolean autoConnection = srvProducer.eContainer() == srvConsumer.eContainer();
							boolean sameComposite = srvProducer.eContainer().eContainer() == srvConsumer.eContainer().eContainer();

							if(autoConnection == false && sameComposite == true){
								if(((Composite)srvProducer.eContainer().eContainer()).getWires().contains(wire)==false){
									((Composite)srvProducer.eContainer().eContainer()).getWires().add(wire);
								}

							}

							// add the new connection to the required connections list
							if(requiredServiceConnections.contains(wire)==false){
								requiredServiceConnections.add(wire);
							}

							// we add also the connected component
							// we add also the connected component
							if(srvProducer.eContainer() instanceof Node){
								Node node = (Node)abstractComponentHashTable.get((Node)srvProducer.eContainer());
								if(requiredComponents.contains(node) == false){
									requiredComponents.add(node);
								}
							}

							if(srvConsumer.eContainer() instanceof Node){
								Node node = (Node)abstractComponentHashTable.get((Node)srvConsumer.eContainer());
								if(requiredComponents.contains(node) == false){
									requiredComponents.add(node);
								}
							}

							//							Service targetService;
							//							ServiceServer ss;
							//							ServiceClient sc;
							//
							//							if(newRosConnection instanceof ROSExistingServiceConnection){
							//
							//								ROSExistingServiceConnection currentConn = (ROSExistingServiceConnection)newRosConnection;
							//								targetService = serviceHashTable.get(currentConn.getService());
							//
							//								ss = serviceServerHashTable.get(currentConn.getServiceServer());
							//								sc = serviceClientHashTable.get(currentConn.getServiceClient());
							//
							//								// update the service server and client
							//								if(! targetService.getServiceserver().contains(ss)){
							//									targetService.getServiceserver().add(ss);
							//								}
							//								if(! targetService.getServiceclient().contains(sc)){
							//									targetService.getServiceclient().add(sc);
							//								}
							//
							//							}else{
							//
							//								ROSNewServiceConnection currentConn = (ROSNewServiceConnection)newRosConnection;
							//								targetService = getServiceFromName(currentConn.getServiceName());
							//
							//								ss = serviceServerHashTable.get(currentConn.getServiceServer());
							//								sc = serviceClientHashTable.get(currentConn.getServiceClient());
							//
							//								// create the new service connection
							//								if(! targetService.getServiceserver().contains(ss)){
							//									targetService.getServiceserver().add(ss);
							//								}
							//								if(! targetService.getServiceclient().contains(sc)){
							//									targetService.getServiceclient().add(sc);
							//								}
							//
							//								if(! targetRosArchModel.getService().contains(targetService)){
							//									targetRosArchModel.getService().add(targetService);
							//								}
							//
							//							}
							//
							//							// add the new connection to the required connections list
							//							ROSExistingServiceConnection newRequiredConn = rosresolutionmodelsFactoryImpl.eINSTANCE.createROSExistingServiceConnection();
							//							newRequiredConn.setService(targetService);
							//							newRequiredConn.setServiceServer(ss);
							//							newRequiredConn.setServiceClient(sc);
							//							if(! requiredServiceConnections.contains(newRequiredConn)){
							//								requiredServiceConnections.add(newRequiredConn);
							//							}
							//
							//							// we add also the connected components
							//							if(! requiredComponents.contains((Node)ss.eContainer())){
							//								requiredComponents.add((Node)ss.eContainer());
							//							}
							//							if(! requiredComponents.contains((Node)sc.eContainer())){
							//								requiredComponents.add((Node)sc.eContainer());
							//							}

						}
					}

				}else if(currentTransf instanceof ROSTransfProperty){

					ROSTransfProperty transf = (ROSTransfProperty)currentTransf;
					Property targetProperty = propertyHashTable.get(transf.getTargetProperty());
					setTargetProperty(targetProperty, transf.getValue());

				}

			}
		}

		removeUnusedArchitecturalElements(targetRosArchModel.getComposite());



	}

	private void removeUnusedArchitecturalElements(Composite composite){

		/*
		 *  Here we check and remove connections and components that are not anymore used
		 *  We first create an array of the elements that have to be removed, than we remove them
		 *  If we directly remove during the iteration an exception is thrown
		 */

		// Remove unused topics
		ArrayList<Topic> usedTopics = new ArrayList<Topic>();
		//		for(Topic topic : composite.getTopics()){
		//
		//			for(ROSTopicConnection conn : requiredTopicConnections){
		//
		//				if(conn.getTopic().equals(topic)){
		//					
		//					usedTopics.add(topic);
		//					
		//				}
		//
		//			}
		//
		//		}

		for(ROSTopicConnection conn : requiredTopicConnections){

			Topic topic;
			if(conn instanceof ROSExistingTopicConnection){
				topic = ((ROSExistingTopicConnection)conn).getTopic();
				//}else if(conn instanceof ROSNewTopicConnection){
				//	topic = ((ROSNewTopicConnection)conn).getTopic();
			}else{
				continue;
			}

			if(usedTopics.contains(topic)==false){
				usedTopics.add(topic);
			}
		}

		ArrayList<CompositeMsgInterface> msgInterfaces = new ArrayList<CompositeMsgInterface>();

		msgInterfaces.addAll(composite.getMsgConsumers());
		msgInterfaces.addAll(composite.getMsgProducers());

		for(CompositeMsgInterface msgInterface : msgInterfaces){

			boolean preserveConnection = false;

			for(ROSTopicConnection conn : requiredTopicConnections){

				if(conn.getMessageInterface().equals(msgInterface)){
					preserveConnection = true;
					break;
				}

			}

			if(preserveConnection == false){
				msgInterface.setConnection(null);

			}

		}

		//composite.getTopics().retainAll(usedTopics);

		// Remove unused services

		ArrayList<Wire> unusedWires = new ArrayList<Wire>();

		for(Wire wire : composite.getWires()){

			if(requiredServiceConnections.contains(wire)){
				continue;
			}

			if(unusedWires.contains(wire)==false){
				unusedWires.add(wire);
			}
		}

		composite.getWires().removeAll(unusedWires);

		ArrayList<Node> usedNodes = new ArrayList<Node>();

		for(AbstractComponent component : composite.getComponents()){

			if(component instanceof Node){

				if(requiredComponents.contains(component) == false){
					continue;
				}

				if(usedNodes.contains((Node)component)==false){
					usedNodes.add((Node)component);
				}

			}else if(component instanceof Composite){

				removeUnusedArchitecturalElements((Composite)component);

			}

		}

		composite.getComponents().retainAll(usedNodes);

		//		ArrayList<Package> emptyPackages = new ArrayList<Package>();
		//
		//		for(Package pack : targetRosArchModel.getPackages()){
		//
		//			ArrayList<Node> unusedNode = new ArrayList<Node>();
		//
		//			for(Node node : pack.getNode()){
		//
		//				if(! requiredComponents.contains(node)){
		//					unusedNode.add(node);
		//				}
		//
		//			}
		//
		//			for(Node node : unusedNode){
		//				pack.getNode().remove(node);
		//			}
		//
		//			if(pack.getNode().size() == 0){
		//				emptyPackages.add(pack);
		//			}
		//
		//		}
		//
		//		// Remove empty packages from system model
		//		targetRosArchModel.getPackages().removeAll(emptyPackages);

	}

	private void setTargetProperty(Property targetProperty, String value){

		if(targetProperty instanceof NodeProperty){

			((NodeProperty)targetProperty).setValue(value);
			// add the target task context to the required components list
			// it should be already there,
			// This is done for the case in which the user forget to add it
			Node node = (Node)targetProperty.eContainer();
			if(requiredComponents.contains(node) == false){
				requiredComponents.add(node);
			}

		}else if(targetProperty instanceof CompositeProperty){

			setTargetProperty(((CompositeProperty)targetProperty).getExposed(), value);

		}

	}

	private void cloneRosArchitecture(System sourceArch){

		targetRosArchModel = roscomponentmodelFactory.eINSTANCE.createSystem();

		abstractComponentHashTable = new Hashtable<AbstractComponent, AbstractComponent>();
		msgInterfaceHashTable = new Hashtable<MsgInterface, MsgInterface>();
		topicHashTable = new Hashtable<Topic, Topic>();
		srvProducerHashTable = new Hashtable<SrvProducer, SrvProducer>();
		srvConsumerHashTable = new Hashtable<SrvConsumer, SrvConsumer>();
		wireHashTable = new Hashtable<Wire, Wire>();
		propertyHashTable = new Hashtable<Property, Property>();


		if(sourceArch != null){

			targetRosArchModel.setComposite(cloneComposite(sourceArch.getComposite()));

		}

	}

	private Composite cloneComposite(Composite source){


		Composite target = roscomponentmodelFactory.eINSTANCE.createComposite();

		target.setName(source.getName());

		for(Topic topic : source.getTopics()){

			target.getTopics().add(cloneTopic(topic));

		}

		for(AbstractComponent sourceAbstractComponent : source.getComponents()) {

			if(sourceAbstractComponent instanceof Composite){

				target.getComponents().add(cloneComposite((Composite)sourceAbstractComponent));

			}else if(sourceAbstractComponent instanceof Node){

				target.getComponents().add(cloneNode((Node)sourceAbstractComponent));

			}
		}

		for(Wire wire : source.getWires()){

			target.getWires().add(cloneWire(wire));

		}

		for(CompositeMsgProducer sourcePublisher : source.getMsgProducers()){
			target.getMsgProducers().add(cloneCompositeMsgProducer(sourcePublisher));
		}

		for(CompositeMsgConsumer sourceSubscriber : source.getMsgConsumers()){
			target.getMsgConsumers().add(cloneCompositeMsgConsumer(sourceSubscriber));
		}

		for(CompositeSrvProducer sourceServiceServer : source.getSrvProducers()){
			target.getSrvProducers().add(cloneCompositeSrvProducer(sourceServiceServer));
		}

		for(CompositeSrvConsumer sourceServiceClient : source.getSrvConsumers()){
			target.getSrvConsumers().add(cloneCompositeSrvConsumer(sourceServiceClient));
		}

		for(CompositeProperty sourceParameter : source.getProperties()){
			target.getProperties().add(cloneCompositeProperty(sourceParameter));
		}

		abstractComponentHashTable.put(source, target);

		return target;


	}

	private Node cloneNode(Node source){

		Node target = roscomponentmodelFactory.eINSTANCE.createNode();

		target.setName(source.getName());
		target.setPackageName(source.getPackageName());
		target.setType(source.getType());


		for(NodeMsgProducer sourcePublisher : source.getMsgProducers()){
			target.getMsgProducers().add(cloneNodeMsgProducer(sourcePublisher));
		}

		for(NodeMsgConsumer sourceSubscriber : source.getMsgConsumers()){
			target.getMsgConsumers().add(cloneNodeMsgConsumer(sourceSubscriber));
		}

		for(NodeSrvProducer sourceServiceServer : source.getSrvProducers()){
			target.getSrvProducers().add(cloneNodeSrvProducer(sourceServiceServer));
		}

		for(NodeSrvConsumer sourceServiceClient : source.getSrvConsumers()){
			target.getSrvConsumers().add(cloneNodeSrvConsumer(sourceServiceClient));
		}

		for(NodeProperty sourceParameter : source.getParameters()){
			target.getParameters().add(cloneNodeProperty(sourceParameter));
		}

		abstractComponentHashTable.put(source, target);

		return target;

	}

	private NodeMsgProducer cloneNodeMsgProducer(NodeMsgProducer source){

		NodeMsgProducer target = roscomponentmodelFactory.eINSTANCE.createNodeMsgProducer();

		// MsgInterface fields
		target.setName(source.getName());
		if(source.getConnection() != null){
			target.setConnection(topicHashTable.get(source.getConnection()));
		}
		// NodeMsgInterface fields
		target.setTopicName(source.getTopicName());

		// nodeMsgProducer fields

		// none

		msgInterfaceHashTable.put(source, target);

		return target;


	}

	private NodeMsgConsumer cloneNodeMsgConsumer(NodeMsgConsumer source){

		NodeMsgConsumer target = roscomponentmodelFactory.eINSTANCE.createNodeMsgConsumer();

		// MsgInterface fields
		target.setName(source.getName());
		if(source.getConnection() != null){
			target.setConnection(topicHashTable.get(source.getConnection()));
		}
		// NodeMsgInterface fields
		target.setTopicName(source.getTopicName());

		// nodeMsgConsumer fields

		// none

		msgInterfaceHashTable.put(source, target);

		return target;


	}

	private CompositeMsgProducer cloneCompositeMsgProducer(CompositeMsgProducer source){

		CompositeMsgProducer target = roscomponentmodelFactory.eINSTANCE.createCompositeMsgProducer();

		// MsgInterface fields
		target.setName(source.getName());
		if(source.getConnection() != null){
			target.setConnection(topicHashTable.get(source.getConnection()));
		}
		// CompositeMsgInterface fields
		if(source.getExposed() != null){
			target.setExposed(topicHashTable.get(source.getExposed()));
		}
		// compositeMsgProducer fields

		// none

		msgInterfaceHashTable.put(source, target);

		return target;


	}

	private CompositeMsgConsumer cloneCompositeMsgConsumer(CompositeMsgConsumer source){

		CompositeMsgConsumer target = roscomponentmodelFactory.eINSTANCE.createCompositeMsgConsumer();

		// MsgInterface fields
		target.setName(source.getName());
		if(source.getConnection() != null){
			target.setConnection(topicHashTable.get(source.getConnection()));
		}
		// CompositeMsgInterface fields
		if(source.getExposed() != null){
			target.setExposed(topicHashTable.get(source.getExposed()));
		}
		// compositeMsgConsumer fields

		// none

		msgInterfaceHashTable.put(source, target);

		return target;


	}

	private NodeSrvProducer cloneNodeSrvProducer(NodeSrvProducer source){

		NodeSrvProducer target = roscomponentmodelFactory.eINSTANCE.createNodeSrvProducer();

		// SrvProducer fields
		target.setName(source.getName());

		// NodeSrvProducer fields
		target.setSrvName(source.getSrvName());

		srvProducerHashTable.put(source, target);

		return target;

	}

	private NodeSrvConsumer cloneNodeSrvConsumer(NodeSrvConsumer source){

		NodeSrvConsumer target = roscomponentmodelFactory.eINSTANCE.createNodeSrvConsumer();

		// SrvProducer fields
		target.setName(source.getName());

		// NodeSrvConsumer fields
		target.setSrvName(source.getSrvName());

		srvConsumerHashTable.put(source, target);

		return target;

	}

	private CompositeSrvProducer cloneCompositeSrvProducer(CompositeSrvProducer source){

		CompositeSrvProducer target = roscomponentmodelFactory.eINSTANCE.createCompositeSrvProducer();

		// SrvProducer fields
		target.setName(source.getName());

		// CompositeSrvProducer fields
		target.setPromote(srvProducerHashTable.get(source.getPromote()));

		srvProducerHashTable.put(source, target);

		return target;

	}

	private CompositeSrvConsumer cloneCompositeSrvConsumer(CompositeSrvConsumer source){

		CompositeSrvConsumer target = roscomponentmodelFactory.eINSTANCE.createCompositeSrvConsumer();

		// SrvProducer fields
		target.setName(source.getName());

		// CompositeSrvConsumer fields
		target.setPromote(srvConsumerHashTable.get(source.getPromote()));

		srvConsumerHashTable.put(source, target);

		return target;

	}

	private NodeProperty cloneNodeProperty(NodeProperty source){

		NodeProperty target = roscomponentmodelFactory.eINSTANCE.createNodeProperty();

		// Property fields
		target.setName(source.getName());

		// NodeProperty fields

		target.setValue(source.getValue());
		target.setType(source.getType());

		propertyHashTable.put(source, target);

		return target;

	}

	private CompositeProperty cloneCompositeProperty(CompositeProperty source){

		CompositeProperty target = roscomponentmodelFactory.eINSTANCE.createCompositeProperty();

		// Property fields
		target.setName(source.getName());

		// CompositeProperty fields
		target.setExposed(propertyHashTable.get(source.getExposed()));

		propertyHashTable.put(source, target);

		return target;

	}

	private Topic cloneTopic(Topic source){

		Topic target = roscomponentmodelFactory.eINSTANCE.createTopic();

		target.setName(source.getName());

		topicHashTable.put(source, target);

		return target;

	}

	private Wire cloneWire(Wire source){

		Wire target = roscomponentmodelFactory.eINSTANCE.createWire();

		target.setSrvName(source.getSrvName());

		target.setSource(srvProducerHashTable.get(source.getSource()));
		target.setTarget(srvConsumerHashTable.get(source.getTarget()));

		wireHashTable.put(source, target);

		return target;

	}

	//	private boolean setSourceFeatureModel(){
	//
	//		Feature currentFeature;
	//
	//		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){
	//
	//			currentFeature = currentResElem.getFeature();
	//
	//			if(currentFeature != null){
	//
	//				sourceFeatureModel = currentFeature.getFeatureModel();
	//				return true;
	//
	//			}
	//
	//		}
	//
	//		return false;
	//
	//
	//	}

	//	private void setSourceRosModel(){
	//
	//		sourceRosPackModels = new ArrayList<Package>();
	//
	//		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){
	//
	//			for(RMAbstractTransformation currentTransf : currentResElem.getTransformations()){
	//
	//				Package pack = null;
	//				Architecture arch = null;
	//
	//				if(currentTransf instanceof ROSTransfImplementation){
	//
	//					ROSTransfImplementation transfImpl = (ROSTransfImplementation) currentTransf;
	//					pack = (Package)transfImpl.getTargetNode().eContainer();
	//					arch = (Architecture)pack.eContainer();
	//
	//
	//				}else if(currentTransf instanceof ROSTransfProperty){
	//
	//					ROSTransfProperty transfProperty = (ROSTransfProperty) currentTransf;
	//					Node node = (Node)transfProperty.getTargetProperty().eContainer();
	//					pack = (Package)node.eContainer();
	//					arch = (Architecture)pack.eContainer();
	//
	//
	//				}else if(currentTransf instanceof ROSTransfConnection){
	//
	//					ROSTransfConnection transfConn = (ROSTransfConnection) currentTransf;
	//					ROSAbstractConnection connection = transfConn.getNewConnections().get(0);
	//					arch = getArchitectureFromROSAbstractConnection(connection);
	//
	//				}
	//
	//				if(pack != null && arch == null){ // this should be the case of impl and prop transf
	//					if(! sourceRosPackModels.contains(pack)){
	//						sourceRosPackModels.add(pack);
	//						continue;
	//					}
	//				}else{ // this should be the case of connection transf
	//					//					MessageDialog.openError(null, "Error",currentTransf.getName() + " Transform!!! \n" + arch);
	//					setTargetArchitectureModelIfNotNullAndDuplicated(arch);
	//				}
	//
	//			}
	//
	//			if(currentResElem.getRequiredComponents() instanceof ROSRequiredComponents){
	//
	//				ROSRequiredComponents rosReqComponenents = (ROSRequiredComponents)currentResElem.getRequiredComponents();
	//				for(Node currentReqComp : rosReqComponenents.getROSNodes()){
	//
	//					Package pack = (Package)currentReqComp.eContainer();
	//					if(pack != null && pack.eContainer() == null){
	//						if(! sourceRosPackModels.contains(pack)){
	//							sourceRosPackModels.add(pack);
	//							continue;
	//						}
	//					}else{
	//
	//						Architecture arch = (Architecture)pack.eContainer();
	//						//						MessageDialog.openError(null, "Error", "Req Component!!! \n" + arch);
	//						setTargetArchitectureModelIfNotNullAndDuplicated(arch);
	//
	//					}
	//
	//				}
	//
	//			}
	//
	//			if(currentResElem.getRequiredConnections() instanceof ROSRequiredConnections){
	//
	//				ROSRequiredConnections rosReqConnections = (ROSRequiredConnections)currentResElem.getRequiredConnections();
	//
	//				setArchitectureFromROSRequiredConnections(rosReqConnections);
	//
	//			}
	//
	//
	//		}
	//
	//	}

	//	private Architecture getArchitectureFromROSAbstractConnection(ROSAbstractConnection connection){
	//
	//		Node node = null;
	//		Architecture arch = null;
	//
	//		if(connection instanceof ROSExistingTopicConnection){
	//
	//			arch = (Architecture)((ROSExistingTopicConnection)connection).getTopic().eContainer();
	//
	//		}else if(connection instanceof ROSNewTopicConnection){
	//
	//			node = (Node)((ROSNewTopicConnection)connection).getPublisher().eContainer();
	//			arch = (Architecture)node.eContainer().eContainer();
	//
	//		}else if(connection instanceof ROSExistingServiceConnection){
	//
	//			arch = (Architecture)((ROSExistingServiceConnection)connection).getService().eContainer();
	//
	//		}else if(connection instanceof ROSNewServiceConnection){
	//
	//			node = (Node)((ROSNewServiceConnection)connection).getServiceServer().eContainer();
	//			arch = (Architecture)node.eContainer().eContainer();
	//
	//		}else if(connection instanceof ROSExistingActionConnection){
	//
	//			arch = (Architecture)((ROSExistingActionConnection)connection).getAction().eContainer();
	//
	//		}else if(connection instanceof ROSNewActionConnection){
	//
	//			node = (Node)((ROSNewActionConnection)connection).getActionServer().eContainer();
	//			arch = (Architecture)node.eContainer().eContainer();
	//
	//		}
	//
	//		return arch;
	//
	//	}
	//
	//	/*
	//	 * Returns the architecture model starting from a set of required connections
	//	 * It also sets the target model, and checks if more than one system model as been defined as source.
	//	 */
	//	private boolean setArchitectureFromROSRequiredConnections(ROSRequiredConnections requiredConnection){
	//
	//		Architecture arch = null;
	//
	//		for(ROSExistingTopicConnection conn : requiredConnection.getRequiredExistingTopicConnections()){
	//			arch = (Architecture)conn.getTopic().eContainer();
	//			//			MessageDialog.openError(null, "Error", "Req Topic Conn!!! \n" + arch);
	//			setTargetArchitectureModelIfNotNullAndDuplicated(arch);
	//		}
	//
	//		for(ROSExistingServiceConnection conn : requiredConnection.getRequiredExistingServiceConnections()){
	//			arch = (Architecture)conn.getService().eContainer();
	//			//			MessageDialog.openError(null, "Error", "Req Service Conn!!! \n" + arch);
	//			setTargetArchitectureModelIfNotNullAndDuplicated(arch);
	//		}
	//
	//		for(ROSExistingActionConnection conn : requiredConnection.getRequiredExistingActionConnections()){
	//			arch = (Architecture)conn.getAction().eContainer();
	//			//			MessageDialog.openError(null, "Error", "Req Action Conn!!! \n" + arch);
	//			setTargetArchitectureModelIfNotNullAndDuplicated(arch);
	//		}
	//
	//		if(arch != null)
	//			return true;
	//		else
	//			return false;
	//
	//	}
	//
	//	/*
	//	 * Set the target architecture model starting from a possible target
	//	 * It checks if the possible target is not null and if more than one system model as been defined as source.
	//	 */
	//	private boolean setTargetArchitectureModelIfNotNullAndDuplicated(Architecture arch){
	//
	//		if(arch != null){
	//			if(sourceRosArchModel != null && arch != sourceRosArchModel){
	//
	//				//				MessageDialog.openError(null, "Error", 
	//				//						"You are using at least two system models!!!");
	//				return false;
	//
	//			}else{
	//				sourceRosArchModel = arch;
	//				return true;
	//			}
	//		}
	//		return false;
	//
	//	}

	//	/*
	//	 * If exists, returns the topic with the requested name.
	//	 * Otherwise it creates a new topic with the requested name;
	//	 */
	//	private Topic getTopicFromName(String topicName){
	//
	//		for(Topic topic : targetRosArchModel.getTopic()){
	//
	//			if(topic.getName().equals(topicName)){
	//				return topic;
	//			}
	//
	//
	//		}
	//		Topic result = RosFactoryImpl.eINSTANCE.createTopic();
	//		result.setName(topicName);
	//		return result;
	//
	//	}
	//
	//	/*
	//	 * If exists, returns the service with the requested name.
	//	 * Otherwise it creates a new service with the requested name;
	//	 */
	//	private Service getServiceFromName(String serviceName){
	//
	//		for(Service service : targetRosArchModel.getService()){
	//
	//			if(service.getName().equals(serviceName)){
	//				return service;
	//			}
	//
	//
	//		}
	//		Service result = RosFactoryImpl.eINSTANCE.createService();
	//		result.setName(serviceName);
	//		return result;
	//
	//	}
	//
	//	/*
	//	 * If exists, returns the action with the requested name.
	//	 * Otherwise it creates a new action with the requested name;
	//	 */
	//	private Action getActionFromName(String actionName){
	//
	//		for(Action action : targetRosArchModel.getAction()){
	//
	//			if(action.getName().equals(actionName)){
	//				return action;
	//			}
	//
	//
	//		}
	//		Action result = RosFactoryImpl.eINSTANCE.createAction();
	//		result.setName(actionName);
	//		return result;
	//
	//	}

	//	// Check if the input connection is already defined in the list of required connections
	//	private boolean isExistingTargetConnectionAlreadyRequired(ROSExistingTargetConnection connection){
	//
	//		for(ROSAbstractConnection currentConn : requiredConnections){
	//
	//			if(currentConn.getClass().equals(requiredConnections.getClass())){
	//
	//				if(currentConn instanceof ROSTopicConnection){
	//
	//					Publisher pubA = ((ROSTopicConnection)currentConn).getPublisher();
	//					Publisher pubB = ((ROSTopicConnection)connection).getPublisher();
	//
	//					Subscriber subA = ((ROSTopicConnection)currentConn).getSubscriber();
	//					Subscriber subB = ((ROSTopicConnection)connection).getSubscriber();
	//
	//					Topic topA = ((ROSTopicConnection)currentConn).getTopic();
	//					Topic topB = ((ROSTopicConnection)connection).getTopic();
	//
	//					if(pubA == pubB && subA == subB && topA == topB){
	//						return true;
	//					}
	//
	//				}else if(currentConn instanceof ROSServiceConnection){
	//
	//					ServiceServer ssA = ((ROSServiceConnection)currentConn).getServiceServer();
	//					ServiceServer ssB = ((ROSServiceConnection)connection).getServiceServer();
	//
	//					ServiceClient scA = ((ROSServiceConnection)currentConn).getServiceClient();
	//					ServiceClient scB = ((ROSServiceConnection)connection).getServiceClient();
	//
	//					Service sA = ((ROSServiceConnection)currentConn).getService();
	//					Service sB = ((ROSServiceConnection)connection).getService();
	//
	//					if(ssA == ssB && scA == scB && sA == sB){
	//						return true;
	//					}
	//
	//				}else if(currentConn instanceof ROSActionConnection){
	//
	//					ActionServer asA = ((ROSActionConnection)currentConn).getActionServer();
	//					ActionServer asB = ((ROSActionConnection)connection).getActionServer();
	//
	//					ActionClient acA = ((ROSActionConnection)currentConn).getActionClient();
	//					ActionClient acB = ((ROSActionConnection)connection).getActionClient();
	//
	//					Action aA = ((ROSActionConnection)currentConn).getAction();
	//					Action aB = ((ROSActionConnection)connection).getAction();
	//
	//					if(asA == asB && acA == acB && aA == aB){
	//						return true;
	//					}
	//
	//				} 
	//
	//			}
	//
	//		}
	//
	//		return false;
	//
	//	}


}
