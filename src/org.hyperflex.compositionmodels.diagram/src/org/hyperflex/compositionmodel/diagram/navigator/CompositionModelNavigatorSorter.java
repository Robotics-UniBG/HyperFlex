package org.hyperflex.compositionmodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;

/**
 * @generated
 */
public class CompositionModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

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
