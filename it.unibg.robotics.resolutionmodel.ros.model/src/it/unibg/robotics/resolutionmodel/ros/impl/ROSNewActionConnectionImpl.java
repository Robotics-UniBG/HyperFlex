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
package it.unibg.robotics.resolutionmodel.ros.impl;

import it.unibg.robotics.resolutionmodel.ros.ROSNewActionConnection;
import it.unibg.robotics.resolutionmodel.ros.rosPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ros.model.ros.ActionClient;
import org.ros.model.ros.ActionServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS New Action Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSNewActionConnectionImpl#getActionServer <em>Action Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSNewActionConnectionImpl#getActionClient <em>Action Client</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSNewActionConnectionImpl#getActionName <em>Action Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSNewActionConnectionImpl extends ROSAbstractConnectionImpl implements ROSNewActionConnection {
	/**
	 * The cached value of the '{@link #getActionServer() <em>Action Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionServer()
	 * @generated
	 * @ordered
	 */
	protected ActionServer actionServer;

	/**
	 * The cached value of the '{@link #getActionClient() <em>Action Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionClient()
	 * @generated
	 * @ordered
	 */
	protected ActionClient actionClient;

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
		return rosPackage.Literals.ROS_NEW_ACTION_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionServer getActionServer() {
		if (actionServer != null && actionServer.eIsProxy()) {
			InternalEObject oldActionServer = (InternalEObject)actionServer;
			actionServer = (ActionServer)eResolveProxy(oldActionServer);
			if (actionServer != oldActionServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_SERVER, oldActionServer, actionServer));
			}
		}
		return actionServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionServer basicGetActionServer() {
		return actionServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionServer(ActionServer newActionServer) {
		ActionServer oldActionServer = actionServer;
		actionServer = newActionServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_SERVER, oldActionServer, actionServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionClient getActionClient() {
		if (actionClient != null && actionClient.eIsProxy()) {
			InternalEObject oldActionClient = (InternalEObject)actionClient;
			actionClient = (ActionClient)eResolveProxy(oldActionClient);
			if (actionClient != oldActionClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT, oldActionClient, actionClient));
			}
		}
		return actionClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionClient basicGetActionClient() {
		return actionClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionClient(ActionClient newActionClient) {
		ActionClient oldActionClient = actionClient;
		actionClient = newActionClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT, oldActionClient, actionClient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME, oldActionName, actionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_SERVER:
				if (resolve) return getActionServer();
				return basicGetActionServer();
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT:
				if (resolve) return getActionClient();
				return basicGetActionClient();
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
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
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_SERVER:
				setActionServer((ActionServer)newValue);
				return;
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT:
				setActionClient((ActionClient)newValue);
				return;
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
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
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_SERVER:
				setActionServer((ActionServer)null);
				return;
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT:
				setActionClient((ActionClient)null);
				return;
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
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
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_SERVER:
				return actionServer != null;
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_CLIENT:
				return actionClient != null;
			case rosPackage.ROS_NEW_ACTION_CONNECTION__ACTION_NAME:
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
			
			ActionServer asA = connection.getActionServer();
			ActionServer asB = this.getActionServer();

			ActionClient acA = connection.getActionClient();
			ActionClient acB = this.getActionClient();

			String nA = connection.getActionName();
			String nB = this.getActionName();

			if(asA == asB && acA == acB && nA == nB){
				return true;
			}else{
				return false;
			}
			
			
		}else{
			return false;
		}
		
	}

} //ROSNewActionConnectionImpl
