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

import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Service Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl#getServiceProducer <em>Service Producer</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl#getServiceConsumer <em>Service Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSServiceConnectionImpl extends ROSConnectionImpl implements ROSServiceConnection {
	/**
	 * The cached value of the '{@link #getServiceProducer() <em>Service Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProducer()
	 * @generated
	 * @ordered
	 */
	protected SrvProducer serviceProducer;

	/**
	 * The cached value of the '{@link #getServiceConsumer() <em>Service Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConsumer()
	 * @generated
	 * @ordered
	 */
	protected SrvConsumer serviceConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSServiceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_SERVICE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvProducer getServiceProducer() {
		if (serviceProducer != null && serviceProducer.eIsProxy()) {
			InternalEObject oldServiceProducer = (InternalEObject)serviceProducer;
			serviceProducer = (SrvProducer)eResolveProxy(oldServiceProducer);
			if (serviceProducer != oldServiceProducer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_PRODUCER, oldServiceProducer, serviceProducer));
			}
		}
		return serviceProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvProducer basicGetServiceProducer() {
		return serviceProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProducer(SrvProducer newServiceProducer) {
		SrvProducer oldServiceProducer = serviceProducer;
		serviceProducer = newServiceProducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_PRODUCER, oldServiceProducer, serviceProducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvConsumer getServiceConsumer() {
		if (serviceConsumer != null && serviceConsumer.eIsProxy()) {
			InternalEObject oldServiceConsumer = (InternalEObject)serviceConsumer;
			serviceConsumer = (SrvConsumer)eResolveProxy(oldServiceConsumer);
			if (serviceConsumer != oldServiceConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CONSUMER, oldServiceConsumer, serviceConsumer));
			}
		}
		return serviceConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvConsumer basicGetServiceConsumer() {
		return serviceConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConsumer(SrvConsumer newServiceConsumer) {
		SrvConsumer oldServiceConsumer = serviceConsumer;
		serviceConsumer = newServiceConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CONSUMER, oldServiceConsumer, serviceConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_PRODUCER:
				if (resolve) return getServiceProducer();
				return basicGetServiceProducer();
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CONSUMER:
				if (resolve) return getServiceConsumer();
				return basicGetServiceConsumer();
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
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_PRODUCER:
				setServiceProducer((SrvProducer)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CONSUMER:
				setServiceConsumer((SrvConsumer)newValue);
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
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_PRODUCER:
				setServiceProducer((SrvProducer)null);
				return;
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CONSUMER:
				setServiceConsumer((SrvConsumer)null);
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
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_PRODUCER:
				return serviceProducer != null;
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CONSUMER:
				return serviceConsumer != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSServiceConnectionImpl
