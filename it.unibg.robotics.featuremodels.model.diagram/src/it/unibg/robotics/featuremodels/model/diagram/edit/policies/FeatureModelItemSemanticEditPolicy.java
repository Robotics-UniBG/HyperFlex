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
package it.unibg.robotics.featuremodels.model.diagram.edit.policies;

import it.unibg.robotics.featuremodels.model.diagram.edit.commands.CompositeFeatureCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.Feature2CreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.SimpleAttributeCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.providers.FeatureModelElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class FeatureModelItemSemanticEditPolicy extends
		FeatureModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FeatureModelItemSemanticEditPolicy() {
		super(FeatureModelElementTypes.FeatureModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FeatureModelElementTypes.Feature_2001 == req.getElementType()) {
			return getGEFWrapper(new FeatureCreateCommand(req));
		}
		if (FeatureModelElementTypes.Feature_2002 == req.getElementType()) {
			return getGEFWrapper(new Feature2CreateCommand(req));
		}
		if (FeatureModelElementTypes.CompositeFeature_2003 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeFeatureCreateCommand(req));
		}
		if (FeatureModelElementTypes.SimpleAttribute_2004 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
