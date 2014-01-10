/*
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerEditPart;
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotContainerEditPart;
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
	public static final IElementType RobotContainer_2005 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.RobotContainer_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloudContainer_2006 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CloudContainer_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeParameter_3042 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeParameter_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodePublisher_3043 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodePublisher_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSubscriber_3044 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSubscriber_3044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSrvServer_3045 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvServer_3045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSrvClient_3046 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvClient_3046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Composite_3076 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Composite_3076"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositePublisher_3048 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositePublisher_3048"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSubscriber_3049 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSubscriber_3049"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvServer_3050 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvServer_3050"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvClient_3051 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvClient_3051"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositePublisher_3052 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositePublisher_3052"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSubscriber_3053 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSubscriber_3053"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvServer_3054 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvServer_3054"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvClient_3055 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvClient_3055"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointParameter_3058 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointParameter_3058"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointPublisher_3059 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointPublisher_3059"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSubscriber_3060 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSubscriber_3060"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvServer_3061 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvServer_3061"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvClient_3062 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvClient_3062"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_3078 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Node_3078"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_3063 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Node_3063"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeParameter_3064 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeParameter_3064"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodePublisher_3065 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodePublisher_3065"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSubscriber_3066 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSubscriber_3066"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSrvServer_3067 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvServer_3067"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeSrvClient_3068 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.NodeSrvClient_3068"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnvironmentEndPoint_3079 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EnvironmentEndPoint_3079"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointParameter_3070 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointParameter_3070"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointPublisher_3071 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointPublisher_3071"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSubscriber_3072 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSubscriber_3072"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvServer_3073 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvServer_3073"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvClient_3074 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvClient_3074"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Topic_3080 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Topic_3080"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Composite_3081 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Composite_3081"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Topic_3075 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.Topic_3075"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RobotEndPoint_3077 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.RobotEndPoint_3077"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4011 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.MsgInterfaceConnection_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MsgInterfaceConnection_4012 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.MsgInterfaceConnection_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4013 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeMsgInterfaceExposed_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMsgInterfaceExposed_4014 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeMsgInterfaceExposed_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointSrvConnection_4015 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointSrvConnection_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndPointMsgConnection_4016 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.EndPointMsgConnection_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeSrvConnection_4017 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.CompositeSrvConnection_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContainerSrvConnection_4018 = getElementType("org.hyperflex.componentmodels.rapyuta.diagram.ContainerSrvConnection_4018"); //$NON-NLS-1$

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
					RobotContainer_2005,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getRobotContainer());

			elements.put(
					CloudContainer_2006,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCloudContainer());

			elements.put(
					Node_3063,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeParameter_3042,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeParameter());

			elements.put(
					NodePublisher_3043,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodePublisher());

			elements.put(
					NodeSubscriber_3044,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSubscriber());

			elements.put(
					NodeSrvServer_3045,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvServer());

			elements.put(
					NodeSrvClient_3046,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvClient());

			elements.put(
					Composite_3076,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompositePublisher_3048,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositePublisher());

			elements.put(
					CompositeSubscriber_3049,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSubscriber());

			elements.put(
					CompositeSrvServer_3050,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvServer());

			elements.put(
					CompositeSrvClient_3051,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvClient());

			elements.put(
					Topic_3075,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					RobotEndPoint_3077,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getRobotEndPoint());

			elements.put(
					EndPointParameter_3058,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointParameter());

			elements.put(
					EndPointPublisher_3059,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointPublisher());

			elements.put(
					EndPointSubscriber_3060,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSubscriber());

			elements.put(
					EndPointSrvServer_3061,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvServer());

			elements.put(
					EndPointSrvClient_3062,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvClient());

			elements.put(
					Node_3078,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNode());

			elements.put(
					NodeParameter_3064,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeParameter());

			elements.put(
					NodePublisher_3065,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodePublisher());

			elements.put(
					NodeSubscriber_3066,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSubscriber());

			elements.put(
					NodeSrvServer_3067,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvServer());

			elements.put(
					NodeSrvClient_3068,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getNodeSrvClient());

			elements.put(
					EnvironmentEndPoint_3079,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEnvironmentEndPoint());

			elements.put(
					EndPointParameter_3070,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointParameter());

			elements.put(
					EndPointPublisher_3071,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointPublisher());

			elements.put(
					EndPointSubscriber_3072,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSubscriber());

			elements.put(
					EndPointSrvServer_3073,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvServer());

			elements.put(
					EndPointSrvClient_3074,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvClient());

			elements.put(
					Topic_3080,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getTopic());

			elements.put(
					Composite_3081,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getComposite());

			elements.put(
					CompositePublisher_3052,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositePublisher());

			elements.put(
					CompositeSubscriber_3053,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSubscriber());

			elements.put(
					CompositeSrvServer_3054,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvServer());

			elements.put(
					CompositeSrvClient_3055,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvClient());

			elements.put(
					MsgInterfaceConnection_4011,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					MsgInterfaceConnection_4012,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getMsgInterface_Connection());

			elements.put(
					CompositeMsgInterfaceExposed_4013,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					CompositeMsgInterfaceExposed_4014,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeMsgInterface_Exposed());

			elements.put(
					EndPointSrvConnection_4015,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointSrvConnection());

			elements.put(
					EndPointMsgConnection_4016,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getEndPointMsgConnection());

			elements.put(
					CompositeSrvConnection_4017,
					org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
							.getCompositeSrvConnection());

			elements.put(
					ContainerSrvConnection_4018,
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
			KNOWN_ELEMENT_TYPES.add(RobotContainer_2005);
			KNOWN_ELEMENT_TYPES.add(CloudContainer_2006);
			KNOWN_ELEMENT_TYPES.add(Node_3063);
			KNOWN_ELEMENT_TYPES.add(NodeParameter_3042);
			KNOWN_ELEMENT_TYPES.add(NodePublisher_3043);
			KNOWN_ELEMENT_TYPES.add(NodeSubscriber_3044);
			KNOWN_ELEMENT_TYPES.add(NodeSrvServer_3045);
			KNOWN_ELEMENT_TYPES.add(NodeSrvClient_3046);
			KNOWN_ELEMENT_TYPES.add(Composite_3076);
			KNOWN_ELEMENT_TYPES.add(CompositePublisher_3048);
			KNOWN_ELEMENT_TYPES.add(CompositeSubscriber_3049);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvServer_3050);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvClient_3051);
			KNOWN_ELEMENT_TYPES.add(Topic_3075);
			KNOWN_ELEMENT_TYPES.add(RobotEndPoint_3077);
			KNOWN_ELEMENT_TYPES.add(EndPointParameter_3058);
			KNOWN_ELEMENT_TYPES.add(EndPointPublisher_3059);
			KNOWN_ELEMENT_TYPES.add(EndPointSubscriber_3060);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvServer_3061);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvClient_3062);
			KNOWN_ELEMENT_TYPES.add(Node_3078);
			KNOWN_ELEMENT_TYPES.add(NodeParameter_3064);
			KNOWN_ELEMENT_TYPES.add(NodePublisher_3065);
			KNOWN_ELEMENT_TYPES.add(NodeSubscriber_3066);
			KNOWN_ELEMENT_TYPES.add(NodeSrvServer_3067);
			KNOWN_ELEMENT_TYPES.add(NodeSrvClient_3068);
			KNOWN_ELEMENT_TYPES.add(EnvironmentEndPoint_3079);
			KNOWN_ELEMENT_TYPES.add(EndPointParameter_3070);
			KNOWN_ELEMENT_TYPES.add(EndPointPublisher_3071);
			KNOWN_ELEMENT_TYPES.add(EndPointSubscriber_3072);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvServer_3073);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvClient_3074);
			KNOWN_ELEMENT_TYPES.add(Topic_3080);
			KNOWN_ELEMENT_TYPES.add(Composite_3081);
			KNOWN_ELEMENT_TYPES.add(CompositePublisher_3052);
			KNOWN_ELEMENT_TYPES.add(CompositeSubscriber_3053);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvServer_3054);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvClient_3055);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4011);
			KNOWN_ELEMENT_TYPES.add(MsgInterfaceConnection_4012);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4013);
			KNOWN_ELEMENT_TYPES.add(CompositeMsgInterfaceExposed_4014);
			KNOWN_ELEMENT_TYPES.add(EndPointSrvConnection_4015);
			KNOWN_ELEMENT_TYPES.add(EndPointMsgConnection_4016);
			KNOWN_ELEMENT_TYPES.add(CompositeSrvConnection_4017);
			KNOWN_ELEMENT_TYPES.add(ContainerSrvConnection_4018);
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
		case RobotContainerEditPart.VISUAL_ID:
			return RobotContainer_2005;
		case CloudContainerEditPart.VISUAL_ID:
			return CloudContainer_2006;
		case Node2EditPart.VISUAL_ID:
			return Node_3063;
		case NodeParameterEditPart.VISUAL_ID:
			return NodeParameter_3042;
		case NodePublisherEditPart.VISUAL_ID:
			return NodePublisher_3043;
		case NodeSubscriberEditPart.VISUAL_ID:
			return NodeSubscriber_3044;
		case NodeSrvServerEditPart.VISUAL_ID:
			return NodeSrvServer_3045;
		case NodeSrvClientEditPart.VISUAL_ID:
			return NodeSrvClient_3046;
		case CompositeEditPart.VISUAL_ID:
			return Composite_3076;
		case CompositePublisherEditPart.VISUAL_ID:
			return CompositePublisher_3048;
		case CompositeSubscriberEditPart.VISUAL_ID:
			return CompositeSubscriber_3049;
		case CompositeSrvServerEditPart.VISUAL_ID:
			return CompositeSrvServer_3050;
		case CompositeSrvClientEditPart.VISUAL_ID:
			return CompositeSrvClient_3051;
		case Topic2EditPart.VISUAL_ID:
			return Topic_3075;
		case RobotEndPointEditPart.VISUAL_ID:
			return RobotEndPoint_3077;
		case EndPointParameterEditPart.VISUAL_ID:
			return EndPointParameter_3058;
		case EndPointPublisherEditPart.VISUAL_ID:
			return EndPointPublisher_3059;
		case EndPointSubscriberEditPart.VISUAL_ID:
			return EndPointSubscriber_3060;
		case EndPointSrvServerEditPart.VISUAL_ID:
			return EndPointSrvServer_3061;
		case EndPointSrvClientEditPart.VISUAL_ID:
			return EndPointSrvClient_3062;
		case NodeEditPart.VISUAL_ID:
			return Node_3078;
		case NodeParameter2EditPart.VISUAL_ID:
			return NodeParameter_3064;
		case NodePublisher2EditPart.VISUAL_ID:
			return NodePublisher_3065;
		case NodeSubscriber2EditPart.VISUAL_ID:
			return NodeSubscriber_3066;
		case NodeSrvServer2EditPart.VISUAL_ID:
			return NodeSrvServer_3067;
		case NodeSrvClient2EditPart.VISUAL_ID:
			return NodeSrvClient_3068;
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return EnvironmentEndPoint_3079;
		case EndPointParameter2EditPart.VISUAL_ID:
			return EndPointParameter_3070;
		case EndPointPublisher2EditPart.VISUAL_ID:
			return EndPointPublisher_3071;
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return EndPointSubscriber_3072;
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return EndPointSrvServer_3073;
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return EndPointSrvClient_3074;
		case TopicEditPart.VISUAL_ID:
			return Topic_3080;
		case Composite2EditPart.VISUAL_ID:
			return Composite_3081;
		case CompositePublisher2EditPart.VISUAL_ID:
			return CompositePublisher_3052;
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return CompositeSubscriber_3053;
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return CompositeSrvServer_3054;
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return CompositeSrvClient_3055;
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return MsgInterfaceConnection_4011;
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return MsgInterfaceConnection_4012;
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4013;
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return CompositeMsgInterfaceExposed_4014;
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return EndPointSrvConnection_4015;
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return EndPointMsgConnection_4016;
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return CompositeSrvConnection_4017;
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return ContainerSrvConnection_4018;
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
