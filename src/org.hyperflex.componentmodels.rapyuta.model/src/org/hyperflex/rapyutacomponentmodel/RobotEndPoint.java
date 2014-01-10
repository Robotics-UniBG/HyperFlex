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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getPassword <em>Password</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getRobotID <em>Robot ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotEndPoint()
 * @model
 * @generated
 */
public interface RobotEndPoint extends EndPoint {

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotEndPoint_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotEndPoint_UserID()
	 * @model required="true"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotEndPoint_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Robot ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robot ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot ID</em>' attribute.
	 * @see #setRobotID(String)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotEndPoint_RobotID()
	 * @model required="true"
	 * @generated
	 */
	String getRobotID();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint#getRobotID <em>Robot ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot ID</em>' attribute.
	 * @see #getRobotID()
	 * @generated
	 */
	void setRobotID(String value);
} // RobotEndPoint
