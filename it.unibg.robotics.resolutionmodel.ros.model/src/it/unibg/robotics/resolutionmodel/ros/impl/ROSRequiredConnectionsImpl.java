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

import it.unibg.robotics.resolutionmodel.ros.ROSAbstractConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodel.ros.rosPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Required Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSRequiredConnectionsImpl#getROSConnections <em>ROS Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSRequiredConnectionsImpl extends RMRequiredConnectionsImpl implements ROSRequiredConnections {
	/**
	 * The cached value of the '{@link #getROSConnections() <em>ROS Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROSConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSAbstractConnection> rosConnections;

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
	public EList<ROSAbstractConnection> getROSConnections() {
		if (rosConnections == null) {
			rosConnections = new EObjectResolvingEList<ROSAbstractConnection>(ROSAbstractConnection.class, this, rosPackage.ROS_REQUIRED_CONNECTIONS__ROS_CONNECTIONS);
		}
		return rosConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosPackage.ROS_REQUIRED_CONNECTIONS__ROS_CONNECTIONS:
				return getROSConnections();
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
			case rosPackage.ROS_REQUIRED_CONNECTIONS__ROS_CONNECTIONS:
				getROSConnections().clear();
				getROSConnections().addAll((Collection<? extends ROSAbstractConnection>)newValue);
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
			case rosPackage.ROS_REQUIRED_CONNECTIONS__ROS_CONNECTIONS:
				getROSConnections().clear();
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
			case rosPackage.ROS_REQUIRED_CONNECTIONS__ROS_CONNECTIONS:
				return rosConnections != null && !rosConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROSRequiredConnectionsImpl
