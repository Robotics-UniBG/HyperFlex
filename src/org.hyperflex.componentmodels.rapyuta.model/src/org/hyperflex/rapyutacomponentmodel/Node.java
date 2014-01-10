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
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getSrvServers <em>Srv Servers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getSrvClients <em>Srv Clients</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Node#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.NodePublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_Publishers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodePublisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.NodeSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_Subscribers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSubscriber> getSubscribers();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.NodeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Srv Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.NodeSrvServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Servers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_SrvServers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSrvServer> getSrvServers();

	/**
	 * Returns the value of the '<em><b>Srv Clients</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.NodeSrvClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Clients</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_SrvClients()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeSrvClient> getSrvClients();

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
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.Node#getPackageName <em>Package Name</em>}' attribute.
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
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Node
