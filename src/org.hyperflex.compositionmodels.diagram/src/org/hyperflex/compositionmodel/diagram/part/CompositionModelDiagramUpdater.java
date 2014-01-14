package org.hyperflex.compositionmodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.hyperflex.compositionmodel.ArchitectureModel;
import org.hyperflex.compositionmodel.CompProvidedInterf;
import org.hyperflex.compositionmodel.CompRequiredInterf;
import org.hyperflex.compositionmodel.Composite;
import org.hyperflex.compositionmodel.Connection;
import org.hyperflex.compositionmodel.ProvidedInterface;
import org.hyperflex.compositionmodel.RequiredInterface;
import org.hyperflex.compositionmodel.System;
import org.hyperflex.compositionmodel.SystemComposite;
import org.hyperflex.compositionmodel.SystemCompositeProvidedInterf;
import org.hyperflex.compositionmodel.SystemCompositeRequiredInterf;
import org.hyperflex.compositionmodel.SystemProvidedInterf;
import org.hyperflex.compositionmodel.SystemRequiredInterf;
import org.hyperflex.compositionmodel.diagram.edit.parts.CompositeSrvConsumerPromoteEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.CompositeSrvProducerPromoteEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.System2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeContainerCompartmentEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterf2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterf2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes;
import org.hyperflex.roscompositionmodel.ROSComposite;
import org.hyperflex.roscompositionmodel.ROSMsgConsumer;
import org.hyperflex.roscompositionmodel.ROSMsgProducer;

/**
 * @generated
 */
public class CompositionModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CompositionModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getArchitectureModel_1000SemanticChildren(view);
		case System2EditPart.VISUAL_ID:
			return getSystem_2001SemanticChildren(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3003SemanticChildren(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3006SemanticChildren(view);
		case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getSystemCompositeContainerCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelNodeDescriptor> getArchitectureModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArchitectureModel modelElement = (ArchitectureModel) view.getElement();
		LinkedList<CompositionModelNodeDescriptor> result = new LinkedList<CompositionModelNodeDescriptor>();
		{
			System childElement = modelElement.getSystem();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == System2EditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelNodeDescriptor> getSystem_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) view.getElement();
		LinkedList<CompositionModelNodeDescriptor> result = new LinkedList<CompositionModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvInterfaces().iterator(); it
				.hasNext();) {
			SystemProvidedInterf childElement = (SystemProvidedInterf) it
					.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemProvidedInterf2EditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getReqInterfaces().iterator(); it
				.hasNext();) {
			SystemRequiredInterf childElement = (SystemRequiredInterf) it
					.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemRequiredInterf2EditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelNodeDescriptor> getSystemComposite_3003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SystemComposite modelElement = (SystemComposite) view.getElement();
		LinkedList<CompositionModelNodeDescriptor> result = new LinkedList<CompositionModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvInterfaces().iterator(); it
				.hasNext();) {
			CompProvidedInterf childElement = (CompProvidedInterf) it.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemCompositeProvidedInterfEditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getReqInterfaces().iterator(); it
				.hasNext();) {
			CompRequiredInterf childElement = (CompRequiredInterf) it.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemCompositeRequiredInterfEditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelNodeDescriptor> getROSComposite_3006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ROSComposite modelElement = (ROSComposite) view.getElement();
		LinkedList<CompositionModelNodeDescriptor> result = new LinkedList<CompositionModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvInterfaces().iterator(); it
				.hasNext();) {
			CompProvidedInterf childElement = (CompProvidedInterf) it.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemProvidedInterfEditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getReqInterfaces().iterator(); it
				.hasNext();) {
			CompRequiredInterf childElement = (CompRequiredInterf) it.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemRequiredInterfEditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelNodeDescriptor> getSystemCompositeContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) containerView.getElement();
		LinkedList<CompositionModelNodeDescriptor> result = new LinkedList<CompositionModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComposites().iterator(); it
				.hasNext();) {
			Composite childElement = (Composite) it.next();
			int visualID = CompositionModelVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SystemCompositeEditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == ROSCompositeEditPart.VISUAL_ID) {
				result.add(new CompositionModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getArchitectureModel_1000ContainedLinks(view);
		case System2EditPart.VISUAL_ID:
			return getSystem_2001ContainedLinks(view);
		case SystemProvidedInterf2EditPart.VISUAL_ID:
			return getSystemProvidedInterf_3001ContainedLinks(view);
		case SystemRequiredInterf2EditPart.VISUAL_ID:
			return getSystemRequiredInterf_3002ContainedLinks(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3003ContainedLinks(view);
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3004ContainedLinks(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3005ContainedLinks(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3006ContainedLinks(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getROSMsgProducer_3007ContainedLinks(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getROSMsgConsumer_3008ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {
		case System2EditPart.VISUAL_ID:
			return getSystem_2001IncomingLinks(view);
		case SystemProvidedInterf2EditPart.VISUAL_ID:
			return getSystemProvidedInterf_3001IncomingLinks(view);
		case SystemRequiredInterf2EditPart.VISUAL_ID:
			return getSystemRequiredInterf_3002IncomingLinks(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3003IncomingLinks(view);
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3004IncomingLinks(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3005IncomingLinks(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3006IncomingLinks(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getROSMsgProducer_3007IncomingLinks(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getROSMsgConsumer_3008IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {
		case System2EditPart.VISUAL_ID:
			return getSystem_2001OutgoingLinks(view);
		case SystemProvidedInterf2EditPart.VISUAL_ID:
			return getSystemProvidedInterf_3001OutgoingLinks(view);
		case SystemRequiredInterf2EditPart.VISUAL_ID:
			return getSystemRequiredInterf_3002OutgoingLinks(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3003OutgoingLinks(view);
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3004OutgoingLinks(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3005OutgoingLinks(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3006OutgoingLinks(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getROSMsgProducer_3007OutgoingLinks(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getROSMsgConsumer_3008OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getArchitectureModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystem_2001ContainedLinks(
			View view) {
		System modelElement = (System) view.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemProvidedInterf_3001ContainedLinks(
			View view) {
		SystemProvidedInterf modelElement = (SystemProvidedInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemRequiredInterf_3002ContainedLinks(
			View view) {
		SystemRequiredInterf modelElement = (SystemRequiredInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemComposite_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeProvidedInterf_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeRequiredInterf_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSComposite_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgProducer_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgConsumer_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystem_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemProvidedInterf_3001IncomingLinks(
			View view) {
		SystemProvidedInterf modelElement = (SystemProvidedInterf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemRequiredInterf_3002IncomingLinks(
			View view) {
		SystemRequiredInterf modelElement = (SystemRequiredInterf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemComposite_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeProvidedInterf_3004IncomingLinks(
			View view) {
		SystemCompositeProvidedInterf modelElement = (SystemCompositeProvidedInterf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeRequiredInterf_3005IncomingLinks(
			View view) {
		SystemCompositeRequiredInterf modelElement = (SystemCompositeRequiredInterf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSComposite_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgProducer_3007IncomingLinks(
			View view) {
		ROSMsgProducer modelElement = (ROSMsgProducer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgConsumer_3008IncomingLinks(
			View view) {
		ROSMsgConsumer modelElement = (ROSMsgConsumer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystem_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemProvidedInterf_3001OutgoingLinks(
			View view) {
		SystemProvidedInterf modelElement = (SystemProvidedInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemRequiredInterf_3002OutgoingLinks(
			View view) {
		SystemRequiredInterf modelElement = (SystemRequiredInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemComposite_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeProvidedInterf_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeRequiredInterf_3005OutgoingLinks(
			View view) {
		SystemCompositeRequiredInterf modelElement = (SystemCompositeRequiredInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSComposite_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgProducer_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgConsumer_3008OutgoingLinks(
			View view) {
		ROSMsgConsumer modelElement = (ROSMsgConsumer) view.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			System container) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != CompositionModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ProvidedInterface dst = link.getTarget();
			RequiredInterface src = link.getSource();
			result.add(new CompositionModelLinkDescriptor(src, dst, link,
					CompositionModelElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(
			ProvidedInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Connection) {
				continue;
			}
			Connection link = (Connection) setting.getEObject();
			if (ConnectionEditPart.VISUAL_ID != CompositionModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RequiredInterface src = link.getSource();
			result.add(new CompositionModelLinkDescriptor(src, target, link,
					CompositionModelElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getIncomingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(
			RequiredInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemRequiredInterf_Exposed()) {
				result.add(new CompositionModelLinkDescriptor(
						setting.getEObject(),
						target,
						CompositionModelElementTypes.SystemRequiredInterfExposed_4002,
						CompositeSrvConsumerPromoteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getIncomingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(
			ProvidedInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystemProvidedInterf_Exposed()) {
				result.add(new CompositionModelLinkDescriptor(
						setting.getEObject(),
						target,
						CompositionModelElementTypes.SystemProvidedInterfExposed_4003,
						CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			RequiredInterface source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != CompositionModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ProvidedInterface dst = link.getTarget();
			RequiredInterface src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CompositionModelLinkDescriptor(src, dst, link,
					CompositionModelElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_SystemRequiredInterf_Exposed_4002(
			SystemRequiredInterf source) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		RequiredInterface destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new CompositionModelLinkDescriptor(source, destination,
				CompositionModelElementTypes.SystemRequiredInterfExposed_4002,
				CompositeSrvConsumerPromoteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_SystemProvidedInterf_Exposed_4003(
			SystemProvidedInterf source) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		ProvidedInterface destination = source.getExposed();
		if (destination == null) {
			return result;
		}
		result.add(new CompositionModelLinkDescriptor(source, destination,
				CompositionModelElementTypes.SystemProvidedInterfExposed_4003,
				CompositeSrvProducerPromoteEditPart.VISUAL_ID));
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
		public List<CompositionModelNodeDescriptor> getSemanticChildren(
				View view) {
			return CompositionModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CompositionModelLinkDescriptor> getContainedLinks(View view) {
			return CompositionModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CompositionModelLinkDescriptor> getIncomingLinks(View view) {
			return CompositionModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CompositionModelLinkDescriptor> getOutgoingLinks(View view) {
			return CompositionModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
