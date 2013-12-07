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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getComponents <em>Components</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getWires <em>Wires</em>}</li>
 *   <li>{@link org.hyperflex.roscomponentmodel.Composite#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.AbstractComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Msg Producers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.CompositeMsgProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Producers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_MsgProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeMsgProducer> getMsgProducers();

	/**
	 * Returns the value of the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.CompositeMsgConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Consumers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_MsgConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeMsgConsumer> getMsgConsumers();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Srv Producers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.CompositeSrvProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Producers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_SrvProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSrvProducer> getSrvProducers();

	/**
	 * Returns the value of the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.CompositeSrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Consumers</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_SrvConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSrvConsumer> getSrvConsumers();

	/**
	 * Returns the value of the '<em><b>Wires</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wires</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_Wires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wire> getWires();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.CompositeProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getComposite_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeProperty> getProperties();

} // Composite
