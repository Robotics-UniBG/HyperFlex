/*
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.hyperflex.featuremodels.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.hyperflex.featuremodels.ContainmentAssociation;
import org.hyperflex.featuremodels.diagram.edit.policies.ContainmentAssociationCanonicalEditPolicy;
import org.hyperflex.featuremodels.diagram.edit.policies.ContainmentAssociationItemSemanticEditPolicy;
import org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry;
import org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes;

/**
 * @generated
 */
public class ContainmentAssociationEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ContainmentAssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContainmentAssociationItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ContainmentAssociationCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ContainmentAssociationTriangleFig();
	}

	/**
	 * @generated
	 */
	public ContainmentAssociationTriangleFig getPrimaryShape() {
		return (ContainmentAssociationTriangleFig) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainmentAssociationLowerBoundUpperBoundEditPart) {
			((ContainmentAssociationLowerBoundUpperBoundEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContainmentAssociationTriangleLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainmentAssociationLowerBoundUpperBoundEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 35);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(FeatureModelVisualIDRegistry
				.getType(ContainmentAssociationLowerBoundUpperBoundEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013);
		types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013);
		}
		if (targetEditPart instanceof Feature2EditPart) {
			types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014);
		}
		if (targetEditPart instanceof Feature2EditPart) {
			types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013) {
			types.add(FeatureModelElementTypes.Feature_2005);
			types.add(FeatureModelElementTypes.Feature_2006);
		} else if (relationshipType == FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014) {
			types.add(FeatureModelElementTypes.Feature_2005);
			types.add(FeatureModelElementTypes.Feature_2006);
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {

		if (notification.getNotifier() instanceof ContainmentAssociation) {
			getPrimaryShape().updateColor();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	public class ContainmentAssociationTriangleFig extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContainmentAssociationTriangleLabel;

		/**
		 * @generated
		 */
		public ContainmentAssociationTriangleFig() {
			this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(35)));
			this.addPoint(new Point(getMapMode().DPtoLP(80), getMapMode()
					.DPtoLP(35)));
			this.setFill(true);
			this.setBackgroundColor(ColorConstants.lightGray);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(80),
					getMapMode().DPtoLP(35)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(80),
					getMapMode().DPtoLP(35)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(80),
					getMapMode().DPtoLP(35)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureContainmentAssociationTriangleLabel = new WrappingLabel();
			fFigureContainmentAssociationTriangleLabel.setText("");
			fFigureContainmentAssociationTriangleLabel
					.setAlignment(PositionConstants.CENTER);
			fFigureContainmentAssociationTriangleLabel.setTextWrap(true);
			updateColor();

			this.add(fFigureContainmentAssociationTriangleLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContainmentAssociationTriangleLabel() {
			return fFigureContainmentAssociationTriangleLabel;
		}

		/**
		 * @generated NOT
		 */
		public void updateColor() {

			ContainmentAssociation thisContainmentAssociation = (ContainmentAssociation) ((Node) ContainmentAssociationEditPart.this
					.getModel()).getElement();

			int upperBound = thisContainmentAssociation.getUpperBound();
			int lowerBound = thisContainmentAssociation.getLowerBound();

			if (lowerBound == 1 && upperBound == 1) {

				this.setBackgroundColor(ColorConstants.white);
				fFigureContainmentAssociationTriangleLabel
						.setForegroundColor(ColorConstants.darkGray);

			} else if ((lowerBound == 0 || lowerBound == 1)
					&& (upperBound == -1 || upperBound == thisContainmentAssociation
							.getSubFeatures().size())) {

				this.setBackgroundColor(ColorConstants.black);
				fFigureContainmentAssociationTriangleLabel
						.setForegroundColor(ColorConstants.lightGray);

			} else {

				this.setBackgroundColor(ColorConstants.lightGray);
				fFigureContainmentAssociationTriangleLabel
						.setForegroundColor(ColorConstants.black);

			}

		}

	}

}
