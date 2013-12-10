package org.hyperflex.roscomponentmodel.diagram.providers;

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
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromote2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromoteEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;

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
	public static final IElementType Composite_2001 = getElementType("org.hyperflex.componentmodels.ros.diagram.Composite_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_3001 = getElementType("org.hyperflex.componentmodels.ros.diagram.Node_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeProperty_3002 = getElementType("org.hyperflex.componentmodels.ros.diagram.NodeProperty_3002"); //$NON-NLS-1$

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
	public static final IElementType NodeSrvProducer_3005 = getElementType("org.hyperflex.componentmodels.ros.diagram.NodeSrvProducer_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSrvConsumer_3006 = getElementType("org.hyperflex.componentmodels.ros.diagram.NodeSrvConsumer_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Composite_3007 = getElementType("org.hyperflex.componentmodels.ros.diagram.Composite_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgProducer_3008 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgProducer_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgConsumer_3009 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgConsumer_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvProducer_3010 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeSrvProducer_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvConsumer_3011 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeSrvConsumer_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgProducer_3012 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgProducer_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgConsumer_3013 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgConsumer_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Topic_3014 = getElementType("org.hyperflex.componentmodels.ros.diagram.Topic_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvProducer_3015 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeSrvProducer_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvConsumer_3016 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeSrvConsumer_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4001 = getElementType("org.hyperflex.componentmodels.ros.diagram.MsgInterfaceConnection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4002 = getElementType("org.hyperflex.componentmodels.ros.diagram.MsgInterfaceConnection_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4003 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgInterfaceExposed_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4004 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeMsgInterfaceExposed_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvProducerPromote_4005 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeSrvProducerPromote_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvProducerPromote_4006 = getElementType("org.hyperflex.componentmodels.ros.diagram.CompositeSrvProducerPromote_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Wire_4007 = getElementType("org.hyperflex.componentmodels.ros.diagram.Wire_4007"); //$NON-NLS-1$

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
					Composite_2001,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					Node_3001,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeProperty_3002,
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
					NodeSrvProducer_3005,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeSrvProducer());

			elements.put(
					NodeSrvConsumer_3006,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeSrvConsumer());

			elements.put(
					Composite_3007,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompositeMsgProducer_3008,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgProducer());

			elements.put(
					CompositeMsgConsumer_3009,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgConsumer());

			elements.put(
					CompositeSrvProducer_3010,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeSrvProducer());

			elements.put(
					CompositeSrvConsumer_3011,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeSrvConsumer());

			elements.put(
					CompositeMsgProducer_3012,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgProducer());

			elements.put(
					CompositeMsgConsumer_3013,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgConsumer());

			elements.put(
					Topic_3014,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					CompositeSrvProducer_3015,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeSrvProducer());

			elements.put(
					CompositeSrvConsumer_3016,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeSrvConsumer());

			elements.put(
					MsgInterfaceConnection_4001,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					MsgInterfaceConnection_4002,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					CompositeMsgInterfaceExposed_4003,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					CompositeMsgInterfaceExposed_4004,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					CompositeSrvProducerPromote_4005,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeSrvProducer_Promote());

			elements.put(
					CompositeSrvProducerPromote_4006,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeSrvProducer_Promote());

			elements.put(
					Wire_4007,
					org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getWire());
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
			KNOWN_ELEMENT_TYPES.add(Composite_2001);
			KNOWN_ELEMENT_TYPES.add(Node_3001);
			KNOWN_ELEMENT_TYPES.add(NodeProperty_3002);
			KNOWN_ELEMENT_TYPES.add(NodeMsgProducer_3003);
			KNOWN_ELEMENT_TYPES.add(NodeMsgConsumer_3004);
			KNOWN_ELEMENT_TYPES.add(NodeSrvProducer_3005);
			KNOWN_ELEMENT_TYPES.add(NodeSrvConsumer_3006);
			KNOWN_ELEMENT_TYPES.add(Composite_3007);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgProducer_3008);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgConsumer_3009);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvProducer_3010);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvConsumer_3011);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgProducer_3012);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgConsumer_3013);
			KNOWN_ELEMENT_TYPES.add(Topic_3014);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvProducer_3015);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvConsumer_3016);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4001);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4002);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4003);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4004);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvProducerPromote_4005);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvProducerPromote_4006);
			KNOWN_ELEMENT_TYPES.add(Wire_4007);
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
			return Composite_2001;
		case NodeEditPart.VISUAL_ID:
			return Node_3001;
		case NodePropertyEditPart.VISUAL_ID:
			return NodeProperty_3002;
		case NodeMsgProducerEditPart.VISUAL_ID:
			return NodeMsgProducer_3003;
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return NodeMsgConsumer_3004;
		case NodeSrvProducerEditPart.VISUAL_ID:
			return NodeSrvProducer_3005;
		case NodeSrvConsumerEditPart.VISUAL_ID:
			return NodeSrvConsumer_3006;
		case Composite2EditPart.VISUAL_ID:
			return Composite_3007;
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return CompositeMsgProducer_3008;
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return CompositeMsgConsumer_3009;
		case CompositeSrvProducerEditPart.VISUAL_ID:
			return CompositeSrvProducer_3010;
		case CompositeSrvConsumerEditPart.VISUAL_ID:
			return CompositeSrvConsumer_3011;
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return CompositeMsgProducer_3012;
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return CompositeMsgConsumer_3013;
		case TopicEditPart.VISUAL_ID:
			return Topic_3014;
		case CompositeSrvProducer2EditPart.VISUAL_ID:
			return CompositeSrvProducer_3015;
		case CompositeSrvConsumer2EditPart.VISUAL_ID:
			return CompositeSrvConsumer_3016;
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return MsgInterfaceConnection_4001;
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return MsgInterfaceConnection_4002;
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4003;
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4004;
		case CompositeSrvProducerPromoteEditPart.VISUAL_ID:
			return CompositeSrvProducerPromote_4005;
		case CompositeSrvProducerPromote2EditPart.VISUAL_ID:
			return CompositeSrvProducerPromote_4006;
		case WireEditPart.VISUAL_ID:
			return Wire_4007;
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
