/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.compositionmodel;

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
 * @see it.unibg.robotics.compositionmodel.compositionmodelFactory
 * @model kind="package"
 * @generated
 */
public interface compositionmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compositionmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robotics.unibg.it/compositionmodels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compositionmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	compositionmodelPackage eINSTANCE = it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPOSITES = 0;

	/**
	 * The feature id for the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROV_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQ_INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 4;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTIONS = 5;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.CompositeImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PROV_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__REQ_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.InterfaceImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.RequiredInterfaceImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 11;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.CompProvidedInterfImpl <em>Comp Provided Interf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.CompProvidedInterfImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getCompProvidedInterf()
	 * @generated
	 */
	int COMP_PROVIDED_INTERF = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.ProvidedInterfaceImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_PROVIDED_INTERF__NAME = PROVIDED_INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Comp Provided Interf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_PROVIDED_INTERF_FEATURE_COUNT = PROVIDED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.CompRequiredInterfImpl <em>Comp Required Interf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.CompRequiredInterfImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getCompRequiredInterf()
	 * @generated
	 */
	int COMP_REQUIRED_INTERF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REQUIRED_INTERF__NAME = REQUIRED_INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Comp Required Interf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_REQUIRED_INTERF_FEATURE_COUNT = REQUIRED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.ConnectionImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.ArchitectureModelImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getArchitectureModel()
	 * @generated
	 */
	int ARCHITECTURE_MODEL = 5;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositeImpl <em>System Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositeImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemComposite()
	 * @generated
	 */
	int SYSTEM_COMPOSITE = 6;

	/**
	 * The feature id for the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE__PROV_INTERFACES = COMPOSITE__PROV_INTERFACES;

	/**
	 * The feature id for the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE__REQ_INTERFACES = COMPOSITE__REQ_INTERFACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE__NAME = COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE__IMPL = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemProvidedInterfImpl <em>System Provided Interf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemProvidedInterfImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemProvidedInterf()
	 * @generated
	 */
	int SYSTEM_PROVIDED_INTERF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROVIDED_INTERF__NAME = PROVIDED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROVIDED_INTERF__EXPOSED = PROVIDED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Provided Interf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROVIDED_INTERF_FEATURE_COUNT = PROVIDED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemRequiredInterfImpl <em>System Required Interf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemRequiredInterfImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemRequiredInterf()
	 * @generated
	 */
	int SYSTEM_REQUIRED_INTERF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIRED_INTERF__NAME = REQUIRED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIRED_INTERF__EXPOSED = REQUIRED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Required Interf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIRED_INTERF_FEATURE_COUNT = REQUIRED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.PropertyImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 13;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.ComponentPropertyImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getComponentProperty()
	 * @generated
	 */
	int COMPONENT_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__PROPERTIES = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositeProvidedInterfImpl <em>System Composite Provided Interf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositeProvidedInterfImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemCompositeProvidedInterf()
	 * @generated
	 */
	int SYSTEM_COMPOSITE_PROVIDED_INTERF = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_PROVIDED_INTERF__NAME = COMP_PROVIDED_INTERF__NAME;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_PROVIDED_INTERF__IMPL = COMP_PROVIDED_INTERF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Composite Provided Interf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_PROVIDED_INTERF_FEATURE_COUNT = COMP_PROVIDED_INTERF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositeRequiredInterfImpl <em>System Composite Required Interf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositeRequiredInterfImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemCompositeRequiredInterf()
	 * @generated
	 */
	int SYSTEM_COMPOSITE_REQUIRED_INTERF = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_REQUIRED_INTERF__NAME = COMP_REQUIRED_INTERF__NAME;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_REQUIRED_INTERF__IMPL = COMP_REQUIRED_INTERF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Composite Required Interf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_REQUIRED_INTERF_FEATURE_COUNT = COMP_REQUIRED_INTERF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemPropertyImpl <em>System Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemPropertyImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemProperty()
	 * @generated
	 */
	int SYSTEM_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY__EXPOSED = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositePropertyImpl <em>System Composite Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositePropertyImpl
	 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemCompositeProperty()
	 * @generated
	 */
	int SYSTEM_COMPOSITE_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_PROPERTY__PROPERTIES = COMPONENT_PROPERTY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_PROPERTY__IMPL = COMPONENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Composite Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPOSITE_PROPERTY_FEATURE_COUNT = COMPONENT_PROPERTY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see it.unibg.robotics.compositionmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.System#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see it.unibg.robotics.compositionmodel.System#getComposites()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Composites();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.System#getProvInterfaces <em>Prov Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prov Interfaces</em>'.
	 * @see it.unibg.robotics.compositionmodel.System#getProvInterfaces()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ProvInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.System#getReqInterfaces <em>Req Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Req Interfaces</em>'.
	 * @see it.unibg.robotics.compositionmodel.System#getReqInterfaces()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ReqInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.System#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see it.unibg.robotics.compositionmodel.System#getProperties()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Properties();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.compositionmodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.compositionmodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.System#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see it.unibg.robotics.compositionmodel.System#getConnections()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connections();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see it.unibg.robotics.compositionmodel.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.Composite#getProvInterfaces <em>Prov Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prov Interfaces</em>'.
	 * @see it.unibg.robotics.compositionmodel.Composite#getProvInterfaces()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ProvInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.Composite#getReqInterfaces <em>Req Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Req Interfaces</em>'.
	 * @see it.unibg.robotics.compositionmodel.Composite#getReqInterfaces()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ReqInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.compositionmodel.Composite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.compositionmodel.Composite#getName()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.CompProvidedInterf <em>Comp Provided Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Provided Interf</em>'.
	 * @see it.unibg.robotics.compositionmodel.CompProvidedInterf
	 * @generated
	 */
	EClass getCompProvidedInterf();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.CompRequiredInterf <em>Comp Required Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Required Interf</em>'.
	 * @see it.unibg.robotics.compositionmodel.CompRequiredInterf
	 * @generated
	 */
	EClass getCompRequiredInterf();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see it.unibg.robotics.compositionmodel.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibg.robotics.compositionmodel.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibg.robotics.compositionmodel.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.compositionmodel.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.compositionmodel.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Model</em>'.
	 * @see it.unibg.robotics.compositionmodel.ArchitectureModel
	 * @generated
	 */
	EClass getArchitectureModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibg.robotics.compositionmodel.ArchitectureModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see it.unibg.robotics.compositionmodel.ArchitectureModel#getSystem()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EReference getArchitectureModel_System();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.compositionmodel.ArchitectureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.compositionmodel.ArchitectureModel#getName()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EAttribute getArchitectureModel_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemComposite <em>System Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Composite</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemComposite
	 * @generated
	 */
	EClass getSystemComposite();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemComposite#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemComposite#getImpl()
	 * @see #getSystemComposite()
	 * @generated
	 */
	EReference getSystemComposite_Impl();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see it.unibg.robotics.compositionmodel.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.compositionmodel.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.compositionmodel.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemProvidedInterf <em>System Provided Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Provided Interf</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemProvidedInterf
	 * @generated
	 */
	EClass getSystemProvidedInterf();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemProvidedInterf#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemProvidedInterf#getExposed()
	 * @see #getSystemProvidedInterf()
	 * @generated
	 */
	EReference getSystemProvidedInterf_Exposed();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemRequiredInterf <em>System Required Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Required Interf</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemRequiredInterf
	 * @generated
	 */
	EClass getSystemRequiredInterf();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemRequiredInterf#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemRequiredInterf#getExposed()
	 * @see #getSystemRequiredInterf()
	 * @generated
	 */
	EReference getSystemRequiredInterf_Exposed();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see it.unibg.robotics.compositionmodel.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see it.unibg.robotics.compositionmodel.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.ComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property</em>'.
	 * @see it.unibg.robotics.compositionmodel.ComponentProperty
	 * @generated
	 */
	EClass getComponentProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.compositionmodel.ComponentProperty#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see it.unibg.robotics.compositionmodel.ComponentProperty#getProperties()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EReference getComponentProperty_Properties();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see it.unibg.robotics.compositionmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf <em>System Composite Provided Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Composite Provided Interf</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf
	 * @generated
	 */
	EClass getSystemCompositeProvidedInterf();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf#getImpl()
	 * @see #getSystemCompositeProvidedInterf()
	 * @generated
	 */
	EReference getSystemCompositeProvidedInterf_Impl();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf <em>System Composite Required Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Composite Required Interf</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf
	 * @generated
	 */
	EClass getSystemCompositeRequiredInterf();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf#getImpl()
	 * @see #getSystemCompositeRequiredInterf()
	 * @generated
	 */
	EReference getSystemCompositeRequiredInterf_Impl();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemProperty <em>System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Property</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemProperty
	 * @generated
	 */
	EClass getSystemProperty();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemProperty#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemProperty#getExposed()
	 * @see #getSystemProperty()
	 * @generated
	 */
	EReference getSystemProperty_Exposed();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.compositionmodel.SystemCompositeProperty <em>System Composite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Composite Property</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemCompositeProperty
	 * @generated
	 */
	EClass getSystemCompositeProperty();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.compositionmodel.SystemCompositeProperty#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see it.unibg.robotics.compositionmodel.SystemCompositeProperty#getImpl()
	 * @see #getSystemCompositeProperty()
	 * @generated
	 */
	EReference getSystemCompositeProperty_Impl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	compositionmodelFactory getcompositionmodelFactory();

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
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPOSITES = eINSTANCE.getSystem_Composites();

		/**
		 * The meta object literal for the '<em><b>Prov Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROV_INTERFACES = eINSTANCE.getSystem_ProvInterfaces();

		/**
		 * The meta object literal for the '<em><b>Req Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__REQ_INTERFACES = eINSTANCE.getSystem_ReqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROPERTIES = eINSTANCE.getSystem_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONNECTIONS = eINSTANCE.getSystem_Connections();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.CompositeImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Prov Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PROV_INTERFACES = eINSTANCE.getComposite_ProvInterfaces();

		/**
		 * The meta object literal for the '<em><b>Req Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__REQ_INTERFACES = eINSTANCE.getComposite_ReqInterfaces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__NAME = eINSTANCE.getComposite_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.CompProvidedInterfImpl <em>Comp Provided Interf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.CompProvidedInterfImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getCompProvidedInterf()
		 * @generated
		 */
		EClass COMP_PROVIDED_INTERF = eINSTANCE.getCompProvidedInterf();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.CompRequiredInterfImpl <em>Comp Required Interf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.CompRequiredInterfImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getCompRequiredInterf()
		 * @generated
		 */
		EClass COMP_REQUIRED_INTERF = eINSTANCE.getCompRequiredInterf();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.ConnectionImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.ArchitectureModelImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getArchitectureModel()
		 * @generated
		 */
		EClass ARCHITECTURE_MODEL = eINSTANCE.getArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_MODEL__SYSTEM = eINSTANCE.getArchitectureModel_System();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_MODEL__NAME = eINSTANCE.getArchitectureModel_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositeImpl <em>System Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositeImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemComposite()
		 * @generated
		 */
		EClass SYSTEM_COMPOSITE = eINSTANCE.getSystemComposite();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPOSITE__IMPL = eINSTANCE.getSystemComposite_Impl();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.InterfaceImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemProvidedInterfImpl <em>System Provided Interf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemProvidedInterfImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemProvidedInterf()
		 * @generated
		 */
		EClass SYSTEM_PROVIDED_INTERF = eINSTANCE.getSystemProvidedInterf();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_PROVIDED_INTERF__EXPOSED = eINSTANCE.getSystemProvidedInterf_Exposed();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemRequiredInterfImpl <em>System Required Interf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemRequiredInterfImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemRequiredInterf()
		 * @generated
		 */
		EClass SYSTEM_REQUIRED_INTERF = eINSTANCE.getSystemRequiredInterf();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REQUIRED_INTERF__EXPOSED = eINSTANCE.getSystemRequiredInterf_Exposed();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.RequiredInterfaceImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.ProvidedInterfaceImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.ComponentPropertyImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getComponentProperty()
		 * @generated
		 */
		EClass COMPONENT_PROPERTY = eINSTANCE.getComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTY__PROPERTIES = eINSTANCE.getComponentProperty_Properties();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.PropertyImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositeProvidedInterfImpl <em>System Composite Provided Interf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositeProvidedInterfImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemCompositeProvidedInterf()
		 * @generated
		 */
		EClass SYSTEM_COMPOSITE_PROVIDED_INTERF = eINSTANCE.getSystemCompositeProvidedInterf();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPOSITE_PROVIDED_INTERF__IMPL = eINSTANCE.getSystemCompositeProvidedInterf_Impl();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositeRequiredInterfImpl <em>System Composite Required Interf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositeRequiredInterfImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemCompositeRequiredInterf()
		 * @generated
		 */
		EClass SYSTEM_COMPOSITE_REQUIRED_INTERF = eINSTANCE.getSystemCompositeRequiredInterf();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPOSITE_REQUIRED_INTERF__IMPL = eINSTANCE.getSystemCompositeRequiredInterf_Impl();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemPropertyImpl <em>System Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemPropertyImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemProperty()
		 * @generated
		 */
		EClass SYSTEM_PROPERTY = eINSTANCE.getSystemProperty();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_PROPERTY__EXPOSED = eINSTANCE.getSystemProperty_Exposed();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.compositionmodel.impl.SystemCompositePropertyImpl <em>System Composite Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.compositionmodel.impl.SystemCompositePropertyImpl
		 * @see it.unibg.robotics.compositionmodel.impl.compositionmodelPackageImpl#getSystemCompositeProperty()
		 * @generated
		 */
		EClass SYSTEM_COMPOSITE_PROPERTY = eINSTANCE.getSystemCompositeProperty();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPOSITE_PROPERTY__IMPL = eINSTANCE.getSystemCompositeProperty_Impl();

	}

} //compositionmodelPackage
