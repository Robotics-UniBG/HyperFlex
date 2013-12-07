/**
 * Feature Model Plugin
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
package org.hyperflex.featuremodels.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationSubFeatures2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.ContainmentAssociationSubFeaturesEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.Feature2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureAttributesEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureModelEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureSubFeatures2EditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.FeatureSubFeaturesEditPart;
import org.hyperflex.featuremodels.diagram.edit.parts.SimpleAttributeEditPart;
import org.hyperflex.featuremodels.diagram.part.FeatureModelDiagramEditorPlugin;

/**
 * @generated
 */
public class FeatureModelElementTypes {

	/**
	 * @generated
	 */
	private FeatureModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FeatureModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType FeatureModel_1000 = getElementType("org.hyperflex.featuremodels.diagram.FeatureModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Feature_2005 = getElementType("org.hyperflex.featuremodels.diagram.Feature_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Feature_2006 = getElementType("org.hyperflex.featuremodels.diagram.Feature_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleAttribute_2008 = getElementType("org.hyperflex.featuremodels.diagram.SimpleAttribute_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainmentAssociation_3001 = getElementType("org.hyperflex.featuremodels.diagram.ContainmentAssociation_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureSubFeatures_4007 = getElementType("org.hyperflex.featuremodels.diagram.FeatureSubFeatures_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureSubFeatures_4008 = getElementType("org.hyperflex.featuremodels.diagram.FeatureSubFeatures_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainmentAssociationSubFeatures_4013 = getElementType("org.hyperflex.featuremodels.diagram.ContainmentAssociationSubFeatures_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainmentAssociationSubFeatures_4014 = getElementType("org.hyperflex.featuremodels.diagram.ContainmentAssociationSubFeatures_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureAttributes_4012 = getElementType("org.hyperflex.featuremodels.diagram.FeatureAttributes_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FeatureModel_1000,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeatureModel());

			elements.put(Feature_2005,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature());

			elements.put(Feature_2006,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature());

			elements.put(SimpleAttribute_2008,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getSimpleAttribute());

			elements.put(ContainmentAssociation_3001,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getContainmentAssociation());

			elements.put(FeatureSubFeatures_4007,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature_SubFeatures());

			elements.put(FeatureSubFeatures_4008,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature_SubFeatures());

			elements.put(ContainmentAssociationSubFeatures_4013,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getContainmentAssociation_SubFeatures());

			elements.put(ContainmentAssociationSubFeatures_4014,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getContainmentAssociation_SubFeatures());

			elements.put(FeatureAttributes_4012,
					org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature_Attributes());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FeatureModel_1000);
			KNOWN_ELEMENT_TYPES.add(Feature_2005);
			KNOWN_ELEMENT_TYPES.add(Feature_2006);
			KNOWN_ELEMENT_TYPES.add(SimpleAttribute_2008);
			KNOWN_ELEMENT_TYPES.add(ContainmentAssociation_3001);
			KNOWN_ELEMENT_TYPES.add(FeatureSubFeatures_4007);
			KNOWN_ELEMENT_TYPES.add(FeatureSubFeatures_4008);
			KNOWN_ELEMENT_TYPES.add(ContainmentAssociationSubFeatures_4013);
			KNOWN_ELEMENT_TYPES.add(ContainmentAssociationSubFeatures_4014);
			KNOWN_ELEMENT_TYPES.add(FeatureAttributes_4012);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FeatureModelEditPart.VISUAL_ID:
			return FeatureModel_1000;
		case FeatureEditPart.VISUAL_ID:
			return Feature_2005;
		case Feature2EditPart.VISUAL_ID:
			return Feature_2006;
		case SimpleAttributeEditPart.VISUAL_ID:
			return SimpleAttribute_2008;
		case ContainmentAssociationEditPart.VISUAL_ID:
			return ContainmentAssociation_3001;
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return FeatureSubFeatures_4007;
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return FeatureSubFeatures_4008;
		case ContainmentAssociationSubFeaturesEditPart.VISUAL_ID:
			return ContainmentAssociationSubFeatures_4013;
		case ContainmentAssociationSubFeatures2EditPart.VISUAL_ID:
			return ContainmentAssociationSubFeatures_4014;
		case FeatureAttributesEditPart.VISUAL_ID:
			return FeatureAttributes_4012;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
