/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package it.unibg.robotics.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Operation Caller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.CompOperationCaller#getExposedOpCaller <em>Exposed Op Caller</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompOperationCaller()
 * @model
 * @generated
 */
public interface CompOperationCaller extends OperationCaller {
	/**
	 * Returns the value of the '<em><b>Exposed Op Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Op Caller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Op Caller</em>' reference.
	 * @see #setExposedOpCaller(OperationCaller)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompOperationCaller_ExposedOpCaller()
	 * @model
	 * @generated
	 */
	OperationCaller getExposedOpCaller();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.CompOperationCaller#getExposedOpCaller <em>Exposed Op Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Op Caller</em>' reference.
	 * @see #getExposedOpCaller()
	 * @generated
	 */
	void setExposedOpCaller(OperationCaller value);

} // CompOperationCaller
