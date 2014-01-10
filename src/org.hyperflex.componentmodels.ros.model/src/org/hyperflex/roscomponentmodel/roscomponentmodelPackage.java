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
package org.hyperflex.roscomponentmodel;

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
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface roscomponentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roscomponentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hyperflex.org/componentmodels.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roscomponentmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	roscomponentmodelPackage eINSTANCE = org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.AbstractComponentImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 19;

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
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositeImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 0;

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
	 * The feature id for the '<em><b>Msg Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__MSG_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__MSG_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TOPICS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Srv Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SRV_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SRV_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__WIRES = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PROPERTIES = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodeImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Msg Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srv Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.MsgInterfaceImpl <em>Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.MsgInterfaceImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgInterface()
	 * @generated
	 */
	int MSG_INTERFACE = 16;

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
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodeMsgInterfaceImpl <em>Node Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodeMsgInterfaceImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgInterface()
	 * @generated
	 */
	int NODE_MSG_INTERFACE = 18;

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
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodeMsgProducerImpl <em>Node Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodeMsgProducerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgProducer()
	 * @generated
	 */
	int NODE_MSG_PRODUCER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__NAME = NODE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__CONNECTION = NODE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__TOPIC_NAME = NODE_MSG_INTERFACE__TOPIC_NAME;

	/**
	 * The number of structural features of the '<em>Node Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER_FEATURE_COUNT = NODE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodeMsgConsumerImpl <em>Node Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodeMsgConsumerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgConsumer()
	 * @generated
	 */
	int NODE_MSG_CONSUMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__NAME = NODE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__CONNECTION = NODE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__TOPIC_NAME = NODE_MSG_INTERFACE__TOPIC_NAME;

	/**
	 * The number of structural features of the '<em>Node Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER_FEATURE_COUNT = NODE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeMsgInterfaceImpl <em>Composite Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositeMsgInterfaceImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgInterface()
	 * @generated
	 */
	int COMPOSITE_MSG_INTERFACE = 17;

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
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeMsgProducerImpl <em>Composite Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositeMsgProducerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgProducer()
	 * @generated
	 */
	int COMPOSITE_MSG_PRODUCER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_PRODUCER__NAME = COMPOSITE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_PRODUCER__CONNECTION = COMPOSITE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_PRODUCER__EXPOSED = COMPOSITE_MSG_INTERFACE__EXPOSED;

	/**
	 * The number of structural features of the '<em>Composite Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_PRODUCER_FEATURE_COUNT = COMPOSITE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeMsgConsumerImpl <em>Composite Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositeMsgConsumerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgConsumer()
	 * @generated
	 */
	int COMPOSITE_MSG_CONSUMER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_CONSUMER__NAME = COMPOSITE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_CONSUMER__CONNECTION = COMPOSITE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_CONSUMER__EXPOSED = COMPOSITE_MSG_INTERFACE__EXPOSED;

	/**
	 * The number of structural features of the '<em>Composite Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_CONSUMER_FEATURE_COUNT = COMPOSITE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.TopicImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.PropertyImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.SrvProducerImpl <em>Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.SrvProducerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvProducer()
	 * @generated
	 */
	int SRV_PRODUCER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_PRODUCER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_PRODUCER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.SrvConsumerImpl <em>Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.SrvConsumerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvConsumer()
	 * @generated
	 */
	int SRV_CONSUMER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeSrvProducerImpl <em>Composite Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositeSrvProducerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeSrvProducer()
	 * @generated
	 */
	int COMPOSITE_SRV_PRODUCER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_PRODUCER__NAME = SRV_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_PRODUCER__PROMOTE = SRV_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_PRODUCER_FEATURE_COUNT = SRV_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodeSrvProducerImpl <em>Node Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodeSrvProducerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvProducer()
	 * @generated
	 */
	int NODE_SRV_PRODUCER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_PRODUCER__NAME = SRV_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_PRODUCER__SRV_NAME = SRV_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_PRODUCER_FEATURE_COUNT = SRV_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeSrvConsumerImpl <em>Composite Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositeSrvConsumerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeSrvConsumer()
	 * @generated
	 */
	int COMPOSITE_SRV_CONSUMER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CONSUMER__NAME = SRV_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CONSUMER__PROMOTE = SRV_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SRV_CONSUMER_FEATURE_COUNT = SRV_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodeSrvConsumerImpl <em>Node Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodeSrvConsumerImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvConsumer()
	 * @generated
	 */
	int NODE_SRV_CONSUMER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER__NAME = SRV_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER__SRV_NAME = SRV_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER_FEATURE_COUNT = SRV_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.WireImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SRV_NAME = 2;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.SystemImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPOSITE = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.NodePropertyImpl <em>Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.NodePropertyImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeProperty()
	 * @generated
	 */
	int NODE_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscomponentmodel.impl.CompositePropertyImpl <em>Composite Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscomponentmodel.impl.CompositePropertyImpl
	 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeProperty()
	 * @generated
	 */
	int COMPOSITE_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROPERTY__EXPOSED = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getComponents()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getMsgProducers <em>Msg Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Producers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getMsgProducers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_MsgProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getMsgConsumers <em>Msg Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Consumers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getMsgConsumers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_MsgConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getTopics()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getSrvProducers <em>Srv Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Producers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getSrvProducers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_SrvProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getSrvConsumers <em>Srv Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Consumers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getSrvConsumers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_SrvConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wires</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getWires()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Wires();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Composite#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.hyperflex.roscomponentmodel.Composite#getProperties()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Properties();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Node#getMsgProducers <em>Msg Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Producers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getMsgProducers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_MsgProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Node#getMsgConsumers <em>Msg Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Consumers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getMsgConsumers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_MsgConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Node#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getParameters()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Node#getSrvProducers <em>Srv Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Producers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getSrvProducers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.roscomponentmodel.Node#getSrvConsumers <em>Srv Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Consumers</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getSrvConsumers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvConsumers();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.Node#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getPackageName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.roscomponentmodel.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.NodeMsgProducer <em>Node Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Producer</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgProducer
	 * @generated
	 */
	EClass getNodeMsgProducer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.NodeMsgConsumer <em>Node Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Consumer</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgConsumer
	 * @generated
	 */
	EClass getNodeMsgConsumer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.CompositeMsgProducer <em>Composite Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Msg Producer</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgProducer
	 * @generated
	 */
	EClass getCompositeMsgProducer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.CompositeMsgConsumer <em>Composite Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Msg Consumer</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgConsumer
	 * @generated
	 */
	EClass getCompositeMsgConsumer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see org.hyperflex.roscomponentmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.hyperflex.roscomponentmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.SrvProducer <em>Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Producer</em>'.
	 * @see org.hyperflex.roscomponentmodel.SrvProducer
	 * @generated
	 */
	EClass getSrvProducer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.SrvProducer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.SrvProducer#getName()
	 * @see #getSrvProducer()
	 * @generated
	 */
	EAttribute getSrvProducer_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.SrvConsumer <em>Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Consumer</em>'.
	 * @see org.hyperflex.roscomponentmodel.SrvConsumer
	 * @generated
	 */
	EClass getSrvConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.SrvConsumer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.SrvConsumer#getName()
	 * @see #getSrvConsumer()
	 * @generated
	 */
	EAttribute getSrvConsumer_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.CompositeSrvProducer <em>Composite Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Srv Producer</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeSrvProducer
	 * @generated
	 */
	EClass getCompositeSrvProducer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.CompositeSrvProducer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeSrvProducer#getPromote()
	 * @see #getCompositeSrvProducer()
	 * @generated
	 */
	EReference getCompositeSrvProducer_Promote();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.NodeSrvProducer <em>Node Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Producer</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeSrvProducer
	 * @generated
	 */
	EClass getNodeSrvProducer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.NodeSrvProducer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeSrvProducer#getSrvName()
	 * @see #getNodeSrvProducer()
	 * @generated
	 */
	EAttribute getNodeSrvProducer_SrvName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.CompositeSrvConsumer <em>Composite Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Srv Consumer</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeSrvConsumer
	 * @generated
	 */
	EClass getCompositeSrvConsumer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.CompositeSrvConsumer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeSrvConsumer#getPromote()
	 * @see #getCompositeSrvConsumer()
	 * @generated
	 */
	EReference getCompositeSrvConsumer_Promote();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.NodeSrvConsumer <em>Node Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Consumer</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeSrvConsumer
	 * @generated
	 */
	EClass getNodeSrvConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.NodeSrvConsumer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeSrvConsumer#getSrvName()
	 * @see #getNodeSrvConsumer()
	 * @generated
	 */
	EAttribute getNodeSrvConsumer_SrvName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see org.hyperflex.roscomponentmodel.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.hyperflex.roscomponentmodel.Wire#getSource()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Source();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.Wire#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.hyperflex.roscomponentmodel.Wire#getTarget()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.Wire#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.Wire#getSrvName()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_SrvName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.hyperflex.roscomponentmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.roscomponentmodel.System#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite</em>'.
	 * @see org.hyperflex.roscomponentmodel.System#getComposite()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Composite();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.MsgInterface <em>Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Interface</em>'.
	 * @see org.hyperflex.roscomponentmodel.MsgInterface
	 * @generated
	 */
	EClass getMsgInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.MsgInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.MsgInterface#getName()
	 * @see #getMsgInterface()
	 * @generated
	 */
	EAttribute getMsgInterface_Name();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.MsgInterface#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see org.hyperflex.roscomponentmodel.MsgInterface#getConnection()
	 * @see #getMsgInterface()
	 * @generated
	 */
	EReference getMsgInterface_Connection();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.CompositeMsgInterface <em>Composite Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Msg Interface</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgInterface
	 * @generated
	 */
	EClass getCompositeMsgInterface();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.CompositeMsgInterface#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgInterface#getExposed()
	 * @see #getCompositeMsgInterface()
	 * @generated
	 */
	EReference getCompositeMsgInterface_Exposed();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.NodeMsgInterface <em>Node Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Interface</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgInterface
	 * @generated
	 */
	EClass getNodeMsgInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.NodeMsgInterface#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgInterface#getTopicName()
	 * @see #getNodeMsgInterface()
	 * @generated
	 */
	EAttribute getNodeMsgInterface_TopicName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.hyperflex.roscomponentmodel.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.AbstractComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.roscomponentmodel.AbstractComponent#getName()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.NodeProperty <em>Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Property</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeProperty
	 * @generated
	 */
	EClass getNodeProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.NodeProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeProperty#getValue()
	 * @see #getNodeProperty()
	 * @generated
	 */
	EAttribute getNodeProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.roscomponentmodel.NodeProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.roscomponentmodel.NodeProperty#getType()
	 * @see #getNodeProperty()
	 * @generated
	 */
	EAttribute getNodeProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscomponentmodel.CompositeProperty <em>Composite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Property</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeProperty
	 * @generated
	 */
	EClass getCompositeProperty();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscomponentmodel.CompositeProperty#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see org.hyperflex.roscomponentmodel.CompositeProperty#getExposed()
	 * @see #getCompositeProperty()
	 * @generated
	 */
	EReference getCompositeProperty_Exposed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	roscomponentmodelFactory getroscomponentmodelFactory();

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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositeImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getComposite()
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
		 * The meta object literal for the '<em><b>Msg Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__MSG_PRODUCERS = eINSTANCE.getComposite_MsgProducers();

		/**
		 * The meta object literal for the '<em><b>Msg Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__MSG_CONSUMERS = eINSTANCE.getComposite_MsgConsumers();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__TOPICS = eINSTANCE.getComposite_Topics();

		/**
		 * The meta object literal for the '<em><b>Srv Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SRV_PRODUCERS = eINSTANCE.getComposite_SrvProducers();

		/**
		 * The meta object literal for the '<em><b>Srv Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SRV_CONSUMERS = eINSTANCE.getComposite_SrvConsumers();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__WIRES = eINSTANCE.getComposite_Wires();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PROPERTIES = eINSTANCE.getComposite_Properties();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodeImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Msg Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MSG_PRODUCERS = eINSTANCE.getNode_MsgProducers();

		/**
		 * The meta object literal for the '<em><b>Msg Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MSG_CONSUMERS = eINSTANCE.getNode_MsgConsumers();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETERS = eINSTANCE.getNode_Parameters();

		/**
		 * The meta object literal for the '<em><b>Srv Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SRV_PRODUCERS = eINSTANCE.getNode_SrvProducers();

		/**
		 * The meta object literal for the '<em><b>Srv Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SRV_CONSUMERS = eINSTANCE.getNode_SrvConsumers();

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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodeMsgProducerImpl <em>Node Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodeMsgProducerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgProducer()
		 * @generated
		 */
		EClass NODE_MSG_PRODUCER = eINSTANCE.getNodeMsgProducer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodeMsgConsumerImpl <em>Node Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodeMsgConsumerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgConsumer()
		 * @generated
		 */
		EClass NODE_MSG_CONSUMER = eINSTANCE.getNodeMsgConsumer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeMsgProducerImpl <em>Composite Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositeMsgProducerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgProducer()
		 * @generated
		 */
		EClass COMPOSITE_MSG_PRODUCER = eINSTANCE.getCompositeMsgProducer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeMsgConsumerImpl <em>Composite Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositeMsgConsumerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgConsumer()
		 * @generated
		 */
		EClass COMPOSITE_MSG_CONSUMER = eINSTANCE.getCompositeMsgConsumer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.TopicImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getTopic()
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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.PropertyImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.SrvProducerImpl <em>Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.SrvProducerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvProducer()
		 * @generated
		 */
		EClass SRV_PRODUCER = eINSTANCE.getSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_PRODUCER__NAME = eINSTANCE.getSrvProducer_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.SrvConsumerImpl <em>Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.SrvConsumerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvConsumer()
		 * @generated
		 */
		EClass SRV_CONSUMER = eINSTANCE.getSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_CONSUMER__NAME = eINSTANCE.getSrvConsumer_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeSrvProducerImpl <em>Composite Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositeSrvProducerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeSrvProducer()
		 * @generated
		 */
		EClass COMPOSITE_SRV_PRODUCER = eINSTANCE.getCompositeSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SRV_PRODUCER__PROMOTE = eINSTANCE.getCompositeSrvProducer_Promote();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodeSrvProducerImpl <em>Node Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodeSrvProducerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvProducer()
		 * @generated
		 */
		EClass NODE_SRV_PRODUCER = eINSTANCE.getNodeSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SRV_PRODUCER__SRV_NAME = eINSTANCE.getNodeSrvProducer_SrvName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeSrvConsumerImpl <em>Composite Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositeSrvConsumerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeSrvConsumer()
		 * @generated
		 */
		EClass COMPOSITE_SRV_CONSUMER = eINSTANCE.getCompositeSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SRV_CONSUMER__PROMOTE = eINSTANCE.getCompositeSrvConsumer_Promote();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodeSrvConsumerImpl <em>Node Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodeSrvConsumerImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvConsumer()
		 * @generated
		 */
		EClass NODE_SRV_CONSUMER = eINSTANCE.getNodeSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SRV_CONSUMER__SRV_NAME = eINSTANCE.getNodeSrvConsumer_SrvName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.WireImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__SOURCE = eINSTANCE.getWire_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__TARGET = eINSTANCE.getWire_Target();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__SRV_NAME = eINSTANCE.getWire_SrvName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.SystemImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPOSITE = eINSTANCE.getSystem_Composite();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.MsgInterfaceImpl <em>Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.MsgInterfaceImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgInterface()
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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositeMsgInterfaceImpl <em>Composite Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositeMsgInterfaceImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgInterface()
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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodeMsgInterfaceImpl <em>Node Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodeMsgInterfaceImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgInterface()
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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.AbstractComponentImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getAbstractComponent()
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
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.NodePropertyImpl <em>Node Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.NodePropertyImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeProperty()
		 * @generated
		 */
		EClass NODE_PROPERTY = eINSTANCE.getNodeProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PROPERTY__VALUE = eINSTANCE.getNodeProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PROPERTY__TYPE = eINSTANCE.getNodeProperty_Type();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscomponentmodel.impl.CompositePropertyImpl <em>Composite Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscomponentmodel.impl.CompositePropertyImpl
		 * @see org.hyperflex.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeProperty()
		 * @generated
		 */
		EClass COMPOSITE_PROPERTY = eINSTANCE.getCompositeProperty();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROPERTY__EXPOSED = eINSTANCE.getCompositeProperty_Exposed();

	}

} //roscomponentmodelPackage
