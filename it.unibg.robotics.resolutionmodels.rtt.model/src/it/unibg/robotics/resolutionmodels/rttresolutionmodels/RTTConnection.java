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
package it.unibg.robotics.resolutionmodels.rttresolutionmodels;

import org.eclipse.emf.ecore.EObject;

import org.orocos.model.rtt.ConnectionPolicyLockPolicy;
import org.orocos.model.rtt.ConnectionPolicyType;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.OutputPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTT Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getType <em>Type</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection()
 * @model
 * @generated
 */
public interface RTTConnection extends EObject {
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
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.ConnectionPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyType
	 * @see #setType(ConnectionPolicyType)
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection_Type()
	 * @model required="true"
	 * @generated
	 */
	ConnectionPolicyType getType();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionPolicyType value);

	/**
	 * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.ConnectionPolicyLockPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Policy</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
	 * @see #setLockPolicy(ConnectionPolicyLockPolicy)
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection_LockPolicy()
	 * @model required="true"
	 * @generated
	 */
	ConnectionPolicyLockPolicy getLockPolicy();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getLockPolicy <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Policy</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
	 * @see #getLockPolicy()
	 * @generated
	 */
	void setLockPolicy(ConnectionPolicyLockPolicy value);

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
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection_BufferSize()
	 * @model required="true"
	 * @generated
	 */
	short getBufferSize();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(short value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputPort)
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection_InputPort()
	 * @model required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' reference.
	 * @see #setOutputPort(OutputPort)
	 * @see it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage#getRTTConnection_OutputPort()
	 * @model required="true"
	 * @generated
	 */
	OutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputPort value);

} // RTTConnection
