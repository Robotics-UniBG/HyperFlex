package org.hyperflex.resolutionmodels.ros.commands.resolution.handlers;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jface.dialogs.MessageDialog;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.RMTransformation;
import org.hyperflex.resolutionmodels.ResolutionModel;
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
import org.hyperflex.roscomponentmodel.Composite;
import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.Property;
import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;
import org.hyperflex.roscomponentmodel.Topic;
import org.hyperflex.roscomponentmodel.Wire;
import org.hyperflex.roscomponentmodel.roscomponentmodelFactory;

public class ROSResolutionTools {

	ArrayList<Node> requiredComponents;
	ArrayList<ROSTopicConnection> requiredTopicConnections;
	ArrayList<Wire> requiredServiceConnections;
	HashMap<Property, String> propertiesValues;
	
	public ROSResolutionTools() {
		
		
		
	}
	
	public ArrayList<Node> getRequiredComponents(){
	
		return requiredComponents;
	
	}
	
	public ArrayList<ROSTopicConnection> getRequiredTopicConnections(){
		
		return  requiredTopicConnections;

	}
	
	public ArrayList<Wire> getRequiredWires(){
	
		return  requiredServiceConnections;
	
	}
	
	public HashMap<Property, String> getPropertiesValues(){
	
		return  propertiesValues;

	}
	
	public void resolveVariability(ResolutionModel resolutionModel, Instance featureModelInstance){

		requiredComponents = new ArrayList<Node>();
		requiredTopicConnections = new ArrayList<ROSTopicConnection>();
		requiredServiceConnections = new ArrayList<Wire>();
		propertiesValues = new HashMap<Property, String>();

		org.hyperflex.roscomponentmodel.System templateSystemModel;

		if(resolutionModel.getTemplateSystemModel() instanceof ROSTemplateSystemModel){
			templateSystemModel = ((ROSTemplateSystemModel)resolutionModel.getTemplateSystemModel()).getSystem();
		}

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
						if(requiredComponents.contains(node) == false){
							requiredComponents.add(node);
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
							newTopicConnection.setTopic(existingConn.getTopic());
							newTopicConnection.setMessageInterface(existingConn.getMessageInterface());

							if(requiredTopicConnections.contains(newTopicConnection)==false){
								requiredTopicConnections.add(newTopicConnection);
							}
						}
					}

					for(Wire wire : reqElements.getRequiredServiceConnections()){
						if(requiredServiceConnections.contains(wire)==false){
							requiredServiceConnections.add(wire);
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

					Node targetNode = transf.getTargetNode();

					targetNode.setPackageName(transf.getClassNamespace());
					targetNode.setType(transf.getClassName());


					// add the target nod to the required components list
					// it should be already there,
					// This is done for the case in which the user forget to add it
					if(requiredComponents.contains(targetNode) == false){
						requiredComponents.add(targetNode);
					}


				}else if(currentTransf instanceof ROSTransfConnection){

					//TODO put new connections in a list
					
//					ROSTransfConnection transf = (ROSTransfConnection)currentTransf;
//
//					for(ROSConnection newRosConnection : transf.getNewConnections()){
//
//						if(newRosConnection instanceof ROSTopicConnection){
//
//							ROSTopicConnection conn = (ROSTopicConnection)newRosConnection;
//
//							MsgInterface msgInterface = conn.getMessageInterface();
//							Topic topic = null;
//							ROSExistingTopicConnection newRequiredConn = rosresolutionmodelsFactory.eINSTANCE.createROSExistingTopicConnection();
//
//							if(newRosConnection instanceof ROSExistingTopicConnection){
//								newRequiredConn.setTopic(((ROSExistingTopicConnection)conn).getTopic());
//							}else if(newRosConnection instanceof ROSNewTopicConnection){
//
//
//								ROSNewTopicConnection newConn = (ROSNewTopicConnection)conn;
//								Composite composite = ((Composite)newConn.getMessageInterface().eContainer().eContainer());
//								if(composite == null){
//									MessageDialog.openError(null, "Error", 
//											"The ROS resolution model contains a RMTransfConnection that is related to "
//													+ "a msg interface the parent of which is not cotained in a composite "
//													+ "(Resolution Element name:" +
//													currentResElem.getName() +
//											" ) !!!");
//									return;
//								}
//								for(Topic existingTopic : composite.getTopics()){
//									if(existingTopic.getName().equals(newConn.getTopicName())){
//										topic = existingTopic;
//										break;
//									}
//								}
//
//								if(topic == null){
//									topic = roscomponentmodelFactory.eINSTANCE.createTopic();
//									topic.setName(newConn.getTopicName());
//
//									//TODO CREATE NEW CONNECTIONS
//
//									//composite.getTopics().add(topic);
//
//								}
//								newRequiredConn.setTopic(topic);
//
//							}else{
//								continue;
//							}
//
//							msgInterface.setConnection(topic);
//							newRequiredConn.setMessageInterface(msgInterface);
//
//							// add the new connection to the required connections list
//							if(requiredTopicConnections.contains(newRequiredConn)==false){
//								requiredTopicConnections.add(newRequiredConn);
//							}
//
//							// we add also the connected component
//							if(msgInterface.eContainer() instanceof Node){
//								if(requiredComponents.contains((Node)msgInterface.eContainer())==false){
//									requiredComponents.add((Node)msgInterface.eContainer());
//								}
//							}
//
//						}else if(newRosConnection instanceof ROSServiceConnection){
//
//							ROSServiceConnection conn = (ROSServiceConnection)newRosConnection;
//
//							SrvProducer srvProducer = srvProducerHashTable.get(conn.getServiceProducer());
//							SrvConsumer srvConsumer = srvConsumerHashTable.get(conn.getServiceConsumer());
//
//							Wire wire = roscomponentmodelFactory.eINSTANCE.createWire();
//							wire.setSource(srvProducer);
//							wire.setTarget(srvConsumer);
//
//							boolean autoConnection = srvProducer.eContainer() == srvConsumer.eContainer();
//							boolean sameComposite = srvProducer.eContainer().eContainer() == srvConsumer.eContainer().eContainer();
//
//							if(autoConnection == false && sameComposite == true){
//								if(((Composite)srvProducer.eContainer().eContainer()).getWires().contains(wire)==false){
//									((Composite)srvProducer.eContainer().eContainer()).getWires().add(wire);
//								}
//
//							}
//
//							// add the new connection to the required connections list
//							if(requiredServiceConnections.contains(wire)==false){
//								requiredServiceConnections.add(wire);
//							}
//
//							// we add also the connected component
//							// we add also the connected component
//							if(srvProducer.eContainer() instanceof Node){
//								Node node = (Node)abstractComponentHashTable.get((Node)srvProducer.eContainer());
//								if(requiredComponents.contains(node) == false){
//									requiredComponents.add(node);
//								}
//							}
//
//							if(srvConsumer.eContainer() instanceof Node){
//								Node node = (Node)abstractComponentHashTable.get((Node)srvConsumer.eContainer());
//								if(requiredComponents.contains(node) == false){
//									requiredComponents.add(node);
//								}
//							}
//
//						}
//
//					}

				}else if(currentTransf instanceof ROSTransfProperty){

					ROSTransfProperty transf = (ROSTransfProperty)currentTransf;
					propertiesValues.put(transf.getTargetProperty(), transf.getValue());

				}

			}
		}

		//removeUnusedArchitecturalElements(targetRosArchModel.getComposite());



	}


}
