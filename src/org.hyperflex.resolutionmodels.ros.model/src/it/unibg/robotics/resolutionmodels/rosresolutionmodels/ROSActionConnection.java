/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
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
package org.hyperflex.resolutionmodels.rosresolutionmodels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Action Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionServer <em>Action Server</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionClient <em>Action Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSActionConnection()
 * @model abstract="true"
 * @generated
 */
public interface ROSActionConnection extends ROSAbstractConnection {
	/**
	 * Returns the value of the '<em><b>Action Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Server</em>' reference.
	 * @see #setActionServer(ActionServer)
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSActionConnection_ActionServer()
	 * @model required="true"
	 * @generated
	 */
	ActionServer getActionServer();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionServer <em>Action Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Server</em>' reference.
	 * @see #getActionServer()
	 * @generated
	 */
	void setActionServer(ActionServer value);

	/**
	 * Returns the value of the '<em><b>Action Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Client</em>' reference.
	 * @see #setActionClient(ActionClient)
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSActionConnection_ActionClient()
	 * @model required="true"
	 * @generated
	 */
	ActionClient getActionClient();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSActionConnection#getActionClient <em>Action Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Client</em>' reference.
	 * @see #getActionClient()
	 * @generated
	 */
	void setActionClient(ActionClient value);

} // ROSActionConnection
