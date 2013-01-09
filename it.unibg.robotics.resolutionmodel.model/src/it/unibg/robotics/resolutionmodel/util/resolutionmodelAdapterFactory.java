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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.resolutionmodel.resolutionmodelPackage
 * @generated
 */
public class resolutionmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static resolutionmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resolutionmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = resolutionmodelPackage.eINSTANCE;
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
	protected resolutionmodelSwitch<Adapter> modelSwitch =
		new resolutionmodelSwitch<Adapter>() {
			@Override
			public Adapter caseResolutionModel(ResolutionModel object) {
				return createResolutionModelAdapter();
			}
			@Override
			public Adapter caseRMResolutionElement(RMResolutionElement object) {
				return createRMResolutionElementAdapter();
			}
			@Override
			public Adapter caseRMAbstractTransformation(RMAbstractTransformation object) {
				return createRMAbstractTransformationAdapter();
			}
			@Override
			public Adapter caseRMRequiredComponent(RMRequiredComponent object) {
				return createRMRequiredComponentAdapter();
			}
			@Override
			public Adapter caseRMRequiredConnection(RMRequiredConnection object) {
				return createRMRequiredConnectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.ResolutionModel <em>Resolution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.ResolutionModel
	 * @generated
	 */
	public Adapter createResolutionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMResolutionElement <em>RM Resolution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMResolutionElement
	 * @generated
	 */
	public Adapter createRMResolutionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMAbstractTransformation <em>RM Abstract Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMAbstractTransformation
	 * @generated
	 */
	public Adapter createRMAbstractTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMRequiredComponent <em>RM Required Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMRequiredComponent
	 * @generated
	 */
	public Adapter createRMRequiredComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMRequiredConnection <em>RM Required Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMRequiredConnection
	 * @generated
	 */
	public Adapter createRMRequiredConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMTransfImplementation <em>RM Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMTransfImplementation
	 * @generated
	 */
	public Adapter createRMTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMTransfProperty <em>RM Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMTransfProperty
	 * @generated
	 */
	public Adapter createRMTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMTransfConnection <em>RM Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMTransfConnection
	 * @generated
	 */
	public Adapter createRMTransfConnectionAdapter() {
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

} //resolutionmodelAdapterFactory
