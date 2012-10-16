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
package it.unibg.robotics.featuremodels.impl;


import it.unibg.robotics.featuremodels.Attribute;
import it.unibg.robotics.featuremodels.CompositeFeature;
import it.unibg.robotics.featuremodels.Feature;
import it.unibg.robotics.featuremodels.FeatureModel;
import it.unibg.robotics.featuremodels.featuremodelsPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getSimpleParent <em>Simple Parent</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getSubCompositeFeatures <em>Sub Composite Features</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getCompositeParent <em>Composite Parent</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.unibg.robotics.featuremodels.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
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
	 * The cached value of the '{@link #getSubCompositeFeatures() <em>Sub Composite Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCompositeFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeFeature> subCompositeFeatures;

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
		if(getCompositeParent()!=null && getCompositeParent().getUpperBound() == 1){
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
			subFeatures = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, featuremodelsPackage.FEATURE__SUB_FEATURES, featuremodelsPackage.FEATURE__SIMPLE_PARENT);
		}
		return subFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSimpleParent() {
		if (eContainerFeatureID() != featuremodelsPackage.FEATURE__SIMPLE_PARENT) return null;
		return (Feature)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleParent(Feature newSimpleParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSimpleParent, featuremodelsPackage.FEATURE__SIMPLE_PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleParent(Feature newSimpleParent) {
		if (newSimpleParent != eInternalContainer() || (eContainerFeatureID() != featuremodelsPackage.FEATURE__SIMPLE_PARENT && newSimpleParent != null)) {
			if (EcoreUtil.isAncestor(this, newSimpleParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSimpleParent != null)
				msgs = ((InternalEObject)newSimpleParent).eInverseAdd(this, featuremodelsPackage.FEATURE__SUB_FEATURES, Feature.class, msgs);
			msgs = basicSetSimpleParent(newSimpleParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__SIMPLE_PARENT, newSimpleParent, newSimpleParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeFeature> getSubCompositeFeatures() {
		if (subCompositeFeatures == null) {
			subCompositeFeatures = new EObjectContainmentWithInverseEList<CompositeFeature>(CompositeFeature.class, this, featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES, featuremodelsPackage.COMPOSITE_FEATURE__PARENT);
		}
		return subCompositeFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFeature getCompositeParent() {
		if (eContainerFeatureID() != featuremodelsPackage.FEATURE__COMPOSITE_PARENT) return null;
		return (CompositeFeature)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeParent(CompositeFeature newCompositeParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompositeParent, featuremodelsPackage.FEATURE__COMPOSITE_PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeParent(CompositeFeature newCompositeParent) {
		if (newCompositeParent != eInternalContainer() || (eContainerFeatureID() != featuremodelsPackage.FEATURE__COMPOSITE_PARENT && newCompositeParent != null)) {
			if (EcoreUtil.isAncestor(this, newCompositeParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompositeParent != null)
				msgs = ((InternalEObject)newCompositeParent).eInverseAdd(this, featuremodelsPackage.COMPOSITE_FEATURE__SUB_FEATURES, CompositeFeature.class, msgs);
			msgs = basicSetCompositeParent(newCompositeParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE__COMPOSITE_PARENT, newCompositeParent, newCompositeParent));
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSimpleParent((Feature)otherEnd, msgs);
			case featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubCompositeFeatures()).basicAdd(otherEnd, msgs);
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompositeParent((CompositeFeature)otherEnd, msgs);
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				return basicSetSimpleParent(null, msgs);
			case featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES:
				return ((InternalEList<?>)getSubCompositeFeatures()).basicRemove(otherEnd, msgs);
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				return basicSetCompositeParent(null, msgs);
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				return eInternalContainer().eInverseRemove(this, featuremodelsPackage.FEATURE__SUB_FEATURES, Feature.class, msgs);
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				return eInternalContainer().eInverseRemove(this, featuremodelsPackage.COMPOSITE_FEATURE__SUB_FEATURES, CompositeFeature.class, msgs);
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				return getSimpleParent();
			case featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES:
				return getSubCompositeFeatures();
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				return getCompositeParent();
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				setSimpleParent((Feature)newValue);
				return;
			case featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES:
				getSubCompositeFeatures().clear();
				getSubCompositeFeatures().addAll((Collection<? extends CompositeFeature>)newValue);
				return;
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				setCompositeParent((CompositeFeature)newValue);
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				setSimpleParent((Feature)null);
				return;
			case featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES:
				getSubCompositeFeatures().clear();
				return;
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				setCompositeParent((CompositeFeature)null);
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
			case featuremodelsPackage.FEATURE__SIMPLE_PARENT:
				return getSimpleParent() != null;
			case featuremodelsPackage.FEATURE__SUB_COMPOSITE_FEATURES:
				return subCompositeFeatures != null && !subCompositeFeatures.isEmpty();
			case featuremodelsPackage.FEATURE__COMPOSITE_PARENT:
				return getCompositeParent() != null;
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
			if(((Feature)this.eContainer).getFeatureModel() != null)
				return ((Feature)this.eContainer).getFeatureModel();
		}else if(this.eContainer instanceof CompositeFeature){
			if(((Feature)this.eContainer.eContainer()).getFeatureModel() != null)
				return ((Feature)this.eContainer.eContainer()).getFeatureModel();
		}
		return null;

	}

} //FeatureImpl
