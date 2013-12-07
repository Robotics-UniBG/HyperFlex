/*
 * HyperFlex Plugins
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
package org.hyperflex.orocoscomponentmodel.diagram.providers;

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
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelDiagramEditorPlugin;

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
	public static final IElementType System_1000 = getElementType("org.hyperflex.componentmodels.orocos.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composite_2002 = getElementType("org.hyperflex.componentmodels.orocos.diagram.Composite_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TaskContext_3017 = getElementType("org.hyperflex.componentmodels.orocos.diagram.TaskContext_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TCInputDataPort_3018 = getElementType("org.hyperflex.componentmodels.orocos.diagram.TCInputDataPort_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TCOutputDataPort_3019 = getElementType("org.hyperflex.componentmodels.orocos.diagram.TCOutputDataPort_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TCProperty_3020 = getElementType("org.hyperflex.componentmodels.orocos.diagram.TCProperty_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TCOperation_3021 = getElementType("org.hyperflex.componentmodels.orocos.diagram.TCOperation_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TCOperationCaller_3022 = getElementType("org.hyperflex.componentmodels.orocos.diagram.TCOperationCaller_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Composite_3023 = getElementType("org.hyperflex.componentmodels.orocos.diagram.Composite_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompInputPort_3024 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompInputPort_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOutputPort_3025 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOutputPort_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOperation_3026 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOperation_3026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOperationCaller_3027 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOperationCaller_3027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompInputPort_3028 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompInputPort_3028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOutputPort_3029 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOutputPort_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOperation_3030 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOperation_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOperationCaller_3031 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOperationCaller_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectionPolicy_4010 = getElementType("org.hyperflex.componentmodels.orocos.diagram.ConnectionPolicy_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOutputPort_4011 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOutputPort_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompInputPort_4012 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompInputPort_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PeersConnection_4013 = getElementType("org.hyperflex.componentmodels.orocos.diagram.PeersConnection_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOperation_4014 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOperation_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompOperationCaller_4015 = getElementType("org.hyperflex.componentmodels.orocos.diagram.CompOperationCaller_4015"); //$NON-NLS-1$

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
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getSystem());

			elements.put(
					Composite_2002,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					TaskContext_3017,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTaskContext());

			elements.put(
					TCInputDataPort_3018,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCInputDataPort());

			elements.put(
					TCOutputDataPort_3019,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCOutputDataPort());

			elements.put(
					TCProperty_3020,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCProperty());

			elements.put(
					TCOperation_3021,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCOperation());

			elements.put(
					TCOperationCaller_3022,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getTCOperationCaller());

			elements.put(
					Composite_3023,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompInputPort_3024,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompInputPort());

			elements.put(
					CompOutputPort_3025,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOutputPort());

			elements.put(
					CompOperation_3026,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperation());

			elements.put(
					CompOperationCaller_3027,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperationCaller());

			elements.put(
					CompInputPort_3028,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompInputPort());

			elements.put(
					CompOutputPort_3029,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOutputPort());

			elements.put(
					CompOperation_3030,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperation());

			elements.put(
					CompOperationCaller_3031,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperationCaller());

			elements.put(
					ConnectionPolicy_4010,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getConnectionPolicy());

			elements.put(
					CompOutputPort_4011,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOutputPort());

			elements.put(
					CompInputPort_4012,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompInputPort());

			elements.put(
					PeersConnection_4013,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getPeersConnection());

			elements.put(
					CompOperation_4014,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
							.getCompOperation());

			elements.put(
					CompOperationCaller_4015,
					org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(Composite_2002);
			KNOWN_ELEMENT_TYPES.add(TaskContext_3017);
			KNOWN_ELEMENT_TYPES.add(TCInputDataPort_3018);
			KNOWN_ELEMENT_TYPES.add(TCOutputDataPort_3019);
			KNOWN_ELEMENT_TYPES.add(TCProperty_3020);
			KNOWN_ELEMENT_TYPES.add(TCOperation_3021);
			KNOWN_ELEMENT_TYPES.add(TCOperationCaller_3022);
			KNOWN_ELEMENT_TYPES.add(Composite_3023);
			KNOWN_ELEMENT_TYPES.add(CompInputPort_3024);
			KNOWN_ELEMENT_TYPES.add(CompOutputPort_3025);
			KNOWN_ELEMENT_TYPES.add(CompOperation_3026);
			KNOWN_ELEMENT_TYPES.add(CompOperationCaller_3027);
			KNOWN_ELEMENT_TYPES.add(CompInputPort_3028);
			KNOWN_ELEMENT_TYPES.add(CompOutputPort_3029);
			KNOWN_ELEMENT_TYPES.add(CompOperation_3030);
			KNOWN_ELEMENT_TYPES.add(CompOperationCaller_3031);
			KNOWN_ELEMENT_TYPES.add(ConnectionPolicy_4010);
			KNOWN_ELEMENT_TYPES.add(CompOutputPort_4011);
			KNOWN_ELEMENT_TYPES.add(CompInputPort_4012);
			KNOWN_ELEMENT_TYPES.add(PeersConnection_4013);
			KNOWN_ELEMENT_TYPES.add(CompOperation_4014);
			KNOWN_ELEMENT_TYPES.add(CompOperationCaller_4015);
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
			return Composite_2002;
		case TaskContextEditPart.VISUAL_ID:
			return TaskContext_3017;
		case TCInputDataPortEditPart.VISUAL_ID:
			return TCInputDataPort_3018;
		case TCOutputDataPortEditPart.VISUAL_ID:
			return TCOutputDataPort_3019;
		case TCPropertyEditPart.VISUAL_ID:
			return TCProperty_3020;
		case TCOperationEditPart.VISUAL_ID:
			return TCOperation_3021;
		case TCOperationCallerEditPart.VISUAL_ID:
			return TCOperationCaller_3022;
		case Composite2EditPart.VISUAL_ID:
			return Composite_3023;
		case CompInputPortEditPart.VISUAL_ID:
			return CompInputPort_3024;
		case CompOutputPortEditPart.VISUAL_ID:
			return CompOutputPort_3025;
		case CompOperationEditPart.VISUAL_ID:
			return CompOperation_3026;
		case CompOperationCallerEditPart.VISUAL_ID:
			return CompOperationCaller_3027;
		case CompInputPort2EditPart.VISUAL_ID:
			return CompInputPort_3028;
		case CompOutputPort2EditPart.VISUAL_ID:
			return CompOutputPort_3029;
		case CompOperation2EditPart.VISUAL_ID:
			return CompOperation_3030;
		case CompOperationCaller2EditPart.VISUAL_ID:
			return CompOperationCaller_3031;
		case ConnectionPolicyEditPart.VISUAL_ID:
			return ConnectionPolicy_4010;
		case CompOutputPort3EditPart.VISUAL_ID:
			return CompOutputPort_4011;
		case CompInputPort3EditPart.VISUAL_ID:
			return CompInputPort_4012;
		case PeersConnectionEditPart.VISUAL_ID:
			return PeersConnection_4013;
		case CompOperation3EditPart.VISUAL_ID:
			return CompOperation_4014;
		case CompOperationCaller3EditPart.VISUAL_ID:
			return CompOperationCaller_4015;
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
			return org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
