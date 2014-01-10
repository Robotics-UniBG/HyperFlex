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
package org.hyperflex.compositionmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Composite Provided Interf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.compositionmodel.SystemCompositeProvidedInterf#getImpl <em>Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystemCompositeProvidedInterf()
 * @model
 * @generated
 */
public interface SystemCompositeProvidedInterf extends CompProvidedInterf {
	/**
	 * Returns the value of the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' reference.
	 * @see #setImpl(SystemProvidedInterf)
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystemCompositeProvidedInterf_Impl()
	 * @model required="true"
	 * @generated
	 */
	SystemProvidedInterf getImpl();

	/**
	 * Sets the value of the '{@link org.hyperflex.compositionmodel.SystemCompositeProvidedInterf#getImpl <em>Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(SystemProvidedInterf value);

} // SystemCompositeProvidedInterf
