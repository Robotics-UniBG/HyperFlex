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
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
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
package org.hyperflex.roscomponentmodel.impl;

import org.hyperflex.roscomponentmodel.NodeSrvConsumer;
import org.hyperflex.roscomponentmodel.roscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Srv Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.impl.NodeSrvConsumerImpl#getSrvName <em>Srv Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeSrvConsumerImpl extends SrvConsumerImpl implements NodeSrvConsumer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSrvConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscomponentmodelPackage.Literals.NODE_SRV_CONSUMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.NODE_SRV_CONSUMER__SRV_NAME, oldSrvName, srvName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscomponentmodelPackage.NODE_SRV_CONSUMER__SRV_NAME:
				return getSrvName();
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
			case roscomponentmodelPackage.NODE_SRV_CONSUMER__SRV_NAME:
				setSrvName((String)newValue);
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
			case roscomponentmodelPackage.NODE_SRV_CONSUMER__SRV_NAME:
				setSrvName(SRV_NAME_EDEFAULT);
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
			case roscomponentmodelPackage.NODE_SRV_CONSUMER__SRV_NAME:
				return SRV_NAME_EDEFAULT == null ? srvName != null : !SRV_NAME_EDEFAULT.equals(srvName);
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
		result.append(')');
		return result.toString();
	}

} //NodeSrvConsumerImpl
