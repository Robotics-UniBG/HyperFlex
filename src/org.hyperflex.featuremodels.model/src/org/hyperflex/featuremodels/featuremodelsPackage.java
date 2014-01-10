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
package org.hyperflex.featuremodels;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.hyperflex.featuremodels.featuremodelsFactory
 * @model kind="package"
 * @generated
 */
public interface featuremodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hyperflex.org/featuremodels";

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
	featuremodelsPackage eINSTANCE = org.hyperflex.featuremodels.impl.featuremodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.FeatureImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Feature Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_PARENT = 4;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTAINERS = 5;

	/**
	 * The feature id for the '<em><b>Container Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTAINER_PARENT = 6;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOWER_BOUND = 7;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UPPER_BOUND = 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = 9;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.ContainmentAssociationImpl <em>Containment Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.ContainmentAssociationImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getContainmentAssociation()
	 * @generated
	 */
	int CONTAINMENT_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ASSOCIATION__SUB_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ASSOCIATION__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ASSOCIATION__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ASSOCIATION__LOWER_BOUND = 3;

	/**
	 * The number of structural features of the '<em>Containment Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ASSOCIATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.FeatureModelImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.ConstraintImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RULE = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.InstanceImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Descritpion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__DESCRITPION = 1;

	/**
	 * The feature id for the '<em><b>Selected Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SELECTED_FEATURES = 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.AttributeImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.impl.SimpleAttributeImpl
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getSimpleAttribute()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.featuremodels.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.featuremodels.ConstraintType
	 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.hyperflex.featuremodels.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Feature#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.hyperflex.featuremodels.Feature#isRoot()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Feature#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.hyperflex.featuremodels.Feature#isRequired()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.featuremodels.Feature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Features</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getSubFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SubFeatures();

	/**
	 * Returns the meta object for the container reference '{@link org.hyperflex.featuremodels.Feature#getFeatureParent <em>Feature Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature Parent</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getFeatureParent()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureParent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.featuremodels.Feature#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getContainers()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Containers();

	/**
	 * Returns the meta object for the container reference '{@link org.hyperflex.featuremodels.Feature#getContainerParent <em>Container Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Parent</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getContainerParent()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ContainerParent();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Feature#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getLowerBound()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Feature#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getUpperBound()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_UpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.featuremodels.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.hyperflex.featuremodels.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.ContainmentAssociation <em>Containment Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Association</em>'.
	 * @see org.hyperflex.featuremodels.ContainmentAssociation
	 * @generated
	 */
	EClass getContainmentAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.featuremodels.ContainmentAssociation#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Features</em>'.
	 * @see org.hyperflex.featuremodels.ContainmentAssociation#getSubFeatures()
	 * @see #getContainmentAssociation()
	 * @generated
	 */
	EReference getContainmentAssociation_SubFeatures();

	/**
	 * Returns the meta object for the container reference '{@link org.hyperflex.featuremodels.ContainmentAssociation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.hyperflex.featuremodels.ContainmentAssociation#getParent()
	 * @see #getContainmentAssociation()
	 * @generated
	 */
	EReference getContainmentAssociation_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.ContainmentAssociation#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.hyperflex.featuremodels.ContainmentAssociation#getUpperBound()
	 * @see #getContainmentAssociation()
	 * @generated
	 */
	EAttribute getContainmentAssociation_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.ContainmentAssociation#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.hyperflex.featuremodels.ContainmentAssociation#getLowerBound()
	 * @see #getContainmentAssociation()
	 * @generated
	 */
	EAttribute getContainmentAssociation_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see org.hyperflex.featuremodels.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.featuremodels.FeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see org.hyperflex.featuremodels.FeatureModel#getRootFeature()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.featuremodels.FeatureModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.hyperflex.featuremodels.FeatureModel#getConstraints()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.featuremodels.FeatureModel#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.hyperflex.featuremodels.FeatureModel#getInstances()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Instances();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.FeatureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.featuremodels.FeatureModel#getName()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EAttribute getFeatureModel_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.hyperflex.featuremodels.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.featuremodels.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.featuremodels.Constraint#getType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Constraint#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see org.hyperflex.featuremodels.Constraint#getRule()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Rule();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.hyperflex.featuremodels.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Instance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hyperflex.featuremodels.Instance#getId()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Instance#getDescritpion <em>Descritpion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descritpion</em>'.
	 * @see org.hyperflex.featuremodels.Instance#getDescritpion()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Descritpion();

	/**
	 * Returns the meta object for the reference list '{@link org.hyperflex.featuremodels.Instance#getSelectedFeatures <em>Selected Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Features</em>'.
	 * @see org.hyperflex.featuremodels.Instance#getSelectedFeatures()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_SelectedFeatures();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.hyperflex.featuremodels.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.featuremodels.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.featuremodels.SimpleAttribute <em>Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute</em>'.
	 * @see org.hyperflex.featuremodels.SimpleAttribute
	 * @generated
	 */
	EClass getSimpleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.SimpleAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.featuremodels.SimpleAttribute#getType()
	 * @see #getSimpleAttribute()
	 * @generated
	 */
	EAttribute getSimpleAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.featuremodels.SimpleAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hyperflex.featuremodels.SimpleAttribute#getValue()
	 * @see #getSimpleAttribute()
	 * @generated
	 */
	EAttribute getSimpleAttribute_Value();

	/**
	 * Returns the meta object for enum '{@link org.hyperflex.featuremodels.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see org.hyperflex.featuremodels.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	featuremodelsFactory getfeaturemodelsFactory();

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
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.FeatureImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ROOT = eINSTANCE.getFeature_Root();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__REQUIRED = eINSTANCE.getFeature_Required();

		/**
		 * The meta object literal for the '<em><b>Sub Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUB_FEATURES = eINSTANCE.getFeature_SubFeatures();

		/**
		 * The meta object literal for the '<em><b>Feature Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_PARENT = eINSTANCE.getFeature_FeatureParent();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONTAINERS = eINSTANCE.getFeature_Containers();

		/**
		 * The meta object literal for the '<em><b>Container Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONTAINER_PARENT = eINSTANCE.getFeature_ContainerParent();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__LOWER_BOUND = eINSTANCE.getFeature_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__UPPER_BOUND = eINSTANCE.getFeature_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.ContainmentAssociationImpl <em>Containment Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.ContainmentAssociationImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getContainmentAssociation()
		 * @generated
		 */
		EClass CONTAINMENT_ASSOCIATION = eINSTANCE.getContainmentAssociation();

		/**
		 * The meta object literal for the '<em><b>Sub Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_ASSOCIATION__SUB_FEATURES = eINSTANCE.getContainmentAssociation_SubFeatures();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_ASSOCIATION__PARENT = eINSTANCE.getContainmentAssociation_Parent();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_ASSOCIATION__UPPER_BOUND = eINSTANCE.getContainmentAssociation_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_ASSOCIATION__LOWER_BOUND = eINSTANCE.getContainmentAssociation_LowerBound();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.FeatureModelImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONSTRAINTS = eINSTANCE.getFeatureModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__INSTANCES = eINSTANCE.getFeatureModel_Instances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL__NAME = eINSTANCE.getFeatureModel_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.ConstraintImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RULE = eINSTANCE.getConstraint_Rule();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.InstanceImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__ID = eINSTANCE.getInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Descritpion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__DESCRITPION = eINSTANCE.getInstance_Descritpion();

		/**
		 * The meta object literal for the '<em><b>Selected Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__SELECTED_FEATURES = eINSTANCE.getInstance_SelectedFeatures();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.AttributeImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.impl.SimpleAttributeImpl
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getSimpleAttribute()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ATTRIBUTE__TYPE = eINSTANCE.getSimpleAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ATTRIBUTE__VALUE = eINSTANCE.getSimpleAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.hyperflex.featuremodels.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.featuremodels.ConstraintType
		 * @see org.hyperflex.featuremodels.impl.featuremodelsPackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

	}

} //featuremodelsPackage
