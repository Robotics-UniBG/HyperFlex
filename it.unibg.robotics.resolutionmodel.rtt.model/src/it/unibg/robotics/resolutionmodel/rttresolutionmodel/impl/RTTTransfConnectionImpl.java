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
package it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl;

import it.unibg.robotics.resolutionmodel.impl.RMTransfConnectionImpl;

import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTConnection;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTTransfConnection;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.rttresolutionmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTT Transf Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rttresolutionmodel.impl.RTTTransfConnectionImpl#getNewConnections <em>New Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTTTransfConnectionImpl extends RMTransfConnectionImpl implements RTTTransfConnection {
	/**
	 * The cached value of the '{@link #getNewConnections() <em>New Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<RTTConnection> newConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTTTransfConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelPackage.Literals.RTT_TRANSF_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTTConnection> getNewConnections() {
		if (newConnections == null) {
			newConnections = new EObjectContainmentEList<RTTConnection>(RTTConnection.class, this, rttresolutionmodelPackage.RTT_TRANSF_CONNECTION__NEW_CONNECTIONS);
		}
		return newConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rttresolutionmodelPackage.RTT_TRANSF_CONNECTION__NEW_CONNECTIONS:
				return ((InternalEList<?>)getNewConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelPackage.RTT_TRANSF_CONNECTION__NEW_CONNECTIONS:
				return getNewConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case rttresolutionmodelPackage.RTT_TRANSF_CONNECTION__NEW_CONNECTIONS:
				getNewConnections().clear();
				getNewConnections().addAll((Collection<? extends RTTConnection>)newValue);
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
			case rttresolutionmodelPackage.RTT_TRANSF_CONNECTION__NEW_CONNECTIONS:
				getNewConnections().clear();
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
			case rttresolutionmodelPackage.RTT_TRANSF_CONNECTION__NEW_CONNECTIONS:
				return newConnections != null && !newConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RTTTransfConnectionImpl
