/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
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
package it.unibg.robotics.resolutionmodels.rttresolutionmodels;

import it.unibg.robotics.resolutionmodels.RMTransfImplementation;

import org.orocos.model.rtt.TaskContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTT Transf Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTTransfImplementation()
 * @model
 * @generated
 */
public interface RTTTransfImplementation extends RMTransfImplementation {
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
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTTransfImplementation_TargetTaskContext()
	 * @model required="true"
	 * @generated
	 */
	TaskContext getTargetTaskContext();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfImplementation#getTargetTaskContext <em>Target Task Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Task Context</em>' reference.
	 * @see #getTargetTaskContext()
	 * @generated
	 */
	void setTargetTaskContext(TaskContext value);

} // RTTTransfImplementation
