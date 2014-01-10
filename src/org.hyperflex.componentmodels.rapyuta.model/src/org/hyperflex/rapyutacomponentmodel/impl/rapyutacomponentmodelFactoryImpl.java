/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
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
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.hyperflex.rapyutacomponentmodel.CloudContainer;
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface;
import org.hyperflex.rapyutacomponentmodel.CompositeParameter;
import org.hyperflex.rapyutacomponentmodel.CompositePublisher;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvClient;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvServer;
import org.hyperflex.rapyutacomponentmodel.CompositeSubscriber;
import org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
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
import org.hyperflex.rapyutacomponentmodel.RobotContainer;
import org.hyperflex.rapyutacomponentmodel.RobotEndPoint;
import org.hyperflex.rapyutacomponentmodel.SrvClient;
import org.hyperflex.rapyutacomponentmodel.SrvConnection;
import org.hyperflex.rapyutacomponentmodel.SrvServer;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelFactory;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class rapyutacomponentmodelFactoryImpl extends EFactoryImpl implements rapyutacomponentmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static rapyutacomponentmodelFactory init() {
		try {
			rapyutacomponentmodelFactory therapyutacomponentmodelFactory = (rapyutacomponentmodelFactory)EPackage.Registry.INSTANCE.getEFactory(rapyutacomponentmodelPackage.eNS_URI);
			if (therapyutacomponentmodelFactory != null) {
				return therapyutacomponentmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new rapyutacomponentmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rapyutacomponentmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case rapyutacomponentmodelPackage.SYSTEM: return createSystem();
			case rapyutacomponentmodelPackage.CLOUD_CONTAINER: return createCloudContainer();
			case rapyutacomponentmodelPackage.ROBOT_CONTAINER: return createRobotContainer();
			case rapyutacomponentmodelPackage.NODE: return createNode();
			case rapyutacomponentmodelPackage.COMPOSITE: return createComposite();
			case rapyutacomponentmodelPackage.MSG_INTERFACE: return createMsgInterface();
			case rapyutacomponentmodelPackage.COMPOSITE_MSG_INTERFACE: return createCompositeMsgInterface();
			case rapyutacomponentmodelPackage.NODE_MSG_INTERFACE: return createNodeMsgInterface();
			case rapyutacomponentmodelPackage.NODE_PUBLISHER: return createNodePublisher();
			case rapyutacomponentmodelPackage.NODE_SUBSCRIBER: return createNodeSubscriber();
			case rapyutacomponentmodelPackage.COMPOSITE_PUBLISHER: return createCompositePublisher();
			case rapyutacomponentmodelPackage.COMPOSITE_SUBSCRIBER: return createCompositeSubscriber();
			case rapyutacomponentmodelPackage.TOPIC: return createTopic();
			case rapyutacomponentmodelPackage.PARAMETER: return createParameter();
			case rapyutacomponentmodelPackage.NODE_PARAMETER: return createNodeParameter();
			case rapyutacomponentmodelPackage.COMPOSITE_PARAMETER: return createCompositeParameter();
			case rapyutacomponentmodelPackage.SRV_SERVER: return createSrvServer();
			case rapyutacomponentmodelPackage.SRV_CLIENT: return createSrvClient();
			case rapyutacomponentmodelPackage.COMPOSITE_SRV_SERVER: return createCompositeSrvServer();
			case rapyutacomponentmodelPackage.NODE_SRV_SERVER: return createNodeSrvServer();
			case rapyutacomponentmodelPackage.COMPOSITE_SRV_CLIENT: return createCompositeSrvClient();
			case rapyutacomponentmodelPackage.NODE_SRV_CLIENT: return createNodeSrvClient();
			case rapyutacomponentmodelPackage.SRV_CONNECTION: return createSrvConnection();
			case rapyutacomponentmodelPackage.ROBOT_END_POINT: return createRobotEndPoint();
			case rapyutacomponentmodelPackage.ENVIRONMENT_END_POINT: return createEnvironmentEndPoint();
			case rapyutacomponentmodelPackage.END_POINT_PUBLISHER: return createEndPointPublisher();
			case rapyutacomponentmodelPackage.END_POINT_SUBSCRIBER: return createEndPointSubscriber();
			case rapyutacomponentmodelPackage.END_POINT_MSG_CONNECTION: return createEndPointMsgConnection();
			case rapyutacomponentmodelPackage.END_POINT_SRV_SERVER: return createEndPointSrvServer();
			case rapyutacomponentmodelPackage.END_POINT_SRV_CLIENT: return createEndPointSrvClient();
			case rapyutacomponentmodelPackage.END_POINT_SRV_CONNECTION: return createEndPointSrvConnection();
			case rapyutacomponentmodelPackage.END_POINT_PARAMETER: return createEndPointParameter();
			case rapyutacomponentmodelPackage.CONTAINER_SRV_CONNECTION: return createContainerSrvConnection();
			case rapyutacomponentmodelPackage.COMPOSITE_SRV_CONNECTION: return createCompositeSrvConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hyperflex.rapyutacomponentmodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudContainer createCloudContainer() {
		CloudContainerImpl cloudContainer = new CloudContainerImpl();
		return cloudContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotContainer createRobotContainer() {
		RobotContainerImpl robotContainer = new RobotContainerImpl();
		return robotContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgInterface createMsgInterface() {
		MsgInterfaceImpl msgInterface = new MsgInterfaceImpl();
		return msgInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMsgInterface createCompositeMsgInterface() {
		CompositeMsgInterfaceImpl compositeMsgInterface = new CompositeMsgInterfaceImpl();
		return compositeMsgInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMsgInterface createNodeMsgInterface() {
		NodeMsgInterfaceImpl nodeMsgInterface = new NodeMsgInterfaceImpl();
		return nodeMsgInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePublisher createNodePublisher() {
		NodePublisherImpl nodePublisher = new NodePublisherImpl();
		return nodePublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSubscriber createNodeSubscriber() {
		NodeSubscriberImpl nodeSubscriber = new NodeSubscriberImpl();
		return nodeSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositePublisher createCompositePublisher() {
		CompositePublisherImpl compositePublisher = new CompositePublisherImpl();
		return compositePublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSubscriber createCompositeSubscriber() {
		CompositeSubscriberImpl compositeSubscriber = new CompositeSubscriberImpl();
		return compositeSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeParameter createNodeParameter() {
		NodeParameterImpl nodeParameter = new NodeParameterImpl();
		return nodeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeParameter createCompositeParameter() {
		CompositeParameterImpl compositeParameter = new CompositeParameterImpl();
		return compositeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvServer createSrvServer() {
		SrvServerImpl srvServer = new SrvServerImpl();
		return srvServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvClient createSrvClient() {
		SrvClientImpl srvClient = new SrvClientImpl();
		return srvClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvServer createCompositeSrvServer() {
		CompositeSrvServerImpl compositeSrvServer = new CompositeSrvServerImpl();
		return compositeSrvServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSrvServer createNodeSrvServer() {
		NodeSrvServerImpl nodeSrvServer = new NodeSrvServerImpl();
		return nodeSrvServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvClient createCompositeSrvClient() {
		CompositeSrvClientImpl compositeSrvClient = new CompositeSrvClientImpl();
		return compositeSrvClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSrvClient createNodeSrvClient() {
		NodeSrvClientImpl nodeSrvClient = new NodeSrvClientImpl();
		return nodeSrvClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvConnection createSrvConnection() {
		SrvConnectionImpl srvConnection = new SrvConnectionImpl();
		return srvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotEndPoint createRobotEndPoint() {
		RobotEndPointImpl robotEndPoint = new RobotEndPointImpl();
		return robotEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentEndPoint createEnvironmentEndPoint() {
		EnvironmentEndPointImpl environmentEndPoint = new EnvironmentEndPointImpl();
		return environmentEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointPublisher createEndPointPublisher() {
		EndPointPublisherImpl endPointPublisher = new EndPointPublisherImpl();
		return endPointPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointSubscriber createEndPointSubscriber() {
		EndPointSubscriberImpl endPointSubscriber = new EndPointSubscriberImpl();
		return endPointSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointMsgConnection createEndPointMsgConnection() {
		EndPointMsgConnectionImpl endPointMsgConnection = new EndPointMsgConnectionImpl();
		return endPointMsgConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointSrvServer createEndPointSrvServer() {
		EndPointSrvServerImpl endPointSrvServer = new EndPointSrvServerImpl();
		return endPointSrvServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointSrvClient createEndPointSrvClient() {
		EndPointSrvClientImpl endPointSrvClient = new EndPointSrvClientImpl();
		return endPointSrvClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointSrvConnection createEndPointSrvConnection() {
		EndPointSrvConnectionImpl endPointSrvConnection = new EndPointSrvConnectionImpl();
		return endPointSrvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointParameter createEndPointParameter() {
		EndPointParameterImpl endPointParameter = new EndPointParameterImpl();
		return endPointParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerSrvConnection createContainerSrvConnection() {
		ContainerSrvConnectionImpl containerSrvConnection = new ContainerSrvConnectionImpl();
		return containerSrvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvConnection createCompositeSrvConnection() {
		CompositeSrvConnectionImpl compositeSrvConnection = new CompositeSrvConnectionImpl();
		return compositeSrvConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rapyutacomponentmodelPackage getrapyutacomponentmodelPackage() {
		return (rapyutacomponentmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static rapyutacomponentmodelPackage getPackage() {
		return rapyutacomponentmodelPackage.eINSTANCE;
	}

} //rapyutacomponentmodelFactoryImpl
