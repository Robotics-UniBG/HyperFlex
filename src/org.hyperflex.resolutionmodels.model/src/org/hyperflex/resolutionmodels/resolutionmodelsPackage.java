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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package org.hyperflex.resolutionmodels;

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
 * @see org.hyperflex.resolutionmodels.resolutionmodelsFactory
 * @model kind="package"
 * @generated
 */
public interface resolutionmodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resolutionmodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hyperflex.org/resolutionmodels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resolutionmodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	resolutionmodelsPackage eINSTANCE = org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.ResolutionModelImpl <em>Resolution Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.ResolutionModelImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getResolutionModel()
	 * @generated
	 */
	int RESOLUTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resolution Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__RESOLUTION_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__FEATURE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Template System Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Resolution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl <em>RM Resolution Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMResolutionElement()
	 * @generated
	 */
	int RM_RESOLUTION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__TRANSFORMATIONS = 0;

	/**
	 * The feature id for the '<em><b>Required Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Active If Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED = 4;

	/**
	 * The number of structural features of the '<em>RM Resolution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.RMTransformationImpl <em>RM Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.RMTransformationImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransformation()
	 * @generated
	 */
	int RM_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSFORMATION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>RM Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.RMRequiredElementsImpl <em>RM Required Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.RMRequiredElementsImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMRequiredElements()
	 * @generated
	 */
	int RM_REQUIRED_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>RM Required Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_REQUIRED_ELEMENTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.RMTransfImplementationImpl <em>RM Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.RMTransfImplementationImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfImplementation()
	 * @generated
	 */
	int RM_TRANSF_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__NAME = RM_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__DESCRIPTION = RM_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = RM_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__CLASS_NAME = RM_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RM Transf Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT = RM_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.RMTransfPropertyImpl <em>RM Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.RMTransfPropertyImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfProperty()
	 * @generated
	 */
	int RM_TRANSF_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY__NAME = RM_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY__DESCRIPTION = RM_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY__VALUE = RM_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RM Transf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY_FEATURE_COUNT = RM_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.RMTransfConnectionImpl <em>RM Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.RMTransfConnectionImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfConnection()
	 * @generated
	 */
	int RM_TRANSF_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_CONNECTION__NAME = RM_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_CONNECTION__DESCRIPTION = RM_TRANSFORMATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>RM Transf Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_CONNECTION_FEATURE_COUNT = RM_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.resolutionmodels.impl.TemplateSystemModelImpl <em>Template System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.resolutionmodels.impl.TemplateSystemModelImpl
	 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getTemplateSystemModel()
	 * @generated
	 */
	int TEMPLATE_SYSTEM_MODEL = 7;

	/**
	 * The number of structural features of the '<em>Template System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SYSTEM_MODEL_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.ResolutionModel <em>Resolution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Model</em>'.
	 * @see org.hyperflex.resolutionmodels.ResolutionModel
	 * @generated
	 */
	EClass getResolutionModel();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.ResolutionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.resolutionmodels.ResolutionModel#getName()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EAttribute getResolutionModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.resolutionmodels.ResolutionModel#getResolutionElements <em>Resolution Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolution Elements</em>'.
	 * @see org.hyperflex.resolutionmodels.ResolutionModel#getResolutionElements()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_ResolutionElements();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.ResolutionModel#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Model</em>'.
	 * @see org.hyperflex.resolutionmodels.ResolutionModel#getFeatureModel()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_FeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.resolutionmodels.ResolutionModel#getTemplateSystemModel <em>Template System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template System Model</em>'.
	 * @see org.hyperflex.resolutionmodels.ResolutionModel#getTemplateSystemModel()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_TemplateSystemModel();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.RMResolutionElement <em>RM Resolution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Resolution Element</em>'.
	 * @see org.hyperflex.resolutionmodels.RMResolutionElement
	 * @generated
	 */
	EClass getRMResolutionElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.hyperflex.resolutionmodels.RMResolutionElement#getTransformations()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_Transformations();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getRequiredElements <em>Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Elements</em>'.
	 * @see org.hyperflex.resolutionmodels.RMResolutionElement#getRequiredElements()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_RequiredElements();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.hyperflex.resolutionmodels.RMResolutionElement#getFeature()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.resolutionmodels.RMResolutionElement#getName()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EAttribute getRMResolutionElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMResolutionElement#isActiveIfSelected <em>Active If Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active If Selected</em>'.
	 * @see org.hyperflex.resolutionmodels.RMResolutionElement#isActiveIfSelected()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EAttribute getRMResolutionElement_ActiveIfSelected();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.RMTransformation <em>RM Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transformation</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransformation
	 * @generated
	 */
	EClass getRMTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMTransformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransformation#getName()
	 * @see #getRMTransformation()
	 * @generated
	 */
	EAttribute getRMTransformation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMTransformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransformation#getDescription()
	 * @see #getRMTransformation()
	 * @generated
	 */
	EAttribute getRMTransformation_Description();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.RMRequiredElements <em>RM Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Required Elements</em>'.
	 * @see org.hyperflex.resolutionmodels.RMRequiredElements
	 * @generated
	 */
	EClass getRMRequiredElements();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.RMTransfImplementation <em>RM Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transf Implementation</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransfImplementation
	 * @generated
	 */
	EClass getRMTransfImplementation();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMTransfImplementation#getClassNamespace <em>Class Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Namespace</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransfImplementation#getClassNamespace()
	 * @see #getRMTransfImplementation()
	 * @generated
	 */
	EAttribute getRMTransfImplementation_ClassNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMTransfImplementation#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransfImplementation#getClassName()
	 * @see #getRMTransfImplementation()
	 * @generated
	 */
	EAttribute getRMTransfImplementation_ClassName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.RMTransfProperty <em>RM Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transf Property</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransfProperty
	 * @generated
	 */
	EClass getRMTransfProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.resolutionmodels.RMTransfProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransfProperty#getValue()
	 * @see #getRMTransfProperty()
	 * @generated
	 */
	EAttribute getRMTransfProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.RMTransfConnection <em>RM Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transf Connection</em>'.
	 * @see org.hyperflex.resolutionmodels.RMTransfConnection
	 * @generated
	 */
	EClass getRMTransfConnection();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.resolutionmodels.TemplateSystemModel <em>Template System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template System Model</em>'.
	 * @see org.hyperflex.resolutionmodels.TemplateSystemModel
	 * @generated
	 */
	EClass getTemplateSystemModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	resolutionmodelsFactory getresolutionmodelsFactory();

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
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.ResolutionModelImpl <em>Resolution Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.ResolutionModelImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getResolutionModel()
		 * @generated
		 */
		EClass RESOLUTION_MODEL = eINSTANCE.getResolutionModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION_MODEL__NAME = eINSTANCE.getResolutionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Resolution Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_MODEL__RESOLUTION_ELEMENTS = eINSTANCE.getResolutionModel_ResolutionElements();

		/**
		 * The meta object literal for the '<em><b>Feature Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_MODEL__FEATURE_MODEL = eINSTANCE.getResolutionModel_FeatureModel();

		/**
		 * The meta object literal for the '<em><b>Template System Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL = eINSTANCE.getResolutionModel_TemplateSystemModel();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl <em>RM Resolution Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMResolutionElement()
		 * @generated
		 */
		EClass RM_RESOLUTION_ELEMENT = eINSTANCE.getRMResolutionElement();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_RESOLUTION_ELEMENT__TRANSFORMATIONS = eINSTANCE.getRMResolutionElement_Transformations();

		/**
		 * The meta object literal for the '<em><b>Required Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS = eINSTANCE.getRMResolutionElement_RequiredElements();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_RESOLUTION_ELEMENT__FEATURE = eINSTANCE.getRMResolutionElement_Feature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_RESOLUTION_ELEMENT__NAME = eINSTANCE.getRMResolutionElement_Name();

		/**
		 * The meta object literal for the '<em><b>Active If Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED = eINSTANCE.getRMResolutionElement_ActiveIfSelected();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.RMTransformationImpl <em>RM Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.RMTransformationImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransformation()
		 * @generated
		 */
		EClass RM_TRANSFORMATION = eINSTANCE.getRMTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_TRANSFORMATION__NAME = eINSTANCE.getRMTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_TRANSFORMATION__DESCRIPTION = eINSTANCE.getRMTransformation_Description();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.RMRequiredElementsImpl <em>RM Required Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.RMRequiredElementsImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMRequiredElements()
		 * @generated
		 */
		EClass RM_REQUIRED_ELEMENTS = eINSTANCE.getRMRequiredElements();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.RMTransfImplementationImpl <em>RM Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.RMTransfImplementationImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfImplementation()
		 * @generated
		 */
		EClass RM_TRANSF_IMPLEMENTATION = eINSTANCE.getRMTransfImplementation();

		/**
		 * The meta object literal for the '<em><b>Class Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = eINSTANCE.getRMTransfImplementation_ClassNamespace();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_TRANSF_IMPLEMENTATION__CLASS_NAME = eINSTANCE.getRMTransfImplementation_ClassName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.RMTransfPropertyImpl <em>RM Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.RMTransfPropertyImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfProperty()
		 * @generated
		 */
		EClass RM_TRANSF_PROPERTY = eINSTANCE.getRMTransfProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_TRANSF_PROPERTY__VALUE = eINSTANCE.getRMTransfProperty_Value();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.RMTransfConnectionImpl <em>RM Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.RMTransfConnectionImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfConnection()
		 * @generated
		 */
		EClass RM_TRANSF_CONNECTION = eINSTANCE.getRMTransfConnection();

		/**
		 * The meta object literal for the '{@link org.hyperflex.resolutionmodels.impl.TemplateSystemModelImpl <em>Template System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.resolutionmodels.impl.TemplateSystemModelImpl
		 * @see org.hyperflex.resolutionmodels.impl.resolutionmodelsPackageImpl#getTemplateSystemModel()
		 * @generated
		 */
		EClass TEMPLATE_SYSTEM_MODEL = eINSTANCE.getTemplateSystemModel();

	}

} //resolutionmodelsPackage
