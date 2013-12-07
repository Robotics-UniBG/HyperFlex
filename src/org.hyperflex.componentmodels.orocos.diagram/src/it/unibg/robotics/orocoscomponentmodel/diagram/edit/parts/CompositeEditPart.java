/*
 * HyperFlex Plugins (VARP)
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
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
package it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts;

import it.unibg.robotics.orocoscomponentmodel.diagram.edit.policies.CompositeCanonicalEditPolicy;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.policies.CompositeItemSemanticEditPolicy;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;
import it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
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

/**
 * @generated
 */
public class CompositeEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public CompositeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						OrocosComponentModelVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeCanonicalEditPolicy());
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
				switch (OrocosComponentModelVisualIDRegistry
						.getVisualID(childView)) {
				case CompInputPort2EditPart.VISUAL_ID:
				case CompOutputPort2EditPart.VISUAL_ID:
				case CompOperation2EditPart.VISUAL_ID:
				case CompOperationCaller2EditPart.VISUAL_ID:
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
		return primaryShape = new CompositeContainerFigure();
	}

	/**
	 * @generated
	 */
	public CompositeContainerFigure getPrimaryShape() {
		return (CompositeContainerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeNameEditPart) {
			((CompositeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigurePackageContainerNameLabel());
			return true;
		}
		if (childEditPart instanceof CompositeCompositeContainerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompositeContainerComponentsArea();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CompositeCompositeContainerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof CompInputPort2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompInputPort2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CompOutputPort2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompOutputPort2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CompOperation2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompOperation2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CompOperationCaller2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompOperationCaller2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof CompositeCompositeContainerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompositeContainerComponentsArea();
			pane.remove(((CompositeCompositeContainerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof CompInputPort2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompInputPort2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CompOutputPort2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompOutputPort2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CompOperation2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompOperation2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CompOperationCaller2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompOperationCaller2EditPart) childEditPart).getFigure());
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
		if (editPart instanceof CompositeCompositeContainerCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureCompositeContainerComponentsArea();
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
		return getChildBySemanticHint(OrocosComponentModelVisualIDRegistry
				.getType(CompositeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(OrocosComponentModelElementTypes.CompOutputPort_4004);
		types.add(OrocosComponentModelElementTypes.CompInputPort_4005);
		types.add(OrocosComponentModelElementTypes.CompOperation_4008);
		types.add(OrocosComponentModelElementTypes.CompOperationCaller_4009);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TCOutputDataPortEditPart) {
			types.add(OrocosComponentModelElementTypes.CompOutputPort_4004);
		}
		if (targetEditPart instanceof CompOutputPortEditPart) {
			types.add(OrocosComponentModelElementTypes.CompOutputPort_4004);
		}
		if (targetEditPart instanceof CompOutputPort2EditPart) {
			types.add(OrocosComponentModelElementTypes.CompOutputPort_4004);
		}
		if (targetEditPart instanceof TCInputDataPortEditPart) {
			types.add(OrocosComponentModelElementTypes.CompInputPort_4005);
		}
		if (targetEditPart instanceof CompInputPortEditPart) {
			types.add(OrocosComponentModelElementTypes.CompInputPort_4005);
		}
		if (targetEditPart instanceof CompInputPort2EditPart) {
			types.add(OrocosComponentModelElementTypes.CompInputPort_4005);
		}
		if (targetEditPart instanceof TCOperationEditPart) {
			types.add(OrocosComponentModelElementTypes.CompOperation_4008);
		}
		if (targetEditPart instanceof CompOperationEditPart) {
			types.add(OrocosComponentModelElementTypes.CompOperation_4008);
		}
		if (targetEditPart instanceof CompOperation2EditPart) {
			types.add(OrocosComponentModelElementTypes.CompOperation_4008);
		}
		if (targetEditPart instanceof TCOperationCallerEditPart) {
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_4009);
		}
		if (targetEditPart instanceof CompOperationCallerEditPart) {
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_4009);
		}
		if (targetEditPart instanceof CompOperationCaller2EditPart) {
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_4009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == OrocosComponentModelElementTypes.CompOutputPort_4004) {
			types.add(OrocosComponentModelElementTypes.TCOutputDataPort_3003);
			types.add(OrocosComponentModelElementTypes.CompOutputPort_3007);
			types.add(OrocosComponentModelElementTypes.CompOutputPort_3009);
		} else if (relationshipType == OrocosComponentModelElementTypes.CompInputPort_4005) {
			types.add(OrocosComponentModelElementTypes.TCInputDataPort_3002);
			types.add(OrocosComponentModelElementTypes.CompInputPort_3006);
			types.add(OrocosComponentModelElementTypes.CompInputPort_3008);
		} else if (relationshipType == OrocosComponentModelElementTypes.CompOperation_4008) {
			types.add(OrocosComponentModelElementTypes.TCOperation_3010);
			types.add(OrocosComponentModelElementTypes.CompOperation_3012);
			types.add(OrocosComponentModelElementTypes.CompOperation_3014);
		} else if (relationshipType == OrocosComponentModelElementTypes.CompOperationCaller_4009) {
			types.add(OrocosComponentModelElementTypes.TCOperationCaller_3011);
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_3013);
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_3015);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CompositeContainerFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompositeContainerComponentsArea;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePackageContainerNameLabel;

		/**
		 * @generated
		 */
		public CompositeContainerFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePackageContainerNameLabel = new WrappingLabel();

			fFigurePackageContainerNameLabel.setText("<?>");

			fFigurePackageContainerNameLabel
					.setFont(FFIGUREPACKAGECONTAINERNAMELABEL_FONT);

			fFigurePackageContainerNameLabel.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigurePackageContainerNameLabel);

			fFigureCompositeContainerComponentsArea = new RectangleFigure();

			fFigureCompositeContainerComponentsArea.setLineWidth(0);

			this.add(fFigureCompositeContainerComponentsArea);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompositeContainerComponentsArea() {
			return fFigureCompositeContainerComponentsArea;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePackageContainerNameLabel() {
			return fFigurePackageContainerNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPACKAGECONTAINERNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.BOLD);

}
