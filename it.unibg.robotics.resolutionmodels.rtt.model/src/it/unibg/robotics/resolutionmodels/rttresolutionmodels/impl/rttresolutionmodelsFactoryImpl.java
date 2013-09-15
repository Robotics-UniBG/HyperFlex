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
package it.unibg.robotics.resolutionmodels.rttresolutionmodels.impl;

import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTConnection;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfConnection;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfImplementation;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfProperty;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsFactory;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

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
public class rttresolutionmodelsFactoryImpl extends EFactoryImpl implements rttresolutionmodelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static rttresolutionmodelsFactory init() {
		try {
			rttresolutionmodelsFactory therttresolutionmodelsFactory = (rttresolutionmodelsFactory)EPackage.Registry.INSTANCE.getEFactory("http://robotics.unibg.it/resolutionmodels.rtt"); 
			if (therttresolutionmodelsFactory != null) {
				return therttresolutionmodelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new rttresolutionmodelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rttresolutionmodelsFactoryImpl() {
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
			case rttresolutionmodelsPackage.RTT_TRANSF_IMPLEMENTATION: return createRTTTransfImplementation();
			case rttresolutionmodelsPackage.RTT_TRANSF_PROPERTY: return createRTTTransfProperty();
			case rttresolutionmodelsPackage.RTT_TRANSF_CONNECTION: return createRTTTransfConnection();
			case rttresolutionmodelsPackage.RTT_CONNECTION: return createRTTConnection();
			case rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS: return createRTTRequiredComponents();
			case rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS: return createRTTRequiredConnections();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTTTransfImplementation createRTTTransfImplementation() {
		RTTTransfImplementationImpl rttTransfImplementation = new RTTTransfImplementationImpl();
		return rttTransfImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTTTransfProperty createRTTTransfProperty() {
		RTTTransfPropertyImpl rttTransfProperty = new RTTTransfPropertyImpl();
		return rttTransfProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTTTransfConnection createRTTTransfConnection() {
		RTTTransfConnectionImpl rttTransfConnection = new RTTTransfConnectionImpl();
		return rttTransfConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTTConnection createRTTConnection() {
		RTTConnectionImpl rttConnection = new RTTConnectionImpl();
		return rttConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTTRequiredComponents createRTTRequiredComponents() {
		RTTRequiredComponentsImpl rttRequiredComponents = new RTTRequiredComponentsImpl();
		return rttRequiredComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTTRequiredConnections createRTTRequiredConnections() {
		RTTRequiredConnectionsImpl rttRequiredConnections = new RTTRequiredConnectionsImpl();
		return rttRequiredConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rttresolutionmodelsPackage getrttresolutionmodelsPackage() {
		return (rttresolutionmodelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static rttresolutionmodelsPackage getPackage() {
		return rttresolutionmodelsPackage.eINSTANCE;
	}

} //rttresolutionmodelsFactoryImpl
