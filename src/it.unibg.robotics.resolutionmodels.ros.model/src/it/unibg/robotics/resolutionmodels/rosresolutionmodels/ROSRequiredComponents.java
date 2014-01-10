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

import org.hyperflex.resolutionmodels.RMRequiredComponents;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Required Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredComponents#getROSNodes <em>ROS Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredComponents()
 * @model
 * @generated
 */
public interface ROSRequiredComponents extends RMRequiredComponents {
	/**
	 * Returns the value of the '<em><b>ROS Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.ros.model.ros.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ROS Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROS Nodes</em>' reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredComponents_ROSNodes()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getROSNodes();

} // ROSRequiredComponents
