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

import org.eclipse.emf.common.util.EList;

import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.PeersConnection;
import org.hyperflex.orocoscomponentmodel.TaskContext;

import org.hyperflex.resolutionmodels.RMRequiredElements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orocos Required Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredTaskContexts <em>Required Task Contexts</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredConnectionPolicies <em>Required Connection Policies</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements#getRequiredPeersConnection <em>Required Peers Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosRequiredElements()
 * @model
 * @generated
 */
public interface OrocosRequiredElements extends RMRequiredElements {
	/**
	 * Returns the value of the '<em><b>Required Task Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.TaskContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Task Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Task Contexts</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosRequiredElements_RequiredTaskContexts()
	 * @model
	 * @generated
	 */
	EList<TaskContext> getRequiredTaskContexts();

	/**
	 * Returns the value of the '<em><b>Required Connection Policies</b></em>' reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Connection Policies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Connection Policies</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosRequiredElements_RequiredConnectionPolicies()
	 * @model
	 * @generated
	 */
	EList<ConnectionPolicy> getRequiredConnectionPolicies();

	/**
	 * Returns the value of the '<em><b>Required Peers Connection</b></em>' reference list.
	 * The list contents are of type {@link org.hyperflex.orocoscomponentmodel.PeersConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Peers Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Peers Connection</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosRequiredElements_RequiredPeersConnection()
	 * @model
	 * @generated
	 */
	EList<PeersConnection> getRequiredPeersConnection();

} // OrocosRequiredElements
