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
package org.hyperflex.featuremodels.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.featuremodels.Attribute;
import org.hyperflex.featuremodels.ContainmentAssociation;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.featuremodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getFeatureParent <em>Feature Parent</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getContainerParent <em>Container Parent</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends EObjectImpl implements Feature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubFeatures() <em>Sub Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> subFeatures;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainmentAssociation> containers;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return featuremodelsPackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRoot(boolean newRoot) {
		boolean oldRoot = root;
		root = newRoot;
		setRequired(true);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		if(getContainerParent()!=null && getContainerParent().getUpperBound() == 1){
			newRequired = false;
		}
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSubFeatures() {
		if (subFeatures == null) {
			subFeatures = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, featuremodelsPackage.FEATURE__SUB_FEATURES, featuremodelsPackage.FEATURE__FEATURE_PARENT);
		}
		return subFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatureParent() {
		if (eContainerFeatureID() != featuremodelsPackage.FEATURE__FEATURE_PARENT) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureParent(Feature newFeatureParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeatureParent, featuremodelsPackage.FEATURE__FEATURE_PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureParent(Feature newFeatureParent) {
		if (newFeatureParent != eInternalContainer() || (eContainerFeatureID() != featuremodelsPackage.FEATURE__FEATURE_PARENT && newFeatureParent != null)) {
			if (EcoreUtil.isAncestor(this, newFeatureParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeatureParent != null)
				msgs = ((InternalEObject)newFeatureParent).eInverseAdd(this, featuremodelsPackage.FEATURE__SUB_FEATURES, Feature.class, msgs);
			msgs = basicSetFeatureParent(newFeatureParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__FEATURE_PARENT, newFeatureParent, newFeatureParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainmentAssociation> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentWithInverseEList<ContainmentAssociation>(ContainmentAssociation.class, this, featuremodelsPackage.FEATURE__CONTAINERS, featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentAssociation getContainerParent() {
		if (eContainerFeatureID() != featuremodelsPackage.FEATURE__CONTAINER_PARENT) return null;
		return (ContainmentAssociation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerParent(ContainmentAssociation newContainerParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainerParent, featuremodelsPackage.FEATURE__CONTAINER_PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerParent(ContainmentAssociation newContainerParent) {
		if (newContainerParent != eInternalContainer() || (eContainerFeatureID() != featuremodelsPackage.FEATURE__CONTAINER_PARENT && newContainerParent != null)) {
			if (EcoreUtil.isAncestor(this, newContainerParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerParent != null)
				msgs = ((InternalEObject)newContainerParent).eInverseAdd(this, featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES, ContainmentAssociation.class, msgs);
			msgs = basicSetContainerParent(newContainerParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__CONTAINER_PARENT, newContainerParent, newContainerParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, featuremodelsPackage.FEATURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case featuremodelsPackage.FEATURE__SUB_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubFeatures()).basicAdd(otherEnd, msgs);
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFeatureParent((Feature)otherEnd, msgs);
			case featuremodelsPackage.FEATURE__CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainers()).basicAdd(otherEnd, msgs);
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainerParent((ContainmentAssociation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case featuremodelsPackage.FEATURE__SUB_FEATURES:
				return ((InternalEList<?>)getSubFeatures()).basicRemove(otherEnd, msgs);
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				return basicSetFeatureParent(null, msgs);
			case featuremodelsPackage.FEATURE__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				return basicSetContainerParent(null, msgs);
			case featuremodelsPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				return eInternalContainer().eInverseRemove(this, featuremodelsPackage.FEATURE__SUB_FEATURES, Feature.class, msgs);
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				return eInternalContainer().eInverseRemove(this, featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES, ContainmentAssociation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case featuremodelsPackage.FEATURE__NAME:
				return getName();
			case featuremodelsPackage.FEATURE__ROOT:
				return isRoot();
			case featuremodelsPackage.FEATURE__REQUIRED:
				return isRequired();
			case featuremodelsPackage.FEATURE__SUB_FEATURES:
				return getSubFeatures();
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				return getFeatureParent();
			case featuremodelsPackage.FEATURE__CONTAINERS:
				return getContainers();
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				return getContainerParent();
			case featuremodelsPackage.FEATURE__LOWER_BOUND:
				return getLowerBound();
			case featuremodelsPackage.FEATURE__UPPER_BOUND:
				return getUpperBound();
			case featuremodelsPackage.FEATURE__ATTRIBUTES:
				return getAttributes();
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
			case featuremodelsPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case featuremodelsPackage.FEATURE__ROOT:
				setRoot((Boolean)newValue);
				return;
			case featuremodelsPackage.FEATURE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case featuremodelsPackage.FEATURE__SUB_FEATURES:
				getSubFeatures().clear();
				getSubFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				setFeatureParent((Feature)newValue);
				return;
			case featuremodelsPackage.FEATURE__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ContainmentAssociation>)newValue);
				return;
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				setContainerParent((ContainmentAssociation)newValue);
				return;
			case featuremodelsPackage.FEATURE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case featuremodelsPackage.FEATURE__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case featuremodelsPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case featuremodelsPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case featuremodelsPackage.FEATURE__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case featuremodelsPackage.FEATURE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case featuremodelsPackage.FEATURE__SUB_FEATURES:
				getSubFeatures().clear();
				return;
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				setFeatureParent((Feature)null);
				return;
			case featuremodelsPackage.FEATURE__CONTAINERS:
				getContainers().clear();
				return;
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				setContainerParent((ContainmentAssociation)null);
				return;
			case featuremodelsPackage.FEATURE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case featuremodelsPackage.FEATURE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case featuremodelsPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
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
			case featuremodelsPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case featuremodelsPackage.FEATURE__ROOT:
				return root != ROOT_EDEFAULT;
			case featuremodelsPackage.FEATURE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case featuremodelsPackage.FEATURE__SUB_FEATURES:
				return subFeatures != null && !subFeatures.isEmpty();
			case featuremodelsPackage.FEATURE__FEATURE_PARENT:
				return getFeatureParent() != null;
			case featuremodelsPackage.FEATURE__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case featuremodelsPackage.FEATURE__CONTAINER_PARENT:
				return getContainerParent() != null;
			case featuremodelsPackage.FEATURE__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case featuremodelsPackage.FEATURE__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case featuremodelsPackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
		result.append(", root: ");
		result.append(root);
		result.append(", required: ");
		result.append(required);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * @generated NOT
	 */
	public FeatureModel getFeatureModel(){
		if(this.eContainer instanceof FeatureModel){
			return (FeatureModel)this.eContainer;
		}else if(this.eContainer instanceof Feature){
			if(this.eContainer != null){
				return ((Feature)this.eContainer).getFeatureModel();
			}
		}else if(this.eContainer instanceof ContainmentAssociation){
			if(this.eContainer.eContainer() != null)
				return ((Feature)this.eContainer.eContainer()).getFeatureModel();
		}
		return null;

	}

} //FeatureImpl
