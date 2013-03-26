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
package it.unibg.robotics.resolutionmodel.rttresolutionmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.resolutionmodel.rttresolutionmodel.rttresolutionmodelPackage
 * @generated
 */
public interface rttresolutionmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rttresolutionmodelFactory eINSTANCE = it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.rttresolutionmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RTT Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTT Transf Implementation</em>'.
	 * @generated
	 */
	RTTTransfImplementation createRTTTransfImplementation();

	/**
	 * Returns a new object of class '<em>RTT Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTT Transf Property</em>'.
	 * @generated
	 */
	RTTTransfProperty createRTTTransfProperty();

	/**
	 * Returns a new object of class '<em>RTT Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTT Transf Connection</em>'.
	 * @generated
	 */
	RTTTransfConnection createRTTTransfConnection();

	/**
	 * Returns a new object of class '<em>RTT Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTT Connection</em>'.
	 * @generated
	 */
	RTTConnection createRTTConnection();

	/**
	 * Returns a new object of class '<em>RTT Required Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTT Required Components</em>'.
	 * @generated
	 */
	RTTRequiredComponents createRTTRequiredComponents();

	/**
	 * Returns a new object of class '<em>RTT Required Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTT Required Connections</em>'.
	 * @generated
	 */
	RTTRequiredConnections createRTTRequiredConnections();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	rttresolutionmodelPackage getrttresolutionmodelPackage();

} //rttresolutionmodelFactory
