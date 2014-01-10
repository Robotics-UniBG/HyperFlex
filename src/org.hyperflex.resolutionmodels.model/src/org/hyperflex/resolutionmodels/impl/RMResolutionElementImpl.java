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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package org.hyperflex.resolutionmodels.impl;

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

import org.hyperflex.featuremodels.Feature;

import org.hyperflex.resolutionmodels.RMRequiredElements;
import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.RMTransformation;
import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RM Resolution Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.RMResolutionElementImpl#isActiveIfSelected <em>Active If Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RMResolutionElementImpl extends EObjectImpl implements RMResolutionElement {
	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<RMTransformation> transformations;

	/**
	 * The cached value of the '{@link #getRequiredElements() <em>Required Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredElements()
	 * @generated
	 * @ordered
	 */
	protected RMRequiredElements requiredElements;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

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
	 * The default value of the '{@link #isActiveIfSelected() <em>Active If Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveIfSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_IF_SELECTED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActiveIfSelected() <em>Active If Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveIfSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean activeIfSelected = ACTIVE_IF_SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RMResolutionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resolutionmodelsPackage.Literals.RM_RESOLUTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RMTransformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<RMTransformation>(RMTransformation.class, this, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMRequiredElements getRequiredElements() {
		return requiredElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredElements(RMRequiredElements newRequiredElements, NotificationChain msgs) {
		RMRequiredElements oldRequiredElements = requiredElements;
		requiredElements = newRequiredElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS, oldRequiredElements, newRequiredElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredElements(RMRequiredElements newRequiredElements) {
		if (newRequiredElements != requiredElements) {
			NotificationChain msgs = null;
			if (requiredElements != null)
				msgs = ((InternalEObject)requiredElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS, null, msgs);
			if (newRequiredElements != null)
				msgs = ((InternalEObject)newRequiredElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS, null, msgs);
			msgs = basicSetRequiredElements(newRequiredElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS, newRequiredElements, newRequiredElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActiveIfSelected() {
		return activeIfSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveIfSelected(boolean newActiveIfSelected) {
		boolean oldActiveIfSelected = activeIfSelected;
		activeIfSelected = newActiveIfSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED, oldActiveIfSelected, activeIfSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS:
				return basicSetRequiredElements(null, msgs);
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
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return getTransformations();
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS:
				return getRequiredElements();
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__NAME:
				return getName();
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED:
				return isActiveIfSelected();
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
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends RMTransformation>)newValue);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS:
				setRequiredElements((RMRequiredElements)newValue);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				setFeature((Feature)newValue);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED:
				setActiveIfSelected((Boolean)newValue);
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
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS:
				setRequiredElements((RMRequiredElements)null);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				setFeature((Feature)null);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED:
				setActiveIfSelected(ACTIVE_IF_SELECTED_EDEFAULT);
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
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS:
				return requiredElements != null;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				return feature != null;
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT__ACTIVE_IF_SELECTED:
				return activeIfSelected != ACTIVE_IF_SELECTED_EDEFAULT;
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
		result.append(", activeIfSelected: ");
		result.append(activeIfSelected);
		result.append(')');
		return result.toString();
	}

} //RMResolutionElementImpl
