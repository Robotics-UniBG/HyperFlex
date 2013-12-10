package org.hyperflex.roscomponentmodel.diagram.part;

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
import org.hyperflex.roscomponentmodel.AbstractComponent;
import org.hyperflex.roscomponentmodel.Composite;
import org.hyperflex.roscomponentmodel.CompositeMsgConsumer;
import org.hyperflex.roscomponentmodel.CompositeMsgInterface;
import org.hyperflex.roscomponentmodel.CompositeMsgProducer;
import org.hyperflex.roscomponentmodel.CompositeSrvConsumer;
import org.hyperflex.roscomponentmodel.CompositeSrvProducer;
import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.NodeMsgConsumer;
import org.hyperflex.roscomponentmodel.NodeMsgProducer;
import org.hyperflex.roscomponentmodel.NodeProperty;
import org.hyperflex.roscomponentmodel.NodeSrvConsumer;
import org.hyperflex.roscomponentmodel.NodeSrvProducer;
import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;
import org.hyperflex.roscomponentmodel.System;
import org.hyperflex.roscomponentmodel.Topic;
import org.hyperflex.roscomponentmodel.Wire;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromote2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromoteEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireEditPart;
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

/**
 * @generated
 */
public class RosComponentModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001SemanticChildren(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001SemanticChildren(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007SemanticChildren(view);
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getCompositeCompositeContainerCompartment_7001SemanticChildren(view);
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		{
			Composite childElement = modelElement.getComposite();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getComposite_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMsgProducers().iterator(); it
				.hasNext();) {
			CompositeMsgProducer childElement = (CompositeMsgProducer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeMsgProducer2EditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMsgConsumers().iterator(); it
				.hasNext();) {
			CompositeMsgConsumer childElement = (CompositeMsgConsumer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeMsgConsumer2EditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvProducers().iterator(); it
				.hasNext();) {
			CompositeSrvProducer childElement = (CompositeSrvProducer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeSrvProducer2EditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvConsumers().iterator(); it
				.hasNext();) {
			CompositeSrvConsumer childElement = (CompositeSrvConsumer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeSrvConsumer2EditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getNode_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMsgProducers().iterator(); it
				.hasNext();) {
			NodeMsgProducer childElement = (NodeMsgProducer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodeMsgProducerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMsgConsumers().iterator(); it
				.hasNext();) {
			NodeMsgConsumer childElement = (NodeMsgConsumer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodeMsgConsumerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvProducers().iterator(); it
				.hasNext();) {
			NodeSrvProducer childElement = (NodeSrvProducer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodeSrvProducerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvConsumers().iterator(); it
				.hasNext();) {
			NodeSrvConsumer childElement = (NodeSrvConsumer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodeSrvConsumerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getComposite_3007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMsgProducers().iterator(); it
				.hasNext();) {
			CompositeMsgProducer childElement = (CompositeMsgProducer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeMsgProducerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMsgConsumers().iterator(); it
				.hasNext();) {
			CompositeMsgConsumer childElement = (CompositeMsgConsumer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeMsgConsumerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvProducers().iterator(); it
				.hasNext();) {
			CompositeSrvProducer childElement = (CompositeSrvProducer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeSrvProducerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSrvConsumers().iterator(); it
				.hasNext();) {
			CompositeSrvConsumer childElement = (CompositeSrvConsumer) it
					.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CompositeSrvConsumerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getCompositeCompositeContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) containerView.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			AbstractComponent childElement = (AbstractComponent) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Composite2EditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTopics().iterator(); it.hasNext();) {
			Topic childElement = (Topic) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == TopicEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getNodePropertiesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) containerView.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			NodeProperty childElement = (NodeProperty) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodePropertyEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001ContainedLinks(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3002ContainedLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003ContainedLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004ContainedLinks(view);
		case NodeSrvProducerEditPart.VISUAL_ID:
			return getNodeSrvProducer_3005ContainedLinks(view);
		case NodeSrvConsumerEditPart.VISUAL_ID:
			return getNodeSrvConsumer_3006ContainedLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007ContainedLinks(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3008ContainedLinks(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3009ContainedLinks(view);
		case CompositeSrvProducerEditPart.VISUAL_ID:
			return getCompositeSrvProducer_3010ContainedLinks(view);
		case CompositeSrvConsumerEditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3011ContainedLinks(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3012ContainedLinks(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3013ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3014ContainedLinks(view);
		case CompositeSrvProducer2EditPart.VISUAL_ID:
			return getCompositeSrvProducer_3015ContainedLinks(view);
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3016ContainedLinks(view);
		case WireEditPart.VISUAL_ID:
			return getWire_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001IncomingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001IncomingLinks(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3002IncomingLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003IncomingLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004IncomingLinks(view);
		case NodeSrvProducerEditPart.VISUAL_ID:
			return getNodeSrvProducer_3005IncomingLinks(view);
		case NodeSrvConsumerEditPart.VISUAL_ID:
			return getNodeSrvConsumer_3006IncomingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007IncomingLinks(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3008IncomingLinks(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3009IncomingLinks(view);
		case CompositeSrvProducerEditPart.VISUAL_ID:
			return getCompositeSrvProducer_3010IncomingLinks(view);
		case CompositeSrvConsumerEditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3011IncomingLinks(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3012IncomingLinks(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3013IncomingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3014IncomingLinks(view);
		case CompositeSrvProducer2EditPart.VISUAL_ID:
			return getCompositeSrvProducer_3015IncomingLinks(view);
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3016IncomingLinks(view);
		case WireEditPart.VISUAL_ID:
			return getWire_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001OutgoingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001OutgoingLinks(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3002OutgoingLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003OutgoingLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004OutgoingLinks(view);
		case NodeSrvProducerEditPart.VISUAL_ID:
			return getNodeSrvProducer_3005OutgoingLinks(view);
		case NodeSrvConsumerEditPart.VISUAL_ID:
			return getNodeSrvConsumer_3006OutgoingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3007OutgoingLinks(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3008OutgoingLinks(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3009OutgoingLinks(view);
		case CompositeSrvProducerEditPart.VISUAL_ID:
			return getCompositeSrvProducer_3010OutgoingLinks(view);
		case CompositeSrvConsumerEditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3011OutgoingLinks(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3012OutgoingLinks(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3013OutgoingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3014OutgoingLinks(view);
		case CompositeSrvProducer2EditPart.VISUAL_ID:
			return getCompositeSrvProducer_3015OutgoingLinks(view);
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
			return getCompositeSrvConsumer_3016OutgoingLinks(view);
		case WireEditPart.VISUAL_ID:
			return getWire_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_2001ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Wire_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeProperty_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgProducer_3003ContainedLinks(
			View view) {
		NodeMsgProducer modelElement = (NodeMsgProducer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004ContainedLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeSrvProducer_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeSrvConsumer_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_3007ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Wire_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3008ContainedLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3009ContainedLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvProducer_3010ContainedLinks(
			View view) {
		CompositeSrvProducer modelElement = (CompositeSrvProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvConsumer_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3012ContainedLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3013ContainedLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvProducer_3015ContainedLinks(
			View view) {
		CompositeSrvProducer modelElement = (CompositeSrvProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvConsumer_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getWire_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNode_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeProperty_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgProducer_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeSrvProducer_3005IncomingLinks(
			View view) {
		NodeSrvProducer modelElement = (NodeSrvProducer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Wire_4007(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeSrvConsumer_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvProducer_3010IncomingLinks(
			View view) {
		CompositeSrvProducer modelElement = (CompositeSrvProducer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Wire_4007(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvConsumer_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3014IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvProducer_3015IncomingLinks(
			View view) {
		CompositeSrvProducer modelElement = (CompositeSrvProducer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Wire_4007(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvConsumer_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getWire_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNode_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeProperty_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgProducer_3003OutgoingLinks(
			View view) {
		NodeMsgProducer modelElement = (NodeMsgProducer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004OutgoingLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeSrvProducer_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeSrvConsumer_3006OutgoingLinks(
			View view) {
		NodeSrvConsumer modelElement = (NodeSrvConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Wire_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3008OutgoingLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3009OutgoingLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvProducer_3010OutgoingLinks(
			View view) {
		CompositeSrvProducer modelElement = (CompositeSrvProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvConsumer_3011OutgoingLinks(
			View view) {
		CompositeSrvConsumer modelElement = (CompositeSrvConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Wire_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3012OutgoingLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3013OutgoingLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvProducer_3015OutgoingLinks(
			View view) {
		CompositeSrvProducer modelElement = (CompositeSrvProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeSrvConsumer_3016OutgoingLinks(
			View view) {
		CompositeSrvConsumer modelElement = (CompositeSrvConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Wire_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getWire_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_Wire_4007(
			Composite container) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getWires().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Wire) {
				continue;
			}
			Wire link = (Wire) linkObject;
			if (WireEditPart.VISUAL_ID != RosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvProducer dst = link.getSource();
			SrvConsumer src = link.getTarget();
			result.add(new RosComponentModelLinkDescriptor(src, dst, link,
					RosComponentModelElementTypes.Wire_4007,
					WireEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4001(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgInterface_Connection()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.MsgInterfaceConnection_4001,
						MsgInterfaceConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4002(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgInterface_Connection()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.MsgInterfaceConnection_4002,
						MsgInterfaceConnection2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgInterface_Exposed()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4003,
						CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgInterface_Exposed()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4004,
						CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(
			SrvProducer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeSrvProducer_Promote()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.CompositeSrvProducerPromote_4005,
						CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(
			SrvProducer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeSrvProducer_Promote()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.CompositeSrvProducerPromote_4006,
						CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_Wire_4007(
			SrvProducer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getWire_Source()
					|| false == setting.getEObject() instanceof Wire) {
				continue;
			}
			Wire link = (Wire) setting.getEObject();
			if (WireEditPart.VISUAL_ID != RosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvConsumer src = link.getTarget();
			result.add(new RosComponentModelLinkDescriptor(src, target, link,
					RosComponentModelElementTypes.Wire_4007,
					WireEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4001(
			MsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.MsgInterfaceConnection_4001,
				MsgInterfaceConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4002(
			MsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.MsgInterfaceConnection_4002,
				MsgInterfaceConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4003(
			CompositeMsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(
				source,
				destination,
				RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4003,
				CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4004(
			CompositeMsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(
				source,
				destination,
				RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4004,
				CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4005(
			CompositeSrvProducer source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		SrvProducer destination = source.getPromote();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.CompositeSrvProducerPromote_4005,
				CompositeSrvProducerPromoteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeSrvProducer_Promote_4006(
			CompositeSrvProducer source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		SrvProducer destination = source.getPromote();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.CompositeSrvProducerPromote_4006,
				CompositeSrvProducerPromote2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Wire_4007(
			SrvConsumer source) {
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
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getWires().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Wire) {
				continue;
			}
			Wire link = (Wire) linkObject;
			if (WireEditPart.VISUAL_ID != RosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SrvProducer dst = link.getSource();
			SrvConsumer src = link.getTarget();
			if (src != source) {
				continue;
			}
			result.add(new RosComponentModelLinkDescriptor(src, dst, link,
					RosComponentModelElementTypes.Wire_4007,
					WireEditPart.VISUAL_ID));
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
		public List<RosComponentModelNodeDescriptor> getSemanticChildren(
				View view) {
			return RosComponentModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RosComponentModelLinkDescriptor> getContainedLinks(View view) {
			return RosComponentModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RosComponentModelLinkDescriptor> getIncomingLinks(View view) {
			return RosComponentModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RosComponentModelLinkDescriptor> getOutgoingLinks(View view) {
			return RosComponentModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
