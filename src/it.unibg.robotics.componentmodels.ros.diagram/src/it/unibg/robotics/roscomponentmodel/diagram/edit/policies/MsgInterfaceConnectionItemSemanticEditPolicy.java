package org.hyperflex.roscomponentmodel.diagram.edit.policies;

import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MsgInterfaceConnectionItemSemanticEditPolicy extends
		RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MsgInterfaceConnectionItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.MsgInterfaceConnection_4010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
