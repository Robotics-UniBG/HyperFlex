package it.unibg.robotics.compositionmodel.diagram.part;

import it.unibg.robotics.componentmodels.roscompositionmodel.ROSComposite;
import it.unibg.robotics.componentmodels.roscompositionmodel.ROSMsgConsumer;
import it.unibg.robotics.componentmodels.roscompositionmodel.ROSMsgProducer;
import it.unibg.robotics.compositionmodel.ArchitectureModel;
import it.unibg.robotics.compositionmodel.CompProvidedInterf;
import it.unibg.robotics.compositionmodel.CompRequiredInterf;
import it.unibg.robotics.compositionmodel.Composite;
import it.unibg.robotics.compositionmodel.Connection;
import it.unibg.robotics.compositionmodel.ProvidedInterface;
import it.unibg.robotics.compositionmodel.RequiredInterface;
import it.unibg.robotics.compositionmodel.System;
import it.unibg.robotics.compositionmodel.SystemComposite;
import it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf;
import it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf;
import it.unibg.robotics.compositionmodel.SystemProvidedInterf;
import it.unibg.robotics.compositionmodel.SystemRequiredInterf;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSMsgConsumerEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSMsgProducerEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.System2EditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeContainerCompartmentEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;

import it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelElementTypes;
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
			return getSystem_2002SemanticChildren(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3009SemanticChildren(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3012SemanticChildren(view);
		case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getSystemCompositeContainerCompartment_7003SemanticChildren(view);
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
	public static List<CompositionModelNodeDescriptor> getSystem_2002SemanticChildren(
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
			if (visualID == SystemProvidedInterfEditPart.VISUAL_ID) {
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
	public static List<CompositionModelNodeDescriptor> getSystemComposite_3009SemanticChildren(
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
	public static List<CompositionModelNodeDescriptor> getROSComposite_3012SemanticChildren(
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
			if (visualID == ROSMsgProducerEditPart.VISUAL_ID) {
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
			if (visualID == ROSMsgConsumerEditPart.VISUAL_ID) {
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
	public static List<CompositionModelNodeDescriptor> getSystemCompositeContainerCompartment_7003SemanticChildren(
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
			return getSystem_2002ContainedLinks(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getSystemProvidedInterf_3007ContainedLinks(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getSystemRequiredInterf_3008ContainedLinks(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3009ContainedLinks(view);
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3010ContainedLinks(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3011ContainedLinks(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3012ContainedLinks(view);
		case ROSMsgProducerEditPart.VISUAL_ID:
			return getROSMsgProducer_3013ContainedLinks(view);
		case ROSMsgConsumerEditPart.VISUAL_ID:
			return getROSMsgConsumer_3014ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4002ContainedLinks(view);
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
			return getSystem_2002IncomingLinks(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getSystemProvidedInterf_3007IncomingLinks(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getSystemRequiredInterf_3008IncomingLinks(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3009IncomingLinks(view);
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3010IncomingLinks(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3011IncomingLinks(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3012IncomingLinks(view);
		case ROSMsgProducerEditPart.VISUAL_ID:
			return getROSMsgProducer_3013IncomingLinks(view);
		case ROSMsgConsumerEditPart.VISUAL_ID:
			return getROSMsgConsumer_3014IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4002IncomingLinks(view);
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
			return getSystem_2002OutgoingLinks(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getSystemProvidedInterf_3007OutgoingLinks(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getSystemRequiredInterf_3008OutgoingLinks(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3009OutgoingLinks(view);
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3010OutgoingLinks(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3011OutgoingLinks(view);
		case ROSCompositeEditPart.VISUAL_ID:
			return getROSComposite_3012OutgoingLinks(view);
		case ROSMsgProducerEditPart.VISUAL_ID:
			return getROSMsgProducer_3013OutgoingLinks(view);
		case ROSMsgConsumerEditPart.VISUAL_ID:
			return getROSMsgConsumer_3014OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4002OutgoingLinks(view);
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
	public static List<CompositionModelLinkDescriptor> getSystem_2002ContainedLinks(
			View view) {
		System modelElement = (System) view.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemProvidedInterf_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemRequiredInterf_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemComposite_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeProvidedInterf_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeRequiredInterf_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSComposite_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgProducer_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgConsumer_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getConnection_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystem_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemProvidedInterf_3007IncomingLinks(
			View view) {
		SystemProvidedInterf modelElement = (SystemProvidedInterf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemRequiredInterf_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemComposite_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeProvidedInterf_3010IncomingLinks(
			View view) {
		SystemCompositeProvidedInterf modelElement = (SystemCompositeProvidedInterf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeRequiredInterf_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSComposite_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgProducer_3013IncomingLinks(
			View view) {
		ROSMsgProducer modelElement = (ROSMsgProducer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgConsumer_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getConnection_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystem_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemProvidedInterf_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemRequiredInterf_3008OutgoingLinks(
			View view) {
		SystemRequiredInterf modelElement = (SystemRequiredInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemComposite_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeProvidedInterf_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getSystemCompositeRequiredInterf_3011OutgoingLinks(
			View view) {
		SystemCompositeRequiredInterf modelElement = (SystemCompositeRequiredInterf) view
				.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSComposite_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgProducer_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getROSMsgConsumer_3014OutgoingLinks(
			View view) {
		ROSMsgConsumer modelElement = (ROSMsgConsumer) view.getElement();
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionModelLinkDescriptor> getConnection_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4002(
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
					CompositionModelElementTypes.Connection_4002,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4002(
			ProvidedInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CompositionModelLinkDescriptor> result = new LinkedList<CompositionModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
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
					CompositionModelElementTypes.Connection_4002,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4002(
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
					CompositionModelElementTypes.Connection_4002,
					ConnectionEditPart.VISUAL_ID));
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
