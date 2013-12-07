/*
 * HyperFlex Plugins (VARP)
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
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
package it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts;

import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class OrocosComponentModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {

			case SystemEditPart.VISUAL_ID:
				return new SystemEditPart(view);

			case CompositeEditPart.VISUAL_ID:
				return new CompositeEditPart(view);

			case CompositeNameEditPart.VISUAL_ID:
				return new CompositeNameEditPart(view);

			case TaskContextEditPart.VISUAL_ID:
				return new TaskContextEditPart(view);

			case TaskContextNameEditPart.VISUAL_ID:
				return new TaskContextNameEditPart(view);

			case TCInputDataPortEditPart.VISUAL_ID:
				return new TCInputDataPortEditPart(view);

			case TCOutputDataPortEditPart.VISUAL_ID:
				return new TCOutputDataPortEditPart(view);

			case TCPropertyEditPart.VISUAL_ID:
				return new TCPropertyEditPart(view);

			case TCPropertyNameEditPart.VISUAL_ID:
				return new TCPropertyNameEditPart(view);

			case TCOperationEditPart.VISUAL_ID:
				return new TCOperationEditPart(view);

			case TCOperationCallerEditPart.VISUAL_ID:
				return new TCOperationCallerEditPart(view);

			case Composite2EditPart.VISUAL_ID:
				return new Composite2EditPart(view);

			case CompositeName2EditPart.VISUAL_ID:
				return new CompositeName2EditPart(view);

			case CompInputPortEditPart.VISUAL_ID:
				return new CompInputPortEditPart(view);

			case CompOutputPortEditPart.VISUAL_ID:
				return new CompOutputPortEditPart(view);

			case CompOperationEditPart.VISUAL_ID:
				return new CompOperationEditPart(view);

			case CompOperationCallerEditPart.VISUAL_ID:
				return new CompOperationCallerEditPart(view);

			case CompInputPort2EditPart.VISUAL_ID:
				return new CompInputPort2EditPart(view);

			case CompOutputPort2EditPart.VISUAL_ID:
				return new CompOutputPort2EditPart(view);

			case CompOperation2EditPart.VISUAL_ID:
				return new CompOperation2EditPart(view);

			case CompOperationCaller2EditPart.VISUAL_ID:
				return new CompOperationCaller2EditPart(view);

			case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
				return new CompositeCompositeContainerCompartmentEditPart(view);

			case TaskContextPropertiesCompartmentEditPart.VISUAL_ID:
				return new TaskContextPropertiesCompartmentEditPart(view);

			case ConnectionPolicyEditPart.VISUAL_ID:
				return new ConnectionPolicyEditPart(view);

			case ConnectionPolicyNameEditPart.VISUAL_ID:
				return new ConnectionPolicyNameEditPart(view);

			case CompOutputPort3EditPart.VISUAL_ID:
				return new CompOutputPort3EditPart(view);

			case CompOutputPortNameEditPart.VISUAL_ID:
				return new CompOutputPortNameEditPart(view);

			case CompInputPort3EditPart.VISUAL_ID:
				return new CompInputPort3EditPart(view);

			case CompInputPortNameEditPart.VISUAL_ID:
				return new CompInputPortNameEditPart(view);

			case PeersConnectionEditPart.VISUAL_ID:
				return new PeersConnectionEditPart(view);

			case PeersConnectionNameEditPart.VISUAL_ID:
				return new PeersConnectionNameEditPart(view);

			case CompOperation3EditPart.VISUAL_ID:
				return new CompOperation3EditPart(view);

			case CompOperationNameEditPart.VISUAL_ID:
				return new CompOperationNameEditPart(view);

			case CompOperationCaller3EditPart.VISUAL_ID:
				return new CompOperationCaller3EditPart(view);

			case CompOperationCallerNameEditPart.VISUAL_ID:
				return new CompOperationCallerNameEditPart(view);

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
