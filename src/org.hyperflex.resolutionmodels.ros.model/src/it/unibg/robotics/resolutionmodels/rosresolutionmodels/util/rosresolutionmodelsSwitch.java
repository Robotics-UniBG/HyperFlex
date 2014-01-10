/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
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
package org.hyperflex.resolutionmodels.rosresolutionmodels.util;

import org.hyperflex.resolutionmodels.RMAbstractTransformation;
import org.hyperflex.resolutionmodels.RMRequiredComponents;
import org.hyperflex.resolutionmodels.RMRequiredConnections;
import org.hyperflex.resolutionmodels.RMTransfConnection;
import org.hyperflex.resolutionmodels.RMTransfImplementation;
import org.hyperflex.resolutionmodels.RMTransfProperty;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSAbstractConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

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
				if (result == null) result = caseRMAbstractTransformation(rosTransfImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TRANSF_PROPERTY: {
				ROSTransfProperty rosTransfProperty = (ROSTransfProperty)theEObject;
				T result = caseROSTransfProperty(rosTransfProperty);
				if (result == null) result = caseRMTransfProperty(rosTransfProperty);
				if (result == null) result = caseRMAbstractTransformation(rosTransfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TRANSF_CONNECTION: {
				ROSTransfConnection rosTransfConnection = (ROSTransfConnection)theEObject;
				T result = caseROSTransfConnection(rosTransfConnection);
				if (result == null) result = caseRMTransfConnection(rosTransfConnection);
				if (result == null) result = caseRMAbstractTransformation(rosTransfConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_ABSTRACT_CONNECTION: {
				ROSAbstractConnection rosAbstractConnection = (ROSAbstractConnection)theEObject;
				T result = caseROSAbstractConnection(rosAbstractConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_TOPIC_CONNECTION: {
				ROSTopicConnection rosTopicConnection = (ROSTopicConnection)theEObject;
				T result = caseROSTopicConnection(rosTopicConnection);
				if (result == null) result = caseROSAbstractConnection(rosTopicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_NEW_TOPIC_CONNECTION: {
				ROSNewTopicConnection rosNewTopicConnection = (ROSNewTopicConnection)theEObject;
				T result = caseROSNewTopicConnection(rosNewTopicConnection);
				if (result == null) result = caseROSTopicConnection(rosNewTopicConnection);
				if (result == null) result = caseROSAbstractConnection(rosNewTopicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_EXISTING_TOPIC_CONNECTION: {
				ROSExistingTopicConnection rosExistingTopicConnection = (ROSExistingTopicConnection)theEObject;
				T result = caseROSExistingTopicConnection(rosExistingTopicConnection);
				if (result == null) result = caseROSTopicConnection(rosExistingTopicConnection);
				if (result == null) result = caseROSAbstractConnection(rosExistingTopicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION: {
				ROSServiceConnection rosServiceConnection = (ROSServiceConnection)theEObject;
				T result = caseROSServiceConnection(rosServiceConnection);
				if (result == null) result = caseROSAbstractConnection(rosServiceConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_NEW_SERVICE_CONNECTION: {
				ROSNewServiceConnection rosNewServiceConnection = (ROSNewServiceConnection)theEObject;
				T result = caseROSNewServiceConnection(rosNewServiceConnection);
				if (result == null) result = caseROSServiceConnection(rosNewServiceConnection);
				if (result == null) result = caseROSAbstractConnection(rosNewServiceConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_EXISTING_SERVICE_CONNECTION: {
				ROSExistingServiceConnection rosExistingServiceConnection = (ROSExistingServiceConnection)theEObject;
				T result = caseROSExistingServiceConnection(rosExistingServiceConnection);
				if (result == null) result = caseROSServiceConnection(rosExistingServiceConnection);
				if (result == null) result = caseROSAbstractConnection(rosExistingServiceConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_ACTION_CONNECTION: {
				ROSActionConnection rosActionConnection = (ROSActionConnection)theEObject;
				T result = caseROSActionConnection(rosActionConnection);
				if (result == null) result = caseROSAbstractConnection(rosActionConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION: {
				ROSNewActionConnection rosNewActionConnection = (ROSNewActionConnection)theEObject;
				T result = caseROSNewActionConnection(rosNewActionConnection);
				if (result == null) result = caseROSActionConnection(rosNewActionConnection);
				if (result == null) result = caseROSAbstractConnection(rosNewActionConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_EXISTING_ACTION_CONNECTION: {
				ROSExistingActionConnection rosExistingActionConnection = (ROSExistingActionConnection)theEObject;
				T result = caseROSExistingActionConnection(rosExistingActionConnection);
				if (result == null) result = caseROSActionConnection(rosExistingActionConnection);
				if (result == null) result = caseROSAbstractConnection(rosExistingActionConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_REQUIRED_COMPONENTS: {
				ROSRequiredComponents rosRequiredComponents = (ROSRequiredComponents)theEObject;
				T result = caseROSRequiredComponents(rosRequiredComponents);
				if (result == null) result = caseRMRequiredComponents(rosRequiredComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS: {
				ROSRequiredConnections rosRequiredConnections = (ROSRequiredConnections)theEObject;
				T result = caseROSRequiredConnections(rosRequiredConnections);
				if (result == null) result = caseRMRequiredConnections(rosRequiredConnections);
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
	 * Returns the result of interpreting the object as an instance of '<em>ROS Abstract Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Abstract Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSAbstractConnection(ROSAbstractConnection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ROS New Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS New Service Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSNewServiceConnection(ROSNewServiceConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Existing Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Existing Service Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSExistingServiceConnection(ROSExistingServiceConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Action Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSActionConnection(ROSActionConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS New Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS New Action Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSNewActionConnection(ROSNewActionConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Existing Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Existing Action Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSExistingActionConnection(ROSExistingActionConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Required Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Required Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSRequiredComponents(ROSRequiredComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Required Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Required Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSRequiredConnections(ROSRequiredConnections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Abstract Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Abstract Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMAbstractTransformation(RMAbstractTransformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredComponents(RMRequiredComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredConnections(RMRequiredConnections object) {
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
