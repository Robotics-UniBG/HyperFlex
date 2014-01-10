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

import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceProducer <em>Service Producer</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceConsumer <em>Service Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSServiceConnection()
 * @model
 * @generated
 */
public interface ROSServiceConnection extends ROSConnection {
	/**
	 * Returns the value of the '<em><b>Service Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Producer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Producer</em>' reference.
	 * @see #setServiceProducer(SrvProducer)
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSServiceConnection_ServiceProducer()
	 * @model required="true"
	 * @generated
	 */
	SrvProducer getServiceProducer();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceProducer <em>Service Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Producer</em>' reference.
	 * @see #getServiceProducer()
	 * @generated
	 */
	void setServiceProducer(SrvProducer value);

	/**
	 * Returns the value of the '<em><b>Service Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Consumer</em>' reference.
	 * @see #setServiceConsumer(SrvConsumer)
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSServiceConnection_ServiceConsumer()
	 * @model required="true"
	 * @generated
	 */
	SrvConsumer getServiceConsumer();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection#getServiceConsumer <em>Service Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Consumer</em>' reference.
	 * @see #getServiceConsumer()
	 * @generated
	 */
	void setServiceConsumer(SrvConsumer value);

} // ROSServiceConnection
