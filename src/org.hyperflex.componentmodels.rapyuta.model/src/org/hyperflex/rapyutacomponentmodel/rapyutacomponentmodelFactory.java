/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage
 * @generated
 */
public interface rapyutacomponentmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rapyutacomponentmodelFactory eINSTANCE = org.hyperflex.rapyutacomponentmodel.impl.rapyutacomponentmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Cloud Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Container</em>'.
	 * @generated
	 */
	CloudContainer createCloudContainer();

	/**
	 * Returns a new object of class '<em>Robot Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Container</em>'.
	 * @generated
	 */
	RobotContainer createRobotContainer();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

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
	 * Returns a new object of class '<em>Node Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Publisher</em>'.
	 * @generated
	 */
	NodePublisher createNodePublisher();

	/**
	 * Returns a new object of class '<em>Node Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Subscriber</em>'.
	 * @generated
	 */
	NodeSubscriber createNodeSubscriber();

	/**
	 * Returns a new object of class '<em>Composite Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Publisher</em>'.
	 * @generated
	 */
	CompositePublisher createCompositePublisher();

	/**
	 * Returns a new object of class '<em>Composite Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Subscriber</em>'.
	 * @generated
	 */
	CompositeSubscriber createCompositeSubscriber();

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
	 * Returns a new object of class '<em>Node Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Parameter</em>'.
	 * @generated
	 */
	NodeParameter createNodeParameter();

	/**
	 * Returns a new object of class '<em>Composite Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Parameter</em>'.
	 * @generated
	 */
	CompositeParameter createCompositeParameter();

	/**
	 * Returns a new object of class '<em>Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Srv Server</em>'.
	 * @generated
	 */
	SrvServer createSrvServer();

	/**
	 * Returns a new object of class '<em>Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Srv Client</em>'.
	 * @generated
	 */
	SrvClient createSrvClient();

	/**
	 * Returns a new object of class '<em>Composite Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Srv Server</em>'.
	 * @generated
	 */
	CompositeSrvServer createCompositeSrvServer();

	/**
	 * Returns a new object of class '<em>Node Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Srv Server</em>'.
	 * @generated
	 */
	NodeSrvServer createNodeSrvServer();

	/**
	 * Returns a new object of class '<em>Composite Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Srv Client</em>'.
	 * @generated
	 */
	CompositeSrvClient createCompositeSrvClient();

	/**
	 * Returns a new object of class '<em>Node Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Srv Client</em>'.
	 * @generated
	 */
	NodeSrvClient createNodeSrvClient();

	/**
	 * Returns a new object of class '<em>Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Srv Connection</em>'.
	 * @generated
	 */
	SrvConnection createSrvConnection();

	/**
	 * Returns a new object of class '<em>Robot End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot End Point</em>'.
	 * @generated
	 */
	RobotEndPoint createRobotEndPoint();

	/**
	 * Returns a new object of class '<em>Environment End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment End Point</em>'.
	 * @generated
	 */
	EnvironmentEndPoint createEnvironmentEndPoint();

	/**
	 * Returns a new object of class '<em>End Point Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Publisher</em>'.
	 * @generated
	 */
	EndPointPublisher createEndPointPublisher();

	/**
	 * Returns a new object of class '<em>End Point Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Subscriber</em>'.
	 * @generated
	 */
	EndPointSubscriber createEndPointSubscriber();

	/**
	 * Returns a new object of class '<em>End Point Msg Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Msg Connection</em>'.
	 * @generated
	 */
	EndPointMsgConnection createEndPointMsgConnection();

	/**
	 * Returns a new object of class '<em>End Point Srv Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Srv Server</em>'.
	 * @generated
	 */
	EndPointSrvServer createEndPointSrvServer();

	/**
	 * Returns a new object of class '<em>End Point Srv Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Srv Client</em>'.
	 * @generated
	 */
	EndPointSrvClient createEndPointSrvClient();

	/**
	 * Returns a new object of class '<em>End Point Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Srv Connection</em>'.
	 * @generated
	 */
	EndPointSrvConnection createEndPointSrvConnection();

	/**
	 * Returns a new object of class '<em>End Point Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Parameter</em>'.
	 * @generated
	 */
	EndPointParameter createEndPointParameter();

	/**
	 * Returns a new object of class '<em>Container Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Srv Connection</em>'.
	 * @generated
	 */
	ContainerSrvConnection createContainerSrvConnection();

	/**
	 * Returns a new object of class '<em>Composite Srv Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Srv Connection</em>'.
	 * @generated
	 */
	CompositeSrvConnection createCompositeSrvConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	rapyutacomponentmodelPackage getrapyutacomponentmodelPackage();

} //rapyutacomponentmodelFactory
