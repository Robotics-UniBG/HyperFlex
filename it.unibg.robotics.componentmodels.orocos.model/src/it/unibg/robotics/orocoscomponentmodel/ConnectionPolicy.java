/**
 * Variability Analysis And Resolution Plugins (VARP)
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
package it.unibg.robotics.orocoscomponentmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getType <em>Type</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getTransport <em>Transport</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy()
 * @model
 * @generated
 */
public interface ConnectionPolicy extends EObject {
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
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutputDataPort)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_Source()
	 * @model
	 * @generated
	 */
	OutputDataPort getSource();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutputDataPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InputDataPort)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_Target()
	 * @model
	 * @generated
	 */
	InputDataPort getTarget();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputDataPort value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unibg.robotics.orocoscomponentmodel.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.unibg.robotics.orocoscomponentmodel.ConnectionType
	 * @see #setType(ConnectionType)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_Type()
	 * @model required="true"
	 * @generated
	 */
	ConnectionType getType();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.unibg.robotics.orocoscomponentmodel.ConnectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unibg.robotics.orocoscomponentmodel.LockPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Policy</em>' attribute.
	 * @see it.unibg.robotics.orocoscomponentmodel.LockPolicy
	 * @see #setLockPolicy(LockPolicy)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_LockPolicy()
	 * @model required="true"
	 * @generated
	 */
	LockPolicy getLockPolicy();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Policy</em>' attribute.
	 * @see it.unibg.robotics.orocoscomponentmodel.LockPolicy
	 * @see #getLockPolicy()
	 * @generated
	 */
	void setLockPolicy(LockPolicy value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_BufferSize()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unibg.robotics.orocoscomponentmodel.ConnectionTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' attribute.
	 * @see it.unibg.robotics.orocoscomponentmodel.ConnectionTransport
	 * @see #setTransport(ConnectionTransport)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_Transport()
	 * @model required="true"
	 * @generated
	 */
	ConnectionTransport getTransport();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getTransport <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' attribute.
	 * @see it.unibg.robotics.orocoscomponentmodel.ConnectionTransport
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(ConnectionTransport value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionPolicy_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

} // ConnectionPolicy
