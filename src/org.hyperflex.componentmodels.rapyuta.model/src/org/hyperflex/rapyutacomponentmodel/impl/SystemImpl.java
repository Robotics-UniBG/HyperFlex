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
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.rapyutacomponentmodel.CloudContainer;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection;
import org.hyperflex.rapyutacomponentmodel.RobotContainer;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getCloudContainers <em>Cloud Containers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getRobotContainers <em>Robot Containers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getEndPointSrvConnections <em>End Point Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getEndPointMsgConnections <em>End Point Msg Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements org.hyperflex.rapyutacomponentmodel.System {
	/**
	 * The cached value of the '{@link #getCloudContainers() <em>Cloud Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudContainer> cloudContainers;

	/**
	 * The cached value of the '{@link #getRobotContainers() <em>Robot Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<RobotContainer> robotContainers;

	/**
	 * The cached value of the '{@link #getEndPointSrvConnections() <em>End Point Srv Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointSrvConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointSrvConnection> endPointSrvConnections;

	/**
	 * The cached value of the '{@link #getEndPointMsgConnections() <em>End Point Msg Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointMsgConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointMsgConnection> endPointMsgConnections;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "System";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudContainer> getCloudContainers() {
		if (cloudContainers == null) {
			cloudContainers = new EObjectContainmentEList<CloudContainer>(CloudContainer.class, this, rapyutacomponentmodelPackage.SYSTEM__CLOUD_CONTAINERS);
		}
		return cloudContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RobotContainer> getRobotContainers() {
		if (robotContainers == null) {
			robotContainers = new EObjectContainmentEList<RobotContainer>(RobotContainer.class, this, rapyutacomponentmodelPackage.SYSTEM__ROBOT_CONTAINERS);
		}
		return robotContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointSrvConnection> getEndPointSrvConnections() {
		if (endPointSrvConnections == null) {
			endPointSrvConnections = new EObjectContainmentEList<EndPointSrvConnection>(EndPointSrvConnection.class, this, rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS);
		}
		return endPointSrvConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointMsgConnection> getEndPointMsgConnections() {
		if (endPointMsgConnections == null) {
			endPointMsgConnections = new EObjectContainmentEList<EndPointMsgConnection>(EndPointMsgConnection.class, this, rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS);
		}
		return endPointMsgConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.SYSTEM__CLOUD_CONTAINERS:
				return ((InternalEList<?>)getCloudContainers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.SYSTEM__ROBOT_CONTAINERS:
				return ((InternalEList<?>)getRobotContainers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				return ((InternalEList<?>)getEndPointSrvConnections()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				return ((InternalEList<?>)getEndPointMsgConnections()).basicRemove(otherEnd, msgs);
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
			case rapyutacomponentmodelPackage.SYSTEM__CLOUD_CONTAINERS:
				return getCloudContainers();
			case rapyutacomponentmodelPackage.SYSTEM__ROBOT_CONTAINERS:
				return getRobotContainers();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				return getEndPointSrvConnections();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				return getEndPointMsgConnections();
			case rapyutacomponentmodelPackage.SYSTEM__NAME:
				return getName();
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
			case rapyutacomponentmodelPackage.SYSTEM__CLOUD_CONTAINERS:
				getCloudContainers().clear();
				getCloudContainers().addAll((Collection<? extends CloudContainer>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__ROBOT_CONTAINERS:
				getRobotContainers().clear();
				getRobotContainers().addAll((Collection<? extends RobotContainer>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				getEndPointSrvConnections().clear();
				getEndPointSrvConnections().addAll((Collection<? extends EndPointSrvConnection>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				getEndPointMsgConnections().clear();
				getEndPointMsgConnections().addAll((Collection<? extends EndPointMsgConnection>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__NAME:
				setName((String)newValue);
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
			case rapyutacomponentmodelPackage.SYSTEM__CLOUD_CONTAINERS:
				getCloudContainers().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__ROBOT_CONTAINERS:
				getRobotContainers().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				getEndPointSrvConnections().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				getEndPointMsgConnections().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
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
			case rapyutacomponentmodelPackage.SYSTEM__CLOUD_CONTAINERS:
				return cloudContainers != null && !cloudContainers.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__ROBOT_CONTAINERS:
				return robotContainers != null && !robotContainers.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				return endPointSrvConnections != null && !endPointSrvConnections.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				return endPointMsgConnections != null && !endPointMsgConnections.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
