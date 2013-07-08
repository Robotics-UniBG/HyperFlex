package it.unibg.robotics.roscomponentmodel.diagram.edit.policies;

import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MsgInterfaceConnection2ItemSemanticEditPolicy extends
		RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MsgInterfaceConnection2ItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.MsgInterfaceConnection_4011);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
