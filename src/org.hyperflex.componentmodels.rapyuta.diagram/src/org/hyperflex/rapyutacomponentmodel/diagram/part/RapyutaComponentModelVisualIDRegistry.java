/*
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.hyperflex.rapyutacomponentmodel.System;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointMsgConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointEndPointPropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Node2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePropertiesCompartment2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotContainerCompositeContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotContainerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotContainerNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEndPointPropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Topic2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel3EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel4EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RapyutaComponentModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.hyperflex.componentmodels.rapyuta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemEditPart.MODEL_ID.equals(view.getType())) {
				return SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
				.getSystem().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((System) domainElement)) {
			return SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getRobotContainer().isSuperTypeOf(domainElement.eClass())) {
				return RobotContainerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCloudContainer().isSuperTypeOf(domainElement.eClass())) {
				return CloudContainerEditPart.VISUAL_ID;
			}
			break;
		case CloudContainerEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return Composite2EditPart.VISUAL_ID;
			}
			break;
		case Node2EditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodePublisher().isSuperTypeOf(domainElement.eClass())) {
				return NodePublisherEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeSubscriber().isSuperTypeOf(domainElement.eClass())) {
				return NodeSubscriberEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeSrvServer().isSuperTypeOf(domainElement.eClass())) {
				return NodeSrvServerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeSrvClient().isSuperTypeOf(domainElement.eClass())) {
				return NodeSrvClientEditPart.VISUAL_ID;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositePublisher().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositePublisherEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeSubscriber().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSubscriberEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeSrvServer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvServerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeSrvClient().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvClientEditPart.VISUAL_ID;
			}
			break;
		case RobotEndPointEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointPublisher().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointPublisherEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSubscriber().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointSubscriberEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSrvServer().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointSrvServerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSrvClient().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointSrvClientEditPart.VISUAL_ID;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodePublisher().isSuperTypeOf(domainElement.eClass())) {
				return NodePublisher2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeSubscriber().isSuperTypeOf(domainElement.eClass())) {
				return NodeSubscriber2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeSrvServer().isSuperTypeOf(domainElement.eClass())) {
				return NodeSrvServer2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeSrvClient().isSuperTypeOf(domainElement.eClass())) {
				return NodeSrvClient2EditPart.VISUAL_ID;
			}
			break;
		case EnvironmentEndPointEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointPublisher().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointPublisher2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSubscriber().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointSubscriber2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSrvServer().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointSrvServer2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSrvClient().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointSrvClient2EditPart.VISUAL_ID;
			}
			break;
		case Composite2EditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositePublisher().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositePublisher2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeSubscriber().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSubscriber2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeSrvServer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvServer2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeSrvClient().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvClient2EditPart.VISUAL_ID;
			}
			break;
		case RobotContainerCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNode().isSuperTypeOf(domainElement.eClass())) {
				return Node2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return CompositeEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getTopic().isSuperTypeOf(domainElement.eClass())) {
				return Topic2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getRobotEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return RobotEndPointEditPart.VISUAL_ID;
			}
			break;
		case NodePropertiesCompartment2EditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeParameter().isSuperTypeOf(domainElement.eClass())) {
				return NodeParameterEditPart.VISUAL_ID;
			}
			break;
		case RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointParameter().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointParameterEditPart.VISUAL_ID;
			}
			break;
		case CloudContainerContainerCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNode().isSuperTypeOf(domainElement.eClass())) {
				return NodeEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEnvironmentEndPoint().isSuperTypeOf(
							domainElement.eClass())) {
				return EnvironmentEndPointEditPart.VISUAL_ID;
			}
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getTopic().isSuperTypeOf(domainElement.eClass())) {
				return TopicEditPart.VISUAL_ID;
			}
			break;
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getNodeParameter().isSuperTypeOf(domainElement.eClass())) {
				return NodeParameter2EditPart.VISUAL_ID;
			}
			break;
		case EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointParameter().isSuperTypeOf(
							domainElement.eClass())) {
				return EndPointParameter2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (RobotContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloudContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RobotContainerEditPart.VISUAL_ID:
			if (RobotContainerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RobotContainerCompositeContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloudContainerEditPart.VISUAL_ID:
			if (CloudContainerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloudContainerContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Composite2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node2EditPart.VISUAL_ID:
			if (NodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodePropertiesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodePublisherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSubscriberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSrvServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSrvClientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeParameterEditPart.VISUAL_ID:
			if (NodeParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (CompositeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositePublisherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSubscriberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvClientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Topic2EditPart.VISUAL_ID:
			if (TopicName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RobotEndPointEditPart.VISUAL_ID:
			if (RobotEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointPublisherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointSubscriberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointSrvServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointSrvClientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndPointParameterEditPart.VISUAL_ID:
			if (EndPointParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodePropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodePublisher2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSubscriber2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSrvServer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSrvClient2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeParameter2EditPart.VISUAL_ID:
			if (NodeParameterName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnvironmentEndPointEditPart.VISUAL_ID:
			if (EnvironmentEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointPublisher2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointSubscriber2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointSrvServer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndPointSrvClient2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndPointParameter2EditPart.VISUAL_ID:
			if (EndPointParameterName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TopicEditPart.VISUAL_ID:
			if (TopicNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Composite2EditPart.VISUAL_ID:
			if (CompositeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositePublisher2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSubscriber2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvServer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvClient2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RobotContainerCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (Node2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Topic2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RobotEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodePropertiesCompartment2EditPart.VISUAL_ID:
			if (NodeParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			if (EndPointParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloudContainerContainerCompartmentEditPart.VISUAL_ID:
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnvironmentEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TopicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			if (NodeParameter2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			if (EndPointParameter2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
				.getEndPointSrvConnection().isSuperTypeOf(
						domainElement.eClass())) {
			return EndPointSrvConnectionEditPart.VISUAL_ID;
		}
		if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
				.getEndPointMsgConnection().isSuperTypeOf(
						domainElement.eClass())) {
			return EndPointMsgConnectionEditPart.VISUAL_ID;
		}
		if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
				.getCompositeSrvConnection().isSuperTypeOf(
						domainElement.eClass())) {
			return CompositeSrvConnectionEditPart.VISUAL_ID;
		}
		if (org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
				.getContainerSrvConnection().isSuperTypeOf(
						domainElement.eClass())) {
			return ContainerSrvConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(System element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case RobotContainerCompositeContainerCompartmentEditPart.VISUAL_ID:
		case NodePropertiesCompartment2EditPart.VISUAL_ID:
		case RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
		case CloudContainerContainerCompartmentEditPart.VISUAL_ID:
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
		case EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return false;
		case NodeParameterEditPart.VISUAL_ID:
		case NodePublisherEditPart.VISUAL_ID:
		case NodeSubscriberEditPart.VISUAL_ID:
		case NodeSrvServerEditPart.VISUAL_ID:
		case NodeSrvClientEditPart.VISUAL_ID:
		case CompositePublisherEditPart.VISUAL_ID:
		case CompositeSubscriberEditPart.VISUAL_ID:
		case CompositeSrvServerEditPart.VISUAL_ID:
		case CompositeSrvClientEditPart.VISUAL_ID:
		case CompositePublisher2EditPart.VISUAL_ID:
		case CompositeSubscriber2EditPart.VISUAL_ID:
		case CompositeSrvServer2EditPart.VISUAL_ID:
		case CompositeSrvClient2EditPart.VISUAL_ID:
		case EndPointParameterEditPart.VISUAL_ID:
		case EndPointPublisherEditPart.VISUAL_ID:
		case EndPointSubscriberEditPart.VISUAL_ID:
		case EndPointSrvServerEditPart.VISUAL_ID:
		case EndPointSrvClientEditPart.VISUAL_ID:
		case NodeParameter2EditPart.VISUAL_ID:
		case NodePublisher2EditPart.VISUAL_ID:
		case NodeSubscriber2EditPart.VISUAL_ID:
		case NodeSrvServer2EditPart.VISUAL_ID:
		case NodeSrvClient2EditPart.VISUAL_ID:
		case EndPointParameter2EditPart.VISUAL_ID:
		case EndPointPublisher2EditPart.VISUAL_ID:
		case EndPointSubscriber2EditPart.VISUAL_ID:
		case EndPointSrvServer2EditPart.VISUAL_ID:
		case EndPointSrvClient2EditPart.VISUAL_ID:
		case Topic2EditPart.VISUAL_ID:
		case TopicEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
