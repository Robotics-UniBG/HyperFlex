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
package it.unibg.robotics.resolutionmodel.impl;

import it.unibg.robotics.resolutionmodel.RMTransfImplementation;
import it.unibg.robotics.resolutionmodel.resolutionmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RM Transf Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMTransfImplementationImpl#getClassNamespace <em>Class Namespace</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.impl.RMTransfImplementationImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RMTransfImplementationImpl extends RMAbstractTransformationImpl implements RMTransfImplementation {
	/**
	 * The default value of the '{@link #getClassNamespace() <em>Class Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNamespace() <em>Class Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNamespace()
	 * @generated
	 * @ordered
	 */
	protected String classNamespace = CLASS_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RMTransfImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resolutionmodelPackage.Literals.RM_TRANSF_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassNamespace() {
		return classNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNamespace(String newClassNamespace) {
		String oldClassNamespace = classNamespace;
		classNamespace = newClassNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE, oldClassNamespace, classNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE:
				return getClassNamespace();
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME:
				return getClassName();
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
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE:
				setClassNamespace((String)newValue);
				return;
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME:
				setClassName((String)newValue);
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
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE:
				setClassNamespace(CLASS_NAMESPACE_EDEFAULT);
				return;
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
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
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAMESPACE:
				return CLASS_NAMESPACE_EDEFAULT == null ? classNamespace != null : !CLASS_NAMESPACE_EDEFAULT.equals(classNamespace);
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
		result.append(" (classNamespace: ");
		result.append(classNamespace);
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //RMTransfImplementationImpl
