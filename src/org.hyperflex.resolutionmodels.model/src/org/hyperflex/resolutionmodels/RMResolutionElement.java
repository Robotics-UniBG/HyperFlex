/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
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
package org.hyperflex.resolutionmodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hyperflex.featuremodels.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RM Resolution Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.RMResolutionElement#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.RMResolutionElement#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.RMResolutionElement#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.RMResolutionElement#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.RMResolutionElement#isActiveIfSelected <em>Active If Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getRMResolutionElement()
 * @model
 * @generated
 */
public interface RMResolutionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.RMTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getRMResolutionElement_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RMTransformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Required Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Elements</em>' containment reference.
	 * @see #setRequiredElements(RMRequiredElements)
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getRMResolutionElement_RequiredElements()
	 * @model containment="true"
	 * @generated
	 */
	RMRequiredElements getRequiredElements();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getRequiredElements <em>Required Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Elements</em>' containment reference.
	 * @see #getRequiredElements()
	 * @generated
	 */
	void setRequiredElements(RMRequiredElements value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getRMResolutionElement_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getRMResolutionElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.RMResolutionElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Active If Selected</b></em>' attribute.
	 * The default value is <code>"TRUE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active If Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active If Selected</em>' attribute.
	 * @see #setActiveIfSelected(boolean)
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getRMResolutionElement_ActiveIfSelected()
	 * @model default="TRUE" required="true"
	 * @generated
	 */
	boolean isActiveIfSelected();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.RMResolutionElement#isActiveIfSelected <em>Active If Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active If Selected</em>' attribute.
	 * @see #isActiveIfSelected()
	 * @generated
	 */
	void setActiveIfSelected(boolean value);

} // RMResolutionElement
