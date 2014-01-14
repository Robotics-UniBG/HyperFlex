package org.hyperflex.compositionmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.hyperflex.compositionmodel.ArchitectureModel;
import org.hyperflex.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ConnectionNameEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSCompositeNameEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.System2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeContainerCompartmentEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeNameEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemNameEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterf2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterf2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;

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
	private static final String DEBUG_KEY = "org.hyperflex.compositionmodels.diagram/debug/visualID"; //$NON-NLS-1$

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
		return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
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
		if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
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
		String containerModelID = org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
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
			if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystem().isSuperTypeOf(domainElement.eClass())) {
				return System2EditPart.VISUAL_ID;
			}
			break;
		case System2EditPart.VISUAL_ID:
			if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemProvidedInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemProvidedInterf2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemRequiredInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemRequiredInterf2EditPart.VISUAL_ID;
			}
			break;
		case SystemCompositeEditPart.VISUAL_ID:
			if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemCompositeProvidedInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemCompositeProvidedInterfEditPart.VISUAL_ID;
			}
			if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemCompositeRequiredInterf().isSuperTypeOf(
							domainElement.eClass())) {
				return SystemCompositeRequiredInterfEditPart.VISUAL_ID;
			}
			break;
		case ROSCompositeEditPart.VISUAL_ID:
			if (org.hyperflex.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
					.getROSMsgProducer().isSuperTypeOf(domainElement.eClass())) {
				return SystemProvidedInterfEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
					.getROSMsgConsumer().isSuperTypeOf(domainElement.eClass())) {
				return SystemRequiredInterfEditPart.VISUAL_ID;
			}
			break;
		case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemComposite().isSuperTypeOf(domainElement.eClass())) {
				return SystemCompositeEditPart.VISUAL_ID;
			}
			if (org.hyperflex.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
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
		String containerModelID = org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
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
			if (SystemProvidedInterf2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemRequiredInterf2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (SystemProvidedInterfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemRequiredInterfEditPart.VISUAL_ID == nodeVisualID) {
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
		if (org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
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
		case SystemProvidedInterf2EditPart.VISUAL_ID:
		case SystemRequiredInterf2EditPart.VISUAL_ID:
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
		case SystemProvidedInterfEditPart.VISUAL_ID:
		case SystemRequiredInterfEditPart.VISUAL_ID:
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
			return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
