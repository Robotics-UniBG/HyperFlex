/**
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
package org.hyperflex.featuremodels.diagram.navigator;

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
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationLowerBoundUpperBoundEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationSubFeatures2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationSubFeaturesEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.Feature2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureAttributesEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureModelEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureName2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureNameEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureSubFeatures2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureSubFeaturesEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.SimpleAttributeEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.SimpleAttributeNameEditPart;
import org.hyperflex.featuremodels.diagram.part.FeatureModelDiagramEditorPlugin;
import org.hyperflex.featuremodels.diagram.part.FeatureModelVisualIDRegistry;
import org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes;
import org.hyperflex.featuremodels.diagram.providers.FeatureModelParserProvider;

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
		case FeatureModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.hyperflex.org/featuremodels?FeatureModel", FeatureModelElementTypes.FeatureModel_1000); //$NON-NLS-1$
		case FeatureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/featuremodels?Feature", FeatureModelElementTypes.Feature_2005); //$NON-NLS-1$
		case Feature2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/featuremodels?Feature", FeatureModelElementTypes.Feature_2006); //$NON-NLS-1$
		case SimpleAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/featuremodels?SimpleAttribute", FeatureModelElementTypes.SimpleAttribute_2008); //$NON-NLS-1$
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/featuremodels?ContainmentAssociation", FeatureModelElementTypes.ContainmentAssociation_3001); //$NON-NLS-1$
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/featuremodels?Feature?subFeatures", FeatureModelElementTypes.FeatureSubFeatures_4007); //$NON-NLS-1$
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/featuremodels?Feature?subFeatures", FeatureModelElementTypes.FeatureSubFeatures_4008); //$NON-NLS-1$
		case FeatureAttributesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/featuremodels?Feature?attributes", FeatureModelElementTypes.FeatureAttributes_4012); //$NON-NLS-1$
		case ContainmentAssociationSubFeaturesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/featuremodels?ContainmentAssociation?subFeatures", FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013); //$NON-NLS-1$
		case ContainmentAssociationSubFeatures2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/featuremodels?ContainmentAssociation?subFeatures", FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014); //$NON-NLS-1$
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
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000Text(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2005Text(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2006Text(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2008Text(view);
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getContainmentAssociation_3001Text(view);
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return getFeatureSubFeatures_4007Text(view);
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return getFeatureSubFeatures_4008Text(view);
		case FeatureAttributesEditPart.VISUAL_ID:
			return getFeatureAttributes_4012Text(view);
		case ContainmentAssociationSubFeaturesEditPart.VISUAL_ID:
			return getContainmentAssociationSubFeatures_4013Text(view);
		case ContainmentAssociationSubFeatures2EditPart.VISUAL_ID:
			return getContainmentAssociationSubFeatures_4014Text(view);
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
	private String getContainmentAssociation_3001Text(View view) {
		IParser parser = FeatureModelParserProvider
				.getParser(
						FeatureModelElementTypes.ContainmentAssociation_3001,
						view.getElement() != null ? view.getElement() : view,
						FeatureModelVisualIDRegistry
								.getType(ContainmentAssociationLowerBoundUpperBoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FeatureModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
