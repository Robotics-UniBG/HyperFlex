/**
 * Variability Analysis and Resolution Plugin (VARP)
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
 */
package it.unibg.robotics.componentmodels.roscompositionmodel;

import it.unibg.robotics.compositionmodel.CompRequiredInterf;
import it.unibg.robotics.roscomponentmodel.CompositeSrvConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Srv Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.componentmodels.roscompositionmodel.ROSSrvConsumer#getSrvConsumer <em>Srv Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage#getROSSrvConsumer()
 * @model
 * @generated
 */
public interface ROSSrvConsumer extends CompRequiredInterf {
	/**
	 * Returns the value of the '<em><b>Srv Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Consumer</em>' reference.
	 * @see #setSrvConsumer(CompositeSrvConsumer)
	 * @see it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage#getROSSrvConsumer_SrvConsumer()
	 * @model required="true"
	 * @generated
	 */
	CompositeSrvConsumer getSrvConsumer();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.componentmodels.roscompositionmodel.ROSSrvConsumer#getSrvConsumer <em>Srv Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Consumer</em>' reference.
	 * @see #getSrvConsumer()
	 * @generated
	 */
	void setSrvConsumer(CompositeSrvConsumer value);

} // ROSSrvConsumer
