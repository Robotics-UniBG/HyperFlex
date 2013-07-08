package it.unibg.robotics.roscomponentmodel.diagram.part;

import it.unibg.robotics.roscomponentmodel.ArchitectureModel;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Package2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackagePackageContainerCompartmentEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

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
	private static final String DEBUG_KEY = "it.unibg.robotics.componentmodels.ros.diagram/debug/visualID"; //$NON-NLS-1$

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
		return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
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
		if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
				.getArchitectureModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ArchitectureModel) domainElement)) {
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
		String containerModelID = it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
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
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackageMsgProducer().isSuperTypeOf(
							domainElement.eClass())) {
				return PackageMsgProducer2EditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackageMsgConsumer().isSuperTypeOf(
							domainElement.eClass())) {
				return PackageMsgConsumer2EditPart.VISUAL_ID;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeMsgProducer().isSuperTypeOf(domainElement.eClass())) {
				return NodeMsgProducerEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNodeMsgConsumer().isSuperTypeOf(domainElement.eClass())) {
				return NodeMsgConsumerEditPart.VISUAL_ID;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackageMsgProducer().isSuperTypeOf(
							domainElement.eClass())) {
				return PackageMsgProducerEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackageMsgConsumer().isSuperTypeOf(
							domainElement.eClass())) {
				return PackageMsgConsumerEditPart.VISUAL_ID;
			}
			break;
		case PackagePackageContainerCompartmentEditPart.VISUAL_ID:
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNode().isSuperTypeOf(domainElement.eClass())) {
				return NodeEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getTopic().isSuperTypeOf(domainElement.eClass())) {
				return TopicEditPart.VISUAL_ID;
			}
			break;
		case NodePropertiesCompartmentEditPart.VISUAL_ID:
			if (it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
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
		String containerModelID = it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArchitectureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
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
			if (PackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageMsgProducer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageMsgConsumer2EditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case NodePropertyEditPart.VISUAL_ID:
			if (NodePropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageMsgProducerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageMsgConsumerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TopicEditPart.VISUAL_ID:
			if (TopicNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageContainerCompartmentEditPart.VISUAL_ID:
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ArchitectureModel element) {
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
		case PackagePackageContainerCompartmentEditPart.VISUAL_ID:
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
		case NodeMsgProducerEditPart.VISUAL_ID:
		case NodeMsgConsumerEditPart.VISUAL_ID:
		case PackageMsgProducerEditPart.VISUAL_ID:
		case PackageMsgConsumerEditPart.VISUAL_ID:
		case TopicEditPart.VISUAL_ID:
		case PackageMsgProducer2EditPart.VISUAL_ID:
		case PackageMsgConsumer2EditPart.VISUAL_ID:
		case NodePropertyEditPart.VISUAL_ID:
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
			return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
