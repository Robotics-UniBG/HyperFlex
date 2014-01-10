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
 * A representation of the model object '<em><b>Cloud Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.CloudContainer#getEndPoint <em>End Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getCloudContainer()
 * @model
 * @generated
 */
public interface CloudContainer extends Container {
	/**
	 * Returns the value of the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' containment reference.
	 * @see #setEndPoint(EnvironmentEndPoint)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getCloudContainer_EndPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EnvironmentEndPoint getEndPoint();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.CloudContainer#getEndPoint <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' containment reference.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(EnvironmentEndPoint value);

} // CloudContainer
