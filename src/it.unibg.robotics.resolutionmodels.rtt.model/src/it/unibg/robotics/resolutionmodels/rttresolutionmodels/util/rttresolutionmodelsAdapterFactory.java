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
package org.hyperflex.resolutionmodels.rttresolutionmodels.util;

import org.hyperflex.resolutionmodels.RMAbstractTransformation;
import org.hyperflex.resolutionmodels.RMRequiredComponents;
import org.hyperflex.resolutionmodels.RMRequiredConnections;
import org.hyperflex.resolutionmodels.RMTransfConnection;
import org.hyperflex.resolutionmodels.RMTransfImplementation;
import org.hyperflex.resolutionmodels.RMTransfProperty;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage
 * @generated
 */
public class rttresolutionmodelsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rttresolutionmodelsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rttresolutionmodelsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = rttresolutionmodelsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected rttresolutionmodelsSwitch<Adapter> modelSwitch =
		new rttresolutionmodelsSwitch<Adapter>() {
			@Override
			public Adapter caseRTTTransfImplementation(RTTTransfImplementation object) {
				return createRTTTransfImplementationAdapter();
			}
			@Override
			public Adapter caseRTTTransfProperty(RTTTransfProperty object) {
				return createRTTTransfPropertyAdapter();
			}
			@Override
			public Adapter caseRTTTransfConnection(RTTTransfConnection object) {
				return createRTTTransfConnectionAdapter();
			}
			@Override
			public Adapter caseRTTConnection(RTTConnection object) {
				return createRTTConnectionAdapter();
			}
			@Override
			public Adapter caseRTTRequiredComponents(RTTRequiredComponents object) {
				return createRTTRequiredComponentsAdapter();
			}
			@Override
			public Adapter caseRTTRequiredConnections(RTTRequiredConnections object) {
				return createRTTRequiredConnectionsAdapter();
			}
			@Override
			public Adapter caseRMAbstractTransformation(RMAbstractTransformation object) {
				return createRMAbstractTransformationAdapter();
			}
			@Override
			public Adapter caseRMTransfImplementation(RMTransfImplementation object) {
				return createRMTransfImplementationAdapter();
			}
			@Override
			public Adapter caseRMTransfProperty(RMTransfProperty object) {
				return createRMTransfPropertyAdapter();
			}
			@Override
			public Adapter caseRMTransfConnection(RMTransfConnection object) {
				return createRMTransfConnectionAdapter();
			}
			@Override
			public Adapter caseRMRequiredComponents(RMRequiredComponents object) {
				return createRMRequiredComponentsAdapter();
			}
			@Override
			public Adapter caseRMRequiredConnections(RMRequiredConnections object) {
				return createRMRequiredConnectionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation <em>RTT Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation
	 * @generated
	 */
	public Adapter createRTTTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty <em>RTT Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty
	 * @generated
	 */
	public Adapter createRTTTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection <em>RTT Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection
	 * @generated
	 */
	public Adapter createRTTTransfConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection <em>RTT Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection
	 * @generated
	 */
	public Adapter createRTTConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents <em>RTT Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents
	 * @generated
	 */
	public Adapter createRTTRequiredComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections <em>RTT Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections
	 * @generated
	 */
	public Adapter createRTTRequiredConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMAbstractTransformation <em>RM Abstract Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMAbstractTransformation
	 * @generated
	 */
	public Adapter createRMAbstractTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMTransfImplementation <em>RM Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMTransfImplementation
	 * @generated
	 */
	public Adapter createRMTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMTransfProperty <em>RM Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMTransfProperty
	 * @generated
	 */
	public Adapter createRMTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMTransfConnection <em>RM Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMTransfConnection
	 * @generated
	 */
	public Adapter createRMTransfConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMRequiredComponents <em>RM Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMRequiredComponents
	 * @generated
	 */
	public Adapter createRMRequiredComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMRequiredConnections <em>RM Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMRequiredConnections
	 * @generated
	 */
	public Adapter createRMRequiredConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //rttresolutionmodelsAdapterFactory
