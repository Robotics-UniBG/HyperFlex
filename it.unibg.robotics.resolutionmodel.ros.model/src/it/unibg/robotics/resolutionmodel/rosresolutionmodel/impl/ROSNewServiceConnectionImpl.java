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

import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewServiceConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS New Service Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSNewServiceConnectionImpl#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSNewServiceConnectionImpl#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSNewServiceConnectionImpl#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSNewServiceConnectionImpl extends ROSAbstractConnectionImpl implements ROSNewServiceConnection {
	/**
	 * The cached value of the '{@link #getServiceServer() <em>Service Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceServer()
	 * @generated
	 * @ordered
	 */
	protected ServiceServer serviceServer;

	/**
	 * The cached value of the '{@link #getServiceClient() <em>Service Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClient()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient serviceClient;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSNewServiceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelPackage.Literals.ROS_NEW_SERVICE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer getServiceServer() {
		if (serviceServer != null && serviceServer.eIsProxy()) {
			InternalEObject oldServiceServer = (InternalEObject)serviceServer;
			serviceServer = (ServiceServer)eResolveProxy(oldServiceServer);
			if (serviceServer != oldServiceServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER, oldServiceServer, serviceServer));
			}
		}
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer basicGetServiceServer() {
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceServer(ServiceServer newServiceServer) {
		ServiceServer oldServiceServer = serviceServer;
		serviceServer = newServiceServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER, oldServiceServer, serviceServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient getServiceClient() {
		if (serviceClient != null && serviceClient.eIsProxy()) {
			InternalEObject oldServiceClient = (InternalEObject)serviceClient;
			serviceClient = (ServiceClient)eResolveProxy(oldServiceClient);
			if (serviceClient != oldServiceClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT, oldServiceClient, serviceClient));
			}
		}
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient basicGetServiceClient() {
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClient(ServiceClient newServiceClient) {
		ServiceClient oldServiceClient = serviceClient;
		serviceClient = newServiceClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT, oldServiceClient, serviceClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER:
				if (resolve) return getServiceServer();
				return basicGetServiceServer();
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT:
				if (resolve) return getServiceClient();
				return basicGetServiceClient();
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME:
				return getServiceName();
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
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER:
				setServiceServer((ServiceServer)newValue);
				return;
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT:
				setServiceClient((ServiceClient)newValue);
				return;
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME:
				setServiceName((String)newValue);
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
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER:
				setServiceServer((ServiceServer)null);
				return;
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT:
				setServiceClient((ServiceClient)null);
				return;
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
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
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_SERVER:
				return serviceServer != null;
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_CLIENT:
				return serviceClient != null;
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
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
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object arg0) {
		
		if(arg0 instanceof ROSNewServiceConnectionImpl){
			ROSNewServiceConnectionImpl connection = (ROSNewServiceConnectionImpl)arg0;
			
			ServiceServer ssA = connection.getServiceServer();
			ServiceServer ssB = this.getServiceServer();

			ServiceClient scA = connection.getServiceClient();
			ServiceClient scB = this.getServiceClient();

			String nA = connection.getServiceName();
			String nB = this.getServiceName();

			if(ssA == ssB && scA == scB && nA == nB){
				return true;
			}else{
				return false;
			}
			
			
		}else{
			return false;
		}
		
	}

} //ROSNewServiceConnectionImpl
