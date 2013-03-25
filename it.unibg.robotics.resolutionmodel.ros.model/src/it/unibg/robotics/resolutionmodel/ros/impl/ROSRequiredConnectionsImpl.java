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
package it.unibg.robotics.resolutionmodel.ros.impl;

import it.unibg.robotics.resolutionmodel.impl.RMRequiredConnectionsImpl;
import it.unibg.robotics.resolutionmodel.ros.ROSActionConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodel.ros.ROSServiceConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSTopicConnection;
import it.unibg.robotics.resolutionmodel.ros.rosPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ros.model.ros.Action;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Required Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSRequiredConnectionsImpl#getRequiredTopicConnections <em>Required Topic Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSRequiredConnectionsImpl#getRequiredServiceConnections <em>Required Service Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSRequiredConnectionsImpl#getRequiredActionConnections <em>Required Action Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSRequiredConnectionsImpl extends RMRequiredConnectionsImpl implements ROSRequiredConnections {
	/**
	 * The cached value of the '{@link #getRequiredTopicConnections() <em>Required Topic Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTopicConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSTopicConnection> requiredTopicConnections;
	/**
	 * The cached value of the '{@link #getRequiredServiceConnections() <em>Required Service Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServiceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSServiceConnection> requiredServiceConnections;
	/**
	 * The cached value of the '{@link #getRequiredActionConnections() <em>Required Action Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredActionConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSActionConnection> requiredActionConnections;
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
		return rosPackage.Literals.ROS_REQUIRED_CONNECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSTopicConnection> getRequiredTopicConnections() {
		if (requiredTopicConnections == null) {
			requiredTopicConnections = new EObjectResolvingEList<ROSTopicConnection>(ROSTopicConnection.class, this, rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS);
		}
		return requiredTopicConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSServiceConnection> getRequiredServiceConnections() {
		if (requiredServiceConnections == null) {
			requiredServiceConnections = new EObjectResolvingEList<ROSServiceConnection>(ROSServiceConnection.class, this, rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS);
		}
		return requiredServiceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSActionConnection> getRequiredActionConnections() {
		if (requiredActionConnections == null) {
			requiredActionConnections = new EObjectResolvingEList<ROSActionConnection>(ROSActionConnection.class, this, rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS);
		}
		return requiredActionConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS:
				return getRequiredTopicConnections();
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS:
				return getRequiredServiceConnections();
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS:
				return getRequiredActionConnections();
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
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS:
				getRequiredTopicConnections().clear();
				getRequiredTopicConnections().addAll((Collection<? extends ROSTopicConnection>)newValue);
				return;
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS:
				getRequiredServiceConnections().clear();
				getRequiredServiceConnections().addAll((Collection<? extends ROSServiceConnection>)newValue);
				return;
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS:
				getRequiredActionConnections().clear();
				getRequiredActionConnections().addAll((Collection<? extends ROSActionConnection>)newValue);
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
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS:
				getRequiredTopicConnections().clear();
				return;
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS:
				getRequiredServiceConnections().clear();
				return;
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS:
				getRequiredActionConnections().clear();
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
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_TOPIC_CONNECTIONS:
				return requiredTopicConnections != null && !requiredTopicConnections.isEmpty();
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_SERVICE_CONNECTIONS:
				return requiredServiceConnections != null && !requiredServiceConnections.isEmpty();
			case rosPackage.ROS_REQUIRED_CONNECTIONS__REQUIRED_ACTION_CONNECTIONS:
				return requiredActionConnections != null && !requiredActionConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROSRequiredConnectionsImpl
