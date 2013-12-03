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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.rapyutacomponentmodel.AbstractComponent;
import org.hyperflex.rapyutacomponentmodel.Container;
import org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl#getSrvConnections <em>Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.ContainerImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends EObjectImpl implements Container {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topics;

	/**
	 * The cached value of the '{@link #getSrvConnections() <em>Srv Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerSrvConnection> srvConnections;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentEndPoint endPoint;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, rapyutacomponentmodelPackage.CONTAINER__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerSrvConnection> getSrvConnections() {
		if (srvConnections == null) {
			srvConnections = new EObjectContainmentEList<ContainerSrvConnection>(ContainerSrvConnection.class, this, rapyutacomponentmodelPackage.CONTAINER__SRV_CONNECTIONS);
		}
		return srvConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentEndPoint getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPoint(EnvironmentEndPoint newEndPoint, NotificationChain msgs) {
		EnvironmentEndPoint oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.CONTAINER__END_POINT, oldEndPoint, newEndPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPoint(EnvironmentEndPoint newEndPoint) {
		if (newEndPoint != endPoint) {
			NotificationChain msgs = null;
			if (endPoint != null)
				msgs = ((InternalEObject)endPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - rapyutacomponentmodelPackage.CONTAINER__END_POINT, null, msgs);
			if (newEndPoint != null)
				msgs = ((InternalEObject)newEndPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - rapyutacomponentmodelPackage.CONTAINER__END_POINT, null, msgs);
			msgs = basicSetEndPoint(newEndPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.CONTAINER__END_POINT, newEndPoint, newEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, rapyutacomponentmodelPackage.CONTAINER__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.CONTAINER__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.CONTAINER__SRV_CONNECTIONS:
				return ((InternalEList<?>)getSrvConnections()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.CONTAINER__END_POINT:
				return basicSetEndPoint(null, msgs);
			case rapyutacomponentmodelPackage.CONTAINER__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case rapyutacomponentmodelPackage.CONTAINER__NAME:
				return getName();
			case rapyutacomponentmodelPackage.CONTAINER__TOPICS:
				return getTopics();
			case rapyutacomponentmodelPackage.CONTAINER__SRV_CONNECTIONS:
				return getSrvConnections();
			case rapyutacomponentmodelPackage.CONTAINER__END_POINT:
				return getEndPoint();
			case rapyutacomponentmodelPackage.CONTAINER__COMPONENTS:
				return getComponents();
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
			case rapyutacomponentmodelPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case rapyutacomponentmodelPackage.CONTAINER__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case rapyutacomponentmodelPackage.CONTAINER__SRV_CONNECTIONS:
				getSrvConnections().clear();
				getSrvConnections().addAll((Collection<? extends ContainerSrvConnection>)newValue);
				return;
			case rapyutacomponentmodelPackage.CONTAINER__END_POINT:
				setEndPoint((EnvironmentEndPoint)newValue);
				return;
			case rapyutacomponentmodelPackage.CONTAINER__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends AbstractComponent>)newValue);
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
			case rapyutacomponentmodelPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case rapyutacomponentmodelPackage.CONTAINER__TOPICS:
				getTopics().clear();
				return;
			case rapyutacomponentmodelPackage.CONTAINER__SRV_CONNECTIONS:
				getSrvConnections().clear();
				return;
			case rapyutacomponentmodelPackage.CONTAINER__END_POINT:
				setEndPoint((EnvironmentEndPoint)null);
				return;
			case rapyutacomponentmodelPackage.CONTAINER__COMPONENTS:
				getComponents().clear();
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
			case rapyutacomponentmodelPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case rapyutacomponentmodelPackage.CONTAINER__TOPICS:
				return topics != null && !topics.isEmpty();
			case rapyutacomponentmodelPackage.CONTAINER__SRV_CONNECTIONS:
				return srvConnections != null && !srvConnections.isEmpty();
			case rapyutacomponentmodelPackage.CONTAINER__END_POINT:
				return endPoint != null;
			case rapyutacomponentmodelPackage.CONTAINER__COMPONENTS:
				return components != null && !components.isEmpty();
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

} //ContainerImpl
