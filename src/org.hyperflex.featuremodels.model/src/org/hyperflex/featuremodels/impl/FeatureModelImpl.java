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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.featuremodels.Constraint;
import org.hyperflex.featuremodels.ContainmentAssociation;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.featuremodels.featuremodelsPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureModelImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureModelImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.FeatureModelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureModelImpl extends EObjectImpl implements FeatureModel {
	
	/**
	 * @generated NOT
	 */
	private Instance selectedInstance = null;
	/**
	 * @generated NOT
	 */
	protected transient PropertyChangeSupport listeners = new PropertyChangeSupport(this); 
	
	/**
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature rootFeature;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return featuremodelsPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRootFeature() {
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootFeature(Feature newRootFeature, NotificationChain msgs) {
		Feature oldRootFeature = rootFeature;
		rootFeature = newRootFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE, oldRootFeature, newRootFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFeature(Feature newRootFeature) {
		if (newRootFeature != rootFeature) {
			NotificationChain msgs = null;
			if (rootFeature != null)
				msgs = ((InternalEObject)rootFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE, null, msgs);
			if (newRootFeature != null)
				msgs = ((InternalEObject)newRootFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE, null, msgs);
			msgs = basicSetRootFeature(newRootFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE, newRootFeature, newRootFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, featuremodelsPackage.FEATURE_MODEL__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class, this, featuremodelsPackage.FEATURE_MODEL__INSTANCES);
		}
		return instances;
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
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.FEATURE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE:
				return basicSetRootFeature(null, msgs);
			case featuremodelsPackage.FEATURE_MODEL__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case featuremodelsPackage.FEATURE_MODEL__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE:
				return getRootFeature();
			case featuremodelsPackage.FEATURE_MODEL__CONSTRAINTS:
				return getConstraints();
			case featuremodelsPackage.FEATURE_MODEL__INSTANCES:
				return getInstances();
			case featuremodelsPackage.FEATURE_MODEL__NAME:
				return getName();
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
			case featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE:
				setRootFeature((Feature)newValue);
				return;
			case featuremodelsPackage.FEATURE_MODEL__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case featuremodelsPackage.FEATURE_MODEL__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case featuremodelsPackage.FEATURE_MODEL__NAME:
				setName((String)newValue);
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
			case featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE:
				setRootFeature((Feature)null);
				return;
			case featuremodelsPackage.FEATURE_MODEL__CONSTRAINTS:
				getConstraints().clear();
				return;
			case featuremodelsPackage.FEATURE_MODEL__INSTANCES:
				getInstances().clear();
				return;
			case featuremodelsPackage.FEATURE_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case featuremodelsPackage.FEATURE_MODEL__ROOT_FEATURE:
				return rootFeature != null;
			case featuremodelsPackage.FEATURE_MODEL__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case featuremodelsPackage.FEATURE_MODEL__INSTANCES:
				return instances != null && !instances.isEmpty();
			case featuremodelsPackage.FEATURE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

	/**
	 * @generated NOT
	 */
	public ArrayList<Feature> getAllFeatures(){
		ArrayList<Feature> list = new ArrayList<Feature>();
		Feature root = getRootFeature();
		searchSubFeatures(root, list);
		return list;
	}

	/**
	 * @generated NOT
	 */
	private void searchSubFeatures(Feature feature, ArrayList<Feature> list){
		if(feature.getSubFeatures().size()==0){
			list.add(feature);
		}else{
			EList<Feature> subFeatures = feature.getSubFeatures();
			for (Iterator<Feature> iterator = subFeatures.iterator(); iterator.hasNext();) {
				Feature subFeature = iterator.next();
				searchSubFeatures(subFeature, list);
			}
		}
		if(feature.getContainers().size()!=0){
			EList<ContainmentAssociation> containers = feature.getContainers();
			for (Iterator<ContainmentAssociation> iterator = containers.iterator(); iterator.hasNext();) {
				ContainmentAssociation container = iterator.next();
				searchSubFeatures(container, list);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	private void searchSubFeatures(ContainmentAssociation container, ArrayList<Feature> list){
		if(container.getSubFeatures().size()==0){
			return;
		}else{
			EList<Feature> subFeatures = container.getSubFeatures();
			for (Iterator<Feature> iterator = subFeatures.iterator(); iterator.hasNext();) {
				Feature subFeature = iterator.next();
				searchSubFeatures(subFeature, list);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	public ArrayList<ContainmentAssociation> getAllContainmentAssociations(){
		ArrayList<ContainmentAssociation> list = new ArrayList<ContainmentAssociation>();
		Feature root = getRootFeature();
		searchContainmentAssociations(root, list);
		return list;
	}

	/**
	 * @generated NOT
	 */
	private void searchContainmentAssociations(Feature feature, ArrayList<ContainmentAssociation> list){
		if(feature.getSubFeatures().size()!=0){
			EList<Feature> subFeatures = feature.getSubFeatures();
			for (Iterator<Feature> iterator = subFeatures.iterator(); iterator.hasNext();) {
				Feature subFeature = iterator.next();
				searchContainmentAssociations(subFeature, list);
			}
		}
		if(feature.getContainers().size()!=0){
			EList<ContainmentAssociation> containers = feature.getContainers();
			for (Iterator<ContainmentAssociation> iterator = containers.iterator(); iterator.hasNext();) {
				ContainmentAssociation container = iterator.next();
				list.add(container);
				searchContainmentAssociations(container, list);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	private void searchContainmentAssociations(ContainmentAssociation container, ArrayList<ContainmentAssociation> list){
		if(container.getSubFeatures().size()==0){
			return;
		}else{
			EList<Feature> subFeatures = container.getSubFeatures();
			for (Iterator<Feature> iterator = subFeatures.iterator(); iterator.hasNext();) {
				Feature subFeature = iterator.next();
				searchContainmentAssociations(subFeature, list);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	public ArrayList<Feature> getRequiredFeatures(){
		ArrayList<Feature> list = new ArrayList<Feature>();
		Feature root = getRootFeature();
		searchRequiredSubFeatures(root, list);
		return list;
	}

	/**
	 * @generated NOT
	 */
	private void searchRequiredSubFeatures(Feature feature, ArrayList<Feature> list){
		if(feature.getSubFeatures().size()==0 && feature.isRequired()){
			list.add(feature);
		}else{
			EList<Feature> subFeatures = feature.getSubFeatures();
			for (Iterator<Feature> iterator = subFeatures.iterator(); iterator.hasNext();) {
				Feature subFeature = iterator.next();
				searchRequiredSubFeatures(subFeature, list);
			}
		}
		if(feature.getContainers().size()!=0){
			EList<ContainmentAssociation> subCompositeFeatures = feature.getContainers();
			for (Iterator<ContainmentAssociation> iterator = subCompositeFeatures.iterator(); iterator.hasNext();) {
				ContainmentAssociation container = iterator.next();
				searchRequiredSubFeatures(container, list);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	private void searchRequiredSubFeatures(ContainmentAssociation container, ArrayList<Feature> list){
		if(container.getSubFeatures().size()==0){
			return;
		}else{
			EList<Feature> subFeatures = container.getSubFeatures();
			for (Iterator<Feature> iterator = subFeatures.iterator(); iterator.hasNext();) {
				Feature subFeature = iterator.next();
				searchRequiredSubFeatures(subFeature, list);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	public Constraint getConstraint(String name){
		Constraint c = null;
		for(Iterator<Constraint> iter = getConstraints().iterator(); iter.hasNext();){
			c = iter.next();
			if(c.getName().equals(name)){
				return c;
			}
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	public Instance getSelectedInstance() {
		return selectedInstance;
	}

	/**
	 * @generated NOT
	 */
	public void setSelectedInstance(Instance selectedInstance) {
		this.selectedInstance = selectedInstance;
		firePropertyChange(INSTANCE_SELECTED_PROPERTY,null,selectedInstance);
	}

	/**
	 * @generated NOT
	 */
	public void addPropertyChangeListener(PropertyChangeListener l){
		if (l == null) {
			throw new IllegalArgumentException();
		}
		this.listeners.addPropertyChangeListener(l);
	}
	
	/**
	 * @generated NOT
	 */
	public void removePropertyChangeListener(PropertyChangeListener l){
		this.listeners.removePropertyChangeListener(l);
	}

	/**
	 * @generated NOT
	 */
	protected void firePropertyChange(String prop, Object old, Object
			newValue){
		
		if (this.listeners.hasListeners(prop)) {
			this.listeners.firePropertyChange(prop, old, newValue);
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addFeatureToInstance(Instance instance, Feature feature) {
		if(!instances.contains(instance)){
			throw new IllegalArgumentException("The list of instances doesn't contain the instance passed as argument");
		}
		instance.getSelectedFeatures().add(feature);
		firePropertyChange(INSTANCE_UPDATED_PROPERTY, null, instance);
		
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void removeFeatureFromInstance(Instance instance, Feature feature) {
		if(!instances.contains(instance)){
			throw new IllegalArgumentException("The list of instances doesn't contain the instance passed as argument");
		}
		instance.getSelectedFeatures().remove(feature);
		firePropertyChange(INSTANCE_UPDATED_PROPERTY, null, instance);
		
	}
	
	/**
	 * @generated NOT
	 */
	public void removeSubFeatureFromInstance(Instance instance, Feature feature){
		if(!instances.contains(instance)){
			throw new IllegalArgumentException("The list of instances doesn't contain the instance passed as argument");
		}
		removeSubFeatureFromInstanceWithoutNotification(instance, feature);
		firePropertyChange(INSTANCE_UPDATED_PROPERTY, null, instance);
		
	}
	
	/**
	 * @generated NOT
	 */
	private void removeSubFeatureFromInstanceWithoutNotification(Instance instance,
			Feature feature){
		
		instance.getSelectedFeatures().remove(feature);
		
		for(Feature f : feature.getSubFeatures()){
			
			removeSubFeatureFromInstanceWithoutNotification(instance, f);
			
		}
		for(ContainmentAssociation ca : feature.getContainers()){
			
			removeSubFeatureFromInstanceWithoutNotification(instance, ca);
			
		}
		
	}
	
	/**
	 * @generated NOT
	 */
	public void removeSubFeatureFromInstance(Instance instance, 
			ContainmentAssociation containmentAssociation){
	
		if(!instances.contains(instance)){
			throw new IllegalArgumentException("The list of instances doesn't contain the instance passed as argument");
		}
		removeSubFeatureFromInstanceWithoutNotification(instance, containmentAssociation);
		firePropertyChange(INSTANCE_UPDATED_PROPERTY, null, instance);
	
	}
	
	/**
	 * @generated NOT
	 */
	private void removeSubFeatureFromInstanceWithoutNotification(Instance instance,
			ContainmentAssociation containmentAssociation){
		
		
		
		for(Feature f : containmentAssociation.getSubFeatures()){
			
			removeSubFeatureFromInstanceWithoutNotification(instance, f);
			
		}
		
	}


} //FeatureModelImpl
