package it.unibg.robotics.roscomponentmodel.diagram.providers;

import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.RosComponentModelEditPartFactory;
import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

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
