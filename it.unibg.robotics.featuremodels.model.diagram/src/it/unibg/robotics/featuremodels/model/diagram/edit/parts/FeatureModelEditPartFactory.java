/*
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
package it.unibg.robotics.featuremodels.model.diagram.edit.parts;

import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class FeatureModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FeatureModelVisualIDRegistry.getVisualID(view)) {

			case FeatureModelEditPart.VISUAL_ID:
				return new FeatureModelEditPart(view);

			case FeatureEditPart.VISUAL_ID:
				return new FeatureEditPart(view);

			case FeatureNameEditPart.VISUAL_ID:
				return new FeatureNameEditPart(view);

			case Feature2EditPart.VISUAL_ID:
				return new Feature2EditPart(view);

			case FeatureName2EditPart.VISUAL_ID:
				return new FeatureName2EditPart(view);

			case CompositeFeatureEditPart.VISUAL_ID:
				return new CompositeFeatureEditPart(view);

			case CompositeFeatureLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new CompositeFeatureLowerBoundUpperBoundEditPart(view);

			case SimpleAttributeEditPart.VISUAL_ID:
				return new SimpleAttributeEditPart(view);

			case SimpleAttributeNameEditPart.VISUAL_ID:
				return new SimpleAttributeNameEditPart(view);

			case FeatureSubFeaturesEditPart.VISUAL_ID:
				return new FeatureSubFeaturesEditPart(view);

			case FeatureSubFeatures2EditPart.VISUAL_ID:
				return new FeatureSubFeatures2EditPart(view);

			case CompositeFeatureSubFeaturesEditPart.VISUAL_ID:
				return new CompositeFeatureSubFeaturesEditPart(view);

			case CompositeFeatureSubFeatures2EditPart.VISUAL_ID:
				return new CompositeFeatureSubFeatures2EditPart(view);

			case FeatureSubCompositeFeaturesEditPart.VISUAL_ID:
				return new FeatureSubCompositeFeaturesEditPart(view);

			case FeatureAttributesEditPart.VISUAL_ID:
				return new FeatureAttributesEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
