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
package org.hyperflex.orocoscomponentmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.hyperflex.orocoscomponentmodel.AbstractComponent;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class orocoscomponentmodelPackageImpl extends EPackageImpl implements orocoscomponentmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcInputDataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcOutputDataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compOperationCallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcOperationCallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peersConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTransportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lockPolicyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private orocoscomponentmodelPackageImpl() {
		super(eNS_URI, orocoscomponentmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link orocoscomponentmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static orocoscomponentmodelPackage init() {
		if (isInited) return (orocoscomponentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(orocoscomponentmodelPackage.eNS_URI);

		// Obtain or create and register package
		orocoscomponentmodelPackageImpl theorocoscomponentmodelPackage = (orocoscomponentmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof orocoscomponentmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new orocoscomponentmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theorocoscomponentmodelPackage.createPackageContents();

		// Initialize created meta-data
		theorocoscomponentmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theorocoscomponentmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(orocoscomponentmodelPackage.eNS_URI, theorocoscomponentmodelPackage);
		return theorocoscomponentmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Components() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_InputPorts() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_OutputPorts() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_ConnectionPolicies() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Operations() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_OperationCallers() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_PeersConnections() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Properties() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskContext() {
		return taskContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_InputPorts() {
		return (EReference)taskContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_OutputPorts() {
		return (EReference)taskContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_Properties() {
		return (EReference)taskContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_Operations() {
		return (EReference)taskContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskContext_OperationCallers() {
		return (EReference)taskContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_Namespace() {
		return (EAttribute)taskContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_ClassName() {
		return (EAttribute)taskContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_Period() {
		return (EAttribute)taskContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_Priority() {
		return (EAttribute)taskContextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_AutoStart() {
		return (EAttribute)taskContextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskContext_AutoConf() {
		return (EAttribute)taskContextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCInputDataPort() {
		return tcInputDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCInputDataPort_EventPort() {
		return (EAttribute)tcInputDataPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCOutputDataPort() {
		return tcOutputDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompInputPort() {
		return compInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInputPort_ExposedPort() {
		return (EReference)compInputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompOutputPort() {
		return compOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompOutputPort_ExposedPort() {
		return (EReference)compOutputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPolicy() {
		return connectionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_Name() {
		return (EAttribute)connectionPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPolicy_Source() {
		return (EReference)connectionPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPolicy_Target() {
		return (EReference)connectionPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_Type() {
		return (EAttribute)connectionPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_LockPolicy() {
		return (EAttribute)connectionPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_BufferSize() {
		return (EAttribute)connectionPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_Transport() {
		return (EAttribute)connectionPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPolicy_Note() {
		return (EAttribute)connectionPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCaller() {
		return operationCallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationCaller_Name() {
		return (EAttribute)operationCallerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompOperation() {
		return compOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompOperation_ExposedOp() {
		return (EReference)compOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCOperation() {
		return tcOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCOperation_SrvName() {
		return (EAttribute)tcOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCOperation_OwnThread() {
		return (EAttribute)tcOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompOperationCaller() {
		return compOperationCallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompOperationCaller_ExposedOpCaller() {
		return (EReference)compOperationCallerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCOperationCaller() {
		return tcOperationCallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCOperationCaller_SrvName() {
		return (EAttribute)tcOperationCallerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeersConnection() {
		return peersConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeersConnection_Source() {
		return (EReference)peersConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeersConnection_Target() {
		return (EReference)peersConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeersConnection_Name() {
		return (EAttribute)peersConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Composite() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPort() {
		return dataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPort_Name() {
		return (EAttribute)dataPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDataPort() {
		return inputDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDataPort() {
		return outputDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponent() {
		return abstractComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_Name() {
		return (EAttribute)abstractComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCProperty() {
		return tcPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCProperty_Value() {
		return (EAttribute)tcPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCProperty_Type() {
		return (EAttribute)tcPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompProperty() {
		return compPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompProperty_ExposedProperty() {
		return (EReference)compPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionTransport() {
		return connectionTransportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLockPolicy() {
		return lockPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orocoscomponentmodelFactory getorocoscomponentmodelFactory() {
		return (orocoscomponentmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compositeEClass = createEClass(COMPOSITE);
		createEReference(compositeEClass, COMPOSITE__COMPONENTS);
		createEReference(compositeEClass, COMPOSITE__INPUT_PORTS);
		createEReference(compositeEClass, COMPOSITE__OUTPUT_PORTS);
		createEReference(compositeEClass, COMPOSITE__CONNECTION_POLICIES);
		createEReference(compositeEClass, COMPOSITE__OPERATIONS);
		createEReference(compositeEClass, COMPOSITE__OPERATION_CALLERS);
		createEReference(compositeEClass, COMPOSITE__PEERS_CONNECTIONS);
		createEReference(compositeEClass, COMPOSITE__PROPERTIES);

		taskContextEClass = createEClass(TASK_CONTEXT);
		createEReference(taskContextEClass, TASK_CONTEXT__INPUT_PORTS);
		createEReference(taskContextEClass, TASK_CONTEXT__OUTPUT_PORTS);
		createEReference(taskContextEClass, TASK_CONTEXT__PROPERTIES);
		createEReference(taskContextEClass, TASK_CONTEXT__OPERATIONS);
		createEReference(taskContextEClass, TASK_CONTEXT__OPERATION_CALLERS);
		createEAttribute(taskContextEClass, TASK_CONTEXT__NAMESPACE);
		createEAttribute(taskContextEClass, TASK_CONTEXT__CLASS_NAME);
		createEAttribute(taskContextEClass, TASK_CONTEXT__PERIOD);
		createEAttribute(taskContextEClass, TASK_CONTEXT__PRIORITY);
		createEAttribute(taskContextEClass, TASK_CONTEXT__AUTO_START);
		createEAttribute(taskContextEClass, TASK_CONTEXT__AUTO_CONF);

		tcInputDataPortEClass = createEClass(TC_INPUT_DATA_PORT);
		createEAttribute(tcInputDataPortEClass, TC_INPUT_DATA_PORT__EVENT_PORT);

		tcOutputDataPortEClass = createEClass(TC_OUTPUT_DATA_PORT);

		compInputPortEClass = createEClass(COMP_INPUT_PORT);
		createEReference(compInputPortEClass, COMP_INPUT_PORT__EXPOSED_PORT);

		compOutputPortEClass = createEClass(COMP_OUTPUT_PORT);
		createEReference(compOutputPortEClass, COMP_OUTPUT_PORT__EXPOSED_PORT);

		connectionPolicyEClass = createEClass(CONNECTION_POLICY);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__NAME);
		createEReference(connectionPolicyEClass, CONNECTION_POLICY__SOURCE);
		createEReference(connectionPolicyEClass, CONNECTION_POLICY__TARGET);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__TYPE);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__LOCK_POLICY);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__BUFFER_SIZE);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__TRANSPORT);
		createEAttribute(connectionPolicyEClass, CONNECTION_POLICY__NOTE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);

		operationCallerEClass = createEClass(OPERATION_CALLER);
		createEAttribute(operationCallerEClass, OPERATION_CALLER__NAME);

		compOperationEClass = createEClass(COMP_OPERATION);
		createEReference(compOperationEClass, COMP_OPERATION__EXPOSED_OP);

		tcOperationEClass = createEClass(TC_OPERATION);
		createEAttribute(tcOperationEClass, TC_OPERATION__SRV_NAME);
		createEAttribute(tcOperationEClass, TC_OPERATION__OWN_THREAD);

		compOperationCallerEClass = createEClass(COMP_OPERATION_CALLER);
		createEReference(compOperationCallerEClass, COMP_OPERATION_CALLER__EXPOSED_OP_CALLER);

		tcOperationCallerEClass = createEClass(TC_OPERATION_CALLER);
		createEAttribute(tcOperationCallerEClass, TC_OPERATION_CALLER__SRV_NAME);

		peersConnectionEClass = createEClass(PEERS_CONNECTION);
		createEReference(peersConnectionEClass, PEERS_CONNECTION__SOURCE);
		createEReference(peersConnectionEClass, PEERS_CONNECTION__TARGET);
		createEAttribute(peersConnectionEClass, PEERS_CONNECTION__NAME);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__COMPOSITE);

		dataPortEClass = createEClass(DATA_PORT);
		createEAttribute(dataPortEClass, DATA_PORT__NAME);

		inputDataPortEClass = createEClass(INPUT_DATA_PORT);

		outputDataPortEClass = createEClass(OUTPUT_DATA_PORT);

		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__NAME);

		tcPropertyEClass = createEClass(TC_PROPERTY);
		createEAttribute(tcPropertyEClass, TC_PROPERTY__VALUE);
		createEAttribute(tcPropertyEClass, TC_PROPERTY__TYPE);

		compPropertyEClass = createEClass(COMP_PROPERTY);
		createEReference(compPropertyEClass, COMP_PROPERTY__EXPOSED_PROPERTY);

		// Create enums
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		connectionTransportEEnum = createEEnum(CONNECTION_TRANSPORT);
		lockPolicyEEnum = createEEnum(LOCK_POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeEClass.getESuperTypes().add(this.getAbstractComponent());
		taskContextEClass.getESuperTypes().add(this.getAbstractComponent());
		tcInputDataPortEClass.getESuperTypes().add(this.getInputDataPort());
		tcOutputDataPortEClass.getESuperTypes().add(this.getOutputDataPort());
		compInputPortEClass.getESuperTypes().add(this.getInputDataPort());
		compOutputPortEClass.getESuperTypes().add(this.getOutputDataPort());
		compOperationEClass.getESuperTypes().add(this.getOperation());
		tcOperationEClass.getESuperTypes().add(this.getOperation());
		compOperationCallerEClass.getESuperTypes().add(this.getOperationCaller());
		tcOperationCallerEClass.getESuperTypes().add(this.getOperationCaller());
		inputDataPortEClass.getESuperTypes().add(this.getDataPort());
		outputDataPortEClass.getESuperTypes().add(this.getDataPort());
		tcPropertyEClass.getESuperTypes().add(this.getProperty());
		compPropertyEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposite_Components(), this.getAbstractComponent(), null, "components", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_InputPorts(), this.getCompInputPort(), null, "inputPorts", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_OutputPorts(), this.getCompOutputPort(), null, "outputPorts", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_ConnectionPolicies(), this.getConnectionPolicy(), null, "connectionPolicies", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Operations(), this.getCompOperation(), null, "operations", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_OperationCallers(), this.getCompOperationCaller(), null, "operationCallers", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_PeersConnections(), this.getPeersConnection(), null, "peersConnections", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposite_Properties(), this.getCompProperty(), null, "properties", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskContextEClass, TaskContext.class, "TaskContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskContext_InputPorts(), this.getTCInputDataPort(), null, "inputPorts", null, 0, -1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskContext_OutputPorts(), this.getTCOutputDataPort(), null, "outputPorts", null, 0, -1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskContext_Properties(), this.getTCProperty(), null, "properties", null, 0, -1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskContext_Operations(), this.getTCOperation(), null, "operations", null, 0, -1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskContext_OperationCallers(), this.getTCOperationCaller(), null, "operationCallers", null, 0, -1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_Namespace(), ecorePackage.getEString(), "namespace", null, 1, 1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_Period(), ecorePackage.getEDouble(), "period", null, 1, 1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_Priority(), ecorePackage.getEDouble(), "priority", null, 1, 1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_AutoStart(), ecorePackage.getEBoolean(), "autoStart", "false", 1, 1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskContext_AutoConf(), ecorePackage.getEBoolean(), "autoConf", "false", 1, 1, TaskContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcInputDataPortEClass, TCInputDataPort.class, "TCInputDataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCInputDataPort_EventPort(), ecorePackage.getEBoolean(), "eventPort", "false", 1, 1, TCInputDataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcOutputDataPortEClass, TCOutputDataPort.class, "TCOutputDataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compInputPortEClass, CompInputPort.class, "CompInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompInputPort_ExposedPort(), this.getInputDataPort(), null, "exposedPort", null, 1, 1, CompInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compOutputPortEClass, CompOutputPort.class, "CompOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompOutputPort_ExposedPort(), this.getOutputDataPort(), null, "exposedPort", null, 1, 1, CompOutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPolicyEClass, ConnectionPolicy.class, "ConnectionPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPolicy_Source(), this.getOutputDataPort(), null, "source", null, 0, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPolicy_Target(), this.getInputDataPort(), null, "target", null, 0, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_Type(), this.getConnectionType(), "type", null, 1, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_LockPolicy(), this.getLockPolicy(), "lockPolicy", null, 1, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_BufferSize(), ecorePackage.getEInt(), "bufferSize", "1", 1, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_Transport(), this.getConnectionTransport(), "transport", null, 1, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionPolicy_Note(), ecorePackage.getEString(), "note", null, 0, 1, ConnectionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallerEClass, OperationCaller.class, "OperationCaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationCaller_Name(), ecorePackage.getEString(), "name", null, 1, 1, OperationCaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compOperationEClass, CompOperation.class, "CompOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompOperation_ExposedOp(), this.getOperation(), null, "exposedOp", null, 0, 1, CompOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcOperationEClass, TCOperation.class, "TCOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCOperation_SrvName(), ecorePackage.getEString(), "srvName", null, 0, 1, TCOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCOperation_OwnThread(), ecorePackage.getEBoolean(), "ownThread", null, 1, 1, TCOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compOperationCallerEClass, CompOperationCaller.class, "CompOperationCaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompOperationCaller_ExposedOpCaller(), this.getOperationCaller(), null, "exposedOpCaller", null, 0, 1, CompOperationCaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcOperationCallerEClass, TCOperationCaller.class, "TCOperationCaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCOperationCaller_SrvName(), ecorePackage.getEString(), "srvName", null, 0, 1, TCOperationCaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peersConnectionEClass, PeersConnection.class, "PeersConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeersConnection_Source(), this.getOperation(), null, "source", null, 1, 1, PeersConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeersConnection_Target(), this.getOperationCaller(), null, "target", null, 1, 1, PeersConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeersConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, PeersConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, org.hyperflex.orocoscomponentmodel.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Composite(), this.getComposite(), null, "composite", null, 1, 1, org.hyperflex.orocoscomponentmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPortEClass, DataPort.class, "DataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputDataPortEClass, InputDataPort.class, "InputDataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputDataPortEClass, OutputDataPort.class, "OutputDataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcPropertyEClass, TCProperty.class, "TCProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, TCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, TCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compPropertyEClass, CompProperty.class, "CompProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompProperty_ExposedProperty(), this.getProperty(), null, "exposedProperty", null, 1, 1, CompProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.DATA);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.BUFFER);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.CIRCULAR_BUFFER);

		initEEnum(connectionTransportEEnum, ConnectionTransport.class, "ConnectionTransport");
		addEEnumLiteral(connectionTransportEEnum, ConnectionTransport.OROCOS);
		addEEnumLiteral(connectionTransportEEnum, ConnectionTransport.MQUEUE);
		addEEnumLiteral(connectionTransportEEnum, ConnectionTransport.ROS);

		initEEnum(lockPolicyEEnum, LockPolicy.class, "LockPolicy");
		addEEnumLiteral(lockPolicyEEnum, LockPolicy.UNSYNC);
		addEEnumLiteral(lockPolicyEEnum, LockPolicy.LOCKED);
		addEEnumLiteral(lockPolicyEEnum, LockPolicy.LOCK_FREE);

		// Create resource
		createResource(eNS_URI);
	}

} //orocoscomponentmodelPackageImpl
