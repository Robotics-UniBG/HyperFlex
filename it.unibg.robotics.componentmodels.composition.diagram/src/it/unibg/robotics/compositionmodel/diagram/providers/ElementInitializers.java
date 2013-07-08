package it.unibg.robotics.compositionmodel.diagram.providers;

import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CompositionModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			CompositionModelDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
