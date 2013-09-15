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

import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Action Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSActionConnectionImpl#getActionServer <em>Action Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.ROSActionConnectionImpl#getActionClient <em>Action Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ROSActionConnectionImpl extends ROSAbstractConnectionImpl implements ROSActionConnection {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSActionConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_ACTION_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_SERVER, oldActionServer, actionServer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_SERVER, oldActionServer, actionServer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_CLIENT, oldActionClient, actionClient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_CLIENT, oldActionClient, actionClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_SERVER:
				if (resolve) return getActionServer();
				return basicGetActionServer();
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_CLIENT:
				if (resolve) return getActionClient();
				return basicGetActionClient();
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
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_SERVER:
				setActionServer((ActionServer)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_CLIENT:
				setActionClient((ActionClient)newValue);
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
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_SERVER:
				setActionServer((ActionServer)null);
				return;
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_CLIENT:
				setActionClient((ActionClient)null);
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
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_SERVER:
				return actionServer != null;
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION__ACTION_CLIENT:
				return actionClient != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object arg0) {
		
		if(arg0 instanceof ROSActionConnectionImpl){
			ROSActionConnectionImpl connection = (ROSActionConnectionImpl)arg0;
			
			ActionServer asA = connection.getActionServer();
			ActionServer asB = this.getActionServer();

			ActionClient acA = connection.getActionClient();
			ActionClient acB = this.getActionClient();

			if(asA == asB && acA == acB){
				return true;
			}else{
				return false;
			}
			
			
		}else{
			return false;
		}
		
	}

} //ROSActionConnectionImpl
