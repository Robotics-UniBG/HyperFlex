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
package it.unibg.robotics.roscomponentmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage
 * @generated
 */
public interface roscomponentmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	roscomponentmodelFactory eINSTANCE = it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Node Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Msg Producer</em>'.
	 * @generated
	 */
	NodeMsgProducer createNodeMsgProducer();

	/**
	 * Returns a new object of class '<em>Node Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Msg Consumer</em>'.
	 * @generated
	 */
	NodeMsgConsumer createNodeMsgConsumer();

	/**
	 * Returns a new object of class '<em>Package Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Msg Producer</em>'.
	 * @generated
	 */
	PackageMsgProducer createPackageMsgProducer();

	/**
	 * Returns a new object of class '<em>Package Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Msg Consumer</em>'.
	 * @generated
	 */
	PackageMsgConsumer createPackageMsgConsumer();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Srv Producer</em>'.
	 * @generated
	 */
	SrvProducer createSrvProducer();

	/**
	 * Returns a new object of class '<em>Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Srv Consumer</em>'.
	 * @generated
	 */
	SrvConsumer createSrvConsumer();

	/**
	 * Returns a new object of class '<em>Package Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Srv Producer</em>'.
	 * @generated
	 */
	PackageSrvProducer createPackageSrvProducer();

	/**
	 * Returns a new object of class '<em>Node Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Srv Producer</em>'.
	 * @generated
	 */
	NodeSrvProducer createNodeSrvProducer();

	/**
	 * Returns a new object of class '<em>Package Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Srv Consumer</em>'.
	 * @generated
	 */
	PackageSrvConsumer createPackageSrvConsumer();

	/**
	 * Returns a new object of class '<em>Node Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Srv Consumer</em>'.
	 * @generated
	 */
	NodeSrvConsumer createNodeSrvConsumer();

	/**
	 * Returns a new object of class '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire</em>'.
	 * @generated
	 */
	Wire createWire();

	/**
	 * Returns a new object of class '<em>Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Model</em>'.
	 * @generated
	 */
	ArchitectureModel createArchitectureModel();

	/**
	 * Returns a new object of class '<em>Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Msg Interface</em>'.
	 * @generated
	 */
	MsgInterface createMsgInterface();

	/**
	 * Returns a new object of class '<em>Composite Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Msg Interface</em>'.
	 * @generated
	 */
	CompositeMsgInterface createCompositeMsgInterface();

	/**
	 * Returns a new object of class '<em>Node Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Msg Interface</em>'.
	 * @generated
	 */
	NodeMsgInterface createNodeMsgInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	roscomponentmodelPackage getroscomponentmodelPackage();

} //roscomponentmodelFactory
