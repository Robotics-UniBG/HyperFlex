/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.rapyutacomponentmodel.Node;
import org.hyperflex.rapyutacomponentmodel.NodeParameter;
import org.hyperflex.rapyutacomponentmodel.NodePublisher;
import org.hyperflex.rapyutacomponentmodel.NodeSrvClient;
import org.hyperflex.rapyutacomponentmodel.NodeSrvServer;
import org.hyperflex.rapyutacomponentmodel.NodeSubscriber;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getSrvServers <em>Srv Servers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getSrvClients <em>Srv Clients</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.NodeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractComponentImpl implements Node {
	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodePublisher> publishers;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSubscriber> subscribers;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeParameter> parameters;

	/**
	 * The cached value of the '{@link #getSrvServers() <em>Srv Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvServers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSrvServer> srvServers;

	/**
	 * The cached value of the '{@link #getSrvClients() <em>Srv Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvClients()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSrvClient> srvClients;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodePublisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<NodePublisher>(NodePublisher.class, this, rapyutacomponentmodelPackage.NODE__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSubscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectContainmentEList<NodeSubscriber>(NodeSubscriber.class, this, rapyutacomponentmodelPackage.NODE__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<NodeParameter>(NodeParameter.class, this, rapyutacomponentmodelPackage.NODE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSrvServer> getSrvServers() {
		if (srvServers == null) {
			srvServers = new EObjectContainmentEList<NodeSrvServer>(NodeSrvServer.class, this, rapyutacomponentmodelPackage.NODE__SRV_SERVERS);
		}
		return srvServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSrvClient> getSrvClients() {
		if (srvClients == null) {
			srvClients = new EObjectContainmentEList<NodeSrvClient>(NodeSrvClient.class, this, rapyutacomponentmodelPackage.NODE__SRV_CLIENTS);
		}
		return srvClients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.NODE__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.NODE__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.NODE__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.NODE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.NODE__SRV_SERVERS:
				return ((InternalEList<?>)getSrvServers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.NODE__SRV_CLIENTS:
				return ((InternalEList<?>)getSrvClients()).basicRemove(otherEnd, msgs);
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
			case rapyutacomponentmodelPackage.NODE__PUBLISHERS:
				return getPublishers();
			case rapyutacomponentmodelPackage.NODE__SUBSCRIBERS:
				return getSubscribers();
			case rapyutacomponentmodelPackage.NODE__PARAMETERS:
				return getParameters();
			case rapyutacomponentmodelPackage.NODE__SRV_SERVERS:
				return getSrvServers();
			case rapyutacomponentmodelPackage.NODE__SRV_CLIENTS:
				return getSrvClients();
			case rapyutacomponentmodelPackage.NODE__PACKAGE_NAME:
				return getPackageName();
			case rapyutacomponentmodelPackage.NODE__TYPE:
				return getType();
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
			case rapyutacomponentmodelPackage.NODE__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends NodePublisher>)newValue);
				return;
			case rapyutacomponentmodelPackage.NODE__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends NodeSubscriber>)newValue);
				return;
			case rapyutacomponentmodelPackage.NODE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends NodeParameter>)newValue);
				return;
			case rapyutacomponentmodelPackage.NODE__SRV_SERVERS:
				getSrvServers().clear();
				getSrvServers().addAll((Collection<? extends NodeSrvServer>)newValue);
				return;
			case rapyutacomponentmodelPackage.NODE__SRV_CLIENTS:
				getSrvClients().clear();
				getSrvClients().addAll((Collection<? extends NodeSrvClient>)newValue);
				return;
			case rapyutacomponentmodelPackage.NODE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case rapyutacomponentmodelPackage.NODE__TYPE:
				setType((String)newValue);
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
			case rapyutacomponentmodelPackage.NODE__PUBLISHERS:
				getPublishers().clear();
				return;
			case rapyutacomponentmodelPackage.NODE__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case rapyutacomponentmodelPackage.NODE__PARAMETERS:
				getParameters().clear();
				return;
			case rapyutacomponentmodelPackage.NODE__SRV_SERVERS:
				getSrvServers().clear();
				return;
			case rapyutacomponentmodelPackage.NODE__SRV_CLIENTS:
				getSrvClients().clear();
				return;
			case rapyutacomponentmodelPackage.NODE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case rapyutacomponentmodelPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case rapyutacomponentmodelPackage.NODE__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case rapyutacomponentmodelPackage.NODE__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case rapyutacomponentmodelPackage.NODE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case rapyutacomponentmodelPackage.NODE__SRV_SERVERS:
				return srvServers != null && !srvServers.isEmpty();
			case rapyutacomponentmodelPackage.NODE__SRV_CLIENTS:
				return srvClients != null && !srvClients.isEmpty();
			case rapyutacomponentmodelPackage.NODE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case rapyutacomponentmodelPackage.NODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
