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

import org.hyperflex.orocoscomponentmodel.Operation;
import org.hyperflex.orocoscomponentmodel.OperationCaller;

import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orocos Peers Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosPeersConnectionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosPeersConnectionImpl#getOperationCaller <em>Operation Caller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrocosPeersConnectionImpl extends OrocosConnectionImpl implements OrocosPeersConnection {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getOperationCaller() <em>Operation Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCaller()
	 * @generated
	 * @ordered
	 */
	protected OperationCaller operationCaller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosPeersConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.OROCOS_PEERS_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCaller getOperationCaller() {
		if (operationCaller != null && operationCaller.eIsProxy()) {
			InternalEObject oldOperationCaller = (InternalEObject)operationCaller;
			operationCaller = (OperationCaller)eResolveProxy(oldOperationCaller);
			if (operationCaller != oldOperationCaller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION_CALLER, oldOperationCaller, operationCaller));
			}
		}
		return operationCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCaller basicGetOperationCaller() {
		return operationCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationCaller(OperationCaller newOperationCaller) {
		OperationCaller oldOperationCaller = operationCaller;
		operationCaller = newOperationCaller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION_CALLER, oldOperationCaller, operationCaller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION_CALLER:
				if (resolve) return getOperationCaller();
				return basicGetOperationCaller();
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
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION:
				setOperation((Operation)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION_CALLER:
				setOperationCaller((OperationCaller)newValue);
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
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION:
				setOperation((Operation)null);
				return;
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION_CALLER:
				setOperationCaller((OperationCaller)null);
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
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION:
				return operation != null;
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION__OPERATION_CALLER:
				return operationCaller != null;
		}
		return super.eIsSet(featureID);
	}

} //OrocosPeersConnectionImpl
