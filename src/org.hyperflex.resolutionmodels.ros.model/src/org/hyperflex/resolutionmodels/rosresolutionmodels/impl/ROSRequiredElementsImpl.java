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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.resolutionmodels.impl.RMRequiredElementsImpl;

import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.Wire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Required Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl#getRequiredNodes <em>Required Nodes</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl#getRequiredTopicConnections <em>Required Topic Connections</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSRequiredElementsImpl#getRequiredServiceConnections <em>Required Service Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSRequiredElementsImpl extends RMRequiredElementsImpl implements ROSRequiredElements {
	/**
	 * The cached value of the '{@link #getRequiredNodes() <em>Required Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> requiredNodes;

	/**
	 * The cached value of the '{@link #getRequiredTopicConnections() <em>Required Topic Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTopicConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSTopicConnection> requiredTopicConnections;

	/**
	 * The cached value of the '{@link #getRequiredServiceConnections() <em>Required Service Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServiceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> requiredServiceConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSRequiredElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_REQUIRED_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRequiredNodes() {
		if (requiredNodes == null) {
			requiredNodes = new EObjectResolvingEList<Node>(Node.class, this, rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_NODES);
		}
		return requiredNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSTopicConnection> getRequiredTopicConnections() {
		if (requiredTopicConnections == null) {
			requiredTopicConnections = new EObjectContainmentEList<ROSTopicConnection>(ROSTopicConnection.class, this, rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS);
		}
		return requiredTopicConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getRequiredServiceConnections() {
		if (requiredServiceConnections == null) {
			requiredServiceConnections = new EObjectResolvingEList<Wire>(Wire.class, this, rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS);
		}
		return requiredServiceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS:
				return ((InternalEList<?>)getRequiredTopicConnections()).basicRemove(otherEnd, msgs);
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_NODES:
				return getRequiredNodes();
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS:
				return getRequiredTopicConnections();
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS:
				return getRequiredServiceConnections();
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_NODES:
				getRequiredNodes().clear();
				getRequiredNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS:
				getRequiredTopicConnections().clear();
				getRequiredTopicConnections().addAll((Collection<? extends ROSTopicConnection>)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS:
				getRequiredServiceConnections().clear();
				getRequiredServiceConnections().addAll((Collection<? extends Wire>)newValue);
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_NODES:
				getRequiredNodes().clear();
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS:
				getRequiredTopicConnections().clear();
				return;
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS:
				getRequiredServiceConnections().clear();
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
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_NODES:
				return requiredNodes != null && !requiredNodes.isEmpty();
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_TOPIC_CONNECTIONS:
				return requiredTopicConnections != null && !requiredTopicConnections.isEmpty();
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS__REQUIRED_SERVICE_CONNECTIONS:
				return requiredServiceConnections != null && !requiredServiceConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROSRequiredElementsImpl
