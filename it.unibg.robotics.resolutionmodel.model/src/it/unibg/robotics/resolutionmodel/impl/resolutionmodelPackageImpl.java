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
package it.unibg.robotics.resolutionmodel.impl;

import it.unibg.robotics.featuremodels.featuremodelsPackage;

import it.unibg.robotics.resolutionmodel.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodel.RMRequiredComponent;
import it.unibg.robotics.resolutionmodel.RMRequiredConnection;
import it.unibg.robotics.resolutionmodel.RMResolutionElement;
import it.unibg.robotics.resolutionmodel.RMTransfConnection;
import it.unibg.robotics.resolutionmodel.RMTransfImplementation;
import it.unibg.robotics.resolutionmodel.RMTransfProperty;
import it.unibg.robotics.resolutionmodel.ResolutionModel;
import it.unibg.robotics.resolutionmodel.resolutionmodelFactory;
import it.unibg.robotics.resolutionmodel.resolutionmodelPackage;

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
public class resolutionmodelPackageImpl extends EPackageImpl implements resolutionmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmResolutionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmAbstractTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmRequiredComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmRequiredConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmTransfImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmTransfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmTransfConnectionEClass = null;

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
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private resolutionmodelPackageImpl() {
		super(eNS_URI, resolutionmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link resolutionmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static resolutionmodelPackage init() {
		if (isInited) return (resolutionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(resolutionmodelPackage.eNS_URI);

		// Obtain or create and register package
		resolutionmodelPackageImpl theresolutionmodelPackage = (resolutionmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof resolutionmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new resolutionmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		featuremodelsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theresolutionmodelPackage.createPackageContents();

		// Initialize created meta-data
		theresolutionmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theresolutionmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(resolutionmodelPackage.eNS_URI, theresolutionmodelPackage);
		return theresolutionmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionModel() {
		return resolutionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionModel_Name() {
		return (EAttribute)resolutionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionModel_ResolutionElements() {
		return (EReference)resolutionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMResolutionElement() {
		return rmResolutionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMResolutionElement_Transformations() {
		return (EReference)rmResolutionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMResolutionElement_RequiredComponents() {
		return (EReference)rmResolutionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMResolutionElement_RequiredConnections() {
		return (EReference)rmResolutionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMResolutionElement_Feature() {
		return (EReference)rmResolutionElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMResolutionElement_Name() {
		return (EAttribute)rmResolutionElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMResolutionElement_Description() {
		return (EAttribute)rmResolutionElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMAbstractTransformation() {
		return rmAbstractTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMAbstractTransformation_Name() {
		return (EAttribute)rmAbstractTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMAbstractTransformation_Description() {
		return (EAttribute)rmAbstractTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMRequiredComponent() {
		return rmRequiredComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMRequiredConnection() {
		return rmRequiredConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMTransfImplementation() {
		return rmTransfImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMTransfImplementation_ClassNamespace() {
		return (EAttribute)rmTransfImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMTransfImplementation_ClassName() {
		return (EAttribute)rmTransfImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMTransfProperty() {
		return rmTransfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMTransfProperty_Value() {
		return (EAttribute)rmTransfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMTransfConnection() {
		return rmTransfConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resolutionmodelFactory getresolutionmodelFactory() {
		return (resolutionmodelFactory)getEFactoryInstance();
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
		resolutionModelEClass = createEClass(RESOLUTION_MODEL);
		createEAttribute(resolutionModelEClass, RESOLUTION_MODEL__NAME);
		createEReference(resolutionModelEClass, RESOLUTION_MODEL__RESOLUTION_ELEMENTS);

		rmResolutionElementEClass = createEClass(RM_RESOLUTION_ELEMENT);
		createEReference(rmResolutionElementEClass, RM_RESOLUTION_ELEMENT__TRANSFORMATIONS);
		createEReference(rmResolutionElementEClass, RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS);
		createEReference(rmResolutionElementEClass, RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS);
		createEReference(rmResolutionElementEClass, RM_RESOLUTION_ELEMENT__FEATURE);
		createEAttribute(rmResolutionElementEClass, RM_RESOLUTION_ELEMENT__NAME);
		createEAttribute(rmResolutionElementEClass, RM_RESOLUTION_ELEMENT__DESCRIPTION);

		rmAbstractTransformationEClass = createEClass(RM_ABSTRACT_TRANSFORMATION);
		createEAttribute(rmAbstractTransformationEClass, RM_ABSTRACT_TRANSFORMATION__NAME);
		createEAttribute(rmAbstractTransformationEClass, RM_ABSTRACT_TRANSFORMATION__DESCRIPTION);

		rmRequiredComponentEClass = createEClass(RM_REQUIRED_COMPONENT);

		rmRequiredConnectionEClass = createEClass(RM_REQUIRED_CONNECTION);

		rmTransfImplementationEClass = createEClass(RM_TRANSF_IMPLEMENTATION);
		createEAttribute(rmTransfImplementationEClass, RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE);
		createEAttribute(rmTransfImplementationEClass, RM_TRANSF_IMPLEMENTATION__CLASS_NAME);

		rmTransfPropertyEClass = createEClass(RM_TRANSF_PROPERTY);
		createEAttribute(rmTransfPropertyEClass, RM_TRANSF_PROPERTY__VALUE);

		rmTransfConnectionEClass = createEClass(RM_TRANSF_CONNECTION);
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
		featuremodelsPackage thefeaturemodelsPackage = (featuremodelsPackage)EPackage.Registry.INSTANCE.getEPackage(featuremodelsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rmTransfImplementationEClass.getESuperTypes().add(this.getRMAbstractTransformation());
		rmTransfPropertyEClass.getESuperTypes().add(this.getRMAbstractTransformation());
		rmTransfConnectionEClass.getESuperTypes().add(this.getRMAbstractTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(resolutionModelEClass, ResolutionModel.class, "ResolutionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolutionModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResolutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolutionModel_ResolutionElements(), this.getRMResolutionElement(), null, "resolutionElements", null, 1, -1, ResolutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rmResolutionElementEClass, RMResolutionElement.class, "RMResolutionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRMResolutionElement_Transformations(), this.getRMAbstractTransformation(), null, "transformations", null, 0, -1, RMResolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRMResolutionElement_RequiredComponents(), this.getRMRequiredComponent(), null, "requiredComponents", null, 0, -1, RMResolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRMResolutionElement_RequiredConnections(), this.getRMRequiredConnection(), null, "requiredConnections", null, 0, -1, RMResolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRMResolutionElement_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 1, 1, RMResolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRMResolutionElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, RMResolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRMResolutionElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, RMResolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rmAbstractTransformationEClass, RMAbstractTransformation.class, "RMAbstractTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRMAbstractTransformation_Name(), ecorePackage.getEString(), "name", null, 1, 1, RMAbstractTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRMAbstractTransformation_Description(), ecorePackage.getEString(), "description", null, 0, 1, RMAbstractTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rmRequiredComponentEClass, RMRequiredComponent.class, "RMRequiredComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rmRequiredConnectionEClass, RMRequiredConnection.class, "RMRequiredConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rmTransfImplementationEClass, RMTransfImplementation.class, "RMTransfImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRMTransfImplementation_ClassNamespace(), ecorePackage.getEString(), "classNamespace", null, 1, 1, RMTransfImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRMTransfImplementation_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, RMTransfImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rmTransfPropertyEClass, RMTransfProperty.class, "RMTransfProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRMTransfProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, RMTransfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rmTransfConnectionEClass, RMTransfConnection.class, "RMTransfConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //resolutionmodelPackageImpl
