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
package org.hyperflex.resolutionmodels.rttresolutionmodels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage
 * @generated
 */
public interface rttresolutionmodelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rttresolutionmodelsFactory eINSTANCE = org.hyperflex.resolutionmodels.rttresolutionmodels.impl.rttresolutionmodelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Orocos Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Transf Implementation</em>'.
	 * @generated
	 */
	OrocosTransfImplementation createOrocosTransfImplementation();

	/**
	 * Returns a new object of class '<em>Orocos Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Transf Property</em>'.
	 * @generated
	 */
	OrocosTransfProperty createOrocosTransfProperty();

	/**
	 * Returns a new object of class '<em>Orocos Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Transf Connection</em>'.
	 * @generated
	 */
	OrocosTransfConnection createOrocosTransfConnection();

	/**
	 * Returns a new object of class '<em>Orocos Connection Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Connection Policy</em>'.
	 * @generated
	 */
	OrocosConnectionPolicy createOrocosConnectionPolicy();

	/**
	 * Returns a new object of class '<em>Orocos Peers Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Peers Connection</em>'.
	 * @generated
	 */
	OrocosPeersConnection createOrocosPeersConnection();

	/**
	 * Returns a new object of class '<em>Orocos Required Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Required Elements</em>'.
	 * @generated
	 */
	OrocosRequiredElements createOrocosRequiredElements();

	/**
	 * Returns a new object of class '<em>Orocos Template System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Template System Model</em>'.
	 * @generated
	 */
	OrocosTemplateSystemModel createOrocosTemplateSystemModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	rttresolutionmodelsPackage getrttresolutionmodelsPackage();

} //rttresolutionmodelsFactory
