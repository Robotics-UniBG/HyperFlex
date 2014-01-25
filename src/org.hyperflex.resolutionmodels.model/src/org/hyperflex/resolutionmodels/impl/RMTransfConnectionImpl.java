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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package org.hyperflex.resolutionmodels.impl;

import org.eclipse.emf.ecore.EClass;

import org.hyperflex.resolutionmodels.RMTransfConnection;
import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RM Transf Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class RMTransfConnectionImpl extends RMTransformationImpl implements RMTransfConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RMTransfConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resolutionmodelsPackage.Literals.RM_TRANSF_CONNECTION;
	}

} //RMTransfConnectionImpl