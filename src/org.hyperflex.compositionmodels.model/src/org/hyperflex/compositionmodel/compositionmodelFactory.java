/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.compositionmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.compositionmodel.compositionmodelPackage
 * @generated
 */
public interface compositionmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	compositionmodelFactory eINSTANCE = org.hyperflex.compositionmodel.impl.compositionmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Model</em>'.
	 * @generated
	 */
	ArchitectureModel createArchitectureModel();

	/**
	 * Returns a new object of class '<em>System Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Composite</em>'.
	 * @generated
	 */
	SystemComposite createSystemComposite();

	/**
	 * Returns a new object of class '<em>System Provided Interf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Provided Interf</em>'.
	 * @generated
	 */
	SystemProvidedInterf createSystemProvidedInterf();

	/**
	 * Returns a new object of class '<em>System Required Interf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Required Interf</em>'.
	 * @generated
	 */
	SystemRequiredInterf createSystemRequiredInterf();

	/**
	 * Returns a new object of class '<em>System Composite Provided Interf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Composite Provided Interf</em>'.
	 * @generated
	 */
	SystemCompositeProvidedInterf createSystemCompositeProvidedInterf();

	/**
	 * Returns a new object of class '<em>System Composite Required Interf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Composite Required Interf</em>'.
	 * @generated
	 */
	SystemCompositeRequiredInterf createSystemCompositeRequiredInterf();

	/**
	 * Returns a new object of class '<em>System Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Property</em>'.
	 * @generated
	 */
	SystemProperty createSystemProperty();

	/**
	 * Returns a new object of class '<em>System Composite Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Composite Property</em>'.
	 * @generated
	 */
	SystemCompositeProperty createSystemCompositeProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	compositionmodelPackage getcompositionmodelPackage();

} //compositionmodelFactory
