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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.policies.Topic2ItemSemanticEditPolicy;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class Topic2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3075;

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
	public Topic2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Topic2ItemSemanticEditPolicy());
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
		return primaryShape = new Channel1Figure();
	}

	/**
	 * @generated
	 */
	public Channel1Figure getPrimaryShape() {
		return (Channel1Figure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TopicName2EditPart) {
			((TopicName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureChannel1NameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TopicName2EditPart) {
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
		return getChildBySemanticHint(RapyutaComponentModelVisualIDRegistry
				.getType(TopicName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011);
		types.add(RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012);
		types.add(RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013);
		types.add(RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011) {
			types.add(RapyutaComponentModelElementTypes.NodePublisher_3043);
			types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3044);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
			types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3059);
			types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3060);
			types.add(RapyutaComponentModelElementTypes.NodePublisher_3065);
			types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3066);
			types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3071);
			types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3072);
		} else if (relationshipType == RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012) {
			types.add(RapyutaComponentModelElementTypes.NodePublisher_3043);
			types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3044);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
			types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3059);
			types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3060);
			types.add(RapyutaComponentModelElementTypes.NodePublisher_3065);
			types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3066);
			types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3071);
			types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3072);
		} else if (relationshipType == RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013) {
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
		} else if (relationshipType == RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014) {
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Channel1Figure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureChannel1NameLabel;

		/**
		 * @generated
		 */
		public Channel1Figure() {
			this.setLayoutManager(new StackLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBackgroundColor(ColorConstants.lightGreen);
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(50),
					getMapMode().DPtoLP(20)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(50),
					getMapMode().DPtoLP(20)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureChannel1NameLabel = new WrappingLabel();

			fFigureChannel1NameLabel.setText("<É>");

			fFigureChannel1NameLabel.setFont(FFIGURECHANNEL1NAMELABEL_FONT);

			this.add(fFigureChannel1NameLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureChannel1NameLabel() {
			return fFigureChannel1NameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECHANNEL1NAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.NORMAL);

}
