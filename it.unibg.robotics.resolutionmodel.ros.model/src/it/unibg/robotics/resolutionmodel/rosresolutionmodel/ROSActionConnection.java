/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
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
package it.unibg.robotics.resolutionmodel.rosresolutionmodel;

import org.ros.model.ros.Action;
import org.ros.model.ros.ActionClient;
import org.ros.model.ros.ActionServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Action Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection#getActionServer <em>Action Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection#getActionClient <em>Action Client</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSActionConnection()
 * @model
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
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSActionConnection_ActionServer()
	 * @model required="true"
	 * @generated
	 */
	ActionServer getActionServer();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection#getActionServer <em>Action Server</em>}' reference.
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
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSActionConnection_ActionClient()
	 * @model required="true"
	 * @generated
	 */
	ActionClient getActionClient();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection#getActionClient <em>Action Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Client</em>' reference.
	 * @see #getActionClient()
	 * @generated
	 */
	void setActionClient(ActionClient value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSActionConnection_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // ROSActionConnection
