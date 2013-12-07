/**
 * HyperFlex toolchain
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
package org.hyperflex.roscomponentmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage
 * @generated
 */
public interface roscomponentmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	roscomponentmodelFactory eINSTANCE = org.hyperflex.roscomponentmodel.impl.roscomponentmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

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
	 * Returns a new object of class '<em>Composite Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Msg Producer</em>'.
	 * @generated
	 */
	CompositeMsgProducer createCompositeMsgProducer();

	/**
	 * Returns a new object of class '<em>Composite Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Msg Consumer</em>'.
	 * @generated
	 */
	CompositeMsgConsumer createCompositeMsgConsumer();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

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
	 * Returns a new object of class '<em>Composite Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Srv Producer</em>'.
	 * @generated
	 */
	CompositeSrvProducer createCompositeSrvProducer();

	/**
	 * Returns a new object of class '<em>Node Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Srv Producer</em>'.
	 * @generated
	 */
	NodeSrvProducer createNodeSrvProducer();

	/**
	 * Returns a new object of class '<em>Composite Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Srv Consumer</em>'.
	 * @generated
	 */
	CompositeSrvConsumer createCompositeSrvConsumer();

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
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

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
	roscomponentmodelPackage getroscomponentmodelPackage();

} //roscomponentmodelFactory
