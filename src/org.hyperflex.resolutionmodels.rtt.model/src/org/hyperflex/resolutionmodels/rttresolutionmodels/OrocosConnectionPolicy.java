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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * In collaboration with by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rttresolutionmodels;

import org.hyperflex.orocoscomponentmodel.ConnectionTransport;
import org.hyperflex.orocoscomponentmodel.ConnectionType;
import org.hyperflex.orocoscomponentmodel.InputDataPort;
import org.hyperflex.orocoscomponentmodel.LockPolicy;
import org.hyperflex.orocoscomponentmodel.OutputDataPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orocos Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getType <em>Type</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy()
 * @model
 * @generated
 */
public interface OrocosConnectionPolicy extends OrocosConnection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hyperflex.orocoscomponentmodel.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionType
	 * @see #setType(ConnectionType)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy_Type()
	 * @model required="true"
	 * @generated
	 */
	ConnectionType getType();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hyperflex.orocoscomponentmodel.LockPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Policy</em>' attribute.
	 * @see org.hyperflex.orocoscomponentmodel.LockPolicy
	 * @see #setLockPolicy(LockPolicy)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy_LockPolicy()
	 * @model required="true"
	 * @generated
	 */
	LockPolicy getLockPolicy();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getLockPolicy <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Policy</em>' attribute.
	 * @see org.hyperflex.orocoscomponentmodel.LockPolicy
	 * @see #getLockPolicy()
	 * @generated
	 */
	void setLockPolicy(LockPolicy value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(short)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy_BufferSize()
	 * @model required="true"
	 * @generated
	 */
	short getBufferSize();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(short value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hyperflex.orocoscomponentmodel.ConnectionTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' attribute.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionTransport
	 * @see #setTransport(ConnectionTransport)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy_Transport()
	 * @model required="true"
	 * @generated
	 */
	ConnectionTransport getTransport();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getTransport <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' attribute.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionTransport
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(ConnectionTransport value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputDataPort)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy_InputPort()
	 * @model required="true"
	 * @generated
	 */
	InputDataPort getInputPort();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputDataPort value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' reference.
	 * @see #setOutputPort(OutputDataPort)
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getOrocosConnectionPolicy_OutputPort()
	 * @model required="true"
	 * @generated
	 */
	OutputDataPort getOutputPort();

	/**
	 * Sets the value of the '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputDataPort value);

} // OrocosConnectionPolicy
