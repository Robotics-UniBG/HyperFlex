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

import org.hyperflex.featuremodels.FeatureModel;

import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.TemplateSystemModel;
import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.ResolutionModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.ResolutionModelImpl#getResolutionElements <em>Resolution Elements</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.ResolutionModelImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.impl.ResolutionModelImpl#getTemplateSystemModel <em>Template System Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolutionModelImpl extends EObjectImpl implements ResolutionModel {
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
	 * The cached value of the '{@link #getResolutionElements() <em>Resolution Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RMResolutionElement> resolutionElements;

	/**
	 * The cached value of the '{@link #getFeatureModel() <em>Feature Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel featureModel;

	/**
	 * The cached value of the '{@link #getTemplateSystemModel() <em>Template System Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateSystemModel()
	 * @generated
	 * @ordered
	 */
	protected TemplateSystemModel templateSystemModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resolutionmodelsPackage.Literals.RESOLUTION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RESOLUTION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RMResolutionElement> getResolutionElements() {
		if (resolutionElements == null) {
			resolutionElements = new EObjectContainmentEList<RMResolutionElement>(RMResolutionElement.class, this, resolutionmodelsPackage.RESOLUTION_MODEL__RESOLUTION_ELEMENTS);
		}
		return resolutionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getFeatureModel() {
		if (featureModel != null && featureModel.eIsProxy()) {
			InternalEObject oldFeatureModel = (InternalEObject)featureModel;
			featureModel = (FeatureModel)eResolveProxy(oldFeatureModel);
			if (featureModel != oldFeatureModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, resolutionmodelsPackage.RESOLUTION_MODEL__FEATURE_MODEL, oldFeatureModel, featureModel));
			}
		}
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel basicGetFeatureModel() {
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModel(FeatureModel newFeatureModel) {
		FeatureModel oldFeatureModel = featureModel;
		featureModel = newFeatureModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RESOLUTION_MODEL__FEATURE_MODEL, oldFeatureModel, featureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSystemModel getTemplateSystemModel() {
		return templateSystemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateSystemModel(TemplateSystemModel newTemplateSystemModel, NotificationChain msgs) {
		TemplateSystemModel oldTemplateSystemModel = templateSystemModel;
		templateSystemModel = newTemplateSystemModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL, oldTemplateSystemModel, newTemplateSystemModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateSystemModel(TemplateSystemModel newTemplateSystemModel) {
		if (newTemplateSystemModel != templateSystemModel) {
			NotificationChain msgs = null;
			if (templateSystemModel != null)
				msgs = ((InternalEObject)templateSystemModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL, null, msgs);
			if (newTemplateSystemModel != null)
				msgs = ((InternalEObject)newTemplateSystemModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL, null, msgs);
			msgs = basicSetTemplateSystemModel(newTemplateSystemModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL, newTemplateSystemModel, newTemplateSystemModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case resolutionmodelsPackage.RESOLUTION_MODEL__RESOLUTION_ELEMENTS:
				return ((InternalEList<?>)getResolutionElements()).basicRemove(otherEnd, msgs);
			case resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL:
				return basicSetTemplateSystemModel(null, msgs);
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
			case resolutionmodelsPackage.RESOLUTION_MODEL__NAME:
				return getName();
			case resolutionmodelsPackage.RESOLUTION_MODEL__RESOLUTION_ELEMENTS:
				return getResolutionElements();
			case resolutionmodelsPackage.RESOLUTION_MODEL__FEATURE_MODEL:
				if (resolve) return getFeatureModel();
				return basicGetFeatureModel();
			case resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL:
				return getTemplateSystemModel();
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
			case resolutionmodelsPackage.RESOLUTION_MODEL__NAME:
				setName((String)newValue);
				return;
			case resolutionmodelsPackage.RESOLUTION_MODEL__RESOLUTION_ELEMENTS:
				getResolutionElements().clear();
				getResolutionElements().addAll((Collection<? extends RMResolutionElement>)newValue);
				return;
			case resolutionmodelsPackage.RESOLUTION_MODEL__FEATURE_MODEL:
				setFeatureModel((FeatureModel)newValue);
				return;
			case resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL:
				setTemplateSystemModel((TemplateSystemModel)newValue);
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
			case resolutionmodelsPackage.RESOLUTION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case resolutionmodelsPackage.RESOLUTION_MODEL__RESOLUTION_ELEMENTS:
				getResolutionElements().clear();
				return;
			case resolutionmodelsPackage.RESOLUTION_MODEL__FEATURE_MODEL:
				setFeatureModel((FeatureModel)null);
				return;
			case resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL:
				setTemplateSystemModel((TemplateSystemModel)null);
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
			case resolutionmodelsPackage.RESOLUTION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case resolutionmodelsPackage.RESOLUTION_MODEL__RESOLUTION_ELEMENTS:
				return resolutionElements != null && !resolutionElements.isEmpty();
			case resolutionmodelsPackage.RESOLUTION_MODEL__FEATURE_MODEL:
				return featureModel != null;
			case resolutionmodelsPackage.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL:
				return templateSystemModel != null;
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

} //ResolutionModelImpl
