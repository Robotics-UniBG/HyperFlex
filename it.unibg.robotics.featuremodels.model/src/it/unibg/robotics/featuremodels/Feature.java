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
package it.unibg.robotics.featuremodels;

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
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#isRoot <em>Root</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#isRequired <em>Required</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getSimpleParent <em>Simple Parent</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getSubCompositeFeatures <em>Sub Composite Features</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getCompositeParent <em>Composite Parent</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.Feature#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature()
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
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#getName <em>Name</em>}' attribute.
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
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_Root()
	 * @model default="FALSE"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#isRoot <em>Root</em>}' attribute.
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
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_Required()
	 * @model default="FALSE" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Features</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.featuremodels.Feature}.
	 * It is bidirectional and its opposite is '{@link it.unibg.robotics.featuremodels.Feature#getSimpleParent <em>Simple Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Features</em>' containment reference list.
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_SubFeatures()
	 * @see it.unibg.robotics.featuremodels.Feature#getSimpleParent
	 * @model opposite="simpleParent" containment="true"
	 * @generated
	 */
	EList<Feature> getSubFeatures();

	/**
	 * Returns the value of the '<em><b>Simple Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibg.robotics.featuremodels.Feature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Parent</em>' container reference.
	 * @see #setSimpleParent(Feature)
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_SimpleParent()
	 * @see it.unibg.robotics.featuremodels.Feature#getSubFeatures
	 * @model opposite="subFeatures" transient="false"
	 * @generated
	 */
	Feature getSimpleParent();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#getSimpleParent <em>Simple Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Parent</em>' container reference.
	 * @see #getSimpleParent()
	 * @generated
	 */
	void setSimpleParent(Feature value);

	/**
	 * Returns the value of the '<em><b>Sub Composite Features</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.featuremodels.CompositeFeature}.
	 * It is bidirectional and its opposite is '{@link it.unibg.robotics.featuremodels.CompositeFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Composite Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Composite Features</em>' containment reference list.
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_SubCompositeFeatures()
	 * @see it.unibg.robotics.featuremodels.CompositeFeature#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<CompositeFeature> getSubCompositeFeatures();

	/**
	 * Returns the value of the '<em><b>Composite Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibg.robotics.featuremodels.CompositeFeature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Parent</em>' container reference.
	 * @see #setCompositeParent(CompositeFeature)
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_CompositeParent()
	 * @see it.unibg.robotics.featuremodels.CompositeFeature#getSubFeatures
	 * @model opposite="subFeatures" transient="false"
	 * @generated
	 */
	CompositeFeature getCompositeParent();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#getCompositeParent <em>Composite Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Parent</em>' container reference.
	 * @see #getCompositeParent()
	 * @generated
	 */
	void setCompositeParent(CompositeFeature value);

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
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#getLowerBound <em>Lower Bound</em>}' attribute.
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
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.Feature#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.featuremodels.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getFeature_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();
	
	/**
	 * @generated NOT
	 */
	FeatureModel getFeatureModel();

} // Feature
