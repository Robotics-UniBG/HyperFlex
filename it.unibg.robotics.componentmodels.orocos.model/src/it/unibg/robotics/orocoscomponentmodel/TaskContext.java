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
package it.unibg.robotics.orocoscomponentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getProperties <em>Properties</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getOperationCallers <em>Operation Callers</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getClassName <em>Class Name</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getPeriod <em>Period</em>}</li>
 *   <li>{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext()
 * @model
 * @generated
 */
public interface TaskContext extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.TCInputDataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_InputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCInputDataPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_OutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCOutputDataPort> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.TCProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.TCOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Operation Callers</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.orocoscomponentmodel.TCOperationCaller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Callers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Callers</em>' containment reference list.
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_OperationCallers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCOperationCaller> getOperationCallers();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_Namespace()
	 * @model required="true"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_Period()
	 * @model required="true"
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(double)
	 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getTaskContext_Priority()
	 * @model required="true"
	 * @generated
	 */
	double getPriority();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.orocoscomponentmodel.TaskContext#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(double value);

} // TaskContext
