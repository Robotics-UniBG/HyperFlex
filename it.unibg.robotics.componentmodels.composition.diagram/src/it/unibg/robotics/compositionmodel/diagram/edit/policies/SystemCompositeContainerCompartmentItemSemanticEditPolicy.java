package it.unibg.robotics.compositionmodel.diagram.edit.policies;

import it.unibg.robotics.compositionmodel.diagram.edit.commands.SystemCompositeCreateCommand;
import it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SystemCompositeContainerCompartmentItemSemanticEditPolicy extends
		CompositionModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemCompositeContainerCompartmentItemSemanticEditPolicy() {
		super(CompositionModelElementTypes.System_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CompositionModelElementTypes.SystemComposite_3009 == req
				.getElementType()) {
			return getGEFWrapper(new SystemCompositeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
