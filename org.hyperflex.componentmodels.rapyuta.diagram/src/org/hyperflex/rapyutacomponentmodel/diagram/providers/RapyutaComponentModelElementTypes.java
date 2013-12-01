/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.providers;

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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointMsgConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Node2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Topic2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class RapyutaComponentModelElementTypes {

	/**
	 * @generated
	 */
	private RapyutaComponentModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			RapyutaComponentModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composite_2001 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Composite_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Container_2002 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Container_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_3001 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Node_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeParameter_3002 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeParameter_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodePublisher_3003 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodePublisher_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeSubscriber_3004 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSubscriber_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeSrvServer_3005 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvServer_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeSrvClient_3006 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvClient_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composite_3007 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Composite_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositePublisher_3008 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositePublisher_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSubscriber_3009 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSubscriber_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvServer_3010 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvServer_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvClient_3011 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvClient_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositePublisher_3012 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositePublisher_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSubscriber_3013 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSubscriber_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvServer_3014 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvServer_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvClient_3015 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvClient_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Topic_3016 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Topic_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RobotEndPoint_3038 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.RobotEndPoint_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointParameter_3018 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointParameter_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointPublisher_3019 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointPublisher_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSubscriber_3020 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSubscriber_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvServer_3021 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvServer_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvClient_3022 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvClient_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_3040 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Node_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeParameter_3024 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeParameter_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodePublisher_3025 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodePublisher_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeSubscriber_3026 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSubscriber_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeSrvServer_3027 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvServer_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeSrvClient_3028 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvClient_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnvironmentEndPoint_3039 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EnvironmentEndPoint_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointParameter_3030 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointParameter_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointPublisher_3031 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointPublisher_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSubscriber_3032 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSubscriber_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvServer_3033 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvServer_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvClient_3034 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvClient_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Topic_3035 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Topic_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4002 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.MsgInterfaceConnection_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4003 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.MsgInterfaceConnection_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4004 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeMsgInterfaceExposed_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4005 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeMsgInterfaceExposed_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvConnection_4006 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvConnection_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndPointMsgConnection_4007 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointMsgConnection_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvConnection_4010 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvConnection_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContainerSrvConnection_4009 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.ContainerSrvConnection_4009"); //$NON-NLS-1$

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
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getSystem());

			elements.put(
					Composite_2001,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					Container_2002,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getContainer());

			elements.put(
					Node_3001,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeParameter_3002,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeParameter());

			elements.put(
					NodePublisher_3003,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodePublisher());

			elements.put(
					NodeSubscriber_3004,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSubscriber());

			elements.put(
					NodeSrvServer_3005,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvServer());

			elements.put(
					NodeSrvClient_3006,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvClient());

			elements.put(
					Composite_3007,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompositePublisher_3008,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositePublisher());

			elements.put(
					CompositeSubscriber_3009,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSubscriber());

			elements.put(
					CompositeSrvServer_3010,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvServer());

			elements.put(
					CompositeSrvClient_3011,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvClient());

			elements.put(
					CompositePublisher_3012,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositePublisher());

			elements.put(
					CompositeSubscriber_3013,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSubscriber());

			elements.put(
					CompositeSrvServer_3014,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvServer());

			elements.put(
					CompositeSrvClient_3015,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvClient());

			elements.put(
					Topic_3016,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					RobotEndPoint_3038,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getRobotEndPoint());

			elements.put(
					EndPointParameter_3018,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointParameter());

			elements.put(
					EndPointPublisher_3019,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointPublisher());

			elements.put(
					EndPointSubscriber_3020,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSubscriber());

			elements.put(
					EndPointSrvServer_3021,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvServer());

			elements.put(
					EndPointSrvClient_3022,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvClient());

			elements.put(
					Node_3040,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeParameter_3024,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeParameter());

			elements.put(
					NodePublisher_3025,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodePublisher());

			elements.put(
					NodeSubscriber_3026,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSubscriber());

			elements.put(
					NodeSrvServer_3027,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvServer());

			elements.put(
					NodeSrvClient_3028,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvClient());

			elements.put(
					EnvironmentEndPoint_3039,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEnvironmentEndPoint());

			elements.put(
					EndPointParameter_3030,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointParameter());

			elements.put(
					EndPointPublisher_3031,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointPublisher());

			elements.put(
					EndPointSubscriber_3032,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSubscriber());

			elements.put(
					EndPointSrvServer_3033,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvServer());

			elements.put(
					EndPointSrvClient_3034,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvClient());

			elements.put(
					Topic_3035,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					MsgInterfaceConnection_4002,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					MsgInterfaceConnection_4003,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					CompositeMsgInterfaceExposed_4004,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					CompositeMsgInterfaceExposed_4005,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					EndPointSrvConnection_4006,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvConnection());

			elements.put(
					EndPointMsgConnection_4007,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointMsgConnection());

			elements.put(
					CompositeSrvConnection_4010,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvConnection());

			elements.put(
					ContainerSrvConnection_4009,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getContainerSrvConnection());
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
			KNOWN_ELEMENT_TYPES.add(Container_2002);
			KNOWN_ELEMENT_TYPES.add(Node_3001);
			KNOWN_ELEMENT_TYPES.add(NodeParameter_3002);
			KNOWN_ELEMENT_TYPES.add(NodePublisher_3003);
			KNOWN_ELEMENT_TYPES.add(NodeSubscriber_3004);
			KNOWN_ELEMENT_TYPES.add(NodeSrvServer_3005);
			KNOWN_ELEMENT_TYPES.add(NodeSrvClient_3006);
			KNOWN_ELEMENT_TYPES.add(Composite_3007);
			KNOWN_ELEMENT_TYPES.add(CompositePublisher_3008);
			KNOWN_ELEMENT_TYPES.add(CompositeSubscriber_3009);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvServer_3010);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvClient_3011);
			KNOWN_ELEMENT_TYPES.add(CompositePublisher_3012);
			KNOWN_ELEMENT_TYPES.add(CompositeSubscriber_3013);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvServer_3014);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvClient_3015);
			KNOWN_ELEMENT_TYPES.add(Topic_3016);
			KNOWN_ELEMENT_TYPES.add(RobotEndPoint_3038);
			KNOWN_ELEMENT_TYPES.add(EndPointParameter_3018);
			KNOWN_ELEMENT_TYPES.add(EndPointPublisher_3019);
			KNOWN_ELEMENT_TYPES.add(EndPointSubscriber_3020);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvServer_3021);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvClient_3022);
			KNOWN_ELEMENT_TYPES.add(Node_3040);
			KNOWN_ELEMENT_TYPES.add(NodeParameter_3024);
			KNOWN_ELEMENT_TYPES.add(NodePublisher_3025);
			KNOWN_ELEMENT_TYPES.add(NodeSubscriber_3026);
			KNOWN_ELEMENT_TYPES.add(NodeSrvServer_3027);
			KNOWN_ELEMENT_TYPES.add(NodeSrvClient_3028);
			KNOWN_ELEMENT_TYPES.add(EnvironmentEndPoint_3039);
			KNOWN_ELEMENT_TYPES.add(EndPointParameter_3030);
			KNOWN_ELEMENT_TYPES.add(EndPointPublisher_3031);
			KNOWN_ELEMENT_TYPES.add(EndPointSubscriber_3032);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvServer_3033);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvClient_3034);
			KNOWN_ELEMENT_TYPES.add(Topic_3035);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4002);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4003);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4004);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4005);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvConnection_4006);
			KNOWN_ELEMENT_TYPES.add(EndPointMsgConnection_4007);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvConnection_4010);
			KNOWN_ELEMENT_TYPES.add(ContainerSrvConnection_4009);
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
		case ContainerEditPart.VISUAL_ID:
			return Container_2002;
		case NodeEditPart.VISUAL_ID:
			return Node_3001;
		case NodeParameterEditPart.VISUAL_ID:
			return NodeParameter_3002;
		case NodePublisherEditPart.VISUAL_ID:
			return NodePublisher_3003;
		case NodeSubscriberEditPart.VISUAL_ID:
			return NodeSubscriber_3004;
		case NodeSrvServerEditPart.VISUAL_ID:
			return NodeSrvServer_3005;
		case NodeSrvClientEditPart.VISUAL_ID:
			return NodeSrvClient_3006;
		case Composite2EditPart.VISUAL_ID:
			return Composite_3007;
		case CompositePublisherEditPart.VISUAL_ID:
			return CompositePublisher_3008;
		case CompositeSubscriberEditPart.VISUAL_ID:
			return CompositeSubscriber_3009;
		case CompositeSrvServerEditPart.VISUAL_ID:
			return CompositeSrvServer_3010;
		case CompositeSrvClientEditPart.VISUAL_ID:
			return CompositeSrvClient_3011;
		case CompositePublisher2EditPart.VISUAL_ID:
			return CompositePublisher_3012;
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return CompositeSubscriber_3013;
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return CompositeSrvServer_3014;
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return CompositeSrvClient_3015;
		case TopicEditPart.VISUAL_ID:
			return Topic_3016;
		case RobotEndPointEditPart.VISUAL_ID:
			return RobotEndPoint_3038;
		case EndPointParameterEditPart.VISUAL_ID:
			return EndPointParameter_3018;
		case EndPointPublisherEditPart.VISUAL_ID:
			return EndPointPublisher_3019;
		case EndPointSubscriberEditPart.VISUAL_ID:
			return EndPointSubscriber_3020;
		case EndPointSrvServerEditPart.VISUAL_ID:
			return EndPointSrvServer_3021;
		case EndPointSrvClientEditPart.VISUAL_ID:
			return EndPointSrvClient_3022;
		case Node2EditPart.VISUAL_ID:
			return Node_3040;
		case NodeParameter2EditPart.VISUAL_ID:
			return NodeParameter_3024;
		case NodePublisher2EditPart.VISUAL_ID:
			return NodePublisher_3025;
		case NodeSubscriber2EditPart.VISUAL_ID:
			return NodeSubscriber_3026;
		case NodeSrvServer2EditPart.VISUAL_ID:
			return NodeSrvServer_3027;
		case NodeSrvClient2EditPart.VISUAL_ID:
			return NodeSrvClient_3028;
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return EnvironmentEndPoint_3039;
		case EndPointParameter2EditPart.VISUAL_ID:
			return EndPointParameter_3030;
		case EndPointPublisher2EditPart.VISUAL_ID:
			return EndPointPublisher_3031;
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return EndPointSubscriber_3032;
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return EndPointSrvServer_3033;
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return EndPointSrvClient_3034;
		case Topic2EditPart.VISUAL_ID:
			return Topic_3035;
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return MsgInterfaceConnection_4002;
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return MsgInterfaceConnection_4003;
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4004;
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4005;
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return EndPointSrvConnection_4006;
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return EndPointMsgConnection_4007;
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return CompositeSrvConnection_4010;
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return ContainerSrvConnection_4009;
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
			return org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
