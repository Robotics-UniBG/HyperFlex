package it.unibg.robotics.roscomponentmodel.diagram.part;

import it.unibg.robotics.roscomponentmodel.ArchitectureModel;
import it.unibg.robotics.roscomponentmodel.MsgConsumer;
import it.unibg.robotics.roscomponentmodel.MsgProducer;
import it.unibg.robotics.roscomponentmodel.Node;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.Package;
import it.unibg.robotics.roscomponentmodel.PackageMsgConsumer;
import it.unibg.robotics.roscomponentmodel.PackageMsgProducer;
import it.unibg.robotics.roscomponentmodel.Parameter;
import it.unibg.robotics.roscomponentmodel.Topic;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgConsumerSourceEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgProducerTargetEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Package2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerPromoteEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerPromoteEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackagePackageContainerCompartmentEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ParameterEditPart;
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
			return getArchitectureModel_1000SemanticChildren(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2002SemanticChildren(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001SemanticChildren(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3005SemanticChildren(view);
		case PackagePackageContainerCompartmentEditPart.VISUAL_ID:
			return getPackageCompositeContainerCompartment_7003SemanticChildren(view);
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			return getNodePropertiesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getArchitectureModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArchitectureModel modelElement = (ArchitectureModel) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		{
			Package childElement = modelElement.getPackage();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getPackage_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMsgProducers().iterator(); it
				.hasNext();) {
			PackageMsgProducer childElement = (PackageMsgProducer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PackageMsgProducer2EditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMsgConsumers().iterator(); it
				.hasNext();) {
			PackageMsgConsumer childElement = (PackageMsgConsumer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PackageMsgConsumer2EditPart.VISUAL_ID) {
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelNodeDescriptor> getPackage_3005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMsgProducers().iterator(); it
				.hasNext();) {
			PackageMsgProducer childElement = (PackageMsgProducer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PackageMsgProducerEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMsgConsumers().iterator(); it
				.hasNext();) {
			PackageMsgConsumer childElement = (PackageMsgConsumer) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PackageMsgConsumerEditPart.VISUAL_ID) {
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
	public static List<RosComponentModelNodeDescriptor> getPackageCompositeContainerCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<RosComponentModelNodeDescriptor> result = new LinkedList<RosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new RosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubPackages().iterator(); it
				.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == Package2EditPart.VISUAL_ID) {
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
			Parameter childElement = (Parameter) it.next();
			int visualID = RosComponentModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
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
			return getArchitectureModel_1000ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2002ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002ContainedLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003ContainedLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3005ContainedLinks(view);
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getPackageMsgProducer_3006ContainedLinks(view);
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getPackageMsgConsumer_3007ContainedLinks(view);
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getPackageMsgProducer_3009ContainedLinks(view);
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getPackageMsgConsumer_3010ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3008ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2002IncomingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002IncomingLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003IncomingLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3005IncomingLinks(view);
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getPackageMsgProducer_3006IncomingLinks(view);
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getPackageMsgConsumer_3007IncomingLinks(view);
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getPackageMsgProducer_3009IncomingLinks(view);
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getPackageMsgConsumer_3010IncomingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3008IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2002OutgoingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002OutgoingLinks(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003OutgoingLinks(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3005OutgoingLinks(view);
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getPackageMsgProducer_3006OutgoingLinks(view);
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getPackageMsgConsumer_3007OutgoingLinks(view);
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getPackageMsgProducer_3009OutgoingLinks(view);
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getPackageMsgConsumer_3010OutgoingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3008OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getArchitectureModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackage_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<RosComponentModelLinkDescriptor> getParameter_3002ContainedLinks(
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
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004ContainedLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackage_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgProducer_3006ContainedLinks(
			View view) {
		PackageMsgProducer modelElement = (PackageMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgConsumer_3007ContainedLinks(
			View view) {
		PackageMsgConsumer modelElement = (PackageMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgProducer_3009ContainedLinks(
			View view) {
		PackageMsgProducer modelElement = (PackageMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgConsumer_3010ContainedLinks(
			View view) {
		PackageMsgConsumer modelElement = (PackageMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackage_2002IncomingLinks(
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
	public static List<RosComponentModelLinkDescriptor> getParameter_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgProducer_3003IncomingLinks(
			View view) {
		NodeMsgProducer modelElement = (NodeMsgProducer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004IncomingLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackage_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgProducer_3006IncomingLinks(
			View view) {
		PackageMsgProducer modelElement = (PackageMsgProducer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgConsumer_3007IncomingLinks(
			View view) {
		PackageMsgConsumer modelElement = (PackageMsgConsumer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgProducer_3009IncomingLinks(
			View view) {
		PackageMsgProducer modelElement = (PackageMsgProducer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgConsumer_3010IncomingLinks(
			View view) {
		PackageMsgConsumer modelElement = (PackageMsgConsumer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3008IncomingLinks(
			View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MsgConsumer_Source_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MsgProducer_Target_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackage_2002OutgoingLinks(
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
	public static List<RosComponentModelLinkDescriptor> getParameter_3002OutgoingLinks(
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
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getNodeMsgConsumer_3004OutgoingLinks(
			View view) {
		NodeMsgConsumer modelElement = (NodeMsgConsumer) view.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackage_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgProducer_3006OutgoingLinks(
			View view) {
		PackageMsgProducer modelElement = (PackageMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgConsumer_3007OutgoingLinks(
			View view) {
		PackageMsgConsumer modelElement = (PackageMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgProducer_3009OutgoingLinks(
			View view) {
		PackageMsgProducer modelElement = (PackageMsgProducer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getPackageMsgConsumer_3010OutgoingLinks(
			View view) {
		PackageMsgConsumer modelElement = (PackageMsgConsumer) view
				.getElement();
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosComponentModelLinkDescriptor> getTopic_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgConsumer_Source_4002(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgConsumer_Source()) {
				result.add(new RosComponentModelLinkDescriptor(setting
						.getEObject(), target,
						RosComponentModelElementTypes.MsgConsumerSource_4002,
						MsgConsumerSourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_MsgProducer_Target_4003(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgProducer_Target()) {
				result.add(new RosComponentModelLinkDescriptor(setting
						.getEObject(), target,
						RosComponentModelElementTypes.MsgProducerTarget_4003,
						MsgProducerTargetEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(
			MsgProducer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackageMsgProducer_Promote()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.PackageMsgProducerPromote_4004,
						PackageMsgProducerPromoteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(
			MsgConsumer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackageMsgConsumer_Promote()) {
				result.add(new RosComponentModelLinkDescriptor(
						setting.getEObject(),
						target,
						RosComponentModelElementTypes.PackageMsgConsumerPromote_4005,
						PackageMsgConsumerPromoteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgConsumer_Source_4002(
			MsgConsumer source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getSource();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.MsgConsumerSource_4002,
				MsgConsumerSourceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_MsgProducer_Target_4003(
			MsgProducer source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		Topic destination = source.getTarget();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.MsgProducerTarget_4003,
				MsgProducerTargetEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_PackageMsgProducer_Promote_4004(
			PackageMsgProducer source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		MsgProducer destination = source.getPromote();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.PackageMsgProducerPromote_4004,
				PackageMsgProducerPromoteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_PackageMsgConsumer_Promote_4005(
			PackageMsgConsumer source) {
		LinkedList<RosComponentModelLinkDescriptor> result = new LinkedList<RosComponentModelLinkDescriptor>();
		MsgConsumer destination = source.getPromote();
		if (destination == null) {
			return result;
		}
		result.add(new RosComponentModelLinkDescriptor(source, destination,
				RosComponentModelElementTypes.PackageMsgConsumerPromote_4005,
				PackageMsgConsumerPromoteEditPart.VISUAL_ID));
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
