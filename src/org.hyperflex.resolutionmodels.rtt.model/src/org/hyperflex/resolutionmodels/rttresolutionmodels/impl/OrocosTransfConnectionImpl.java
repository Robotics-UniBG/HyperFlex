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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * In collaboration with by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rttresolutionmodels.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hyperflex.resolutionmodels.impl.RMTransfConnectionImpl;

import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orocos Transf Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfConnectionImpl#getNewConnections <em>New Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrocosTransfConnectionImpl extends RMTransfConnectionImpl implements OrocosTransfConnection {
	/**
	 * The cached value of the '{@link #getNewConnections() <em>New Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<OrocosConnection> newConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosTransfConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.OROCOS_TRANSF_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrocosConnection> getNewConnections() {
		if (newConnections == null) {
			newConnections = new EObjectContainmentEList<OrocosConnection>(OrocosConnection.class, this, rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS);
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS:
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS:
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS:
				getNewConnections().clear();
				getNewConnections().addAll((Collection<? extends OrocosConnection>)newValue);
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS:
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION__NEW_CONNECTIONS:
				return newConnections != null && !newConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrocosTransfConnectionImpl
