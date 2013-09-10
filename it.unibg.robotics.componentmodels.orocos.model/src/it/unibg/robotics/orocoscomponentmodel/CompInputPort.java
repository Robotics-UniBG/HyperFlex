/**
 * Variability Analysis And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.CompInputPort#getExposedPort <em>Exposed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompInputPort()
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
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompInputPort_ExposedPort()
	 * @model required="true"
	 * @generated
	 */
	InputDataPort getExposedPort();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.CompInputPort#getExposedPort <em>Exposed Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Port</em>' reference.
	 * @see #getExposedPort()
	 * @generated
	 */
	void setExposedPort(InputDataPort value);

} // CompInputPort
