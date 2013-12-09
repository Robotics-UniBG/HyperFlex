package org.hyperflex.compositionmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes;

/**
 * @generated
 */
public class ConnectionItemSemanticEditPolicy extends
		CompositionModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionItemSemanticEditPolicy() {
		super(CompositionModelElementTypes.Connection_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
