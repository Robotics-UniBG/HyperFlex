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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels.util;

import it.unibg.robotics.resolutionmodels.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodels.RMRequiredComponents;
import it.unibg.robotics.resolutionmodels.RMRequiredConnections;
import it.unibg.robotics.resolutionmodels.RMTransfConnection;
import it.unibg.robotics.resolutionmodels.RMTransfImplementation;
import it.unibg.robotics.resolutionmodels.RMTransfProperty;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.*;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage
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
			public Adapter caseROSExistingTopicConnection(ROSExistingTopicConnection object) {
				return createROSExistingTopicConnectionAdapter();
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
			public Adapter caseROSExistingServiceConnection(ROSExistingServiceConnection object) {
				return createROSExistingServiceConnectionAdapter();
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
			public Adapter caseROSExistingActionConnection(ROSExistingActionConnection object) {
				return createROSExistingActionConnectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation <em>ROS Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation
	 * @generated
	 */
	public Adapter createROSTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty <em>ROS Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty
	 * @generated
	 */
	public Adapter createROSTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection <em>ROS Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection
	 * @generated
	 */
	public Adapter createROSTransfConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection <em>ROS Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSAbstractConnection
	 * @generated
	 */
	public Adapter createROSAbstractConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection <em>ROS Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection
	 * @generated
	 */
	public Adapter createROSTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection <em>ROS New Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection
	 * @generated
	 */
	public Adapter createROSNewTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection <em>ROS Existing Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection
	 * @generated
	 */
	public Adapter createROSExistingTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection <em>ROS Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection
	 * @generated
	 */
	public Adapter createROSServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection <em>ROS New Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection
	 * @generated
	 */
	public Adapter createROSNewServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection <em>ROS Existing Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection
	 * @generated
	 */
	public Adapter createROSExistingServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection <em>ROS Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection
	 * @generated
	 */
	public Adapter createROSActionConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection <em>ROS New Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSNewActionConnection
	 * @generated
	 */
	public Adapter createROSNewActionConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection <em>ROS Existing Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection
	 * @generated
	 */
	public Adapter createROSExistingActionConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents <em>ROS Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents
	 * @generated
	 */
	public Adapter createROSRequiredComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections <em>ROS Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections
	 * @generated
	 */
	public Adapter createROSRequiredConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.RMAbstractTransformation <em>RM Abstract Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.RMAbstractTransformation
	 * @generated
	 */
	public Adapter createRMAbstractTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.RMTransfImplementation <em>RM Transf Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfImplementation
	 * @generated
	 */
	public Adapter createRMTransfImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.RMTransfProperty <em>RM Transf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfProperty
	 * @generated
	 */
	public Adapter createRMTransfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.RMTransfConnection <em>RM Transf Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.RMTransfConnection
	 * @generated
	 */
	public Adapter createRMTransfConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.RMRequiredComponents <em>RM Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.RMRequiredComponents
	 * @generated
	 */
	public Adapter createRMRequiredComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.resolutionmodels.RMRequiredConnections <em>RM Required Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.resolutionmodels.RMRequiredConnections
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

} //rosresolutionmodelsAdapterFactory
