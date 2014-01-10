/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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


import org.hyperflex.resolutionmodels.impl.RMRequiredConnectionsImpl;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTT Required Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredConnectionsImpl#getRTTConnectionPolicies <em>RTT Connection Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTTRequiredConnectionsImpl extends RMRequiredConnectionsImpl implements RTTRequiredConnections {
	/**
	 * The cached value of the '{@link #getRTTConnectionPolicies() <em>RTT Connection Policies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTTConnectionPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPolicy> rttConnectionPolicies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTTRequiredConnectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.RTT_REQUIRED_CONNECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPolicy> getRTTConnectionPolicies() {
		if (rttConnectionPolicies == null) {
			rttConnectionPolicies = new EObjectResolvingEList<ConnectionPolicy>(ConnectionPolicy.class, this, rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES);
		}
		return rttConnectionPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES:
				return getRTTConnectionPolicies();
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
			case rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES:
				getRTTConnectionPolicies().clear();
				getRTTConnectionPolicies().addAll((Collection<? extends ConnectionPolicy>)newValue);
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
			case rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES:
				getRTTConnectionPolicies().clear();
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
			case rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS__RTT_CONNECTION_POLICIES:
				return rttConnectionPolicies != null && !rttConnectionPolicies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RTTRequiredConnectionsImpl
