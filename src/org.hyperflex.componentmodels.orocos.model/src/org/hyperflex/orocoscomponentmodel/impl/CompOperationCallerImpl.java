/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.orocoscomponentmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.OperationCaller;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Operation Caller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.impl.CompOperationCallerImpl#getExposedOpCaller <em>Exposed Op Caller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompOperationCallerImpl extends OperationCallerImpl implements CompOperationCaller {
	/**
	 * The cached value of the '{@link #getExposedOpCaller() <em>Exposed Op Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedOpCaller()
	 * @generated
	 * @ordered
	 */
	protected OperationCaller exposedOpCaller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompOperationCallerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.COMP_OPERATION_CALLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCaller getExposedOpCaller() {
		if (exposedOpCaller != null && exposedOpCaller.eIsProxy()) {
			InternalEObject oldExposedOpCaller = (InternalEObject)exposedOpCaller;
			exposedOpCaller = (OperationCaller)eResolveProxy(oldExposedOpCaller);
			if (exposedOpCaller != oldExposedOpCaller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, orocoscomponentmodelPackage.COMP_OPERATION_CALLER__EXPOSED_OP_CALLER, oldExposedOpCaller, exposedOpCaller));
			}
		}
		return exposedOpCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCaller basicGetExposedOpCaller() {
		return exposedOpCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposedOpCaller(OperationCaller newExposedOpCaller) {
		OperationCaller oldExposedOpCaller = exposedOpCaller;
		exposedOpCaller = newExposedOpCaller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.COMP_OPERATION_CALLER__EXPOSED_OP_CALLER, oldExposedOpCaller, exposedOpCaller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMP_OPERATION_CALLER__EXPOSED_OP_CALLER:
				if (resolve) return getExposedOpCaller();
				return basicGetExposedOpCaller();
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
			case orocoscomponentmodelPackage.COMP_OPERATION_CALLER__EXPOSED_OP_CALLER:
				setExposedOpCaller((OperationCaller)newValue);
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
			case orocoscomponentmodelPackage.COMP_OPERATION_CALLER__EXPOSED_OP_CALLER:
				setExposedOpCaller((OperationCaller)null);
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
			case orocoscomponentmodelPackage.COMP_OPERATION_CALLER__EXPOSED_OP_CALLER:
				return exposedOpCaller != null;
		}
		return super.eIsSet(featureID);
	}

} //CompOperationCallerImpl
