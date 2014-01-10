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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.PeersConnection;
import org.hyperflex.orocoscomponentmodel.TaskContext;

import org.hyperflex.resolutionmodels.impl.RMRequiredElementsImpl;

import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orocos Required Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl#getRequiredTaskContexts <em>Required Task Contexts</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl#getRequiredConnectionPolicies <em>Required Connection Policies</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosRequiredElementsImpl#getRequiredPeersConnection <em>Required Peers Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrocosRequiredElementsImpl extends RMRequiredElementsImpl implements OrocosRequiredElements {
	/**
	 * The cached value of the '{@link #getRequiredTaskContexts() <em>Required Task Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTaskContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskContext> requiredTaskContexts;

	/**
	 * The cached value of the '{@link #getRequiredConnectionPolicies() <em>Required Connection Policies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredConnectionPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPolicy> requiredConnectionPolicies;

	/**
	 * The cached value of the '{@link #getRequiredPeersConnection() <em>Required Peers Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPeersConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<PeersConnection> requiredPeersConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosRequiredElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.OROCOS_REQUIRED_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskContext> getRequiredTaskContexts() {
		if (requiredTaskContexts == null) {
			requiredTaskContexts = new EObjectResolvingEList<TaskContext>(TaskContext.class, this, rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS);
		}
		return requiredTaskContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPolicy> getRequiredConnectionPolicies() {
		if (requiredConnectionPolicies == null) {
			requiredConnectionPolicies = new EObjectResolvingEList<ConnectionPolicy>(ConnectionPolicy.class, this, rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES);
		}
		return requiredConnectionPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PeersConnection> getRequiredPeersConnection() {
		if (requiredPeersConnection == null) {
			requiredPeersConnection = new EObjectResolvingEList<PeersConnection>(PeersConnection.class, this, rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION);
		}
		return requiredPeersConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS:
				return getRequiredTaskContexts();
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES:
				return getRequiredConnectionPolicies();
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION:
				return getRequiredPeersConnection();
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
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS:
				getRequiredTaskContexts().clear();
				getRequiredTaskContexts().addAll((Collection<? extends TaskContext>)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES:
				getRequiredConnectionPolicies().clear();
				getRequiredConnectionPolicies().addAll((Collection<? extends ConnectionPolicy>)newValue);
				return;
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION:
				getRequiredPeersConnection().clear();
				getRequiredPeersConnection().addAll((Collection<? extends PeersConnection>)newValue);
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
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS:
				getRequiredTaskContexts().clear();
				return;
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES:
				getRequiredConnectionPolicies().clear();
				return;
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION:
				getRequiredPeersConnection().clear();
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
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_TASK_CONTEXTS:
				return requiredTaskContexts != null && !requiredTaskContexts.isEmpty();
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_CONNECTION_POLICIES:
				return requiredConnectionPolicies != null && !requiredConnectionPolicies.isEmpty();
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS__REQUIRED_PEERS_CONNECTION:
				return requiredPeersConnection != null && !requiredPeersConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrocosRequiredElementsImpl
