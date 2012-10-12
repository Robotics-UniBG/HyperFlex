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
package it.unibg.robotics.featuremodels.model.diagram.part;

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
import it.unibg.robotics.featuremodels.model.diagram.providers.FeatureModelElementTypes;

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
		featureModel.FeatureModel modelElement = (featureModel.FeatureModel) view
				.getElement();
		LinkedList<FeatureModelNodeDescriptor> result = new LinkedList<FeatureModelNodeDescriptor>();
		{
			featureModel.Feature childElement = modelElement.getRootFeature();
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
					.getNodeVisualID(view, childElement) == CompositeFeatureEditPart.VISUAL_ID) {
				result.add(new FeatureModelNodeDescriptor(childElement,
						CompositeFeatureEditPart.VISUAL_ID));
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
			return getFeature_2001ContainedLinks(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2002ContainedLinks(view);
		case CompositeFeatureEditPart.VISUAL_ID:
			return getCompositeFeature_2003ContainedLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getIncomingLinks(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2001IncomingLinks(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2002IncomingLinks(view);
		case CompositeFeatureEditPart.VISUAL_ID:
			return getCompositeFeature_2003IncomingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (FeatureModelVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2001OutgoingLinks(view);
		case Feature2EditPart.VISUAL_ID:
			return getFeature_2002OutgoingLinks(view);
		case CompositeFeatureEditPart.VISUAL_ID:
			return getCompositeFeature_2003OutgoingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_2004OutgoingLinks(view);
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
	public static List<FeatureModelLinkDescriptor> getFeature_2001ContainedLinks(
			View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2002ContainedLinks(
			View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getCompositeFeature_2003ContainedLinks(
			View view) {
		featureModel.CompositeFeature modelElement = (featureModel.CompositeFeature) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getSimpleAttribute_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2001IncomingLinks(
			View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2002IncomingLinks(
			View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getCompositeFeature_2003IncomingLinks(
			View view) {
		featureModel.CompositeFeature modelElement = (featureModel.CompositeFeature) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getSimpleAttribute_2004IncomingLinks(
			View view) {
		featureModel.SimpleAttribute modelElement = (featureModel.SimpleAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Feature_Attributes_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2001OutgoingLinks(
			View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getFeature_2002OutgoingLinks(
			View view) {
		featureModel.Feature modelElement = (featureModel.Feature) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Feature_Attributes_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getCompositeFeature_2003OutgoingLinks(
			View view) {
		featureModel.CompositeFeature modelElement = (featureModel.CompositeFeature) view
				.getElement();
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FeatureModelLinkDescriptor> getSimpleAttribute_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4001(
			featureModel.Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == featureModel.featureModelPackage.eINSTANCE
					.getFeature_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureSubFeatures_4001,
						FeatureSubFeaturesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_SubFeatures_4002(
			featureModel.Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == featureModel.featureModelPackage.eINSTANCE
					.getFeature_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureSubFeatures_4002,
						FeatureSubFeatures2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4003(
			featureModel.Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == featureModel.featureModelPackage.eINSTANCE
					.getCompositeFeature_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(
						setting.getEObject(),
						target,
						FeatureModelElementTypes.CompositeFeatureSubFeatures_4003,
						CompositeFeatureSubFeaturesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4004(
			featureModel.Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == featureModel.featureModelPackage.eINSTANCE
					.getCompositeFeature_SubFeatures()) {
				result.add(new FeatureModelLinkDescriptor(
						setting.getEObject(),
						target,
						FeatureModelElementTypes.CompositeFeatureSubFeatures_4004,
						CompositeFeatureSubFeatures2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(
			featureModel.CompositeFeature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == featureModel.featureModelPackage.eINSTANCE
					.getFeature_SubCompositeFeatures()) {
				result.add(new FeatureModelLinkDescriptor(
						setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureSubCompositeFeatures_4005,
						FeatureSubCompositeFeaturesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Feature_Attributes_4006(
			featureModel.Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == featureModel.featureModelPackage.eINSTANCE
					.getFeature_Attributes()) {
				result.add(new FeatureModelLinkDescriptor(setting.getEObject(),
						target,
						FeatureModelElementTypes.FeatureAttributes_4006,
						FeatureAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4001(
			featureModel.Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			featureModel.Feature destination = (featureModel.Feature) destinations
					.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureSubFeatures_4001,
					FeatureSubFeaturesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_SubFeatures_4002(
			featureModel.Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			featureModel.Feature destination = (featureModel.Feature) destinations
					.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureSubFeatures_4002,
					FeatureSubFeatures2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4003(
			featureModel.CompositeFeature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			featureModel.Feature destination = (featureModel.Feature) destinations
					.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.CompositeFeatureSubFeatures_4003,
					CompositeFeatureSubFeaturesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CompositeFeature_SubFeatures_4004(
			featureModel.CompositeFeature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubFeatures().iterator(); destinations
				.hasNext();) {
			featureModel.Feature destination = (featureModel.Feature) destinations
					.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.CompositeFeatureSubFeatures_4004,
					CompositeFeatureSubFeatures2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_SubCompositeFeatures_4005(
			featureModel.Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubCompositeFeatures()
				.iterator(); destinations.hasNext();) {
			featureModel.CompositeFeature destination = (featureModel.CompositeFeature) destinations
					.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureSubCompositeFeatures_4005,
					FeatureSubCompositeFeaturesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FeatureModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Feature_Attributes_4006(
			featureModel.Feature source) {
		LinkedList<FeatureModelLinkDescriptor> result = new LinkedList<FeatureModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getAttributes().iterator(); destinations
				.hasNext();) {
			featureModel.Attribute destination = (featureModel.Attribute) destinations
					.next();
			result.add(new FeatureModelLinkDescriptor(source, destination,
					FeatureModelElementTypes.FeatureAttributes_4006,
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
