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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point Msg Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getSubscriber <em>Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getEndPointMsgConnection()
 * @model
 * @generated
 */
public interface EndPointMsgConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(EndPointPublisher)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getEndPointMsgConnection_Publisher()
	 * @model required="true"
	 * @generated
	 */
	EndPointPublisher getPublisher();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(EndPointPublisher value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference.
	 * @see #setSubscriber(EndPointSubscriber)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getEndPointMsgConnection_Subscriber()
	 * @model required="true"
	 * @generated
	 */
	EndPointSubscriber getSubscriber();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection#getSubscriber <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(EndPointSubscriber value);

} // EndPointMsgConnection
