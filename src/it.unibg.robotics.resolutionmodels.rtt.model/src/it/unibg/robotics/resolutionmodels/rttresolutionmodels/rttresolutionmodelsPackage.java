/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
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
package org.hyperflex.resolutionmodels.rttresolutionmodels;

import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

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
	String eNS_URI = "http://robotics.unibg.it/resolutionmodels.rtt";

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
	rttresolutionmodelsPackage eINSTANCE = org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfImplementationImpl <em>RTT Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfImplementationImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTTransfImplementation()
	 * @generated
	 */
	int RTT_TRANSF_IMPLEMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__NAME = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__CLASS_NAME = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Target Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Transf Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfPropertyImpl <em>RTT Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfPropertyImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTTransfProperty()
	 * @generated
	 */
	int RTT_TRANSF_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__NAME = resolutionmodelsPackage.RM_TRANSF_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__VALUE = resolutionmodelsPackage.RM_TRANSF_PROPERTY__VALUE;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__TARGET_PROPERTY = resolutionmodelsPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Transf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfConnectionImpl <em>RTT Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTTransfConnection()
	 * @generated
	 */
	int RTT_TRANSF_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION__NAME = resolutionmodelsPackage.RM_TRANSF_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION__DESCRIPTION = resolutionmodelsPackage.RM_TRANSF_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>New Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION__NEW_CONNECTIONS = resolutionmodelsPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Transf Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION_FEATURE_COUNT = resolutionmodelsPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTConnectionImpl <em>RTT Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTConnectionImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTConnection()
	 * @generated
	 */
	int RTT_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Lock Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION__LOCK_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION__BUFFER_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION__INPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION__OUTPUT_PORT = 5;

	/**
	 * The number of structural features of the '<em>RTT Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_CONNECTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredComponentsImpl <em>RTT Required Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredComponentsImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTRequiredComponents()
	 * @generated
	 */
	int RTT_REQUIRED_COMPONENTS = 4;

	/**
	 * The feature id for the '<em><b>RTT Task Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS = resolutionmodelsPackage.RM_REQUIRED_COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Required Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_REQUIRED_COMPONENTS_FEATURE_COUNT = resolutionmodelsPackage.RM_REQUIRED_COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredConnectionsImpl <em>RTT Required Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredConnectionsImpl
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTRequiredConnections()
	 * @generated
	 */
	int RTT_REQUIRED_CONNECTIONS = 5;

	/**
	 * The feature id for the '<em><b>RTT Connection Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES = resolutionmodelsPackage.RM_REQUIRED_CONNECTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Required Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_REQUIRED_CONNECTIONS_FEATURE_COUNT = resolutionmodelsPackage.RM_REQUIRED_CONNECTIONS_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation <em>RTT Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Transf Implementation</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation
	 * @generated
	 */
	EClass getRTTTransfImplementation();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Task Context</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation#getTargetTaskContext()
	 * @see #getRTTTransfImplementation()
	 * @generated
	 */
	EReference getRTTTransfImplementation_TargetTaskContext();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty <em>RTT Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Transf Property</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty
	 * @generated
	 */
	EClass getRTTTransfProperty();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty#getTargetProperty()
	 * @see #getRTTTransfProperty()
	 * @generated
	 */
	EReference getRTTTransfProperty_TargetProperty();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection <em>RTT Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Transf Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection
	 * @generated
	 */
	EClass getRTTTransfConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection#getNewConnections <em>New Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Connections</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection#getNewConnections()
	 * @see #getRTTTransfConnection()
	 * @generated
	 */
	EReference getRTTTransfConnection_NewConnections();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection <em>RTT Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection
	 * @generated
	 */
	EClass getRTTConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getName()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getType()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getLockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Policy</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getLockPolicy()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_LockPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getBufferSize()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_BufferSize();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getInputPort()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EReference getRTTConnection_InputPort();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection#getOutputPort()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EReference getRTTConnection_OutputPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents <em>RTT Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Required Components</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents
	 * @generated
	 */
	EClass getRTTRequiredComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents#getRTTTaskContexts <em>RTT Task Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RTT Task Contexts</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents#getRTTTaskContexts()
	 * @see #getRTTRequiredComponents()
	 * @generated
	 */
	EReference getRTTRequiredComponents_RTTTaskContexts();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections <em>RTT Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Required Connections</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections
	 * @generated
	 */
	EClass getRTTRequiredConnections();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections#getRTTConnectionPolicies <em>RTT Connection Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RTT Connection Policies</em>'.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections#getRTTConnectionPolicies()
	 * @see #getRTTRequiredConnections()
	 * @generated
	 */
	EReference getRTTRequiredConnections_RTTConnectionPolicies();

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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfImplementationImpl <em>RTT Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfImplementationImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTTransfImplementation()
		 * @generated
		 */
		EClass RTT_TRANSF_IMPLEMENTATION = eINSTANCE.getRTTTransfImplementation();

		/**
		 * The meta object literal for the '<em><b>Target Task Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT = eINSTANCE.getRTTTransfImplementation_TargetTaskContext();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfPropertyImpl <em>RTT Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfPropertyImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTTransfProperty()
		 * @generated
		 */
		EClass RTT_TRANSF_PROPERTY = eINSTANCE.getRTTTransfProperty();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_TRANSF_PROPERTY__TARGET_PROPERTY = eINSTANCE.getRTTTransfProperty_TargetProperty();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfConnectionImpl <em>RTT Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTTransfConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTTransfConnection()
		 * @generated
		 */
		EClass RTT_TRANSF_CONNECTION = eINSTANCE.getRTTTransfConnection();

		/**
		 * The meta object literal for the '<em><b>New Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_TRANSF_CONNECTION__NEW_CONNECTIONS = eINSTANCE.getRTTTransfConnection_NewConnections();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTConnectionImpl <em>RTT Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTConnectionImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTConnection()
		 * @generated
		 */
		EClass RTT_CONNECTION = eINSTANCE.getRTTConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTT_CONNECTION__NAME = eINSTANCE.getRTTConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTT_CONNECTION__TYPE = eINSTANCE.getRTTConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Lock Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTT_CONNECTION__LOCK_POLICY = eINSTANCE.getRTTConnection_LockPolicy();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTT_CONNECTION__BUFFER_SIZE = eINSTANCE.getRTTConnection_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_CONNECTION__INPUT_PORT = eINSTANCE.getRTTConnection_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_CONNECTION__OUTPUT_PORT = eINSTANCE.getRTTConnection_OutputPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredComponentsImpl <em>RTT Required Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredComponentsImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTRequiredComponents()
		 * @generated
		 */
		EClass RTT_REQUIRED_COMPONENTS = eINSTANCE.getRTTRequiredComponents();

		/**
		 * The meta object literal for the '<em><b>RTT Task Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS = eINSTANCE.getRTTRequiredComponents_RTTTaskContexts();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredConnectionsImpl <em>RTT Required Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredConnectionsImpl
		 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsPackageImpl#getRTTRequiredConnections()
		 * @generated
		 */
		EClass RTT_REQUIRED_CONNECTIONS = eINSTANCE.getRTTRequiredConnections();

		/**
		 * The meta object literal for the '<em><b>RTT Connection Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES = eINSTANCE.getRTTRequiredConnections_RTTConnectionPolicies();

	}

} //rttresolutionmodelsPackage
