/**
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
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.featuremodels.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationLowerBoundUpperBoundEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.Feature2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureModelEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureName2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureNameEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.SimpleAttributeEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.SimpleAttributeNameEditPart;
import org.hyperflex.featuremodels.diagram.expressions.FeatureModelOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FeatureModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.hyperflex.featuremodels.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FeatureModelEditPart.MODEL_ID.equals(view.getType())) {
				return FeatureModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
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
				FeatureModelDiagramEditorPlugin.getInstance().logError(
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
		if (org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
				.getFeatureModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((FeatureModel) domainElement)) {
			return FeatureModelEditPart.VISUAL_ID;
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
		String containerModelID = org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FeatureModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FeatureModelEditPart.VISUAL_ID:
			if (org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature().isSuperTypeOf(domainElement.eClass())
					&& isFeature_2005((Feature) domainElement)) {
				return FeatureEditPart.VISUAL_ID;
			}
			if (org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature().isSuperTypeOf(domainElement.eClass())
					&& isFeature_2006((Feature) domainElement)) {
				return Feature2EditPart.VISUAL_ID;
			}
			if (org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getSimpleAttribute().isSuperTypeOf(domainElement.eClass())) {
				return SimpleAttributeEditPart.VISUAL_ID;
			}
			break;
		case Feature2EditPart.VISUAL_ID:
			if (org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getContainmentAssociation().isSuperTypeOf(
							domainElement.eClass())) {
				return ContainmentAssociationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FeatureModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FeatureModelEditPart.VISUAL_ID:
			if (FeatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Feature2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FeatureEditPart.VISUAL_ID:
			if (FeatureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Feature2EditPart.VISUAL_ID:
			if (FeatureName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleAttributeEditPart.VISUAL_ID:
			if (SimpleAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainmentAssociationEditPart.VISUAL_ID:
			if (ContainmentAssociationLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(FeatureModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isFeature_2005(Feature domainElement) {
		Object result = FeatureModelOCLFactory.getExpression(
				0,
				org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
						.getFeature(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFeature_2006(Feature domainElement) {
		Object result = FeatureModelOCLFactory.getExpression(
				1,
				org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
						.getFeature(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
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
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FeatureModelEditPart.VISUAL_ID:
			return false;
		case FeatureEditPart.VISUAL_ID:
		case SimpleAttributeEditPart.VISUAL_ID:
		case ContainmentAssociationEditPart.VISUAL_ID:
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
			return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
