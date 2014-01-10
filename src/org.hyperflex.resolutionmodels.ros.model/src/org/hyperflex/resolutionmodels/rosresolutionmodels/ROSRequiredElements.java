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
package org.hyperflex.resolutionmodels.rosresolutionmodels;

import org.eclipse.emf.common.util.EList;

import org.hyperflex.resolutionmodels.RMRequiredElements;

import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.Wire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Required Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredNodes <em>Required Nodes</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredTopicConnections <em>Required Topic Connections</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements#getRequiredServiceConnections <em>Required Service Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredElements()
 * @model
 * @generated
 */
public interface ROSRequiredElements extends RMRequiredElements {
	/**
	 * Returns the value of the '<em><b>Required Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Nodes</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredElements_RequiredNodes()
	 * @model
	 * @generated
	 */
	EList<Node> getRequiredNodes();

	/**
	 * Returns the value of the '<em><b>Required Topic Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Topic Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Topic Connections</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredElements_RequiredTopicConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSTopicConnection> getRequiredTopicConnections();

	/**
	 * Returns the value of the '<em><b>Required Service Connections</b></em>' reference list.
	 * The list contents are of type {@link org.hyperflex.roscomponentmodel.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Service Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Service Connections</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredElements_RequiredServiceConnections()
	 * @model
	 * @generated
	 */
	EList<Wire> getRequiredServiceConnections();

} // ROSRequiredElements
