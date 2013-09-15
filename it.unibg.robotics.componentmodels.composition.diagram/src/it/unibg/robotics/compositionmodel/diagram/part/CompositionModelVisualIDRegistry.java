package it.unibg.robotics.compositionmodel.diagram.part;

import it.unibg.robotics.compositionmodel.ArchitectureModel;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSCompositeNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSMsgConsumerEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSMsgProducerEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.System2EditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeContainerCompartmentEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;
import it.unibg.robotics.roscompositionmodel.roscompositionmodelPackage;

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
public class CompositionModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "it.unibg.robotics.componentmodels.composition.diagram/debug/visualID"; //$NON-NLS-1$

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
		return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
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
				CompositionModelDiagramEditorPlugin.getInstance().logError(
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
		if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
				.getArchitectureModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ArchitectureModel) domainElement)) {
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
		String containerModelID = it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
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
			if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystem().isSuperTypeOf(domainElement.eClass())) {
				return System2EditPart.VISUAL_ID;
			}
			break;
		case System2EditPart.VISUAL_ID:
			if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemProvidedInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemProvidedInterfEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemRequiredInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemRequiredInterfEditPart.VISUAL_ID;
			}
			break;
		case SystemCompositeEditPart.VISUAL_ID:
			if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemCompositeProvidedInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemCompositeProvidedInterfEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemCompositeRequiredInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemCompositeRequiredInterfEditPart.VISUAL_ID;
			}
			break;
		case ROSCompositeEditPart.VISUAL_ID:
			if (roscompositionmodelPackage.eINSTANCE
					.getROSMsgProducer().isSuperTypeOf(domainElement.eClass())) {
				return ROSMsgProducerEditPart.VISUAL_ID;
			}
			if (roscompositionmodelPackage.eINSTANCE
					.getROSMsgConsumer().isSuperTypeOf(domainElement.eClass())) {
				return ROSMsgConsumerEditPart.VISUAL_ID;
			}
			break;
		case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemComposite().isSuperTypeOf(domainElement.eClass())) {
				return SystemCompositeEditPart.VISUAL_ID;
			}
			if (roscompositionmodelPackage.eINSTANCE
					.getROSComposite().isSuperTypeOf(domainElement.eClass())) {
				return ROSCompositeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
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
			if (System2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case System2EditPart.VISUAL_ID:
			if (SystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemCompositeContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemProvidedInterfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemRequiredInterfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemCompositeEditPart.VISUAL_ID:
			if (SystemCompositeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemCompositeProvidedInterfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemCompositeRequiredInterfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ROSCompositeEditPart.VISUAL_ID:
			if (ROSCompositeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ROSMsgProducerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ROSMsgConsumerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (SystemCompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ROSCompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionEditPart.VISUAL_ID:
			if (ConnectionNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
				.getConnection().isSuperTypeOf(domainElement.eClass())) {
			return ConnectionEditPart.VISUAL_ID;
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
		case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
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
		case SystemProvidedInterfEditPart.VISUAL_ID:
		case SystemRequiredInterfEditPart.VISUAL_ID:
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
		case ROSMsgProducerEditPart.VISUAL_ID:
		case ROSMsgConsumerEditPart.VISUAL_ID:
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
			return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
