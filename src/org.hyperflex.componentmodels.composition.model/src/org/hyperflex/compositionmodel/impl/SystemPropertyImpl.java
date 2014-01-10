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
package org.hyperflex.compositionmodel.impl;

import org.hyperflex.compositionmodel.Property;
import org.hyperflex.compositionmodel.SystemProperty;
import org.hyperflex.compositionmodel.compositionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.compositionmodel.impl.SystemPropertyImpl#getExposed <em>Exposed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemPropertyImpl extends PropertyImpl implements SystemProperty {
	/**
	 * The cached value of the '{@link #getExposed() <em>Exposed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposed()
	 * @generated
	 * @ordered
	 */
	protected Property exposed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return compositionmodelPackage.Literals.SYSTEM_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getExposed() {
		if (exposed != null && exposed.eIsProxy()) {
			InternalEObject oldExposed = (InternalEObject)exposed;
			exposed = (Property)eResolveProxy(oldExposed);
			if (exposed != oldExposed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, compositionmodelPackage.SYSTEM_PROPERTY__EXPOSED, oldExposed, exposed));
			}
		}
		return exposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetExposed() {
		return exposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposed(Property newExposed) {
		Property oldExposed = exposed;
		exposed = newExposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, compositionmodelPackage.SYSTEM_PROPERTY__EXPOSED, oldExposed, exposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case compositionmodelPackage.SYSTEM_PROPERTY__EXPOSED:
				if (resolve) return getExposed();
				return basicGetExposed();
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
			case compositionmodelPackage.SYSTEM_PROPERTY__EXPOSED:
				setExposed((Property)newValue);
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
			case compositionmodelPackage.SYSTEM_PROPERTY__EXPOSED:
				setExposed((Property)null);
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
			case compositionmodelPackage.SYSTEM_PROPERTY__EXPOSED:
				return exposed != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemPropertyImpl
