/**
 * HyperFlex toolchain
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
package it.unibg.robotics.roscomponentmodel.impl;

import it.unibg.robotics.roscomponentmodel.AbstractComponent;
import it.unibg.robotics.roscomponentmodel.Composite;
import it.unibg.robotics.roscomponentmodel.CompositeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.CompositeMsgProducer;
import it.unibg.robotics.roscomponentmodel.CompositeProperty;
import it.unibg.robotics.roscomponentmodel.CompositeSrvConsumer;
import it.unibg.robotics.roscomponentmodel.CompositeSrvProducer;
import it.unibg.robotics.roscomponentmodel.Topic;
import it.unibg.robotics.roscomponentmodel.Wire;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.CompositeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends AbstractComponentImpl implements Composite {
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
	 * The cached value of the '{@link #getMsgProducers() <em>Msg Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeMsgProducer> msgProducers;

	/**
	 * The cached value of the '{@link #getMsgConsumers() <em>Msg Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeMsgConsumer> msgConsumers;

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
	 * The cached value of the '{@link #getSrvProducers() <em>Srv Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSrvProducer> srvProducers;

	/**
	 * The cached value of the '{@link #getSrvConsumers() <em>Srv Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSrvConsumer> srvConsumers;

	/**
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> wires;

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
		return roscomponentmodelPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, roscomponentmodelPackage.COMPOSITE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeMsgProducer> getMsgProducers() {
		if (msgProducers == null) {
			msgProducers = new EObjectContainmentEList<CompositeMsgProducer>(CompositeMsgProducer.class, this, roscomponentmodelPackage.COMPOSITE__MSG_PRODUCERS);
		}
		return msgProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeMsgConsumer> getMsgConsumers() {
		if (msgConsumers == null) {
			msgConsumers = new EObjectContainmentEList<CompositeMsgConsumer>(CompositeMsgConsumer.class, this, roscomponentmodelPackage.COMPOSITE__MSG_CONSUMERS);
		}
		return msgConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, roscomponentmodelPackage.COMPOSITE__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSrvProducer> getSrvProducers() {
		if (srvProducers == null) {
			srvProducers = new EObjectContainmentEList<CompositeSrvProducer>(CompositeSrvProducer.class, this, roscomponentmodelPackage.COMPOSITE__SRV_PRODUCERS);
		}
		return srvProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSrvConsumer> getSrvConsumers() {
		if (srvConsumers == null) {
			srvConsumers = new EObjectContainmentEList<CompositeSrvConsumer>(CompositeSrvConsumer.class, this, roscomponentmodelPackage.COMPOSITE__SRV_CONSUMERS);
		}
		return srvConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<Wire>(Wire.class, this, roscomponentmodelPackage.COMPOSITE__WIRES);
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CompositeProperty>(CompositeProperty.class, this, roscomponentmodelPackage.COMPOSITE__PROPERTIES);
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
			case roscomponentmodelPackage.COMPOSITE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__MSG_PRODUCERS:
				return ((InternalEList<?>)getMsgProducers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__MSG_CONSUMERS:
				return ((InternalEList<?>)getMsgConsumers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__SRV_PRODUCERS:
				return ((InternalEList<?>)getSrvProducers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__SRV_CONSUMERS:
				return ((InternalEList<?>)getSrvConsumers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.COMPOSITE__PROPERTIES:
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
			case roscomponentmodelPackage.COMPOSITE__COMPONENTS:
				return getComponents();
			case roscomponentmodelPackage.COMPOSITE__MSG_PRODUCERS:
				return getMsgProducers();
			case roscomponentmodelPackage.COMPOSITE__MSG_CONSUMERS:
				return getMsgConsumers();
			case roscomponentmodelPackage.COMPOSITE__TOPICS:
				return getTopics();
			case roscomponentmodelPackage.COMPOSITE__SRV_PRODUCERS:
				return getSrvProducers();
			case roscomponentmodelPackage.COMPOSITE__SRV_CONSUMERS:
				return getSrvConsumers();
			case roscomponentmodelPackage.COMPOSITE__WIRES:
				return getWires();
			case roscomponentmodelPackage.COMPOSITE__PROPERTIES:
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
			case roscomponentmodelPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends AbstractComponent>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__MSG_PRODUCERS:
				getMsgProducers().clear();
				getMsgProducers().addAll((Collection<? extends CompositeMsgProducer>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__MSG_CONSUMERS:
				getMsgConsumers().clear();
				getMsgConsumers().addAll((Collection<? extends CompositeMsgConsumer>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__SRV_PRODUCERS:
				getSrvProducers().clear();
				getSrvProducers().addAll((Collection<? extends CompositeSrvProducer>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__SRV_CONSUMERS:
				getSrvConsumers().clear();
				getSrvConsumers().addAll((Collection<? extends CompositeSrvConsumer>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case roscomponentmodelPackage.COMPOSITE__PROPERTIES:
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
			case roscomponentmodelPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__MSG_PRODUCERS:
				getMsgProducers().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__MSG_CONSUMERS:
				getMsgConsumers().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__TOPICS:
				getTopics().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__SRV_PRODUCERS:
				getSrvProducers().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__SRV_CONSUMERS:
				getSrvConsumers().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__WIRES:
				getWires().clear();
				return;
			case roscomponentmodelPackage.COMPOSITE__PROPERTIES:
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
			case roscomponentmodelPackage.COMPOSITE__COMPONENTS:
				return components != null && !components.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__MSG_PRODUCERS:
				return msgProducers != null && !msgProducers.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__MSG_CONSUMERS:
				return msgConsumers != null && !msgConsumers.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__TOPICS:
				return topics != null && !topics.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__SRV_PRODUCERS:
				return srvProducers != null && !srvProducers.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__SRV_CONSUMERS:
				return srvConsumers != null && !srvConsumers.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__WIRES:
				return wires != null && !wires.isEmpty();
			case roscomponentmodelPackage.COMPOSITE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
