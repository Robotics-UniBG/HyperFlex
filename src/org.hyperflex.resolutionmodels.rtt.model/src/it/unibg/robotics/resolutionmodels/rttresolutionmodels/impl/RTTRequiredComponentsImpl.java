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


import org.hyperflex.resolutionmodels.impl.RMRequiredComponentsImpl;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTT Required Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.RTTRequiredComponentsImpl#getRTTTaskContexts <em>RTT Task Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTTRequiredComponentsImpl extends RMRequiredComponentsImpl implements RTTRequiredComponents {
	/**
	 * The cached value of the '{@link #getRTTTaskContexts() <em>RTT Task Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTTTaskContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskContext> rttTaskContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTTRequiredComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.RTT_REQUIRED_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskContext> getRTTTaskContexts() {
		if (rttTaskContexts == null) {
			rttTaskContexts = new EObjectResolvingEList<TaskContext>(TaskContext.class, this, rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS);
		}
		return rttTaskContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS:
				return getRTTTaskContexts();
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
			case rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS:
				getRTTTaskContexts().clear();
				getRTTTaskContexts().addAll((Collection<? extends TaskContext>)newValue);
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
			case rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS:
				getRTTTaskContexts().clear();
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
			case rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS__RTT_TASK_CONTEXTS:
				return rttTaskContexts != null && !rttTaskContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RTTRequiredComponentsImpl
