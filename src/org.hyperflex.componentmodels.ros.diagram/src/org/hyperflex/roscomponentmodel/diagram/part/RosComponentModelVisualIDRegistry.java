package org.hyperflex.roscomponentmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.hyperflex.roscomponentmodel.System;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireSrvNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RosComponentModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.hyperflex.componentmodels.ros.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArchitectureModelEditPart.MODEL_ID.equals(view.getType())) {
				return ArchitectureModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
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
				RosComponentModelDiagramEditorPlugin.getInstance().logError(
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
		if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
				.getSystem().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((System) domainElement)) {
			return ArchitectureModelEditPart.VISUAL_ID;
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
		String containerModelID = org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArchitectureModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArchitectureModelEditPart.VISUAL_ID:
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return CompositeEditPart.VISUAL_ID;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgProducer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeMsgProducer2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgConsumer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeMsgConsumer2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeSrvProducer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvProducer2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeSrvConsumer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvConsumer2EditPart.VISUAL_ID;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeMsgProducer().isSuperTypeOf(domainElement.eClass())) {
				return NodeMsgProducerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeMsgConsumer().isSuperTypeOf(domainElement.eClass())) {
				return NodeMsgConsumerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeSrvProducer().isSuperTypeOf(domainElement.eClass())) {
				return NodeSrvProducerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeSrvConsumer().isSuperTypeOf(domainElement.eClass())) {
				return NodeSrvConsumerEditPart.VISUAL_ID;
			}
			break;
		case Composite2EditPart.VISUAL_ID:
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgProducer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeMsgProducerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeMsgConsumer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeMsgConsumerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeSrvProducer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvProducerEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getCompositeSrvConsumer().isSuperTypeOf(
							domainElement.eClass())) {
				return CompositeSrvConsumerEditPart.VISUAL_ID;
			}
			break;
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNode().isSuperTypeOf(domainElement.eClass())) {
				return NodeEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return Composite2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getTopic().isSuperTypeOf(domainElement.eClass())) {
				return TopicEditPart.VISUAL_ID;
			}
			break;
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeProperty().isSuperTypeOf(domainElement.eClass())) {
				return NodePropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArchitectureModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArchitectureModelEditPart.VISUAL_ID:
			if (CompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (CompositeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeCompositeContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeMsgProducer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeMsgConsumer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvProducer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvConsumer2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (NodeMsgProducerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeMsgConsumerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSrvProducerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeSrvConsumerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodePropertyEditPart.VISUAL_ID:
			if (NodePropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Composite2EditPart.VISUAL_ID:
			if (CompositeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeMsgProducerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeMsgConsumerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvProducerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeSrvConsumerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TopicEditPart.VISUAL_ID:
			if (TopicNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Composite2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TopicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			if (NodePropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WireEditPart.VISUAL_ID:
			if (WireSrvNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
				.getWire().isSuperTypeOf(domainElement.eClass())) {
			return WireEditPart.VISUAL_ID;
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
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
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
		case ArchitectureModelEditPart.VISUAL_ID:
			return false;
		case NodePropertyEditPart.VISUAL_ID:
		case NodeMsgProducerEditPart.VISUAL_ID:
		case NodeMsgConsumerEditPart.VISUAL_ID:
		case NodeSrvProducerEditPart.VISUAL_ID:
		case NodeSrvConsumerEditPart.VISUAL_ID:
		case CompositeMsgProducerEditPart.VISUAL_ID:
		case CompositeMsgConsumerEditPart.VISUAL_ID:
		case CompositeSrvProducerEditPart.VISUAL_ID:
		case CompositeSrvConsumerEditPart.VISUAL_ID:
		case CompositeMsgProducer2EditPart.VISUAL_ID:
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
		case TopicEditPart.VISUAL_ID:
		case CompositeSrvProducer2EditPart.VISUAL_ID:
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
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
			return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
