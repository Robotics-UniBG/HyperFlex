/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
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
package org.hyperflex.roscompositionmodel;

import org.hyperflex.compositionmodel.compositionmodelPackage;

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
 * @see org.hyperflex.roscompositionmodel.roscompositionmodelFactory
 * @model kind="package"
 * @generated
 */
public interface roscompositionmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roscompositionmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robotics.unibg.it/compositionmodels.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roscompositionmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	roscompositionmodelPackage eINSTANCE = org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.ROSCompositeImpl <em>ROS Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.ROSCompositeImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSComposite()
	 * @generated
	 */
	int ROS_COMPOSITE = 0;

	/**
	 * The feature id for the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPOSITE__PROV_INTERFACES = compositionmodelPackage.COMPOSITE__PROV_INTERFACES;

	/**
	 * The feature id for the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPOSITE__REQ_INTERFACES = compositionmodelPackage.COMPOSITE__REQ_INTERFACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPOSITE__NAME = compositionmodelPackage.COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPOSITE__COMPOSITE = compositionmodelPackage.COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPOSITE_FEATURE_COUNT = compositionmodelPackage.COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.ROSMsgProducerImpl <em>ROS Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.ROSMsgProducerImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSMsgProducer()
	 * @generated
	 */
	int ROS_MSG_PRODUCER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_PRODUCER__NAME = compositionmodelPackage.COMP_PROVIDED_INTERF__NAME;

	/**
	 * The feature id for the '<em><b>Msg Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_PRODUCER__MSG_PRODUCER = compositionmodelPackage.COMP_PROVIDED_INTERF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_PRODUCER_FEATURE_COUNT = compositionmodelPackage.COMP_PROVIDED_INTERF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.ROSMsgConsumerImpl <em>ROS Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.ROSMsgConsumerImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSMsgConsumer()
	 * @generated
	 */
	int ROS_MSG_CONSUMER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_CONSUMER__NAME = compositionmodelPackage.COMP_REQUIRED_INTERF__NAME;

	/**
	 * The feature id for the '<em><b>Msg Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_CONSUMER__MSG_CONSUMER = compositionmodelPackage.COMP_REQUIRED_INTERF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_CONSUMER_FEATURE_COUNT = compositionmodelPackage.COMP_REQUIRED_INTERF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.ROSSrvProducerImpl <em>ROS Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.ROSSrvProducerImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSSrvProducer()
	 * @generated
	 */
	int ROS_SRV_PRODUCER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_PRODUCER__NAME = compositionmodelPackage.COMP_PROVIDED_INTERF__NAME;

	/**
	 * The feature id for the '<em><b>Srv Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_PRODUCER__SRV_PRODUCER = compositionmodelPackage.COMP_PROVIDED_INTERF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_PRODUCER_FEATURE_COUNT = compositionmodelPackage.COMP_PROVIDED_INTERF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.ROSSrvConsumerImpl <em>ROS Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.ROSSrvConsumerImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSSrvConsumer()
	 * @generated
	 */
	int ROS_SRV_CONSUMER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CONSUMER__NAME = compositionmodelPackage.COMP_REQUIRED_INTERF__NAME;

	/**
	 * The feature id for the '<em><b>Srv Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CONSUMER__SRV_CONSUMER = compositionmodelPackage.COMP_REQUIRED_INTERF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SRV_CONSUMER_FEATURE_COUNT = compositionmodelPackage.COMP_REQUIRED_INTERF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.RosTopicImpl <em>Ros Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.RosTopicImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getRosTopic()
	 * @generated
	 */
	int ROS_TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC__SOURCE = compositionmodelPackage.CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC__TARGET = compositionmodelPackage.CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC__NAME = compositionmodelPackage.CONNECTION__NAME;

	/**
	 * The number of structural features of the '<em>Ros Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_FEATURE_COUNT = compositionmodelPackage.CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.roscompositionmodel.impl.ROSPropertyImpl <em>ROS Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.roscompositionmodel.impl.ROSPropertyImpl
	 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSProperty()
	 * @generated
	 */
	int ROS_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PROPERTY__PROPERTY = compositionmodelPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PROPERTY_FEATURE_COUNT = compositionmodelPackage.PROPERTY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.ROSComposite <em>ROS Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Composite</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSComposite
	 * @generated
	 */
	EClass getROSComposite();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscompositionmodel.ROSComposite#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSComposite#getComposite()
	 * @see #getROSComposite()
	 * @generated
	 */
	EReference getROSComposite_Composite();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.ROSMsgProducer <em>ROS Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Msg Producer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSMsgProducer
	 * @generated
	 */
	EClass getROSMsgProducer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscompositionmodel.ROSMsgProducer#getMsgProducer <em>Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msg Producer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSMsgProducer#getMsgProducer()
	 * @see #getROSMsgProducer()
	 * @generated
	 */
	EReference getROSMsgProducer_MsgProducer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.ROSMsgConsumer <em>ROS Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Msg Consumer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSMsgConsumer
	 * @generated
	 */
	EClass getROSMsgConsumer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscompositionmodel.ROSMsgConsumer#getMsgConsumer <em>Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msg Consumer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSMsgConsumer#getMsgConsumer()
	 * @see #getROSMsgConsumer()
	 * @generated
	 */
	EReference getROSMsgConsumer_MsgConsumer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.ROSSrvProducer <em>ROS Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Srv Producer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSSrvProducer
	 * @generated
	 */
	EClass getROSSrvProducer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscompositionmodel.ROSSrvProducer#getSrvProducer <em>Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Producer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSSrvProducer#getSrvProducer()
	 * @see #getROSSrvProducer()
	 * @generated
	 */
	EReference getROSSrvProducer_SrvProducer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.ROSSrvConsumer <em>ROS Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Srv Consumer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSSrvConsumer
	 * @generated
	 */
	EClass getROSSrvConsumer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscompositionmodel.ROSSrvConsumer#getSrvConsumer <em>Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Consumer</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSSrvConsumer#getSrvConsumer()
	 * @see #getROSSrvConsumer()
	 * @generated
	 */
	EReference getROSSrvConsumer_SrvConsumer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.RosTopic <em>Ros Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Topic</em>'.
	 * @see org.hyperflex.roscompositionmodel.RosTopic
	 * @generated
	 */
	EClass getRosTopic();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.roscompositionmodel.ROSProperty <em>ROS Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Property</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSProperty
	 * @generated
	 */
	EClass getROSProperty();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.roscompositionmodel.ROSProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.hyperflex.roscompositionmodel.ROSProperty#getProperty()
	 * @see #getROSProperty()
	 * @generated
	 */
	EReference getROSProperty_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	roscompositionmodelFactory getroscompositionmodelFactory();

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
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.ROSCompositeImpl <em>ROS Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.ROSCompositeImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSComposite()
		 * @generated
		 */
		EClass ROS_COMPOSITE = eINSTANCE.getROSComposite();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_COMPOSITE__COMPOSITE = eINSTANCE.getROSComposite_Composite();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.ROSMsgProducerImpl <em>ROS Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.ROSMsgProducerImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSMsgProducer()
		 * @generated
		 */
		EClass ROS_MSG_PRODUCER = eINSTANCE.getROSMsgProducer();

		/**
		 * The meta object literal for the '<em><b>Msg Producer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_PRODUCER__MSG_PRODUCER = eINSTANCE.getROSMsgProducer_MsgProducer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.ROSMsgConsumerImpl <em>ROS Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.ROSMsgConsumerImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSMsgConsumer()
		 * @generated
		 */
		EClass ROS_MSG_CONSUMER = eINSTANCE.getROSMsgConsumer();

		/**
		 * The meta object literal for the '<em><b>Msg Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_CONSUMER__MSG_CONSUMER = eINSTANCE.getROSMsgConsumer_MsgConsumer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.ROSSrvProducerImpl <em>ROS Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.ROSSrvProducerImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSSrvProducer()
		 * @generated
		 */
		EClass ROS_SRV_PRODUCER = eINSTANCE.getROSSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Srv Producer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SRV_PRODUCER__SRV_PRODUCER = eINSTANCE.getROSSrvProducer_SrvProducer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.ROSSrvConsumerImpl <em>ROS Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.ROSSrvConsumerImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSSrvConsumer()
		 * @generated
		 */
		EClass ROS_SRV_CONSUMER = eINSTANCE.getROSSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Srv Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SRV_CONSUMER__SRV_CONSUMER = eINSTANCE.getROSSrvConsumer_SrvConsumer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.RosTopicImpl <em>Ros Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.RosTopicImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getRosTopic()
		 * @generated
		 */
		EClass ROS_TOPIC = eINSTANCE.getRosTopic();

		/**
		 * The meta object literal for the '{@link org.hyperflex.roscompositionmodel.impl.ROSPropertyImpl <em>ROS Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.roscompositionmodel.impl.ROSPropertyImpl
		 * @see org.hyperflex.roscompositionmodel.impl.roscompositionmodelPackageImpl#getROSProperty()
		 * @generated
		 */
		EClass ROS_PROPERTY = eINSTANCE.getROSProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PROPERTY__PROPERTY = eINSTANCE.getROSProperty_Property();

	}

} //roscompositionmodelPackage
