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
package it.unibg.robotics.roscomponentmodel.impl;

import it.unibg.robotics.roscomponentmodel.ArchitectureModel;
import it.unibg.robotics.roscomponentmodel.CompositeMsgInterface;
import it.unibg.robotics.roscomponentmodel.CompositeProperty;
import it.unibg.robotics.roscomponentmodel.MsgInterface;
import it.unibg.robotics.roscomponentmodel.Node;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgInterface;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.NodeProperty;
import it.unibg.robotics.roscomponentmodel.NodeSrvConsumer;
import it.unibg.robotics.roscomponentmodel.NodeSrvProducer;
import it.unibg.robotics.roscomponentmodel.PackageMsgConsumer;
import it.unibg.robotics.roscomponentmodel.PackageMsgProducer;
import it.unibg.robotics.roscomponentmodel.PackageSrvConsumer;
import it.unibg.robotics.roscomponentmodel.PackageSrvProducer;
import it.unibg.robotics.roscomponentmodel.Property;
import it.unibg.robotics.roscomponentmodel.SrvConsumer;
import it.unibg.robotics.roscomponentmodel.SrvProducer;
import it.unibg.robotics.roscomponentmodel.Topic;
import it.unibg.robotics.roscomponentmodel.Wire;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelFactory;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage;

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
public class roscomponentmodelFactoryImpl extends EFactoryImpl implements roscomponentmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static roscomponentmodelFactory init() {
		try {
			roscomponentmodelFactory theroscomponentmodelFactory = (roscomponentmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://robotics.unibg.it/componentmodels.ros"); 
			if (theroscomponentmodelFactory != null) {
				return theroscomponentmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new roscomponentmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelFactoryImpl() {
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
			case roscomponentmodelPackage.PACKAGE: return createPackage();
			case roscomponentmodelPackage.NODE: return createNode();
			case roscomponentmodelPackage.NODE_MSG_PRODUCER: return createNodeMsgProducer();
			case roscomponentmodelPackage.NODE_MSG_CONSUMER: return createNodeMsgConsumer();
			case roscomponentmodelPackage.PACKAGE_MSG_PRODUCER: return createPackageMsgProducer();
			case roscomponentmodelPackage.PACKAGE_MSG_CONSUMER: return createPackageMsgConsumer();
			case roscomponentmodelPackage.TOPIC: return createTopic();
			case roscomponentmodelPackage.PROPERTY: return createProperty();
			case roscomponentmodelPackage.SRV_PRODUCER: return createSrvProducer();
			case roscomponentmodelPackage.SRV_CONSUMER: return createSrvConsumer();
			case roscomponentmodelPackage.PACKAGE_SRV_PRODUCER: return createPackageSrvProducer();
			case roscomponentmodelPackage.NODE_SRV_PRODUCER: return createNodeSrvProducer();
			case roscomponentmodelPackage.PACKAGE_SRV_CONSUMER: return createPackageSrvConsumer();
			case roscomponentmodelPackage.NODE_SRV_CONSUMER: return createNodeSrvConsumer();
			case roscomponentmodelPackage.WIRE: return createWire();
			case roscomponentmodelPackage.ARCHITECTURE_MODEL: return createArchitectureModel();
			case roscomponentmodelPackage.MSG_INTERFACE: return createMsgInterface();
			case roscomponentmodelPackage.COMPOSITE_MSG_INTERFACE: return createCompositeMsgInterface();
			case roscomponentmodelPackage.NODE_MSG_INTERFACE: return createNodeMsgInterface();
			case roscomponentmodelPackage.NODE_PROPERTY: return createNodeProperty();
			case roscomponentmodelPackage.COMPOSITE_PROPERTY: return createCompositeProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.unibg.robotics.roscomponentmodel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMsgProducer createNodeMsgProducer() {
		NodeMsgProducerImpl nodeMsgProducer = new NodeMsgProducerImpl();
		return nodeMsgProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMsgConsumer createNodeMsgConsumer() {
		NodeMsgConsumerImpl nodeMsgConsumer = new NodeMsgConsumerImpl();
		return nodeMsgConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMsgProducer createPackageMsgProducer() {
		PackageMsgProducerImpl packageMsgProducer = new PackageMsgProducerImpl();
		return packageMsgProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMsgConsumer createPackageMsgConsumer() {
		PackageMsgConsumerImpl packageMsgConsumer = new PackageMsgConsumerImpl();
		return packageMsgConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvProducer createSrvProducer() {
		SrvProducerImpl srvProducer = new SrvProducerImpl();
		return srvProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvConsumer createSrvConsumer() {
		SrvConsumerImpl srvConsumer = new SrvConsumerImpl();
		return srvConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSrvProducer createPackageSrvProducer() {
		PackageSrvProducerImpl packageSrvProducer = new PackageSrvProducerImpl();
		return packageSrvProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSrvProducer createNodeSrvProducer() {
		NodeSrvProducerImpl nodeSrvProducer = new NodeSrvProducerImpl();
		return nodeSrvProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSrvConsumer createPackageSrvConsumer() {
		PackageSrvConsumerImpl packageSrvConsumer = new PackageSrvConsumerImpl();
		return packageSrvConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSrvConsumer createNodeSrvConsumer() {
		NodeSrvConsumerImpl nodeSrvConsumer = new NodeSrvConsumerImpl();
		return nodeSrvConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureModel createArchitectureModel() {
		ArchitectureModelImpl architectureModel = new ArchitectureModelImpl();
		return architectureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgInterface createMsgInterface() {
		MsgInterfaceImpl msgInterface = new MsgInterfaceImpl();
		return msgInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMsgInterface createCompositeMsgInterface() {
		CompositeMsgInterfaceImpl compositeMsgInterface = new CompositeMsgInterfaceImpl();
		return compositeMsgInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMsgInterface createNodeMsgInterface() {
		NodeMsgInterfaceImpl nodeMsgInterface = new NodeMsgInterfaceImpl();
		return nodeMsgInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeProperty createNodeProperty() {
		NodePropertyImpl nodeProperty = new NodePropertyImpl();
		return nodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProperty createCompositeProperty() {
		CompositePropertyImpl compositeProperty = new CompositePropertyImpl();
		return compositeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelPackage getroscomponentmodelPackage() {
		return (roscomponentmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static roscomponentmodelPackage getPackage() {
		return roscomponentmodelPackage.eINSTANCE;
	}

} //roscomponentmodelFactoryImpl
