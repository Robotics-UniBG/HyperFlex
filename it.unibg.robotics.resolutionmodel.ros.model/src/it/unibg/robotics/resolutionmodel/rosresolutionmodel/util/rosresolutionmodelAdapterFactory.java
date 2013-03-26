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
package it.unibg.robotics.resolutionmodel.rosresolutionmodel.util;

import it.unibg.robotics.resolutionmodel.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodel.RMRequiredComponents;
import it.unibg.robotics.resolutionmodel.RMRequiredConnections;
import it.unibg.robotics.resolutionmodel.RMTransfConnection;
import it.unibg.robotics.resolutionmodel.RMTransfImplementation;
import it.unibg.robotics.resolutionmodel.RMTransfProperty;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSAbstractConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewActionConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewServiceConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewTopicConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredComponents;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTopicConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfImplementation;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfProperty;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage
 * @generated
 */
public class rosresolutionmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rosresolutionmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = rosresolutionmodelPackage.eINSTANCE;
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
	protected rosresolutionmodelSwitch<Adapter> modelSwitch =
		new rosresolutionmodelSwitch<Adapter>() {
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
			public Adapter caseROSAbstractConnection(ROSAbstractConnection object) {
				return createROSAbstractConnectionAdapter();
			}
			@Override
			public Adapter caseROSTopicConnection(ROSTopicConnection object) {
				return createROSTopicConnectionAdapter();
			}
			@Override
			public Adapter caseROSNewTopicConnection(ROSNewTopicConnection object) {
				return createROSNewTopicConnectionAdapter();
			}
			@Override
			public Adapter caseROSServiceConnection(ROSServiceConnection object) {
				return createROSServiceConnectionAdapter();
			}
			@Override
			public Adapter caseROSNewServiceConnection(ROSNewServiceConnection object) {
				return createROSNewServiceConnectionAdapter();
			}
			@Override
			public Adapter caseROSActionConnection(ROSActionConnection object) {
				return createROSActionConnectionAdapter();
			}
			@Override
			public Adapter caseROSNewActionConnection(ROSNewActionConnection object) {
				return createROSNewActionConnectionAdapter();
			}
			@Override
			public Adapter caseROSRequiredComponents(ROSRequiredComponents object) {
				return createROSRequiredComponentsAdapter();
			}
			@Override
			public Adapter caseROSRequiredConnections(ROSRequiredConnections object) {
				return createROSRequiredConnectionsAdapter();
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
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfImplementation <em>ROS Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfImplementation
	 * @generated
	 */
	public Adapter createROSTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfProperty <em>ROS Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfProperty
	 * @generated
	 */
	public Adapter createROSTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfConnection <em>ROS Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfConnection
	 * @generated
	 */
	public Adapter createROSTransfConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSAbstractConnection <em>ROS Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSAbstractConnection
	 * @generated
	 */
	public Adapter createROSAbstractConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTopicConnection <em>ROS Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTopicConnection
	 * @generated
	 */
	public Adapter createROSTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewTopicConnection <em>ROS New Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewTopicConnection
	 * @generated
	 */
	public Adapter createROSNewTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection <em>ROS Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection
	 * @generated
	 */
	public Adapter createROSServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewServiceConnection <em>ROS New Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewServiceConnection
	 * @generated
	 */
	public Adapter createROSNewServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection <em>ROS Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection
	 * @generated
	 */
	public Adapter createROSActionConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewActionConnection <em>ROS New Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewActionConnection
	 * @generated
	 */
	public Adapter createROSNewActionConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredComponents <em>ROS Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredComponents
	 * @generated
	 */
	public Adapter createROSRequiredComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredConnections <em>ROS Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredConnections
	 * @generated
	 */
	public Adapter createROSRequiredConnectionsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMRequiredComponents <em>RM Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMRequiredComponents
	 * @generated
	 */
	public Adapter createRMRequiredComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodel.RMRequiredConnections <em>RM Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodel.RMRequiredConnections
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

} //rosresolutionmodelAdapterFactory
