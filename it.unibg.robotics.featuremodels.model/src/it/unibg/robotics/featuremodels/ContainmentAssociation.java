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
 * A representation of the model object '<em><b>Containment Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getParent <em>Parent</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getContainmentAssociation()
 * @model
 * @generated
 */
public interface ContainmentAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Features</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.featuremodels.Feature}.
	 * It is bidirectional and its opposite is '{@link it.unibg.robotics.featuremodels.Feature#getContainerParent <em>Container Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Features</em>' containment reference list.
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getContainmentAssociation_SubFeatures()
	 * @see it.unibg.robotics.featuremodels.Feature#getContainerParent
	 * @model opposite="containerParent" containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getSubFeatures();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibg.robotics.featuremodels.Feature#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Feature)
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getContainmentAssociation_Parent()
	 * @see it.unibg.robotics.featuremodels.Feature#getContainers
	 * @model opposite="containers" transient="false"
	 * @generated
	 */
	Feature getParent();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Feature value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getContainmentAssociation_UpperBound()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see it.unibg.robotics.featuremodels.featuremodelsPackage#getContainmentAssociation_LowerBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.featuremodels.ContainmentAssociation#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

} // ContainmentAssociation
