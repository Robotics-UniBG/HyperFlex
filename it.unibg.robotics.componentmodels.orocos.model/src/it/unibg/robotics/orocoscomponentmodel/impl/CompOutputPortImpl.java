/**
 * Variability Analysis And Resolution Plugins (VARP)
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
package it.unibg.robotics.orocoscomponentmodel.impl;

import it.unibg.robotics.orocoscomponentmodel.CompOutputPort;
import it.unibg.robotics.orocoscomponentmodel.OutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompOutputPortImpl#getExposedPort <em>Exposed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompOutputPortImpl extends OutputDataPortImpl implements CompOutputPort {
	/**
	 * The cached value of the '{@link #getExposedPort() <em>Exposed Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedPort()
	 * @generated
	 * @ordered
	 */
	protected OutputDataPort exposedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompOutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.COMP_OUTPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort getExposedPort() {
		if (exposedPort != null && exposedPort.eIsProxy()) {
			InternalEObject oldExposedPort = (InternalEObject)exposedPort;
			exposedPort = (OutputDataPort)eResolveProxy(oldExposedPort);
			if (exposedPort != oldExposedPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, orocoscomponentmodelPackage.COMP_OUTPUT_PORT__EXPOSED_PORT, oldExposedPort, exposedPort));
			}
		}
		return exposedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort basicGetExposedPort() {
		return exposedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposedPort(OutputDataPort newExposedPort) {
		OutputDataPort oldExposedPort = exposedPort;
		exposedPort = newExposedPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.COMP_OUTPUT_PORT__EXPOSED_PORT, oldExposedPort, exposedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMP_OUTPUT_PORT__EXPOSED_PORT:
				if (resolve) return getExposedPort();
				return basicGetExposedPort();
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
			case orocoscomponentmodelPackage.COMP_OUTPUT_PORT__EXPOSED_PORT:
				setExposedPort((OutputDataPort)newValue);
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
			case orocoscomponentmodelPackage.COMP_OUTPUT_PORT__EXPOSED_PORT:
				setExposedPort((OutputDataPort)null);
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
			case orocoscomponentmodelPackage.COMP_OUTPUT_PORT__EXPOSED_PORT:
				return exposedPort != null;
		}
		return super.eIsSet(featureID);
	}

} //CompOutputPortImpl
