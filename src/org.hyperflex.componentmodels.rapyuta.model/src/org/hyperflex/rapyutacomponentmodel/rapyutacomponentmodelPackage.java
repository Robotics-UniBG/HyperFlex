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
package org.hyperflex.rapyutacomponentmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface rapyutacomponentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rapyutacomponentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hyperflex.org/componentmodels.rapyuta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rapyutacomponentmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rapyutacomponentmodelPackage eINSTANCE = org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.SystemImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPOSITES = 1;

	/**
	 * The feature id for the '<em><b>End Point Srv Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__END_POINT_SRV_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>End Point Msg Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__END_POINT_MSG_CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__URL = 5;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USER_ID = 6;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PASSWORD = 7;

	/**
	 * The feature id for the '<em><b>Robot ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROBOT_ID = 8;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TOPICS = 1;

	/**
	 * The feature id for the '<em><b>Srv Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SRV_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__END_POINT = 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMPONENTS = 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.AbstractComponentImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISHERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srv Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_SERVERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Srv Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_CLIENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PACKAGE_NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PUBLISHERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SUBSCRIBERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TOPICS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Srv Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SRV_SERVERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Srv Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SRV_CLIENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Srv Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SRV_CONNECTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PARAMETERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__END_POINT = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.MsgInterfaceImpl <em>Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.MsgInterfaceImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getMsgInterface()
	 * @generated
	 */
	int MSG_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_INTERFACE__CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeMsgInterfaceImpl <em>Composite Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeMsgInterfaceImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeMsgInterface()
	 * @generated
	 */
	int COMPOSITE_MSG_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE__NAME = MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE__CONNECTION = MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE__EXPOSED = MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE_FEATURE_COUNT = MSG_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeMsgInterfaceImpl <em>Node Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeMsgInterfaceImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeMsgInterface()
	 * @generated
	 */
	int NODE_MSG_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE__NAME = MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE__CONNECTION = MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE__TOPIC_NAME = MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE_FEATURE_COUNT = MSG_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodePublisherImpl <em>Node Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodePublisherImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodePublisher()
	 * @generated
	 */
	int NODE_PUBLISHER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PUBLISHER__NAME = NODE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PUBLISHER__CONNECTION = NODE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PUBLISHER__TOPIC_NAME = NODE_MSG_INTERFACE__TOPIC_NAME;

	/**
	 * The number of structural features of the '<em>Node Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PUBLISHER_FEATURE_COUNT = NODE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeSubscriberImpl <em>Node Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeSubscriberImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeSubscriber()
	 * @generated
	 */
	int NODE_SUBSCRIBER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SUBSCRIBER__NAME = NODE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SUBSCRIBER__CONNECTION = NODE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SUBSCRIBER__TOPIC_NAME = NODE_MSG_INTERFACE__TOPIC_NAME;

	/**
	 * The number of structural features of the '<em>Node Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SUBSCRIBER_FEATURE_COUNT = NODE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositePublisherImpl <em>Composite Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositePublisherImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositePublisher()
	 * @generated
	 */
	int COMPOSITE_PUBLISHER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PUBLISHER__NAME = COMPOSITE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PUBLISHER__CONNECTION = COMPOSITE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PUBLISHER__EXPOSED = COMPOSITE_MSG_INTERFACE__EXPOSED;

	/**
	 * The number of structural features of the '<em>Composite Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PUBLISHER_FEATURE_COUNT = COMPOSITE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSubscriberImpl <em>Composite Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSubscriberImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSubscriber()
	 * @generated
	 */
	int COMPOSITE_SUBSCRIBER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBSCRIBER__NAME = COMPOSITE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBSCRIBER__CONNECTION = COMPOSITE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBSCRIBER__EXPOSED = COMPOSITE_MSG_INTERFACE__EXPOSED;

	/**
	 * The number of structural features of the '<em>Composite Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBSCRIBER_FEATURE_COUNT = COMPOSITE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.TopicImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__MSG = 1;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.ParameterImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeParameterImpl <em>Node Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeParameterImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeParameter()
	 * @generated
	 */
	int NODE_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER__TYPE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeParameterImpl <em>Composite Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeParameterImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeParameter()
	 * @generated
	 */
	int COMPOSITE_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PARAMETER__EXPOSED = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SrvServerImpl <em>Srv Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.SrvServerImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSrvServer()
	 * @generated
	 */
	int SRV_SERVER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_SERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_SERVER__SRV = 1;

	/**
	 * The number of structural features of the '<em>Srv Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_SERVER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SrvClientImpl <em>Srv Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.SrvClientImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSrvClient()
	 * @generated
	 */
	int SRV_CLIENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CLIENT__SRV = 1;

	/**
	 * The number of structural features of the '<em>Srv Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvServerImpl <em>Composite Srv Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvServerImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSrvServer()
	 * @generated
	 */
	int COMPOSITE_SRV_SERVER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_SERVER__NAME = SRV_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_SERVER__SRV = SRV_SERVER__SRV;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_SERVER__PROMOTE = SRV_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Srv Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_SERVER_FEATURE_COUNT = SRV_SERVER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeSrvServerImpl <em>Node Srv Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeSrvServerImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeSrvServer()
	 * @generated
	 */
	int NODE_SRV_SERVER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_SERVER__NAME = SRV_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_SERVER__SRV = SRV_SERVER__SRV;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_SERVER__SRV_NAME = SRV_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Srv Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_SERVER_FEATURE_COUNT = SRV_SERVER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvClientImpl <em>Composite Srv Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvClientImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSrvClient()
	 * @generated
	 */
	int COMPOSITE_SRV_CLIENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CLIENT__NAME = SRV_CLIENT__NAME;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CLIENT__SRV = SRV_CLIENT__SRV;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CLIENT__PROMOTE = SRV_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Srv Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CLIENT_FEATURE_COUNT = SRV_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeSrvClientImpl <em>Node Srv Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeSrvClientImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeSrvClient()
	 * @generated
	 */
	int NODE_SRV_CLIENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CLIENT__NAME = SRV_CLIENT__NAME;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CLIENT__SRV = SRV_CLIENT__SRV;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CLIENT__SRV_NAME = SRV_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Srv Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CLIENT_FEATURE_COUNT = SRV_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl <em>Srv Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSrvConnection()
	 * @generated
	 */
	int SRV_CONNECTION = 22;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONNECTION__SERVER = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONNECTION__CLIENT = 1;

	/**
	 * The number of structural features of the '<em>Srv Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__PUBLISHERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__SUBSCRIBERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srv Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__SRV_SERVERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srv Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__SRV_CLIENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__PARAMETERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl <em>Robot End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getRobotEndPoint()
	 * @generated
	 */
	int ROBOT_END_POINT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT__NAME = END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT__PUBLISHERS = END_POINT__PUBLISHERS;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT__SUBSCRIBERS = END_POINT__SUBSCRIBERS;

	/**
	 * The feature id for the '<em><b>Srv Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT__SRV_SERVERS = END_POINT__SRV_SERVERS;

	/**
	 * The feature id for the '<em><b>Srv Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT__SRV_CLIENTS = END_POINT__SRV_CLIENTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT__PARAMETERS = END_POINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Robot End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EnvironmentEndPointImpl <em>Environment End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EnvironmentEndPointImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEnvironmentEndPoint()
	 * @generated
	 */
	int ENVIRONMENT_END_POINT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT__NAME = END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT__PUBLISHERS = END_POINT__PUBLISHERS;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT__SUBSCRIBERS = END_POINT__SUBSCRIBERS;

	/**
	 * The feature id for the '<em><b>Srv Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT__SRV_SERVERS = END_POINT__SRV_SERVERS;

	/**
	 * The feature id for the '<em><b>Srv Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT__SRV_CLIENTS = END_POINT__SRV_CLIENTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT__PARAMETERS = END_POINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Environment End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_END_POINT_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgInterfaceImpl <em>End Point Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgInterfaceImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointMsgInterface()
	 * @generated
	 */
	int END_POINT_MSG_INTERFACE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_MSG_INTERFACE__NAME = MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_MSG_INTERFACE__CONNECTION = MSG_INTERFACE__CONNECTION;

	/**
	 * The number of structural features of the '<em>End Point Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_MSG_INTERFACE_FEATURE_COUNT = MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointPublisherImpl <em>End Point Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointPublisherImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointPublisher()
	 * @generated
	 */
	int END_POINT_PUBLISHER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PUBLISHER__NAME = END_POINT_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PUBLISHER__CONNECTION = END_POINT_MSG_INTERFACE__CONNECTION;

	/**
	 * The number of structural features of the '<em>End Point Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PUBLISHER_FEATURE_COUNT = END_POINT_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSubscriberImpl <em>End Point Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSubscriberImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSubscriber()
	 * @generated
	 */
	int END_POINT_SUBSCRIBER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SUBSCRIBER__NAME = END_POINT_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SUBSCRIBER__CONNECTION = END_POINT_MSG_INTERFACE__CONNECTION;

	/**
	 * The number of structural features of the '<em>End Point Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SUBSCRIBER_FEATURE_COUNT = END_POINT_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgConnectionImpl <em>End Point Msg Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgConnectionImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointMsgConnection()
	 * @generated
	 */
	int END_POINT_MSG_CONNECTION = 29;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_MSG_CONNECTION__PUBLISHER = 0;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_MSG_CONNECTION__SUBSCRIBER = 1;

	/**
	 * The number of structural features of the '<em>End Point Msg Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_MSG_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvServerImpl <em>End Point Srv Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvServerImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSrvServer()
	 * @generated
	 */
	int END_POINT_SRV_SERVER = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_SERVER__NAME = SRV_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_SERVER__SRV = SRV_SERVER__SRV;

	/**
	 * The number of structural features of the '<em>End Point Srv Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_SERVER_FEATURE_COUNT = SRV_SERVER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvClientImpl <em>End Point Srv Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvClientImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSrvClient()
	 * @generated
	 */
	int END_POINT_SRV_CLIENT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_CLIENT__NAME = SRV_CLIENT__NAME;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_CLIENT__SRV = SRV_CLIENT__SRV;

	/**
	 * The number of structural features of the '<em>End Point Srv Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_CLIENT_FEATURE_COUNT = SRV_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvConnectionImpl <em>End Point Srv Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvConnectionImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSrvConnection()
	 * @generated
	 */
	int END_POINT_SRV_CONNECTION = 32;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_CONNECTION__SERVER = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_CONNECTION__CLIENT = 1;

	/**
	 * The number of structural features of the '<em>End Point Srv Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_SRV_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointParameterImpl <em>End Point Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointParameterImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointParameter()
	 * @generated
	 */
	int END_POINT_PARAMETER = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PARAMETER__TYPE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Point Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerSrvConnectionImpl <em>Container Srv Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.ContainerSrvConnectionImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getContainerSrvConnection()
	 * @generated
	 */
	int CONTAINER_SRV_CONNECTION = 34;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SRV_CONNECTION__SERVER = SRV_CONNECTION__SERVER;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SRV_CONNECTION__CLIENT = SRV_CONNECTION__CLIENT;

	/**
	 * The number of structural features of the '<em>Container Srv Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SRV_CONNECTION_FEATURE_COUNT = SRV_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvConnectionImpl <em>Composite Srv Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvConnectionImpl
	 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSrvConnection()
	 * @generated
	 */
	int COMPOSITE_SRV_CONNECTION = 35;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CONNECTION__SERVER = SRV_CONNECTION__SERVER;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CONNECTION__CLIENT = SRV_CONNECTION__CLIENT;

	/**
	 * The number of structural features of the '<em>Composite Srv Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CONNECTION_FEATURE_COUNT = SRV_CONNECTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.System#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getContainers()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.System#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getComposites()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Composites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.System#getEndPointSrvConnections <em>End Point Srv Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Point Srv Connections</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getEndPointSrvConnections()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_EndPointSrvConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.System#getEndPointMsgConnections <em>End Point Msg Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Point Msg Connections</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getEndPointMsgConnections()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_EndPointMsgConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.System#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getUrl()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.System#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getUserID()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_UserID();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.System#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getPassword()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.System#getRobotID <em>Robot ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Robot ID</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.System#getRobotID()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_RobotID();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Container#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Container#getTopics()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Container#getSrvConnections <em>Srv Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Connections</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Container#getSrvConnections()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_SrvConnections();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.rapyutacomponentmodel.Container#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Point</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Container#getEndPoint()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_EndPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Container#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Container#getComponents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Components();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.AbstractComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.AbstractComponent#getName()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Node#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getPublishers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Node#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getSubscribers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscribers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Node#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getParameters()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Node#getSrvServers <em>Srv Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Servers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getSrvServers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvServers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Node#getSrvClients <em>Srv Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Clients</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getSrvClients()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvClients();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.Node#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getPackageName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getComponents()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getPublishers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getSubscribers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Subscribers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getTopics()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getSrvServers <em>Srv Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Servers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getSrvServers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_SrvServers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getSrvClients <em>Srv Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Clients</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getSrvClients()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_SrvClients();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getSrvConnections <em>Srv Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Connections</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getSrvConnections()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_SrvConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.Composite#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getParameters()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.rapyutacomponentmodel.Composite#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Point</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Composite#getEndPoint()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_EndPoint();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.MsgInterface <em>Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Interface</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.MsgInterface
	 * @generated
	 */
	EClass getMsgInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.MsgInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.MsgInterface#getName()
	 * @see #getMsgInterface()
	 * @generated
	 */
	EAttribute getMsgInterface_Name();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.MsgInterface#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.MsgInterface#getConnection()
	 * @see #getMsgInterface()
	 * @generated
	 */
	EReference getMsgInterface_Connection();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface <em>Composite Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Msg Interface</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface
	 * @generated
	 */
	EClass getCompositeMsgInterface();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface#getExposed()
	 * @see #getCompositeMsgInterface()
	 * @generated
	 */
	EReference getCompositeMsgInterface_Exposed();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.NodeMsgInterface <em>Node Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Interface</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeMsgInterface
	 * @generated
	 */
	EClass getNodeMsgInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.NodeMsgInterface#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeMsgInterface#getTopicName()
	 * @see #getNodeMsgInterface()
	 * @generated
	 */
	EAttribute getNodeMsgInterface_TopicName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.NodePublisher <em>Node Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Publisher</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodePublisher
	 * @generated
	 */
	EClass getNodePublisher();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.NodeSubscriber <em>Node Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Subscriber</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeSubscriber
	 * @generated
	 */
	EClass getNodeSubscriber();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositePublisher <em>Composite Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Publisher</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositePublisher
	 * @generated
	 */
	EClass getCompositePublisher();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositeSubscriber <em>Composite Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Subscriber</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeSubscriber
	 * @generated
	 */
	EClass getCompositeSubscriber();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.Topic#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Topic#getMsg()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Msg();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.NodeParameter <em>Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Parameter</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeParameter
	 * @generated
	 */
	EClass getNodeParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.NodeParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeParameter#getValue()
	 * @see #getNodeParameter()
	 * @generated
	 */
	EAttribute getNodeParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.NodeParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeParameter#getType()
	 * @see #getNodeParameter()
	 * @generated
	 */
	EAttribute getNodeParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositeParameter <em>Composite Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Parameter</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeParameter
	 * @generated
	 */
	EClass getCompositeParameter();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.CompositeParameter#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeParameter#getExposed()
	 * @see #getCompositeParameter()
	 * @generated
	 */
	EReference getCompositeParameter_Exposed();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.SrvServer <em>Srv Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Server</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvServer
	 * @generated
	 */
	EClass getSrvServer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.SrvServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvServer#getName()
	 * @see #getSrvServer()
	 * @generated
	 */
	EAttribute getSrvServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.SrvServer#getSrv <em>Srv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvServer#getSrv()
	 * @see #getSrvServer()
	 * @generated
	 */
	EAttribute getSrvServer_Srv();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.SrvClient <em>Srv Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Client</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvClient
	 * @generated
	 */
	EClass getSrvClient();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.SrvClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvClient#getName()
	 * @see #getSrvClient()
	 * @generated
	 */
	EAttribute getSrvClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.SrvClient#getSrv <em>Srv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvClient#getSrv()
	 * @see #getSrvClient()
	 * @generated
	 */
	EAttribute getSrvClient_Srv();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer <em>Composite Srv Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Srv Server</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeSrvServer
	 * @generated
	 */
	EClass getCompositeSrvServer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeSrvServer#getPromote()
	 * @see #getCompositeSrvServer()
	 * @generated
	 */
	EReference getCompositeSrvServer_Promote();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.NodeSrvServer <em>Node Srv Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Server</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeSrvServer
	 * @generated
	 */
	EClass getNodeSrvServer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.NodeSrvServer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeSrvServer#getSrvName()
	 * @see #getNodeSrvServer()
	 * @generated
	 */
	EAttribute getNodeSrvServer_SrvName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvClient <em>Composite Srv Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Srv Client</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeSrvClient
	 * @generated
	 */
	EClass getCompositeSrvClient();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvClient#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeSrvClient#getPromote()
	 * @see #getCompositeSrvClient()
	 * @generated
	 */
	EReference getCompositeSrvClient_Promote();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.NodeSrvClient <em>Node Srv Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Client</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeSrvClient
	 * @generated
	 */
	EClass getNodeSrvClient();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.NodeSrvClient#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.NodeSrvClient#getSrvName()
	 * @see #getNodeSrvClient()
	 * @generated
	 */
	EAttribute getNodeSrvClient_SrvName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.SrvConnection <em>Srv Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Connection</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvConnection
	 * @generated
	 */
	EClass getSrvConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.SrvConnection#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvConnection#getServer()
	 * @see #getSrvConnection()
	 * @generated
	 */
	EReference getSrvConnection_Server();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.SrvConnection#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.SrvConnection#getClient()
	 * @see #getSrvConnection()
	 * @generated
	 */
	EReference getSrvConnection_Client();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.EndPoint#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPoint#getPublishers()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.EndPoint#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPoint#getSubscribers()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Subscribers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.EndPoint#getSrvServers <em>Srv Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Servers</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPoint#getSrvServers()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_SrvServers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.EndPoint#getSrvClients <em>Srv Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Clients</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPoint#getSrvClients()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_SrvClients();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.rapyutacomponentmodel.EndPoint#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPoint#getParameters()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Parameters();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint <em>Robot End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot End Point</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.RobotEndPoint
	 * @generated
	 */
	EClass getRobotEndPoint();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint <em>Environment End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment End Point</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint
	 * @generated
	 */
	EClass getEnvironmentEndPoint();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgInterface <em>End Point Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Msg Interface</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointMsgInterface
	 * @generated
	 */
	EClass getEndPointMsgInterface();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointPublisher <em>End Point Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Publisher</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointPublisher
	 * @generated
	 */
	EClass getEndPointPublisher();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointSubscriber <em>End Point Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Subscriber</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointSubscriber
	 * @generated
	 */
	EClass getEndPointSubscriber();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection <em>End Point Msg Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Msg Connection</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection
	 * @generated
	 */
	EClass getEndPointMsgConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getPublisher()
	 * @see #getEndPointMsgConnection()
	 * @generated
	 */
	EReference getEndPointMsgConnection_Publisher();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getSubscriber()
	 * @see #getEndPointMsgConnection()
	 * @generated
	 */
	EReference getEndPointMsgConnection_Subscriber();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointSrvServer <em>End Point Srv Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Srv Server</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointSrvServer
	 * @generated
	 */
	EClass getEndPointSrvServer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointSrvClient <em>End Point Srv Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Srv Client</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointSrvClient
	 * @generated
	 */
	EClass getEndPointSrvClient();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection <em>End Point Srv Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Srv Connection</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection
	 * @generated
	 */
	EClass getEndPointSrvConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection#getServer()
	 * @see #getEndPointSrvConnection()
	 * @generated
	 */
	EReference getEndPointSrvConnection_Server();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection#getClient()
	 * @see #getEndPointSrvConnection()
	 * @generated
	 */
	EReference getEndPointSrvConnection_Client();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.EndPointParameter <em>End Point Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Parameter</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointParameter
	 * @generated
	 */
	EClass getEndPointParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.EndPointParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointParameter#getValue()
	 * @see #getEndPointParameter()
	 * @generated
	 */
	EAttribute getEndPointParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.rapyutacomponentmodel.EndPointParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.EndPointParameter#getType()
	 * @see #getEndPointParameter()
	 * @generated
	 */
	EAttribute getEndPointParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection <em>Container Srv Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Srv Connection</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection
	 * @generated
	 */
	EClass getContainerSrvConnection();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection <em>Composite Srv Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Srv Connection</em>'.
	 * @see org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection
	 * @generated
	 */
	EClass getCompositeSrvConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	rapyutacomponentmodelFactory getrapyutacomponentmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.SystemImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTAINERS = eINSTANCE.getSystem_Containers();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPOSITES = eINSTANCE.getSystem_Composites();

		/**
		 * The meta object literal for the '<em><b>End Point Srv Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__END_POINT_SRV_CONNECTIONS = eINSTANCE.getSystem_EndPointSrvConnections();

		/**
		 * The meta object literal for the '<em><b>End Point Msg Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__END_POINT_MSG_CONNECTIONS = eINSTANCE.getSystem_EndPointMsgConnections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__URL = eINSTANCE.getSystem_Url();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__USER_ID = eINSTANCE.getSystem_UserID();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__PASSWORD = eINSTANCE.getSystem_Password();

		/**
		 * The meta object literal for the '<em><b>Robot ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ROBOT_ID = eINSTANCE.getSystem_RobotID();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TOPICS = eINSTANCE.getContainer_Topics();

		/**
		 * The meta object literal for the '<em><b>Srv Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__SRV_CONNECTIONS = eINSTANCE.getContainer_SrvConnections();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__END_POINT = eINSTANCE.getContainer_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__COMPONENTS = eINSTANCE.getContainer_Components();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.AbstractComponentImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__NAME = eINSTANCE.getAbstractComponent_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISHERS = eINSTANCE.getNode_Publishers();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBERS = eINSTANCE.getNode_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETERS = eINSTANCE.getNode_Parameters();

		/**
		 * The meta object literal for the '<em><b>Srv Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SRV_SERVERS = eINSTANCE.getNode_SrvServers();

		/**
		 * The meta object literal for the '<em><b>Srv Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SRV_CLIENTS = eINSTANCE.getNode_SrvClients();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PACKAGE_NAME = eINSTANCE.getNode_PackageName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__COMPONENTS = eINSTANCE.getComposite_Components();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PUBLISHERS = eINSTANCE.getComposite_Publishers();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SUBSCRIBERS = eINSTANCE.getComposite_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__TOPICS = eINSTANCE.getComposite_Topics();

		/**
		 * The meta object literal for the '<em><b>Srv Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SRV_SERVERS = eINSTANCE.getComposite_SrvServers();

		/**
		 * The meta object literal for the '<em><b>Srv Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SRV_CLIENTS = eINSTANCE.getComposite_SrvClients();

		/**
		 * The meta object literal for the '<em><b>Srv Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SRV_CONNECTIONS = eINSTANCE.getComposite_SrvConnections();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PARAMETERS = eINSTANCE.getComposite_Parameters();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__END_POINT = eINSTANCE.getComposite_EndPoint();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.MsgInterfaceImpl <em>Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.MsgInterfaceImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getMsgInterface()
		 * @generated
		 */
		EClass MSG_INTERFACE = eINSTANCE.getMsgInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_INTERFACE__NAME = eINSTANCE.getMsgInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_INTERFACE__CONNECTION = eINSTANCE.getMsgInterface_Connection();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeMsgInterfaceImpl <em>Composite Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeMsgInterfaceImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeMsgInterface()
		 * @generated
		 */
		EClass COMPOSITE_MSG_INTERFACE = eINSTANCE.getCompositeMsgInterface();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MSG_INTERFACE__EXPOSED = eINSTANCE.getCompositeMsgInterface_Exposed();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeMsgInterfaceImpl <em>Node Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeMsgInterfaceImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeMsgInterface()
		 * @generated
		 */
		EClass NODE_MSG_INTERFACE = eINSTANCE.getNodeMsgInterface();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_MSG_INTERFACE__TOPIC_NAME = eINSTANCE.getNodeMsgInterface_TopicName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodePublisherImpl <em>Node Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodePublisherImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodePublisher()
		 * @generated
		 */
		EClass NODE_PUBLISHER = eINSTANCE.getNodePublisher();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeSubscriberImpl <em>Node Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeSubscriberImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeSubscriber()
		 * @generated
		 */
		EClass NODE_SUBSCRIBER = eINSTANCE.getNodeSubscriber();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositePublisherImpl <em>Composite Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositePublisherImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositePublisher()
		 * @generated
		 */
		EClass COMPOSITE_PUBLISHER = eINSTANCE.getCompositePublisher();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSubscriberImpl <em>Composite Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSubscriberImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSubscriber()
		 * @generated
		 */
		EClass COMPOSITE_SUBSCRIBER = eINSTANCE.getCompositeSubscriber();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.TopicImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__MSG = eINSTANCE.getTopic_Msg();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.ParameterImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeParameterImpl <em>Node Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeParameterImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeParameter()
		 * @generated
		 */
		EClass NODE_PARAMETER = eINSTANCE.getNodeParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAMETER__VALUE = eINSTANCE.getNodeParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAMETER__TYPE = eINSTANCE.getNodeParameter_Type();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeParameterImpl <em>Composite Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeParameterImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeParameter()
		 * @generated
		 */
		EClass COMPOSITE_PARAMETER = eINSTANCE.getCompositeParameter();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PARAMETER__EXPOSED = eINSTANCE.getCompositeParameter_Exposed();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SrvServerImpl <em>Srv Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.SrvServerImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSrvServer()
		 * @generated
		 */
		EClass SRV_SERVER = eINSTANCE.getSrvServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_SERVER__NAME = eINSTANCE.getSrvServer_Name();

		/**
		 * The meta object literal for the '<em><b>Srv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_SERVER__SRV = eINSTANCE.getSrvServer_Srv();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SrvClientImpl <em>Srv Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.SrvClientImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSrvClient()
		 * @generated
		 */
		EClass SRV_CLIENT = eINSTANCE.getSrvClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_CLIENT__NAME = eINSTANCE.getSrvClient_Name();

		/**
		 * The meta object literal for the '<em><b>Srv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_CLIENT__SRV = eINSTANCE.getSrvClient_Srv();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvServerImpl <em>Composite Srv Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvServerImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSrvServer()
		 * @generated
		 */
		EClass COMPOSITE_SRV_SERVER = eINSTANCE.getCompositeSrvServer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SRV_SERVER__PROMOTE = eINSTANCE.getCompositeSrvServer_Promote();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeSrvServerImpl <em>Node Srv Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeSrvServerImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeSrvServer()
		 * @generated
		 */
		EClass NODE_SRV_SERVER = eINSTANCE.getNodeSrvServer();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SRV_SERVER__SRV_NAME = eINSTANCE.getNodeSrvServer_SrvName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvClientImpl <em>Composite Srv Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvClientImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSrvClient()
		 * @generated
		 */
		EClass COMPOSITE_SRV_CLIENT = eINSTANCE.getCompositeSrvClient();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SRV_CLIENT__PROMOTE = eINSTANCE.getCompositeSrvClient_Promote();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.NodeSrvClientImpl <em>Node Srv Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.NodeSrvClientImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getNodeSrvClient()
		 * @generated
		 */
		EClass NODE_SRV_CLIENT = eINSTANCE.getNodeSrvClient();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SRV_CLIENT__SRV_NAME = eINSTANCE.getNodeSrvClient_SrvName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl <em>Srv Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getSrvConnection()
		 * @generated
		 */
		EClass SRV_CONNECTION = eINSTANCE.getSrvConnection();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CONNECTION__SERVER = eINSTANCE.getSrvConnection_Server();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CONNECTION__CLIENT = eINSTANCE.getSrvConnection_Client();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__PUBLISHERS = eINSTANCE.getEndPoint_Publishers();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__SUBSCRIBERS = eINSTANCE.getEndPoint_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Srv Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__SRV_SERVERS = eINSTANCE.getEndPoint_SrvServers();

		/**
		 * The meta object literal for the '<em><b>Srv Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__SRV_CLIENTS = eINSTANCE.getEndPoint_SrvClients();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__PARAMETERS = eINSTANCE.getEndPoint_Parameters();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl <em>Robot End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getRobotEndPoint()
		 * @generated
		 */
		EClass ROBOT_END_POINT = eINSTANCE.getRobotEndPoint();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EnvironmentEndPointImpl <em>Environment End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EnvironmentEndPointImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEnvironmentEndPoint()
		 * @generated
		 */
		EClass ENVIRONMENT_END_POINT = eINSTANCE.getEnvironmentEndPoint();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgInterfaceImpl <em>End Point Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgInterfaceImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointMsgInterface()
		 * @generated
		 */
		EClass END_POINT_MSG_INTERFACE = eINSTANCE.getEndPointMsgInterface();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointPublisherImpl <em>End Point Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointPublisherImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointPublisher()
		 * @generated
		 */
		EClass END_POINT_PUBLISHER = eINSTANCE.getEndPointPublisher();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSubscriberImpl <em>End Point Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSubscriberImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSubscriber()
		 * @generated
		 */
		EClass END_POINT_SUBSCRIBER = eINSTANCE.getEndPointSubscriber();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgConnectionImpl <em>End Point Msg Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointMsgConnectionImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointMsgConnection()
		 * @generated
		 */
		EClass END_POINT_MSG_CONNECTION = eINSTANCE.getEndPointMsgConnection();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT_MSG_CONNECTION__PUBLISHER = eINSTANCE.getEndPointMsgConnection_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT_MSG_CONNECTION__SUBSCRIBER = eINSTANCE.getEndPointMsgConnection_Subscriber();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvServerImpl <em>End Point Srv Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvServerImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSrvServer()
		 * @generated
		 */
		EClass END_POINT_SRV_SERVER = eINSTANCE.getEndPointSrvServer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvClientImpl <em>End Point Srv Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvClientImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSrvClient()
		 * @generated
		 */
		EClass END_POINT_SRV_CLIENT = eINSTANCE.getEndPointSrvClient();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvConnectionImpl <em>End Point Srv Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointSrvConnectionImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointSrvConnection()
		 * @generated
		 */
		EClass END_POINT_SRV_CONNECTION = eINSTANCE.getEndPointSrvConnection();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT_SRV_CONNECTION__SERVER = eINSTANCE.getEndPointSrvConnection_Server();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT_SRV_CONNECTION__CLIENT = eINSTANCE.getEndPointSrvConnection_Client();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointParameterImpl <em>End Point Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.EndPointParameterImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getEndPointParameter()
		 * @generated
		 */
		EClass END_POINT_PARAMETER = eINSTANCE.getEndPointParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT_PARAMETER__VALUE = eINSTANCE.getEndPointParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT_PARAMETER__TYPE = eINSTANCE.getEndPointParameter_Type();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerSrvConnectionImpl <em>Container Srv Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.ContainerSrvConnectionImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getContainerSrvConnection()
		 * @generated
		 */
		EClass CONTAINER_SRV_CONNECTION = eINSTANCE.getContainerSrvConnection();

		/**
		 * The meta object literal for the '{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvConnectionImpl <em>Composite Srv Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.rapyutacomponentmodel.impl.CompositeSrvConnectionImpl
		 * @see org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelPackageImpl#getCompositeSrvConnection()
		 * @generated
		 */
		EClass COMPOSITE_SRV_CONNECTION = eINSTANCE.getCompositeSrvConnection();

	}

} //rapyutacomponentmodelPackage
