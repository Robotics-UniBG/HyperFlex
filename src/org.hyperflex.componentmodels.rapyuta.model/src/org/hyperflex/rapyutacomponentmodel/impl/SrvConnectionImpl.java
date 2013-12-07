/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.hyperflex.rapyutacomponentmodel.SrvClient;
import org.hyperflex.rapyutacomponentmodel.SrvConnection;
import org.hyperflex.rapyutacomponentmodel.SrvServer;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Srv Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SrvConnectionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SrvConnectionImpl extends EObjectImpl implements SrvConnection {
	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected SrvServer server;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected SrvClient client;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.SRV_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvServer getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (SrvServer)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rapyutacomponentmodelPackage.SRV_CONNECTION__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvServer basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(SrvServer newServer) {
		SrvServer oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.SRV_CONNECTION__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvClient getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (SrvClient)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rapyutacomponentmodelPackage.SRV_CONNECTION__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvClient basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(SrvClient newClient) {
		SrvClient oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.SRV_CONNECTION__CLIENT, oldClient, client));
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
			eNotify(new ENotificationImpl(this, Notification.SET, rapyutacomponentmodelPackage.SRV_CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.SRV_CONNECTION__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case rapyutacomponentmodelPackage.SRV_CONNECTION__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case rapyutacomponentmodelPackage.SRV_CONNECTION__NAME:
				return getName();
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
			case rapyutacomponentmodelPackage.SRV_CONNECTION__SERVER:
				setServer((SrvServer)newValue);
				return;
			case rapyutacomponentmodelPackage.SRV_CONNECTION__CLIENT:
				setClient((SrvClient)newValue);
				return;
			case rapyutacomponentmodelPackage.SRV_CONNECTION__NAME:
				setName((String)newValue);
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
			case rapyutacomponentmodelPackage.SRV_CONNECTION__SERVER:
				setServer((SrvServer)null);
				return;
			case rapyutacomponentmodelPackage.SRV_CONNECTION__CLIENT:
				setClient((SrvClient)null);
				return;
			case rapyutacomponentmodelPackage.SRV_CONNECTION__NAME:
				setName(NAME_EDEFAULT);
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
			case rapyutacomponentmodelPackage.SRV_CONNECTION__SERVER:
				return server != null;
			case rapyutacomponentmodelPackage.SRV_CONNECTION__CLIENT:
				return client != null;
			case rapyutacomponentmodelPackage.SRV_CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SrvConnectionImpl
