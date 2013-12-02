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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl;

import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS New Action Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSNewActionConnectionImpl#getActionName <em>Action Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSNewActionConnectionImpl extends ROSActionConnectionImpl implements ROSNewActionConnection {
	/**
	 * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected String actionName = ACTION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSNewActionConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_NEW_ACTION_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionName(String newActionName) {
		String oldActionName = actionName;
		actionName = newActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME, oldActionName, actionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
				return getActionName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
				setActionName((String)newValue);
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
			case rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
				setActionName(ACTION_NAME_EDEFAULT);
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
			case rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
				return ACTION_NAME_EDEFAULT == null ? actionName != null : !ACTION_NAME_EDEFAULT.equals(actionName);
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
		result.append(" (actionName: ");
		result.append(actionName);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object arg0) {

		if(arg0 instanceof ROSNewActionConnectionImpl){
			ROSNewActionConnectionImpl connection = (ROSNewActionConnectionImpl)arg0;

			String nA = connection.getActionName();
			String nB = this.getActionName();

			if(super.equals(arg0) && nA == nB){
				return true;
			}else{
				return false;
			}


		}else{
			return false;
		}

	}

} //ROSNewActionConnectionImpl
