package it.unibg.robotics.roscomponentmodel.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class RosComponentModelDiagramActionBarContributor extends
		DiagramActionBarContributor {

	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return RosComponentModelDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return RosComponentModelDiagramEditor.ID;
	}

	/**
	 * @generated
	 */
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
}
