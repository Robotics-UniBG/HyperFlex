package org.hyperflex.roscomponentmodel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
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
import org.hyperflex.roscomponentmodel.diagram.edit.policies.MsgInterfaceConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class MsgInterfaceConnectionEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public MsgInterfaceConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MsgInterfaceConnectionItemSemanticEditPolicy());
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
		return new ProducerChannelConnectionFigure();
	}

	/**
	 * @generated
	 */
	public ProducerChannelConnectionFigure getPrimaryShape() {
		return (ProducerChannelConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ProducerChannelConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProducerChannelConnectionLabel;

		/**
		 * @generated
		 */
		public ProducerChannelConnectionFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProducerChannelConnectionLabel = new WrappingLabel();

			fFigureProducerChannelConnectionLabel.setText("");

			fFigureProducerChannelConnectionLabel
					.setFont(FFIGUREPRODUCERCHANNELCONNECTIONLABEL_FONT);

			this.add(fFigureProducerChannelConnectionLabel);

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
		public WrappingLabel getFigureProducerChannelConnectionLabel() {
			return fFigureProducerChannelConnectionLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPRODUCERCHANNELCONNECTIONLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.NORMAL);

}
