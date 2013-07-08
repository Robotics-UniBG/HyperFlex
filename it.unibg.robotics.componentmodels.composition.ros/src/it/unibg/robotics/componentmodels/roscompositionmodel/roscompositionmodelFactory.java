/**
 * Variability Analysis and Resolution Plugin (VARP)
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
 */
package it.unibg.robotics.componentmodels.roscompositionmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage
 * @generated
 */
public interface roscompositionmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	roscompositionmodelFactory eINSTANCE = it.unibg.robotics.componentmodels.roscompositionmodel.impl.roscompositionmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ROS Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Composite</em>'.
	 * @generated
	 */
	ROSComposite createROSComposite();

	/**
	 * Returns a new object of class '<em>ROS Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Msg Producer</em>'.
	 * @generated
	 */
	ROSMsgProducer createROSMsgProducer();

	/**
	 * Returns a new object of class '<em>ROS Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Msg Consumer</em>'.
	 * @generated
	 */
	ROSMsgConsumer createROSMsgConsumer();

	/**
	 * Returns a new object of class '<em>ROS Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Srv Producer</em>'.
	 * @generated
	 */
	ROSSrvProducer createROSSrvProducer();

	/**
	 * Returns a new object of class '<em>ROS Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Srv Consumer</em>'.
	 * @generated
	 */
	ROSSrvConsumer createROSSrvConsumer();

	/**
	 * Returns a new object of class '<em>Ros Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Topic</em>'.
	 * @generated
	 */
	RosTopic createRosTopic();

	/**
	 * Returns a new object of class '<em>ROS Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Property</em>'.
	 * @generated
	 */
	ROSProperty createROSProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	roscompositionmodelPackage getroscompositionmodelPackage();

} //roscompositionmodelFactory
