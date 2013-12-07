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
 * A representation of the model object '<em><b>Comp Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.CompProperty#getExposedProperty <em>Exposed Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompProperty()
 * @model
 * @generated
 */
public interface CompProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Exposed Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Property</em>' reference.
	 * @see #setExposedProperty(Property)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getCompProperty_ExposedProperty()
	 * @model required="true"
	 * @generated
	 */
	Property getExposedProperty();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.CompProperty#getExposedProperty <em>Exposed Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed Property</em>' reference.
	 * @see #getExposedProperty()
	 * @generated
	 */
	void setExposedProperty(Property value);

} // CompProperty
