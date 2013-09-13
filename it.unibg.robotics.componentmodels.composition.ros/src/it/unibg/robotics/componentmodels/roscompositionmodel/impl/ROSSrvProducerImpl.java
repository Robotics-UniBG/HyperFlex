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

import it.unibg.robotics.componentmodels.roscompositionmodel.ROSSrvProducer;
import it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage;
import it.unibg.robotics.compositionmodel.impl.CompProvidedInterfImpl;
import it.unibg.robotics.roscomponentmodel.CompositeSrvProducer;

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
 *   <li>{@link it.unibg.robotics.componentmodels.roscompositionmodel.impl.ROSSrvProducerImpl#getSrvProducer <em>Srv Producer</em>}</li>
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
