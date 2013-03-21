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
package it.unibg.robotics.resolutionmodel;

import it.unibg.robotics.featuremodels.Feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RM Resolution Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getRequiredComponents <em>Required Components</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getRequiredConnections <em>Required Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement()
 * @model
 * @generated
 */
public interface RMResolutionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.resolutionmodel.RMAbstractTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RMAbstractTransformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Required Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Components</em>' containment reference.
	 * @see #setRequiredComponents(RMRequiredComponents)
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement_RequiredComponents()
	 * @model containment="true"
	 * @generated
	 */
	RMRequiredComponents getRequiredComponents();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getRequiredComponents <em>Required Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Components</em>' containment reference.
	 * @see #getRequiredComponents()
	 * @generated
	 */
	void setRequiredComponents(RMRequiredComponents value);

	/**
	 * Returns the value of the '<em><b>Required Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Connections</em>' containment reference.
	 * @see #setRequiredConnections(RMRequiredConnections)
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement_RequiredConnections()
	 * @model containment="true"
	 * @generated
	 */
	RMRequiredConnections getRequiredConnections();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getRequiredConnections <em>Required Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Connections</em>' containment reference.
	 * @see #getRequiredConnections()
	 * @generated
	 */
	void setRequiredConnections(RMRequiredConnections value);

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
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getFeature <em>Feature</em>}' reference.
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
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage#getRMResolutionElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodel.RMResolutionElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // RMResolutionElement
