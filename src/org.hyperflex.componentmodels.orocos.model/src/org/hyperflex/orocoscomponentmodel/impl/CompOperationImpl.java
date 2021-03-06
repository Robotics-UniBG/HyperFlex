/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.Operation;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.orocoscomponentmodel.impl.CompOperationImpl#getExposedOp <em>Exposed Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompOperationImpl extends OperationImpl implements CompOperation {
	/**
	 * The cached value of the '{@link #getExposedOp() <em>Exposed Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedOp()
	 * @generated
	 * @ordered
	 */
	protected Operation exposedOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.COMP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getExposedOp() {
		if (exposedOp != null && exposedOp.eIsProxy()) {
			InternalEObject oldExposedOp = (InternalEObject)exposedOp;
			exposedOp = (Operation)eResolveProxy(oldExposedOp);
			if (exposedOp != oldExposedOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, orocoscomponentmodelPackage.COMP_OPERATION__EXPOSED_OP, oldExposedOp, exposedOp));
			}
		}
		return exposedOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetExposedOp() {
		return exposedOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposedOp(Operation newExposedOp) {
		Operation oldExposedOp = exposedOp;
		exposedOp = newExposedOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.COMP_OPERATION__EXPOSED_OP, oldExposedOp, exposedOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMP_OPERATION__EXPOSED_OP:
				if (resolve) return getExposedOp();
				return basicGetExposedOp();
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
			case orocoscomponentmodelPackage.COMP_OPERATION__EXPOSED_OP:
				setExposedOp((Operation)newValue);
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
			case orocoscomponentmodelPackage.COMP_OPERATION__EXPOSED_OP:
				setExposedOp((Operation)null);
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
			case orocoscomponentmodelPackage.COMP_OPERATION__EXPOSED_OP:
				return exposedOp != null;
		}
		return super.eIsSet(featureID);
	}

} //CompOperationImpl
