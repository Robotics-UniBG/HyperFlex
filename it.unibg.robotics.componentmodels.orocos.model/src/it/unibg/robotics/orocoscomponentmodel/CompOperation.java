/**
 * Variability Analysis And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.orocoscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.CompOperation#getExposedOp <em>Exposed Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompOperation()
 * @model
 * @generated
 */
public interface CompOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Exposed Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Op</em>' reference.
	 * @see #setExposedOp(Operation)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompOperation_ExposedOp()
	 * @model
	 * @generated
	 */
	Operation getExposedOp();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.CompOperation#getExposedOp <em>Exposed Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Op</em>' reference.
	 * @see #getExposedOp()
	 * @generated
	 */
	void setExposedOp(Operation value);

} // CompOperation
