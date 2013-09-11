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
package it.unibg.robotics.orocoscomponentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getComponents <em>Components</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getConnectionPolicies <em>Connection Policies</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getOperationCallers <em>Operation Callers</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getPeersConnections <em>Peers Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.Composite#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.AbstractComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.CompInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_InputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompInputPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.CompOutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_OutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompOutputPort> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Connection Policies</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Policies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Policies</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_ConnectionPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPolicy> getConnectionPolicies();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.CompOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Operation Callers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.CompOperationCaller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Callers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Callers</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_OperationCallers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompOperationCaller> getOperationCallers();

	/**
	 * Returns the value of the '<em><b>Peers Connections</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.PeersConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peers Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peers Connections</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_PeersConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<PeersConnection> getPeersConnections();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.CompProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getComposite_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompProperty> getProperties();

} // Composite
