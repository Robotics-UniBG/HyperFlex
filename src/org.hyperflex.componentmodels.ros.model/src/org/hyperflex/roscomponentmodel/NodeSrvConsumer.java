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
package org.hyperflex.roscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Srv Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.NodeSrvConsumer#getSrvName <em>Srv Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNodeSrvConsumer()
 * @model
 * @generated
 */
public interface NodeSrvConsumer extends SrvConsumer {
	/**
	 * Returns the value of the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Name</em>' attribute.
	 * @see #setSrvName(String)
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNodeSrvConsumer_SrvName()
	 * @model
	 * @generated
	 */
	String getSrvName();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscomponentmodel.NodeSrvConsumer#getSrvName <em>Srv Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Name</em>' attribute.
	 * @see #getSrvName()
	 * @generated
	 */
	void setSrvName(String value);

} // NodeSrvConsumer
