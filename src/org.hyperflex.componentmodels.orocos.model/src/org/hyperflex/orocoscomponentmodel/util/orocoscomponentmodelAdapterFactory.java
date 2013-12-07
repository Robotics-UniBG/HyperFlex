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
package org.hyperflex.orocoscomponentmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.hyperflex.orocoscomponentmodel.AbstractComponent;
import org.hyperflex.orocoscomponentmodel.CompInputPort;
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.CompOutputPort;
import org.hyperflex.orocoscomponentmodel.CompProperty;
import org.hyperflex.orocoscomponentmodel.Composite;
import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.DataPort;
import org.hyperflex.orocoscomponentmodel.InputDataPort;
import org.hyperflex.orocoscomponentmodel.Operation;
import org.hyperflex.orocoscomponentmodel.OperationCaller;
import org.hyperflex.orocoscomponentmodel.OutputDataPort;
import org.hyperflex.orocoscomponentmodel.PeersConnection;
import org.hyperflex.orocoscomponentmodel.Property;
import org.hyperflex.orocoscomponentmodel.TCInputDataPort;
import org.hyperflex.orocoscomponentmodel.TCOperation;
import org.hyperflex.orocoscomponentmodel.TCOperationCaller;
import org.hyperflex.orocoscomponentmodel.TCOutputDataPort;
import org.hyperflex.orocoscomponentmodel.TCProperty;
import org.hyperflex.orocoscomponentmodel.TaskContext;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage
 * @generated
 */
public class orocoscomponentmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static orocoscomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orocoscomponentmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = orocoscomponentmodelPackage.eINSTANCE;
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
	protected orocoscomponentmodelSwitch<Adapter> modelSwitch =
		new orocoscomponentmodelSwitch<Adapter>() {
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseTaskContext(TaskContext object) {
				return createTaskContextAdapter();
			}
			@Override
			public Adapter caseTCInputDataPort(TCInputDataPort object) {
				return createTCInputDataPortAdapter();
			}
			@Override
			public Adapter caseTCOutputDataPort(TCOutputDataPort object) {
				return createTCOutputDataPortAdapter();
			}
			@Override
			public Adapter caseCompInputPort(CompInputPort object) {
				return createCompInputPortAdapter();
			}
			@Override
			public Adapter caseCompOutputPort(CompOutputPort object) {
				return createCompOutputPortAdapter();
			}
			@Override
			public Adapter caseConnectionPolicy(ConnectionPolicy object) {
				return createConnectionPolicyAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOperationCaller(OperationCaller object) {
				return createOperationCallerAdapter();
			}
			@Override
			public Adapter caseCompOperation(CompOperation object) {
				return createCompOperationAdapter();
			}
			@Override
			public Adapter caseTCOperation(TCOperation object) {
				return createTCOperationAdapter();
			}
			@Override
			public Adapter caseCompOperationCaller(CompOperationCaller object) {
				return createCompOperationCallerAdapter();
			}
			@Override
			public Adapter caseTCOperationCaller(TCOperationCaller object) {
				return createTCOperationCallerAdapter();
			}
			@Override
			public Adapter casePeersConnection(PeersConnection object) {
				return createPeersConnectionAdapter();
			}
			@Override
			public Adapter caseSystem(org.hyperflex.orocoscomponentmodel.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseDataPort(DataPort object) {
				return createDataPortAdapter();
			}
			@Override
			public Adapter caseInputDataPort(InputDataPort object) {
				return createInputDataPortAdapter();
			}
			@Override
			public Adapter caseOutputDataPort(OutputDataPort object) {
				return createOutputDataPortAdapter();
			}
			@Override
			public Adapter caseAbstractComponent(AbstractComponent object) {
				return createAbstractComponentAdapter();
			}
			@Override
			public Adapter caseTCProperty(TCProperty object) {
				return createTCPropertyAdapter();
			}
			@Override
			public Adapter caseCompProperty(CompProperty object) {
				return createCompPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.TaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext
	 * @generated
	 */
	public Adapter createTaskContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.TCInputDataPort <em>TC Input Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.TCInputDataPort
	 * @generated
	 */
	public Adapter createTCInputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.TCOutputDataPort <em>TC Output Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.TCOutputDataPort
	 * @generated
	 */
	public Adapter createTCOutputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.CompInputPort <em>Comp Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.CompInputPort
	 * @generated
	 */
	public Adapter createCompInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.CompOutputPort <em>Comp Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.CompOutputPort
	 * @generated
	 */
	public Adapter createCompOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy
	 * @generated
	 */
	public Adapter createConnectionPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.OperationCaller <em>Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.OperationCaller
	 * @generated
	 */
	public Adapter createOperationCallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.CompOperation <em>Comp Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.CompOperation
	 * @generated
	 */
	public Adapter createCompOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.TCOperation <em>TC Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperation
	 * @generated
	 */
	public Adapter createTCOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.CompOperationCaller <em>Comp Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.CompOperationCaller
	 * @generated
	 */
	public Adapter createCompOperationCallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.TCOperationCaller <em>TC Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperationCaller
	 * @generated
	 */
	public Adapter createTCOperationCallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.PeersConnection <em>Peers Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.PeersConnection
	 * @generated
	 */
	public Adapter createPeersConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.InputDataPort <em>Input Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.InputDataPort
	 * @generated
	 */
	public Adapter createInputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.OutputDataPort <em>Output Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.OutputDataPort
	 * @generated
	 */
	public Adapter createOutputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.AbstractComponent
	 * @generated
	 */
	public Adapter createAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.TCProperty <em>TC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.TCProperty
	 * @generated
	 */
	public Adapter createTCPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hyperflex.orocoscomponentmodel.CompProperty <em>Comp Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hyperflex.orocoscomponentmodel.CompProperty
	 * @generated
	 */
	public Adapter createCompPropertyAdapter() {
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

} //orocoscomponentmodelAdapterFactory
