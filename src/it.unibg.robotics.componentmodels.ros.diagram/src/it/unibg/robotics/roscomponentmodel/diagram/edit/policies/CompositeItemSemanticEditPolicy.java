/*
 * HyperFlex toolchain
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
package org.hyperflex.roscomponentmodel.diagram.edit.policies;

import org.hyperflex.roscomponentmodel.diagram.edit.commands.CompositeMsgConsumer2CreateCommand;
import org.hyperflex.roscomponentmodel.diagram.edit.commands.CompositeMsgProducer2CreateCommand;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

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

/**
 * @generated
 */
public class CompositeItemSemanticEditPolicy extends
		RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.Composite_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RosComponentModelElementTypes.CompositeMsgProducer_3017 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeMsgProducer2CreateCommand(req));
		}
		if (RosComponentModelElementTypes.CompositeMsgConsumer_3018 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeMsgConsumer2CreateCommand(req));
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
			switch (RosComponentModelVisualIDRegistry.getVisualID(node)) {
			case CompositeMsgProducer2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RosComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnectionEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RosComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnection2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RosComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeMsgInterfaceExposedEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RosComponentModelVisualIDRegistry
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
			case CompositeMsgConsumer2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RosComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnectionEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RosComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == MsgInterfaceConnection2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RosComponentModelVisualIDRegistry
							.getVisualID(outgoingLink) == CompositeMsgInterfaceExposedEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RosComponentModelVisualIDRegistry
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
			case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (RosComponentModelVisualIDRegistry
							.getVisualID(cnode)) {
					case NodeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Composite2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case TopicEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (RosComponentModelVisualIDRegistry
									.getVisualID(incomingLink) == MsgInterfaceConnectionEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (RosComponentModelVisualIDRegistry
									.getVisualID(incomingLink) == MsgInterfaceConnection2EditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (RosComponentModelVisualIDRegistry
									.getVisualID(incomingLink) == CompositeMsgInterfaceExposedEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (RosComponentModelVisualIDRegistry
									.getVisualID(incomingLink) == CompositeMsgInterfaceExposed2EditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

}
