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
package org.hyperflex.resolutionmodels.rosresolutionmodels;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

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
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory
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
	String eNS_URI = "http://www.hyperflex.org/resolutionmodels.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rosresolutionmodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rosresolutionmodelsPackage eINSTANCE = org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl <em>ROS Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfImplementation()
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
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl <em>ROS Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfProperty()
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
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl <em>ROS Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfConnection()
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
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSConnectionImpl <em>ROS Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSConnection()
	 * @generated
	 */
	int ROS_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONNECTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>ROS Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl <em>ROS Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTopicConnection()
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
	int ROS_TOPIC_CONNECTION__NAME = ROS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION__TOPIC = ROS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE = ROS_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TOPIC_CONNECTION_FEATURE_COUNT = ROS_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl <em>ROS Service Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSServiceConnection()
	 * @generated
	 */
	int ROS_SERVICE_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION__NAME = ROS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Service Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION__SERVICE_PRODUCER = ROS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION__SERVICE_CONSUMER = ROS_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CONNECTION_FEATURE_COUNT = ROS_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl <em>ROS Required Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSRequiredElements()
	 * @generated
	 */
	int ROS_REQUIRED_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Required Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_ELEMENTS__REQUIRED_NODES = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Topic Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Service Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROS Required Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_REQUIRED_ELEMENTS_FEATURE_COUNT = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTemplateSystemModelImpl <em>ROS Template System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTemplateSystemModelImpl
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTemplateSystemModel()
	 * @generated
	 */
	int ROS_TEMPLATE_SYSTEM_MODEL = 7;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TEMPLATE_SYSTEM_MODEL__SYSTEM = resolutionmodelsPackage.TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Template System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT = resolutionmodelsPackage.TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation <em>ROS Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Transf Implementation</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation
	 * @generated
	 */
	EClass getROSTransfImplementation();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation#getTargetNode()
	 * @see #getROSTransfImplementation()
	 * @generated
	 */
	EReference getROSTransfImplementation_TargetNode();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty <em>ROS Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Transf Property</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty
	 * @generated
	 */
	EClass getROSTransfProperty();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty#getTargetProperty()
	 * @see #getROSTransfProperty()
	 * @generated
	 */
	EReference getROSTransfProperty_TargetProperty();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection <em>ROS Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Transf Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection
	 * @generated
	 */
	EClass getROSTransfConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection#getNewConnections <em>New Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Connections</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection#getNewConnections()
	 * @see #getROSTransfConnection()
	 * @generated
	 */
	EReference getROSTransfConnection_NewConnections();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection <em>ROS Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection
	 * @generated
	 */
	EClass getROSConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection#getName()
	 * @see #getROSConnection()
	 * @generated
	 */
	EAttribute getROSConnection_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection <em>ROS Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Topic Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection
	 * @generated
	 */
	EClass getROSTopicConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getTopic()
	 * @see #getROSTopicConnection()
	 * @generated
	 */
	EReference getROSTopicConnection_Topic();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getMessageInterface <em>Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Interface</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getMessageInterface()
	 * @see #getROSTopicConnection()
	 * @generated
	 */
	EReference getROSTopicConnection_MessageInterface();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection <em>ROS Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Service Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection
	 * @generated
	 */
	EClass getROSServiceConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceProducer <em>Service Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Producer</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceProducer()
	 * @see #getROSServiceConnection()
	 * @generated
	 */
	EReference getROSServiceConnection_ServiceProducer();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceConsumer <em>Service Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Consumer</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceConsumer()
	 * @see #getROSServiceConnection()
	 * @generated
	 */
	EReference getROSServiceConnection_ServiceConsumer();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements <em>ROS Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Required Elements</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements
	 * @generated
	 */
	EClass getROSRequiredElements();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredNodes <em>Required Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Nodes</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredNodes()
	 * @see #getROSRequiredElements()
	 * @generated
	 */
	EReference getROSRequiredElements_RequiredNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredTopicConnections <em>Required Topic Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Topic Connections</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredTopicConnections()
	 * @see #getROSRequiredElements()
	 * @generated
	 */
	EReference getROSRequiredElements_RequiredTopicConnections();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredServiceConnections <em>Required Service Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Service Connections</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredServiceConnections()
	 * @see #getROSRequiredElements()
	 * @generated
	 */
	EReference getROSRequiredElements_RequiredServiceConnections();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel <em>ROS Template System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Template System Model</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel
	 * @generated
	 */
	EClass getROSTemplateSystemModel();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel#getSystem()
	 * @see #getROSTemplateSystemModel()
	 * @generated
	 */
	EReference getROSTemplateSystemModel_System();

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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl <em>ROS Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfImplementationImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfImplementation()
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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl <em>ROS Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfPropertyImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfProperty()
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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl <em>ROS Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTransfConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTransfConnection()
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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSConnectionImpl <em>ROS Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSConnection()
		 * @generated
		 */
		EClass ROS_CONNECTION = eINSTANCE.getROSConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_CONNECTION__NAME = eINSTANCE.getROSConnection_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl <em>ROS Topic Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTopicConnection()
		 * @generated
		 */
		EClass ROS_TOPIC_CONNECTION = eINSTANCE.getROSTopicConnection();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TOPIC_CONNECTION__TOPIC = eINSTANCE.getROSTopicConnection_Topic();

		/**
		 * The meta object literal for the '<em><b>Message Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE = eINSTANCE.getROSTopicConnection_MessageInterface();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl <em>ROS Service Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSServiceConnection()
		 * @generated
		 */
		EClass ROS_SERVICE_CONNECTION = eINSTANCE.getROSServiceConnection();

		/**
		 * The meta object literal for the '<em><b>Service Producer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CONNECTION__SERVICE_PRODUCER = eINSTANCE.getROSServiceConnection_ServiceProducer();

		/**
		 * The meta object literal for the '<em><b>Service Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CONNECTION__SERVICE_CONSUMER = eINSTANCE.getROSServiceConnection_ServiceConsumer();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl <em>ROS Required Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSRequiredElements()
		 * @generated
		 */
		EClass ROS_REQUIRED_ELEMENTS = eINSTANCE.getROSRequiredElements();

		/**
		 * The meta object literal for the '<em><b>Required Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_ELEMENTS__REQUIRED_NODES = eINSTANCE.getROSRequiredElements_RequiredNodes();

		/**
		 * The meta object literal for the '<em><b>Required Topic Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS = eINSTANCE.getROSRequiredElements_RequiredTopicConnections();

		/**
		 * The meta object literal for the '<em><b>Required Service Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS = eINSTANCE.getROSRequiredElements_RequiredServiceConnections();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTemplateSystemModelImpl <em>ROS Template System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTemplateSystemModelImpl
		 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsPackageImpl#getROSTemplateSystemModel()
		 * @generated
		 */
		EClass ROS_TEMPLATE_SYSTEM_MODEL = eINSTANCE.getROSTemplateSystemModel();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_TEMPLATE_SYSTEM_MODEL__SYSTEM = eINSTANCE.getROSTemplateSystemModel_System();

	}

} //rosresolutionmodelsPackage
