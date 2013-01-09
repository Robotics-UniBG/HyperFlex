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
package it.unibg.robotics.resolutionmodel.rtt;

import it.unibg.robotics.resolutionmodel.resolutionmodelPackage;

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
 * @see it.unibg.robotics.resolutionmodel.rtt.rttFactory
 * @model kind="package"
 * @generated
 */
public interface rttPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rtt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robotics.unibg.it/resolutionmodel.rtt";

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
	rttPackage eINSTANCE = it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfImplementationImpl <em>RTT Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfImplementationImpl
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTTransfImplementation()
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
	int RTT_TRANSF_IMPLEMENTATION__NAME = resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__DESCRIPTION = resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__CLASS_NAME = resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Target Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT = resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Transf Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_IMPLEMENTATION_FEATURE_COUNT = resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfPropertyImpl <em>RTT Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfPropertyImpl
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTTransfProperty()
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
	int RTT_TRANSF_PROPERTY__NAME = resolutionmodelPackage.RM_TRANSF_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__DESCRIPTION = resolutionmodelPackage.RM_TRANSF_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__VALUE = resolutionmodelPackage.RM_TRANSF_PROPERTY__VALUE;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY__TARGET_PROPERTY = resolutionmodelPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Transf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_PROPERTY_FEATURE_COUNT = resolutionmodelPackage.RM_TRANSF_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfConnectionImpl <em>RTT Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfConnectionImpl
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTTransfConnection()
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
	int RTT_TRANSF_CONNECTION__NAME = resolutionmodelPackage.RM_TRANSF_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION__DESCRIPTION = resolutionmodelPackage.RM_TRANSF_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>New Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION__NEW_CONNECTIONS = resolutionmodelPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTT Transf Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTT_TRANSF_CONNECTION_FEATURE_COUNT = resolutionmodelPackage.RM_TRANSF_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTConnectionImpl <em>RTT Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTConnectionImpl
	 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTConnection()
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
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodel.rtt.RTTTransfImplementation <em>RTT Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Transf Implementation</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTTransfImplementation
	 * @generated
	 */
	EClass getRTTTransfImplementation();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodel.rtt.RTTTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Task Context</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTTransfImplementation#getTargetTaskContext()
	 * @see #getRTTTransfImplementation()
	 * @generated
	 */
	EReference getRTTTransfImplementation_TargetTaskContext();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodel.rtt.RTTTransfProperty <em>RTT Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Transf Property</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTTransfProperty
	 * @generated
	 */
	EClass getRTTTransfProperty();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodel.rtt.RTTTransfProperty#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTTransfProperty#getTargetProperty()
	 * @see #getRTTTransfProperty()
	 * @generated
	 */
	EReference getRTTTransfProperty_TargetProperty();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodel.rtt.RTTTransfConnection <em>RTT Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Transf Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTTransfConnection
	 * @generated
	 */
	EClass getRTTTransfConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodel.rtt.RTTTransfConnection#getNewConnections <em>New Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTTransfConnection#getNewConnections()
	 * @see #getRTTTransfConnection()
	 * @generated
	 */
	EReference getRTTTransfConnection_NewConnections();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection <em>RTT Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTT Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection
	 * @generated
	 */
	EClass getRTTConnection();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getName()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getType()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getLockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Policy</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getLockPolicy()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_LockPolicy();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getBufferSize()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EAttribute getRTTConnection_BufferSize();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getInputPort()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EReference getRTTConnection_InputPort();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see it.unibg.robotics.resolutionmodel.rtt.RTTConnection#getOutputPort()
	 * @see #getRTTConnection()
	 * @generated
	 */
	EReference getRTTConnection_OutputPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	rttFactory getrttFactory();

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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfImplementationImpl <em>RTT Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfImplementationImpl
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTTransfImplementation()
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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfPropertyImpl <em>RTT Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfPropertyImpl
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTTransfProperty()
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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfConnectionImpl <em>RTT Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTTransfConnectionImpl
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTTransfConnection()
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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodel.rtt.impl.RTTConnectionImpl <em>RTT Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.RTTConnectionImpl
		 * @see it.unibg.robotics.resolutionmodel.rtt.impl.rttPackageImpl#getRTTConnection()
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

	}

} //rttPackage
