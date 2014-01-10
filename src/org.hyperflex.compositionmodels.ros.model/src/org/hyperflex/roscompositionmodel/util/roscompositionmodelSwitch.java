/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
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
package org.hyperflex.roscompositionmodel.util;

import org.hyperflex.compositionmodel.CompProvidedInterf;
import org.hyperflex.compositionmodel.CompRequiredInterf;
import org.hyperflex.compositionmodel.Composite;
import org.hyperflex.compositionmodel.Connection;
import org.hyperflex.compositionmodel.Interface;
import org.hyperflex.compositionmodel.Property;
import org.hyperflex.compositionmodel.ProvidedInterface;
import org.hyperflex.compositionmodel.RequiredInterface;

import org.hyperflex.roscompositionmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage
 * @generated
 */
public class roscompositionmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static roscompositionmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscompositionmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = roscompositionmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case roscompositionmodelPackage.ROS_COMPOSITE: {
				ROSComposite rosComposite = (ROSComposite)theEObject;
				T result = caseROSComposite(rosComposite);
				if (result == null) result = caseComposite(rosComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscompositionmodelPackage.ROS_MSG_PRODUCER: {
				ROSMsgProducer rosMsgProducer = (ROSMsgProducer)theEObject;
				T result = caseROSMsgProducer(rosMsgProducer);
				if (result == null) result = caseCompProvidedInterf(rosMsgProducer);
				if (result == null) result = caseProvidedInterface(rosMsgProducer);
				if (result == null) result = caseInterface(rosMsgProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscompositionmodelPackage.ROS_MSG_CONSUMER: {
				ROSMsgConsumer rosMsgConsumer = (ROSMsgConsumer)theEObject;
				T result = caseROSMsgConsumer(rosMsgConsumer);
				if (result == null) result = caseCompRequiredInterf(rosMsgConsumer);
				if (result == null) result = caseRequiredInterface(rosMsgConsumer);
				if (result == null) result = caseInterface(rosMsgConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscompositionmodelPackage.ROS_SRV_PRODUCER: {
				ROSSrvProducer rosSrvProducer = (ROSSrvProducer)theEObject;
				T result = caseROSSrvProducer(rosSrvProducer);
				if (result == null) result = caseCompProvidedInterf(rosSrvProducer);
				if (result == null) result = caseProvidedInterface(rosSrvProducer);
				if (result == null) result = caseInterface(rosSrvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscompositionmodelPackage.ROS_SRV_CONSUMER: {
				ROSSrvConsumer rosSrvConsumer = (ROSSrvConsumer)theEObject;
				T result = caseROSSrvConsumer(rosSrvConsumer);
				if (result == null) result = caseCompRequiredInterf(rosSrvConsumer);
				if (result == null) result = caseRequiredInterface(rosSrvConsumer);
				if (result == null) result = caseInterface(rosSrvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscompositionmodelPackage.ROS_TOPIC: {
				RosTopic rosTopic = (RosTopic)theEObject;
				T result = caseRosTopic(rosTopic);
				if (result == null) result = caseConnection(rosTopic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscompositionmodelPackage.ROS_PROPERTY: {
				ROSProperty rosProperty = (ROSProperty)theEObject;
				T result = caseROSProperty(rosProperty);
				if (result == null) result = caseProperty(rosProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSComposite(ROSComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Msg Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSMsgProducer(ROSMsgProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Msg Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSMsgConsumer(ROSMsgConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSSrvProducer(ROSSrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSSrvConsumer(ROSSrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosTopic(RosTopic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSProperty(ROSProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedInterface(ProvidedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Provided Interf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Provided Interf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompProvidedInterf(CompProvidedInterf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredInterface(RequiredInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Required Interf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Required Interf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompRequiredInterf(CompRequiredInterf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //roscompositionmodelSwitch
