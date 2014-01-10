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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hyperflex.orocoscomponentmodel.TaskContext;

import org.hyperflex.resolutionmodels.impl.RMTransfImplementationImpl;

import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orocos Transf Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rttresolutionmodels.impl.OrocosTransfImplementationImpl#getTargetTaskContext <em>Target Task Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrocosTransfImplementationImpl extends RMTransfImplementationImpl implements OrocosTransfImplementation {
	/**
	 * The cached value of the '{@link #getTargetTaskContext() <em>Target Task Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTaskContext()
	 * @generated
	 * @ordered
	 */
	protected TaskContext targetTaskContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosTransfImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rttresolutionmodelsPackage.Literals.OROCOS_TRANSF_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskContext getTargetTaskContext() {
		if (targetTaskContext != null && targetTaskContext.eIsProxy()) {
			InternalEObject oldTargetTaskContext = (InternalEObject)targetTaskContext;
			targetTaskContext = (TaskContext)eResolveProxy(oldTargetTaskContext);
			if (targetTaskContext != oldTargetTaskContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT, oldTargetTaskContext, targetTaskContext));
			}
		}
		return targetTaskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskContext basicGetTargetTaskContext() {
		return targetTaskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTaskContext(TaskContext newTargetTaskContext) {
		TaskContext oldTargetTaskContext = targetTaskContext;
		targetTaskContext = newTargetTaskContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT, oldTargetTaskContext, targetTaskContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT:
				if (resolve) return getTargetTaskContext();
				return basicGetTargetTaskContext();
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT:
				setTargetTaskContext((TaskContext)newValue);
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT:
				setTargetTaskContext((TaskContext)null);
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION__TARGET_TASK_CONTEXT:
				return targetTaskContext != null;
		}
		return super.eIsSet(featureID);
	}

} //OrocosTransfImplementationImpl
