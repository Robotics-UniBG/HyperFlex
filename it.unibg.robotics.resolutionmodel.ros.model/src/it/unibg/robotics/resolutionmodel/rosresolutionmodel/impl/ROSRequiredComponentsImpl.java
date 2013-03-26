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
package it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl;

import it.unibg.robotics.resolutionmodel.impl.RMRequiredComponentsImpl;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredComponents;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.ros.model.ros.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Required Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSRequiredComponentsImpl#getROSNodes <em>ROS Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSRequiredComponentsImpl extends RMRequiredComponentsImpl implements ROSRequiredComponents {
	/**
	 * The cached value of the '{@link #getROSNodes() <em>ROS Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROSNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rosNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSRequiredComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelPackage.Literals.ROS_REQUIRED_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getROSNodes() {
		if (rosNodes == null) {
			rosNodes = new EObjectResolvingEList<Node>(Node.class, this, rosresolutionmodelPackage.ROS_REQUIRED_COMPONENTS__ROS_NODES);
		}
		return rosNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelPackage.ROS_REQUIRED_COMPONENTS__ROS_NODES:
				return getROSNodes();
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
			case rosresolutionmodelPackage.ROS_REQUIRED_COMPONENTS__ROS_NODES:
				getROSNodes().clear();
				getROSNodes().addAll((Collection<? extends Node>)newValue);
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
			case rosresolutionmodelPackage.ROS_REQUIRED_COMPONENTS__ROS_NODES:
				getROSNodes().clear();
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
			case rosresolutionmodelPackage.ROS_REQUIRED_COMPONENTS__ROS_NODES:
				return rosNodes != null && !rosNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROSRequiredComponentsImpl
