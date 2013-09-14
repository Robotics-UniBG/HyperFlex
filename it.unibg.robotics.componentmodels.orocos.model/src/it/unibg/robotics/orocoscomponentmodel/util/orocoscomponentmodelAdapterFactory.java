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
package it.unibg.robotics.orocoscomponentmodel.util;

import it.unibg.robotics.orocoscomponentmodel.AbstractComponent;
import it.unibg.robotics.orocoscomponentmodel.CompInputPort;
import it.unibg.robotics.orocoscomponentmodel.CompOperation;
import it.unibg.robotics.orocoscomponentmodel.CompOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.CompOutputPort;
import it.unibg.robotics.orocoscomponentmodel.CompProperty;
import it.unibg.robotics.orocoscomponentmodel.Composite;
import it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy;
import it.unibg.robotics.orocoscomponentmodel.DataPort;
import it.unibg.robotics.orocoscomponentmodel.InputDataPort;
import it.unibg.robotics.orocoscomponentmodel.Operation;
import it.unibg.robotics.orocoscomponentmodel.OperationCaller;
import it.unibg.robotics.orocoscomponentmodel.OutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.PeersConnection;
import it.unibg.robotics.orocoscomponentmodel.Property;
import it.unibg.robotics.orocoscomponentmodel.TCInputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCOperation;
import it.unibg.robotics.orocoscomponentmodel.TCOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCProperty;
import it.unibg.robotics.orocoscomponentmodel.TaskContext;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage
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
			public Adapter caseSystem(it.unibg.robotics.orocoscomponentmodel.System object) {
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
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.TaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.TaskContext
	 * @generated
	 */
	public Adapter createTaskContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.TCInputDataPort <em>TC Input Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.TCInputDataPort
	 * @generated
	 */
	public Adapter createTCInputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort <em>TC Output Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort
	 * @generated
	 */
	public Adapter createTCOutputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.CompInputPort <em>Comp Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.CompInputPort
	 * @generated
	 */
	public Adapter createCompInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.CompOutputPort <em>Comp Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.CompOutputPort
	 * @generated
	 */
	public Adapter createCompOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy
	 * @generated
	 */
	public Adapter createConnectionPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.OperationCaller <em>Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.OperationCaller
	 * @generated
	 */
	public Adapter createOperationCallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.CompOperation <em>Comp Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.CompOperation
	 * @generated
	 */
	public Adapter createCompOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.TCOperation <em>TC Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.TCOperation
	 * @generated
	 */
	public Adapter createTCOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.CompOperationCaller <em>Comp Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.CompOperationCaller
	 * @generated
	 */
	public Adapter createCompOperationCallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.TCOperationCaller <em>TC Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.TCOperationCaller
	 * @generated
	 */
	public Adapter createTCOperationCallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.PeersConnection <em>Peers Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.PeersConnection
	 * @generated
	 */
	public Adapter createPeersConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.InputDataPort <em>Input Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.InputDataPort
	 * @generated
	 */
	public Adapter createInputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.OutputDataPort <em>Output Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.OutputDataPort
	 * @generated
	 */
	public Adapter createOutputDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.AbstractComponent
	 * @generated
	 */
	public Adapter createAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.TCProperty <em>TC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.TCProperty
	 * @generated
	 */
	public Adapter createTCPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.orocoscomponentmodel.CompProperty <em>Comp Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.orocoscomponentmodel.CompProperty
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
