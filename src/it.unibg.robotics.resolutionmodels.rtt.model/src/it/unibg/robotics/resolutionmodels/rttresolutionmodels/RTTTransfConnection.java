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

import org.hyperflex.resolutionmodels.RMTransfConnection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTT Transf Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection#getNewConnections <em>New Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTTransfConnection()
 * @model
 * @generated
 */
public interface RTTTransfConnection extends RMTransfConnection {
	/**
	 * Returns the value of the '<em><b>New Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Connections</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTTransfConnection_NewConnections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RTTConnection> getNewConnections();

} // RTTTransfConnection
