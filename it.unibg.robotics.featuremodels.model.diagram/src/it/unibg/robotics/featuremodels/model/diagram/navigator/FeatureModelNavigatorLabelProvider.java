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
package it.unibg.robotics.featuremodels.model.diagram.navigator;

import it.unibg.robotics.featuremodels.FeatureModel;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationLowerBoundUpperBoundEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureAttributesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureContainersEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureModelEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureName2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureNameEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.SimpleAttributeEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.SimpleAttributeNameEditPart;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelDiagramEditorPlugin;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry;
import it.unibg.robotics.featuremodels.model.diagram.providers.FeatureModelElementTypes;
import it.unibg.robotics.featuremodels.model.diagram.providers.FeatureModelParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class FeatureModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FeatureModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FeatureModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FeatureModelNavigatorItem
				&& !isOwnView(((FeatureModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FeatureModelNavigatorGroup) {
			FeatureModelNavigatorGroup group = (FeatureModelNavigatorGroup) element;
			return FeatureModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof FeatureModelNavigatorItem) {
			FeatureModelNavigatorItem navigatorItem = (FeatureModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureAttributesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/featuremodels?Feature?attributes", FeatureModelElementTypes.FeatureAttributes_4012); //$NON-NLS-1$
		case FeatureContainersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/featuremodels?Feature?containers", FeatureModelElementTypes.FeatureContainers_4015); //$NON-NLS-1$
		case ContainmentAssociationSubFeatures2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/featuremodels?ContainmentAssociation?subFeatures", FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014); //$NON-NLS-1$
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/featuremodels?ContainmentAssociation", FeatureModelElementTypes.ContainmentAssociation_2009); //$NON-NLS-1$
		case SimpleAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/featuremodels?SimpleAttribute", FeatureModelElementTypes.SimpleAttribute_2008); //$NON-NLS-1$
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/featuremodels?Feature?subFeatures", FeatureModelElementTypes.FeatureSubFeatures_4008); //$NON-NLS-1$
		case Feature2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/featuremodels?Feature", FeatureModelElementTypes.Feature_2006); //$NON-NLS-1$
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/featuremodels?Feature?subFeatures", FeatureModelElementTypes.FeatureSubFeatures_4007); //$NON-NLS-1$
		case ContainmentAssociationSubFeaturesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/featuremodels?ContainmentAssociation?subFeatures", FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013); //$NON-NLS-1$
		case FeatureModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://robotics.unibg.it/featuremodels?FeatureModel", FeatureModelElementTypes.FeatureModel_1000); //$NON-NLS-1$
		case FeatureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/featuremodels?Feature", FeatureModelElementTypes.Feature_2005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FeatureModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FeatureModelElementTypes.isKnownElementType(elementType)) {
			image = FeatureModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof FeatureModelNavigatorGroup) {
			FeatureModelNavigatorGroup group = (FeatureModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FeatureModelNavigatorItem) {
			FeatureModelNavigatorItem navigatorItem = (FeatureModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureAttributesEditPart.VISUAL_ID:
			return getFeatureAttributes_4012Text(view);
		case FeatureContainersEditPart.VISUAL_ID:
			return getFeatureContainers_4015Text(view);
		case ContainmentAssociationSubFeatures2EditPart.VISUAL_ID:
			return getContainmentAssociationSubFeatures_4014Text(view);
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getContainmentAssociation_2009Text(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2008Text(view);
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return getFeatureSubFeatures_4008Text(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2006Text(view);
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return getFeatureSubFeatures_4007Text(view);
		case ContainmentAssociationSubFeaturesEditPart.VISUAL_ID:
			return getContainmentAssociationSubFeatures_4013Text(view);
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000Text(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFeatureSubFeatures_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContainmentAssociation_2009Text(View view) {
		IParser parser = FeatureModelParserProvider
				.getParser(
						FeatureModelElementTypes.ContainmentAssociation_2009,
						view.getElement() != null ? view.getElement() : view,
						FeatureModelVisualIDRegistry
								.getType(ContainmentAssociationLowerBoundUpperBoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeatureModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFeatureContainers_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFeatureAttributes_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContainmentAssociationSubFeatures_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContainmentAssociationSubFeatures_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFeatureSubFeatures_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFeature_2005Text(View view) {
		IParser parser = FeatureModelParserProvider.getParser(
				FeatureModelElementTypes.Feature_2005,
				view.getElement() != null ? view.getElement() : view,
				FeatureModelVisualIDRegistry
						.getType(FeatureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeatureModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFeatureModel_1000Text(View view) {
		FeatureModel domainModelElement = (FeatureModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			FeatureModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleAttribute_2008Text(View view) {
		IParser parser = FeatureModelParserProvider.getParser(
				FeatureModelElementTypes.SimpleAttribute_2008, view
						.getElement() != null ? view.getElement() : view,
				FeatureModelVisualIDRegistry
						.getType(SimpleAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeatureModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFeature_2006Text(View view) {
		IParser parser = FeatureModelParserProvider.getParser(
				FeatureModelElementTypes.Feature_2006,
				view.getElement() != null ? view.getElement() : view,
				FeatureModelVisualIDRegistry
						.getType(FeatureName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeatureModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FeatureModelEditPart.MODEL_ID
				.equals(FeatureModelVisualIDRegistry.getModelID(view));
	}

}
