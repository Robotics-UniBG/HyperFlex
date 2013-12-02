package it.unibg.robotics.compositionmodel.diagram.navigator;

import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CompositionModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CompositionModelNavigatorItem) {
			CompositionModelNavigatorItem item = (CompositionModelNavigatorItem) element;
			return CompositionModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
