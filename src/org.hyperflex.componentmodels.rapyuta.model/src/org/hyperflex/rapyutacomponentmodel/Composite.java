/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getComponents <em>Components</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getSrvServers <em>Srv Servers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getSrvClients <em>Srv Clients</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getSrvConnections <em>Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.Composite#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.AbstractComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CompositePublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_Publishers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositePublisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CompositeSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_Subscribers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSubscriber> getSubscribers();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Srv Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Servers</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_SrvServers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSrvServer> getSrvServers();

	/**
	 * Returns the value of the '<em><b>Srv Clients</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Clients</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_SrvClients()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSrvClient> getSrvClients();

	/**
	 * Returns the value of the '<em><b>Srv Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Connections</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_SrvConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSrvConnection> getSrvConnections();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.rapyutacomponentmodel.CompositeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage#getComposite_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeParameter> getParameters();

} // Composite
