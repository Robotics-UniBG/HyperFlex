package it.unibg.robotics.compositionmodel.diagram.providers;

import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSMsgConsumerEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSMsgProducerEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.System2EditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelDiagramEditorPlugin;

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
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class CompositionModelElementTypes {

	/**
	 * @generated
	 */
	private CompositionModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CompositionModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ArchitectureModel_1000 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.ArchitectureModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType System_2002 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.System_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemProvidedInterf_3007 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.SystemProvidedInterf_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemRequiredInterf_3008 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.SystemRequiredInterf_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemComposite_3009 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.SystemComposite_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemCompositeProvidedInterf_3010 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.SystemCompositeProvidedInterf_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemCompositeRequiredInterf_3011 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.SystemCompositeRequiredInterf_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ROSComposite_3012 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.ROSComposite_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ROSMsgProducer_3013 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.ROSMsgProducer_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ROSMsgConsumer_3014 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.ROSMsgConsumer_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connection_4002 = getElementType("it.unibg.robotics.componentmodels.composition.diagram.Connection_4002"); //$NON-NLS-1$

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
					ArchitectureModel_1000,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getArchitectureModel());

			elements.put(
					System_2002,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystem());

			elements.put(
					SystemProvidedInterf_3007,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemProvidedInterf());

			elements.put(
					SystemRequiredInterf_3008,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemRequiredInterf());

			elements.put(
					SystemComposite_3009,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemComposite());

			elements.put(
					SystemCompositeProvidedInterf_3010,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemCompositeProvidedInterf());

			elements.put(
					SystemCompositeRequiredInterf_3011,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemCompositeRequiredInterf());

			elements.put(
					ROSComposite_3012,
					it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
							.getROSComposite());

			elements.put(
					ROSMsgProducer_3013,
					it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
							.getROSMsgProducer());

			elements.put(
					ROSMsgConsumer_3014,
					it.unibg.robotics.componentmodels.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
							.getROSMsgConsumer());

			elements.put(
					Connection_4002,
					it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
							.getConnection());
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
			KNOWN_ELEMENT_TYPES.add(System_2002);
			KNOWN_ELEMENT_TYPES.add(SystemProvidedInterf_3007);
			KNOWN_ELEMENT_TYPES.add(SystemRequiredInterf_3008);
			KNOWN_ELEMENT_TYPES.add(SystemComposite_3009);
			KNOWN_ELEMENT_TYPES.add(SystemCompositeProvidedInterf_3010);
			KNOWN_ELEMENT_TYPES.add(SystemCompositeRequiredInterf_3011);
			KNOWN_ELEMENT_TYPES.add(ROSComposite_3012);
			KNOWN_ELEMENT_TYPES.add(ROSMsgProducer_3013);
			KNOWN_ELEMENT_TYPES.add(ROSMsgConsumer_3014);
			KNOWN_ELEMENT_TYPES.add(Connection_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return ArchitectureModel_1000;
		case System2EditPart.VISUAL_ID:
			return System_2002;
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return SystemProvidedInterf_3007;
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return SystemRequiredInterf_3008;
		case SystemCompositeEditPart.VISUAL_ID:
			return SystemComposite_3009;
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return SystemCompositeProvidedInterf_3010;
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return SystemCompositeRequiredInterf_3011;
		case ROSCompositeEditPart.VISUAL_ID:
			return ROSComposite_3012;
		case ROSMsgProducerEditPart.VISUAL_ID:
			return ROSMsgProducer_3013;
		case ROSMsgConsumerEditPart.VISUAL_ID:
			return ROSMsgConsumer_3014;
		case ConnectionEditPart.VISUAL_ID:
			return Connection_4002;
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
			return it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
