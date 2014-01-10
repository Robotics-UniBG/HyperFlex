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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import org.hyperflex.resolutionmodels.resolutionmodelsPackage;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSAbstractConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

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
	private EClass rosAbstractConnectionEClass = null;

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
	private EClass rosNewTopicConnectionEClass = null;

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
	private EClass rosServiceConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosNewServiceConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosExistingServiceConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosActionConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosNewActionConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosExistingActionConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosRequiredComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosRequiredConnectionsEClass = null;

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
		RosPackage.eINSTANCE.eClass();
		SmachPackage.eINSTANCE.eClass();

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
	public EClass getROSAbstractConnection() {
		return rosAbstractConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSAbstractConnection_Name() {
		return (EAttribute)rosAbstractConnectionEClass.getEStructuralFeatures().get(0);
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
	public EReference getROSTopicConnection_Publisher() {
		return (EReference)rosTopicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSTopicConnection_Subscriber() {
		return (EReference)rosTopicConnectionEClass.getEStructuralFeatures().get(1);
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
	public EClass getROSServiceConnection() {
		return rosServiceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSServiceConnection_ServiceServer() {
		return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSServiceConnection_ServiceClient() {
		return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSNewServiceConnection() {
		return rosNewServiceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNewServiceConnection_ServiceName() {
		return (EAttribute)rosNewServiceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSExistingServiceConnection() {
		return rosExistingServiceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSExistingServiceConnection_Service() {
		return (EReference)rosExistingServiceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSActionConnection() {
		return rosActionConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSActionConnection_ActionServer() {
		return (EReference)rosActionConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSActionConnection_ActionClient() {
		return (EReference)rosActionConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSNewActionConnection() {
		return rosNewActionConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNewActionConnection_ActionName() {
		return (EAttribute)rosNewActionConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSExistingActionConnection() {
		return rosExistingActionConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSExistingActionConnection_Action() {
		return (EReference)rosExistingActionConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSRequiredComponents() {
		return rosRequiredComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredComponents_ROSNodes() {
		return (EReference)rosRequiredComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSRequiredConnections() {
		return rosRequiredConnectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredConnections_RequiredExistingTopicConnections() {
		return (EReference)rosRequiredConnectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredConnections_RequiredExistingServiceConnections() {
		return (EReference)rosRequiredConnectionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredConnections_RequiredExistingActionConnections() {
		return (EReference)rosRequiredConnectionsEClass.getEStructuralFeatures().get(2);
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

		rosAbstractConnectionEClass = createEClass(ROS_ABSTRACT_CONNECTION);
		createEAttribute(rosAbstractConnectionEClass, ROS_ABSTRACT_CONNECTION__NAME);

		rosTopicConnectionEClass = createEClass(ROS_TOPIC_CONNECTION);
		createEReference(rosTopicConnectionEClass, ROS_TOPIC_CONNECTION__PUBLISHER);
		createEReference(rosTopicConnectionEClass, ROS_TOPIC_CONNECTION__SUBSCRIBER);

		rosNewTopicConnectionEClass = createEClass(ROS_NEW_TOPIC_CONNECTION);
		createEAttribute(rosNewTopicConnectionEClass, ROS_NEW_TOPIC_CONNECTION__TOPIC_NAME);

		rosExistingTopicConnectionEClass = createEClass(ROS_EXISTING_TOPIC_CONNECTION);
		createEReference(rosExistingTopicConnectionEClass, ROS_EXISTING_TOPIC_CONNECTION__TOPIC);

		rosServiceConnectionEClass = createEClass(ROS_SERVICE_CONNECTION);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE_SERVER);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE_CLIENT);

		rosNewServiceConnectionEClass = createEClass(ROS_NEW_SERVICE_CONNECTION);
		createEAttribute(rosNewServiceConnectionEClass, ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME);

		rosExistingServiceConnectionEClass = createEClass(ROS_EXISTING_SERVICE_CONNECTION);
		createEReference(rosExistingServiceConnectionEClass, ROS_EXISTING_SERVICE_CONNECTION__SERVICE);

		rosActionConnectionEClass = createEClass(ROS_ACTION_CONNECTION);
		createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__ACTION_SERVER);
		createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__ACTION_CLIENT);

		rosNewActionConnectionEClass = createEClass(ROS_NEW_ACTION_CONNECTION);
		createEAttribute(rosNewActionConnectionEClass, ROS_NEW_ACTION_CONNECTION__ACTION_NAME);

		rosExistingActionConnectionEClass = createEClass(ROS_EXISTING_ACTION_CONNECTION);
		createEReference(rosExistingActionConnectionEClass, ROS_EXISTING_ACTION_CONNECTION__ACTION);

		rosRequiredComponentsEClass = createEClass(ROS_REQUIRED_COMPONENTS);
		createEReference(rosRequiredComponentsEClass, ROS_REQUIRED_COMPONENTS__ROS_NODES);

		rosRequiredConnectionsEClass = createEClass(ROS_REQUIRED_CONNECTIONS);
		createEReference(rosRequiredConnectionsEClass, ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS);
		createEReference(rosRequiredConnectionsEClass, ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS);
		createEReference(rosRequiredConnectionsEClass, ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS);
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
		RosPackage theRosPackage = (RosPackage)EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rosTransfImplementationEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfImplementation());
		rosTransfPropertyEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfProperty());
		rosTransfConnectionEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMTransfConnection());
		rosTopicConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosNewTopicConnectionEClass.getESuperTypes().add(this.getROSTopicConnection());
		rosExistingTopicConnectionEClass.getESuperTypes().add(this.getROSTopicConnection());
		rosServiceConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosNewServiceConnectionEClass.getESuperTypes().add(this.getROSServiceConnection());
		rosExistingServiceConnectionEClass.getESuperTypes().add(this.getROSServiceConnection());
		rosActionConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosNewActionConnectionEClass.getESuperTypes().add(this.getROSActionConnection());
		rosExistingActionConnectionEClass.getESuperTypes().add(this.getROSActionConnection());
		rosRequiredComponentsEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMRequiredComponents());
		rosRequiredConnectionsEClass.getESuperTypes().add(theresolutionmodelsPackage.getRMRequiredConnections());

		// Initialize classes and features; add operations and parameters
		initEClass(rosTransfImplementationEClass, ROSTransfImplementation.class, "ROSTransfImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTransfImplementation_TargetNode(), theRosPackage.getNode(), null, "targetNode", null, 1, 1, ROSTransfImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTransfPropertyEClass, ROSTransfProperty.class, "ROSTransfProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTransfProperty_TargetProperty(), theRosPackage.getParameter(), null, "targetProperty", null, 1, 1, ROSTransfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTransfConnectionEClass, ROSTransfConnection.class, "ROSTransfConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTransfConnection_NewConnections(), this.getROSAbstractConnection(), null, "newConnections", null, 1, -1, ROSTransfConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosAbstractConnectionEClass, ROSAbstractConnection.class, "ROSAbstractConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSAbstractConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, ROSAbstractConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTopicConnectionEClass, ROSTopicConnection.class, "ROSTopicConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTopicConnection_Publisher(), theRosPackage.getPublisher(), null, "publisher", null, 1, 1, ROSTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSTopicConnection_Subscriber(), theRosPackage.getSubscriber(), null, "subscriber", null, 1, 1, ROSTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewTopicConnectionEClass, ROSNewTopicConnection.class, "ROSNewTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSNewTopicConnection_TopicName(), ecorePackage.getEString(), "topicName", null, 1, 1, ROSNewTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosExistingTopicConnectionEClass, ROSExistingTopicConnection.class, "ROSExistingTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSExistingTopicConnection_Topic(), theRosPackage.getTopic(), null, "topic", null, 1, 1, ROSExistingTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosServiceConnectionEClass, ROSServiceConnection.class, "ROSServiceConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSServiceConnection_ServiceServer(), theRosPackage.getServiceServer(), null, "serviceServer", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSServiceConnection_ServiceClient(), theRosPackage.getServiceClient(), null, "serviceClient", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewServiceConnectionEClass, ROSNewServiceConnection.class, "ROSNewServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSNewServiceConnection_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, ROSNewServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosExistingServiceConnectionEClass, ROSExistingServiceConnection.class, "ROSExistingServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSExistingServiceConnection_Service(), theRosPackage.getService(), null, "service", null, 1, 1, ROSExistingServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosActionConnectionEClass, ROSActionConnection.class, "ROSActionConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSActionConnection_ActionServer(), theRosPackage.getActionServer(), null, "actionServer", null, 1, 1, ROSActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSActionConnection_ActionClient(), theRosPackage.getActionClient(), null, "actionClient", null, 1, 1, ROSActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewActionConnectionEClass, ROSNewActionConnection.class, "ROSNewActionConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSNewActionConnection_ActionName(), ecorePackage.getEString(), "actionName", null, 1, 1, ROSNewActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosExistingActionConnectionEClass, ROSExistingActionConnection.class, "ROSExistingActionConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSExistingActionConnection_Action(), theRosPackage.getAction(), null, "action", null, 1, 1, ROSExistingActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosRequiredComponentsEClass, ROSRequiredComponents.class, "ROSRequiredComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSRequiredComponents_ROSNodes(), theRosPackage.getNode(), null, "ROSNodes", null, 1, -1, ROSRequiredComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosRequiredConnectionsEClass, ROSRequiredConnections.class, "ROSRequiredConnections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSRequiredConnections_RequiredExistingTopicConnections(), this.getROSExistingTopicConnection(), null, "requiredExistingTopicConnections", null, 0, -1, ROSRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSRequiredConnections_RequiredExistingServiceConnections(), this.getROSExistingServiceConnection(), null, "requiredExistingServiceConnections", null, 0, -1, ROSRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSRequiredConnections_RequiredExistingActionConnections(), this.getROSExistingActionConnection(), null, "requiredExistingActionConnections", null, 0, -1, ROSRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //rosresolutionmodelsPackageImpl
