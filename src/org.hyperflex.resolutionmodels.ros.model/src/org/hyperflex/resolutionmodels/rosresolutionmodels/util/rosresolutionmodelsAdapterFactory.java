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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hyperflex.resolutionmodels.RMRequiredElements;
import org.hyperflex.resolutionmodels.RMTransfConnection;
import org.hyperflex.resolutionmodels.RMTransfImplementation;
import org.hyperflex.resolutionmodels.RMTransfProperty;
import org.hyperflex.resolutionmodels.RMTransformation;
import org.hyperflex.resolutionmodels.TemplateSystemModel;

import org.hyperflex.resolutionmodels.rosresolutionmodels.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage
 * @generated
 */
public class rosresolutionmodelsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rosresolutionmodelsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = rosresolutionmodelsPackage.eINSTANCE;
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
	protected rosresolutionmodelsSwitch<Adapter> modelSwitch =
		new rosresolutionmodelsSwitch<Adapter>() {
			@Override
			public Adapter caseROSTransfImplementation(ROSTransfImplementation object) {
				return createROSTransfImplementationAdapter();
			}
			@Override
			public Adapter caseROSTransfProperty(ROSTransfProperty object) {
				return createROSTransfPropertyAdapter();
			}
			@Override
			public Adapter caseROSTransfConnection(ROSTransfConnection object) {
				return createROSTransfConnectionAdapter();
			}
			@Override
			public Adapter caseROSConnection(ROSConnection object) {
				return createROSConnectionAdapter();
			}
			@Override
			public Adapter caseROSTopicConnection(ROSTopicConnection object) {
				return createROSTopicConnectionAdapter();
			}
			@Override
			public Adapter caseROSServiceConnection(ROSServiceConnection object) {
				return createROSServiceConnectionAdapter();
			}
			@Override
			public Adapter caseROSRequiredElements(ROSRequiredElements object) {
				return createROSRequiredElementsAdapter();
			}
			@Override
			public Adapter caseROSTemplateSystemModel(ROSTemplateSystemModel object) {
				return createROSTemplateSystemModelAdapter();
			}
			@Override
			public Adapter caseRMTransformation(RMTransformation object) {
				return createRMTransformationAdapter();
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
			public Adapter caseRMRequiredElements(RMRequiredElements object) {
				return createRMRequiredElementsAdapter();
			}
			@Override
			public Adapter caseTemplateSystemModel(TemplateSystemModel object) {
				return createTemplateSystemModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation <em>ROS Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation
	 * @generated
	 */
	public Adapter createROSTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty <em>ROS Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty
	 * @generated
	 */
	public Adapter createROSTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection <em>ROS Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection
	 * @generated
	 */
	public Adapter createROSTransfConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection <em>ROS Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection
	 * @generated
	 */
	public Adapter createROSConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection <em>ROS Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTopicConnection
	 * @generated
	 */
	public Adapter createROSTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection <em>ROS Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection
	 * @generated
	 */
	public Adapter createROSServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements <em>ROS Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredElements
	 * @generated
	 */
	public Adapter createROSRequiredElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel <em>ROS Template System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel
	 * @generated
	 */
	public Adapter createROSTemplateSystemModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMTransformation <em>RM Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMTransformation
	 * @generated
	 */
	public Adapter createRMTransformationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.RMRequiredElements <em>RM Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.RMRequiredElements
	 * @generated
	 */
	public Adapter createRMRequiredElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.resolutionmodels.TemplateSystemModel <em>Template System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.resolutionmodels.TemplateSystemModel
	 * @generated
	 */
	public Adapter createTemplateSystemModelAdapter() {
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

} //rosresolutionmodelsAdapterFactory
