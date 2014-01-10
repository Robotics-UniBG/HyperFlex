/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
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
package org.hyperflex.roscompositionmodel.util;

import org.hyperflex.compositionmodel.CompProvidedInterf;
import org.hyperflex.compositionmodel.CompRequiredInterf;
import org.hyperflex.compositionmodel.Composite;
import org.hyperflex.compositionmodel.Connection;
import org.hyperflex.compositionmodel.Interface;
import org.hyperflex.compositionmodel.Property;
import org.hyperflex.compositionmodel.ProvidedInterface;
import org.hyperflex.compositionmodel.RequiredInterface;

import org.hyperflex.roscompositionmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage
 * @generated
 */
public class roscompositionmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static roscompositionmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscompositionmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = roscompositionmodelPackage.eINSTANCE;
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
	protected roscompositionmodelSwitch<Adapter> modelSwitch =
		new roscompositionmodelSwitch<Adapter>() {
			@Override
			public Adapter caseROSComposite(ROSComposite object) {
				return createROSCompositeAdapter();
			}
			@Override
			public Adapter caseROSMsgProducer(ROSMsgProducer object) {
				return createROSMsgProducerAdapter();
			}
			@Override
			public Adapter caseROSMsgConsumer(ROSMsgConsumer object) {
				return createROSMsgConsumerAdapter();
			}
			@Override
			public Adapter caseROSSrvProducer(ROSSrvProducer object) {
				return createROSSrvProducerAdapter();
			}
			@Override
			public Adapter caseROSSrvConsumer(ROSSrvConsumer object) {
				return createROSSrvConsumerAdapter();
			}
			@Override
			public Adapter caseRosTopic(RosTopic object) {
				return createRosTopicAdapter();
			}
			@Override
			public Adapter caseROSProperty(ROSProperty object) {
				return createROSPropertyAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseProvidedInterface(ProvidedInterface object) {
				return createProvidedInterfaceAdapter();
			}
			@Override
			public Adapter caseCompProvidedInterf(CompProvidedInterf object) {
				return createCompProvidedInterfAdapter();
			}
			@Override
			public Adapter caseRequiredInterface(RequiredInterface object) {
				return createRequiredInterfaceAdapter();
			}
			@Override
			public Adapter caseCompRequiredInterf(CompRequiredInterf object) {
				return createCompRequiredInterfAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.ROSComposite <em>ROS Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.ROSComposite
	 * @generated
	 */
	public Adapter createROSCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.ROSMsgProducer <em>ROS Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.ROSMsgProducer
	 * @generated
	 */
	public Adapter createROSMsgProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.ROSMsgConsumer <em>ROS Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.ROSMsgConsumer
	 * @generated
	 */
	public Adapter createROSMsgConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.ROSSrvProducer <em>ROS Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.ROSSrvProducer
	 * @generated
	 */
	public Adapter createROSSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.ROSSrvConsumer <em>ROS Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.ROSSrvConsumer
	 * @generated
	 */
	public Adapter createROSSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.RosTopic <em>Ros Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.RosTopic
	 * @generated
	 */
	public Adapter createRosTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.roscompositionmodel.ROSProperty <em>ROS Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.roscompositionmodel.ROSProperty
	 * @generated
	 */
	public Adapter createROSPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.ProvidedInterface
	 * @generated
	 */
	public Adapter createProvidedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.CompProvidedInterf <em>Comp Provided Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.CompProvidedInterf
	 * @generated
	 */
	public Adapter createCompProvidedInterfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.RequiredInterface
	 * @generated
	 */
	public Adapter createRequiredInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.CompRequiredInterf <em>Comp Required Interf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.CompRequiredInterf
	 * @generated
	 */
	public Adapter createCompRequiredInterfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.compositionmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.compositionmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
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

} //roscompositionmodelAdapterFactory
