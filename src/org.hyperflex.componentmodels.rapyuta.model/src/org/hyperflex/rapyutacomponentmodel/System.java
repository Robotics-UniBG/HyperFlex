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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getEndPointSrvConnections <em>End Point Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getEndPointMsgConnections <em>End Point Msg Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_Containers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.Composite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_Composites()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Composite> getComposites();

	/**
	 * Returns the value of the '<em><b>End Point Srv Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Srv Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Srv Connections</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_EndPointSrvConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<EndPointSrvConnection> getEndPointSrvConnections();

	/**
	 * Returns the value of the '<em><b>End Point Msg Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Msg Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Msg Connections</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_EndPointMsgConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<EndPointMsgConnection> getEndPointMsgConnections();

} // System
