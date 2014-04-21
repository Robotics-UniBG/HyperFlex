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
package org.hyperflex.resolutionmodels.rosresolutionmodels.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hyperflex.resolutionmodels.RMRequiredElements;
import org.hyperflex.resolutionmodels.RMTransfConnection;
import org.hyperflex.resolutionmodels.RMTransfImplementation;
import org.hyperflex.resolutionmodels.RMTransfProperty;
import org.hyperflex.resolutionmodels.RMTransformation;
import org.hyperflex.resolutionmodels.TemplateSystemModel;

import org.hyperflex.resolutionmodels.rosresolutionmodels.*;

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
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage
 * @generated
 */
public class rosresolutionmodelsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rosresolutionmodelsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelsSwitch() {
		if (modelPackage == null) {
			modelPackage = rosresolutionmodelsPackage.eINSTANCE;
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
			case rosresolutionmodelsPackage.ROS_TRANSF_IMPLEMENTATION: {
				ROSTransfImplementation rosTransfImplementation = (ROSTransfImplementation)theEObject;
				T result = caseROSTransfImplementation(rosTransfImplementation);
				if (result == null) result = caseRMTransfImplementation(rosTransfImplementation);
				if (result == null) result = caseRMTransformation(rosTransfImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TRANSF_PROPERTY: {
				ROSTransfProperty rosTransfProperty = (ROSTransfProperty)theEObject;
				T result = caseROSTransfProperty(rosTransfProperty);
				if (result == null) result = caseRMTransfProperty(rosTransfProperty);
				if (result == null) result = caseRMTransformation(rosTransfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TRANSF_CONNECTION: {
				ROSTransfConnection rosTransfConnection = (ROSTransfConnection)theEObject;
				T result = caseROSTransfConnection(rosTransfConnection);
				if (result == null) result = caseRMTransfConnection(rosTransfConnection);
				if (result == null) result = caseRMTransformation(rosTransfConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_CONNECTION: {
				ROSConnection rosConnection = (ROSConnection)theEObject;
				T result = caseROSConnection(rosConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION: {
				ROSTopicConnection rosTopicConnection = (ROSTopicConnection)theEObject;
				T result = caseROSTopicConnection(rosTopicConnection);
				if (result == null) result = caseROSConnection(rosTopicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_EXISTING_TOPIC_CONNECTION: {
				ROSExistingTopicConnection rosExistingTopicConnection = (ROSExistingTopicConnection)theEObject;
				T result = caseROSExistingTopicConnection(rosExistingTopicConnection);
				if (result == null) result = caseROSTopicConnection(rosExistingTopicConnection);
				if (result == null) result = caseROSConnection(rosExistingTopicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_NEW_TOPIC_CONNECTION: {
				ROSNewTopicConnection rosNewTopicConnection = (ROSNewTopicConnection)theEObject;
				T result = caseROSNewTopicConnection(rosNewTopicConnection);
				if (result == null) result = caseROSTopicConnection(rosNewTopicConnection);
				if (result == null) result = caseROSConnection(rosNewTopicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION: {
				ROSServiceConnection rosServiceConnection = (ROSServiceConnection)theEObject;
				T result = caseROSServiceConnection(rosServiceConnection);
				if (result == null) result = caseROSConnection(rosServiceConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_REQUIRED_ELEMENTS: {
				ROSRequiredElements rosRequiredElements = (ROSRequiredElements)theEObject;
				T result = caseROSRequiredElements(rosRequiredElements);
				if (result == null) result = caseRMRequiredElements(rosRequiredElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TEMPLATE_SYSTEM_MODEL: {
				ROSTemplateSystemModel rosTemplateSystemModel = (ROSTemplateSystemModel)theEObject;
				T result = caseROSTemplateSystemModel(rosTemplateSystemModel);
				if (result == null) result = caseTemplateSystemModel(rosTemplateSystemModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Transf Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSTransfImplementation(ROSTransfImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Transf Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSTransfProperty(ROSTransfProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Transf Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSTransfConnection(ROSTransfConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSConnection(ROSConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Topic Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSTopicConnection(ROSTopicConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Existing Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Existing Topic Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSExistingTopicConnection(ROSExistingTopicConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS New Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS New Topic Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSNewTopicConnection(ROSNewTopicConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Service Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSServiceConnection(ROSServiceConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Required Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Required Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSRequiredElements(ROSRequiredElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Template System Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Template System Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSTemplateSystemModel(ROSTemplateSystemModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransformation(RMTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transf Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransfImplementation(RMTransfImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transf Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransfProperty(RMTransfProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transf Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransfConnection(RMTransfConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredElements(RMRequiredElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template System Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template System Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSystemModel(TemplateSystemModel object) {
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

} //rosresolutionmodelsSwitch
