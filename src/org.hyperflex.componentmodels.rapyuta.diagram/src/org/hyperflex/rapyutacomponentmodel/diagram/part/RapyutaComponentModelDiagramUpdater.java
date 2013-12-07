/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
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
package org.hyperflex.rapyutacomponentmodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.hyperflex.rapyutacomponentmodel.AbstractComponent;
import org.hyperflex.rapyutacomponentmodel.CloudContainer;
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface;
import org.hyperflex.rapyutacomponentmodel.CompositePublisher;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvClient;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvServer;
import org.hyperflex.rapyutacomponentmodel.CompositeSubscriber;
import org.hyperflex.rapyutacomponentmodel.Container;
import org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointParameter;
import org.hyperflex.rapyutacomponentmodel.EndPointPublisher;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvClient;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvServer;
import org.hyperflex.rapyutacomponentmodel.EndPointSubscriber;
import org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint;
import org.hyperflex.rapyutacomponentmodel.MsgInterface;
import org.hyperflex.rapyutacomponentmodel.Node;
import org.hyperflex.rapyutacomponentmodel.NodeParameter;
import org.hyperflex.rapyutacomponentmodel.NodePublisher;
import org.hyperflex.rapyutacomponentmodel.NodeSrvClient;
import org.hyperflex.rapyutacomponentmodel.NodeSrvServer;
import org.hyperflex.rapyutacomponentmodel.NodeSubscriber;
import org.hyperflex.rapyutacomponentmodel.RobotContainer;
import org.hyperflex.rapyutacomponentmodel.RobotEndPoint;
import org.hyperflex.rapyutacomponentmodel.SrvClient;
import org.hyperflex.rapyutacomponentmodel.SrvServer;
import org.hyperflex.rapyutacomponentmodel.System;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Node2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterEditPart;
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEndPointPropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Topic2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class RapyutaComponentModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case CloudContainerEditPart.VISUAL_ID:
			return getCloudContainer_2006SemanticChildren(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3063SemanticChildren(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_3076SemanticChildren(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3077SemanticChildren(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3078SemanticChildren(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3079SemanticChildren(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3081SemanticChildren(view);
		case RobotContainerCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getRobotContainerCompositeContainerCompartment_7018SemanticChildren(view);
		case NodePropertiesCompartment2EditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7016SemanticChildren(view);
		case RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			return getRobotEndPointEndPointPropertiesCompartment_7019SemanticChildren(view);
		case CloudContainerContainerCompartmentEditPart.VISUAL_ID:
			return getCloudContainerContainerCompartment_7020SemanticChildren(view);
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7021SemanticChildren(view);
		case EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			return getEnvironmentEndPointEndPointPropertiesCompartment_7022SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRobotContainers().iterator(); it
				.hasNext();) {
			RobotContainer childElement = (RobotContainer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == RobotContainerEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCloudContainers().iterator(); it
				.hasNext();) {
			CloudContainer childElement = (CloudContainer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CloudContainerEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getCloudContainer_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CloudContainer modelElement = (CloudContainer) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			AbstractComponent childElement = (AbstractComponent) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Composite2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getNode_3063SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPublishers().iterator(); it
				.hasNext();) {
			NodePublisher childElement = (NodePublisher) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodePublisherEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubscribers().iterator(); it
				.hasNext();) {
			NodeSubscriber childElement = (NodeSubscriber) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeSubscriberEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvServers().iterator(); it
				.hasNext();) {
			NodeSrvServer childElement = (NodeSrvServer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeSrvServerEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvClients().iterator(); it
				.hasNext();) {
			NodeSrvClient childElement = (NodeSrvClient) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeSrvClientEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getComposite_3076SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPublishers().iterator(); it
				.hasNext();) {
			CompositePublisher childElement = (CompositePublisher) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositePublisherEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubscribers().iterator(); it
				.hasNext();) {
			CompositeSubscriber childElement = (CompositeSubscriber) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeSubscriberEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvServers().iterator(); it
				.hasNext();) {
			CompositeSrvServer childElement = (CompositeSrvServer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeSrvServerEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvClients().iterator(); it
				.hasNext();) {
			CompositeSrvClient childElement = (CompositeSrvClient) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeSrvClientEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getRobotEndPoint_3077SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RobotEndPoint modelElement = (RobotEndPoint) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPublishers().iterator(); it
				.hasNext();) {
			EndPointPublisher childElement = (EndPointPublisher) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointPublisherEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubscribers().iterator(); it
				.hasNext();) {
			EndPointSubscriber childElement = (EndPointSubscriber) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointSubscriberEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvServers().iterator(); it
				.hasNext();) {
			EndPointSrvServer childElement = (EndPointSrvServer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointSrvServerEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvClients().iterator(); it
				.hasNext();) {
			EndPointSrvClient childElement = (EndPointSrvClient) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointSrvClientEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getNode_3078SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPublishers().iterator(); it
				.hasNext();) {
			NodePublisher childElement = (NodePublisher) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodePublisher2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubscribers().iterator(); it
				.hasNext();) {
			NodeSubscriber childElement = (NodeSubscriber) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeSubscriber2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvServers().iterator(); it
				.hasNext();) {
			NodeSrvServer childElement = (NodeSrvServer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeSrvServer2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvClients().iterator(); it
				.hasNext();) {
			NodeSrvClient childElement = (NodeSrvClient) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeSrvClient2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getEnvironmentEndPoint_3079SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EnvironmentEndPoint modelElement = (EnvironmentEndPoint) view
				.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPublishers().iterator(); it
				.hasNext();) {
			EndPointPublisher childElement = (EndPointPublisher) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointPublisher2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubscribers().iterator(); it
				.hasNext();) {
			EndPointSubscriber childElement = (EndPointSubscriber) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointSubscriber2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvServers().iterator(); it
				.hasNext();) {
			EndPointSrvServer childElement = (EndPointSrvServer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointSrvServer2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvClients().iterator(); it
				.hasNext();) {
			EndPointSrvClient childElement = (EndPointSrvClient) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointSrvClient2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getComposite_3081SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPublishers().iterator(); it
				.hasNext();) {
			CompositePublisher childElement = (CompositePublisher) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositePublisher2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubscribers().iterator(); it
				.hasNext();) {
			CompositeSubscriber childElement = (CompositeSubscriber) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeSubscriber2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvServers().iterator(); it
				.hasNext();) {
			CompositeSrvServer childElement = (CompositeSrvServer) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeSrvServer2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvClients().iterator(); it
				.hasNext();) {
			CompositeSrvClient childElement = (CompositeSrvClient) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeSrvClient2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getRobotContainerCompositeContainerCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RobotContainer modelElement = (RobotContainer) containerView
				.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			AbstractComponent childElement = (AbstractComponent) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Node2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CompositeEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTopics().iterator(); it.hasNext();) {
			Topic childElement = (Topic) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Topic2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			RobotEndPoint childElement = modelElement.getEndPoint();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == RobotEndPointEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getNodePropertiesCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) containerView.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			NodeParameter childElement = (NodeParameter) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeParameterEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getRobotEndPointEndPointPropertiesCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RobotEndPoint modelElement = (RobotEndPoint) containerView.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			EndPointParameter childElement = (EndPointParameter) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointParameterEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getCloudContainerContainerCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CloudContainer modelElement = (CloudContainer) containerView
				.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			AbstractComponent childElement = (AbstractComponent) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			EnvironmentEndPoint childElement = modelElement.getEndPoint();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EnvironmentEndPointEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getTopics().iterator(); it.hasNext();) {
			Topic childElement = (Topic) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TopicEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getNodePropertiesCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) containerView.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			NodeParameter childElement = (NodeParameter) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == NodeParameter2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelNodeDescriptor> getEnvironmentEndPointEndPointPropertiesCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EnvironmentEndPoint modelElement = (EnvironmentEndPoint) containerView
				.getElement();
		LinkedList<RapyutaComponentModelNodeDescriptor> result = new LinkedList<RapyutaComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			EndPointParameter childElement = (EndPointParameter) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == EndPointParameter2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case RobotContainerEditPart.VISUAL_ID:
			return getRobotContainer_2005ContainedLinks(view);
		case CloudContainerEditPart.VISUAL_ID:
			return getCloudContainer_2006ContainedLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3063ContainedLinks(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3042ContainedLinks(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3043ContainedLinks(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3044ContainedLinks(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3045ContainedLinks(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3046ContainedLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_3076ContainedLinks(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3048ContainedLinks(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3049ContainedLinks(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3050ContainedLinks(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3051ContainedLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3075ContainedLinks(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3077ContainedLinks(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3058ContainedLinks(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3059ContainedLinks(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3060ContainedLinks(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3061ContainedLinks(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3062ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3078ContainedLinks(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3064ContainedLinks(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3065ContainedLinks(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3066ContainedLinks(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3067ContainedLinks(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3068ContainedLinks(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3079ContainedLinks(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3070ContainedLinks(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3071ContainedLinks(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3072ContainedLinks(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3073ContainedLinks(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3074ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3080ContainedLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3081ContainedLinks(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3052ContainedLinks(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3053ContainedLinks(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3054ContainedLinks(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3055ContainedLinks(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4015ContainedLinks(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4016ContainedLinks(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4017ContainedLinks(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4018ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case RobotContainerEditPart.VISUAL_ID:
			return getRobotContainer_2005IncomingLinks(view);
		case CloudContainerEditPart.VISUAL_ID:
			return getCloudContainer_2006IncomingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3063IncomingLinks(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3042IncomingLinks(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3043IncomingLinks(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3044IncomingLinks(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3045IncomingLinks(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3046IncomingLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_3076IncomingLinks(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3048IncomingLinks(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3049IncomingLinks(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3050IncomingLinks(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3051IncomingLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3075IncomingLinks(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3077IncomingLinks(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3058IncomingLinks(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3059IncomingLinks(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3060IncomingLinks(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3061IncomingLinks(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3062IncomingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3078IncomingLinks(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3064IncomingLinks(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3065IncomingLinks(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3066IncomingLinks(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3067IncomingLinks(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3068IncomingLinks(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3079IncomingLinks(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3070IncomingLinks(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3071IncomingLinks(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3072IncomingLinks(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3073IncomingLinks(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3074IncomingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3080IncomingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3081IncomingLinks(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3052IncomingLinks(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3053IncomingLinks(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3054IncomingLinks(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3055IncomingLinks(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4015IncomingLinks(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4016IncomingLinks(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4017IncomingLinks(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4018IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case RobotContainerEditPart.VISUAL_ID:
			return getRobotContainer_2005OutgoingLinks(view);
		case CloudContainerEditPart.VISUAL_ID:
			return getCloudContainer_2006OutgoingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3063OutgoingLinks(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3042OutgoingLinks(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3043OutgoingLinks(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3044OutgoingLinks(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3045OutgoingLinks(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3046OutgoingLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_3076OutgoingLinks(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3048OutgoingLinks(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3049OutgoingLinks(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3050OutgoingLinks(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3051OutgoingLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3075OutgoingLinks(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3077OutgoingLinks(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3058OutgoingLinks(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3059OutgoingLinks(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3060OutgoingLinks(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3061OutgoingLinks(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3062OutgoingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3078OutgoingLinks(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3064OutgoingLinks(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3065OutgoingLinks(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3066OutgoingLinks(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3067OutgoingLinks(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3068OutgoingLinks(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3079OutgoingLinks(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3070OutgoingLinks(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3071OutgoingLinks(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3072OutgoingLinks(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3073OutgoingLinks(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3074OutgoingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3080OutgoingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3081OutgoingLinks(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3052OutgoingLinks(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3053OutgoingLinks(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3054OutgoingLinks(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3055OutgoingLinks(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4015OutgoingLinks(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4016OutgoingLinks(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4017OutgoingLinks(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4018OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		System modelElement = (System) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EndPointSrvConnection_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EndPointMsgConnection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotContainer_2005ContainedLinks(
			View view) {
		RobotContainer modelElement = (RobotContainer) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCloudContainer_2006ContainedLinks(
			View view) {
		CloudContainer modelElement = (CloudContainer) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3043ContainedLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3044ContainedLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3045ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3046ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3076ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3048ContainedLinks(
			View view) {
		CompositePublisher modelElement = (CompositePublisher) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3049ContainedLinks(
			View view) {
		CompositeSubscriber modelElement = (CompositeSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3050ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3051ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3052ContainedLinks(
			View view) {
		CompositePublisher modelElement = (CompositePublisher) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3053ContainedLinks(
			View view) {
		CompositeSubscriber modelElement = (CompositeSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3054ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3055ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3058ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3059ContainedLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3060ContainedLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3061ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3062ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3078ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3063ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3064ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3065ContainedLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3066ContainedLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3067ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3068ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEnvironmentEndPoint_3079ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3070ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3071ContainedLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3072ContainedLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3073ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3074ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3080ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3081ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3075ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotEndPoint_3077ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvConnection_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointMsgConnection_4016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvConnection_4017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainerSrvConnection_4018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotContainer_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCloudContainer_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3042IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3043IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3044IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3045IncomingLinks(
			View view) {
		NodeSrvServer modelElement = (NodeSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3046IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3076IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3048IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3049IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3050IncomingLinks(
			View view) {
		CompositeSrvServer modelElement = (CompositeSrvServer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3051IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3052IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3053IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3054IncomingLinks(
			View view) {
		CompositeSrvServer modelElement = (CompositeSrvServer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3055IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3058IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3059IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3060IncomingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointMsgConnection_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3061IncomingLinks(
			View view) {
		EndPointSrvServer modelElement = (EndPointSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointSrvConnection_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3062IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3078IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3063IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3064IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3065IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3066IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3067IncomingLinks(
			View view) {
		NodeSrvServer modelElement = (NodeSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3068IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEnvironmentEndPoint_3079IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3070IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3071IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3072IncomingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointMsgConnection_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3073IncomingLinks(
			View view) {
		EndPointSrvServer modelElement = (EndPointSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointSrvConnection_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3074IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3080IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3081IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3075IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotEndPoint_3077IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvConnection_4015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointMsgConnection_4016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvConnection_4017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainerSrvConnection_4018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotContainer_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCloudContainer_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3042OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3043OutgoingLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3044OutgoingLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3045OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3046OutgoingLinks(
			View view) {
		NodeSrvClient modelElement = (NodeSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3076OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3048OutgoingLinks(
			View view) {
		CompositePublisher modelElement = (CompositePublisher) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3049OutgoingLinks(
			View view) {
		CompositeSubscriber modelElement = (CompositeSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3050OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3051OutgoingLinks(
			View view) {
		CompositeSrvClient modelElement = (CompositeSrvClient) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3052OutgoingLinks(
			View view) {
		CompositePublisher modelElement = (CompositePublisher) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3053OutgoingLinks(
			View view) {
		CompositeSubscriber modelElement = (CompositeSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3054OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3055OutgoingLinks(
			View view) {
		CompositeSrvClient modelElement = (CompositeSrvClient) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3058OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3059OutgoingLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointMsgConnection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3060OutgoingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3061OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3062OutgoingLinks(
			View view) {
		EndPointSrvClient modelElement = (EndPointSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointSrvConnection_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3078OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3063OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3064OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3065OutgoingLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3066OutgoingLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3067OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3068OutgoingLinks(
			View view) {
		NodeSrvClient modelElement = (NodeSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEnvironmentEndPoint_3079OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3070OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3071OutgoingLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointMsgConnection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3072OutgoingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3073OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3074OutgoingLinks(
			View view) {
		EndPointSrvClient modelElement = (EndPointSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointSrvConnection_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3080OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3081OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3075OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotEndPoint_3077OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvConnection_4015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointMsgConnection_4016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvConnection_4017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainerSrvConnection_4018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_EndPointSrvConnection_4015(
			System container) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getEndPointSrvConnections()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EndPointSrvConnection) {
				continue;
			}
			EndPointSrvConnection link = (EndPointSrvConnection) linkObject;
			if (EndPointSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EndPointSrvServer dst = link.getServer();
			EndPointSrvClient src = link.getClient();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.EndPointSrvConnection_4015,
					EndPointSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_EndPointMsgConnection_4016(
			System container) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getEndPointMsgConnections()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EndPointMsgConnection) {
				continue;
			}
			EndPointMsgConnection link = (EndPointMsgConnection) linkObject;
			if (EndPointMsgConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EndPointSubscriber dst = link.getSubscriber();
			EndPointPublisher src = link.getPublisher();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.EndPointMsgConnection_4016,
					EndPointMsgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompositeSrvConnection_4017(
			Composite container) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getSrvConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompositeSrvConnection) {
				continue;
			}
			CompositeSrvConnection link = (CompositeSrvConnection) linkObject;
			if (CompositeSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvServer dst = link.getServer();
			SrvClient src = link.getClient();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.CompositeSrvConnection_4017,
					CompositeSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_ContainerSrvConnection_4018(
			Container container) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getSrvConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainerSrvConnection) {
				continue;
			}
			ContainerSrvConnection link = (ContainerSrvConnection) linkObject;
			if (ContainerSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvServer dst = link.getServer();
			SrvClient src = link.getClient();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.ContainerSrvConnection_4018,
					ContainerSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4011(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getMsgInterface_Connection()) {
				result.add(new RapyutaComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011,
						MsgInterfaceConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4012(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getMsgInterface_Connection()) {
				result.add(new RapyutaComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012,
						MsgInterfaceConnection2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeMsgInterface_Exposed()) {
				result.add(new RapyutaComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013,
						CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getCompositeMsgInterface_Exposed()) {
				result.add(new RapyutaComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014,
						CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_EndPointSrvConnection_4015(
			EndPointSrvServer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSrvConnection_Server()
					|| false == setting.getEObject() instanceof EndPointSrvConnection) {
				continue;
			}
			EndPointSrvConnection link = (EndPointSrvConnection) setting
					.getEObject();
			if (EndPointSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EndPointSrvClient src = link.getClient();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					target,
					link,
					RapyutaComponentModelElementTypes.EndPointSrvConnection_4015,
					EndPointSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_EndPointMsgConnection_4016(
			EndPointSubscriber target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointMsgConnection_Subscriber()
					|| false == setting.getEObject() instanceof EndPointMsgConnection) {
				continue;
			}
			EndPointMsgConnection link = (EndPointMsgConnection) setting
					.getEObject();
			if (EndPointMsgConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EndPointPublisher src = link.getPublisher();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					target,
					link,
					RapyutaComponentModelElementTypes.EndPointMsgConnection_4016,
					EndPointMsgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompositeSrvConnection_4017(
			SrvServer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getSrvConnection_Server()
					|| false == setting.getEObject() instanceof CompositeSrvConnection) {
				continue;
			}
			CompositeSrvConnection link = (CompositeSrvConnection) setting
					.getEObject();
			if (CompositeSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvClient src = link.getClient();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					target,
					link,
					RapyutaComponentModelElementTypes.CompositeSrvConnection_4017,
					CompositeSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_ContainerSrvConnection_4018(
			SrvServer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getSrvConnection_Server()
					|| false == setting.getEObject() instanceof ContainerSrvConnection) {
				continue;
			}
			ContainerSrvConnection link = (ContainerSrvConnection) setting
					.getEObject();
			if (ContainerSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvClient src = link.getClient();
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					target,
					link,
					RapyutaComponentModelElementTypes.ContainerSrvConnection_4018,
					ContainerSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(
			MsgInterface source) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RapyutaComponentModelLinkDescriptor(source, destination,
				RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011,
				MsgInterfaceConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4012(
			MsgInterface source) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RapyutaComponentModelLinkDescriptor(source, destination,
				RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012,
				MsgInterfaceConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4013(
			CompositeMsgInterface source) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Topic destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new RapyutaComponentModelLinkDescriptor(
				source,
				destination,
				RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013,
				CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4014(
			CompositeMsgInterface source) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Topic destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new RapyutaComponentModelLinkDescriptor(
				source,
				destination,
				RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014,
				CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_EndPointSrvConnection_4015(
			EndPointSrvClient source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getEndPointSrvConnections()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EndPointSrvConnection) {
				continue;
			}
			EndPointSrvConnection link = (EndPointSrvConnection) linkObject;
			if (EndPointSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EndPointSrvServer dst = link.getServer();
			EndPointSrvClient src = link.getClient();
			if (src != source) {
				continue;
			}
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.EndPointSrvConnection_4015,
					EndPointSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_EndPointMsgConnection_4016(
			EndPointPublisher source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getEndPointMsgConnections()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EndPointMsgConnection) {
				continue;
			}
			EndPointMsgConnection link = (EndPointMsgConnection) linkObject;
			if (EndPointMsgConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EndPointSubscriber dst = link.getSubscriber();
			EndPointPublisher src = link.getPublisher();
			if (src != source) {
				continue;
			}
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.EndPointMsgConnection_4016,
					EndPointMsgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4017(
			SrvClient source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getSrvConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompositeSrvConnection) {
				continue;
			}
			CompositeSrvConnection link = (CompositeSrvConnection) linkObject;
			if (CompositeSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvServer dst = link.getServer();
			SrvClient src = link.getClient();
			if (src != source) {
				continue;
			}
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.CompositeSrvConnection_4017,
					CompositeSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4018(
			SrvClient source) {
		Container container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Container) {
				container = (Container) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getSrvConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainerSrvConnection) {
				continue;
			}
			ContainerSrvConnection link = (ContainerSrvConnection) linkObject;
			if (ContainerSrvConnectionEditPart.VISUAL_ID != RapyutaComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvServer dst = link.getServer();
			SrvClient src = link.getClient();
			if (src != source) {
				continue;
			}
			result.add(new RapyutaComponentModelLinkDescriptor(
					src,
					dst,
					link,
					RapyutaComponentModelElementTypes.ContainerSrvConnection_4018,
					ContainerSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<RapyutaComponentModelNodeDescriptor> getSemanticChildren(
				View view) {
			return RapyutaComponentModelDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RapyutaComponentModelLinkDescriptor> getContainedLinks(
				View view) {
			return RapyutaComponentModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RapyutaComponentModelLinkDescriptor> getIncomingLinks(
				View view) {
			return RapyutaComponentModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RapyutaComponentModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return RapyutaComponentModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
