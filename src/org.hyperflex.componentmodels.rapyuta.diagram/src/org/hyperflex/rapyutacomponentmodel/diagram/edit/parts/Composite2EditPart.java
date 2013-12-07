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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.policies.Composite2CanonicalEditPolicy;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.policies.Composite2ItemSemanticEditPolicy;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class Composite2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3081;

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
	public Composite2EditPart(View view) {
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
				new Composite2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new Composite2CanonicalEditPolicy());
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
				case CompositePublisher2EditPart.VISUAL_ID:
				case CompositeSubscriber2EditPart.VISUAL_ID:
				case CompositeSrvServer2EditPart.VISUAL_ID:
				case CompositeSrvClient2EditPart.VISUAL_ID:
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
		return primaryShape = new CompositeFigure();
	}

	/**
	 * @generated
	 */
	public CompositeFigure getPrimaryShape() {
		return (CompositeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeName2EditPart) {
			((CompositeName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigurePackageNameLabel());
			return true;
		}
		if (childEditPart instanceof CompositePublisher2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompositePublisher2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CompositeSubscriber2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompositeSubscriber2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CompositeSrvServer2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompositeSrvServer2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CompositeSrvClient2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((CompositeSrvClient2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeName2EditPart) {
			return true;
		}
		if (childEditPart instanceof CompositePublisher2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompositePublisher2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CompositeSubscriber2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompositeSubscriber2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CompositeSrvServer2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompositeSrvServer2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CompositeSrvClient2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CompositeSrvClient2EditPart) childEditPart).getFigure());
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
				.getType(CompositeName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class CompositeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompositeProperties;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePackageNameLabel;

		/**
		 * @generated
		 */
		public CompositeFigure() {

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

			RectangleFigure compositeInfo0 = new RectangleFigure();

			compositeInfo0.setBackgroundColor(ColorConstants.lightBlue);

			compositeInfo0.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			GridData constraintCompositeInfo0 = new GridData();
			constraintCompositeInfo0.verticalAlignment = GridData.BEGINNING;
			constraintCompositeInfo0.horizontalAlignment = GridData.FILL;
			constraintCompositeInfo0.horizontalIndent = 0;
			constraintCompositeInfo0.horizontalSpan = 1;
			constraintCompositeInfo0.verticalSpan = 1;
			constraintCompositeInfo0.grabExcessHorizontalSpace = true;
			constraintCompositeInfo0.grabExcessVerticalSpace = false;
			this.add(compositeInfo0, constraintCompositeInfo0);

			GridLayout layoutCompositeInfo0 = new GridLayout();
			layoutCompositeInfo0.numColumns = 1;
			layoutCompositeInfo0.makeColumnsEqualWidth = true;
			compositeInfo0.setLayoutManager(layoutCompositeInfo0);

			fFigurePackageNameLabel = new WrappingLabel();

			fFigurePackageNameLabel.setText("<?>");

			fFigurePackageNameLabel.setFont(FFIGUREPACKAGENAMELABEL_FONT);

			GridData constraintFFigurePackageNameLabel = new GridData();
			constraintFFigurePackageNameLabel.verticalAlignment = GridData.BEGINNING;
			constraintFFigurePackageNameLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigurePackageNameLabel.horizontalIndent = 0;
			constraintFFigurePackageNameLabel.horizontalSpan = 1;
			constraintFFigurePackageNameLabel.verticalSpan = 1;
			constraintFFigurePackageNameLabel.grabExcessHorizontalSpace = false;
			constraintFFigurePackageNameLabel.grabExcessVerticalSpace = false;
			compositeInfo0.add(fFigurePackageNameLabel,
					constraintFFigurePackageNameLabel);

			WrappingLabel compositeLabel1 = new WrappingLabel();

			compositeLabel1.setText("Composite");

			compositeLabel1.setFont(COMPOSITELABEL1_FONT);

			GridData constraintCompositeLabel1 = new GridData();
			constraintCompositeLabel1.verticalAlignment = GridData.BEGINNING;
			constraintCompositeLabel1.horizontalAlignment = GridData.BEGINNING;
			constraintCompositeLabel1.horizontalIndent = 0;
			constraintCompositeLabel1.horizontalSpan = 1;
			constraintCompositeLabel1.verticalSpan = 1;
			constraintCompositeLabel1.grabExcessHorizontalSpace = false;
			constraintCompositeLabel1.grabExcessVerticalSpace = false;
			compositeInfo0.add(compositeLabel1, constraintCompositeLabel1);

			fFigureCompositeProperties = new RectangleFigure();

			GridData constraintFFigureCompositeProperties = new GridData();
			constraintFFigureCompositeProperties.verticalAlignment = GridData.FILL;
			constraintFFigureCompositeProperties.horizontalAlignment = GridData.FILL;
			constraintFFigureCompositeProperties.horizontalIndent = 0;
			constraintFFigureCompositeProperties.horizontalSpan = 1;
			constraintFFigureCompositeProperties.verticalSpan = 1;
			constraintFFigureCompositeProperties.grabExcessHorizontalSpace = true;
			constraintFFigureCompositeProperties.grabExcessVerticalSpace = true;
			this.add(fFigureCompositeProperties,
					constraintFFigureCompositeProperties);

			fFigureCompositeProperties.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompositeProperties() {
			return fFigureCompositeProperties;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePackageNameLabel() {
			return fFigurePackageNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPACKAGENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font COMPOSITELABEL1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(),
			15, SWT.BOLD);

}
