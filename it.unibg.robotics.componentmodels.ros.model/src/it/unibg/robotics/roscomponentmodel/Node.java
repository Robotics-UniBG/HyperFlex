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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getParameters <em>Parameters</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Node#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Msg Producers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.NodeMsgProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Producers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_MsgProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeMsgProducer> getMsgProducers();

	/**
	 * Returns the value of the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.NodeMsgConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Consumers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_MsgConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeMsgConsumer> getMsgConsumers();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.NodeProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeProperty> getParameters();

	/**
	 * Returns the value of the '<em><b>Srv Producers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.NodeSrvProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Producers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_SrvProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSrvProducer> getSrvProducers();

	/**
	 * Returns the value of the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.NodeSrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Consumers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_SrvConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSrvConsumer> getSrvConsumers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.roscomponentmodel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.roscomponentmodel.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Node
