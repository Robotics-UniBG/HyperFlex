package org.hyperflex.roscomponentmodel.diagram.edit.policies;

import org.hyperflex.roscomponentmodel.diagram.edit.commands.NodePropertyCreateCommand;
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class NodePropertiesCompartmentItemSemanticEditPolicy extends
		RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodePropertiesCompartmentItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.Node_3013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RosComponentModelElementTypes.NodeProperty_3012 == req
				.getElementType()) {
			return getGEFWrapper(new NodePropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
