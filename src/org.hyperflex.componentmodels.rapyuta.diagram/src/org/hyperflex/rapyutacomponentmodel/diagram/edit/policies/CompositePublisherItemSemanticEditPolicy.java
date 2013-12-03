/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeMsgInterfaceExposed2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeMsgInterfaceExposed2ReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeMsgInterfaceExposedCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeMsgInterfaceExposedReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.MsgInterfaceConnection2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.MsgInterfaceConnection2ReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.MsgInterfaceConnectionCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.MsgInterfaceConnectionReorientCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class CompositePublisherItemSemanticEditPolicy extends
		RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositePublisherItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.CompositePublisher_3048);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == MsgInterfaceConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == MsgInterfaceConnection2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == CompositeMsgInterfaceExposedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RapyutaComponentModelVisualIDRegistry.getVisualID(outgoingLink) == CompositeMsgInterfaceExposed2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
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
		if (RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011 == req
				.getElementType()) {
			return getGEFWrapper(new MsgInterfaceConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012 == req
				.getElementType()) {
			return getGEFWrapper(new MsgInterfaceConnection2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeMsgInterfaceExposedCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeMsgInterfaceExposed2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011 == req
				.getElementType()) {
			return null;
		}
		if (RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012 == req
				.getElementType()) {
			return null;
		}
		if (RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013 == req
				.getElementType()) {
			return null;
		}
		if (RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new MsgInterfaceConnectionReorientCommand(req));
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getGEFWrapper(new MsgInterfaceConnection2ReorientCommand(req));
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeMsgInterfaceExposedReorientCommand(
					req));
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeMsgInterfaceExposed2ReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
