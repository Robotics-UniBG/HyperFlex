/**
 * Variability Modeling And Resolution Plugins (VARP)
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
package it.unibg.robotics.compositionmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Required Interf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.compositionmodel.SystemRequiredInterf#getExposed <em>Exposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystemRequiredInterf()
 * @model
 * @generated
 */
public interface SystemRequiredInterf extends RequiredInterface {
	/**
	 * Returns the value of the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed</em>' reference.
	 * @see #setExposed(RequiredInterface)
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystemRequiredInterf_Exposed()
	 * @model required="true"
	 * @generated
	 */
	RequiredInterface getExposed();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.compositionmodel.SystemRequiredInterf#getExposed <em>Exposed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed</em>' reference.
	 * @see #getExposed()
	 * @generated
	 */
	void setExposed(RequiredInterface value);

} // SystemRequiredInterf
