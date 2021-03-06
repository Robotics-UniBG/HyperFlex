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
package org.hyperflex.compositionmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.hyperflex.compositionmodel.ArchitectureModel;
import org.hyperflex.compositionmodel.CompProvidedInterf;
import org.hyperflex.compositionmodel.CompRequiredInterf;
import org.hyperflex.compositionmodel.Composite;
import org.hyperflex.compositionmodel.CompositeProperty;
import org.hyperflex.compositionmodel.Connection;
import org.hyperflex.compositionmodel.Interface;
import org.hyperflex.compositionmodel.Property;
import org.hyperflex.compositionmodel.ProvidedInterface;
import org.hyperflex.compositionmodel.RequiredInterface;
import org.hyperflex.compositionmodel.SystemComposite;
import org.hyperflex.compositionmodel.SystemCompositeProperty;
import org.hyperflex.compositionmodel.SystemCompositeProvidedInterf;
import org.hyperflex.compositionmodel.SystemCompositeRequiredInterf;
import org.hyperflex.compositionmodel.SystemProperty;
import org.hyperflex.compositionmodel.SystemProvidedInterf;
import org.hyperflex.compositionmodel.SystemRequiredInterf;
import org.hyperflex.compositionmodel.compositionmodelPackage;

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
 * @see org.hyperflex.compositionmodel.compositionmodelPackage
 * @generated
 */
public class compositionmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static compositionmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compositionmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = compositionmodelPackage.eINSTANCE;
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
			case compositionmodelPackage.SYSTEM: {
				org.hyperflex.compositionmodel.System system = (org.hyperflex.compositionmodel.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.COMP_PROVIDED_INTERF: {
				CompProvidedInterf compProvidedInterf = (CompProvidedInterf)theEObject;
				T result = caseCompProvidedInterf(compProvidedInterf);
				if (result == null) result = caseProvidedInterface(compProvidedInterf);
				if (result == null) result = caseInterface(compProvidedInterf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.COMP_REQUIRED_INTERF: {
				CompRequiredInterf compRequiredInterf = (CompRequiredInterf)theEObject;
				T result = caseCompRequiredInterf(compRequiredInterf);
				if (result == null) result = caseRequiredInterface(compRequiredInterf);
				if (result == null) result = caseInterface(compRequiredInterf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.ARCHITECTURE_MODEL: {
				ArchitectureModel architectureModel = (ArchitectureModel)theEObject;
				T result = caseArchitectureModel(architectureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_COMPOSITE: {
				SystemComposite systemComposite = (SystemComposite)theEObject;
				T result = caseSystemComposite(systemComposite);
				if (result == null) result = caseComposite(systemComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_PROVIDED_INTERF: {
				SystemProvidedInterf systemProvidedInterf = (SystemProvidedInterf)theEObject;
				T result = caseSystemProvidedInterf(systemProvidedInterf);
				if (result == null) result = caseProvidedInterface(systemProvidedInterf);
				if (result == null) result = caseInterface(systemProvidedInterf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_REQUIRED_INTERF: {
				SystemRequiredInterf systemRequiredInterf = (SystemRequiredInterf)theEObject;
				T result = caseSystemRequiredInterf(systemRequiredInterf);
				if (result == null) result = caseRequiredInterface(systemRequiredInterf);
				if (result == null) result = caseInterface(systemRequiredInterf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.PROVIDED_INTERFACE: {
				ProvidedInterface providedInterface = (ProvidedInterface)theEObject;
				T result = caseProvidedInterface(providedInterface);
				if (result == null) result = caseInterface(providedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.REQUIRED_INTERFACE: {
				RequiredInterface requiredInterface = (RequiredInterface)theEObject;
				T result = caseRequiredInterface(requiredInterface);
				if (result == null) result = caseInterface(requiredInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.COMPOSITE_PROPERTY: {
				CompositeProperty compositeProperty = (CompositeProperty)theEObject;
				T result = caseCompositeProperty(compositeProperty);
				if (result == null) result = caseProperty(compositeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_COMPOSITE_PROVIDED_INTERF: {
				SystemCompositeProvidedInterf systemCompositeProvidedInterf = (SystemCompositeProvidedInterf)theEObject;
				T result = caseSystemCompositeProvidedInterf(systemCompositeProvidedInterf);
				if (result == null) result = caseCompProvidedInterf(systemCompositeProvidedInterf);
				if (result == null) result = caseProvidedInterface(systemCompositeProvidedInterf);
				if (result == null) result = caseInterface(systemCompositeProvidedInterf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_COMPOSITE_REQUIRED_INTERF: {
				SystemCompositeRequiredInterf systemCompositeRequiredInterf = (SystemCompositeRequiredInterf)theEObject;
				T result = caseSystemCompositeRequiredInterf(systemCompositeRequiredInterf);
				if (result == null) result = caseCompRequiredInterf(systemCompositeRequiredInterf);
				if (result == null) result = caseRequiredInterface(systemCompositeRequiredInterf);
				if (result == null) result = caseInterface(systemCompositeRequiredInterf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_PROPERTY: {
				SystemProperty systemProperty = (SystemProperty)theEObject;
				T result = caseSystemProperty(systemProperty);
				if (result == null) result = caseProperty(systemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case compositionmodelPackage.SYSTEM_COMPOSITE_PROPERTY: {
				SystemCompositeProperty systemCompositeProperty = (SystemCompositeProperty)theEObject;
				T result = caseSystemCompositeProperty(systemCompositeProperty);
				if (result == null) result = caseCompositeProperty(systemCompositeProperty);
				if (result == null) result = caseProperty(systemCompositeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.hyperflex.compositionmodel.System object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureModel(ArchitectureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComposite(SystemComposite object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>System Provided Interf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Provided Interf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemProvidedInterf(SystemProvidedInterf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Required Interf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Required Interf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRequiredInterf(SystemRequiredInterf object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Composite Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeProperty(CompositeProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>System Composite Provided Interf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Composite Provided Interf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemCompositeProvidedInterf(SystemCompositeProvidedInterf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Composite Required Interf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Composite Required Interf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemCompositeRequiredInterf(SystemCompositeRequiredInterf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemProperty(SystemProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Composite Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Composite Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemCompositeProperty(SystemCompositeProperty object) {
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

} //compositionmodelSwitch
