/**
 * Variability Analysis And Resolution Plugins (VARP)
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
package it.unibg.robotics.orocoscomponentmodel.impl;

import it.unibg.robotics.orocoscomponentmodel.AbstractComponent;
import it.unibg.robotics.orocoscomponentmodel.CompInputPort;
import it.unibg.robotics.orocoscomponentmodel.CompOperation;
import it.unibg.robotics.orocoscomponentmodel.CompOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.CompOutputPort;
import it.unibg.robotics.orocoscomponentmodel.CompProperty;
import it.unibg.robotics.orocoscomponentmodel.Composite;
import it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy;
import it.unibg.robotics.orocoscomponentmodel.PeersConnection;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getConnectionPolicies <em>Connection Policies</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getOperationCallers <em>Operation Callers</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getPeersConnections <em>Peers Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.CompositeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends AbstractComponentImpl implements Composite {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponent> components;

	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<CompInputPort> inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<CompOutputPort> outputPorts;

	/**
	 * The cached value of the '{@link #getConnectionPolicies() <em>Connection Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPolicy> connectionPolicies;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<CompOperation> operations;

	/**
	 * The cached value of the '{@link #getOperationCallers() <em>Operation Callers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCallers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompOperationCaller> operationCallers;

	/**
	 * The cached value of the '{@link #getPeersConnections() <em>Peers Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeersConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<PeersConnection> peersConnections;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CompProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, orocoscomponentmodelPackage.COMPOSITE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompInputPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<CompInputPort>(CompInputPort.class, this, orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompOutputPort> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList<CompOutputPort>(CompOutputPort.class, this, orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPolicy> getConnectionPolicies() {
		if (connectionPolicies == null) {
			connectionPolicies = new EObjectContainmentEList<ConnectionPolicy>(ConnectionPolicy.class, this, orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES);
		}
		return connectionPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<CompOperation>(CompOperation.class, this, orocoscomponentmodelPackage.COMPOSITE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompOperationCaller> getOperationCallers() {
		if (operationCallers == null) {
			operationCallers = new EObjectContainmentEList<CompOperationCaller>(CompOperationCaller.class, this, orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS);
		}
		return operationCallers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PeersConnection> getPeersConnections() {
		if (peersConnections == null) {
			peersConnections = new EObjectContainmentEList<PeersConnection>(PeersConnection.class, this, orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS);
		}
		return peersConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CompProperty>(CompProperty.class, this, orocoscomponentmodelPackage.COMPOSITE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMPOSITE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS:
				return ((InternalEList<?>)getInputPorts()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS:
				return ((InternalEList<?>)getOutputPorts()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES:
				return ((InternalEList<?>)getConnectionPolicies()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS:
				return ((InternalEList<?>)getOperationCallers()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS:
				return ((InternalEList<?>)getPeersConnections()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.COMPOSITE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMPOSITE__COMPONENTS:
				return getComponents();
			case orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS:
				return getInputPorts();
			case orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS:
				return getOutputPorts();
			case orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES:
				return getConnectionPolicies();
			case orocoscomponentmodelPackage.COMPOSITE__OPERATIONS:
				return getOperations();
			case orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS:
				return getOperationCallers();
			case orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS:
				return getPeersConnections();
			case orocoscomponentmodelPackage.COMPOSITE__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends AbstractComponent>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends CompInputPort>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends CompOutputPort>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES:
				getConnectionPolicies().clear();
				getConnectionPolicies().addAll((Collection<? extends ConnectionPolicy>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends CompOperation>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS:
				getOperationCallers().clear();
				getOperationCallers().addAll((Collection<? extends CompOperationCaller>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS:
				getPeersConnections().clear();
				getPeersConnections().addAll((Collection<? extends PeersConnection>)newValue);
				return;
			case orocoscomponentmodelPackage.COMPOSITE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends CompProperty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES:
				getConnectionPolicies().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__OPERATIONS:
				getOperations().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS:
				getOperationCallers().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS:
				getPeersConnections().clear();
				return;
			case orocoscomponentmodelPackage.COMPOSITE__PROPERTIES:
				getProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case orocoscomponentmodelPackage.COMPOSITE__COMPONENTS:
				return components != null && !components.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__CONNECTION_POLICIES:
				return connectionPolicies != null && !connectionPolicies.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__OPERATION_CALLERS:
				return operationCallers != null && !operationCallers.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__PEERS_CONNECTIONS:
				return peersConnections != null && !peersConnections.isEmpty();
			case orocoscomponentmodelPackage.COMPOSITE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
