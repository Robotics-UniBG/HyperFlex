/**
 * Variability Analysis and Resolution Plugin (VARP)
 * 
 * Copyright (c) 2013
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
 */
package it.unibg.robotics.componentmodels.roscompositionmodel.impl;

import it.unibg.robotics.componentmodels.roscompositionmodel.ROSSrvConsumer;
import it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage;
import it.unibg.robotics.compositionmodel.impl.CompRequiredInterfImpl;

import it.unibg.robotics.roscomponentmodel.CompositeSrvConsumer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Srv Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.componentmodels.roscompositionmodel.impl.ROSSrvConsumerImpl#getSrvConsumer <em>Srv Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSSrvConsumerImpl extends CompRequiredInterfImpl implements ROSSrvConsumer {
	/**
	 * The cached value of the '{@link #getSrvConsumer() <em>Srv Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvConsumer()
	 * @generated
	 * @ordered
	 */
	protected CompositeSrvConsumer srvConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSSrvConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscompositionmodelPackage.Literals.ROS_SRV_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvConsumer getSrvConsumer() {
		if (srvConsumer != null && srvConsumer.eIsProxy()) {
			InternalEObject oldSrvConsumer = (InternalEObject)srvConsumer;
			srvConsumer = (CompositeSrvConsumer)eResolveProxy(oldSrvConsumer);
			if (srvConsumer != oldSrvConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscompositionmodelPackage.ROS_SRV_CONSUMER__SRV_CONSUMER, oldSrvConsumer, srvConsumer));
			}
		}
		return srvConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSrvConsumer basicGetSrvConsumer() {
		return srvConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvConsumer(CompositeSrvConsumer newSrvConsumer) {
		CompositeSrvConsumer oldSrvConsumer = srvConsumer;
		srvConsumer = newSrvConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscompositionmodelPackage.ROS_SRV_CONSUMER__SRV_CONSUMER, oldSrvConsumer, srvConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscompositionmodelPackage.ROS_SRV_CONSUMER__SRV_CONSUMER:
				if (resolve) return getSrvConsumer();
				return basicGetSrvConsumer();
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
			case roscompositionmodelPackage.ROS_SRV_CONSUMER__SRV_CONSUMER:
				setSrvConsumer((CompositeSrvConsumer)newValue);
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
			case roscompositionmodelPackage.ROS_SRV_CONSUMER__SRV_CONSUMER:
				setSrvConsumer((CompositeSrvConsumer)null);
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
			case roscompositionmodelPackage.ROS_SRV_CONSUMER__SRV_CONSUMER:
				return srvConsumer != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSSrvConsumerImpl
