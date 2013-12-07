/*
 * HyperFlex Plugins
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
package org.hyperflex.orocoscomponentmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.hyperflex.orocoscomponentmodel.diagram.edit.commands.CompInputPort3CreateCommand;
import org.hyperflex.orocoscomponentmodel.diagram.edit.commands.CompInputPortReorientCommand;
import org.hyperflex.orocoscomponentmodel.diagram.edit.commands.ConnectionPolicyCreateCommand;
import org.hyperflex.orocoscomponentmodel.diagram.edit.commands.ConnectionPolicyReorientCommand;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

/**
 * @generated
 */
public class CompInputPort3ItemSemanticEditPolicy extends
		OrocosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompInputPort3ItemSemanticEditPolicy() {
		super(OrocosComponentModelElementTypes.CompInputPort_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OrocosComponentModelElementTypes.ConnectionPolicy_4010 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectionPolicyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (OrocosComponentModelElementTypes.CompInputPort_4012 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OrocosComponentModelElementTypes.ConnectionPolicy_4010 == req
				.getElementType()) {
			return null;
		}
		if (OrocosComponentModelElementTypes.CompInputPort_4012 == req
				.getElementType()) {
			return getGEFWrapper(new CompInputPort3CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionPolicyReorientCommand(req));
		case CompInputPort3EditPart.VISUAL_ID:
			return getGEFWrapper(new CompInputPortReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
