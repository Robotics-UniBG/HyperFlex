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
package org.hyperflex.roscompositionmodel;

import org.hyperflex.compositionmodel.CompProvidedInterf;

import org.hyperflex.roscomponentmodel.CompositeSrvProducer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Srv Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscompositionmodel.ROSSrvProducer#getSrvProducer <em>Srv Producer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage#getROSSrvProducer()
 * @model
 * @generated
 */
public interface ROSSrvProducer extends CompProvidedInterf {
	/**
	 * Returns the value of the '<em><b>Srv Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Producer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Producer</em>' reference.
	 * @see #setSrvProducer(CompositeSrvProducer)
	 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage#getROSSrvProducer_SrvProducer()
	 * @model required="true"
	 * @generated
	 */
	CompositeSrvProducer getSrvProducer();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscompositionmodel.ROSSrvProducer#getSrvProducer <em>Srv Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Producer</em>' reference.
	 * @see #getSrvProducer()
	 * @generated
	 */
	void setSrvProducer(CompositeSrvProducer value);

} // ROSSrvProducer
