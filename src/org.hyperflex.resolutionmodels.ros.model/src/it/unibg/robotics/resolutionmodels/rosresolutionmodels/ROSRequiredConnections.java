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

import org.hyperflex.resolutionmodels.RMRequiredConnections;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Required Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingTopicConnections <em>Required Existing Topic Connections</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingServiceConnections <em>Required Existing Service Connections</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredExistingActionConnections <em>Required Existing Action Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections()
 * @model
 * @generated
 */
public interface ROSRequiredConnections extends RMRequiredConnections {
	/**
	 * Returns the value of the '<em><b>Required Existing Topic Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Existing Topic Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Existing Topic Connections</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections_RequiredExistingTopicConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSExistingTopicConnection> getRequiredExistingTopicConnections();

	/**
	 * Returns the value of the '<em><b>Required Existing Service Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Existing Service Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Existing Service Connections</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections_RequiredExistingServiceConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSExistingServiceConnection> getRequiredExistingServiceConnections();

	/**
	 * Returns the value of the '<em><b>Required Existing Action Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Existing Action Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Existing Action Connections</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections_RequiredExistingActionConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSExistingActionConnection> getRequiredExistingActionConnections();

} // ROSRequiredConnections
