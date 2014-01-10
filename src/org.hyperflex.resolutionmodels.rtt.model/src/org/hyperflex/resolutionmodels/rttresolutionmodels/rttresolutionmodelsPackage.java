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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * In collaboration with by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rttresolutionmodels;

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
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsFactory
 * @model kind="package"
 * @generated
 */
public interface rttresolutionmodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rttresolutionmodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hyperflex.org/resolutionmodels.rtt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rttresolutionmodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rttresolutionmodelsPackage eINSTANCE = org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfImplementationImpl <em>Orocos Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfImplementationImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTransfImplementation()
	 * @generated
	 */
	int OROCOS_TRANSF_IMPLEMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_IMPLEMENTATION__NAME = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_IMPLEMENTATION__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_IMPLEMENTATION__CLASS_NAME = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Target Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orocos Transf Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_IMPLEMENTATION_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfPropertyImpl <em>Orocos Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfPropertyImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTransfProperty()
	 * @generated
	 */
	int OROCOS_TRANSF_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_PROPERTY__NAME = resolutionmodelsPackage.RM_TRANSF_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_PROPERTY__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_PROPERTY__VALUE = resolutionmodelsPackage.RM_TRANSF_PROPERTY__VALUE;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_PROPERTY__TARGET_PROPERTY = resolutionmodelsPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orocos Transf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_PROPERTY_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfConnectionImpl <em>Orocos Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTransfConnection()
	 * @generated
	 */
	int OROCOS_TRANSF_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_CONNECTION__NAME = resolutionmodelsPackage.RM_TRANSF_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_CONNECTION__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>New Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS = resolutionmodelsPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orocos Transf Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TRANSF_CONNECTION_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionImpl <em>Orocos Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosConnection()
	 * @generated
	 */
	int OROCOS_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Orocos Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl <em>Orocos Connection Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosConnectionPolicy()
	 * @generated
	 */
	int OROCOS_CONNECTION_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__NAME = OROCOS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__TYPE = OROCOS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lock Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__LOCK_POLICY = OROCOS_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__BUFFER_SIZE = OROCOS_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__TRANSPORT = OROCOS_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__INPUT_PORT = OROCOS_CONNECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY__OUTPUT_PORT = OROCOS_CONNECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Orocos Connection Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONNECTION_POLICY_FEATURE_COUNT = OROCOS_CONNECTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosPeersConnectionImpl <em>Orocos Peers Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosPeersConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosPeersConnection()
	 * @generated
	 */
	int OROCOS_PEERS_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_PEERS_CONNECTION__NAME = OROCOS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_PEERS_CONNECTION__OPERATION = OROCOS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_PEERS_CONNECTION__OPERATION_CALLER = OROCOS_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orocos Peers Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_PEERS_CONNECTION_FEATURE_COUNT = OROCOS_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl <em>Orocos Required Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosRequiredElements()
	 * @generated
	 */
	int OROCOS_REQUIRED_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Required Task Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Connection Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Peers Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orocos Required Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_REQUIRED_ELEMENTS_FEATURE_COUNT = resolutionmodelsPackage.RM_REQUIRED_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTemplateSystemModelImpl <em>Orocos Template System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTemplateSystemModelImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTemplateSystemModel()
	 * @generated
	 */
	int OROCOS_TEMPLATE_SYSTEM_MODEL = 7;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TEMPLATE_SYSTEM_MODEL__SYSTEM = resolutionmodelsPackage.TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orocos Template System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT = resolutionmodelsPackage.TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation <em>Orocos Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Transf Implementation</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation
	 * @generated
	 */
	EClass getOrocosTransfImplementation();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Task Context</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation#getTargetTaskContext()
	 * @see #getOrocosTransfImplementation()
	 * @generated
	 */
	EReference getOrocosTransfImplementation_TargetTaskContext();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty <em>Orocos Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Transf Property</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty
	 * @generated
	 */
	EClass getOrocosTransfProperty();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty#getTargetProperty()
	 * @see #getOrocosTransfProperty()
	 * @generated
	 */
	EReference getOrocosTransfProperty_TargetProperty();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection <em>Orocos Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Transf Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection
	 * @generated
	 */
	EClass getOrocosTransfConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection#getNewConnections <em>New Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Connections</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection#getNewConnections()
	 * @see #getOrocosTransfConnection()
	 * @generated
	 */
	EReference getOrocosTransfConnection_NewConnections();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnection <em>Orocos Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnection
	 * @generated
	 */
	EClass getOrocosConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnection#getName()
	 * @see #getOrocosConnection()
	 * @generated
	 */
	EAttribute getOrocosConnection_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy <em>Orocos Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Connection Policy</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy
	 * @generated
	 */
	EClass getOrocosConnectionPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getType()
	 * @see #getOrocosConnectionPolicy()
	 * @generated
	 */
	EAttribute getOrocosConnectionPolicy_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getLockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Policy</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getLockPolicy()
	 * @see #getOrocosConnectionPolicy()
	 * @generated
	 */
	EAttribute getOrocosConnectionPolicy_LockPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getBufferSize()
	 * @see #getOrocosConnectionPolicy()
	 * @generated
	 */
	EAttribute getOrocosConnectionPolicy_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getTransport()
	 * @see #getOrocosConnectionPolicy()
	 * @generated
	 */
	EAttribute getOrocosConnectionPolicy_Transport();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getInputPort()
	 * @see #getOrocosConnectionPolicy()
	 * @generated
	 */
	EReference getOrocosConnectionPolicy_InputPort();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getOutputPort()
	 * @see #getOrocosConnectionPolicy()
	 * @generated
	 */
	EReference getOrocosConnectionPolicy_OutputPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection <em>Orocos Peers Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Peers Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection
	 * @generated
	 */
	EClass getOrocosPeersConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection#getOperation()
	 * @see #getOrocosPeersConnection()
	 * @generated
	 */
	EReference getOrocosPeersConnection_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection#getOperationCaller <em>Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Caller</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection#getOperationCaller()
	 * @see #getOrocosPeersConnection()
	 * @generated
	 */
	EReference getOrocosPeersConnection_OperationCaller();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements <em>Orocos Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Required Elements</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements
	 * @generated
	 */
	EClass getOrocosRequiredElements();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredTaskContexts <em>Required Task Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Task Contexts</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredTaskContexts()
	 * @see #getOrocosRequiredElements()
	 * @generated
	 */
	EReference getOrocosRequiredElements_RequiredTaskContexts();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredConnectionPolicies <em>Required Connection Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Connection Policies</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredConnectionPolicies()
	 * @see #getOrocosRequiredElements()
	 * @generated
	 */
	EReference getOrocosRequiredElements_RequiredConnectionPolicies();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredPeersConnection <em>Required Peers Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Peers Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredPeersConnection()
	 * @see #getOrocosRequiredElements()
	 * @generated
	 */
	EReference getOrocosRequiredElements_RequiredPeersConnection();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel <em>Orocos Template System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Template System Model</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel
	 * @generated
	 */
	EClass getOrocosTemplateSystemModel();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel#getSystem()
	 * @see #getOrocosTemplateSystemModel()
	 * @generated
	 */
	EReference getOrocosTemplateSystemModel_System();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	rttresolutionmodelsFactory getrttresolutionmodelsFactory();

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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfImplementationImpl <em>Orocos Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfImplementationImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTransfImplementation()
		 * @generated
		 */
		EClass OROCOS_TRANSF_IMPLEMENTATION = eINSTANCE.getOrocosTransfImplementation();

		/**
		 * The meta object literal for the '<em><b>Target Task Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT = eINSTANCE.getOrocosTransfImplementation_TargetTaskContext();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfPropertyImpl <em>Orocos Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfPropertyImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTransfProperty()
		 * @generated
		 */
		EClass OROCOS_TRANSF_PROPERTY = eINSTANCE.getOrocosTransfProperty();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_TRANSF_PROPERTY__TARGET_PROPERTY = eINSTANCE.getOrocosTransfProperty_TargetProperty();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfConnectionImpl <em>Orocos Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTransfConnection()
		 * @generated
		 */
		EClass OROCOS_TRANSF_CONNECTION = eINSTANCE.getOrocosTransfConnection();

		/**
		 * The meta object literal for the '<em><b>New Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS = eINSTANCE.getOrocosTransfConnection_NewConnections();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionImpl <em>Orocos Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosConnection()
		 * @generated
		 */
		EClass OROCOS_CONNECTION = eINSTANCE.getOrocosConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OROCOS_CONNECTION__NAME = eINSTANCE.getOrocosConnection_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl <em>Orocos Connection Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosConnectionPolicy()
		 * @generated
		 */
		EClass OROCOS_CONNECTION_POLICY = eINSTANCE.getOrocosConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OROCOS_CONNECTION_POLICY__TYPE = eINSTANCE.getOrocosConnectionPolicy_Type();

		/**
		 * The meta object literal for the '<em><b>Lock Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OROCOS_CONNECTION_POLICY__LOCK_POLICY = eINSTANCE.getOrocosConnectionPolicy_LockPolicy();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OROCOS_CONNECTION_POLICY__BUFFER_SIZE = eINSTANCE.getOrocosConnectionPolicy_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OROCOS_CONNECTION_POLICY__TRANSPORT = eINSTANCE.getOrocosConnectionPolicy_Transport();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_CONNECTION_POLICY__INPUT_PORT = eINSTANCE.getOrocosConnectionPolicy_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_CONNECTION_POLICY__OUTPUT_PORT = eINSTANCE.getOrocosConnectionPolicy_OutputPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosPeersConnectionImpl <em>Orocos Peers Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosPeersConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosPeersConnection()
		 * @generated
		 */
		EClass OROCOS_PEERS_CONNECTION = eINSTANCE.getOrocosPeersConnection();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_PEERS_CONNECTION__OPERATION = eINSTANCE.getOrocosPeersConnection_Operation();

		/**
		 * The meta object literal for the '<em><b>Operation Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_PEERS_CONNECTION__OPERATION_CALLER = eINSTANCE.getOrocosPeersConnection_OperationCaller();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl <em>Orocos Required Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosRequiredElements()
		 * @generated
		 */
		EClass OROCOS_REQUIRED_ELEMENTS = eINSTANCE.getOrocosRequiredElements();

		/**
		 * The meta object literal for the '<em><b>Required Task Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS = eINSTANCE.getOrocosRequiredElements_RequiredTaskContexts();

		/**
		 * The meta object literal for the '<em><b>Required Connection Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES = eINSTANCE.getOrocosRequiredElements_RequiredConnectionPolicies();

		/**
		 * The meta object literal for the '<em><b>Required Peers Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION = eINSTANCE.getOrocosRequiredElements_RequiredPeersConnection();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTemplateSystemModelImpl <em>Orocos Template System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTemplateSystemModelImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getOrocosTemplateSystemModel()
		 * @generated
		 */
		EClass OROCOS_TEMPLATE_SYSTEM_MODEL = eINSTANCE.getOrocosTemplateSystemModel();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_TEMPLATE_SYSTEM_MODEL__SYSTEM = eINSTANCE.getOrocosTemplateSystemModel_System();

	}

} //rttresolutionmodelsPackage
