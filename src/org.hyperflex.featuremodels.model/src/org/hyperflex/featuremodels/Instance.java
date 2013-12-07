/**
 * Feature Model Plugin
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
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
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
package org.hyperflex.featuremodels;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.featuremodels.Instance#getId <em>Id</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Instance#getDescritpion <em>Descritpion</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Instance#getSelectedFeatures <em>Selected Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.featuremodels.featuremodelsPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getInstance_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Instance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Descritpion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descritpion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descritpion</em>' attribute.
	 * @see #setDescritpion(String)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getInstance_Descritpion()
	 * @model
	 * @generated
	 */
	String getDescritpion();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Instance#getDescritpion <em>Descritpion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descritpion</em>' attribute.
	 * @see #getDescritpion()
	 * @generated
	 */
	void setDescritpion(String value);

	/**
	 * Returns the value of the '<em><b>Selected Features</b></em>' reference list.
	 * The list contents are of type {@link org.hyperflex.featuremodels.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Features</em>' reference list.
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getInstance_SelectedFeatures()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getSelectedFeatures();

} // Instance
