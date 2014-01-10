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
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.hyperflex.rapyutacomponentmodel.RobotEndPoint;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.RobotEndPointImpl#getRobotID <em>Robot ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RobotEndPointImpl extends EndPointImpl implements RobotEndPoint {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getRobotID() <em>Robot ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROBOT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRobotID() <em>Robot ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotID()
	 * @generated
	 * @ordered
	 */
	protected String robotID = ROBOT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.ROBOT_END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.ROBOT_END_POINT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.ROBOT_END_POINT__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.ROBOT_END_POINT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRobotID() {
		return robotID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobotID(String newRobotID) {
		String oldRobotID = robotID;
		robotID = newRobotID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.ROBOT_END_POINT__ROBOT_ID, oldRobotID, robotID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__URL:
				return getUrl();
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__USER_ID:
				return getUserID();
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__PASSWORD:
				return getPassword();
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__ROBOT_ID:
				return getRobotID();
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
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__URL:
				setUrl((String)newValue);
				return;
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__USER_ID:
				setUserID((String)newValue);
				return;
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__PASSWORD:
				setPassword((String)newValue);
				return;
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__ROBOT_ID:
				setRobotID((String)newValue);
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
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__ROBOT_ID:
				setRobotID(ROBOT_ID_EDEFAULT);
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
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case rapyutacomponentmodelPackage.ROBOT_END_POINT__ROBOT_ID:
				return ROBOT_ID_EDEFAULT == null ? robotID != null : !ROBOT_ID_EDEFAULT.equals(robotID);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", userID: ");
		result.append(userID);
		result.append(", password: ");
		result.append(password);
		result.append(", robotID: ");
		result.append(robotID);
		result.append(')');
		return result.toString();
	}

} //RobotEndPointImpl
