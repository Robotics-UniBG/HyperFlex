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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.hyperflex.roscomponentmodel.roscomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class rosresolutionmodelsPackageImpl extends EPackageImpl implements rosresolutionmodelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTransfImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTransfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTransfConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTopicConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosExistingTopicConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosNewTopicConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosServiceConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosRequiredElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTemplateSystemModelEClass = null;

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
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private rosresolutionmodelsPackageImpl() {
		super(eNS_URI, rosresolutionmodelsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link rosresolutionmodelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static rosresolutionmodelsPackage init() {
		if (isInited) return (rosresolutionmodelsPackage)EPackage.Registry.INSTANCE.getEPackage(rosresolutionmodelsPackage.eNS_URI);

		// Obtain or create and register package
		rosresolutionmodelsPackageImpl therosresolutionmodelsPackage = (rosresolutionmodelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof rosresolutionmodelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new rosresolutionmodelsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		resolutionmodelsPackage.eINSTANCE.eClass();
		roscomponentmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		therosresolutionmodelsPackage.createPackageContents();

		// Initialize created meta-data
		therosresolutionmodelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		therosresolutionmodelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(rosresolutionmodelsPackage.eNS_URI, therosresolutionmodelsPackage);
		return therosresolutionmodelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSTransfImplementation() {
		return rosTransfImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTransfImplementation_TargetNode() {
		return (EReference)rosTransfImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSTransfProperty() {
		return rosTransfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTransfProperty_TargetProperty() {
		return (EReference)rosTransfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSTransfConnection() {
		return rosTransfConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTransfConnection_NewConnections() {
		return (EReference)rosTransfConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSConnection() {
		return rosConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSConnection_Name() {
		return (EAttribute)rosConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSTopicConnection() {
		return rosTopicConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTopicConnection_MessageInterface() {
		return (EReference)rosTopicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSExistingTopicConnection() {
		return rosExistingTopicConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSExistingTopicConnection_Topic() {
		return (EReference)rosExistingTopicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSNewTopicConnection() {
		return rosNewTopicConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNewTopicConnection_TopicName() {
		return (EAttribute)rosNewTopicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSServiceConnection() {
		return rosServiceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSServiceConnection_ServiceProducer() {
		return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSServiceConnection_ServiceConsumer() {
		return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSRequiredElements() {
		return rosRequiredElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredElements_RequiredNodes() {
		return (EReference)rosRequiredElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredElements_RequiredTopicConnections() {
		return (EReference)rosRequiredElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredElements_RequiredServiceConnections() {
		return (EReference)rosRequiredElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSTemplateSystemModel() {
		return rosTemplateSystemModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTemplateSystemModel_System() {
		return (EReference)rosTemplateSystemModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelsFactory getrosresolutionmodelsFactory() {
		return (rosresolutionmodelsFactory)getEFactoryInstance();
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
		rosTransfImplementationEClass = createEClass(ROS_TRANSF_IMPLEMENTATION);
		createEReference(rosTransfImplementationEClass, ROS_TRANSF_IMPLEMENTATION__TARGET_NODE);

		rosTransfPropertyEClass = createEClass(ROS_TRANSF_PROPERTY);
		createEReference(rosTransfPropertyEClass, ROS_TRANSF_PROPERTY__TARGET_PROPERTY);

		rosTransfConnectionEClass = createEClass(ROS_TRANSF_CONNECTION);
		createEReference(rosTransfConnectionEClass, ROS_TRANSF_CONNECTION__NEW_CONNECTIONS);

		rosConnectionEClass = createEClass(ROS_CONNECTION);
		createEAttribute(rosConnectionEClass, ROS_CONNECTION__NAME);

		rosTopicConnectionEClass = createEClass(ROS_TOPIC_CONNECTION);
		createEReference(rosTopicConnectionEClass, ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE);

		rosExistingTopicConnectionEClass = createEClass(ROS_EXISTING_TOPIC_CONNECTION);
		createEReference(rosExistingTopicConnectionEClass, ROS_EXISTING_TOPIC_CONNECTION__TOPIC);

		rosNewTopicConnectionEClass = createEClass(ROS_NEW_TOPIC_CONNECTION);
		createEAttribute(rosNewTopicConnectionEClass, ROS_NEW_TOPIC_CONNECTION__TOPIC_NAME);

		rosServiceConnectionEClass = createEClass(ROS_SERVICE_CONNECTION);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE_PRODUCER);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE_CONSUMER);

		rosRequiredElementsEClass = createEClass(ROS_REQUIRED_ELEMENTS);
		createEReference(rosRequiredElementsEClass, ROS_REQUIRED_ELEMENTS__REQUIRED_NODES);
		createEReference(rosRequiredElementsEClass, ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS);
		createEReference(rosRequiredElementsEClass, ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS);

		rosTemplateSystemModelEClass = createEClass(ROS_TEMPLATE_SYSTEM_MODEL);
		createEReference(rosTemplateSystemModelEClass, ROS_TEMPLATE_SYSTEM_MODEL__SYSTEM);
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
		roscomponentmodelPackage theroscomponentmodelPackage = (roscomponentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(roscomponentmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rosTransfImplementationEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfImplementation());
		rosTransfPropertyEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfProperty());
		rosTransfConnectionEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfConnection());
		rosTopicConnectionEClass.getESuperTypes().add(this.getROSConnection());
		rosExistingTopicConnectionEClass.getESuperTypes().add(this.getROSTopicConnection());
		rosNewTopicConnectionEClass.getESuperTypes().add(this.getROSTopicConnection());
		rosServiceConnectionEClass.getESuperTypes().add(this.getROSConnection());
		rosRequiredElementsEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMRequiredElements());
		rosTemplateSystemModelEClass.getESuperTypes().add(theresolutionmodelsPackage.getTemplateSystemModel());

		// Initialize classes and features; add operations and parameters
		initEClass(rosTransfImplementationEClass, ROSTransfImplementation.class, "ROSTransfImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTransfImplementation_TargetNode(), theroscomponentmodelPackage.getNode(), null, "targetNode", null, 1, 1, ROSTransfImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTransfPropertyEClass, ROSTransfProperty.class, "ROSTransfProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTransfProperty_TargetProperty(), theroscomponentmodelPackage.getProperty(), null, "targetProperty", null, 1, 1, ROSTransfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTransfConnectionEClass, ROSTransfConnection.class, "ROSTransfConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTransfConnection_NewConnections(), this.getROSConnection(), null, "newConnections", null, 1, -1, ROSTransfConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosConnectionEClass, ROSConnection.class, "ROSConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, ROSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTopicConnectionEClass, ROSTopicConnection.class, "ROSTopicConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTopicConnection_MessageInterface(), theroscomponentmodelPackage.getMsgInterface(), null, "messageInterface", null, 1, 1, ROSTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosExistingTopicConnectionEClass, ROSExistingTopicConnection.class, "ROSExistingTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSExistingTopicConnection_Topic(), theroscomponentmodelPackage.getTopic(), null, "topic", null, 1, 1, ROSExistingTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewTopicConnectionEClass, ROSNewTopicConnection.class, "ROSNewTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSNewTopicConnection_TopicName(), ecorePackage.getEString(), "topicName", null, 1, 1, ROSNewTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosServiceConnectionEClass, ROSServiceConnection.class, "ROSServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSServiceConnection_ServiceProducer(), theroscomponentmodelPackage.getSrvProducer(), null, "serviceProducer", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSServiceConnection_ServiceConsumer(), theroscomponentmodelPackage.getSrvConsumer(), null, "serviceConsumer", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosRequiredElementsEClass, ROSRequiredElements.class, "ROSRequiredElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSRequiredElements_RequiredNodes(), theroscomponentmodelPackage.getNode(), null, "requiredNodes", null, 0, -1, ROSRequiredElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSRequiredElements_RequiredTopicConnections(), this.getROSTopicConnection(), null, "requiredTopicConnections", null, 0, -1, ROSRequiredElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSRequiredElements_RequiredServiceConnections(), theroscomponentmodelPackage.getWire(), null, "requiredServiceConnections", null, 0, -1, ROSRequiredElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTemplateSystemModelEClass, ROSTemplateSystemModel.class, "ROSTemplateSystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTemplateSystemModel_System(), theroscomponentmodelPackage.getSystem(), null, "system", null, 1, 1, ROSTemplateSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //rosresolutionmodelsPackageImpl
