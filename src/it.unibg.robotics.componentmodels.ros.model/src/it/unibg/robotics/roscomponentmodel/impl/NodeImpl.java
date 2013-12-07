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
package it.unibg.robotics.roscomponentmodel.impl;

import it.unibg.robotics.roscomponentmodel.Node;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.NodeProperty;
import it.unibg.robotics.roscomponentmodel.NodeSrvConsumer;
import it.unibg.robotics.roscomponentmodel.NodeSrvProducer;
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
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractComponentImpl implements Node {
	/**
	 * The cached value of the '{@link #getMsgProducers() <em>Msg Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeMsgProducer> msgProducers;

	/**
	 * The cached value of the '{@link #getMsgConsumers() <em>Msg Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeMsgConsumer> msgConsumers;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeProperty> parameters;

	/**
	 * The cached value of the '{@link #getSrvProducers() <em>Srv Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSrvProducer> srvProducers;

	/**
	 * The cached value of the '{@link #getSrvConsumers() <em>Srv Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSrvConsumer> srvConsumers;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscomponentmodelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeMsgProducer> getMsgProducers() {
		if (msgProducers == null) {
			msgProducers = new EObjectContainmentEList<NodeMsgProducer>(NodeMsgProducer.class, this, roscomponentmodelPackage.NODE__MSG_PRODUCERS);
		}
		return msgProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeMsgConsumer> getMsgConsumers() {
		if (msgConsumers == null) {
			msgConsumers = new EObjectContainmentEList<NodeMsgConsumer>(NodeMsgConsumer.class, this, roscomponentmodelPackage.NODE__MSG_CONSUMERS);
		}
		return msgConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeProperty> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<NodeProperty>(NodeProperty.class, this, roscomponentmodelPackage.NODE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSrvProducer> getSrvProducers() {
		if (srvProducers == null) {
			srvProducers = new EObjectContainmentEList<NodeSrvProducer>(NodeSrvProducer.class, this, roscomponentmodelPackage.NODE__SRV_PRODUCERS);
		}
		return srvProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSrvConsumer> getSrvConsumers() {
		if (srvConsumers == null) {
			srvConsumers = new EObjectContainmentEList<NodeSrvConsumer>(NodeSrvConsumer.class, this, roscomponentmodelPackage.NODE__SRV_CONSUMERS);
		}
		return srvConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.NODE__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case roscomponentmodelPackage.NODE__MSG_PRODUCERS:
				return ((InternalEList<?>)getMsgProducers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.NODE__MSG_CONSUMERS:
				return ((InternalEList<?>)getMsgConsumers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.NODE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.NODE__SRV_PRODUCERS:
				return ((InternalEList<?>)getSrvProducers()).basicRemove(otherEnd, msgs);
			case roscomponentmodelPackage.NODE__SRV_CONSUMERS:
				return ((InternalEList<?>)getSrvConsumers()).basicRemove(otherEnd, msgs);
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
			case roscomponentmodelPackage.NODE__MSG_PRODUCERS:
				return getMsgProducers();
			case roscomponentmodelPackage.NODE__MSG_CONSUMERS:
				return getMsgConsumers();
			case roscomponentmodelPackage.NODE__PARAMETERS:
				return getParameters();
			case roscomponentmodelPackage.NODE__SRV_PRODUCERS:
				return getSrvProducers();
			case roscomponentmodelPackage.NODE__SRV_CONSUMERS:
				return getSrvConsumers();
			case roscomponentmodelPackage.NODE__PACKAGE_NAME:
				return getPackageName();
			case roscomponentmodelPackage.NODE__TYPE:
				return getType();
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
			case roscomponentmodelPackage.NODE__MSG_PRODUCERS:
				getMsgProducers().clear();
				getMsgProducers().addAll((Collection<? extends NodeMsgProducer>)newValue);
				return;
			case roscomponentmodelPackage.NODE__MSG_CONSUMERS:
				getMsgConsumers().clear();
				getMsgConsumers().addAll((Collection<? extends NodeMsgConsumer>)newValue);
				return;
			case roscomponentmodelPackage.NODE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends NodeProperty>)newValue);
				return;
			case roscomponentmodelPackage.NODE__SRV_PRODUCERS:
				getSrvProducers().clear();
				getSrvProducers().addAll((Collection<? extends NodeSrvProducer>)newValue);
				return;
			case roscomponentmodelPackage.NODE__SRV_CONSUMERS:
				getSrvConsumers().clear();
				getSrvConsumers().addAll((Collection<? extends NodeSrvConsumer>)newValue);
				return;
			case roscomponentmodelPackage.NODE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case roscomponentmodelPackage.NODE__TYPE:
				setType((String)newValue);
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
			case roscomponentmodelPackage.NODE__MSG_PRODUCERS:
				getMsgProducers().clear();
				return;
			case roscomponentmodelPackage.NODE__MSG_CONSUMERS:
				getMsgConsumers().clear();
				return;
			case roscomponentmodelPackage.NODE__PARAMETERS:
				getParameters().clear();
				return;
			case roscomponentmodelPackage.NODE__SRV_PRODUCERS:
				getSrvProducers().clear();
				return;
			case roscomponentmodelPackage.NODE__SRV_CONSUMERS:
				getSrvConsumers().clear();
				return;
			case roscomponentmodelPackage.NODE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case roscomponentmodelPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case roscomponentmodelPackage.NODE__MSG_PRODUCERS:
				return msgProducers != null && !msgProducers.isEmpty();
			case roscomponentmodelPackage.NODE__MSG_CONSUMERS:
				return msgConsumers != null && !msgConsumers.isEmpty();
			case roscomponentmodelPackage.NODE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case roscomponentmodelPackage.NODE__SRV_PRODUCERS:
				return srvProducers != null && !srvProducers.isEmpty();
			case roscomponentmodelPackage.NODE__SRV_CONSUMERS:
				return srvConsumers != null && !srvConsumers.isEmpty();
			case roscomponentmodelPackage.NODE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case roscomponentmodelPackage.NODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
