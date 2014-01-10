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
package org.hyperflex.resolutionmodels.rttresolutionmodels.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hyperflex.orocoscomponentmodel.ConnectionTransport;
import org.hyperflex.orocoscomponentmodel.ConnectionType;
import org.hyperflex.orocoscomponentmodel.InputDataPort;
import org.hyperflex.orocoscomponentmodel.LockPolicy;
import org.hyperflex.orocoscomponentmodel.OutputDataPort;

import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orocos Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosConnectionPolicyImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrocosConnectionPolicyImpl extends OrocosConnectionImpl implements OrocosConnectionPolicy {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionType TYPE_EDEFAULT = ConnectionType.DATA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final LockPolicy LOCK_POLICY_EDEFAULT = LockPolicy.UNSYNC;

	/**
	 * The cached value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected LockPolicy lockPolicy = LOCK_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final short BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected short bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransport() <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionTransport TRANSPORT_EDEFAULT = ConnectionTransport.OROCOS;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected ConnectionTransport transport = TRANSPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputDataPort inputPort;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected OutputDataPort outputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosConnectionPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.OROCOS_CONNECTION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectionType newType) {
		ConnectionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockPolicy getLockPolicy() {
		return lockPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockPolicy(LockPolicy newLockPolicy) {
		LockPolicy oldLockPolicy = lockPolicy;
		lockPolicy = newLockPolicy == null ? LOCK_POLICY_EDEFAULT : newLockPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__LOCK_POLICY, oldLockPolicy, lockPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(short newBufferSize) {
		short oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTransport getTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(ConnectionTransport newTransport) {
		ConnectionTransport oldTransport = transport;
		transport = newTransport == null ? TRANSPORT_EDEFAULT : newTransport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TRANSPORT, oldTransport, transport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataPort getInputPort() {
		if (inputPort != null && inputPort.eIsProxy()) {
			InternalEObject oldInputPort = (InternalEObject)inputPort;
			inputPort = (InputDataPort)eResolveProxy(oldInputPort);
			if (inputPort != oldInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__INPUT_PORT, oldInputPort, inputPort));
			}
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataPort basicGetInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(InputDataPort newInputPort) {
		InputDataPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__INPUT_PORT, oldInputPort, inputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort getOutputPort() {
		if (outputPort != null && outputPort.eIsProxy()) {
			InternalEObject oldOutputPort = (InternalEObject)outputPort;
			outputPort = (OutputDataPort)eResolveProxy(oldOutputPort);
			if (outputPort != oldOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__OUTPUT_PORT, oldOutputPort, outputPort));
			}
		}
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort basicGetOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPort(OutputDataPort newOutputPort) {
		OutputDataPort oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__OUTPUT_PORT, oldOutputPort, outputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TYPE:
				return getType();
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__LOCK_POLICY:
				return getLockPolicy();
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__BUFFER_SIZE:
				return getBufferSize();
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TRANSPORT:
				return getTransport();
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__INPUT_PORT:
				if (resolve) return getInputPort();
				return basicGetInputPort();
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__OUTPUT_PORT:
				if (resolve) return getOutputPort();
				return basicGetOutputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TYPE:
				setType((ConnectionType)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__LOCK_POLICY:
				setLockPolicy((LockPolicy)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__BUFFER_SIZE:
				setBufferSize((Short)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TRANSPORT:
				setTransport((ConnectionTransport)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__INPUT_PORT:
				setInputPort((InputDataPort)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__OUTPUT_PORT:
				setOutputPort((OutputDataPort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__LOCK_POLICY:
				setLockPolicy(LOCK_POLICY_EDEFAULT);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TRANSPORT:
				setTransport(TRANSPORT_EDEFAULT);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__INPUT_PORT:
				setInputPort((InputDataPort)null);
				return;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__OUTPUT_PORT:
				setOutputPort((OutputDataPort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TYPE:
				return type != TYPE_EDEFAULT;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__LOCK_POLICY:
				return lockPolicy != LOCK_POLICY_EDEFAULT;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__TRANSPORT:
				return transport != TRANSPORT_EDEFAULT;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__INPUT_PORT:
				return inputPort != null;
			case rttresolutionmodelsPackage.OROCOS_CONNECTION_POLICY__OUTPUT_PORT:
				return outputPort != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", lockPolicy: ");
		result.append(lockPolicy);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", transport: ");
		result.append(transport);
		result.append(')');
		return result.toString();
	}

} //OrocosConnectionPolicyImpl
