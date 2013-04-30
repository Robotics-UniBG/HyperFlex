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

import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.ContainmentAssociationSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.Feature2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureAttributesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureModelEditPart;
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
	public static final IElementType Feature_2005 = getElementType("it.unibg.robotics.featuremodels.model.diagram.Feature_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Feature_2006 = getElementType("it.unibg.robotics.featuremodels.model.diagram.Feature_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleAttribute_2008 = getElementType("it.unibg.robotics.featuremodels.model.diagram.SimpleAttribute_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainmentAssociation_3001 = getElementType("it.unibg.robotics.featuremodels.model.diagram.ContainmentAssociation_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureSubFeatures_4007 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureSubFeatures_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureSubFeatures_4008 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureSubFeatures_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainmentAssociationSubFeatures_4013 = getElementType("it.unibg.robotics.featuremodels.model.diagram.ContainmentAssociationSubFeatures_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainmentAssociationSubFeatures_4014 = getElementType("it.unibg.robotics.featuremodels.model.diagram.ContainmentAssociationSubFeatures_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureAttributes_4012 = getElementType("it.unibg.robotics.featuremodels.model.diagram.FeatureAttributes_4012"); //$NON-NLS-1$

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

			elements.put(
					FeatureModel_1000,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeatureModel());

			elements.put(
					Feature_2005,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature());

			elements.put(
					Feature_2006,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature());

			elements.put(
					SimpleAttribute_2008,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getSimpleAttribute());

			elements.put(
					ContainmentAssociation_3001,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getContainmentAssociation());

			elements.put(
					FeatureSubFeatures_4007,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature_SubFeatures());

			elements.put(
					FeatureSubFeatures_4008,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getFeature_SubFeatures());

			elements.put(
					ContainmentAssociationSubFeatures_4013,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getContainmentAssociation_SubFeatures());

			elements.put(
					ContainmentAssociationSubFeatures_4014,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
							.getContainmentAssociation_SubFeatures());

			elements.put(
					FeatureAttributes_4012,
					it.unibg.robotics.featuremodels.featuremodelsPackage.eINSTANCE
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

}
