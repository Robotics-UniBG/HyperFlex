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
import it.unibg.robotics.resolutionmodel.RMRequiredComponent;
import it.unibg.robotics.resolutionmodel.RMRequiredConnection;
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
	 * The cached value of the '{@link #getRequiredComponents() <em>Required Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<RMRequiredComponent> requiredComponents;

	/**
	 * The cached value of the '{@link #getRequiredConnections() <em>Required Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<RMRequiredConnection> requiredConnections;

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
	public EList<RMRequiredComponent> getRequiredComponents() {
		if (requiredComponents == null) {
			requiredComponents = new EObjectContainmentEList<RMRequiredComponent>(RMRequiredComponent.class, this, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS);
		}
		return requiredComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RMRequiredConnection> getRequiredConnections() {
		if (requiredConnections == null) {
			requiredConnections = new EObjectContainmentEList<RMRequiredConnection>(RMRequiredConnection.class, this, resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS);
		}
		return requiredConnections;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS:
				return ((InternalEList<?>)getRequiredComponents()).basicRemove(otherEnd, msgs);
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				return ((InternalEList<?>)getRequiredConnections()).basicRemove(otherEnd, msgs);
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
				getRequiredComponents().clear();
				getRequiredComponents().addAll((Collection<? extends RMRequiredComponent>)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				getRequiredConnections().clear();
				getRequiredConnections().addAll((Collection<? extends RMRequiredConnection>)newValue);
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				setFeature((Feature)newValue);
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
				getRequiredComponents().clear();
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				getRequiredConnections().clear();
				return;
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				setFeature((Feature)null);
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
				return requiredComponents != null && !requiredComponents.isEmpty();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS:
				return requiredConnections != null && !requiredConnections.isEmpty();
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

} //RMResolutionElementImpl
