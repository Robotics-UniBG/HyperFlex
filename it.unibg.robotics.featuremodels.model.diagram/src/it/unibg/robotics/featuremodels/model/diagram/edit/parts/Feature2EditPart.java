/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.featuremodels.model.diagram.edit.parts;

import it.unibg.robotics.featuremodels.Feature;
import it.unibg.robotics.featuremodels.FeatureModel;
import it.unibg.robotics.featuremodels.Instance;
import it.unibg.robotics.featuremodels.model.diagram.edit.policies.Feature2CanonicalEditPolicy;
import it.unibg.robotics.featuremodels.model.diagram.edit.policies.Feature2ItemSemanticEditPolicy;
import it.unibg.robotics.featuremodels.model.diagram.edit.policies.FeatureModelCanonicalEditPolicy;
import it.unibg.robotics.featuremodels.model.diagram.edit.policies.OpenDiagramEditPolicy;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry;
import it.unibg.robotics.featuremodels.model.diagram.providers.FeatureModelElementTypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Feature2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

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
	public Feature2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Feature2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new Feature2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
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
		return primaryShape = new FeatureBox();
	}

	/**
	 * @generated
	 */
	public FeatureBox getPrimaryShape() {
		return (FeatureBox) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FeatureName2EditPart) {
			((FeatureName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureFeatureLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FeatureName2EditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 35);
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
				.getType(FeatureName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(FeatureModelElementTypes.FeatureSubFeatures_4007);
		types.add(FeatureModelElementTypes.FeatureSubFeatures_4008);
		types.add(FeatureModelElementTypes.FeatureContainers_4015);
		types.add(FeatureModelElementTypes.FeatureAttributes_4012);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeatureModelElementTypes.FeatureSubFeatures_4007);
		}
		if (targetEditPart instanceof it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart) {
			types.add(FeatureModelElementTypes.FeatureSubFeatures_4007);
		}
		if (targetEditPart instanceof FeatureEditPart) {
			types.add(FeatureModelElementTypes.FeatureSubFeatures_4008);
		}
		if (targetEditPart instanceof it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart) {
			types.add(FeatureModelElementTypes.FeatureSubFeatures_4008);
		}
		if (targetEditPart instanceof ContainmentAssociationEditPart) {
			types.add(FeatureModelElementTypes.FeatureContainers_4015);
		}
		if (targetEditPart instanceof SimpleAttributeEditPart) {
			types.add(FeatureModelElementTypes.FeatureAttributes_4012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == FeatureModelElementTypes.FeatureSubFeatures_4007) {
			types.add(FeatureModelElementTypes.Feature_2005);
			types.add(FeatureModelElementTypes.Feature_2006);
		} else if (relationshipType == FeatureModelElementTypes.FeatureSubFeatures_4008) {
			types.add(FeatureModelElementTypes.Feature_2005);
			types.add(FeatureModelElementTypes.Feature_2006);
		} else if (relationshipType == FeatureModelElementTypes.FeatureContainers_4015) {
			types.add(FeatureModelElementTypes.ContainmentAssociation_2009);
		} else if (relationshipType == FeatureModelElementTypes.FeatureAttributes_4012) {
			types.add(FeatureModelElementTypes.SimpleAttribute_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(FeatureModelElementTypes.FeatureSubFeatures_4007);
		types.add(FeatureModelElementTypes.FeatureSubFeatures_4008);
		types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013);
		types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == FeatureModelElementTypes.FeatureSubFeatures_4007) {
			types.add(FeatureModelElementTypes.Feature_2005);
			types.add(FeatureModelElementTypes.Feature_2006);
		} else if (relationshipType == FeatureModelElementTypes.FeatureSubFeatures_4008) {
			types.add(FeatureModelElementTypes.Feature_2005);
			types.add(FeatureModelElementTypes.Feature_2006);
		} else if (relationshipType == FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013) {
			types.add(FeatureModelElementTypes.ContainmentAssociation_2009);
		} else if (relationshipType == FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014) {
			types.add(FeatureModelElementTypes.ContainmentAssociation_2009);
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof Feature) {
			getPrimaryShape().updateColor();

			List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
					.getRegisteredEditPolicies(((Feature) notification
							.getNotifier()).getFeatureModel());
			for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
					.hasNext();) {
				CanonicalEditPolicy nextEditPolicy = it.next();
				if (nextEditPolicy instanceof FeatureModelCanonicalEditPolicy) {
					nextEditPolicy.refresh();
				}

			}
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	public class FeatureBox extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureLabel;

		/**
		 * @generated
		 */
		public FeatureBox() {
			this.setLayoutManager(new StackLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBackgroundColor(ColorConstants.white);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(35)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureFeatureLabel = new WrappingLabel();
			fFigureFeatureLabel.setText("");
			fFigureFeatureLabel.setAlignment(PositionConstants.CENTER);
			fFigureFeatureLabel.setTextWrap(true);
			updateColor();

			this.add(fFigureFeatureLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureLabel() {
			return fFigureFeatureLabel;
		}

		/**
		 * @generated NOT
		 */
		public void updateColor() {
			Feature thisFeature = (Feature) ((Node) Feature2EditPart.this
					.getModel()).getElement();
			EObject eObj = thisFeature;
			while (!(eObj instanceof FeatureModel)) {
				if (eObj == null) {
					return;
				}
				eObj = eObj.eContainer();
			}
			FeatureModel model = (FeatureModel) eObj;

			FeatureModelEditPart modelEditPart = null;
			if (Feature2EditPart.this.getParent() instanceof FeatureModelEditPart) {
				modelEditPart = (FeatureModelEditPart) Feature2EditPart.this
						.getParent();
				int index = model.getInstances().indexOf(
						model.getSelectedInstance());
				if (index != -1) {

					Instance instance = model.getInstances().get(index);
					if (instance.getSelectedFeatures().contains(thisFeature)) {
						this.setBackgroundColor(ColorConstants.lightGreen);
					} else {
						this.setBackgroundColor(ColorConstants.white);
					}
				} else {
					this.setBackgroundColor(ColorConstants.white);

				}

			}

			//			if (feature.isSelected()) {
			//				this.setBackgroundColor(ColorConstants.lightGreen);
			//			} else {
			//				this.setBackgroundColor(ColorConstants.white);
			//			}

		}

	}

	/**
	 * @generated NOT
	 */
	public Feature getFeature() {
		return (Feature) this.resolveSemanticElement();
	}

	/**
	 * @generated NOT
	 */
	public FeatureModelEditPart getFeatureModelEditPart() {
		return (FeatureModelEditPart) getParent();
	}

	/**
	 * @generated NOT
	 */
	public FeatureModel getFeatureModel() {
		return getFeature().getFeatureModel();
	}

}
