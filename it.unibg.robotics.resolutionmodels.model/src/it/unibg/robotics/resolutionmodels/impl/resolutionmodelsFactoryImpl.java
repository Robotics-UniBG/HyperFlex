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
package it.unibg.robotics.resolutionmodels.impl;

import it.unibg.robotics.resolutionmodels.*;
import it.unibg.robotics.resolutionmodels.RMResolutionElement;
import it.unibg.robotics.resolutionmodels.ResolutionModel;
import it.unibg.robotics.resolutionmodels.resolutionmodelsFactory;
import it.unibg.robotics.resolutionmodels.resolutionmodelsPackage;

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
public class resolutionmodelsFactoryImpl extends EFactoryImpl implements resolutionmodelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static resolutionmodelsFactory init() {
		try {
			resolutionmodelsFactory theresolutionmodelsFactory = (resolutionmodelsFactory)EPackage.Registry.INSTANCE.getEFactory("http://robotics.unibg.it/resolutionmodels"); 
			if (theresolutionmodelsFactory != null) {
				return theresolutionmodelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new resolutionmodelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resolutionmodelsFactoryImpl() {
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
			case resolutionmodelsPackage.RESOLUTION_MODEL: return createResolutionModel();
			case resolutionmodelsPackage.RM_RESOLUTION_ELEMENT: return createRMResolutionElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionModel createResolutionModel() {
		ResolutionModelImpl resolutionModel = new ResolutionModelImpl();
		return resolutionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMResolutionElement createRMResolutionElement() {
		RMResolutionElementImpl rmResolutionElement = new RMResolutionElementImpl();
		return rmResolutionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resolutionmodelsPackage getresolutionmodelsPackage() {
		return (resolutionmodelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static resolutionmodelsPackage getPackage() {
		return resolutionmodelsPackage.eINSTANCE;
	}

} //resolutionmodelsFactoryImpl
