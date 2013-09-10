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
package it.unibg.robotics.orocoscomponentmodel.impl;

import it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy;
import it.unibg.robotics.orocoscomponentmodel.ConnectionTransport;
import it.unibg.robotics.orocoscomponentmodel.ConnectionType;
import it.unibg.robotics.orocoscomponentmodel.InputDataPort;
import it.unibg.robotics.orocoscomponentmodel.LockPolicy;
import it.unibg.robotics.orocoscomponentmodel.OutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.ConnectionPolicyImpl#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPolicyImpl extends EObjectImpl implements ConnectionPolicy {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutputDataPort source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InputDataPort target;

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
	protected static final int BUFFER_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.CONNECTION_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OutputDataPort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, orocoscomponentmodelPackage.CONNECTION_POLICY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutputDataPort newSource) {
		OutputDataPort oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (InputDataPort)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, orocoscomponentmodelPackage.CONNECTION_POLICY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InputDataPort newTarget) {
		InputDataPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__LOCK_POLICY, oldLockPolicy, lockPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		int oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__BUFFER_SIZE, oldBufferSize, bufferSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__TRANSPORT, oldTransport, transport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.CONNECTION_POLICY__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NAME:
				return getName();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TYPE:
				return getType();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__LOCK_POLICY:
				return getLockPolicy();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__BUFFER_SIZE:
				return getBufferSize();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TRANSPORT:
				return getTransport();
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NOTE:
				return getNote();
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
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NAME:
				setName((String)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__SOURCE:
				setSource((OutputDataPort)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TARGET:
				setTarget((InputDataPort)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TYPE:
				setType((ConnectionType)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__LOCK_POLICY:
				setLockPolicy((LockPolicy)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TRANSPORT:
				setTransport((ConnectionTransport)newValue);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NOTE:
				setNote((String)newValue);
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
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__SOURCE:
				setSource((OutputDataPort)null);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TARGET:
				setTarget((InputDataPort)null);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__LOCK_POLICY:
				setLockPolicy(LOCK_POLICY_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TRANSPORT:
				setTransport(TRANSPORT_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NOTE:
				setNote(NOTE_EDEFAULT);
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
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case orocoscomponentmodelPackage.CONNECTION_POLICY__SOURCE:
				return source != null;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TARGET:
				return target != null;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TYPE:
				return type != TYPE_EDEFAULT;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__LOCK_POLICY:
				return lockPolicy != LOCK_POLICY_EDEFAULT;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__TRANSPORT:
				return transport != TRANSPORT_EDEFAULT;
			case orocoscomponentmodelPackage.CONNECTION_POLICY__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
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
		result.append(", transport: ");
		result.append(transport);
		result.append(", note: ");
		result.append(note);
		result.append(')');
		return result.toString();
	}

} //ConnectionPolicyImpl
