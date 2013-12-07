package org.hyperflex.roscomponentmodel.diagram.providers;

import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;

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
