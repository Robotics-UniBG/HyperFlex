/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
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
package org.hyperflex.orocoscomponentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getComponents <em>Components</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getConnectionPolicies <em>Connection Policies</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getOperationCallers <em>Operation Callers</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getPeersConnections <em>Peers Connections</em>}</li>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.Composite#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.AbstractComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.CompInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_InputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompInputPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.CompOutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_OutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompOutputPort> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Connection Policies</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Policies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Policies</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_ConnectionPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPolicy> getConnectionPolicies();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.CompOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Operation Callers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.CompOperationCaller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Callers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Callers</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_OperationCallers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompOperationCaller> getOperationCallers();

	/**
	 * Returns the value of the '<em><b>Peers Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.PeersConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peers Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peers Connections</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_PeersConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<PeersConnection> getPeersConnections();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.CompProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompProperty> getProperties();

} // Composite
