package org.hyperflex.compositionmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.hyperflex.compositionmodel.diagram.edit.commands.ROSCompositeCreateCommand;
import org.hyperflex.compositionmodel.diagram.edit.commands.SystemCompositeCreateCommand;
import org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes;

/**
 * @generated
 */
public class SystemCompositeContainerCompartmentItemSemanticEditPolicy extends
		CompositionModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemCompositeContainerCompartmentItemSemanticEditPolicy() {
		super(CompositionModelElementTypes.System_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CompositionModelElementTypes.SystemComposite_3003 == req
				.getElementType()) {
			return getGEFWrapper(new SystemCompositeCreateCommand(req));
		}
		if (CompositionModelElementTypes.ROSComposite_3006 == req
				.getElementType()) {
			return getGEFWrapper(new ROSCompositeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
