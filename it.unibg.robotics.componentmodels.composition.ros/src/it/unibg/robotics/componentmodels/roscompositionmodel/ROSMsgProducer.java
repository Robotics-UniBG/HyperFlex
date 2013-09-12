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

import it.unibg.robotics.compositionmodel.CompProvidedInterf;
import it.unibg.robotics.roscomponentmodel.CompositeMsgProducer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Msg Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.componentmodels.roscompositionmodel.ROSMsgProducer#getMsgProducer <em>Msg Producer</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage#getROSMsgProducer()
 * @model
 * @generated
 */
public interface ROSMsgProducer extends CompProvidedInterf {
	/**
	 * Returns the value of the '<em><b>Msg Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Producer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Producer</em>' reference.
	 * @see #setMsgProducer(CompositeMsgProducer)
	 * @see it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage#getROSMsgProducer_MsgProducer()
	 * @model required="true"
	 * @generated
	 */
	CompositeMsgProducer getMsgProducer();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.componentmodels.roscompositionmodel.ROSMsgProducer#getMsgProducer <em>Msg Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Producer</em>' reference.
	 * @see #getMsgProducer()
	 * @generated
	 */
	void setMsgProducer(CompositeMsgProducer value);

} // ROSMsgProducer
