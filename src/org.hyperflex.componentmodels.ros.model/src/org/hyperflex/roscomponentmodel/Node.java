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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Node#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Msg Producers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.NodeMsgProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Producers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_MsgProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeMsgProducer> getMsgProducers();

	/**
	 * Returns the value of the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.NodeMsgConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Consumers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_MsgConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeMsgConsumer> getMsgConsumers();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.NodeProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeProperty> getParameters();

	/**
	 * Returns the value of the '<em><b>Srv Producers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.NodeSrvProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Producers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_SrvProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSrvProducer> getSrvProducers();

	/**
	 * Returns the value of the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.NodeSrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Consumers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_SrvConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSrvConsumer> getSrvConsumers();

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscomponentmodel.Node#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

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
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscomponentmodel.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Node
