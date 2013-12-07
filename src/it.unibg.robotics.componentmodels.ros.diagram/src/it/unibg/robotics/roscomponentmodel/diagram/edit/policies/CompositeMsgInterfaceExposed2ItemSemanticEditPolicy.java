package org.hyperflex.roscomponentmodel.diagram.edit.policies;

import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class CompositeMsgInterfaceExposed2ItemSemanticEditPolicy extends
		RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeMsgInterfaceExposed2ItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
