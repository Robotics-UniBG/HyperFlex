package org.hyperflex.roscomponentmodel.diagram.providers;

import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.RosComponentModelEditPartFactory;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class RosComponentModelEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public RosComponentModelEditPartProvider() {
		super(new RosComponentModelEditPartFactory(),
				RosComponentModelVisualIDRegistry.TYPED_INSTANCE,
				ArchitectureModelEditPart.MODEL_ID);
	}
}
