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
package it.unibg.robotics.compositionmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Provided Interf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.compositionmodel.SystemProvidedInterf#getExposed <em>Exposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystemProvidedInterf()
 * @model
 * @generated
 */
public interface SystemProvidedInterf extends ProvidedInterface {
	/**
	 * Returns the value of the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed</em>' reference.
	 * @see #setExposed(ProvidedInterface)
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystemProvidedInterf_Exposed()
	 * @model required="true"
	 * @generated
	 */
	ProvidedInterface getExposed();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.compositionmodel.SystemProvidedInterf#getExposed <em>Exposed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed</em>' reference.
	 * @see #getExposed()
	 * @generated
	 */
	void setExposed(ProvidedInterface value);

} // SystemProvidedInterf
