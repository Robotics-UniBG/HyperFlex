/**
 * HyperFlex toolchain
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
package it.unibg.robotics.roscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Srv Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.CompositeSrvProducer#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getCompositeSrvProducer()
 * @model
 * @generated
 */
public interface CompositeSrvProducer extends SrvProducer {
	/**
	 * Returns the value of the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' reference.
	 * @see #setPromote(SrvProducer)
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getCompositeSrvProducer_Promote()
	 * @model
	 * @generated
	 */
	SrvProducer getPromote();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.roscomponentmodel.CompositeSrvProducer#getPromote <em>Promote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' reference.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(SrvProducer value);

} // CompositeSrvProducer
