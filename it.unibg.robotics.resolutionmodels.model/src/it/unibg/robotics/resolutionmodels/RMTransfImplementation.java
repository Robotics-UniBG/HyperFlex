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
package it.unibg.robotics.resolutionmodels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RM Transf Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassNamespace <em>Class Namespace</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.resolutionmodelsPackage#getRMTransfImplementation()
 * @model abstract="true"
 * @generated
 */
public interface RMTransfImplementation extends RMAbstractTransformation {
	/**
	 * Returns the value of the '<em><b>Class Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Namespace</em>' attribute.
	 * @see #setClassNamespace(String)
	 * @see it.unibg.robotics.resolutionmodels.resolutionmodelsPackage#getRMTransfImplementation_ClassNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getClassNamespace();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassNamespace <em>Class Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Namespace</em>' attribute.
	 * @see #getClassNamespace()
	 * @generated
	 */
	void setClassNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see it.unibg.robotics.resolutionmodels.resolutionmodelsPackage#getRMTransfImplementation_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // RMTransfImplementation
