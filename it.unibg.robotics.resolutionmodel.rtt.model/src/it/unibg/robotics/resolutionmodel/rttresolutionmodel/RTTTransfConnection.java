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
package it.unibg.robotics.resolutionmodel.rttresolutionmodel;

import it.unibg.robotics.resolutionmodel.RMTransfConnection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTT Transf Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTTransfConnection#getNewConnections <em>New Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.rttresolutionmodel.rttresolutionmodelPackage#getRTTTransfConnection()
 * @model
 * @generated
 */
public interface RTTTransfConnection extends RMTransfConnection {
	/**
	 * Returns the value of the '<em><b>New Connections</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Connections</em>' containment reference list.
	 * @see it.unibg.robotics.resolutionmodel.rttresolutionmodel.rttresolutionmodelPackage#getRTTTransfConnection_NewConnections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RTTConnection> getNewConnections();

} // RTTTransfConnection
