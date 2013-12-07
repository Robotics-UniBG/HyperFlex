/**
 * HyperFlex toolchain
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage
 * @generated
 */
public class roscomponentmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static roscomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = roscomponentmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case roscomponentmodelPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseAbstractComponent(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractComponent(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_MSG_PRODUCER: {
				NodeMsgProducer nodeMsgProducer = (NodeMsgProducer)theEObject;
				T result = caseNodeMsgProducer(nodeMsgProducer);
				if (result == null) result = caseNodeMsgInterface(nodeMsgProducer);
				if (result == null) result = caseMsgInterface(nodeMsgProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_MSG_CONSUMER: {
				NodeMsgConsumer nodeMsgConsumer = (NodeMsgConsumer)theEObject;
				T result = caseNodeMsgConsumer(nodeMsgConsumer);
				if (result == null) result = caseNodeMsgInterface(nodeMsgConsumer);
				if (result == null) result = caseMsgInterface(nodeMsgConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_MSG_PRODUCER: {
				CompositeMsgProducer compositeMsgProducer = (CompositeMsgProducer)theEObject;
				T result = caseCompositeMsgProducer(compositeMsgProducer);
				if (result == null) result = caseCompositeMsgInterface(compositeMsgProducer);
				if (result == null) result = caseMsgInterface(compositeMsgProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_MSG_CONSUMER: {
				CompositeMsgConsumer compositeMsgConsumer = (CompositeMsgConsumer)theEObject;
				T result = caseCompositeMsgConsumer(compositeMsgConsumer);
				if (result == null) result = caseCompositeMsgInterface(compositeMsgConsumer);
				if (result == null) result = caseMsgInterface(compositeMsgConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.SRV_PRODUCER: {
				SrvProducer srvProducer = (SrvProducer)theEObject;
				T result = caseSrvProducer(srvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.SRV_CONSUMER: {
				SrvConsumer srvConsumer = (SrvConsumer)theEObject;
				T result = caseSrvConsumer(srvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_SRV_PRODUCER: {
				CompositeSrvProducer compositeSrvProducer = (CompositeSrvProducer)theEObject;
				T result = caseCompositeSrvProducer(compositeSrvProducer);
				if (result == null) result = caseSrvProducer(compositeSrvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_SRV_PRODUCER: {
				NodeSrvProducer nodeSrvProducer = (NodeSrvProducer)theEObject;
				T result = caseNodeSrvProducer(nodeSrvProducer);
				if (result == null) result = caseSrvProducer(nodeSrvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_SRV_CONSUMER: {
				CompositeSrvConsumer compositeSrvConsumer = (CompositeSrvConsumer)theEObject;
				T result = caseCompositeSrvConsumer(compositeSrvConsumer);
				if (result == null) result = caseSrvConsumer(compositeSrvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_SRV_CONSUMER: {
				NodeSrvConsumer nodeSrvConsumer = (NodeSrvConsumer)theEObject;
				T result = caseNodeSrvConsumer(nodeSrvConsumer);
				if (result == null) result = caseSrvConsumer(nodeSrvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.WIRE: {
				Wire wire = (Wire)theEObject;
				T result = caseWire(wire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.SYSTEM: {
				org.hyperflex.roscomponentmodel.System system = (org.hyperflex.roscomponentmodel.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.MSG_INTERFACE: {
				MsgInterface msgInterface = (MsgInterface)theEObject;
				T result = caseMsgInterface(msgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_MSG_INTERFACE: {
				CompositeMsgInterface compositeMsgInterface = (CompositeMsgInterface)theEObject;
				T result = caseCompositeMsgInterface(compositeMsgInterface);
				if (result == null) result = caseMsgInterface(compositeMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_MSG_INTERFACE: {
				NodeMsgInterface nodeMsgInterface = (NodeMsgInterface)theEObject;
				T result = caseNodeMsgInterface(nodeMsgInterface);
				if (result == null) result = caseMsgInterface(nodeMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.ABSTRACT_COMPONENT: {
				AbstractComponent abstractComponent = (AbstractComponent)theEObject;
				T result = caseAbstractComponent(abstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_PROPERTY: {
				NodeProperty nodeProperty = (NodeProperty)theEObject;
				T result = caseNodeProperty(nodeProperty);
				if (result == null) result = caseProperty(nodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_PROPERTY: {
				CompositeProperty compositeProperty = (CompositeProperty)theEObject;
				T result = caseCompositeProperty(compositeProperty);
				if (result == null) result = caseProperty(compositeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgProducer(NodeMsgProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgConsumer(NodeMsgConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Msg Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMsgProducer(CompositeMsgProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Msg Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMsgConsumer(CompositeMsgConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvProducer(SrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvConsumer(SrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSrvProducer(CompositeSrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSrvProducer(NodeSrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSrvConsumer(CompositeSrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSrvConsumer(NodeSrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWire(Wire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.hyperflex.roscomponentmodel.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgInterface(MsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMsgInterface(CompositeMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgInterface(NodeMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponent(AbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeProperty(NodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeProperty(CompositeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //roscomponentmodelSwitch
