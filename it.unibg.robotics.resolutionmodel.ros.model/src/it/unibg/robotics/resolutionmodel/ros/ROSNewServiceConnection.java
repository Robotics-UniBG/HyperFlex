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
package it.unibg.robotics.resolutionmodel.ros;

import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS New Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewServiceConnection()
 * @model
 * @generated
 */
public interface ROSNewServiceConnection extends ROSAbstractConnection {
	/**
	 * Returns the value of the '<em><b>Service Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Server</em>' reference.
	 * @see #setServiceServer(ServiceServer)
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewServiceConnection_ServiceServer()
	 * @model required="true"
	 * @generated
	 */
	ServiceServer getServiceServer();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection#getServiceServer <em>Service Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Server</em>' reference.
	 * @see #getServiceServer()
	 * @generated
	 */
	void setServiceServer(ServiceServer value);

	/**
	 * Returns the value of the '<em><b>Service Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Client</em>' reference.
	 * @see #setServiceClient(ServiceClient)
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewServiceConnection_ServiceClient()
	 * @model required="true"
	 * @generated
	 */
	ServiceClient getServiceClient();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection#getServiceClient <em>Service Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Client</em>' reference.
	 * @see #getServiceClient()
	 * @generated
	 */
	void setServiceClient(ServiceClient value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewServiceConnection_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // ROSNewServiceConnection
