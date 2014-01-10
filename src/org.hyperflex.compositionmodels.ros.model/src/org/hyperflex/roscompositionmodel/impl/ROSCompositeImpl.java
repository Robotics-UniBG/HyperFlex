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
package org.hyperflex.roscompositionmodel.impl;

import org.hyperflex.compositionmodel.Composite;

import org.hyperflex.compositionmodel.impl.CompositeImpl;

import org.hyperflex.roscompositionmodel.ROSComposite;
import org.hyperflex.roscompositionmodel.roscompositionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.roscompositionmodel.impl.ROSCompositeImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSCompositeImpl extends CompositeImpl implements ROSComposite {
	/**
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected Composite composite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscompositionmodelPackage.Literals.ROS_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite getComposite() {
		if (composite != null && composite.eIsProxy()) {
			InternalEObject oldComposite = (InternalEObject)composite;
			composite = (Composite)eResolveProxy(oldComposite);
			if (composite != oldComposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscompositionmodelPackage.ROS_COMPOSITE__COMPOSITE, oldComposite, composite));
			}
		}
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite basicGetComposite() {
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposite(Composite newComposite) {
		Composite oldComposite = composite;
		composite = newComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscompositionmodelPackage.ROS_COMPOSITE__COMPOSITE, oldComposite, composite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscompositionmodelPackage.ROS_COMPOSITE__COMPOSITE:
				if (resolve) return getComposite();
				return basicGetComposite();
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
			case roscompositionmodelPackage.ROS_COMPOSITE__COMPOSITE:
				setComposite((Composite)newValue);
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
			case roscompositionmodelPackage.ROS_COMPOSITE__COMPOSITE:
				setComposite((Composite)null);
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
			case roscompositionmodelPackage.ROS_COMPOSITE__COMPOSITE:
				return composite != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSCompositeImpl
