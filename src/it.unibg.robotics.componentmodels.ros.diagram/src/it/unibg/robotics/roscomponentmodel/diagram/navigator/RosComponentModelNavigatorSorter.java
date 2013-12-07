package org.hyperflex.roscomponentmodel.diagram.navigator;

import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class RosComponentModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7007;

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
