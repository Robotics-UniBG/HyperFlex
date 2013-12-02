/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.policies.RobotEndPointCanonicalEditPolicy;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.policies.RobotEndPointItemSemanticEditPolicy;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class RobotEndPointEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3038;

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
	public RobotEndPointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						RapyutaComponentModelVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RobotEndPointItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new RobotEndPointCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (RapyutaComponentModelVisualIDRegistry
						.getVisualID(childView)) {
				case EndPointPublisherEditPart.VISUAL_ID:
				case EndPointSubscriberEditPart.VISUAL_ID:
				case EndPointSrvServerEditPart.VISUAL_ID:
				case EndPointSrvClientEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
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
		return primaryShape = new EndPointFigure();
	}

	/**
	 * @generated
	 */
	public EndPointFigure getPrimaryShape() {
		return (EndPointFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RobotEndPointNameEditPart) {
			((RobotEndPointNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEndPointNameLabel());
			return true;
		}
		if (childEditPart instanceof RobotEndPointEndPointPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureEndPointProperties();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((RobotEndPointEndPointPropertiesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof EndPointPublisherEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((EndPointPublisherEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof EndPointSubscriberEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((EndPointSubscriberEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof EndPointSrvServerEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((EndPointSrvServerEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof EndPointSrvClientEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((EndPointSrvClientEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RobotEndPointNameEditPart) {
			return true;
		}
		if (childEditPart instanceof RobotEndPointEndPointPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureEndPointProperties();
			pane.remove(((RobotEndPointEndPointPropertiesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof EndPointPublisherEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((EndPointPublisherEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EndPointSubscriberEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((EndPointSubscriberEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EndPointSrvServerEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((EndPointSrvServerEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EndPointSrvClientEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((EndPointSrvClientEditPart) childEditPart).getFigure());
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
		if (editPart instanceof RobotEndPointEndPointPropertiesCompartmentEditPart) {
			return getPrimaryShape().getFigureEndPointProperties();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
	protected NodeFigure createMainFigure() {
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
		return getChildBySemanticHint(RapyutaComponentModelVisualIDRegistry
				.getType(RobotEndPointNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == RapyutaComponentModelElementTypes.EndPointParameter_3018) {
				return getChildBySemanticHint(RapyutaComponentModelVisualIDRegistry
						.getType(RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class EndPointFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureEndPointProperties;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEndPointNameLabel;

		/**
		 * @generated
		 */
		public EndPointFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure endPointInfo0 = new RectangleFigure();

			endPointInfo0.setBackgroundColor(ColorConstants.orange);

			endPointInfo0.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			GridData constraintEndPointInfo0 = new GridData();
			constraintEndPointInfo0.verticalAlignment = GridData.BEGINNING;
			constraintEndPointInfo0.horizontalAlignment = GridData.FILL;
			constraintEndPointInfo0.horizontalIndent = 0;
			constraintEndPointInfo0.horizontalSpan = 1;
			constraintEndPointInfo0.verticalSpan = 1;
			constraintEndPointInfo0.grabExcessHorizontalSpace = true;
			constraintEndPointInfo0.grabExcessVerticalSpace = false;
			this.add(endPointInfo0, constraintEndPointInfo0);

			GridLayout layoutEndPointInfo0 = new GridLayout();
			layoutEndPointInfo0.numColumns = 1;
			layoutEndPointInfo0.makeColumnsEqualWidth = true;
			endPointInfo0.setLayoutManager(layoutEndPointInfo0);

			fFigureEndPointNameLabel = new WrappingLabel();

			fFigureEndPointNameLabel.setText("<É>");

			fFigureEndPointNameLabel.setFont(FFIGUREENDPOINTNAMELABEL_FONT);

			GridData constraintFFigureEndPointNameLabel = new GridData();
			constraintFFigureEndPointNameLabel.verticalAlignment = GridData.BEGINNING;
			constraintFFigureEndPointNameLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureEndPointNameLabel.horizontalIndent = 0;
			constraintFFigureEndPointNameLabel.horizontalSpan = 1;
			constraintFFigureEndPointNameLabel.verticalSpan = 1;
			constraintFFigureEndPointNameLabel.grabExcessHorizontalSpace = false;
			constraintFFigureEndPointNameLabel.grabExcessVerticalSpace = false;
			endPointInfo0.add(fFigureEndPointNameLabel,
					constraintFFigureEndPointNameLabel);

			fFigureEndPointProperties = new RectangleFigure();

			GridData constraintFFigureEndPointProperties = new GridData();
			constraintFFigureEndPointProperties.verticalAlignment = GridData.FILL;
			constraintFFigureEndPointProperties.horizontalAlignment = GridData.FILL;
			constraintFFigureEndPointProperties.horizontalIndent = 0;
			constraintFFigureEndPointProperties.horizontalSpan = 1;
			constraintFFigureEndPointProperties.verticalSpan = 1;
			constraintFFigureEndPointProperties.grabExcessHorizontalSpace = true;
			constraintFFigureEndPointProperties.grabExcessVerticalSpace = true;
			this.add(fFigureEndPointProperties,
					constraintFFigureEndPointProperties);

			fFigureEndPointProperties.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureEndPointProperties() {
			return fFigureEndPointProperties;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEndPointNameLabel() {
			return fFigureEndPointNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREENDPOINTNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.BOLD);

}
