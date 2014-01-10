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

import org.hyperflex.compositionmodel.impl.CompProvidedInterfImpl;

import org.hyperflex.roscomponentmodel.CompositeSrvProducer;

import org.hyperflex.roscompositionmodel.ROSSrvProducer;
import org.hyperflex.roscompositionmodel.roscompositionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Srv Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.roscompositionmodel.impl.ROSSrvProducerImpl#getSrvProducer <em>Srv Producer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSSrvProducerImpl extends CompProvidedInterfImpl implements ROSSrvProducer {
	/**
	 * The cached value of the '{@link #getSrvProducer() <em>Srv Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvProducer()
	 * @generated
	 * @ordered
	 */
	protected CompositeSrvProducer srvProducer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSSrvProducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscompositionmodelPackage.Literals.ROS_SRV_PRODUCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvProducer getSrvProducer() {
		if (srvProducer != null && srvProducer.eIsProxy()) {
			InternalEObject oldSrvProducer = (InternalEObject)srvProducer;
			srvProducer = (CompositeSrvProducer)eResolveProxy(oldSrvProducer);
			if (srvProducer != oldSrvProducer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscompositionmodelPackage.ROS_SRV_PRODUCER__SRV_PRODUCER, oldSrvProducer, srvProducer));
			}
		}
		return srvProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvProducer basicGetSrvProducer() {
		return srvProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvProducer(CompositeSrvProducer newSrvProducer) {
		CompositeSrvProducer oldSrvProducer = srvProducer;
		srvProducer = newSrvProducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscompositionmodelPackage.ROS_SRV_PRODUCER__SRV_PRODUCER, oldSrvProducer, srvProducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscompositionmodelPackage.ROS_SRV_PRODUCER__SRV_PRODUCER:
				if (resolve) return getSrvProducer();
				return basicGetSrvProducer();
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
			case roscompositionmodelPackage.ROS_SRV_PRODUCER__SRV_PRODUCER:
				setSrvProducer((CompositeSrvProducer)newValue);
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
			case roscompositionmodelPackage.ROS_SRV_PRODUCER__SRV_PRODUCER:
				setSrvProducer((CompositeSrvProducer)null);
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
			case roscompositionmodelPackage.ROS_SRV_PRODUCER__SRV_PRODUCER:
				return srvProducer != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSSrvProducerImpl
