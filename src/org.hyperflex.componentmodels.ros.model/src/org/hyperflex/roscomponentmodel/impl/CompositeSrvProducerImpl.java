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

import org.hyperflex.roscomponentmodel.CompositeSrvProducer;
import org.hyperflex.roscomponentmodel.SrvProducer;
import org.hyperflex.roscomponentmodel.roscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Srv Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.impl.CompositeSrvProducerImpl#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeSrvProducerImpl extends SrvProducerImpl implements CompositeSrvProducer {
	/**
	 * The cached value of the '{@link #getPromote() <em>Promote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected SrvProducer promote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSrvProducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscomponentmodelPackage.Literals.COMPOSITE_SRV_PRODUCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvProducer getPromote() {
		if (promote != null && promote.eIsProxy()) {
			InternalEObject oldPromote = (InternalEObject)promote;
			promote = (SrvProducer)eResolveProxy(oldPromote);
			if (promote != oldPromote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER__PROMOTE, oldPromote, promote));
			}
		}
		return promote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvProducer basicGetPromote() {
		return promote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromote(SrvProducer newPromote) {
		SrvProducer oldPromote = promote;
		promote = newPromote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER__PROMOTE, oldPromote, promote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER__PROMOTE:
				if (resolve) return getPromote();
				return basicGetPromote();
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
			case roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER__PROMOTE:
				setPromote((SrvProducer)newValue);
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
			case roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER__PROMOTE:
				setPromote((SrvProducer)null);
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
			case roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER__PROMOTE:
				return promote != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeSrvProducerImpl
