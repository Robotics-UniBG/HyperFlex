/*
 * Variability Analysis And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.orocoscomponentmodel.diagram.providers;

import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelDiagramEditorPlugin;

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
public class OrocosComponentModelElementTypes {

	/**
	 * @generated
	 */
	private OrocosComponentModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			OrocosComponentModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composite_2001 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.Composite_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskContext_3001 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.TaskContext_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TCInputDataPort_3002 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.TCInputDataPort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TCOutputDataPort_3003 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.TCOutputDataPort_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TCProperty_3016 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.TCProperty_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TCOperation_3010 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.TCOperation_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TCOperationCaller_3011 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.TCOperationCaller_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composite_3005 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.Composite_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompInputPort_3006 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompInputPort_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOutputPort_3007 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOutputPort_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOperation_3012 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOperation_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOperationCaller_3013 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOperationCaller_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompInputPort_3008 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompInputPort_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOutputPort_3009 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOutputPort_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOperation_3014 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOperation_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOperationCaller_3015 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOperationCaller_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionPolicy_4001 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.ConnectionPolicy_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOutputPort_4004 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOutputPort_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompInputPort_4005 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompInputPort_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PeersConnection_4007 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.PeersConnection_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOperation_4008 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOperation_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompOperationCaller_4009 = getElementType("it.unibg.robotics.componentmodels.orocos.diagram.CompOperationCaller_4009"); //$NON-NLS-1$

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
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getSystem());

			elements.put(
					Composite_2001,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					TaskContext_3001,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTaskContext());

			elements.put(
					TCInputDataPort_3002,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCInputDataPort());

			elements.put(
					TCOutputDataPort_3003,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCOutputDataPort());

			elements.put(
					TCProperty_3016,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCProperty());

			elements.put(
					TCOperation_3010,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCOperation());

			elements.put(
					TCOperationCaller_3011,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCOperationCaller());

			elements.put(
					Composite_3005,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompInputPort_3006,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompInputPort());

			elements.put(
					CompOutputPort_3007,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOutputPort());

			elements.put(
					CompOperation_3012,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperation());

			elements.put(
					CompOperationCaller_3013,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperationCaller());

			elements.put(
					CompInputPort_3008,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompInputPort());

			elements.put(
					CompOutputPort_3009,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOutputPort());

			elements.put(
					CompOperation_3014,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperation());

			elements.put(
					CompOperationCaller_3015,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperationCaller());

			elements.put(
					ConnectionPolicy_4001,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getConnectionPolicy());

			elements.put(
					CompOutputPort_4004,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOutputPort());

			elements.put(
					CompInputPort_4005,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompInputPort());

			elements.put(
					PeersConnection_4007,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getPeersConnection());

			elements.put(
					CompOperation_4008,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperation());

			elements.put(
					CompOperationCaller_4009,
					it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperationCaller());
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
			KNOWN_ELEMENT_TYPES.add(TaskContext_3001);
			KNOWN_ELEMENT_TYPES.add(TCInputDataPort_3002);
			KNOWN_ELEMENT_TYPES.add(TCOutputDataPort_3003);
			KNOWN_ELEMENT_TYPES.add(TCProperty_3016);
			KNOWN_ELEMENT_TYPES.add(TCOperation_3010);
			KNOWN_ELEMENT_TYPES.add(TCOperationCaller_3011);
			KNOWN_ELEMENT_TYPES.add(Composite_3005);
			KNOWN_ELEMENT_TYPES.add(CompInputPort_3006);
			KNOWN_ELEMENT_TYPES.add(CompOutputPort_3007);
			KNOWN_ELEMENT_TYPES.add(CompOperation_3012);
			KNOWN_ELEMENT_TYPES.add(CompOperationCaller_3013);
			KNOWN_ELEMENT_TYPES.add(CompInputPort_3008);
			KNOWN_ELEMENT_TYPES.add(CompOutputPort_3009);
			KNOWN_ELEMENT_TYPES.add(CompOperation_3014);
			KNOWN_ELEMENT_TYPES.add(CompOperationCaller_3015);
			KNOWN_ELEMENT_TYPES.add(ConnectionPolicy_4001);
			KNOWN_ELEMENT_TYPES.add(CompOutputPort_4004);
			KNOWN_ELEMENT_TYPES.add(CompInputPort_4005);
			KNOWN_ELEMENT_TYPES.add(PeersConnection_4007);
			KNOWN_ELEMENT_TYPES.add(CompOperation_4008);
			KNOWN_ELEMENT_TYPES.add(CompOperationCaller_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return System_1000;
		case CompositeEditPart.VISUAL_ID:
			return Composite_2001;
		case TaskContextEditPart.VISUAL_ID:
			return TaskContext_3001;
		case TCInputDataPortEditPart.VISUAL_ID:
			return TCInputDataPort_3002;
		case TCOutputDataPortEditPart.VISUAL_ID:
			return TCOutputDataPort_3003;
		case TCPropertyEditPart.VISUAL_ID:
			return TCProperty_3016;
		case TCOperationEditPart.VISUAL_ID:
			return TCOperation_3010;
		case TCOperationCallerEditPart.VISUAL_ID:
			return TCOperationCaller_3011;
		case Composite2EditPart.VISUAL_ID:
			return Composite_3005;
		case CompInputPortEditPart.VISUAL_ID:
			return CompInputPort_3006;
		case CompOutputPortEditPart.VISUAL_ID:
			return CompOutputPort_3007;
		case CompOperationEditPart.VISUAL_ID:
			return CompOperation_3012;
		case CompOperationCallerEditPart.VISUAL_ID:
			return CompOperationCaller_3013;
		case CompInputPort2EditPart.VISUAL_ID:
			return CompInputPort_3008;
		case CompOutputPort2EditPart.VISUAL_ID:
			return CompOutputPort_3009;
		case CompOperation2EditPart.VISUAL_ID:
			return CompOperation_3014;
		case CompOperationCaller2EditPart.VISUAL_ID:
			return CompOperationCaller_3015;
		case ConnectionPolicyEditPart.VISUAL_ID:
			return ConnectionPolicy_4001;
		case CompOutputPort3EditPart.VISUAL_ID:
			return CompOutputPort_4004;
		case CompInputPort3EditPart.VISUAL_ID:
			return CompInputPort_4005;
		case PeersConnectionEditPart.VISUAL_ID:
			return PeersConnection_4007;
		case CompOperation3EditPart.VISUAL_ID:
			return CompOperation_4008;
		case CompOperationCaller3EditPart.VISUAL_ID:
			return CompOperationCaller_4009;
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
			return it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
