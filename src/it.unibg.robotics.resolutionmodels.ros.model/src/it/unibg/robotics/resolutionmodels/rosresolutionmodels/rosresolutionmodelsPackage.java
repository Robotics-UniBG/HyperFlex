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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels;

import it.unibg.robotics.resolutionmodels.resolutionmodelsPackage;

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
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory
 * @model kind="package"
 * @generated
 */
public interface rosresolutionmodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rosresolutionmodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robotics.unibg.it/resolutionmodels.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rosresolutionmodelsPackage eINSTANCE = it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl <em>ROS Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfImplementation()
	 * @generated
	 */
	int ROS_TRANSF_IMPLEMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_IMPLEMENTATION__NAME = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_IMPLEMENTATION__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_IMPLEMENTATION__CLASS_NAME = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_IMPLEMENTATION__TARGET_NODE = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Transf Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_IMPLEMENTATION_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl <em>ROS Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfProperty()
	 * @generated
	 */
	int ROS_TRANSF_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_PROPERTY__NAME = resolutionmodelsPackage.RM_TRANSF_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_PROPERTY__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_PROPERTY__VALUE = resolutionmodelsPackage.RM_TRANSF_PROPERTY__VALUE;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_PROPERTY__TARGET_PROPERTY = resolutionmodelsPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Transf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_PROPERTY_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl <em>ROS Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfConnection()
	 * @generated
	 */
	int ROS_TRANSF_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_CONNECTION__NAME = resolutionmodelsPackage.RM_TRANSF_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_CONNECTION__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>New Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_CONNECTION__NEW_CONNECTIONS = resolutionmodelsPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Transf Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TRANSF_CONNECTION_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSAbstractConnectionImpl <em>ROS Abstract Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSAbstractConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSAbstractConnection()
	 * @generated
	 */
	int ROS_ABSTRACT_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ABSTRACT_CONNECTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>ROS Abstract Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ABSTRACT_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl <em>ROS Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTopicConnection()
	 * @generated
	 */
	int ROS_TOPIC_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION__NAME = ROS_ABSTRACT_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION__PUBLISHER = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION__SUBSCRIBER = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION_FEATURE_COUNT = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewTopicConnectionImpl <em>ROS New Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewTopicConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSNewTopicConnection()
	 * @generated
	 */
	int ROS_NEW_TOPIC_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_TOPIC_CONNECTION__NAME = ROS_TOPIC_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_TOPIC_CONNECTION__PUBLISHER = ROS_TOPIC_CONNECTION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_TOPIC_CONNECTION__SUBSCRIBER = ROS_TOPIC_CONNECTION__SUBSCRIBER;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_TOPIC_CONNECTION__TOPIC_NAME = ROS_TOPIC_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS New Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_TOPIC_CONNECTION_FEATURE_COUNT = ROS_TOPIC_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingTopicConnectionImpl <em>ROS Existing Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingTopicConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSExistingTopicConnection()
	 * @generated
	 */
	int ROS_EXISTING_TOPIC_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_TOPIC_CONNECTION__NAME = ROS_TOPIC_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_TOPIC_CONNECTION__PUBLISHER = ROS_TOPIC_CONNECTION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_TOPIC_CONNECTION__SUBSCRIBER = ROS_TOPIC_CONNECTION__SUBSCRIBER;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_TOPIC_CONNECTION__TOPIC = ROS_TOPIC_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Existing Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_TOPIC_CONNECTION_FEATURE_COUNT = ROS_TOPIC_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl <em>ROS Service Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSServiceConnection()
	 * @generated
	 */
	int ROS_SERVICE_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION__NAME = ROS_ABSTRACT_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Service Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION__SERVICE_SERVER = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION__SERVICE_CLIENT = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION_FEATURE_COUNT = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewServiceConnectionImpl <em>ROS New Service Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewServiceConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSNewServiceConnection()
	 * @generated
	 */
	int ROS_NEW_SERVICE_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_SERVICE_CONNECTION__NAME = ROS_SERVICE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Service Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER = ROS_SERVICE_CONNECTION__SERVICE_SERVER;

	/**
	 * The feature id for the '<em><b>Service Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT = ROS_SERVICE_CONNECTION__SERVICE_CLIENT;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME = ROS_SERVICE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS New Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_SERVICE_CONNECTION_FEATURE_COUNT = ROS_SERVICE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingServiceConnectionImpl <em>ROS Existing Service Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingServiceConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSExistingServiceConnection()
	 * @generated
	 */
	int ROS_EXISTING_SERVICE_CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_SERVICE_CONNECTION__NAME = ROS_SERVICE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Service Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_SERVICE_CONNECTION__SERVICE_SERVER = ROS_SERVICE_CONNECTION__SERVICE_SERVER;

	/**
	 * The feature id for the '<em><b>Service Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_SERVICE_CONNECTION__SERVICE_CLIENT = ROS_SERVICE_CONNECTION__SERVICE_CLIENT;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_SERVICE_CONNECTION__SERVICE = ROS_SERVICE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Existing Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_SERVICE_CONNECTION_FEATURE_COUNT = ROS_SERVICE_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSActionConnectionImpl <em>ROS Action Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSActionConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSActionConnection()
	 * @generated
	 */
	int ROS_ACTION_CONNECTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CONNECTION__NAME = ROS_ABSTRACT_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CONNECTION__ACTION_SERVER = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CONNECTION__ACTION_CLIENT = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CONNECTION_FEATURE_COUNT = ROS_ABSTRACT_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewActionConnectionImpl <em>ROS New Action Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewActionConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSNewActionConnection()
	 * @generated
	 */
	int ROS_NEW_ACTION_CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_ACTION_CONNECTION__NAME = ROS_ACTION_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_ACTION_CONNECTION__ACTION_SERVER = ROS_ACTION_CONNECTION__ACTION_SERVER;

	/**
	 * The feature id for the '<em><b>Action Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT = ROS_ACTION_CONNECTION__ACTION_CLIENT;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_ACTION_CONNECTION__ACTION_NAME = ROS_ACTION_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS New Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NEW_ACTION_CONNECTION_FEATURE_COUNT = ROS_ACTION_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingActionConnectionImpl <em>ROS Existing Action Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingActionConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSExistingActionConnection()
	 * @generated
	 */
	int ROS_EXISTING_ACTION_CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_ACTION_CONNECTION__NAME = ROS_ACTION_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Action Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_ACTION_CONNECTION__ACTION_SERVER = ROS_ACTION_CONNECTION__ACTION_SERVER;

	/**
	 * The feature id for the '<em><b>Action Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_ACTION_CONNECTION__ACTION_CLIENT = ROS_ACTION_CONNECTION__ACTION_CLIENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_ACTION_CONNECTION__ACTION = ROS_ACTION_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Existing Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_EXISTING_ACTION_CONNECTION_FEATURE_COUNT = ROS_ACTION_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredComponentsImpl <em>ROS Required Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredComponentsImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSRequiredComponents()
	 * @generated
	 */
	int ROS_REQUIRED_COMPONENTS = 13;

	/**
	 * The feature id for the '<em><b>ROS Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_COMPONENTS__ROS_NODES = resolutionmodelsPackage.RM_REQUIRED_COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Required Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_COMPONENTS_FEATURE_COUNT = resolutionmodelsPackage.RM_REQUIRED_COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl <em>ROS Required Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSRequiredConnections()
	 * @generated
	 */
	int ROS_REQUIRED_CONNECTIONS = 14;

	/**
	 * The feature id for the '<em><b>Required Existing Topic Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS = resolutionmodelsPackage.RM_REQUIRED_CONNECTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Existing Service Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS = resolutionmodelsPackage.RM_REQUIRED_CONNECTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Existing Action Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS = resolutionmodelsPackage.RM_REQUIRED_CONNECTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROS Required Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_CONNECTIONS_FEATURE_COUNT = resolutionmodelsPackage.RM_REQUIRED_CONNECTIONS_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation <em>ROS Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Transf Implementation</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation
	 * @generated
	 */
	EClass getROSTransfImplementation();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation#getTargetNode()
	 * @see #getROSTransfImplementation()
	 * @generated
	 */
	EReference getROSTransfImplementation_TargetNode();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty <em>ROS Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Transf Property</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty
	 * @generated
	 */
	EClass getROSTransfProperty();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty#getTargetProperty()
	 * @see #getROSTransfProperty()
	 * @generated
	 */
	EReference getROSTransfProperty_TargetProperty();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection <em>ROS Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Transf Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection
	 * @generated
	 */
	EClass getROSTransfConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection#getNewConnections <em>New Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection#getNewConnections()
	 * @see #getROSTransfConnection()
	 * @generated
	 */
	EReference getROSTransfConnection_NewConnections();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection <em>ROS Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Abstract Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection
	 * @generated
	 */
	EClass getROSAbstractConnection();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection#getName()
	 * @see #getROSAbstractConnection()
	 * @generated
	 */
	EAttribute getROSAbstractConnection_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection <em>ROS Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Topic Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection
	 * @generated
	 */
	EClass getROSTopicConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getPublisher()
	 * @see #getROSTopicConnection()
	 * @generated
	 */
	EReference getROSTopicConnection_Publisher();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getSubscriber()
	 * @see #getROSTopicConnection()
	 * @generated
	 */
	EReference getROSTopicConnection_Subscriber();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection <em>ROS New Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS New Topic Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection
	 * @generated
	 */
	EClass getROSNewTopicConnection();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection#getTopicName()
	 * @see #getROSNewTopicConnection()
	 * @generated
	 */
	EAttribute getROSNewTopicConnection_TopicName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection <em>ROS Existing Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Existing Topic Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection
	 * @generated
	 */
	EClass getROSExistingTopicConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection#getTopic()
	 * @see #getROSExistingTopicConnection()
	 * @generated
	 */
	EReference getROSExistingTopicConnection_Topic();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection <em>ROS Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Service Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection
	 * @generated
	 */
	EClass getROSServiceConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Server</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceServer()
	 * @see #getROSServiceConnection()
	 * @generated
	 */
	EReference getROSServiceConnection_ServiceServer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Client</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceClient()
	 * @see #getROSServiceConnection()
	 * @generated
	 */
	EReference getROSServiceConnection_ServiceClient();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection <em>ROS New Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS New Service Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection
	 * @generated
	 */
	EClass getROSNewServiceConnection();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection#getServiceName()
	 * @see #getROSNewServiceConnection()
	 * @generated
	 */
	EAttribute getROSNewServiceConnection_ServiceName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection <em>ROS Existing Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Existing Service Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection
	 * @generated
	 */
	EClass getROSExistingServiceConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection#getService()
	 * @see #getROSExistingServiceConnection()
	 * @generated
	 */
	EReference getROSExistingServiceConnection_Service();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection <em>ROS Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Action Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection
	 * @generated
	 */
	EClass getROSActionConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionServer <em>Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Server</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionServer()
	 * @see #getROSActionConnection()
	 * @generated
	 */
	EReference getROSActionConnection_ActionServer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionClient <em>Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Client</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionClient()
	 * @see #getROSActionConnection()
	 * @generated
	 */
	EReference getROSActionConnection_ActionClient();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection <em>ROS New Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS New Action Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection
	 * @generated
	 */
	EClass getROSNewActionConnection();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection#getActionName()
	 * @see #getROSNewActionConnection()
	 * @generated
	 */
	EAttribute getROSNewActionConnection_ActionName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection <em>ROS Existing Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Existing Action Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection
	 * @generated
	 */
	EClass getROSExistingActionConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection#getAction()
	 * @see #getROSExistingActionConnection()
	 * @generated
	 */
	EReference getROSExistingActionConnection_Action();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents <em>ROS Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Required Components</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents
	 * @generated
	 */
	EClass getROSRequiredComponents();

	/**
	 * Returns the meta object for the reference list '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents#getROSNodes <em>ROS Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ROS Nodes</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents#getROSNodes()
	 * @see #getROSRequiredComponents()
	 * @generated
	 */
	EReference getROSRequiredComponents_ROSNodes();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections <em>ROS Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Required Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections
	 * @generated
	 */
	EClass getROSRequiredConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingTopicConnections <em>Required Existing Topic Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Existing Topic Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingTopicConnections()
	 * @see #getROSRequiredConnections()
	 * @generated
	 */
	EReference getROSRequiredConnections_RequiredExistingTopicConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingServiceConnections <em>Required Existing Service Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Existing Service Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingServiceConnections()
	 * @see #getROSRequiredConnections()
	 * @generated
	 */
	EReference getROSRequiredConnections_RequiredExistingServiceConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingActionConnections <em>Required Existing Action Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Existing Action Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingActionConnections()
	 * @see #getROSRequiredConnections()
	 * @generated
	 */
	EReference getROSRequiredConnections_RequiredExistingActionConnections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	rosresolutionmodelsFactory getrosresolutionmodelsFactory();

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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl <em>ROS Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfImplementation()
		 * @generated
		 */
		EClass ROS_TRANSF_IMPLEMENTATION = eINSTANCE.getROSTransfImplementation();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TRANSF_IMPLEMENTATION__TARGET_NODE = eINSTANCE.getROSTransfImplementation_TargetNode();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl <em>ROS Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfProperty()
		 * @generated
		 */
		EClass ROS_TRANSF_PROPERTY = eINSTANCE.getROSTransfProperty();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TRANSF_PROPERTY__TARGET_PROPERTY = eINSTANCE.getROSTransfProperty_TargetProperty();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl <em>ROS Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfConnection()
		 * @generated
		 */
		EClass ROS_TRANSF_CONNECTION = eINSTANCE.getROSTransfConnection();

		/**
		 * The meta object literal for the '<em><b>New Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TRANSF_CONNECTION__NEW_CONNECTIONS = eINSTANCE.getROSTransfConnection_NewConnections();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSAbstractConnectionImpl <em>ROS Abstract Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSAbstractConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSAbstractConnection()
		 * @generated
		 */
		EClass ROS_ABSTRACT_CONNECTION = eINSTANCE.getROSAbstractConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_ABSTRACT_CONNECTION__NAME = eINSTANCE.getROSAbstractConnection_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl <em>ROS Topic Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTopicConnection()
		 * @generated
		 */
		EClass ROS_TOPIC_CONNECTION = eINSTANCE.getROSTopicConnection();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TOPIC_CONNECTION__PUBLISHER = eINSTANCE.getROSTopicConnection_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TOPIC_CONNECTION__SUBSCRIBER = eINSTANCE.getROSTopicConnection_Subscriber();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewTopicConnectionImpl <em>ROS New Topic Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewTopicConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSNewTopicConnection()
		 * @generated
		 */
		EClass ROS_NEW_TOPIC_CONNECTION = eINSTANCE.getROSNewTopicConnection();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NEW_TOPIC_CONNECTION__TOPIC_NAME = eINSTANCE.getROSNewTopicConnection_TopicName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingTopicConnectionImpl <em>ROS Existing Topic Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingTopicConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSExistingTopicConnection()
		 * @generated
		 */
		EClass ROS_EXISTING_TOPIC_CONNECTION = eINSTANCE.getROSExistingTopicConnection();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_EXISTING_TOPIC_CONNECTION__TOPIC = eINSTANCE.getROSExistingTopicConnection_Topic();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl <em>ROS Service Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSServiceConnection()
		 * @generated
		 */
		EClass ROS_SERVICE_CONNECTION = eINSTANCE.getROSServiceConnection();

		/**
		 * The meta object literal for the '<em><b>Service Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CONNECTION__SERVICE_SERVER = eINSTANCE.getROSServiceConnection_ServiceServer();

		/**
		 * The meta object literal for the '<em><b>Service Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CONNECTION__SERVICE_CLIENT = eINSTANCE.getROSServiceConnection_ServiceClient();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewServiceConnectionImpl <em>ROS New Service Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewServiceConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSNewServiceConnection()
		 * @generated
		 */
		EClass ROS_NEW_SERVICE_CONNECTION = eINSTANCE.getROSNewServiceConnection();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME = eINSTANCE.getROSNewServiceConnection_ServiceName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingServiceConnectionImpl <em>ROS Existing Service Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingServiceConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSExistingServiceConnection()
		 * @generated
		 */
		EClass ROS_EXISTING_SERVICE_CONNECTION = eINSTANCE.getROSExistingServiceConnection();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_EXISTING_SERVICE_CONNECTION__SERVICE = eINSTANCE.getROSExistingServiceConnection_Service();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSActionConnectionImpl <em>ROS Action Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSActionConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSActionConnection()
		 * @generated
		 */
		EClass ROS_ACTION_CONNECTION = eINSTANCE.getROSActionConnection();

		/**
		 * The meta object literal for the '<em><b>Action Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_ACTION_CONNECTION__ACTION_SERVER = eINSTANCE.getROSActionConnection_ActionServer();

		/**
		 * The meta object literal for the '<em><b>Action Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_ACTION_CONNECTION__ACTION_CLIENT = eINSTANCE.getROSActionConnection_ActionClient();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewActionConnectionImpl <em>ROS New Action Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewActionConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSNewActionConnection()
		 * @generated
		 */
		EClass ROS_NEW_ACTION_CONNECTION = eINSTANCE.getROSNewActionConnection();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NEW_ACTION_CONNECTION__ACTION_NAME = eINSTANCE.getROSNewActionConnection_ActionName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingActionConnectionImpl <em>ROS Existing Action Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSExistingActionConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSExistingActionConnection()
		 * @generated
		 */
		EClass ROS_EXISTING_ACTION_CONNECTION = eINSTANCE.getROSExistingActionConnection();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_EXISTING_ACTION_CONNECTION__ACTION = eINSTANCE.getROSExistingActionConnection_Action();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredComponentsImpl <em>ROS Required Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredComponentsImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSRequiredComponents()
		 * @generated
		 */
		EClass ROS_REQUIRED_COMPONENTS = eINSTANCE.getROSRequiredComponents();

		/**
		 * The meta object literal for the '<em><b>ROS Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_COMPONENTS__ROS_NODES = eINSTANCE.getROSRequiredComponents_ROSNodes();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl <em>ROS Required Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl
		 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSRequiredConnections()
		 * @generated
		 */
		EClass ROS_REQUIRED_CONNECTIONS = eINSTANCE.getROSRequiredConnections();

		/**
		 * The meta object literal for the '<em><b>Required Existing Topic Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS = eINSTANCE.getROSRequiredConnections_RequiredExistingTopicConnections();

		/**
		 * The meta object literal for the '<em><b>Required Existing Service Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS = eINSTANCE.getROSRequiredConnections_RequiredExistingServiceConnections();

		/**
		 * The meta object literal for the '<em><b>Required Existing Action Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS = eINSTANCE.getROSRequiredConnections_RequiredExistingActionConnections();

	}

} //rosresolutionmodelsPackage
