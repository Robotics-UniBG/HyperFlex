/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.roscomponentmodel;

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
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelFactory
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
	String eNS_URI = "http://robotics.unibg.it/componentmodels.ros";

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
	roscomponentmodelPackage eINSTANCE = it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NODES = 0;

	/**
	 * The feature id for the '<em><b>Msg Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MSG_PRODUCERS = 1;

	/**
	 * The feature id for the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MSG_CONSUMERS = 2;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TOPICS = 3;

	/**
	 * The feature id for the '<em><b>Srv Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SRV_PRODUCERS = 4;

	/**
	 * The feature id for the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SRV_CONSUMERS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUB_PACKAGES = 7;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Msg Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_PRODUCERS = 0;

	/**
	 * The feature id for the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_CONSUMERS = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Srv Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_PRODUCERS = 3;

	/**
	 * The feature id for the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_CONSUMERS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.MsgProducerImpl <em>Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.MsgProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgProducer()
	 * @generated
	 */
	int MSG_PRODUCER = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_PRODUCER__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_PRODUCER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_PRODUCER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.MsgConsumerImpl <em>Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.MsgConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgConsumer()
	 * @generated
	 */
	int MSG_CONSUMER = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_CONSUMER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_CONSUMER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_CONSUMER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl <em>Node Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgProducer()
	 * @generated
	 */
	int NODE_MSG_PRODUCER = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__TARGET = MSG_PRODUCER__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__NAME = MSG_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__TOPIC_NAME = MSG_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER_FEATURE_COUNT = MSG_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl <em>Node Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgConsumer()
	 * @generated
	 */
	int NODE_MSG_CONSUMER = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__SOURCE = MSG_CONSUMER__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__NAME = MSG_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__TOPIC_NAME = MSG_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER_FEATURE_COUNT = MSG_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl <em>Package Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgProducer()
	 * @generated
	 */
	int PACKAGE_MSG_PRODUCER = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER__TARGET = MSG_PRODUCER__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER__NAME = MSG_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER__PROMOTE = MSG_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER_FEATURE_COUNT = MSG_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl <em>Package Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgConsumer()
	 * @generated
	 */
	int PACKAGE_MSG_CONSUMER = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER__SOURCE = MSG_CONSUMER__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER__NAME = MSG_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER__PROMOTE = MSG_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER_FEATURE_COUNT = MSG_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.TopicImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 8;

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
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.ParameterImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl <em>Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvProducer()
	 * @generated
	 */
	int SRV_PRODUCER = 10;

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
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl <em>Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvConsumer()
	 * @generated
	 */
	int SRV_CONSUMER = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl <em>Package Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvProducer()
	 * @generated
	 */
	int PACKAGE_SRV_PRODUCER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_PRODUCER__NAME = SRV_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_PRODUCER__PROMOTE = SRV_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_PRODUCER_FEATURE_COUNT = SRV_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl <em>Node Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvProducer()
	 * @generated
	 */
	int NODE_SRV_PRODUCER = 13;

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
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl <em>Package Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvConsumer()
	 * @generated
	 */
	int PACKAGE_SRV_CONSUMER = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER__TARGET = SRV_CONSUMER__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER__NAME = SRV_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER__PROMOTE = SRV_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER_FEATURE_COUNT = SRV_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl <em>Node Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvConsumer()
	 * @generated
	 */
	int NODE_SRV_CONSUMER = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER__TARGET = SRV_CONSUMER__TARGET;

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
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.WireImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SRV_NAME = 1;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getArchitectureModel()
	 * @generated
	 */
	int ARCHITECTURE_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getNodes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getMsgProducers <em>Msg Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getMsgProducers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_MsgProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getMsgConsumers <em>Msg Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getMsgConsumers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_MsgConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getTopics()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getSrvProducers <em>Srv Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getSrvProducers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SrvProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getSrvConsumers <em>Srv Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getSrvConsumers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SrvConsumers();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getSubPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SubPackages();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getMsgProducers <em>Msg Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getMsgProducers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_MsgProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getMsgConsumers <em>Msg Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getMsgConsumers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_MsgConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getParameters()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getSrvProducers <em>Srv Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getSrvProducers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getSrvConsumers <em>Srv Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getSrvConsumers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvConsumers();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.MsgProducer <em>Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgProducer
	 * @generated
	 */
	EClass getMsgProducer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.MsgProducer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgProducer#getTarget()
	 * @see #getMsgProducer()
	 * @generated
	 */
	EReference getMsgProducer_Target();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.MsgProducer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgProducer#getName()
	 * @see #getMsgProducer()
	 * @generated
	 */
	EAttribute getMsgProducer_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.MsgConsumer <em>Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgConsumer
	 * @generated
	 */
	EClass getMsgConsumer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.MsgConsumer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgConsumer#getSource()
	 * @see #getMsgConsumer()
	 * @generated
	 */
	EReference getMsgConsumer_Source();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.MsgConsumer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgConsumer#getName()
	 * @see #getMsgConsumer()
	 * @generated
	 */
	EAttribute getMsgConsumer_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgProducer <em>Node Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgProducer
	 * @generated
	 */
	EClass getNodeMsgProducer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeMsgProducer#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgProducer#getTopicName()
	 * @see #getNodeMsgProducer()
	 * @generated
	 */
	EAttribute getNodeMsgProducer_TopicName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgConsumer <em>Node Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgConsumer
	 * @generated
	 */
	EClass getNodeMsgConsumer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeMsgConsumer#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgConsumer#getTopicName()
	 * @see #getNodeMsgConsumer()
	 * @generated
	 */
	EAttribute getNodeMsgConsumer_TopicName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageMsgProducer <em>Package Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Msg Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgProducer
	 * @generated
	 */
	EClass getPackageMsgProducer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.PackageMsgProducer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgProducer#getPromote()
	 * @see #getPackageMsgProducer()
	 * @generated
	 */
	EReference getPackageMsgProducer_Promote();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageMsgConsumer <em>Package Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Msg Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgConsumer
	 * @generated
	 */
	EClass getPackageMsgConsumer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.PackageMsgConsumer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgConsumer#getPromote()
	 * @see #getPackageMsgConsumer()
	 * @generated
	 */
	EReference getPackageMsgConsumer_Promote();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.SrvProducer <em>Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvProducer
	 * @generated
	 */
	EClass getSrvProducer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.SrvProducer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvProducer#getName()
	 * @see #getSrvProducer()
	 * @generated
	 */
	EAttribute getSrvProducer_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.SrvConsumer <em>Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvConsumer
	 * @generated
	 */
	EClass getSrvConsumer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.SrvConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvConsumer#getTarget()
	 * @see #getSrvConsumer()
	 * @generated
	 */
	EReference getSrvConsumer_Target();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.SrvConsumer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvConsumer#getName()
	 * @see #getSrvConsumer()
	 * @generated
	 */
	EAttribute getSrvConsumer_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageSrvProducer <em>Package Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Srv Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvProducer
	 * @generated
	 */
	EClass getPackageSrvProducer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.PackageSrvProducer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvProducer#getPromote()
	 * @see #getPackageSrvProducer()
	 * @generated
	 */
	EReference getPackageSrvProducer_Promote();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeSrvProducer <em>Node Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvProducer
	 * @generated
	 */
	EClass getNodeSrvProducer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeSrvProducer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvProducer#getSrvName()
	 * @see #getNodeSrvProducer()
	 * @generated
	 */
	EAttribute getNodeSrvProducer_SrvName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageSrvConsumer <em>Package Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Srv Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvConsumer
	 * @generated
	 */
	EClass getPackageSrvConsumer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.PackageSrvConsumer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvConsumer#getPromote()
	 * @see #getPackageSrvConsumer()
	 * @generated
	 */
	EReference getPackageSrvConsumer_Promote();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeSrvConsumer <em>Node Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvConsumer
	 * @generated
	 */
	EClass getNodeSrvConsumer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeSrvConsumer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvConsumer#getSrvName()
	 * @see #getNodeSrvConsumer()
	 * @generated
	 */
	EAttribute getNodeSrvConsumer_SrvName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Wire#getSource()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Source();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Wire#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Wire#getSrvName()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_SrvName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Model</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.ArchitectureModel
	 * @generated
	 */
	EClass getArchitectureModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibg.robotics.roscomponentmodel.ArchitectureModel#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.ArchitectureModel#getPackage()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EReference getArchitectureModel_Package();

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
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NODES = eINSTANCE.getPackage_Nodes();

		/**
		 * The meta object literal for the '<em><b>Msg Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MSG_PRODUCERS = eINSTANCE.getPackage_MsgProducers();

		/**
		 * The meta object literal for the '<em><b>Msg Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MSG_CONSUMERS = eINSTANCE.getPackage_MsgConsumers();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TOPICS = eINSTANCE.getPackage_Topics();

		/**
		 * The meta object literal for the '<em><b>Srv Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SRV_PRODUCERS = eINSTANCE.getPackage_SrvProducers();

		/**
		 * The meta object literal for the '<em><b>Srv Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SRV_CONSUMERS = eINSTANCE.getPackage_SrvConsumers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUB_PACKAGES = eINSTANCE.getPackage_SubPackages();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNode()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.MsgProducerImpl <em>Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.MsgProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgProducer()
		 * @generated
		 */
		EClass MSG_PRODUCER = eINSTANCE.getMsgProducer();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_PRODUCER__TARGET = eINSTANCE.getMsgProducer_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_PRODUCER__NAME = eINSTANCE.getMsgProducer_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.MsgConsumerImpl <em>Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.MsgConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgConsumer()
		 * @generated
		 */
		EClass MSG_CONSUMER = eINSTANCE.getMsgConsumer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_CONSUMER__SOURCE = eINSTANCE.getMsgConsumer_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_CONSUMER__NAME = eINSTANCE.getMsgConsumer_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl <em>Node Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgProducer()
		 * @generated
		 */
		EClass NODE_MSG_PRODUCER = eINSTANCE.getNodeMsgProducer();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_MSG_PRODUCER__TOPIC_NAME = eINSTANCE.getNodeMsgProducer_TopicName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl <em>Node Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgConsumer()
		 * @generated
		 */
		EClass NODE_MSG_CONSUMER = eINSTANCE.getNodeMsgConsumer();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_MSG_CONSUMER__TOPIC_NAME = eINSTANCE.getNodeMsgConsumer_TopicName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl <em>Package Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgProducer()
		 * @generated
		 */
		EClass PACKAGE_MSG_PRODUCER = eINSTANCE.getPackageMsgProducer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSG_PRODUCER__PROMOTE = eINSTANCE.getPackageMsgProducer_Promote();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl <em>Package Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgConsumer()
		 * @generated
		 */
		EClass PACKAGE_MSG_CONSUMER = eINSTANCE.getPackageMsgConsumer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSG_CONSUMER__PROMOTE = eINSTANCE.getPackageMsgConsumer_Promote();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.TopicImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getTopic()
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
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.ParameterImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getParameter()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl <em>Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvProducer()
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
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl <em>Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvConsumer()
		 * @generated
		 */
		EClass SRV_CONSUMER = eINSTANCE.getSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CONSUMER__TARGET = eINSTANCE.getSrvConsumer_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_CONSUMER__NAME = eINSTANCE.getSrvConsumer_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl <em>Package Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvProducer()
		 * @generated
		 */
		EClass PACKAGE_SRV_PRODUCER = eINSTANCE.getPackageSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SRV_PRODUCER__PROMOTE = eINSTANCE.getPackageSrvProducer_Promote();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl <em>Node Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvProducer()
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
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl <em>Package Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvConsumer()
		 * @generated
		 */
		EClass PACKAGE_SRV_CONSUMER = eINSTANCE.getPackageSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SRV_CONSUMER__PROMOTE = eINSTANCE.getPackageSrvConsumer_Promote();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl <em>Node Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvConsumer()
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
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.WireImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getWire()
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
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__SRV_NAME = eINSTANCE.getWire_SrvName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getArchitectureModel()
		 * @generated
		 */
		EClass ARCHITECTURE_MODEL = eINSTANCE.getArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_MODEL__PACKAGE = eINSTANCE.getArchitectureModel_Package();

	}

} //roscomponentmodelPackage
