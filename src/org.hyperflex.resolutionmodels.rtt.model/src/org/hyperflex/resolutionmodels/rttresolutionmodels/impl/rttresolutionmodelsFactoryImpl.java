/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * In collaboration with by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rttresolutionmodels.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hyperflex.resolutionmodels.rttresolutionmodels.*;

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
			rttresolutionmodelsFactory therttresolutionmodelsFactory = (rttresolutionmodelsFactory)EPackage.Registry.INSTANCE.getEFactory(rttresolutionmodelsPackage.eNS_URI);
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
			case rttresolutionmodelsPackage.OROCOS_TRANSF_IMPLEMENTATION: return createOrocosTransfImplementation();
			case rttresolutionmodelsPackage.OROCOS_TRANSF_PROPERTY: return createOrocosTransfProperty();
			case rttresolutionmodelsPackage.OROCOS_TRANSF_CONNECTION: return createOrocosTransfConnection();
			case rttresolutionmodelsPackage.OROCOS_PEERS_CONNECTION: return createOrocosPeersConnection();
			case rttresolutionmodelsPackage.OROCOS_REQUIRED_ELEMENTS: return createOrocosRequiredElements();
			case rttresolutionmodelsPackage.OROCOS_TEMPLATE_SYSTEM_MODEL: return createOrocosTemplateSystemModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosTransfImplementation createOrocosTransfImplementation() {
		OrocosTransfImplementationImpl orocosTransfImplementation = new OrocosTransfImplementationImpl();
		return orocosTransfImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosTransfProperty createOrocosTransfProperty() {
		OrocosTransfPropertyImpl orocosTransfProperty = new OrocosTransfPropertyImpl();
		return orocosTransfProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosTransfConnection createOrocosTransfConnection() {
		OrocosTransfConnectionImpl orocosTransfConnection = new OrocosTransfConnectionImpl();
		return orocosTransfConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosPeersConnection createOrocosPeersConnection() {
		OrocosPeersConnectionImpl orocosPeersConnection = new OrocosPeersConnectionImpl();
		return orocosPeersConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosRequiredElements createOrocosRequiredElements() {
		OrocosRequiredElementsImpl orocosRequiredElements = new OrocosRequiredElementsImpl();
		return orocosRequiredElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosTemplateSystemModel createOrocosTemplateSystemModel() {
		OrocosTemplateSystemModelImpl orocosTemplateSystemModel = new OrocosTemplateSystemModelImpl();
		return orocosTemplateSystemModel;
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
