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
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.RobotContainer#getEndPoint <em>End Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotContainer()
 * @model
 * @generated
 */
public interface RobotContainer extends Container {
	/**
	 * Returns the value of the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' containment reference.
	 * @see #setEndPoint(RobotEndPoint)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getRobotContainer_EndPoint()
	 * @model containment="true"
	 * @generated
	 */
	RobotEndPoint getEndPoint();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.RobotContainer#getEndPoint <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' containment reference.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(RobotEndPoint value);

} // RobotContainer
