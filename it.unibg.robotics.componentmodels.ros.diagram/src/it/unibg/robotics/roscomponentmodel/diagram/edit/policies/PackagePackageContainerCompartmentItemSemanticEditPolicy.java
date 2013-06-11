package it.unibg.robotics.roscomponentmodel.diagram.edit.policies;

import it.unibg.robotics.roscomponentmodel.diagram.edit.commands.NodeCreateCommand;
import it.unibg.robotics.roscomponentmodel.diagram.edit.commands.Package2CreateCommand;
import it.unibg.robotics.roscomponentmodel.diagram.edit.commands.TopicCreateCommand;
import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PackagePackageContainerCompartmentItemSemanticEditPolicy extends
		RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackagePackageContainerCompartmentItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.Package_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RosComponentModelElementTypes.Node_3001 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (RosComponentModelElementTypes.Package_3005 == req.getElementType()) {
			return getGEFWrapper(new Package2CreateCommand(req));
		}
		if (RosComponentModelElementTypes.Topic_3008 == req.getElementType()) {
			return getGEFWrapper(new TopicCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
