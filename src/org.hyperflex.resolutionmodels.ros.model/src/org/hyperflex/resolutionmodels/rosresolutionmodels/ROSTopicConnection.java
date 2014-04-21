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
package org.hyperflex.resolutionmodels.rosresolutionmodels;

import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Topic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getMessageInterface <em>Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSTopicConnection()
 * @model abstract="true"
 * @generated
 */
public interface ROSTopicConnection extends ROSConnection {
	/**
	 * Returns the value of the '<em><b>Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Interface</em>' reference.
	 * @see #setMessageInterface(MsgInterface)
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSTopicConnection_MessageInterface()
	 * @model required="true"
	 * @generated
	 */
	MsgInterface getMessageInterface();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection#getMessageInterface <em>Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Interface</em>' reference.
	 * @see #getMessageInterface()
	 * @generated
	 */
	void setMessageInterface(MsgInterface value);

} // ROSTopicConnection
