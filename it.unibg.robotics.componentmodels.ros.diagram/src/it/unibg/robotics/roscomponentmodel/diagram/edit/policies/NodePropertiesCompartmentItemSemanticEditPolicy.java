package it.unibg.robotics.roscomponentmodel.diagram.edit.policies;

import it.unibg.robotics.roscomponentmodel.diagram.edit.commands.NodePropertyCreateCommand;
import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

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
		super(RosComponentModelElementTypes.Node_3001);
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
