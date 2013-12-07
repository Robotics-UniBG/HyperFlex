/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Input Data Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.TCInputDataPort#isEventPort <em>Event Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getTCInputDataPort()
 * @model
 * @generated
 */
public interface TCInputDataPort extends InputDataPort {
	/**
	 * Returns the value of the '<em><b>Event Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Port</em>' attribute.
	 * @see #setEventPort(boolean)
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getTCInputDataPort_EventPort()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEventPort();

	/**
	 * Sets the value of the '{@link org.hyperflex.orocoscomponentmodel.TCInputDataPort#isEventPort <em>Event Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Port</em>' attribute.
	 * @see #isEventPort()
	 * @generated
	 */
	void setEventPort(boolean value);

} // TCInputDataPort
