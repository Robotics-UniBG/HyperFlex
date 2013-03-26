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
package it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl;

import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTConnection;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.rttresolutionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.orocos.model.rtt.ConnectionPolicyLockPolicy;
import org.orocos.model.rtt.ConnectionPolicyType;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.OutputPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTT Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTConnectionImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTConnectionImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTConnectionImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTConnectionImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTTConnectionImpl extends EObjectImpl implements RTTConnection {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionPolicyType TYPE_EDEFAULT = ConnectionPolicyType.DATA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPolicyType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionPolicyLockPolicy LOCK_POLICY_EDEFAULT = ConnectionPolicyLockPolicy.UNSYNC;

	/**
	 * The cached value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockPolicy()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPolicyLockPolicy lockPolicy = LOCK_POLICY_EDEFAULT;

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
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputPort;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected OutputPort outputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTTConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelPackage.Literals.RTT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelPackage.RTT_CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectionPolicyType newType) {
		ConnectionPolicyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelPackage.RTT_CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicyLockPolicy getLockPolicy() {
		return lockPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockPolicy(ConnectionPolicyLockPolicy newLockPolicy) {
		ConnectionPolicyLockPolicy oldLockPolicy = lockPolicy;
		lockPolicy = newLockPolicy == null ? LOCK_POLICY_EDEFAULT : newLockPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelPackage.RTT_CONNECTION__LOCK_POLICY, oldLockPolicy, lockPolicy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelPackage.RTT_CONNECTION__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputPort() {
		if (inputPort != null && inputPort.eIsProxy()) {
			InternalEObject oldInputPort = (InternalEObject)inputPort;
			inputPort = (InputPort)eResolveProxy(oldInputPort);
			if (inputPort != oldInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelPackage.RTT_CONNECTION__INPUT_PORT, oldInputPort, inputPort));
			}
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(InputPort newInputPort) {
		InputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelPackage.RTT_CONNECTION__INPUT_PORT, oldInputPort, inputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getOutputPort() {
		if (outputPort != null && outputPort.eIsProxy()) {
			InternalEObject oldOutputPort = (InternalEObject)outputPort;
			outputPort = (OutputPort)eResolveProxy(oldOutputPort);
			if (outputPort != oldOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelPackage.RTT_CONNECTION__OUTPUT_PORT, oldOutputPort, outputPort));
			}
		}
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPort(OutputPort newOutputPort) {
		OutputPort oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelPackage.RTT_CONNECTION__OUTPUT_PORT, oldOutputPort, outputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelPackage.RTT_CONNECTION__NAME:
				return getName();
			case rttresolutionmodelPackage.RTT_CONNECTION__TYPE:
				return getType();
			case rttresolutionmodelPackage.RTT_CONNECTION__LOCK_POLICY:
				return getLockPolicy();
			case rttresolutionmodelPackage.RTT_CONNECTION__BUFFER_SIZE:
				return getBufferSize();
			case rttresolutionmodelPackage.RTT_CONNECTION__INPUT_PORT:
				if (resolve) return getInputPort();
				return basicGetInputPort();
			case rttresolutionmodelPackage.RTT_CONNECTION__OUTPUT_PORT:
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
			case rttresolutionmodelPackage.RTT_CONNECTION__NAME:
				setName((String)newValue);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__TYPE:
				setType((ConnectionPolicyType)newValue);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__LOCK_POLICY:
				setLockPolicy((ConnectionPolicyLockPolicy)newValue);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__BUFFER_SIZE:
				setBufferSize((Short)newValue);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__INPUT_PORT:
				setInputPort((InputPort)newValue);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__OUTPUT_PORT:
				setOutputPort((OutputPort)newValue);
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
			case rttresolutionmodelPackage.RTT_CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__LOCK_POLICY:
				setLockPolicy(LOCK_POLICY_EDEFAULT);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__INPUT_PORT:
				setInputPort((InputPort)null);
				return;
			case rttresolutionmodelPackage.RTT_CONNECTION__OUTPUT_PORT:
				setOutputPort((OutputPort)null);
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
			case rttresolutionmodelPackage.RTT_CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case rttresolutionmodelPackage.RTT_CONNECTION__TYPE:
				return type != TYPE_EDEFAULT;
			case rttresolutionmodelPackage.RTT_CONNECTION__LOCK_POLICY:
				return lockPolicy != LOCK_POLICY_EDEFAULT;
			case rttresolutionmodelPackage.RTT_CONNECTION__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case rttresolutionmodelPackage.RTT_CONNECTION__INPUT_PORT:
				return inputPort != null;
			case rttresolutionmodelPackage.RTT_CONNECTION__OUTPUT_PORT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", lockPolicy: ");
		result.append(lockPolicy);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(')');
		return result.toString();
	}

} //RTTConnectionImpl
