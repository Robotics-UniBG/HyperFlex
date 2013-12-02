/*
 * Variability Analysis And Resolution Plugins (VARP)
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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package it.unibg.robotics.orocoscomponentmodel.diagram.edit.policies;

import it.unibg.robotics.orocoscomponentmodel.diagram.edit.commands.CompOperation3CreateCommand;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.commands.CompOperationReorientCommand;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.commands.PeersConnectionCreateCommand;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.commands.PeersConnectionReorientCommand;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;
import it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CompOperationItemSemanticEditPolicy extends
		OrocosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompOperationItemSemanticEditPolicy() {
		super(OrocosComponentModelElementTypes.CompOperation_3012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (OrocosComponentModelVisualIDRegistry.getVisualID(incomingLink) == PeersConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (OrocosComponentModelVisualIDRegistry.getVisualID(incomingLink) == CompOperation3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
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
		if (OrocosComponentModelElementTypes.PeersConnection_4007 == req
				.getElementType()) {
			return null;
		}
		if (OrocosComponentModelElementTypes.CompOperation_4008 == req
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
		if (OrocosComponentModelElementTypes.PeersConnection_4007 == req
				.getElementType()) {
			return getGEFWrapper(new PeersConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (OrocosComponentModelElementTypes.CompOperation_4008 == req
				.getElementType()) {
			return getGEFWrapper(new CompOperation3CreateCommand(req,
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
		case PeersConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new PeersConnectionReorientCommand(req));
		case CompOperation3EditPart.VISUAL_ID:
			return getGEFWrapper(new CompOperationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
