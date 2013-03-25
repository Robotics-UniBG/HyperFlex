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

import org.ros.model.ros.Publisher;
import org.ros.model.ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS New Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection#getTopicName <em>Topic Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewTopicConnection()
 * @model
 * @generated
 */
public interface ROSNewTopicConnection extends ROSAbstractConnection {
	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(Publisher)
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewTopicConnection_Publisher()
	 * @model required="true"
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference.
	 * @see #setSubscriber(Subscriber)
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewTopicConnection_Subscriber()
	 * @model required="true"
	 * @generated
	 */
	Subscriber getSubscriber();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection#getSubscriber <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Subscriber value);

	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSNewTopicConnection_TopicName()
	 * @model required="true"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

} // ROSNewTopicConnection
