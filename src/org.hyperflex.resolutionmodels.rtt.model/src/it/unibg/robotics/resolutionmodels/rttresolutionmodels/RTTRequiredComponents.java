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
package org.hyperflex.resolutionmodels.rttresolutionmodels;

import org.hyperflex.resolutionmodels.RMRequiredComponents;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTT Required Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents#getRTTTaskContexts <em>RTT Task Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTRequiredComponents()
 * @model
 * @generated
 */
public interface RTTRequiredComponents extends RMRequiredComponents {
	/**
	 * Returns the value of the '<em><b>RTT Task Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.orocos.model.rtt.TaskContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTT Task Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTT Task Contexts</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTRequiredComponents_RTTTaskContexts()
	 * @model required="true"
	 * @generated
	 */
	EList<TaskContext> getRTTTaskContexts();

} // RTTRequiredComponents
