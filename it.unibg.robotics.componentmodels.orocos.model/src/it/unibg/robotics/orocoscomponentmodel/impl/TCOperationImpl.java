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
package it.unibg.robotics.orocoscomponentmodel.impl;

import it.unibg.robotics.orocoscomponentmodel.TCOperation;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TCOperationImpl#getSrvName <em>Srv Name</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TCOperationImpl#isOwnThread <em>Own Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCOperationImpl extends OperationImpl implements TCOperation {
	/**
	 * The default value of the '{@link #getSrvName() <em>Srv Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvName()
	 * @generated
	 * @ordered
	 */
	protected static final String SRV_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrvName() <em>Srv Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvName()
	 * @generated
	 * @ordered
	 */
	protected String srvName = SRV_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOwnThread() <em>Own Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwnThread()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OWN_THREAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOwnThread() <em>Own Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwnThread()
	 * @generated
	 * @ordered
	 */
	protected boolean ownThread = OWN_THREAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.TC_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrvName() {
		return srvName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvName(String newSrvName) {
		String oldSrvName = srvName;
		srvName = newSrvName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TC_OPERATION__SRV_NAME, oldSrvName, srvName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOwnThread() {
		return ownThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnThread(boolean newOwnThread) {
		boolean oldOwnThread = ownThread;
		ownThread = newOwnThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TC_OPERATION__OWN_THREAD, oldOwnThread, ownThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.TC_OPERATION__SRV_NAME:
				return getSrvName();
			case orocoscomponentmodelPackage.TC_OPERATION__OWN_THREAD:
				return isOwnThread();
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
			case orocoscomponentmodelPackage.TC_OPERATION__SRV_NAME:
				setSrvName((String)newValue);
				return;
			case orocoscomponentmodelPackage.TC_OPERATION__OWN_THREAD:
				setOwnThread((Boolean)newValue);
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
			case orocoscomponentmodelPackage.TC_OPERATION__SRV_NAME:
				setSrvName(SRV_NAME_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.TC_OPERATION__OWN_THREAD:
				setOwnThread(OWN_THREAD_EDEFAULT);
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
			case orocoscomponentmodelPackage.TC_OPERATION__SRV_NAME:
				return SRV_NAME_EDEFAULT == null ? srvName != null : !SRV_NAME_EDEFAULT.equals(srvName);
			case orocoscomponentmodelPackage.TC_OPERATION__OWN_THREAD:
				return ownThread != OWN_THREAD_EDEFAULT;
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
		result.append(" (srvName: ");
		result.append(srvName);
		result.append(", ownThread: ");
		result.append(ownThread);
		result.append(')');
		return result.toString();
	}

} //TCOperationImpl
