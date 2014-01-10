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
package org.hyperflex.resolutionmodels.rttresolutionmodels.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsFactory;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

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
	private EClass orocosTransfImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosTransfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosTransfConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosConnectionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosPeersConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosRequiredElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosTemplateSystemModelEClass = null;

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
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#eNS_URI
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
		orocoscomponentmodelPackage.eINSTANCE.eClass();
		resolutionmodelsPackage.eINSTANCE.eClass();

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
	public EClass getOrocosTransfImplementation() {
		return orocosTransfImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosTransfImplementation_TargetTaskContext() {
		return (EReference)orocosTransfImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosTransfProperty() {
		return orocosTransfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosTransfProperty_TargetProperty() {
		return (EReference)orocosTransfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosTransfConnection() {
		return orocosTransfConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosTransfConnection_NewConnections() {
		return (EReference)orocosTransfConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosConnection() {
		return orocosConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrocosConnection_Name() {
		return (EAttribute)orocosConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosConnectionPolicy() {
		return orocosConnectionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrocosConnectionPolicy_Type() {
		return (EAttribute)orocosConnectionPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrocosConnectionPolicy_LockPolicy() {
		return (EAttribute)orocosConnectionPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrocosConnectionPolicy_BufferSize() {
		return (EAttribute)orocosConnectionPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrocosConnectionPolicy_Transport() {
		return (EAttribute)orocosConnectionPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosConnectionPolicy_InputPort() {
		return (EReference)orocosConnectionPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosConnectionPolicy_OutputPort() {
		return (EReference)orocosConnectionPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosPeersConnection() {
		return orocosPeersConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosPeersConnection_Operation() {
		return (EReference)orocosPeersConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosPeersConnection_OperationCaller() {
		return (EReference)orocosPeersConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosRequiredElements() {
		return orocosRequiredElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosRequiredElements_RequiredTaskContexts() {
		return (EReference)orocosRequiredElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosRequiredElements_RequiredConnectionPolicies() {
		return (EReference)orocosRequiredElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosRequiredElements_RequiredPeersConnection() {
		return (EReference)orocosRequiredElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosTemplateSystemModel() {
		return orocosTemplateSystemModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosTemplateSystemModel_System() {
		return (EReference)orocosTemplateSystemModelEClass.getEStructuralFeatures().get(0);
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
		orocosTransfImplementationEClass = createEClass(OROCOS_TRANSF_IMPLEMENTATION);
		createEReference(orocosTransfImplementationEClass, OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT);

		orocosTransfPropertyEClass = createEClass(OROCOS_TRANSF_PROPERTY);
		createEReference(orocosTransfPropertyEClass, OROCOS_TRANSF_PROPERTY__TARGET_PROPERTY);

		orocosTransfConnectionEClass = createEClass(OROCOS_TRANSF_CONNECTION);
		createEReference(orocosTransfConnectionEClass, OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS);

		orocosConnectionEClass = createEClass(OROCOS_CONNECTION);
		createEAttribute(orocosConnectionEClass, OROCOS_CONNECTION__NAME);

		orocosConnectionPolicyEClass = createEClass(OROCOS_CONNECTION_POLICY);
		createEAttribute(orocosConnectionPolicyEClass, OROCOS_CONNECTION_POLICY__TYPE);
		createEAttribute(orocosConnectionPolicyEClass, OROCOS_CONNECTION_POLICY__LOCK_POLICY);
		createEAttribute(orocosConnectionPolicyEClass, OROCOS_CONNECTION_POLICY__BUFFER_SIZE);
		createEAttribute(orocosConnectionPolicyEClass, OROCOS_CONNECTION_POLICY__TRANSPORT);
		createEReference(orocosConnectionPolicyEClass, OROCOS_CONNECTION_POLICY__INPUT_PORT);
		createEReference(orocosConnectionPolicyEClass, OROCOS_CONNECTION_POLICY__OUTPUT_PORT);

		orocosPeersConnectionEClass = createEClass(OROCOS_PEERS_CONNECTION);
		createEReference(orocosPeersConnectionEClass, OROCOS_PEERS_CONNECTION__OPERATION);
		createEReference(orocosPeersConnectionEClass, OROCOS_PEERS_CONNECTION__OPERATION_CALLER);

		orocosRequiredElementsEClass = createEClass(OROCOS_REQUIRED_ELEMENTS);
		createEReference(orocosRequiredElementsEClass, OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS);
		createEReference(orocosRequiredElementsEClass, OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES);
		createEReference(orocosRequiredElementsEClass, OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION);

		orocosTemplateSystemModelEClass = createEClass(OROCOS_TEMPLATE_SYSTEM_MODEL);
		createEReference(orocosTemplateSystemModelEClass, OROCOS_TEMPLATE_SYSTEM_MODEL__SYSTEM);
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
		orocoscomponentmodelPackage theorocoscomponentmodelPackage = (orocoscomponentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(orocoscomponentmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		orocosTransfImplementationEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfImplementation());
		orocosTransfPropertyEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfProperty());
		orocosTransfConnectionEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfConnection());
		orocosConnectionPolicyEClass.getESuperTypes().add(this.getOrocosConnection());
		orocosPeersConnectionEClass.getESuperTypes().add(this.getOrocosConnection());
		orocosRequiredElementsEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMRequiredElements());
		orocosTemplateSystemModelEClass.getESuperTypes().add(theresolutionmodelsPackage.getTemplateSystemModel());

		// Initialize classes and features; add operations and parameters
		initEClass(orocosTransfImplementationEClass, OrocosTransfImplementation.class, "OrocosTransfImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosTransfImplementation_TargetTaskContext(), theorocoscomponentmodelPackage.getTaskContext(), null, "targetTaskContext", null, 1, 1, OrocosTransfImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosTransfPropertyEClass, OrocosTransfProperty.class, "OrocosTransfProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosTransfProperty_TargetProperty(), theorocoscomponentmodelPackage.getProperty(), null, "targetProperty", null, 1, 1, OrocosTransfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosTransfConnectionEClass, OrocosTransfConnection.class, "OrocosTransfConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosTransfConnection_NewConnections(), this.getOrocosConnection(), null, "newConnections", null, 1, -1, OrocosTransfConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosConnectionEClass, OrocosConnection.class, "OrocosConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrocosConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, OrocosConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosConnectionPolicyEClass, OrocosConnectionPolicy.class, "OrocosConnectionPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrocosConnectionPolicy_Type(), theorocoscomponentmodelPackage.getConnectionType(), "type", null, 1, 1, OrocosConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrocosConnectionPolicy_LockPolicy(), theorocoscomponentmodelPackage.getLockPolicy(), "lockPolicy", null, 1, 1, OrocosConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrocosConnectionPolicy_BufferSize(), ecorePackage.getEShort(), "bufferSize", null, 1, 1, OrocosConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrocosConnectionPolicy_Transport(), theorocoscomponentmodelPackage.getConnectionTransport(), "transport", null, 1, 1, OrocosConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrocosConnectionPolicy_InputPort(), theorocoscomponentmodelPackage.getInputDataPort(), null, "inputPort", null, 1, 1, OrocosConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrocosConnectionPolicy_OutputPort(), theorocoscomponentmodelPackage.getOutputDataPort(), null, "outputPort", null, 1, 1, OrocosConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosPeersConnectionEClass, OrocosPeersConnection.class, "OrocosPeersConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosPeersConnection_Operation(), theorocoscomponentmodelPackage.getOperation(), null, "operation", null, 1, 1, OrocosPeersConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrocosPeersConnection_OperationCaller(), theorocoscomponentmodelPackage.getOperationCaller(), null, "operationCaller", null, 1, 1, OrocosPeersConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosRequiredElementsEClass, OrocosRequiredElements.class, "OrocosRequiredElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosRequiredElements_RequiredTaskContexts(), theorocoscomponentmodelPackage.getTaskContext(), null, "requiredTaskContexts", null, 0, -1, OrocosRequiredElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrocosRequiredElements_RequiredConnectionPolicies(), theorocoscomponentmodelPackage.getConnectionPolicy(), null, "requiredConnectionPolicies", null, 0, -1, OrocosRequiredElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrocosRequiredElements_RequiredPeersConnection(), theorocoscomponentmodelPackage.getPeersConnection(), null, "requiredPeersConnection", null, 0, -1, OrocosRequiredElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosTemplateSystemModelEClass, OrocosTemplateSystemModel.class, "OrocosTemplateSystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosTemplateSystemModel_System(), theorocoscomponentmodelPackage.getSystem(), null, "system", null, 1, 1, OrocosTemplateSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //rttresolutionmodelsPackageImpl
