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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSExistingTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewActionConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSNewTopicConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsFactory;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

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
public class rosresolutionmodelsFactoryImpl extends EFactoryImpl implements rosresolutionmodelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static rosresolutionmodelsFactory init() {
		try {
			rosresolutionmodelsFactory therosresolutionmodelsFactory = (rosresolutionmodelsFactory)EPackage.Registry.INSTANCE.getEFactory("http://robotics.unibg.it/resolutionmodels.ros"); 
			if (therosresolutionmodelsFactory != null) {
				return therosresolutionmodelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new rosresolutionmodelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rosresolutionmodelsFactoryImpl() {
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
			case rosresolutionmodelsPackage.ROS_TRANSF_IMPLEMENTATION: return createROSTransfImplementation();
			case rosresolutionmodelsPackage.ROS_TRANSF_PROPERTY: return createROSTransfProperty();
			case rosresolutionmodelsPackage.ROS_TRANSF_CONNECTION: return createROSTransfConnection();
			case rosresolutionmodelsPackage.ROS_NEW_TOPIC_CONNECTION: return createROSNewTopicConnection();
			case rosresolutionmodelsPackage.ROS_EXISTING_TOPIC_CONNECTION: return createROSExistingTopicConnection();
			case rosresolutionmodelsPackage.ROS_NEW_SERVICE_CONNECTION: return createROSNewServiceConnection();
			case rosresolutionmodelsPackage.ROS_EXISTING_SERVICE_CONNECTION: return createROSExistingServiceConnection();
			case rosresolutionmodelsPackage.ROS_NEW_ACTION_CONNECTION: return createROSNewActionConnection();
			case rosresolutionmodelsPackage.ROS_EXISTING_ACTION_CONNECTION: return createROSExistingActionConnection();
			case rosresolutionmodelsPackage.ROS_REQUIRED_COMPONENTS: return createROSRequiredComponents();
			case rosresolutionmodelsPackage.ROS_REQUIRED_CONNECTIONS: return createROSRequiredConnections();
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
	public ROSNewTopicConnection createROSNewTopicConnection() {
		ROSNewTopicConnectionImpl rosNewTopicConnection = new ROSNewTopicConnectionImpl();
		return rosNewTopicConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSExistingTopicConnection createROSExistingTopicConnection() {
		ROSExistingTopicConnectionImpl rosExistingTopicConnection = new ROSExistingTopicConnectionImpl();
		return rosExistingTopicConnection;
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
	public ROSExistingServiceConnection createROSExistingServiceConnection() {
		ROSExistingServiceConnectionImpl rosExistingServiceConnection = new ROSExistingServiceConnectionImpl();
		return rosExistingServiceConnection;
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
	public ROSExistingActionConnection createROSExistingActionConnection() {
		ROSExistingActionConnectionImpl rosExistingActionConnection = new ROSExistingActionConnectionImpl();
		return rosExistingActionConnection;
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
	public rosresolutionmodelsPackage getrosresolutionmodelsPackage() {
		return (rosresolutionmodelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static rosresolutionmodelsPackage getPackage() {
		return rosresolutionmodelsPackage.eINSTANCE;
	}

} //rosresolutionmodelsFactoryImpl
