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
package it.unibg.robotics.orocoscomponentmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connection Transport</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage#getConnectionTransport()
 * @model
 * @generated
 */
public enum ConnectionTransport implements Enumerator {
	/**
	 * The '<em><b>OROCOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OROCOS_VALUE
	 * @generated
	 * @ordered
	 */
	OROCOS(0, "OROCOS", "OROCOS"),

	/**
	 * The '<em><b>MQUEUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQUEUE_VALUE
	 * @generated
	 * @ordered
	 */
	MQUEUE(1, "MQUEUE", "MQUEUE"),

	/**
	 * The '<em><b>ROS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROS_VALUE
	 * @generated
	 * @ordered
	 */
	ROS(2, "ROS", "ROS");

	/**
	 * The '<em><b>OROCOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OROCOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OROCOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OROCOS_VALUE = 0;

	/**
	 * The '<em><b>MQUEUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MQUEUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MQUEUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MQUEUE_VALUE = 1;

	/**
	 * The '<em><b>ROS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Connection Transport</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectionTransport[] VALUES_ARRAY =
		new ConnectionTransport[] {
			OROCOS,
			MQUEUE,
			ROS,
		};

	/**
	 * A public read-only list of all the '<em><b>Connection Transport</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectionTransport> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connection Transport</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionTransport get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionTransport result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Transport</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionTransport getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionTransport result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Transport</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionTransport get(int value) {
		switch (value) {
			case OROCOS_VALUE: return OROCOS;
			case MQUEUE_VALUE: return MQUEUE;
			case ROS_VALUE: return ROS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectionTransport(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConnectionTransport
