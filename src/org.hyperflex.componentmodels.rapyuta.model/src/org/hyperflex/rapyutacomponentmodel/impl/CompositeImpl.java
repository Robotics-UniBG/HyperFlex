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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.rapyutacomponentmodel.AbstractComponent;
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.CompositeParameter;
import org.hyperflex.rapyutacomponentmodel.CompositePublisher;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvClient;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvServer;
import org.hyperflex.rapyutacomponentmodel.CompositeSubscriber;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getSrvServers <em>Srv Servers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getSrvClients <em>Srv Clients</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getSrvConnections <em>Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.CompositeImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends AbstractComponentImpl implements Composite {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponent> components;

	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositePublisher> publishers;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSubscriber> subscribers;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topics;

	/**
	 * The cached value of the '{@link #getSrvServers() <em>Srv Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvServers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSrvServer> srvServers;

	/**
	 * The cached value of the '{@link #getSrvClients() <em>Srv Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvClients()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSrvClient> srvClients;

	/**
	 * The cached value of the '{@link #getSrvConnections() <em>Srv Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSrvConnection> srvConnections;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositePublisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<CompositePublisher>(CompositePublisher.class, this, rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSubscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectContainmentEList<CompositeSubscriber>(CompositeSubscriber.class, this, rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, rapyutacomponentmodelPackage.COMPOSITE__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSrvServer> getSrvServers() {
		if (srvServers == null) {
			srvServers = new EObjectContainmentEList<CompositeSrvServer>(CompositeSrvServer.class, this, rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS);
		}
		return srvServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSrvClient> getSrvClients() {
		if (srvClients == null) {
			srvClients = new EObjectContainmentEList<CompositeSrvClient>(CompositeSrvClient.class, this, rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS);
		}
		return srvClients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSrvConnection> getSrvConnections() {
		if (srvConnections == null) {
			srvConnections = new EObjectContainmentEList<CompositeSrvConnection>(CompositeSrvConnection.class, this, rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS);
		}
		return srvConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<CompositeParameter>(CompositeParameter.class, this, rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS);
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
			case rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS:
				return ((InternalEList<?>)getSrvServers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS:
				return ((InternalEList<?>)getSrvClients()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS:
				return ((InternalEList<?>)getSrvConnections()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS:
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
			case rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS:
				return getComponents();
			case rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS:
				return getPublishers();
			case rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS:
				return getSubscribers();
			case rapyutacomponentmodelPackage.COMPOSITE__TOPICS:
				return getTopics();
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS:
				return getSrvServers();
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS:
				return getSrvClients();
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS:
				return getSrvConnections();
			case rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS:
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
			case rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends AbstractComponent>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends CompositePublisher>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends CompositeSubscriber>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS:
				getSrvServers().clear();
				getSrvServers().addAll((Collection<? extends CompositeSrvServer>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS:
				getSrvClients().clear();
				getSrvClients().addAll((Collection<? extends CompositeSrvClient>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS:
				getSrvConnections().clear();
				getSrvConnections().addAll((Collection<? extends CompositeSrvConnection>)newValue);
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends CompositeParameter>)newValue);
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
			case rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS:
				getPublishers().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__TOPICS:
				getTopics().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS:
				getSrvServers().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS:
				getSrvClients().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS:
				getSrvConnections().clear();
				return;
			case rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS:
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
			case rapyutacomponentmodelPackage.COMPOSITE__COMPONENTS:
				return components != null && !components.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__TOPICS:
				return topics != null && !topics.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_SERVERS:
				return srvServers != null && !srvServers.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CLIENTS:
				return srvClients != null && !srvClients.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__SRV_CONNECTIONS:
				return srvConnections != null && !srvConnections.isEmpty();
			case rapyutacomponentmodelPackage.COMPOSITE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
