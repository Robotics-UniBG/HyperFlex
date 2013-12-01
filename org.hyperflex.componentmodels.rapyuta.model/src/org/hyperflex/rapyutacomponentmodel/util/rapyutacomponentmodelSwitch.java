/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hyperflex.rapyutacomponentmodel.AbstractComponent;
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface;
import org.hyperflex.rapyutacomponentmodel.CompositeParameter;
import org.hyperflex.rapyutacomponentmodel.CompositePublisher;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvClient;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvServer;
import org.hyperflex.rapyutacomponentmodel.CompositeSubscriber;
import org.hyperflex.rapyutacomponentmodel.Container;
import org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPoint;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgInterface;
import org.hyperflex.rapyutacomponentmodel.EndPointParameter;
import org.hyperflex.rapyutacomponentmodel.EndPointPublisher;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvClient;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvServer;
import org.hyperflex.rapyutacomponentmodel.EndPointSubscriber;
import org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint;
import org.hyperflex.rapyutacomponentmodel.MsgInterface;
import org.hyperflex.rapyutacomponentmodel.Node;
import org.hyperflex.rapyutacomponentmodel.NodeMsgInterface;
import org.hyperflex.rapyutacomponentmodel.NodeParameter;
import org.hyperflex.rapyutacomponentmodel.NodePublisher;
import org.hyperflex.rapyutacomponentmodel.NodeSrvClient;
import org.hyperflex.rapyutacomponentmodel.NodeSrvServer;
import org.hyperflex.rapyutacomponentmodel.NodeSubscriber;
import org.hyperflex.rapyutacomponentmodel.Parameter;
import org.hyperflex.rapyutacomponentmodel.RobotEndPoint;
import org.hyperflex.rapyutacomponentmodel.SrvClient;
import org.hyperflex.rapyutacomponentmodel.SrvConnection;
import org.hyperflex.rapyutacomponentmodel.SrvServer;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage
 * @generated
 */
public class rapyutacomponentmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rapyutacomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rapyutacomponentmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = rapyutacomponentmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case rapyutacomponentmodelPackage.SYSTEM: {
				org.hyperflex.rapyutacomponentmodel.System system = (org.hyperflex.rapyutacomponentmodel.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.ABSTRACT_COMPONENT: {
				AbstractComponent abstractComponent = (AbstractComponent)theEObject;
				T result = caseAbstractComponent(abstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractComponent(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseAbstractComponent(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.MSG_INTERFACE: {
				MsgInterface msgInterface = (MsgInterface)theEObject;
				T result = caseMsgInterface(msgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_MSG_INTERFACE: {
				CompositeMsgInterface compositeMsgInterface = (CompositeMsgInterface)theEObject;
				T result = caseCompositeMsgInterface(compositeMsgInterface);
				if (result == null) result = caseMsgInterface(compositeMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE_MSG_INTERFACE: {
				NodeMsgInterface nodeMsgInterface = (NodeMsgInterface)theEObject;
				T result = caseNodeMsgInterface(nodeMsgInterface);
				if (result == null) result = caseMsgInterface(nodeMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE_PUBLISHER: {
				NodePublisher nodePublisher = (NodePublisher)theEObject;
				T result = caseNodePublisher(nodePublisher);
				if (result == null) result = caseNodeMsgInterface(nodePublisher);
				if (result == null) result = caseMsgInterface(nodePublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE_SUBSCRIBER: {
				NodeSubscriber nodeSubscriber = (NodeSubscriber)theEObject;
				T result = caseNodeSubscriber(nodeSubscriber);
				if (result == null) result = caseNodeMsgInterface(nodeSubscriber);
				if (result == null) result = caseMsgInterface(nodeSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_PUBLISHER: {
				CompositePublisher compositePublisher = (CompositePublisher)theEObject;
				T result = caseCompositePublisher(compositePublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_SUBSCRIBER: {
				CompositeSubscriber compositeSubscriber = (CompositeSubscriber)theEObject;
				T result = caseCompositeSubscriber(compositeSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE_PARAMETER: {
				NodeParameter nodeParameter = (NodeParameter)theEObject;
				T result = caseNodeParameter(nodeParameter);
				if (result == null) result = caseParameter(nodeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_PARAMETER: {
				CompositeParameter compositeParameter = (CompositeParameter)theEObject;
				T result = caseCompositeParameter(compositeParameter);
				if (result == null) result = caseParameter(compositeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.SRV_SERVER: {
				SrvServer srvServer = (SrvServer)theEObject;
				T result = caseSrvServer(srvServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.SRV_CLIENT: {
				SrvClient srvClient = (SrvClient)theEObject;
				T result = caseSrvClient(srvClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_SRV_SERVER: {
				CompositeSrvServer compositeSrvServer = (CompositeSrvServer)theEObject;
				T result = caseCompositeSrvServer(compositeSrvServer);
				if (result == null) result = caseSrvServer(compositeSrvServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE_SRV_SERVER: {
				NodeSrvServer nodeSrvServer = (NodeSrvServer)theEObject;
				T result = caseNodeSrvServer(nodeSrvServer);
				if (result == null) result = caseSrvServer(nodeSrvServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_SRV_CLIENT: {
				CompositeSrvClient compositeSrvClient = (CompositeSrvClient)theEObject;
				T result = caseCompositeSrvClient(compositeSrvClient);
				if (result == null) result = caseSrvClient(compositeSrvClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.NODE_SRV_CLIENT: {
				NodeSrvClient nodeSrvClient = (NodeSrvClient)theEObject;
				T result = caseNodeSrvClient(nodeSrvClient);
				if (result == null) result = caseSrvClient(nodeSrvClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.SRV_CONNECTION: {
				SrvConnection srvConnection = (SrvConnection)theEObject;
				T result = caseSrvConnection(srvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = caseAbstractComponent(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.ROBOT_END_POINT: {
				RobotEndPoint robotEndPoint = (RobotEndPoint)theEObject;
				T result = caseRobotEndPoint(robotEndPoint);
				if (result == null) result = caseEndPoint(robotEndPoint);
				if (result == null) result = caseAbstractComponent(robotEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.ENVIRONMENT_END_POINT: {
				EnvironmentEndPoint environmentEndPoint = (EnvironmentEndPoint)theEObject;
				T result = caseEnvironmentEndPoint(environmentEndPoint);
				if (result == null) result = caseEndPoint(environmentEndPoint);
				if (result == null) result = caseAbstractComponent(environmentEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_MSG_INTERFACE: {
				EndPointMsgInterface endPointMsgInterface = (EndPointMsgInterface)theEObject;
				T result = caseEndPointMsgInterface(endPointMsgInterface);
				if (result == null) result = caseMsgInterface(endPointMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_PUBLISHER: {
				EndPointPublisher endPointPublisher = (EndPointPublisher)theEObject;
				T result = caseEndPointPublisher(endPointPublisher);
				if (result == null) result = caseEndPointMsgInterface(endPointPublisher);
				if (result == null) result = caseMsgInterface(endPointPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_SUBSCRIBER: {
				EndPointSubscriber endPointSubscriber = (EndPointSubscriber)theEObject;
				T result = caseEndPointSubscriber(endPointSubscriber);
				if (result == null) result = caseEndPointMsgInterface(endPointSubscriber);
				if (result == null) result = caseMsgInterface(endPointSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_MSG_CONNECTION: {
				EndPointMsgConnection endPointMsgConnection = (EndPointMsgConnection)theEObject;
				T result = caseEndPointMsgConnection(endPointMsgConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_SRV_SERVER: {
				EndPointSrvServer endPointSrvServer = (EndPointSrvServer)theEObject;
				T result = caseEndPointSrvServer(endPointSrvServer);
				if (result == null) result = caseSrvServer(endPointSrvServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_SRV_CLIENT: {
				EndPointSrvClient endPointSrvClient = (EndPointSrvClient)theEObject;
				T result = caseEndPointSrvClient(endPointSrvClient);
				if (result == null) result = caseSrvClient(endPointSrvClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_SRV_CONNECTION: {
				EndPointSrvConnection endPointSrvConnection = (EndPointSrvConnection)theEObject;
				T result = caseEndPointSrvConnection(endPointSrvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.END_POINT_PARAMETER: {
				EndPointParameter endPointParameter = (EndPointParameter)theEObject;
				T result = caseEndPointParameter(endPointParameter);
				if (result == null) result = caseParameter(endPointParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.CONTAINER_SRV_CONNECTION: {
				ContainerSrvConnection containerSrvConnection = (ContainerSrvConnection)theEObject;
				T result = caseContainerSrvConnection(containerSrvConnection);
				if (result == null) result = caseSrvConnection(containerSrvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rapyutacomponentmodelPackage.COMPOSITE_SRV_CONNECTION: {
				CompositeSrvConnection compositeSrvConnection = (CompositeSrvConnection)theEObject;
				T result = caseCompositeSrvConnection(compositeSrvConnection);
				if (result == null) result = caseSrvConnection(compositeSrvConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.hyperflex.rapyutacomponentmodel.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponent(AbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgInterface(MsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMsgInterface(CompositeMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgInterface(NodeMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePublisher(NodePublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSubscriber(NodeSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositePublisher(CompositePublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSubscriber(CompositeSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeParameter(NodeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeParameter(CompositeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvServer(SrvServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvClient(SrvClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Srv Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSrvServer(CompositeSrvServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Srv Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSrvServer(NodeSrvServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Srv Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSrvClient(CompositeSrvClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Srv Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSrvClient(NodeSrvClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvConnection(SrvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotEndPoint(RobotEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentEndPoint(EnvironmentEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointMsgInterface(EndPointMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointPublisher(EndPointPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointSubscriber(EndPointSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Msg Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Msg Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointMsgConnection(EndPointMsgConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Srv Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointSrvServer(EndPointSrvServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Srv Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointSrvClient(EndPointSrvClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Srv Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointSrvConnection(EndPointSrvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointParameter(EndPointParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Srv Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerSrvConnection(ContainerSrvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Srv Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSrvConnection(CompositeSrvConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //rapyutacomponentmodelSwitch
