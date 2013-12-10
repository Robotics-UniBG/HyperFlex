package org.hyperflex.roscomponentmodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RosComponentModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RosComponentModelNavigatorItem) {
			RosComponentModelNavigatorItem item = (RosComponentModelNavigatorItem) element;
			return RosComponentModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
