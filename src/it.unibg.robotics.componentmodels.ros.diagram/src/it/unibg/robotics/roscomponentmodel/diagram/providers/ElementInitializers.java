package it.unibg.robotics.roscomponentmodel.diagram.providers;

import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;

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
		ElementInitializers cached = RosComponentModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			RosComponentModelDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
