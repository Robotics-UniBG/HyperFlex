/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
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
package org.hyperflex.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.CompInputPort#getExposedPort <em>Exposed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getCompInputPort()
 * @model
 * @generated
 */
public interface CompInputPort extends InputDataPort {
	/**
	 * Returns the value of the '<em><b>Exposed Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Port</em>' reference.
	 * @see #setExposedPort(InputDataPort)
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getCompInputPort_ExposedPort()
	 * @model required="true"
	 * @generated
	 */
	InputDataPort getExposedPort();

	/**
	 * Sets the value of the '{@link org.hyperflex.orocoscomponentmodel.CompInputPort#getExposedPort <em>Exposed Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Port</em>' reference.
	 * @see #getExposedPort()
	 * @generated
	 */
	void setExposedPort(InputDataPort value);

} // CompInputPort
