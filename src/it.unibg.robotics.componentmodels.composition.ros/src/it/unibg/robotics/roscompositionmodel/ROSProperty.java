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
package org.hyperflex.roscompositionmodel;

import org.hyperflex.compositionmodel.Property;

import org.hyperflex.roscomponentmodel.CompositeProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscompositionmodel.ROSProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage#getROSProperty()
 * @model
 * @generated
 */
public interface ROSProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(CompositeProperty)
	 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage#getROSProperty_Property()
	 * @model
	 * @generated
	 */
	CompositeProperty getProperty();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscompositionmodel.ROSProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(CompositeProperty value);

} // ROSProperty
