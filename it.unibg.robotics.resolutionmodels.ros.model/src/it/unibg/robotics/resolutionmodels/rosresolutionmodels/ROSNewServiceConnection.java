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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS New Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSNewServiceConnection()
 * @model
 * @generated
 */
public interface ROSNewServiceConnection extends ROSServiceConnection {
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
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSNewServiceConnection_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // ROSNewServiceConnection
