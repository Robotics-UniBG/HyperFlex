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

import org.ros.model.ros.Topic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Existing Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSExistingTopicConnection()
 * @model
 * @generated
 */
public interface ROSExistingTopicConnection extends ROSTopicConnection {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSExistingTopicConnection_Topic()
	 * @model required="true"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

} // ROSExistingTopicConnection
