/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.roscomponentmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getNodes <em>Nodes</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getMsgProducers <em>Msg Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getMsgConsumers <em>Msg Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getTopics <em>Topics</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getSrvProducers <em>Srv Producers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getSrvConsumers <em>Srv Consumers</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getName <em>Name</em>}</li>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.Package#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Msg Producers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.PackageMsgProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Producers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_MsgProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageMsgProducer> getMsgProducers();

	/**
	 * Returns the value of the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.PackageMsgConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Consumers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_MsgConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageMsgConsumer> getMsgConsumers();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Srv Producers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.PackageSrvProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Producers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_SrvProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageSrvProducer> getSrvProducers();

	/**
	 * Returns the value of the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.PackageSrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Consumers</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_SrvConsumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageSrvConsumer> getSrvConsumers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.roscomponentmodel.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.roscomponentmodel.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

} // Package
