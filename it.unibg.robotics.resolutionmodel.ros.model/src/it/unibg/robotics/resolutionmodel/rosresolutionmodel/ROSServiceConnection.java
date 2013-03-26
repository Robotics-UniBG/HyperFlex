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

import org.ros.model.ros.Service;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSServiceConnection()
 * @model
 * @generated
 */
public interface ROSServiceConnection extends ROSAbstractConnection {
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
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSServiceConnection_ServiceServer()
	 * @model required="true"
	 * @generated
	 */
	ServiceServer getServiceServer();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection#getServiceServer <em>Service Server</em>}' reference.
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
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSServiceConnection_ServiceClient()
	 * @model required="true"
	 * @generated
	 */
	ServiceClient getServiceClient();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection#getServiceClient <em>Service Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Client</em>' reference.
	 * @see #getServiceClient()
	 * @generated
	 */
	void setServiceClient(ServiceClient value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage#getROSServiceConnection_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ROSServiceConnection
