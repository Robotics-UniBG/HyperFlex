/*
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
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositePublisherCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeSrvClientCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeSrvServerCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeSubscriberCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class CompositeItemSemanticEditPolicy extends
		RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.Composite_3076);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RapyutaComponentModelElementTypes.CompositePublisher_3048 == req
				.getElementType()) {
			return getGEFWrapper(new CompositePublisherCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.CompositeSubscriber_3049 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeSubscriberCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.CompositeSrvServer_3050 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeSrvServerCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.CompositeSrvClient_3051 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeSrvClientCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (RapyutaComponentModelVisualIDRegistry.getVisualID(node)) {
			case CompositePublisherEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnectionEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnection2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeMsgInterfaceExposedEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeMsgInterfaceExposed2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case CompositeSubscriberEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnectionEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnection2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeMsgInterfaceExposedEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeMsgInterfaceExposed2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case CompositeSrvServerEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(incomingLink) == CompositeSrvConnectionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(incomingLink) == ContainerSrvConnectionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case CompositeSrvClientEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeSrvConnectionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RapyutaComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == ContainerSrvConnectionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
