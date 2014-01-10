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
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Srv Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getCompositeSrvServer()
 * @model
 * @generated
 */
public interface CompositeSrvServer extends SrvServer {
	/**
	 * Returns the value of the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' reference.
	 * @see #setPromote(SrvServer)
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getCompositeSrvServer_Promote()
	 * @model
	 * @generated
	 */
	SrvServer getPromote();

	/**
	 * Sets the value of the '{@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer#getPromote <em>Promote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' reference.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(SrvServer value);

} // CompositeSrvServer
