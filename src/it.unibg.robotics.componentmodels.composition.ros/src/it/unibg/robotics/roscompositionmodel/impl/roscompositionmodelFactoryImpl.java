/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
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
package it.unibg.robotics.roscompositionmodel.impl;

import it.unibg.robotics.roscompositionmodel.*;

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
public class roscompositionmodelFactoryImpl extends EFactoryImpl implements roscompositionmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static roscompositionmodelFactory init() {
		try {
			roscompositionmodelFactory theroscompositionmodelFactory = (roscompositionmodelFactory)EPackage.Registry.INSTANCE.getEFactory(roscompositionmodelPackage.eNS_URI);
			if (theroscompositionmodelFactory != null) {
				return theroscompositionmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new roscompositionmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscompositionmodelFactoryImpl() {
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
			case roscompositionmodelPackage.ROS_COMPOSITE: return createROSComposite();
			case roscompositionmodelPackage.ROS_MSG_PRODUCER: return createROSMsgProducer();
			case roscompositionmodelPackage.ROS_MSG_CONSUMER: return createROSMsgConsumer();
			case roscompositionmodelPackage.ROS_SRV_PRODUCER: return createROSSrvProducer();
			case roscompositionmodelPackage.ROS_SRV_CONSUMER: return createROSSrvConsumer();
			case roscompositionmodelPackage.ROS_TOPIC: return createRosTopic();
			case roscompositionmodelPackage.ROS_PROPERTY: return createROSProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSComposite createROSComposite() {
		ROSCompositeImpl rosComposite = new ROSCompositeImpl();
		return rosComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgProducer createROSMsgProducer() {
		ROSMsgProducerImpl rosMsgProducer = new ROSMsgProducerImpl();
		return rosMsgProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgConsumer createROSMsgConsumer() {
		ROSMsgConsumerImpl rosMsgConsumer = new ROSMsgConsumerImpl();
		return rosMsgConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSSrvProducer createROSSrvProducer() {
		ROSSrvProducerImpl rosSrvProducer = new ROSSrvProducerImpl();
		return rosSrvProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSSrvConsumer createROSSrvConsumer() {
		ROSSrvConsumerImpl rosSrvConsumer = new ROSSrvConsumerImpl();
		return rosSrvConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosTopic createRosTopic() {
		RosTopicImpl rosTopic = new RosTopicImpl();
		return rosTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSProperty createROSProperty() {
		ROSPropertyImpl rosProperty = new ROSPropertyImpl();
		return rosProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscompositionmodelPackage getroscompositionmodelPackage() {
		return (roscompositionmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static roscompositionmodelPackage getPackage() {
		return roscompositionmodelPackage.eINSTANCE;
	}

} //roscompositionmodelFactoryImpl
