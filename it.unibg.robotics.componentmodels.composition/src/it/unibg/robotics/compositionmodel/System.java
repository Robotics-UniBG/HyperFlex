/**
 * Variability Modeling And Resolution Plugins (VARP)
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
 * 
 */
package it.unibg.robotics.compositionmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.compositionmodel.System#getComposites <em>Composites</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.System#getProvInterfaces <em>Prov Interfaces</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.System#getReqInterfaces <em>Req Interfaces</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.System#getProperties <em>Properties</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.System#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.System#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.compositionmodel.Composite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composite> getComposites();

	/**
	 * Returns the value of the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.compositionmodel.SystemProvidedInterf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prov Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prov Interfaces</em>' containment reference list.
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem_ProvInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemProvidedInterf> getProvInterfaces();

	/**
	 * Returns the value of the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.compositionmodel.SystemRequiredInterf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Interfaces</em>' containment reference list.
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem_ReqInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemRequiredInterf> getReqInterfaces();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.compositionmodel.SystemProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemProperty> getProperties();

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
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.compositionmodel.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.compositionmodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see it.unibg.robotics.compositionmodel.compositionmodelPackage#getSystem_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // System
