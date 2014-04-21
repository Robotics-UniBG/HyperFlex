/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSTopicConnectionImpl#getMessageInterface <em>Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ROSTopicConnectionImpl extends ROSConnectionImpl implements ROSTopicConnection {
	/**
	 * The cached value of the '{@link #getMessageInterface() <em>Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MsgInterface messageInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSTopicConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_TOPIC_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgInterface getMessageInterface() {
		if (messageInterface != null && messageInterface.eIsProxy()) {
			InternalEObject oldMessageInterface = (InternalEObject)messageInterface;
			messageInterface = (MsgInterface)eResolveProxy(oldMessageInterface);
			if (messageInterface != oldMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE, oldMessageInterface, messageInterface));
			}
		}
		return messageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgInterface basicGetMessageInterface() {
		return messageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageInterface(MsgInterface newMessageInterface) {
		MsgInterface oldMessageInterface = messageInterface;
		messageInterface = newMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE, oldMessageInterface, messageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE:
				if (resolve) return getMessageInterface();
				return basicGetMessageInterface();
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
			case rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE:
				setMessageInterface((MsgInterface)newValue);
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
			case rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE:
				setMessageInterface((MsgInterface)null);
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
			case rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION__MESSAGE_INTERFACE:
				return messageInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSTopicConnectionImpl
