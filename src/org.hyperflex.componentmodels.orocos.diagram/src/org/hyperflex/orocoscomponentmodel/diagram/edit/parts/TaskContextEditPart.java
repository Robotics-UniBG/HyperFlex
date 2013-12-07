/*
 * HyperFlex Plugins
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
package org.hyperflex.orocoscomponentmodel.diagram.edit.parts;

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
import org.hyperflex.orocoscomponentmodel.diagram.edit.policies.TaskContextCanonicalEditPolicy;
import org.hyperflex.orocoscomponentmodel.diagram.edit.policies.TaskContextItemSemanticEditPolicy;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

/**
 * @generated
 */
public class TaskContextEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3017;

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
	public TaskContextEditPart(View view) {
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
				new TaskContextItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TaskContextCanonicalEditPolicy());
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
				case TCInputDataPortEditPart.VISUAL_ID:
				case TCOutputDataPortEditPart.VISUAL_ID:
				case TCOperationEditPart.VISUAL_ID:
				case TCOperationCallerEditPart.VISUAL_ID:
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
		return primaryShape = new ComponentFigure();
	}

	/**
	 * @generated
	 */
	public ComponentFigure getPrimaryShape() {
		return (ComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TaskContextNameEditPart) {
			((TaskContextNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentNameLabel());
			return true;
		}
		if (childEditPart instanceof TaskContextPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentProperties();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TaskContextPropertiesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof TCInputDataPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((TCInputDataPortEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof TCOutputDataPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((TCOutputDataPortEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof TCOperationEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((TCOperationEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof TCOperationCallerEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((TCOperationCallerEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TaskContextNameEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskContextPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentProperties();
			pane.remove(((TaskContextPropertiesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof TCInputDataPortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((TCInputDataPortEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TCOutputDataPortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((TCOutputDataPortEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TCOperationEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((TCOperationEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TCOperationCallerEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((TCOperationCallerEditPart) childEditPart).getFigure());
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
		if (editPart instanceof TaskContextPropertiesCompartmentEditPart) {
			return getPrimaryShape().getFigureComponentProperties();
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
				.getType(TaskContextNameEditPart.VISUAL_ID));
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
			if (type == OrocosComponentModelElementTypes.TCProperty_3020) {
				return getChildBySemanticHint(OrocosComponentModelVisualIDRegistry
						.getType(TaskContextPropertiesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ComponentFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureComponentProperties;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentNameLabel;

		/**
		 * @generated
		 */
		public ComponentFigure() {

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

			RectangleFigure componentInfo0 = new RectangleFigure();

			componentInfo0.setBackgroundColor(ColorConstants.lightGray);

			componentInfo0.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			GridData constraintComponentInfo0 = new GridData();
			constraintComponentInfo0.verticalAlignment = GridData.BEGINNING;
			constraintComponentInfo0.horizontalAlignment = GridData.FILL;
			constraintComponentInfo0.horizontalIndent = 0;
			constraintComponentInfo0.horizontalSpan = 1;
			constraintComponentInfo0.verticalSpan = 1;
			constraintComponentInfo0.grabExcessHorizontalSpace = true;
			constraintComponentInfo0.grabExcessVerticalSpace = false;
			this.add(componentInfo0, constraintComponentInfo0);

			GridLayout layoutComponentInfo0 = new GridLayout();
			layoutComponentInfo0.numColumns = 1;
			layoutComponentInfo0.makeColumnsEqualWidth = true;
			componentInfo0.setLayoutManager(layoutComponentInfo0);

			fFigureComponentNameLabel = new WrappingLabel();

			fFigureComponentNameLabel.setText("<?>");

			fFigureComponentNameLabel.setFont(FFIGURECOMPONENTNAMELABEL_FONT);

			GridData constraintFFigureComponentNameLabel = new GridData();
			constraintFFigureComponentNameLabel.verticalAlignment = GridData.BEGINNING;
			constraintFFigureComponentNameLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureComponentNameLabel.horizontalIndent = 0;
			constraintFFigureComponentNameLabel.horizontalSpan = 1;
			constraintFFigureComponentNameLabel.verticalSpan = 1;
			constraintFFigureComponentNameLabel.grabExcessHorizontalSpace = false;
			constraintFFigureComponentNameLabel.grabExcessVerticalSpace = false;
			componentInfo0.add(fFigureComponentNameLabel,
					constraintFFigureComponentNameLabel);

			fFigureComponentProperties = new RectangleFigure();

			GridData constraintFFigureComponentProperties = new GridData();
			constraintFFigureComponentProperties.verticalAlignment = GridData.FILL;
			constraintFFigureComponentProperties.horizontalAlignment = GridData.FILL;
			constraintFFigureComponentProperties.horizontalIndent = 0;
			constraintFFigureComponentProperties.horizontalSpan = 1;
			constraintFFigureComponentProperties.verticalSpan = 1;
			constraintFFigureComponentProperties.grabExcessHorizontalSpace = true;
			constraintFFigureComponentProperties.grabExcessVerticalSpace = true;
			this.add(fFigureComponentProperties,
					constraintFFigureComponentProperties);

			fFigureComponentProperties.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureComponentProperties() {
			return fFigureComponentProperties;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentNameLabel() {
			return fFigureComponentNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOMPONENTNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 15, SWT.BOLD);

}
