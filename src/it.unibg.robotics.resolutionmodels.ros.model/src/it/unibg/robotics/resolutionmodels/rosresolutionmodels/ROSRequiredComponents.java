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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels;

import it.unibg.robotics.resolutionmodels.RMRequiredComponents;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Required Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents#getROSNodes <em>ROS Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredComponents()
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
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredComponents_ROSNodes()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getROSNodes();

} // ROSRequiredComponents
