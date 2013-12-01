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
import org.hyperflex.rapyutacomponentmodel.Composite;
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
import org.hyperflex.rapyutacomponentmodel.RobotEndPoint;
import org.hyperflex.rapyutacomponentmodel.SrvClient;
import org.hyperflex.rapyutacomponentmodel.SrvServer;
import org.hyperflex.rapyutacomponentmodel.System;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerEditPart;
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
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001SemanticChildren(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001SemanticChildren(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007SemanticChildren(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3038SemanticChildren(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3040SemanticChildren(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3039SemanticChildren(view);
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getCompositeCompositeContainerCompartment_7001SemanticChildren(view);
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7002SemanticChildren(view);
		case RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			return getRobotEndPointEndPointPropertiesCompartment_7009SemanticChildren(view);
		case ContainerContainerCompartmentEditPart.VISUAL_ID:
			return getContainerContainerCompartment_7004SemanticChildren(view);
		case NodePropertiesCompartment2EditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7011SemanticChildren(view);
		case EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
			return getEnvironmentEndPointEndPointPropertiesCompartment_7010SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getComposites().iterator(); it
				.hasNext();) {
			Composite childElement = (Composite) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeEditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContainers().iterator(); it
				.hasNext();) {
			Container childElement = (Container) it.next();
			int visualID = RapyutaComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ContainerEditPart.VISUAL_ID) {
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
	public static List<RapyutaComponentModelNodeDescriptor> getComposite_2001SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getNode_3001SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getComposite_3007SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getRobotEndPoint_3038SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getNode_3040SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getEnvironmentEndPoint_3039SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getCompositeCompositeContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) containerView.getElement();
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
			if (visualID == Composite2EditPart.VISUAL_ID) {
				result.add(new RapyutaComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
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
	public static List<RapyutaComponentModelNodeDescriptor> getNodePropertiesCompartment_7002SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getRobotEndPointEndPointPropertiesCompartment_7009SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getContainerContainerCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Container modelElement = (Container) containerView.getElement();
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
			if (visualID == Topic2EditPart.VISUAL_ID) {
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
	public static List<RapyutaComponentModelNodeDescriptor> getNodePropertiesCompartment_7011SemanticChildren(
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
	public static List<RapyutaComponentModelNodeDescriptor> getEnvironmentEndPointEndPointPropertiesCompartment_7010SemanticChildren(
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
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001ContainedLinks(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001ContainedLinks(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3002ContainedLinks(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3003ContainedLinks(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3004ContainedLinks(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3005ContainedLinks(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3006ContainedLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007ContainedLinks(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3008ContainedLinks(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3009ContainedLinks(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3010ContainedLinks(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3011ContainedLinks(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3012ContainedLinks(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3013ContainedLinks(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3014ContainedLinks(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3015ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3016ContainedLinks(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3038ContainedLinks(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3018ContainedLinks(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3019ContainedLinks(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3020ContainedLinks(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3021ContainedLinks(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3022ContainedLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3040ContainedLinks(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3024ContainedLinks(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3025ContainedLinks(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3026ContainedLinks(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3027ContainedLinks(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3028ContainedLinks(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3039ContainedLinks(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3030ContainedLinks(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3031ContainedLinks(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3032ContainedLinks(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3033ContainedLinks(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3034ContainedLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3035ContainedLinks(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4006ContainedLinks(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4007ContainedLinks(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4010ContainedLinks(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001IncomingLinks(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002IncomingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001IncomingLinks(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3002IncomingLinks(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3003IncomingLinks(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3004IncomingLinks(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3005IncomingLinks(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3006IncomingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007IncomingLinks(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3008IncomingLinks(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3009IncomingLinks(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3010IncomingLinks(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3011IncomingLinks(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3012IncomingLinks(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3013IncomingLinks(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3014IncomingLinks(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3015IncomingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3016IncomingLinks(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3038IncomingLinks(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3018IncomingLinks(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3019IncomingLinks(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3020IncomingLinks(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3021IncomingLinks(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3022IncomingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3040IncomingLinks(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3024IncomingLinks(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3025IncomingLinks(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3026IncomingLinks(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3027IncomingLinks(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3028IncomingLinks(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3039IncomingLinks(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3030IncomingLinks(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3031IncomingLinks(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3032IncomingLinks(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3033IncomingLinks(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3034IncomingLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3035IncomingLinks(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4006IncomingLinks(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4007IncomingLinks(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4010IncomingLinks(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001OutgoingLinks(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002OutgoingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001OutgoingLinks(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3002OutgoingLinks(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3003OutgoingLinks(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3004OutgoingLinks(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3005OutgoingLinks(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3006OutgoingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007OutgoingLinks(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3008OutgoingLinks(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3009OutgoingLinks(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3010OutgoingLinks(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3011OutgoingLinks(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3012OutgoingLinks(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3013OutgoingLinks(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3014OutgoingLinks(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3015OutgoingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3016OutgoingLinks(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3038OutgoingLinks(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3018OutgoingLinks(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3019OutgoingLinks(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3020OutgoingLinks(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3021OutgoingLinks(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3022OutgoingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3040OutgoingLinks(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3024OutgoingLinks(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3025OutgoingLinks(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3026OutgoingLinks(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3027OutgoingLinks(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3028OutgoingLinks(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3039OutgoingLinks(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3030OutgoingLinks(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3031OutgoingLinks(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3032OutgoingLinks(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3033OutgoingLinks(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3034OutgoingLinks(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3035OutgoingLinks(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4006OutgoingLinks(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4007OutgoingLinks(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4010OutgoingLinks(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4009OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_EndPointSrvConnection_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EndPointMsgConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_2001ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainer_2002ContainedLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3003ContainedLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3004ContainedLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3007ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotEndPoint_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3019ContainedLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3020ContainedLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3025ContainedLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3026ContainedLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEnvironmentEndPoint_3039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3031ContainedLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3032ContainedLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvConnection_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointMsgConnection_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvConnection_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainerSrvConnection_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainer_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3005IncomingLinks(
			View view) {
		NodeSrvServer modelElement = (NodeSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3010IncomingLinks(
			View view) {
		CompositeSrvServer modelElement = (CompositeSrvServer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3014IncomingLinks(
			View view) {
		CompositeSrvServer modelElement = (CompositeSrvServer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3016IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotEndPoint_3038IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3020IncomingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointMsgConnection_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3021IncomingLinks(
			View view) {
		EndPointSrvServer modelElement = (EndPointSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointSrvConnection_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3040IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3027IncomingLinks(
			View view) {
		NodeSrvServer modelElement = (NodeSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEnvironmentEndPoint_3039IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3031IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3032IncomingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointMsgConnection_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3033IncomingLinks(
			View view) {
		EndPointSrvServer modelElement = (EndPointSrvServer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EndPointSrvConnection_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3035IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvConnection_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointMsgConnection_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvConnection_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainerSrvConnection_4009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainer_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3003OutgoingLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3004OutgoingLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3006OutgoingLinks(
			View view) {
		NodeSrvClient modelElement = (NodeSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getComposite_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3011OutgoingLinks(
			View view) {
		CompositeSrvClient modelElement = (CompositeSrvClient) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositePublisher_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSubscriber_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvServer_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvClient_3015OutgoingLinks(
			View view) {
		CompositeSrvClient modelElement = (CompositeSrvClient) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getRobotEndPoint_3038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3019OutgoingLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointMsgConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3020OutgoingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3022OutgoingLinks(
			View view) {
		EndPointSrvClient modelElement = (EndPointSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointSrvConnection_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNode_3040OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeParameter_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodePublisher_3025OutgoingLinks(
			View view) {
		NodePublisher modelElement = (NodePublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSubscriber_3026OutgoingLinks(
			View view) {
		NodeSubscriber modelElement = (NodeSubscriber) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvServer_3027OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getNodeSrvClient_3028OutgoingLinks(
			View view) {
		NodeSrvClient modelElement = (NodeSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEnvironmentEndPoint_3039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointParameter_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointPublisher_3031OutgoingLinks(
			View view) {
		EndPointPublisher modelElement = (EndPointPublisher) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointMsgConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSubscriber_3032OutgoingLinks(
			View view) {
		EndPointSubscriber modelElement = (EndPointSubscriber) view
				.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvServer_3033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvClient_3034OutgoingLinks(
			View view) {
		EndPointSrvClient modelElement = (EndPointSrvClient) view.getElement();
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EndPointSrvConnection_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getTopic_3035OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointSrvConnection_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getEndPointMsgConnection_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getCompositeSrvConnection_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RapyutaComponentModelLinkDescriptor> getContainerSrvConnection_4009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_EndPointSrvConnection_4006(
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
					RapyutaComponentModelElementTypes.EndPointSrvConnection_4006,
					EndPointSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_EndPointMsgConnection_4007(
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
					RapyutaComponentModelElementTypes.EndPointMsgConnection_4007,
					EndPointMsgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompositeSrvConnection_4010(
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
					RapyutaComponentModelElementTypes.CompositeSrvConnection_4010,
					CompositeSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_ContainerSrvConnection_4009(
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
					RapyutaComponentModelElementTypes.ContainerSrvConnection_4009,
					ContainerSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4002(
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
						RapyutaComponentModelElementTypes.MsgInterfaceConnection_4002,
						MsgInterfaceConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4003(
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
						RapyutaComponentModelElementTypes.MsgInterfaceConnection_4003,
						MsgInterfaceConnection2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(
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
						RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4004,
						CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4005(
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
						RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4005,
						CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_EndPointSrvConnection_4006(
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
					RapyutaComponentModelElementTypes.EndPointSrvConnection_4006,
					EndPointSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_EndPointMsgConnection_4007(
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
					RapyutaComponentModelElementTypes.EndPointMsgConnection_4007,
					EndPointMsgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompositeSrvConnection_4010(
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
					RapyutaComponentModelElementTypes.CompositeSrvConnection_4010,
					CompositeSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_ContainerSrvConnection_4009(
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
					RapyutaComponentModelElementTypes.ContainerSrvConnection_4009,
					ContainerSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(
			MsgInterface source) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RapyutaComponentModelLinkDescriptor(source, destination,
				RapyutaComponentModelElementTypes.MsgInterfaceConnection_4002,
				MsgInterfaceConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4003(
			MsgInterface source) {
		LinkedList<RapyutaComponentModelLinkDescriptor> result = new LinkedList<RapyutaComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RapyutaComponentModelLinkDescriptor(source, destination,
				RapyutaComponentModelElementTypes.MsgInterfaceConnection_4003,
				MsgInterfaceConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_EndPointSrvConnection_4006(
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
					RapyutaComponentModelElementTypes.EndPointSrvConnection_4006,
					EndPointSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_EndPointMsgConnection_4007(
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
					RapyutaComponentModelElementTypes.EndPointMsgConnection_4007,
					EndPointMsgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_CompositeSrvConnection_4010(
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
					RapyutaComponentModelElementTypes.CompositeSrvConnection_4010,
					CompositeSrvConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RapyutaComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_ContainerSrvConnection_4009(
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
					RapyutaComponentModelElementTypes.ContainerSrvConnection_4009,
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
