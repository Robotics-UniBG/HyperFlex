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
package it.unibg.robotics.featuremodels.model.diagram.providers;

import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureAttributesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureModelEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubCompositeFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.SimpleAttributeEditPart;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

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
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType FeatureModel_1000 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Feature_2001 = getElementType("it.unibg.robotics.featuremodels.model.diagram.Feature_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Feature_2002 = getElementType("it.unibg.robotics.featuremodels.model.diagram.Feature_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeFeature_2003 = getElementType("it.unibg.robotics.featuremodels.model.diagram.CompositeFeature_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SimpleAttribute_2004 = getElementType("it.unibg.robotics.featuremodels.model.diagram.SimpleAttribute_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FeatureSubFeatures_4001 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureSubFeatures_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FeatureSubFeatures_4002 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureSubFeatures_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeFeatureSubFeatures_4003 = getElementType("it.unibg.robotics.featuremodels.model.diagram.CompositeFeatureSubFeatures_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeFeatureSubFeatures_4004 = getElementType("it.unibg.robotics.featuremodels.model.diagram.CompositeFeatureSubFeatures_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FeatureSubCompositeFeatures_4005 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureSubCompositeFeatures_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FeatureAttributes_4006 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureAttributes_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return FeatureModelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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
					featureModel.featureModelPackage.eINSTANCE
							.getFeatureModel());

			elements.put(Feature_2001,
					featureModel.featureModelPackage.eINSTANCE.getFeature());

			elements.put(Feature_2002,
					featureModel.featureModelPackage.eINSTANCE.getFeature());

			elements.put(CompositeFeature_2003,
					featureModel.featureModelPackage.eINSTANCE
							.getCompositeFeature());

			elements.put(SimpleAttribute_2004,
					featureModel.featureModelPackage.eINSTANCE
							.getSimpleAttribute());

			elements.put(FeatureSubFeatures_4001,
					featureModel.featureModelPackage.eINSTANCE
							.getFeature_SubFeatures());

			elements.put(FeatureSubFeatures_4002,
					featureModel.featureModelPackage.eINSTANCE
							.getFeature_SubFeatures());

			elements.put(CompositeFeatureSubFeatures_4003,
					featureModel.featureModelPackage.eINSTANCE
							.getCompositeFeature_SubFeatures());

			elements.put(CompositeFeatureSubFeatures_4004,
					featureModel.featureModelPackage.eINSTANCE
							.getCompositeFeature_SubFeatures());

			elements.put(FeatureSubCompositeFeatures_4005,
					featureModel.featureModelPackage.eINSTANCE
							.getFeature_SubCompositeFeatures());

			elements.put(FeatureAttributes_4006,
					featureModel.featureModelPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(Feature_2001);
			KNOWN_ELEMENT_TYPES.add(Feature_2002);
			KNOWN_ELEMENT_TYPES.add(CompositeFeature_2003);
			KNOWN_ELEMENT_TYPES.add(SimpleAttribute_2004);
			KNOWN_ELEMENT_TYPES.add(FeatureSubFeatures_4001);
			KNOWN_ELEMENT_TYPES.add(FeatureSubFeatures_4002);
			KNOWN_ELEMENT_TYPES.add(CompositeFeatureSubFeatures_4003);
			KNOWN_ELEMENT_TYPES.add(CompositeFeatureSubFeatures_4004);
			KNOWN_ELEMENT_TYPES.add(FeatureSubCompositeFeatures_4005);
			KNOWN_ELEMENT_TYPES.add(FeatureAttributes_4006);
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
			return Feature_2001;
		case Feature2EditPart.VISUAL_ID:
			return Feature_2002;
		case CompositeFeatureEditPart.VISUAL_ID:
			return CompositeFeature_2003;
		case SimpleAttributeEditPart.VISUAL_ID:
			return SimpleAttribute_2004;
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return FeatureSubFeatures_4001;
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return FeatureSubFeatures_4002;
		case CompositeFeatureSubFeaturesEditPart.VISUAL_ID:
			return CompositeFeatureSubFeatures_4003;
		case CompositeFeatureSubFeatures2EditPart.VISUAL_ID:
			return CompositeFeatureSubFeatures_4004;
		case FeatureSubCompositeFeaturesEditPart.VISUAL_ID:
			return FeatureSubCompositeFeatures_4005;
		case FeatureAttributesEditPart.VISUAL_ID:
			return FeatureAttributes_4006;
		}
		return null;
	}

}
