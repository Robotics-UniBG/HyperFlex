/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.featuremodels.model.diagram.part;

import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureLowerBoundUpperBoundEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureModelEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureName2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureNameEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.SimpleAttributeEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.SimpleAttributeNameEditPart;
import it.unibg.robotics.featuremodels.model.diagram.expressions.FeatureModelOCLFactory;

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
public class FeatureModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "it.unibg.robotics.featuremodels.model.diagram/debug/visualID"; //$NON-NLS-1$

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
		return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
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
		if (featureModel.featureModelPackage.eINSTANCE.getFeatureModel()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((featureModel.FeatureModel) domainElement)) {
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
		String containerModelID = it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
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
			if (featureModel.featureModelPackage.eINSTANCE.getFeature()
					.isSuperTypeOf(domainElement.eClass())
					&& isFeature_2001((featureModel.Feature) domainElement)) {
				return FeatureEditPart.VISUAL_ID;
			}
			if (featureModel.featureModelPackage.eINSTANCE.getFeature()
					.isSuperTypeOf(domainElement.eClass())
					&& isFeature_2002((featureModel.Feature) domainElement)) {
				return Feature2EditPart.VISUAL_ID;
			}
			if (featureModel.featureModelPackage.eINSTANCE
					.getCompositeFeature()
					.isSuperTypeOf(domainElement.eClass())
					&& isCompositeFeature_2003((featureModel.CompositeFeature) domainElement)) {
				return CompositeFeatureEditPart.VISUAL_ID;
			}
			if (featureModel.featureModelPackage.eINSTANCE.getSimpleAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleAttributeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FeatureModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
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
			if (CompositeFeatureEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case CompositeFeatureEditPart.VISUAL_ID:
			if (CompositeFeatureLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleAttributeEditPart.VISUAL_ID:
			if (SimpleAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(featureModel.FeatureModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isFeature_2001(featureModel.Feature domainElement) {
		Object result = FeatureModelOCLFactory.getExpression(0,
				featureModel.featureModelPackage.eINSTANCE.getFeature(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFeature_2002(featureModel.Feature domainElement) {
		Object result = FeatureModelOCLFactory.getExpression(1,
				featureModel.featureModelPackage.eINSTANCE.getFeature(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCompositeFeature_2003(
			featureModel.CompositeFeature domainElement) {
		Object result = FeatureModelOCLFactory.getExpression(
				2,
				featureModel.featureModelPackage.eINSTANCE
						.getCompositeFeature(), null).evaluate(domainElement);
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
		case Feature2EditPart.VISUAL_ID:
		case CompositeFeatureEditPart.VISUAL_ID:
		case SimpleAttributeEditPart.VISUAL_ID:
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
			return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
