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
package it.unibg.robotics.resolutionmodel.impl;

import it.unibg.robotics.featuremodels.Feature;
import it.unibg.robotics.resolutionmodel.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodel.RMRequiredComponents;
import it.unibg.robotics.resolutionmodel.RMRequiredConnections;
import it.unibg.robotics.resolutionmodel.RMResolutionElement;
import it.unibg.robotics.resolutionmodel.resolutionmodelPackage;

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
 * An implementation of the model object '<em><b>RM Resolution Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMResolutionElementImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMResolutionElementImpl#getRequiredComponents <em>Required Components</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMResolutionElementImpl#getRequiredConnections <em>Required Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMResolutionElementImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMResolutionElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMResolutionElementImpl#getDescription <em>Description</em>}</li>
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
	protected EList<RMAbstractTransformation> transformations;

	/**
	 * The cached value of the '{@link #getRequiredComponents() <em>Required Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredComponents()
	 * @generated
	 * @ordered
	 */
	protected RMRequiredComponents requiredComponents;

	/**
	 * The cached value of the '{@link #getRequiredConnections() <em>Required Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredConnections()
	 * @generated
	 * @ordered
	 */
	protected RMRequiredConnections requiredConnections;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
		return resolutionmodelPackage.Literals.RM_RESOLUTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RMAbstractTransformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<RMAbstractTransformation>(RMAbstractTransformation.class, this, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMRequiredComponents getRequiredComponents() {
		return requiredComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredComponents(RMRequiredComponents newRequiredComponents, NotificationChain msgs) {
		RMRequiredComponents oldRequiredComponents = requiredComponents;
		requiredComponents = newRequiredComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS, oldRequiredComponents, newRequiredComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredComponents(RMRequiredComponents newRequiredComponents) {
		if (newRequiredComponents != requiredComponents) {
			NotificationChain msgs = null;
			if (requiredComponents != null)
				msgs = ((InternalEObject)requiredComponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS, null, msgs);
			if (newRequiredComponents != null)
				msgs = ((InternalEObject)newRequiredComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS, null, msgs);
			msgs = basicSetRequiredComponents(newRequiredComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS, newRequiredComponents, newRequiredComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMRequiredConnections getRequiredConnections() {
		return requiredConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredConnections(RMRequiredConnections newRequiredConnections, NotificationChain msgs) {
		RMRequiredConnections oldRequiredConnections = requiredConnections;
		requiredConnections = newRequiredConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS, oldRequiredConnections, newRequiredConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredConnections(RMRequiredConnections newRequiredConnections) {
		if (newRequiredConnections != requiredConnections) {
			NotificationChain msgs = null;
			if (requiredConnections != null)
				msgs = ((InternalEObject)requiredConnections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS, null, msgs);
			if (newRequiredConnections != null)
				msgs = ((InternalEObject)newRequiredConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS, null, msgs);
			msgs = basicSetRequiredConnections(newRequiredConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS, newRequiredConnections, newRequiredConnections));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS:
				return basicSetRequiredComponents(null, msgs);
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				return basicSetRequiredConnections(null, msgs);
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
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return getTransformations();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS:
				return getRequiredComponents();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				return getRequiredConnections();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__NAME:
				return getName();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__DESCRIPTION:
				return getDescription();
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
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends RMAbstractTransformation>)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS:
				setRequiredComponents((RMRequiredComponents)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				setRequiredConnections((RMRequiredConnections)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				setFeature((Feature)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS:
				setRequiredComponents((RMRequiredComponents)null);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				setRequiredConnections((RMRequiredConnections)null);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				setFeature((Feature)null);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS:
				return requiredComponents != null;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				return requiredConnections != null;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				return feature != null;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RMResolutionElementImpl
