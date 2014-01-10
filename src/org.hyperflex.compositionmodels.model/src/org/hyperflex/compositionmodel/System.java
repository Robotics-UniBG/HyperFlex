/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.compositionmodel;

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
 *   <li>{@link org.hyperflex.compositionmodel.System#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.System#getProvInterfaces <em>Prov Interfaces</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.System#getReqInterfaces <em>Req Interfaces</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.System#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.System#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.System#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.Composite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composite> getComposites();

	/**
	 * Returns the value of the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.SystemProvidedInterf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prov Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prov Interfaces</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem_ProvInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemProvidedInterf> getProvInterfaces();

	/**
	 * Returns the value of the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.SystemRequiredInterf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Interfaces</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem_ReqInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemRequiredInterf> getReqInterfaces();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.SystemProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem_Properties()
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
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.compositionmodel.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getSystem_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // System
