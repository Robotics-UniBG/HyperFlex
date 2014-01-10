/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * In collaboration with by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rttresolutionmodels;

import org.hyperflex.orocoscomponentmodel.TaskContext;

import org.hyperflex.resolutionmodels.RMTransfImplementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orocos Transf Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosTransfImplementation()
 * @model
 * @generated
 */
public interface OrocosTransfImplementation extends RMTransfImplementation {
	/**
	 * Returns the value of the '<em><b>Target Task Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Task Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Task Context</em>' reference.
	 * @see #setTargetTaskContext(TaskContext)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosTransfImplementation_TargetTaskContext()
	 * @model required="true"
	 * @generated
	 */
	TaskContext getTargetTaskContext();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Task Context</em>' reference.
	 * @see #getTargetTaskContext()
	 * @generated
	 */
	void setTargetTaskContext(TaskContext value);

} // OrocosTransfImplementation
