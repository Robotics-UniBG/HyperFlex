package org.hyperflex.ui.perspectives;


import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.progress.IProgressConstants;
import org.hyperflex.featuremodels.ui.views.ConstraintView;
import org.hyperflex.featuremodels.ui.views.InstanceView;

public class HyperFlexPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();

		IFolderLayout folder = layout.createFolder("left", IPageLayout.LEFT, 0.25f, editorArea); //$NON-NLS-1$
		folder.addView("org.eclipse.ui.navigator.ProjectExplorer"); //$NON-NLS-1$
		folder.addPlaceholder(IPageLayout.ID_PROJECT_EXPLORER);

		IFolderLayout outputfolder = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.75f, editorArea); //$NON-NLS-1$
		outputfolder.addView(IPageLayout.ID_PROP_SHEET);
		outputfolder.addView(IPageLayout.ID_PROBLEM_VIEW);
		outputfolder.addView(InstanceView.ID);
		outputfolder.addView(ConstraintView.ID);
		outputfolder.addPlaceholder(IPageLayout.ID_BOOKMARKS);
		outputfolder.addPlaceholder(IProgressConstants.PROGRESS_VIEW_ID);

		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.75f, "left"); //$NON-NLS-1$ //$NON-NLS-2$
		bottomLeft.addView(IPageLayout.ID_OUTLINE);

		// views - standard workbench
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
		layout.addShowViewShortcut(IProgressConstants.PROGRESS_VIEW_ID);
		layout.addShowViewShortcut(InstanceView.ID);
		layout.addShowViewShortcut(ConstraintView.ID);
	}
}
