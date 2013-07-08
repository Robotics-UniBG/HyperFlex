package it.unibg.robotics.roscomponentmodel.diagram.providers;

import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Package2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;

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
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ArchitectureModel_1000 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.ArchitectureModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_2002 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.Package_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_3001 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.Node_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeProperty_3012 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.NodeProperty_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeMsgProducer_3003 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.NodeMsgProducer_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeMsgConsumer_3004 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.NodeMsgConsumer_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_3011 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.Package_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PackageMsgProducer_3006 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.PackageMsgProducer_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PackageMsgConsumer_3007 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.PackageMsgConsumer_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PackageMsgProducer_3009 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.PackageMsgProducer_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PackageMsgConsumer_3010 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.PackageMsgConsumer_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Topic_3008 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.Topic_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4010 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.MsgInterfaceConnection_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4011 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.MsgInterfaceConnection_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4007 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.CompositeMsgInterfaceExposed_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4012 = getElementType("it.unibg.robotics.componentmodels.ros.diagram.CompositeMsgInterfaceExposed_4012"); //$NON-NLS-1$

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
				return RosComponentModelDiagramEditorPlugin.getInstance()
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
					ArchitectureModel_1000,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getArchitectureModel());

			elements.put(
					Package_2002,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getPackage());

			elements.put(
					Node_3001,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeProperty_3012,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeProperty());

			elements.put(
					NodeMsgProducer_3003,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeMsgProducer());

			elements.put(
					NodeMsgConsumer_3004,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getNodeMsgConsumer());

			elements.put(
					Package_3011,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getPackage());

			elements.put(
					PackageMsgProducer_3006,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getPackageMsgProducer());

			elements.put(
					PackageMsgConsumer_3007,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getPackageMsgConsumer());

			elements.put(
					PackageMsgProducer_3009,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getPackageMsgProducer());

			elements.put(
					PackageMsgConsumer_3010,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getPackageMsgConsumer());

			elements.put(
					Topic_3008,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					MsgInterfaceConnection_4010,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					MsgInterfaceConnection_4011,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					CompositeMsgInterfaceExposed_4007,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					CompositeMsgInterfaceExposed_4012,
					it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(ArchitectureModel_1000);
			KNOWN_ELEMENT_TYPES.add(Package_2002);
			KNOWN_ELEMENT_TYPES.add(Node_3001);
			KNOWN_ELEMENT_TYPES.add(NodeProperty_3012);
			KNOWN_ELEMENT_TYPES.add(NodeMsgProducer_3003);
			KNOWN_ELEMENT_TYPES.add(NodeMsgConsumer_3004);
			KNOWN_ELEMENT_TYPES.add(Package_3011);
			KNOWN_ELEMENT_TYPES.add(PackageMsgProducer_3006);
			KNOWN_ELEMENT_TYPES.add(PackageMsgConsumer_3007);
			KNOWN_ELEMENT_TYPES.add(PackageMsgProducer_3009);
			KNOWN_ELEMENT_TYPES.add(PackageMsgConsumer_3010);
			KNOWN_ELEMENT_TYPES.add(Topic_3008);
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
			return ArchitectureModel_1000;
		case PackageEditPart.VISUAL_ID:
			return Package_2002;
		case NodeEditPart.VISUAL_ID:
			return Node_3001;
		case NodePropertyEditPart.VISUAL_ID:
			return NodeProperty_3012;
		case NodeMsgProducerEditPart.VISUAL_ID:
			return NodeMsgProducer_3003;
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return NodeMsgConsumer_3004;
		case Package2EditPart.VISUAL_ID:
			return Package_3011;
		case PackageMsgProducerEditPart.VISUAL_ID:
			return PackageMsgProducer_3006;
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return PackageMsgConsumer_3007;
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return PackageMsgProducer_3009;
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return PackageMsgConsumer_3010;
		case TopicEditPart.VISUAL_ID:
			return Topic_3008;
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

}
