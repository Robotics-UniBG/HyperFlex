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

import org.hyperflex.roscomponentmodel.CompositeMsgProducer;

import org.hyperflex.roscompositionmodel.ROSMsgProducer;
import org.hyperflex.roscompositionmodel.roscompositionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Msg Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.roscompositionmodel.impl.ROSMsgProducerImpl#getMsgProducer <em>Msg Producer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSMsgProducerImpl extends CompProvidedInterfImpl implements ROSMsgProducer {
	/**
	 * The cached value of the '{@link #getMsgProducer() <em>Msg Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgProducer()
	 * @generated
	 * @ordered
	 */
	protected CompositeMsgProducer msgProducer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSMsgProducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscompositionmodelPackage.Literals.ROS_MSG_PRODUCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMsgProducer getMsgProducer() {
		if (msgProducer != null && msgProducer.eIsProxy()) {
			InternalEObject oldMsgProducer = (InternalEObject)msgProducer;
			msgProducer = (CompositeMsgProducer)eResolveProxy(oldMsgProducer);
			if (msgProducer != oldMsgProducer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscompositionmodelPackage.ROS_MSG_PRODUCER__MSG_PRODUCER, oldMsgProducer, msgProducer));
			}
		}
		return msgProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMsgProducer basicGetMsgProducer() {
		return msgProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgProducer(CompositeMsgProducer newMsgProducer) {
		CompositeMsgProducer oldMsgProducer = msgProducer;
		msgProducer = newMsgProducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscompositionmodelPackage.ROS_MSG_PRODUCER__MSG_PRODUCER, oldMsgProducer, msgProducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscompositionmodelPackage.ROS_MSG_PRODUCER__MSG_PRODUCER:
				if (resolve) return getMsgProducer();
				return basicGetMsgProducer();
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
			case roscompositionmodelPackage.ROS_MSG_PRODUCER__MSG_PRODUCER:
				setMsgProducer((CompositeMsgProducer)newValue);
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
			case roscompositionmodelPackage.ROS_MSG_PRODUCER__MSG_PRODUCER:
				setMsgProducer((CompositeMsgProducer)null);
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
			case roscompositionmodelPackage.ROS_MSG_PRODUCER__MSG_PRODUCER:
				return msgProducer != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSMsgProducerImpl
