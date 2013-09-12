package it.unibg.robotics.roscomponentmodel.diagram.part;

import it.unibg.robotics.roscomponentmodel.AbstractComponent;
import it.unibg.robotics.roscomponentmodel.Composite;
import it.unibg.robotics.roscomponentmodel.CompositeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.CompositeMsgInterface;
import it.unibg.robotics.roscomponentmodel.CompositeMsgProducer;
import it.unibg.robotics.roscomponentmodel.MsgInterface;
import it.unibg.robotics.roscomponentmodel.Node;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.NodeProperty;
import it.unibg.robotics.roscomponentmodel.System;
import it.unibg.robotics.roscomponentmodel.Topic;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

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
			return getComposite_2003SemanticChildren(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3013SemanticChildren(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3014SemanticChildren(view);
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getCompositeCompositeContainerCompartment_7004SemanticChildren(view);
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7005SemanticChildren(view);
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
	public static List<RosComponentModelNodeDescriptor> getComposite_2003SemanticChildren(
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getNode_3013SemanticChildren(
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getComposite_3014SemanticChildren(
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getCompositeCompositeContainerCompartment_7004SemanticChildren(
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
	public static List<RosComponentModelNodeDescriptor> getNodePropertiesCompartment_7005SemanticChildren(
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
			return getComposite_2003ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3013ContainedLinks(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3012ContainedLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003ContainedLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004ContainedLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3014ContainedLinks(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3015ContainedLinks(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3016ContainedLinks(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3017ContainedLinks(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3018ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3019ContainedLinks(view);
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
			return getComposite_2003IncomingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3013IncomingLinks(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3012IncomingLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003IncomingLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004IncomingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3014IncomingLinks(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3015IncomingLinks(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3016IncomingLinks(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3017IncomingLinks(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3018IncomingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3019IncomingLinks(view);
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
			return getComposite_2003OutgoingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3013OutgoingLinks(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3012OutgoingLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003OutgoingLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004OutgoingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3014OutgoingLinks(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3015OutgoingLinks(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3016OutgoingLinks(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3017OutgoingLinks(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3018OutgoingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3019OutgoingLinks(view);
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
	public static List<RosComponentModelLinkDescriptor> getComposite_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNode_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeProperty_3012ContainedLinks(
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
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004ContainedLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3015ContainedLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3016ContainedLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3017ContainedLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3018ContainedLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNode_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeProperty_3012IncomingLinks(
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
	public static List<RosComponentModelLinkDescriptor> getComposite_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3019IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNode_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeProperty_3012OutgoingLinks(
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
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004OutgoingLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getComposite_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3015OutgoingLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3016OutgoingLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgProducer_3017OutgoingLinks(
			View view) {
		CompositeMsgProducer modelElement = (CompositeMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getCompositeMsgConsumer_3018OutgoingLinks(
			View view) {
		CompositeMsgConsumer modelElement = (CompositeMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4010(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgInterface_Connection()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.MsgInterfaceConnection_4010,
						MsgInterfaceConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgInterface_Connection_4011(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgInterface_Connection()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.MsgInterfaceConnection_4011,
						MsgInterfaceConnection2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgInterface_Exposed()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4007,
						CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgInterface_Exposed()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4012,
						CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4010(
			MsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.MsgInterfaceConnection_4010,
				MsgInterfaceConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgInterface_Connection_4011(
			MsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getConnection();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.MsgInterfaceConnection_4011,
				MsgInterfaceConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4007(
			CompositeMsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(
				source,
				destination,
				RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4007,
				CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeMsgInterface_Exposed_4012(
			CompositeMsgInterface source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(
				source,
				destination,
				RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4012,
				CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
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
