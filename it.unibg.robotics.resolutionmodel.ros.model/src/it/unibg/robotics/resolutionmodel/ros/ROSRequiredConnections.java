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
package it.unibg.robotics.resolutionmodel.ros;

import it.unibg.robotics.resolutionmodel.RMRequiredConnections;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Required Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.ROSRequiredConnections#getROSConnections <em>ROS Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSRequiredConnections()
 * @model
 * @generated
 */
public interface ROSRequiredConnections extends RMRequiredConnections {
	/**
	 * Returns the value of the '<em><b>ROS Connections</b></em>' reference list.
	 * The list contents are of type {@link it.unibg.robotics.resolutionmodel.ros.ROSAbstractConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ROS Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROS Connections</em>' reference list.
	 * @see it.unibg.robotics.resolutionmodel.ros.rosPackage#getROSRequiredConnections_ROSConnections()
	 * @model required="true"
	 * @generated
	 */
	EList<ROSAbstractConnection> getROSConnections();

} // ROSRequiredConnections
