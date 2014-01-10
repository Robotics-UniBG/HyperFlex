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
package org.hyperflex.orocoscomponentmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.hyperflex.orocoscomponentmodel.CompInputPort;
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.CompOutputPort;
import org.hyperflex.orocoscomponentmodel.CompProperty;
import org.hyperflex.orocoscomponentmodel.Composite;
import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.ConnectionTransport;
import org.hyperflex.orocoscomponentmodel.ConnectionType;
import org.hyperflex.orocoscomponentmodel.DataPort;
import org.hyperflex.orocoscomponentmodel.InputDataPort;
import org.hyperflex.orocoscomponentmodel.LockPolicy;
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
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelFactory;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class orocoscomponentmodelFactoryImpl extends EFactoryImpl implements orocoscomponentmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static orocoscomponentmodelFactory init() {
		try {
			orocoscomponentmodelFactory theorocoscomponentmodelFactory = (orocoscomponentmodelFactory)EPackage.Registry.INSTANCE.getEFactory(orocoscomponentmodelPackage.eNS_URI);
			if (theorocoscomponentmodelFactory != null) {
				return theorocoscomponentmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new orocoscomponentmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orocoscomponentmodelFactoryImpl() {
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
			case orocoscomponentmodelPackage.COMPOSITE: return createComposite();
			case orocoscomponentmodelPackage.TASK_CONTEXT: return createTaskContext();
			case orocoscomponentmodelPackage.TC_INPUT_DATA_PORT: return createTCInputDataPort();
			case orocoscomponentmodelPackage.TC_OUTPUT_DATA_PORT: return createTCOutputDataPort();
			case orocoscomponentmodelPackage.COMP_INPUT_PORT: return createCompInputPort();
			case orocoscomponentmodelPackage.COMP_OUTPUT_PORT: return createCompOutputPort();
			case orocoscomponentmodelPackage.CONNECTION_POLICY: return createConnectionPolicy();
			case orocoscomponentmodelPackage.PROPERTY: return createProperty();
			case orocoscomponentmodelPackage.OPERATION: return createOperation();
			case orocoscomponentmodelPackage.OPERATION_CALLER: return createOperationCaller();
			case orocoscomponentmodelPackage.COMP_OPERATION: return createCompOperation();
			case orocoscomponentmodelPackage.TC_OPERATION: return createTCOperation();
			case orocoscomponentmodelPackage.COMP_OPERATION_CALLER: return createCompOperationCaller();
			case orocoscomponentmodelPackage.TC_OPERATION_CALLER: return createTCOperationCaller();
			case orocoscomponentmodelPackage.PEERS_CONNECTION: return createPeersConnection();
			case orocoscomponentmodelPackage.SYSTEM: return createSystem();
			case orocoscomponentmodelPackage.DATA_PORT: return createDataPort();
			case orocoscomponentmodelPackage.INPUT_DATA_PORT: return createInputDataPort();
			case orocoscomponentmodelPackage.OUTPUT_DATA_PORT: return createOutputDataPort();
			case orocoscomponentmodelPackage.TC_PROPERTY: return createTCProperty();
			case orocoscomponentmodelPackage.COMP_PROPERTY: return createCompProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case orocoscomponentmodelPackage.CONNECTION_TYPE:
				return createConnectionTypeFromString(eDataType, initialValue);
			case orocoscomponentmodelPackage.CONNECTION_TRANSPORT:
				return createConnectionTransportFromString(eDataType, initialValue);
			case orocoscomponentmodelPackage.LOCK_POLICY:
				return createLockPolicyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case orocoscomponentmodelPackage.CONNECTION_TYPE:
				return convertConnectionTypeToString(eDataType, instanceValue);
			case orocoscomponentmodelPackage.CONNECTION_TRANSPORT:
				return convertConnectionTransportToString(eDataType, instanceValue);
			case orocoscomponentmodelPackage.LOCK_POLICY:
				return convertLockPolicyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskContext createTaskContext() {
		TaskContextImpl taskContext = new TaskContextImpl();
		return taskContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCInputDataPort createTCInputDataPort() {
		TCInputDataPortImpl tcInputDataPort = new TCInputDataPortImpl();
		return tcInputDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCOutputDataPort createTCOutputDataPort() {
		TCOutputDataPortImpl tcOutputDataPort = new TCOutputDataPortImpl();
		return tcOutputDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInputPort createCompInputPort() {
		CompInputPortImpl compInputPort = new CompInputPortImpl();
		return compInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOutputPort createCompOutputPort() {
		CompOutputPortImpl compOutputPort = new CompOutputPortImpl();
		return compOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPolicy createConnectionPolicy() {
		ConnectionPolicyImpl connectionPolicy = new ConnectionPolicyImpl();
		return connectionPolicy;
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
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCaller createOperationCaller() {
		OperationCallerImpl operationCaller = new OperationCallerImpl();
		return operationCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOperation createCompOperation() {
		CompOperationImpl compOperation = new CompOperationImpl();
		return compOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCOperation createTCOperation() {
		TCOperationImpl tcOperation = new TCOperationImpl();
		return tcOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOperationCaller createCompOperationCaller() {
		CompOperationCallerImpl compOperationCaller = new CompOperationCallerImpl();
		return compOperationCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCOperationCaller createTCOperationCaller() {
		TCOperationCallerImpl tcOperationCaller = new TCOperationCallerImpl();
		return tcOperationCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeersConnection createPeersConnection() {
		PeersConnectionImpl peersConnection = new PeersConnectionImpl();
		return peersConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hyperflex.orocoscomponentmodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataPort createInputDataPort() {
		InputDataPortImpl inputDataPort = new InputDataPortImpl();
		return inputDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataPort createOutputDataPort() {
		OutputDataPortImpl outputDataPort = new OutputDataPortImpl();
		return outputDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCProperty createTCProperty() {
		TCPropertyImpl tcProperty = new TCPropertyImpl();
		return tcProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompProperty createCompProperty() {
		CompPropertyImpl compProperty = new CompPropertyImpl();
		return compProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionType result = ConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTransport createConnectionTransportFromString(EDataType eDataType, String initialValue) {
		ConnectionTransport result = ConnectionTransport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTransportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockPolicy createLockPolicyFromString(EDataType eDataType, String initialValue) {
		LockPolicy result = LockPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orocoscomponentmodelPackage getorocoscomponentmodelPackage() {
		return (orocoscomponentmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static orocoscomponentmodelPackage getPackage() {
		return orocoscomponentmodelPackage.eINSTANCE;
	}

} //orocoscomponentmodelFactoryImpl
