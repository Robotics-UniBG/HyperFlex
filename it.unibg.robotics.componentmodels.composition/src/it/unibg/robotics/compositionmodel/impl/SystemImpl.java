/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.compositionmodel.impl;

import it.unibg.robotics.compositionmodel.Composite;
import it.unibg.robotics.compositionmodel.Connection;
import it.unibg.robotics.compositionmodel.SystemProperty;
import it.unibg.robotics.compositionmodel.SystemProvidedInterf;
import it.unibg.robotics.compositionmodel.SystemRequiredInterf;
import it.unibg.robotics.compositionmodel.compositionmodelPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.SystemImpl#getComposites <em>Composites</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.SystemImpl#getProvInterfaces <em>Prov Interfaces</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.SystemImpl#getReqInterfaces <em>Req Interfaces</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.SystemImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.compositionmodel.impl.SystemImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements it.unibg.robotics.compositionmodel.System {
	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<Composite> composites;

	/**
	 * The cached value of the '{@link #getProvInterfaces() <em>Prov Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemProvidedInterf> provInterfaces;
	/**
	 * The cached value of the '{@link #getReqInterfaces() <em>Req Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemRequiredInterf> reqInterfaces;
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemProperty> properties;

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
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

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
		return compositionmodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composite> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<Composite>(Composite.class, this, compositionmodelPackage.SYSTEM__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemProvidedInterf> getProvInterfaces() {
		if (provInterfaces == null) {
			provInterfaces = new EObjectContainmentEList<SystemProvidedInterf>(SystemProvidedInterf.class, this, compositionmodelPackage.SYSTEM__PROV_INTERFACES);
		}
		return provInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemRequiredInterf> getReqInterfaces() {
		if (reqInterfaces == null) {
			reqInterfaces = new EObjectContainmentEList<SystemRequiredInterf>(SystemRequiredInterf.class, this, compositionmodelPackage.SYSTEM__REQ_INTERFACES);
		}
		return reqInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<SystemProperty>(SystemProperty.class, this, compositionmodelPackage.SYSTEM__PROPERTIES);
		}
		return properties;
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
			eNotify(new ENotificationImpl(this, Notification.SET, compositionmodelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, compositionmodelPackage.SYSTEM__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case compositionmodelPackage.SYSTEM__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.SYSTEM__PROV_INTERFACES:
				return ((InternalEList<?>)getProvInterfaces()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.SYSTEM__REQ_INTERFACES:
				return ((InternalEList<?>)getReqInterfaces()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.SYSTEM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.SYSTEM__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case compositionmodelPackage.SYSTEM__COMPOSITES:
				return getComposites();
			case compositionmodelPackage.SYSTEM__PROV_INTERFACES:
				return getProvInterfaces();
			case compositionmodelPackage.SYSTEM__REQ_INTERFACES:
				return getReqInterfaces();
			case compositionmodelPackage.SYSTEM__PROPERTIES:
				return getProperties();
			case compositionmodelPackage.SYSTEM__NAME:
				return getName();
			case compositionmodelPackage.SYSTEM__CONNECTIONS:
				return getConnections();
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
			case compositionmodelPackage.SYSTEM__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends Composite>)newValue);
				return;
			case compositionmodelPackage.SYSTEM__PROV_INTERFACES:
				getProvInterfaces().clear();
				getProvInterfaces().addAll((Collection<? extends SystemProvidedInterf>)newValue);
				return;
			case compositionmodelPackage.SYSTEM__REQ_INTERFACES:
				getReqInterfaces().clear();
				getReqInterfaces().addAll((Collection<? extends SystemRequiredInterf>)newValue);
				return;
			case compositionmodelPackage.SYSTEM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends SystemProperty>)newValue);
				return;
			case compositionmodelPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case compositionmodelPackage.SYSTEM__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
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
			case compositionmodelPackage.SYSTEM__COMPOSITES:
				getComposites().clear();
				return;
			case compositionmodelPackage.SYSTEM__PROV_INTERFACES:
				getProvInterfaces().clear();
				return;
			case compositionmodelPackage.SYSTEM__REQ_INTERFACES:
				getReqInterfaces().clear();
				return;
			case compositionmodelPackage.SYSTEM__PROPERTIES:
				getProperties().clear();
				return;
			case compositionmodelPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case compositionmodelPackage.SYSTEM__CONNECTIONS:
				getConnections().clear();
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
			case compositionmodelPackage.SYSTEM__COMPOSITES:
				return composites != null && !composites.isEmpty();
			case compositionmodelPackage.SYSTEM__PROV_INTERFACES:
				return provInterfaces != null && !provInterfaces.isEmpty();
			case compositionmodelPackage.SYSTEM__REQ_INTERFACES:
				return reqInterfaces != null && !reqInterfaces.isEmpty();
			case compositionmodelPackage.SYSTEM__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case compositionmodelPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case compositionmodelPackage.SYSTEM__CONNECTIONS:
				return connections != null && !connections.isEmpty();
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
