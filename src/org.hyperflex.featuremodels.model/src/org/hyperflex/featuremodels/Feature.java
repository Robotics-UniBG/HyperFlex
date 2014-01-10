/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
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
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#isRoot <em>Root</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#isRequired <em>Required</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getFeatureParent <em>Feature Parent</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getContainerParent <em>Container Parent</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.Feature#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_Root()
	 * @model default="FALSE"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_Required()
	 * @model default="FALSE" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.featuremodels.Feature}.
	 * It is bidirectional and its opposite is '{@link org.hyperflex.featuremodels.Feature#getFeatureParent <em>Feature Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Features</em>' containment reference list.
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_SubFeatures()
	 * @see org.hyperflex.featuremodels.Feature#getFeatureParent
	 * @model opposite="featureParent" containment="true"
	 * @generated
	 */
	EList<Feature> getSubFeatures();

	/**
	 * Returns the value of the '<em><b>Feature Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.hyperflex.featuremodels.Feature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Parent</em>' container reference.
	 * @see #setFeatureParent(Feature)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_FeatureParent()
	 * @see org.hyperflex.featuremodels.Feature#getSubFeatures
	 * @model opposite="subFeatures" transient="false"
	 * @generated
	 */
	Feature getFeatureParent();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#getFeatureParent <em>Feature Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Parent</em>' container reference.
	 * @see #getFeatureParent()
	 * @generated
	 */
	void setFeatureParent(Feature value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.featuremodels.ContainmentAssociation}.
	 * It is bidirectional and its opposite is '{@link org.hyperflex.featuremodels.ContainmentAssociation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_Containers()
	 * @see org.hyperflex.featuremodels.ContainmentAssociation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ContainmentAssociation> getContainers();

	/**
	 * Returns the value of the '<em><b>Container Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.hyperflex.featuremodels.ContainmentAssociation#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Parent</em>' container reference.
	 * @see #setContainerParent(ContainmentAssociation)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_ContainerParent()
	 * @see org.hyperflex.featuremodels.ContainmentAssociation#getSubFeatures
	 * @model opposite="subFeatures" transient="false"
	 * @generated
	 */
	ContainmentAssociation getContainerParent();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#getContainerParent <em>Container Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Parent</em>' container reference.
	 * @see #getContainerParent()
	 * @generated
	 */
	void setContainerParent(ContainmentAssociation value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.Feature#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.featuremodels.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeature_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();
	
	/**
	 * @generated NOT
	 */
	FeatureModel getFeatureModel();

} // Feature
