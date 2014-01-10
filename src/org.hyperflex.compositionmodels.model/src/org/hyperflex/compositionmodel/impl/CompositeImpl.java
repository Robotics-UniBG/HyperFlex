/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
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
package org.hyperflex.compositionmodel.impl;

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
import org.hyperflex.compositionmodel.CompProvidedInterf;
import org.hyperflex.compositionmodel.CompRequiredInterf;
import org.hyperflex.compositionmodel.Composite;
import org.hyperflex.compositionmodel.CompositeProperty;
import org.hyperflex.compositionmodel.compositionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.compositionmodel.impl.CompositeImpl#getProvInterfaces <em>Prov Interfaces</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.impl.CompositeImpl#getReqInterfaces <em>Req Interfaces</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.impl.CompositeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.impl.CompositeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompositeImpl extends EObjectImpl implements Composite {
	/**
	 * The cached value of the '{@link #getProvInterfaces() <em>Prov Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CompProvidedInterf> provInterfaces;

	/**
	 * The cached value of the '{@link #getReqInterfaces() <em>Req Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CompRequiredInterf> reqInterfaces;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeProperty> properties;

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
		return compositionmodelPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompProvidedInterf> getProvInterfaces() {
		if (provInterfaces == null) {
			provInterfaces = new EObjectContainmentEList<CompProvidedInterf>(CompProvidedInterf.class, this, compositionmodelPackage.COMPOSITE__PROV_INTERFACES);
		}
		return provInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompRequiredInterf> getReqInterfaces() {
		if (reqInterfaces == null) {
			reqInterfaces = new EObjectContainmentEList<CompRequiredInterf>(CompRequiredInterf.class, this, compositionmodelPackage.COMPOSITE__REQ_INTERFACES);
		}
		return reqInterfaces;
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
			eNotify(new ENotificationImpl(this, Notification.SET, compositionmodelPackage.COMPOSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CompositeProperty>(CompositeProperty.class, this, compositionmodelPackage.COMPOSITE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				return ((InternalEList<?>)getProvInterfaces()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				return ((InternalEList<?>)getReqInterfaces()).basicRemove(otherEnd, msgs);
			case compositionmodelPackage.COMPOSITE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				return getProvInterfaces();
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				return getReqInterfaces();
			case compositionmodelPackage.COMPOSITE__NAME:
				return getName();
			case compositionmodelPackage.COMPOSITE__PROPERTIES:
				return getProperties();
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
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				getProvInterfaces().clear();
				getProvInterfaces().addAll((Collection<? extends CompProvidedInterf>)newValue);
				return;
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				getReqInterfaces().clear();
				getReqInterfaces().addAll((Collection<? extends CompRequiredInterf>)newValue);
				return;
			case compositionmodelPackage.COMPOSITE__NAME:
				setName((String)newValue);
				return;
			case compositionmodelPackage.COMPOSITE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends CompositeProperty>)newValue);
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
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				getProvInterfaces().clear();
				return;
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				getReqInterfaces().clear();
				return;
			case compositionmodelPackage.COMPOSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case compositionmodelPackage.COMPOSITE__PROPERTIES:
				getProperties().clear();
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
			case compositionmodelPackage.COMPOSITE__PROV_INTERFACES:
				return provInterfaces != null && !provInterfaces.isEmpty();
			case compositionmodelPackage.COMPOSITE__REQ_INTERFACES:
				return reqInterfaces != null && !reqInterfaces.isEmpty();
			case compositionmodelPackage.COMPOSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case compositionmodelPackage.COMPOSITE__PROPERTIES:
				return properties != null && !properties.isEmpty();
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

} //CompositeImpl
