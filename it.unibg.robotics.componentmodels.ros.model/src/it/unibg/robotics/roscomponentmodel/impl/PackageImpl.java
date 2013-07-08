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
package it.unibg.robotics.roscomponentmodel.impl;

import it.unibg.robotics.roscomponentmodel.AbstractComponent;
import it.unibg.robotics.roscomponentmodel.CompositeProperty;
import it.unibg.robotics.roscomponentmodel.PackageMsgConsumer;
import it.unibg.robotics.roscomponentmodel.PackageMsgProducer;
import it.unibg.robotics.roscomponentmodel.PackageSrvConsumer;
import it.unibg.robotics.roscomponentmodel.PackageSrvProducer;
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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends AbstractComponentImpl implements it.unibg.robotics.roscomponentmodel.Package {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponent> nodes;

	/**
	 * The cached value of the '{@link #getMsgProducers() <em>Msg Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMsgProducer> msgProducers;

	/**
	 * The cached value of the '{@link #getMsgConsumers() <em>Msg Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMsgConsumer> msgConsumers;

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
	protected EList<PackageSrvProducer> srvProducers;

	/**
	 * The cached value of the '{@link #getSrvConsumers() <em>Srv Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageSrvConsumer> srvConsumers;

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
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscomponentmodelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, roscomponentmodelPackage.PACKAGE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMsgProducer> getMsgProducers() {
		if (msgProducers == null) {
			msgProducers = new EObjectContainmentEList<PackageMsgProducer>(PackageMsgProducer.class, this, roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS);
		}
		return msgProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMsgConsumer> getMsgConsumers() {
		if (msgConsumers == null) {
			msgConsumers = new EObjectContainmentEList<PackageMsgConsumer>(PackageMsgConsumer.class, this, roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS);
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
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, roscomponentmodelPackage.PACKAGE__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageSrvProducer> getSrvProducers() {
		if (srvProducers == null) {
			srvProducers = new EObjectContainmentEList<PackageSrvProducer>(PackageSrvProducer.class, this, roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS);
		}
		return srvProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageSrvConsumer> getSrvConsumers() {
		if (srvConsumers == null) {
			srvConsumers = new EObjectContainmentEList<PackageSrvConsumer>(PackageSrvConsumer.class, this, roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS);
		}
		return srvConsumers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<Wire>(Wire.class, this, roscomponentmodelPackage.PACKAGE__WIRES);
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
			properties = new EObjectContainmentEList<CompositeProperty>(CompositeProperty.class, this, roscomponentmodelPackage.PACKAGE__PROPERTIES);
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
			case roscomponentmodelPackage.PACKAGE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS:
				return ((InternalEList<?>)getMsgProducers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS:
				return ((InternalEList<?>)getMsgConsumers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS:
				return ((InternalEList<?>)getSrvProducers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS:
				return ((InternalEList<?>)getSrvConsumers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.PACKAGE__PROPERTIES:
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
			case roscomponentmodelPackage.PACKAGE__NODES:
				return getNodes();
			case roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS:
				return getMsgProducers();
			case roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS:
				return getMsgConsumers();
			case roscomponentmodelPackage.PACKAGE__TOPICS:
				return getTopics();
			case roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS:
				return getSrvProducers();
			case roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS:
				return getSrvConsumers();
			case roscomponentmodelPackage.PACKAGE__NAME:
				return getName();
			case roscomponentmodelPackage.PACKAGE__WIRES:
				return getWires();
			case roscomponentmodelPackage.PACKAGE__PROPERTIES:
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
			case roscomponentmodelPackage.PACKAGE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends AbstractComponent>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS:
				getMsgProducers().clear();
				getMsgProducers().addAll((Collection<? extends PackageMsgProducer>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS:
				getMsgConsumers().clear();
				getMsgConsumers().addAll((Collection<? extends PackageMsgConsumer>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS:
				getSrvProducers().clear();
				getSrvProducers().addAll((Collection<? extends PackageSrvProducer>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS:
				getSrvConsumers().clear();
				getSrvConsumers().addAll((Collection<? extends PackageSrvConsumer>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case roscomponentmodelPackage.PACKAGE__PROPERTIES:
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
			case roscomponentmodelPackage.PACKAGE__NODES:
				getNodes().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS:
				getMsgProducers().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS:
				getMsgConsumers().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__TOPICS:
				getTopics().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS:
				getSrvProducers().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS:
				getSrvConsumers().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case roscomponentmodelPackage.PACKAGE__WIRES:
				getWires().clear();
				return;
			case roscomponentmodelPackage.PACKAGE__PROPERTIES:
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
			case roscomponentmodelPackage.PACKAGE__NODES:
				return nodes != null && !nodes.isEmpty();
			case roscomponentmodelPackage.PACKAGE__MSG_PRODUCERS:
				return msgProducers != null && !msgProducers.isEmpty();
			case roscomponentmodelPackage.PACKAGE__MSG_CONSUMERS:
				return msgConsumers != null && !msgConsumers.isEmpty();
			case roscomponentmodelPackage.PACKAGE__TOPICS:
				return topics != null && !topics.isEmpty();
			case roscomponentmodelPackage.PACKAGE__SRV_PRODUCERS:
				return srvProducers != null && !srvProducers.isEmpty();
			case roscomponentmodelPackage.PACKAGE__SRV_CONSUMERS:
				return srvConsumers != null && !srvConsumers.isEmpty();
			case roscomponentmodelPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case roscomponentmodelPackage.PACKAGE__WIRES:
				return wires != null && !wires.isEmpty();
			case roscomponentmodelPackage.PACKAGE__PROPERTIES:
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

} //PackageImpl
