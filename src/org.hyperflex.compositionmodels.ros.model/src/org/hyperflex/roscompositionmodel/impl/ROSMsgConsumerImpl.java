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

import org.hyperflex.compositionmodel.impl.CompRequiredInterfImpl;

import org.hyperflex.roscomponentmodel.CompositeMsgConsumer;

import org.hyperflex.roscompositionmodel.ROSMsgConsumer;
import org.hyperflex.roscompositionmodel.roscompositionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Msg Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.roscompositionmodel.impl.ROSMsgConsumerImpl#getMsgConsumer <em>Msg Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSMsgConsumerImpl extends CompRequiredInterfImpl implements ROSMsgConsumer {
	/**
	 * The cached value of the '{@link #getMsgConsumer() <em>Msg Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgConsumer()
	 * @generated
	 * @ordered
	 */
	protected CompositeMsgConsumer msgConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSMsgConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscompositionmodelPackage.Literals.ROS_MSG_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMsgConsumer getMsgConsumer() {
		if (msgConsumer != null && msgConsumer.eIsProxy()) {
			InternalEObject oldMsgConsumer = (InternalEObject)msgConsumer;
			msgConsumer = (CompositeMsgConsumer)eResolveProxy(oldMsgConsumer);
			if (msgConsumer != oldMsgConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscompositionmodelPackage.ROS_MSG_CONSUMER__MSG_CONSUMER, oldMsgConsumer, msgConsumer));
			}
		}
		return msgConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMsgConsumer basicGetMsgConsumer() {
		return msgConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgConsumer(CompositeMsgConsumer newMsgConsumer) {
		CompositeMsgConsumer oldMsgConsumer = msgConsumer;
		msgConsumer = newMsgConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscompositionmodelPackage.ROS_MSG_CONSUMER__MSG_CONSUMER, oldMsgConsumer, msgConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscompositionmodelPackage.ROS_MSG_CONSUMER__MSG_CONSUMER:
				if (resolve) return getMsgConsumer();
				return basicGetMsgConsumer();
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
			case roscompositionmodelPackage.ROS_MSG_CONSUMER__MSG_CONSUMER:
				setMsgConsumer((CompositeMsgConsumer)newValue);
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
			case roscompositionmodelPackage.ROS_MSG_CONSUMER__MSG_CONSUMER:
				setMsgConsumer((CompositeMsgConsumer)null);
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
			case roscompositionmodelPackage.ROS_MSG_CONSUMER__MSG_CONSUMER:
				return msgConsumer != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSMsgConsumerImpl
