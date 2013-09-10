/**
 * Variability Analysis And Resolution Plugins (VARP)
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
package it.unibg.robotics.orocoscomponentmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage
 * @generated
 */
public interface orocoscomponentmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	orocoscomponentmodelFactory eINSTANCE = it.unibg.robotics.orocoscomponentmodel.impl.orocoscomponentmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

	/**
	 * Returns a new object of class '<em>Task Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Context</em>'.
	 * @generated
	 */
	TaskContext createTaskContext();

	/**
	 * Returns a new object of class '<em>TC Input Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TC Input Data Port</em>'.
	 * @generated
	 */
	TCInputDataPort createTCInputDataPort();

	/**
	 * Returns a new object of class '<em>TC Output Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TC Output Data Port</em>'.
	 * @generated
	 */
	TCOutputDataPort createTCOutputDataPort();

	/**
	 * Returns a new object of class '<em>Comp Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Input Port</em>'.
	 * @generated
	 */
	CompInputPort createCompInputPort();

	/**
	 * Returns a new object of class '<em>Comp Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Output Port</em>'.
	 * @generated
	 */
	CompOutputPort createCompOutputPort();

	/**
	 * Returns a new object of class '<em>Connection Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Policy</em>'.
	 * @generated
	 */
	ConnectionPolicy createConnectionPolicy();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Operation Caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Caller</em>'.
	 * @generated
	 */
	OperationCaller createOperationCaller();

	/**
	 * Returns a new object of class '<em>Comp Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Operation</em>'.
	 * @generated
	 */
	CompOperation createCompOperation();

	/**
	 * Returns a new object of class '<em>TC Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TC Operation</em>'.
	 * @generated
	 */
	TCOperation createTCOperation();

	/**
	 * Returns a new object of class '<em>Comp Operation Caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Operation Caller</em>'.
	 * @generated
	 */
	CompOperationCaller createCompOperationCaller();

	/**
	 * Returns a new object of class '<em>TC Operation Caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TC Operation Caller</em>'.
	 * @generated
	 */
	TCOperationCaller createTCOperationCaller();

	/**
	 * Returns a new object of class '<em>Peers Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Peers Connection</em>'.
	 * @generated
	 */
	PeersConnection createPeersConnection();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port</em>'.
	 * @generated
	 */
	DataPort createDataPort();

	/**
	 * Returns a new object of class '<em>Input Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Data Port</em>'.
	 * @generated
	 */
	InputDataPort createInputDataPort();

	/**
	 * Returns a new object of class '<em>Output Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Data Port</em>'.
	 * @generated
	 */
	OutputDataPort createOutputDataPort();

	/**
	 * Returns a new object of class '<em>Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Property</em>'.
	 * @generated
	 */
	NodeProperty createNodeProperty();

	/**
	 * Returns a new object of class '<em>Composite Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Property</em>'.
	 * @generated
	 */
	CompositeProperty createCompositeProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	orocoscomponentmodelPackage getorocoscomponentmodelPackage();

} //orocoscomponentmodelFactory
