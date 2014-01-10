/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
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
package org.hyperflex.resolutionmodels.rosresolutionmodels;

import org.hyperflex.resolutionmodels.RMTransfProperty;

import org.omg.Dynamic.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Transf Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty#getTargetProperty <em>Target Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSTransfProperty()
 * @model
 * @generated
 */
public interface ROSTransfProperty extends RMTransfProperty {
	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' reference.
	 * @see #setTargetProperty(Parameter)
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSTransfProperty_TargetProperty()
	 * @model required="true"
	 * @generated
	 */
	Parameter getTargetProperty();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty#getTargetProperty <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' reference.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(Parameter value);

} // ROSTransfProperty
