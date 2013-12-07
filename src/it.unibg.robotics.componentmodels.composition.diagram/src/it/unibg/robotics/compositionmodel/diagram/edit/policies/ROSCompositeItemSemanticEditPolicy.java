package org.hyperflex.compositionmodel.diagram.edit.policies;

import org.hyperflex.compositionmodel.diagram.edit.commands.ROSMsgConsumerCreateCommand;
import org.hyperflex.compositionmodel.diagram.edit.commands.ROSMsgProducerCreateCommand;
import org.hyperflex.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSMsgConsumerEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSMsgProducerEditPart;
import org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;
import org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ROSCompositeItemSemanticEditPolicy extends
		CompositionModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ROSCompositeItemSemanticEditPolicy() {
		super(CompositionModelElementTypes.ROSComposite_3012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CompositionModelElementTypes.ROSMsgProducer_3013 == req
				.getElementType()) {
			return getGEFWrapper(new ROSMsgProducerCreateCommand(req));
		}
		if (CompositionModelElementTypes.ROSMsgConsumer_3014 == req
				.getElementType()) {
			return getGEFWrapper(new ROSMsgConsumerCreateCommand(req));
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
			switch (CompositionModelVisualIDRegistry.getVisualID(node)) {
			case ROSMsgProducerEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (CompositionModelVisualIDRegistry
							.getVisualID(incomingLink) == ConnectionEditPart.VISUAL_ID) {
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
			case ROSMsgConsumerEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (CompositionModelVisualIDRegistry
							.getVisualID(outgoingLink) == ConnectionEditPart.VISUAL_ID) {
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
