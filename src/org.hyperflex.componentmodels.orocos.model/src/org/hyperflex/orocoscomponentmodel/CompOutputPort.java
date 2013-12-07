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
 * A representation of the model object '<em><b>Comp Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.CompOutputPort#getExposedPort <em>Exposed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getCompOutputPort()
 * @model
 * @generated
 */
public interface CompOutputPort extends OutputDataPort {
	/**
	 * Returns the value of the '<em><b>Exposed Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Port</em>' reference.
	 * @see #setExposedPort(OutputDataPort)
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#getCompOutputPort_ExposedPort()
	 * @model required="true"
	 * @generated
	 */
	OutputDataPort getExposedPort();

	/**
	 * Sets the value of the '{@link org.hyperflex.orocoscomponentmodel.CompOutputPort#getExposedPort <em>Exposed Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Port</em>' reference.
	 * @see #getExposedPort()
	 * @generated
	 */
	void setExposedPort(OutputDataPort value);

} // CompOutputPort
