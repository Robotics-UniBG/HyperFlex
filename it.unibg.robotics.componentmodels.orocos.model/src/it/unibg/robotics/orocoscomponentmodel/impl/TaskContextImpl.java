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

import it.unibg.robotics.orocoscomponentmodel.NodeProperty;
import it.unibg.robotics.orocoscomponentmodel.TCInputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCOperation;
import it.unibg.robotics.orocoscomponentmodel.TCOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TaskContext;
import it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getOperationCallers <em>Operation Callers</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.impl.TaskContextImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskContextImpl extends AbstractComponentImpl implements TaskContext {
	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<TCInputDataPort> inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<TCOutputDataPort> outputPorts;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeProperty> properties;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<TCOperation> operations;

	/**
	 * The cached value of the '{@link #getOperationCallers() <em>Operation Callers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCallers()
	 * @generated
	 * @ordered
	 */
	protected EList<TCOperationCaller> operationCallers;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final double PRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected double priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return orocoscomponentmodelPackage.Literals.TASK_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCInputDataPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<TCInputDataPort>(TCInputDataPort.class, this, orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCOutputDataPort> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList<TCOutputDataPort>(TCOutputDataPort.class, this, orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<NodeProperty>(NodeProperty.class, this, orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<TCOperation>(TCOperation.class, this, orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCOperationCaller> getOperationCallers() {
		if (operationCallers == null) {
			operationCallers = new EObjectContainmentEList<TCOperationCaller>(TCOperationCaller.class, this, orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS);
		}
		return operationCallers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TASK_CONTEXT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TASK_CONTEXT__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod) {
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TASK_CONTEXT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(double newPriority) {
		double oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, orocoscomponentmodelPackage.TASK_CONTEXT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS:
				return ((InternalEList<?>)getInputPorts()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS:
				return ((InternalEList<?>)getOutputPorts()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS:
				return ((InternalEList<?>)getOperationCallers()).basicRemove(otherEnd, msgs);
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
			case orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS:
				return getInputPorts();
			case orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS:
				return getOutputPorts();
			case orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES:
				return getProperties();
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS:
				return getOperations();
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS:
				return getOperationCallers();
			case orocoscomponentmodelPackage.TASK_CONTEXT__NAMESPACE:
				return getNamespace();
			case orocoscomponentmodelPackage.TASK_CONTEXT__CLASS_NAME:
				return getClassName();
			case orocoscomponentmodelPackage.TASK_CONTEXT__PERIOD:
				return getPeriod();
			case orocoscomponentmodelPackage.TASK_CONTEXT__PRIORITY:
				return getPriority();
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
			case orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends TCInputDataPort>)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends TCOutputDataPort>)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends NodeProperty>)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends TCOperation>)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS:
				getOperationCallers().clear();
				getOperationCallers().addAll((Collection<? extends TCOperationCaller>)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PERIOD:
				setPeriod((Double)newValue);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PRIORITY:
				setPriority((Double)newValue);
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
			case orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES:
				getProperties().clear();
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS:
				getOperations().clear();
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS:
				getOperationCallers().clear();
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case orocoscomponentmodelPackage.TASK_CONTEXT__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case orocoscomponentmodelPackage.TASK_CONTEXT__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case orocoscomponentmodelPackage.TASK_CONTEXT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case orocoscomponentmodelPackage.TASK_CONTEXT__OPERATION_CALLERS:
				return operationCallers != null && !operationCallers.isEmpty();
			case orocoscomponentmodelPackage.TASK_CONTEXT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case orocoscomponentmodelPackage.TASK_CONTEXT__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case orocoscomponentmodelPackage.TASK_CONTEXT__PERIOD:
				return period != PERIOD_EDEFAULT;
			case orocoscomponentmodelPackage.TASK_CONTEXT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", className: ");
		result.append(className);
		result.append(", period: ");
		result.append(period);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TaskContextImpl
