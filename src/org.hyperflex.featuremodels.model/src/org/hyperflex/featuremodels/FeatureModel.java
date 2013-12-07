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

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.featuremodels.FeatureModel#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.FeatureModel#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.FeatureModel#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.FeatureModel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
	
	/**
	 * @generated NOT
	 */
	public final static String INSTANCE_SELECTED_PROPERTY = "INSTANCE_SELECTED_PROPERTY";
	/**
	 * @generated NOT
	 */
	public final static String INSTANCE_UPDATED_PROPERTY = "INSTANCE_UPDATED_PROPERTY";
	
	
	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference.
	 * @see #setRootFeature(Feature)
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeatureModel_RootFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getRootFeature();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.FeatureModel#getRootFeature <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' containment reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.featuremodels.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeatureModel_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.featuremodels.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeatureModel_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

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
	 * @see org.hyperflex.featuremodels.featuremodelsPackage#getFeatureModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.featuremodels.FeatureModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @generated NOT
	 */
	public ArrayList<Feature> getAllFeatures();
	
	/**
	 * @generated NOT
	 */
	public ArrayList<ContainmentAssociation> getAllContainmentAssociations();
	
	/**
	 * @generated NOT
	 */
	public ArrayList<Feature> getRequiredFeatures();
	
	/**
	 * @generated NOT
	 */
	public Constraint getConstraint(String name);
	
	/**
	 * @generated NOT
	 */
	public Instance getSelectedInstance();

	/**
	 * @generated NOT
	 */
	public void setSelectedInstance(Instance selectedInstance);
	
	/**
	 * @generated NOT
	 */
	public void addPropertyChangeListener(PropertyChangeListener l);
	/**
	 * @generated NOT
	 */
	public void removePropertyChangeListener(PropertyChangeListener l);
	
	/**
	 * @generated NOT
	 */
	public void addFeatureToInstance(Instance instance, Feature feature);
	
	/**
	 * @generated NOT
	 */
	public void removeFeatureFromInstance(Instance instance, Feature feature);

} // FeatureModel
