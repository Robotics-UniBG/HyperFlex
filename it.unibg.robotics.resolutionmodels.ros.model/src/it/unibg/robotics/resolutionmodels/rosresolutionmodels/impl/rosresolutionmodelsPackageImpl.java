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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl;

import it.unibg.robotics.resolutionmodels.resolutionmodelsPackage;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ros.model.ros.RosPackage;
import org.ros.model.smach.SmachPackage;

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
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#eNS_URI
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
	public EReference getROSTopicConnection_Topic() {
		return (EReference)rosTopicConnectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getROSNewTopicConnection_Publisher() {
		return (EReference)rosNewTopicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNewTopicConnection_Subscriber() {
		return (EReference)rosNewTopicConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNewTopicConnection_TopicName() {
		return (EAttribute)rosNewTopicConnectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getROSServiceConnection_Service() {
		return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getROSNewServiceConnection_ServiceServer() {
		return (EReference)rosNewServiceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNewServiceConnection_ServiceClient() {
		return (EReference)rosNewServiceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNewServiceConnection_ServiceName() {
		return (EAttribute)rosNewServiceConnectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getROSActionConnection_Action() {
		return (EReference)rosActionConnectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getROSNewActionConnection_ActionServer() {
		return (EReference)rosNewActionConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSNewActionConnection_ActionClient() {
		return (EReference)rosNewActionConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSNewActionConnection_ActionName() {
		return (EAttribute)rosNewActionConnectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getROSRequiredConnections_RequiredTopicConnections() {
		return (EReference)rosRequiredConnectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredConnections_RequiredServiceConnections() {
		return (EReference)rosRequiredConnectionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSRequiredConnections_RequiredActionConnections() {
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
		createEReference(rosTopicConnectionEClass, ROS_TOPIC_CONNECTION__TOPIC);

		rosNewTopicConnectionEClass = createEClass(ROS_NEW_TOPIC_CONNECTION);
		createEReference(rosNewTopicConnectionEClass, ROS_NEW_TOPIC_CONNECTION__PUBLISHER);
		createEReference(rosNewTopicConnectionEClass, ROS_NEW_TOPIC_CONNECTION__SUBSCRIBER);
		createEAttribute(rosNewTopicConnectionEClass, ROS_NEW_TOPIC_CONNECTION__TOPIC_NAME);

		rosServiceConnectionEClass = createEClass(ROS_SERVICE_CONNECTION);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE_SERVER);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE_CLIENT);
		createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__SERVICE);

		rosNewServiceConnectionEClass = createEClass(ROS_NEW_SERVICE_CONNECTION);
		createEReference(rosNewServiceConnectionEClass, ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER);
		createEReference(rosNewServiceConnectionEClass, ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT);
		createEAttribute(rosNewServiceConnectionEClass, ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME);

		rosActionConnectionEClass = createEClass(ROS_ACTION_CONNECTION);
		createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__ACTION_SERVER);
		createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__ACTION_CLIENT);
		createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__ACTION);

		rosNewActionConnectionEClass = createEClass(ROS_NEW_ACTION_CONNECTION);
		createEReference(rosNewActionConnectionEClass, ROS_NEW_ACTION_CONNECTION__ACTION_SERVER);
		createEReference(rosNewActionConnectionEClass, ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT);
		createEAttribute(rosNewActionConnectionEClass, ROS_NEW_ACTION_CONNECTION__ACTION_NAME);

		rosRequiredComponentsEClass = createEClass(ROS_REQUIRED_COMPONENTS);
		createEReference(rosRequiredComponentsEClass, ROS_REQUIRED_COMPONENTS__ROS_NODES);

		rosRequiredConnectionsEClass = createEClass(ROS_REQUIRED_CONNECTIONS);
		createEReference(rosRequiredConnectionsEClass, ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS);
		createEReference(rosRequiredConnectionsEClass, ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS);
		createEReference(rosRequiredConnectionsEClass, ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS);
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
		rosNewTopicConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosServiceConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosNewServiceConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosActionConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
		rosNewActionConnectionEClass.getESuperTypes().add(this.getROSAbstractConnection());
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

		initEClass(rosTopicConnectionEClass, ROSTopicConnection.class, "ROSTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSTopicConnection_Publisher(), theRosPackage.getPublisher(), null, "publisher", null, 1, 1, ROSTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSTopicConnection_Subscriber(), theRosPackage.getSubscriber(), null, "subscriber", null, 1, 1, ROSTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSTopicConnection_Topic(), theRosPackage.getTopic(), null, "topic", null, 1, 1, ROSTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewTopicConnectionEClass, ROSNewTopicConnection.class, "ROSNewTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSNewTopicConnection_Publisher(), theRosPackage.getPublisher(), null, "publisher", null, 1, 1, ROSNewTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNewTopicConnection_Subscriber(), theRosPackage.getSubscriber(), null, "subscriber", null, 1, 1, ROSNewTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNewTopicConnection_TopicName(), ecorePackage.getEString(), "topicName", null, 1, 1, ROSNewTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosServiceConnectionEClass, ROSServiceConnection.class, "ROSServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSServiceConnection_ServiceServer(), theRosPackage.getServiceServer(), null, "serviceServer", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSServiceConnection_ServiceClient(), theRosPackage.getServiceClient(), null, "serviceClient", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSServiceConnection_Service(), theRosPackage.getService(), null, "service", null, 1, 1, ROSServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewServiceConnectionEClass, ROSNewServiceConnection.class, "ROSNewServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSNewServiceConnection_ServiceServer(), theRosPackage.getServiceServer(), null, "serviceServer", null, 1, 1, ROSNewServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNewServiceConnection_ServiceClient(), theRosPackage.getServiceClient(), null, "serviceClient", null, 1, 1, ROSNewServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNewServiceConnection_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, ROSNewServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosActionConnectionEClass, ROSActionConnection.class, "ROSActionConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSActionConnection_ActionServer(), theRosPackage.getActionServer(), null, "actionServer", null, 1, 1, ROSActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSActionConnection_ActionClient(), theRosPackage.getActionClient(), null, "actionClient", null, 1, 1, ROSActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSActionConnection_Action(), theRosPackage.getAction(), null, "action", null, 1, 1, ROSActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosNewActionConnectionEClass, ROSNewActionConnection.class, "ROSNewActionConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSNewActionConnection_ActionServer(), theRosPackage.getActionServer(), null, "actionServer", null, 1, 1, ROSNewActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSNewActionConnection_ActionClient(), theRosPackage.getActionClient(), null, "actionClient", null, 1, 1, ROSNewActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROSNewActionConnection_ActionName(), ecorePackage.getEString(), "actionName", null, 1, 1, ROSNewActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosRequiredComponentsEClass, ROSRequiredComponents.class, "ROSRequiredComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSRequiredComponents_ROSNodes(), theRosPackage.getNode(), null, "ROSNodes", null, 1, -1, ROSRequiredComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosRequiredConnectionsEClass, ROSRequiredConnections.class, "ROSRequiredConnections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSRequiredConnections_RequiredTopicConnections(), this.getROSTopicConnection(), null, "requiredTopicConnections", null, 0, -1, ROSRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSRequiredConnections_RequiredServiceConnections(), this.getROSServiceConnection(), null, "requiredServiceConnections", null, 0, -1, ROSRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSRequiredConnections_RequiredActionConnections(), this.getROSActionConnection(), null, "requiredActionConnections", null, 0, -1, ROSRequiredConnections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //rosresolutionmodelsPackageImpl
