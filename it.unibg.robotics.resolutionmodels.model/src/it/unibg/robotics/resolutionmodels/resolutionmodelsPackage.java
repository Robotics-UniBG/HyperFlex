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
package it.unibg.robotics.resolutionmodels;

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
 * @see it.unibg.robotics.resolutionmodels.resolutionmodelsFactory
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
	String eNS_URI = "http://robotics.unibg.it/resolutionmodels";

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
	resolutionmodelsPackage eINSTANCE = it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.ResolutionModelImpl <em>Resolution Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.ResolutionModelImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getResolutionModel()
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
	 * The number of structural features of the '<em>Resolution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMResolutionElementImpl <em>RM Resolution Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMResolutionElementImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMResolutionElement()
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
	 * The feature id for the '<em><b>Required Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Required Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>RM Resolution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_RESOLUTION_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMAbstractTransformationImpl <em>RM Abstract Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMAbstractTransformationImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMAbstractTransformation()
	 * @generated
	 */
	int RM_ABSTRACT_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_ABSTRACT_TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_ABSTRACT_TRANSFORMATION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>RM Abstract Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMRequiredComponentsImpl <em>RM Required Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMRequiredComponentsImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMRequiredComponents()
	 * @generated
	 */
	int RM_REQUIRED_COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>RM Required Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_REQUIRED_COMPONENTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMRequiredConnectionsImpl <em>RM Required Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMRequiredConnectionsImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMRequiredConnections()
	 * @generated
	 */
	int RM_REQUIRED_CONNECTIONS = 4;

	/**
	 * The number of structural features of the '<em>RM Required Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_REQUIRED_CONNECTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMTransfImplementationImpl <em>RM Transf Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMTransfImplementationImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfImplementation()
	 * @generated
	 */
	int RM_TRANSF_IMPLEMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__NAME = RM_ABSTRACT_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__DESCRIPTION = RM_ABSTRACT_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE = RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION__CLASS_NAME = RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RM Transf Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_IMPLEMENTATION_FEATURE_COUNT = RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMTransfPropertyImpl <em>RM Transf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMTransfPropertyImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfProperty()
	 * @generated
	 */
	int RM_TRANSF_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY__NAME = RM_ABSTRACT_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY__DESCRIPTION = RM_ABSTRACT_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY__VALUE = RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RM Transf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_PROPERTY_FEATURE_COUNT = RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.resolutionmodels.impl.RMTransfConnectionImpl <em>RM Transf Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.resolutionmodels.impl.RMTransfConnectionImpl
	 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfConnection()
	 * @generated
	 */
	int RM_TRANSF_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_CONNECTION__NAME = RM_ABSTRACT_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_CONNECTION__DESCRIPTION = RM_ABSTRACT_TRANSFORMATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>RM Transf Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RM_TRANSF_CONNECTION_FEATURE_COUNT = RM_ABSTRACT_TRANSFORMATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.ResolutionModel <em>Resolution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Model</em>'.
	 * @see it.unibg.robotics.resolutionmodels.ResolutionModel
	 * @generated
	 */
	EClass getResolutionModel();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.ResolutionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.ResolutionModel#getName()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EAttribute getResolutionModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodels.ResolutionModel#getResolutionElements <em>Resolution Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolution Elements</em>'.
	 * @see it.unibg.robotics.resolutionmodels.ResolutionModel#getResolutionElements()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_ResolutionElements();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement <em>RM Resolution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Resolution Element</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement
	 * @generated
	 */
	EClass getRMResolutionElement();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement#getTransformations()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_Transformations();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement#getRequiredComponents <em>Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Components</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement#getRequiredComponents()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_RequiredComponents();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement#getRequiredConnections <em>Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement#getRequiredConnections()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_RequiredConnections();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement#getFeature()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EReference getRMResolutionElement_Feature();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement#getName()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EAttribute getRMResolutionElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMResolutionElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMResolutionElement#getDescription()
	 * @see #getRMResolutionElement()
	 * @generated
	 */
	EAttribute getRMResolutionElement_Description();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMAbstractTransformation <em>RM Abstract Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Abstract Transformation</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMAbstractTransformation
	 * @generated
	 */
	EClass getRMAbstractTransformation();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMAbstractTransformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMAbstractTransformation#getName()
	 * @see #getRMAbstractTransformation()
	 * @generated
	 */
	EAttribute getRMAbstractTransformation_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMAbstractTransformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMAbstractTransformation#getDescription()
	 * @see #getRMAbstractTransformation()
	 * @generated
	 */
	EAttribute getRMAbstractTransformation_Description();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMRequiredComponents <em>RM Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Required Components</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMRequiredComponents
	 * @generated
	 */
	EClass getRMRequiredComponents();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMRequiredConnections <em>RM Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Required Connections</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMRequiredConnections
	 * @generated
	 */
	EClass getRMRequiredConnections();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation <em>RM Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transf Implementation</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfImplementation
	 * @generated
	 */
	EClass getRMTransfImplementation();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassNamespace <em>Class Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Namespace</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassNamespace()
	 * @see #getRMTransfImplementation()
	 * @generated
	 */
	EAttribute getRMTransfImplementation_ClassNamespace();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassName()
	 * @see #getRMTransfImplementation()
	 * @generated
	 */
	EAttribute getRMTransfImplementation_ClassName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMTransfProperty <em>RM Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transf Property</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfProperty
	 * @generated
	 */
	EClass getRMTransfProperty();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.resolutionmodels.RMTransfProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfProperty#getValue()
	 * @see #getRMTransfProperty()
	 * @generated
	 */
	EAttribute getRMTransfProperty_Value();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.resolutionmodels.RMTransfConnection <em>RM Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RM Transf Connection</em>'.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfConnection
	 * @generated
	 */
	EClass getRMTransfConnection();

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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.ResolutionModelImpl <em>Resolution Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.ResolutionModelImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getResolutionModel()
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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMResolutionElementImpl <em>RM Resolution Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMResolutionElementImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMResolutionElement()
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
		 * The meta object literal for the '<em><b>Required Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS = eINSTANCE.getRMResolutionElement_RequiredComponents();

		/**
		 * The meta object literal for the '<em><b>Required Connections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS = eINSTANCE.getRMResolutionElement_RequiredConnections();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_RESOLUTION_ELEMENT__DESCRIPTION = eINSTANCE.getRMResolutionElement_Description();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMAbstractTransformationImpl <em>RM Abstract Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMAbstractTransformationImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMAbstractTransformation()
		 * @generated
		 */
		EClass RM_ABSTRACT_TRANSFORMATION = eINSTANCE.getRMAbstractTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_ABSTRACT_TRANSFORMATION__NAME = eINSTANCE.getRMAbstractTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RM_ABSTRACT_TRANSFORMATION__DESCRIPTION = eINSTANCE.getRMAbstractTransformation_Description();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMRequiredComponentsImpl <em>RM Required Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMRequiredComponentsImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMRequiredComponents()
		 * @generated
		 */
		EClass RM_REQUIRED_COMPONENTS = eINSTANCE.getRMRequiredComponents();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMRequiredConnectionsImpl <em>RM Required Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMRequiredConnectionsImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMRequiredConnections()
		 * @generated
		 */
		EClass RM_REQUIRED_CONNECTIONS = eINSTANCE.getRMRequiredConnections();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMTransfImplementationImpl <em>RM Transf Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMTransfImplementationImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfImplementation()
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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMTransfPropertyImpl <em>RM Transf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMTransfPropertyImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfProperty()
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
		 * The meta object literal for the '{@link it.unibg.robotics.resolutionmodels.impl.RMTransfConnectionImpl <em>RM Transf Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.resolutionmodels.impl.RMTransfConnectionImpl
		 * @see it.unibg.robotics.resolutionmodels.impl.resolutionmodelsPackageImpl#getRMTransfConnection()
		 * @generated
		 */
		EClass RM_TRANSF_CONNECTION = eINSTANCE.getRMTransfConnection();

	}

} //resolutionmodelsPackage
