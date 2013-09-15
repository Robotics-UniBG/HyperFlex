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

import it.unibg.robotics.resolutionmodels.RMRequiredConnections;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTT Required Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredConnections#getRTTConnectionPolicies <em>RTT Connection Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTRequiredConnections()
 * @model
 * @generated
 */
public interface RTTRequiredConnections extends RMRequiredConnections {
	/**
	 * Returns the value of the '<em><b>RTT Connection Policies</b></em>' reference list.
	 * The list contents are of type {@link org.orocos.model.rtt.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTT Connection Policies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTT Connection Policies</em>' reference list.
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTRequiredConnections_RTTConnectionPolicies()
	 * @model required="true"
	 * @generated
	 */
	EList<ConnectionPolicy> getRTTConnectionPolicies();

} // RTTRequiredConnections
