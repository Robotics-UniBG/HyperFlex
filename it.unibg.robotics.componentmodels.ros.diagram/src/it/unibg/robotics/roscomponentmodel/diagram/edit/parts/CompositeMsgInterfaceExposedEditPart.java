package it.unibg.robotics.roscomponentmodel.diagram.edit.parts;

import it.unibg.robotics.roscomponentmodel.diagram.edit.policies.CompositeMsgInterfaceExposedItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CompositeMsgInterfaceExposedEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public CompositeMsgInterfaceExposedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeMsgInterfaceExposedItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ChannelCompProducerConnectionFigure();
	}

	/**
	 * @generated
	 */
	public ChannelCompProducerConnectionFigure getPrimaryShape() {
		return (ChannelCompProducerConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ChannelCompProducerConnectionFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ChannelCompProducerConnectionFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			return df;
		}

	}

}
