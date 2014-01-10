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

import org.hyperflex.featuremodels.FeatureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.ResolutionModel#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.ResolutionModel#getResolutionElements <em>Resolution Elements</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.ResolutionModel#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.ResolutionModel#getTemplateSystemModel <em>Template System Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getResolutionModel()
 * @model
 * @generated
 */
public interface ResolutionModel extends EObject {
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
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getResolutionModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.ResolutionModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resolution Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.RMResolutionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Elements</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getResolutionModel_ResolutionElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RMResolutionElement> getResolutionElements();

	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' reference.
	 * @see #setFeatureModel(FeatureModel)
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getResolutionModel_FeatureModel()
	 * @model required="true"
	 * @generated
	 */
	FeatureModel getFeatureModel();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.ResolutionModel#getFeatureModel <em>Feature Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Template System Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template System Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template System Model</em>' containment reference.
	 * @see #setTemplateSystemModel(TemplateSystemModel)
	 * @see org.hyperflex.resolutionmodels.resolutionmodelsPackage#getResolutionModel_TemplateSystemModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateSystemModel getTemplateSystemModel();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.ResolutionModel#getTemplateSystemModel <em>Template System Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template System Model</em>' containment reference.
	 * @see #getTemplateSystemModel()
	 * @generated
	 */
	void setTemplateSystemModel(TemplateSystemModel value);

} // ResolutionModel
