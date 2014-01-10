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
package org.hyperflex.featuremodels.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.hyperflex.featuremodels.Attribute;
import org.hyperflex.featuremodels.ContainmentAssociation;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.SimpleAttribute;
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
import org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes;

/**
 * @generated
 */
public class FeatureModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FeatureModelNodeDescriptor> getSemanticChildren(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000SemanticChildren(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelNodeDescriptor> getFeatureModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FeatureModel modelElement = (FeatureModel) view.getElement();
		LinkedList<FeatureModelNodeDescriptor> result = new LinkedList<FeatureModelNodeDescriptor>();
		{
			Feature childElement = modelElement.getRootFeature();
			int visualID = FeatureModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FeatureEditPart.VISUAL_ID) {
				result.add(new FeatureModelNodeDescriptor(childElement,
						visualID));
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (FeatureModelVisualIDRegistry
					.getNodeVisualID(view, childElement) == Feature2EditPart.VISUAL_ID) {
				result.add(new FeatureModelNodeDescriptor(childElement,
						Feature2EditPart.VISUAL_ID));
				continue;
			}
			if (FeatureModelVisualIDRegistry
					.getNodeVisualID(view, childElement) == SimpleAttributeEditPart.VISUAL_ID) {
				result.add(new FeatureModelNodeDescriptor(childElement,
						SimpleAttributeEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelNodeDescriptor> getFeature_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeatureModelNodeDescriptor> result = new LinkedList<FeatureModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainers().iterator(); it
				.hasNext();) {
			ContainmentAssociation childElement = (ContainmentAssociation) it
					.next();
			int visualID = FeatureModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContainmentAssociationEditPart.VISUAL_ID) {
				result.add(new FeatureModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getContainedLinks(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureModelEditPart.VISUAL_ID:
			return getFeatureModel_1000ContainedLinks(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2005ContainedLinks(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2006ContainedLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2008ContainedLinks(view);
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getContainmentAssociation_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getIncomingLinks(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2005IncomingLinks(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2006IncomingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2008IncomingLinks(view);
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getContainmentAssociation_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2005OutgoingLinks(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2006OutgoingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2008OutgoingLinks(view);
		case ContainmentAssociationEditPart.VISUAL_ID:
			return getContainmentAssociation_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeatureModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2005ContainedLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2006ContainedLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getSimpleAttribute_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getContainmentAssociation_3001ContainedLinks(
			View view) {
		ContainmentAssociation modelElement = (ContainmentAssociation) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2005IncomingLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2006IncomingLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getSimpleAttribute_2008IncomingLinks(
			View view) {
		SimpleAttribute modelElement = (SimpleAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_Attributes_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getContainmentAssociation_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2005OutgoingLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2006OutgoingLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getSimpleAttribute_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getContainmentAssociation_3001OutgoingLinks(
			View view) {
		ContainmentAssociation modelElement = (ContainmentAssociation) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4007(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureSubFeatures_4007,
						FeatureSubFeaturesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4008(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureSubFeatures_4008,
						FeatureSubFeatures2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4013(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getContainmentAssociation_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(
						setting.getEObject(),
						target,
						FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013,
						ContainmentAssociationSubFeaturesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4014(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getContainmentAssociation_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(
						setting.getEObject(),
						target,
						FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014,
						ContainmentAssociationSubFeatures2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_Attributes_4012(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.featuremodels.featuremodelsPackage.eINSTANCE
					.getFeature_Attributes()) {
				result.add(new FeatureModelLinkDescriptor(setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureAttributes_4012,
						FeatureAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4007(
			Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			Feature destination = (Feature) destinations.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureSubFeatures_4007,
					FeatureSubFeaturesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4008(
			Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			Feature destination = (Feature) destinations.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureSubFeatures_4008,
					FeatureSubFeatures2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4013(
			ContainmentAssociation source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			Feature destination = (Feature) destinations.next();
			result.add(new FeatureModelLinkDescriptor(
					source,
					destination,
					FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013,
					ContainmentAssociationSubFeaturesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContainmentAssociation_SubFeatures_4014(
			ContainmentAssociation source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			Feature destination = (Feature) destinations.next();
			result.add(new FeatureModelLinkDescriptor(
					source,
					destination,
					FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014,
					ContainmentAssociationSubFeatures2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_Attributes_4012(
			Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getAttributes().iterator(); destinations
				.hasNext();) {
			Attribute destination = (Attribute) destinations.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureAttributes_4012,
					FeatureAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<FeatureModelNodeDescriptor> getSemanticChildren(View view) {
			return FeatureModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FeatureModelLinkDescriptor> getContainedLinks(View view) {
			return FeatureModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FeatureModelLinkDescriptor> getIncomingLinks(View view) {
			return FeatureModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FeatureModelLinkDescriptor> getOutgoingLinks(View view) {
			return FeatureModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
