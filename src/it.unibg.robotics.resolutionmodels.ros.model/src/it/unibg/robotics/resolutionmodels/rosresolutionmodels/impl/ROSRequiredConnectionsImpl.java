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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import org.hyperflex.resolutionmodels.impl.RMRequiredConnectionsImpl;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Required Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl#getRequiredExistingTopicConnections <em>Required Existing Topic Connections</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl#getRequiredExistingServiceConnections <em>Required Existing Service Connections</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredConnectionsImpl#getRequiredExistingActionConnections <em>Required Existing Action Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSRequiredConnectionsImpl extends RMRequiredConnectionsImpl implements ROSRequiredConnections {
	/**
	 * The cached value of the '{@link #getRequiredExistingTopicConnections() <em>Required Existing Topic Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExistingTopicConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSExistingTopicConnection> requiredExistingTopicConnections;

	/**
	 * The cached value of the '{@link #getRequiredExistingServiceConnections() <em>Required Existing Service Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExistingServiceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSExistingServiceConnection> requiredExistingServiceConnections;

	/**
	 * The cached value of the '{@link #getRequiredExistingActionConnections() <em>Required Existing Action Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExistingActionConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSExistingActionConnection> requiredExistingActionConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSRequiredConnectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_REQUIRED_CONNECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSExistingTopicConnection> getRequiredExistingTopicConnections() {
		if (requiredExistingTopicConnections == null) {
			requiredExistingTopicConnections = new EObjectContainmentEList<ROSExistingTopicConnection>(ROSExistingTopicConnection.class, this, rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS);
		}
		return requiredExistingTopicConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSExistingServiceConnection> getRequiredExistingServiceConnections() {
		if (requiredExistingServiceConnections == null) {
			requiredExistingServiceConnections = new EObjectContainmentEList<ROSExistingServiceConnection>(ROSExistingServiceConnection.class, this, rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS);
		}
		return requiredExistingServiceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSExistingActionConnection> getRequiredExistingActionConnections() {
		if (requiredExistingActionConnections == null) {
			requiredExistingActionConnections = new EObjectContainmentEList<ROSExistingActionConnection>(ROSExistingActionConnection.class, this, rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS);
		}
		return requiredExistingActionConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS:
				return ((InternalEList<?>)getRequiredExistingTopicConnections()).basicRemove(otherEnd, msgs);
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS:
				return ((InternalEList<?>)getRequiredExistingServiceConnections()).basicRemove(otherEnd, msgs);
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS:
				return ((InternalEList<?>)getRequiredExistingActionConnections()).basicRemove(otherEnd, msgs);
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS:
				return getRequiredExistingTopicConnections();
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS:
				return getRequiredExistingServiceConnections();
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS:
				return getRequiredExistingActionConnections();
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS:
				getRequiredExistingTopicConnections().clear();
				getRequiredExistingTopicConnections().addAll((Collection<? extends ROSExistingTopicConnection>)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS:
				getRequiredExistingServiceConnections().clear();
				getRequiredExistingServiceConnections().addAll((Collection<? extends ROSExistingServiceConnection>)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS:
				getRequiredExistingActionConnections().clear();
				getRequiredExistingActionConnections().addAll((Collection<? extends ROSExistingActionConnection>)newValue);
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS:
				getRequiredExistingTopicConnections().clear();
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS:
				getRequiredExistingServiceConnections().clear();
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS:
				getRequiredExistingActionConnections().clear();
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_TOPIC_CONNECTIONS:
				return requiredExistingTopicConnections != null && !requiredExistingTopicConnections.isEmpty();
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_SERVICE_CONNECTIONS:
				return requiredExistingServiceConnections != null && !requiredExistingServiceConnections.isEmpty();
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_EXISTING_ACTION_CONNECTIONS:
				return requiredExistingActionConnections != null && !requiredExistingActionConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROSRequiredConnectionsImpl
