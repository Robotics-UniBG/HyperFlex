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
package org.hyperflex.roscomponentmodel.util;

import org.hyperflex.roscomponentmodel.AbstractComponent;
import org.hyperflex.roscomponentmodel.Composite;
import org.hyperflex.roscomponentmodel.CompositeMsgConsumer;
import org.hyperflex.roscomponentmodel.CompositeMsgInterface;
import org.hyperflex.roscomponentmodel.CompositeMsgProducer;
import org.hyperflex.roscomponentmodel.CompositeProperty;
import org.hyperflex.roscomponentmodel.CompositeSrvConsumer;
import org.hyperflex.roscomponentmodel.CompositeSrvProducer;
import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.NodeMsgConsumer;
import org.hyperflex.roscomponentmodel.NodeMsgInterface;
import org.hyperflex.roscomponentmodel.NodeMsgProducer;
import org.hyperflex.roscomponentmodel.NodeProperty;
import org.hyperflex.roscomponentmodel.NodeSrvConsumer;
import org.hyperflex.roscomponentmodel.NodeSrvProducer;
import org.hyperflex.roscomponentmodel.Property;
import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;
import org.hyperflex.roscomponentmodel.Topic;
import org.hyperflex.roscomponentmodel.Wire;
import org.hyperflex.roscomponentmodel.roscomponentmodelPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage
 * @generated
 */
public class roscomponentmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static roscomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = roscomponentmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected roscomponentmodelSwitch<Adapter> modelSwitch =
		new roscomponentmodelSwitch<Adapter>() {
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNodeMsgProducer(NodeMsgProducer object) {
				return createNodeMsgProducerAdapter();
			}
			@Override
			public Adapter caseNodeMsgConsumer(NodeMsgConsumer object) {
				return createNodeMsgConsumerAdapter();
			}
			@Override
			public Adapter caseCompositeMsgProducer(CompositeMsgProducer object) {
				return createCompositeMsgProducerAdapter();
			}
			@Override
			public Adapter caseCompositeMsgConsumer(CompositeMsgConsumer object) {
				return createCompositeMsgConsumerAdapter();
			}
			@Override
			public Adapter caseTopic(Topic object) {
				return createTopicAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseSrvProducer(SrvProducer object) {
				return createSrvProducerAdapter();
			}
			@Override
			public Adapter caseSrvConsumer(SrvConsumer object) {
				return createSrvConsumerAdapter();
			}
			@Override
			public Adapter caseCompositeSrvProducer(CompositeSrvProducer object) {
				return createCompositeSrvProducerAdapter();
			}
			@Override
			public Adapter caseNodeSrvProducer(NodeSrvProducer object) {
				return createNodeSrvProducerAdapter();
			}
			@Override
			public Adapter caseCompositeSrvConsumer(CompositeSrvConsumer object) {
				return createCompositeSrvConsumerAdapter();
			}
			@Override
			public Adapter caseNodeSrvConsumer(NodeSrvConsumer object) {
				return createNodeSrvConsumerAdapter();
			}
			@Override
			public Adapter caseWire(Wire object) {
				return createWireAdapter();
			}
			@Override
			public Adapter caseSystem(org.hyperflex.roscomponentmodel.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseMsgInterface(MsgInterface object) {
				return createMsgInterfaceAdapter();
			}
			@Override
			public Adapter caseCompositeMsgInterface(CompositeMsgInterface object) {
				return createCompositeMsgInterfaceAdapter();
			}
			@Override
			public Adapter caseNodeMsgInterface(NodeMsgInterface object) {
				return createNodeMsgInterfaceAdapter();
			}
			@Override
			public Adapter caseAbstractComponent(AbstractComponent object) {
				return createAbstractComponentAdapter();
			}
			@Override
			public Adapter caseNodeProperty(NodeProperty object) {
				return createNodePropertyAdapter();
			}
			@Override
			public Adapter caseCompositeProperty(CompositeProperty object) {
				return createCompositePropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.NodeMsgProducer <em>Node Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgProducer
	 * @generated
	 */
	public Adapter createNodeMsgProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.NodeMsgConsumer <em>Node Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgConsumer
	 * @generated
	 */
	public Adapter createNodeMsgConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.CompositeMsgProducer <em>Composite Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgProducer
	 * @generated
	 */
	public Adapter createCompositeMsgProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.CompositeMsgConsumer <em>Composite Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgConsumer
	 * @generated
	 */
	public Adapter createCompositeMsgConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.SrvProducer <em>Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.SrvProducer
	 * @generated
	 */
	public Adapter createSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.SrvConsumer <em>Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.SrvConsumer
	 * @generated
	 */
	public Adapter createSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.CompositeSrvProducer <em>Composite Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.CompositeSrvProducer
	 * @generated
	 */
	public Adapter createCompositeSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.NodeSrvProducer <em>Node Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.NodeSrvProducer
	 * @generated
	 */
	public Adapter createNodeSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.CompositeSrvConsumer <em>Composite Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.CompositeSrvConsumer
	 * @generated
	 */
	public Adapter createCompositeSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.NodeSrvConsumer <em>Node Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.NodeSrvConsumer
	 * @generated
	 */
	public Adapter createNodeSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.MsgInterface <em>Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.MsgInterface
	 * @generated
	 */
	public Adapter createMsgInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.CompositeMsgInterface <em>Composite Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.CompositeMsgInterface
	 * @generated
	 */
	public Adapter createCompositeMsgInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.NodeMsgInterface <em>Node Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.NodeMsgInterface
	 * @generated
	 */
	public Adapter createNodeMsgInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.AbstractComponent
	 * @generated
	 */
	public Adapter createAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.NodeProperty <em>Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.NodeProperty
	 * @generated
	 */
	public Adapter createNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscomponentmodel.CompositeProperty <em>Composite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscomponentmodel.CompositeProperty
	 * @generated
	 */
	public Adapter createCompositePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //roscomponentmodelAdapterFactory
