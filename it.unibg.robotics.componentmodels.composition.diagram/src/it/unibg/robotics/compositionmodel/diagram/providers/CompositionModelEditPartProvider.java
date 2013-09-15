package it.unibg.robotics.compositionmodel.diagram.providers;

import it.unibg.robotics.compositionmodel.diagram.edit.parts.CompositionModelEditPartFactory;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class CompositionModelEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public CompositionModelEditPartProvider() {
		super(new CompositionModelEditPartFactory(),
				CompositionModelVisualIDRegistry.TYPED_INSTANCE,
				SystemEditPart.MODEL_ID);
	}
}
