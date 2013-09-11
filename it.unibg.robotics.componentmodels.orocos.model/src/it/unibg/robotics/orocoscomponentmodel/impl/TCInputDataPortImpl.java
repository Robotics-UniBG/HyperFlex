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

import it.unibg.robotics.orocoscomponentmodel.TCInputDataPort;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Input Data Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TCInputDataPortImpl#isEventPort <em>Event Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCInputDataPortImpl extends InputDataPortImpl implements TCInputDataPort {
	/**
	 * The default value of the '{@link #isEventPort() <em>Event Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVENT_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEventPort() <em>Event Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventPort()
	 * @generated
	 * @ordered
	 */
	protected boolean eventPort = EVENT_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCInputDataPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.TC_INPUT_DATA_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEventPort() {
		return eventPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventPort(boolean newEventPort) {
		boolean oldEventPort = eventPort;
		eventPort = newEventPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TC_INPUT_DATA_PORT__EVENT_PORT, oldEventPort, eventPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.TC_INPUT_DATA_PORT__EVENT_PORT:
				return isEventPort();
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
			case orocoscomponentmodelPackage.TC_INPUT_DATA_PORT__EVENT_PORT:
				setEventPort((Boolean)newValue);
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
			case orocoscomponentmodelPackage.TC_INPUT_DATA_PORT__EVENT_PORT:
				setEventPort(EVENT_PORT_EDEFAULT);
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
			case orocoscomponentmodelPackage.TC_INPUT_DATA_PORT__EVENT_PORT:
				return eventPort != EVENT_PORT_EDEFAULT;
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
		result.append(" (eventPort: ");
		result.append(eventPort);
		result.append(')');
		return result.toString();
	}

} //TCInputDataPortImpl
