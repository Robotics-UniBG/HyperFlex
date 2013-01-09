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
package it.unibg.robotics.resolutionmodel.util;

import it.unibg.robotics.resolutionmodel.*;

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
 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage
 * @generated
 */
public class resolutionmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static resolutionmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resolutionmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = resolutionmodelPackage.eINSTANCE;
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
			case resolutionmodelPackage.RESOLUTION_MODEL: {
				ResolutionModel resolutionModel = (ResolutionModel)theEObject;
				T result = caseResolutionModel(resolutionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_RESOLUTION_ELEMENT: {
				RMResolutionElement rmResolutionElement = (RMResolutionElement)theEObject;
				T result = caseRMResolutionElement(rmResolutionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_ABSTRACT_TRANSFORMATION: {
				RMAbstractTransformation rmAbstractTransformation = (RMAbstractTransformation)theEObject;
				T result = caseRMAbstractTransformation(rmAbstractTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_REQUIRED_COMPONENT: {
				RMRequiredComponent rmRequiredComponent = (RMRequiredComponent)theEObject;
				T result = caseRMRequiredComponent(rmRequiredComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_REQUIRED_CONNECTION: {
				RMRequiredConnection rmRequiredConnection = (RMRequiredConnection)theEObject;
				T result = caseRMRequiredConnection(rmRequiredConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_TRANSF_IMPLEMENTATION: {
				RMTransfImplementation rmTransfImplementation = (RMTransfImplementation)theEObject;
				T result = caseRMTransfImplementation(rmTransfImplementation);
				if (result == null) result = caseRMAbstractTransformation(rmTransfImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_TRANSF_PROPERTY: {
				RMTransfProperty rmTransfProperty = (RMTransfProperty)theEObject;
				T result = caseRMTransfProperty(rmTransfProperty);
				if (result == null) result = caseRMAbstractTransformation(rmTransfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case resolutionmodelPackage.RM_TRANSF_CONNECTION: {
				RMTransfConnection rmTransfConnection = (RMTransfConnection)theEObject;
				T result = caseRMTransfConnection(rmTransfConnection);
				if (result == null) result = caseRMAbstractTransformation(rmTransfConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionModel(ResolutionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Resolution Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Resolution Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMResolutionElement(RMResolutionElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredComponent(RMRequiredComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredConnection(RMRequiredConnection object) {
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

} //resolutionmodelSwitch
