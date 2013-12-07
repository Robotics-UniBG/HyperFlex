package org.hyperflex.roscomponentmodel.diagram.providers;

import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;

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

/**
 * @generated
 */
public class RosComponentModelElementTypes {

	/**
	 * @generated
	 */
	private RosComponentModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			RosComponentModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("org.hyperflex.componentmodels.ros.diagram.System_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Composite_2003 = getElementType("org.hyperflex.componentmodels.ros.diagram.Composite_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_3013 = getElementType("org.hyperflex.componentmodels.ros.diagram.Node_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeProperty_3012 = getElementType("org.hyperflex.componentmodels.ros.diagram.NodeProperty_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeMsgProducer_3003 = getElementType("org.hyperflex.componentmodels.ros.diagram.NodeMsgProducer_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeMsgConsumer_3004 = getElementType("org.hyperflex.componentmodels.ros.diagram.NodeMsgConsumer_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composite_3014 = getElementType("org.hyperflex.componentmodels.ros.diagram.Composite_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgProducer_3015 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgProducer_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgConsumer_3016 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgConsumer_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgProducer_3017 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgProducer_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgConsumer_3018 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgConsumer_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Topic_3019 = getElementType("org.hyperflex.componentmodels.ros.diagram.Topic_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4010 = getElementType("org.hyperflex.componentmodels.ros.diagram.MsgInterfaceConnection_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4011 = getElementType("org.hyperflex.componentmodels.ros.diagram.MsgInterfaceConnection_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4007 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgInterfaceExposed_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4012 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgInterfaceExposed_4012"); //$NON-NLS-1$

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

			elements.put(
					System_1000,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getSystem());

			elements.put(
					Composite_2003,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					Node_3013,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeProperty_3012,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeProperty());

			elements.put(
					NodeMsgProducer_3003,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeMsgProducer());

			elements.put(
					NodeMsgConsumer_3004,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeMsgConsumer());

			elements.put(
					Composite_3014,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompositeMsgProducer_3015,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgProducer());

			elements.put(
					CompositeMsgConsumer_3016,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgConsumer());

			elements.put(
					CompositeMsgProducer_3017,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgProducer());

			elements.put(
					CompositeMsgConsumer_3018,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgConsumer());

			elements.put(
					Topic_3019,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					MsgInterfaceConnection_4010,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					MsgInterfaceConnection_4011,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					CompositeMsgInterfaceExposed_4007,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					CompositeMsgInterfaceExposed_4012,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());
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
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(Composite_2003);
			KNOWN_ELEMENT_TYPES.add(Node_3013);
			KNOWN_ELEMENT_TYPES.add(NodeProperty_3012);
			KNOWN_ELEMENT_TYPES.add(NodeMsgProducer_3003);
			KNOWN_ELEMENT_TYPES.add(NodeMsgConsumer_3004);
			KNOWN_ELEMENT_TYPES.add(Composite_3014);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgProducer_3015);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgConsumer_3016);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgProducer_3017);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgConsumer_3018);
			KNOWN_ELEMENT_TYPES.add(Topic_3019);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4010);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4011);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4007);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4012);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return System_1000;
		case CompositeEditPart.VISUAL_ID:
			return Composite_2003;
		case NodeEditPart.VISUAL_ID:
			return Node_3013;
		case NodePropertyEditPart.VISUAL_ID:
			return NodeProperty_3012;
		case NodeMsgProducerEditPart.VISUAL_ID:
			return NodeMsgProducer_3003;
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return NodeMsgConsumer_3004;
		case Composite2EditPart.VISUAL_ID:
			return Composite_3014;
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return CompositeMsgProducer_3015;
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return CompositeMsgConsumer_3016;
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return CompositeMsgProducer_3017;
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return CompositeMsgConsumer_3018;
		case TopicEditPart.VISUAL_ID:
			return Topic_3019;
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return MsgInterfaceConnection_4010;
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return MsgInterfaceConnection_4011;
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4007;
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4012;
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
			return org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
