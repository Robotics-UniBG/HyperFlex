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
package it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl;

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
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelFactory;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class rosresolutionmodelFactoryImpl extends EFactoryImpl implements rosresolutionmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static rosresolutionmodelFactory init() {
		try {
			rosresolutionmodelFactory therosresolutionmodelFactory = (rosresolutionmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://robotics.unibg.it/resolutionmodel.ros"); 
			if (therosresolutionmodelFactory != null) {
				return therosresolutionmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new rosresolutionmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case rosresolutionmodelPackage.ROS_TRANSF_IMPLEMENTATION: return createROSTransfImplementation();
			case rosresolutionmodelPackage.ROS_TRANSF_PROPERTY: return createROSTransfProperty();
			case rosresolutionmodelPackage.ROS_TRANSF_CONNECTION: return createROSTransfConnection();
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION: return createROSTopicConnection();
			case rosresolutionmodelPackage.ROS_NEW_TOPIC_CONNECTION: return createROSNewTopicConnection();
			case rosresolutionmodelPackage.ROS_SERVICE_CONNECTION: return createROSServiceConnection();
			case rosresolutionmodelPackage.ROS_NEW_SERVICE_CONNECTION: return createROSNewServiceConnection();
			case rosresolutionmodelPackage.ROS_ACTION_CONNECTION: return createROSActionConnection();
			case rosresolutionmodelPackage.ROS_NEW_ACTION_CONNECTION: return createROSNewActionConnection();
			case rosresolutionmodelPackage.ROS_REQUIRED_COMPONENTS: return createROSRequiredComponents();
			case rosresolutionmodelPackage.ROS_REQUIRED_CONNECTIONS: return createROSRequiredConnections();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTransfImplementation createROSTransfImplementation() {
		ROSTransfImplementationImpl rosTransfImplementation = new ROSTransfImplementationImpl();
		return rosTransfImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTransfProperty createROSTransfProperty() {
		ROSTransfPropertyImpl rosTransfProperty = new ROSTransfPropertyImpl();
		return rosTransfProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTransfConnection createROSTransfConnection() {
		ROSTransfConnectionImpl rosTransfConnection = new ROSTransfConnectionImpl();
		return rosTransfConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTopicConnection createROSTopicConnection() {
		ROSTopicConnectionImpl rosTopicConnection = new ROSTopicConnectionImpl();
		return rosTopicConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNewTopicConnection createROSNewTopicConnection() {
		ROSNewTopicConnectionImpl rosNewTopicConnection = new ROSNewTopicConnectionImpl();
		return rosNewTopicConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSServiceConnection createROSServiceConnection() {
		ROSServiceConnectionImpl rosServiceConnection = new ROSServiceConnectionImpl();
		return rosServiceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNewServiceConnection createROSNewServiceConnection() {
		ROSNewServiceConnectionImpl rosNewServiceConnection = new ROSNewServiceConnectionImpl();
		return rosNewServiceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSActionConnection createROSActionConnection() {
		ROSActionConnectionImpl rosActionConnection = new ROSActionConnectionImpl();
		return rosActionConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNewActionConnection createROSNewActionConnection() {
		ROSNewActionConnectionImpl rosNewActionConnection = new ROSNewActionConnectionImpl();
		return rosNewActionConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSRequiredComponents createROSRequiredComponents() {
		ROSRequiredComponentsImpl rosRequiredComponents = new ROSRequiredComponentsImpl();
		return rosRequiredComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSRequiredConnections createROSRequiredConnections() {
		ROSRequiredConnectionsImpl rosRequiredConnections = new ROSRequiredConnectionsImpl();
		return rosRequiredConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelPackage getrosresolutionmodelPackage() {
		return (rosresolutionmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static rosresolutionmodelPackage getPackage() {
		return rosresolutionmodelPackage.eINSTANCE;
	}

} //rosresolutionmodelFactoryImpl
