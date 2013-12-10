package org.hyperflex.roscomponentmodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.hyperflex.roscomponentmodel.diagram.edit.policies.CompositeMsgInterfaceExposed2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class CompositeMsgInterfaceExposed2EditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public CompositeMsgInterfaceExposed2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeMsgInterfaceExposed2ItemSemanticEditPolicy());
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
		return new ExposeConsumerConnectionFigure();
	}

	/**
	 * @generated
	 */
	public ExposeConsumerConnectionFigure getPrimaryShape() {
		return (ExposeConsumerConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExposeConsumerConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureExposeConsumerConnectionLabel;

		/**
		 * @generated
		 */
		public ExposeConsumerConnectionFigure() {
			this.setLineStyle(Graphics.LINE_DOT);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureExposeConsumerConnectionLabel = new WrappingLabel();

			fFigureExposeConsumerConnectionLabel.setText("");

			fFigureExposeConsumerConnectionLabel
					.setFont(FFIGUREEXPOSECONSUMERCONNECTIONLABEL_FONT);

			this.add(fFigureExposeConsumerConnectionLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureExposeConsumerConnectionLabel() {
			return fFigureExposeConsumerConnectionLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREEXPOSECONSUMERCONNECTIONLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.NORMAL);

}
