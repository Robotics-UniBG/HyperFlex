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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getCloudContainers <em>Cloud Containers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getRobotContainers <em>Robot Containers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getEndPointSrvConnections <em>End Point Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getEndPointMsgConnections <em>End Point Msg Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.System#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CloudContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Containers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_CloudContainers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudContainer> getCloudContainers();

	/**
	 * Returns the value of the '<em><b>Robot Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.RobotContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robot Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot Containers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_RobotContainers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RobotContainer> getRobotContainers();

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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"System"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getSystem_Name()
	 * @model default="System" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // System
