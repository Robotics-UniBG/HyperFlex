package org.hyperflex.compositionmodel.diagram.providers;

import org.hyperflex.compositionmodel.diagram.edit.parts.CompositionModelEditPartFactory;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;

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
