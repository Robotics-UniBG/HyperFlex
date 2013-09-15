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
package it.unibg.robotics.resolutionmodels.rttresolutionmodels.impl;

import it.unibg.robotics.resolutionmodels.resolutionmodelsPackage;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfConnection;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfImplementation;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfProperty;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsFactory;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class rttresolutionmodelsPackageImpl extends EPackageImpl implements rttresolutionmodelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rttTransfImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rttTransfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rttTransfConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rttConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rttRequiredComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rttRequiredConnectionsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private rttresolutionmodelsPackageImpl() {
		super(eNS_URI, rttresolutionmodelsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link rttresolutionmodelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static rttresolutionmodelsPackage init() {
		if (isInited) return (rttresolutionmodelsPackage)EPackage.Registry.INSTANCE.getEPackage(rttresolutionmodelsPackage.eNS_URI);

		// Obtain or create and register package
		rttresolutionmodelsPackageImpl therttresolutionmodelsPackage = (rttresolutionmodelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof rttresolutionmodelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new rttresolutionmodelsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		resolutionmodelsPackage.eINSTANCE.eClass();
		RttPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		therttresolutionmodelsPackage.createPackageContents();

		// Initialize created meta-data
		therttresolutionmodelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		therttresolutionmodelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(rttresolutionmodelsPackage.eNS_URI, therttresolutionmodelsPackage);
		return therttresolutionmodelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTTransfImplementation() {
		return rttTransfImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTTransfImplementation_TargetTaskContext() {
		return (EReference)rttTransfImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTTransfProperty() {
		return rttTransfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTTransfProperty_TargetProperty() {
		return (EReference)rttTransfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTTransfConnection() {
		return rttTransfConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTTransfConnection_NewConnections() {
		return (EReference)rttTransfConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTConnection() {
		return rttConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTTConnection_Name() {
		return (EAttribute)rttConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTTConnection_Type() {
		return (EAttribute)rttConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTTConnection_LockPolicy() {
		return (EAttribute)rttConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTTConnection_BufferSize() {
		return (EAttribute)rttConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTConnection_InputPort() {
		return (EReference)rttConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTConnection_OutputPort() {
		return (EReference)rttConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTRequiredComponents() {
		return rttRequiredComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTRequiredComponents_RTTTaskContexts() {
		return (EReference)rttRequiredComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTRequiredConnections() {
		return rttRequiredConnectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTRequiredConnections_RTTConnectionPolicies() {
		return (EReference)rttRequiredConnectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rttresolutionmodelsFactory getrttresolutionmodelsFactory() {
		return (rttresolutionmodelsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rttTransfImplementationEClass = createEClass(RTT_TRANSF_IMPLEMENTATION);
		createEReference(rttTransfImplementationEClass, RTT_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT);

		rttTransfPropertyEClass = createEClass(RTT_TRANSF_PROPERTY);
		createEReference(rttTransfPropertyEClass, RTT_TRANSF_PROPERTY__TARGET_PROPERTY);

		rttTransfConnectionEClass = createEClass(RTT_TRANSF_CONNECTION);
		createEReference(rttTransfConnectionEClass, RTT_TRANSF_CONNECTION__NEW_CONNECTIONS);

		rttConnectionEClass = createEClass(RTT_CONNECTION);
		createEAttribute(rttConnectionEClass, RTT_CONNECTION__NAME);
		createEAttribute(rttConnectionEClass, RTT_CONNECTION__TYPE);
		createEAttribute(rttConnectionEClass, RTT_CONNECTION__LOCK_POLICY);
		createEAttribute(rttConnectionEClass, RTT_CONNECTION__BUFFER_SIZE);
		createEReference(rttConnectionEClass, RTT_CONNECTION__INPUT_PORT);
		createEReference(rttConnectionEClass, RTT_CONNECTION__OUTPUT_PORT);

		rttRequiredComponentsEClass = createEClass(RTT_REQUIRED_COMPONENTS);
		createEReference(rttRequiredComponentsEClass, RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS);

		rttRequiredConnectionsEClass = createEClass(RTT_REQUIRED_CONNECTIONS);
		createEReference(rttRequiredConnectionsEClass, RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		resolutionmodelsPackage theresolutionmodelsPackage = (resolutionmodelsPackage)EPackage.Registry.INSTANCE.getEPackage(resolutionmodelsPackage.eNS_URI);
		RttPackage theRttPackage = (RttPackage)EPackage.Registry.INSTANCE.getEPackage(RttPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rttTransfImplementationEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfImplementation());
		rttTransfPropertyEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfProperty());
		rttTransfConnectionEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfConnection());
		rttRequiredComponentsEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMRequiredComponents());
		rttRequiredConnectionsEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMRequiredConnections());

		// Initialize classes and features; add operations and parameters
		initEClass(rttTransfImplementationEClass, RTTTransfImplementation.class, "RTTTransfImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTTTransfImplementation_TargetTaskContext(), theRttPackage.getTaskContext(), null, "targetTaskContext", null, 1, 1, RTTTransfImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rttTransfPropertyEClass, RTTTransfProperty.class, "RTTTransfProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTTTransfProperty_TargetProperty(), theRttPackage.getProperty(), null, "targetProperty", null, 1, 1, RTTTransfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rttTransfConnectionEClass, RTTTransfConnection.class, "RTTTransfConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTTTransfConnection_NewConnections(), this.getRTTConnection(), null, "newConnections", null, 1, -1, RTTTransfConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rttConnectionEClass, RTTConnection.class, "RTTConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRTTConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, RTTConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTTConnection_Type(), theRttPackage.getConnectionPolicyType(), "type", null, 1, 1, RTTConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTTConnection_LockPolicy(), theRttPackage.getConnectionPolicyLockPolicy(), "lockPolicy", null, 1, 1, RTTConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTTConnection_BufferSize(), ecorePackage.getEShort(), "bufferSize", null, 1, 1, RTTConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTTConnection_InputPort(), theRttPackage.getInputPort(), null, "inputPort", null, 1, 1, RTTConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTTConnection_OutputPort(), theRttPackage.getOutputPort(), null, "outputPort", null, 1, 1, RTTConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rttRequiredComponentsEClass, RTTRequiredComponents.class, "RTTRequiredComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTTRequiredComponents_RTTTaskContexts(), theRttPackage.getTaskContext(), null, "RTTTaskContexts", null, 1, -1, RTTRequiredComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rttRequiredConnectionsEClass, RTTRequiredConnections.class, "RTTRequiredConnections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTTRequiredConnections_RTTConnectionPolicies(), theRttPackage.getConnectionPolicy(), null, "RTTConnectionPolicies", null, 1, -1, RTTRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //rttresolutionmodelsPackageImpl
