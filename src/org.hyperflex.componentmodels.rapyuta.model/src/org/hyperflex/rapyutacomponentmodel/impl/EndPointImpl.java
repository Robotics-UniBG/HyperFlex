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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.rapyutacomponentmodel.EndPoint;
import org.hyperflex.rapyutacomponentmodel.EndPointParameter;
import org.hyperflex.rapyutacomponentmodel.EndPointPublisher;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvClient;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvServer;
import org.hyperflex.rapyutacomponentmodel.EndPointSubscriber;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl#getSrvServers <em>Srv Servers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl#getSrvClients <em>Srv Clients</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.EndPointImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EndPointImpl extends AbstractComponentImpl implements EndPoint {
	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointPublisher> publishers;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointSubscriber> subscribers;

	/**
	 * The cached value of the '{@link #getSrvServers() <em>Srv Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvServers()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointSrvServer> srvServers;

	/**
	 * The cached value of the '{@link #getSrvClients() <em>Srv Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvClients()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointSrvClient> srvClients;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointPublisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<EndPointPublisher>(EndPointPublisher.class, this, rapyutacomponentmodelPackage.END_POINT__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointSubscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectContainmentEList<EndPointSubscriber>(EndPointSubscriber.class, this, rapyutacomponentmodelPackage.END_POINT__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointSrvServer> getSrvServers() {
		if (srvServers == null) {
			srvServers = new EObjectContainmentEList<EndPointSrvServer>(EndPointSrvServer.class, this, rapyutacomponentmodelPackage.END_POINT__SRV_SERVERS);
		}
		return srvServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointSrvClient> getSrvClients() {
		if (srvClients == null) {
			srvClients = new EObjectContainmentEList<EndPointSrvClient>(EndPointSrvClient.class, this, rapyutacomponentmodelPackage.END_POINT__SRV_CLIENTS);
		}
		return srvClients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<EndPointParameter>(EndPointParameter.class, this, rapyutacomponentmodelPackage.END_POINT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.END_POINT__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.END_POINT__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.END_POINT__SRV_SERVERS:
				return ((InternalEList<?>)getSrvServers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.END_POINT__SRV_CLIENTS:
				return ((InternalEList<?>)getSrvClients()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.END_POINT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case rapyutacomponentmodelPackage.END_POINT__PUBLISHERS:
				return getPublishers();
			case rapyutacomponentmodelPackage.END_POINT__SUBSCRIBERS:
				return getSubscribers();
			case rapyutacomponentmodelPackage.END_POINT__SRV_SERVERS:
				return getSrvServers();
			case rapyutacomponentmodelPackage.END_POINT__SRV_CLIENTS:
				return getSrvClients();
			case rapyutacomponentmodelPackage.END_POINT__PARAMETERS:
				return getParameters();
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
			case rapyutacomponentmodelPackage.END_POINT__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends EndPointPublisher>)newValue);
				return;
			case rapyutacomponentmodelPackage.END_POINT__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends EndPointSubscriber>)newValue);
				return;
			case rapyutacomponentmodelPackage.END_POINT__SRV_SERVERS:
				getSrvServers().clear();
				getSrvServers().addAll((Collection<? extends EndPointSrvServer>)newValue);
				return;
			case rapyutacomponentmodelPackage.END_POINT__SRV_CLIENTS:
				getSrvClients().clear();
				getSrvClients().addAll((Collection<? extends EndPointSrvClient>)newValue);
				return;
			case rapyutacomponentmodelPackage.END_POINT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends EndPointParameter>)newValue);
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
			case rapyutacomponentmodelPackage.END_POINT__PUBLISHERS:
				getPublishers().clear();
				return;
			case rapyutacomponentmodelPackage.END_POINT__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case rapyutacomponentmodelPackage.END_POINT__SRV_SERVERS:
				getSrvServers().clear();
				return;
			case rapyutacomponentmodelPackage.END_POINT__SRV_CLIENTS:
				getSrvClients().clear();
				return;
			case rapyutacomponentmodelPackage.END_POINT__PARAMETERS:
				getParameters().clear();
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
			case rapyutacomponentmodelPackage.END_POINT__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case rapyutacomponentmodelPackage.END_POINT__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case rapyutacomponentmodelPackage.END_POINT__SRV_SERVERS:
				return srvServers != null && !srvServers.isEmpty();
			case rapyutacomponentmodelPackage.END_POINT__SRV_CLIENTS:
				return srvClients != null && !srvClients.isEmpty();
			case rapyutacomponentmodelPackage.END_POINT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndPointImpl
