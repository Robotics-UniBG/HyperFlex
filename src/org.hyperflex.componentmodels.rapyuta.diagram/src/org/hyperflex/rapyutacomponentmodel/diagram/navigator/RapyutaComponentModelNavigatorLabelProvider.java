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
package org.hyperflex.rapyutacomponentmodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.hyperflex.rapyutacomponentmodel.CompositePublisher;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvClient;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvServer;
import org.hyperflex.rapyutacomponentmodel.CompositeSubscriber;
import org.hyperflex.rapyutacomponentmodel.EndPointPublisher;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvClient;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvServer;
import org.hyperflex.rapyutacomponentmodel.EndPointSubscriber;
import org.hyperflex.rapyutacomponentmodel.NodePublisher;
import org.hyperflex.rapyutacomponentmodel.NodeSrvClient;
import org.hyperflex.rapyutacomponentmodel.NodeSrvServer;
import org.hyperflex.rapyutacomponentmodel.NodeSubscriber;
import org.hyperflex.rapyutacomponentmodel.System;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeNameEditPart;
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointMsgConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterNameEditPart;
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Node2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Topic2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel3EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel4EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabelEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelDiagramEditorPlugin;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelParserProvider;

/**
 * @generated
 */
public class RapyutaComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RapyutaComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RapyutaComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RapyutaComponentModelNavigatorItem
				&& !isOwnView(((RapyutaComponentModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RapyutaComponentModelNavigatorGroup) {
			RapyutaComponentModelNavigatorGroup group = (RapyutaComponentModelNavigatorGroup) element;
			return RapyutaComponentModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof RapyutaComponentModelNavigatorItem) {
			RapyutaComponentModelNavigatorItem navigatorItem = (RapyutaComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.hyperflex.org/componentmodels.rapyuta?System", RapyutaComponentModelElementTypes.System_1000); //$NON-NLS-1$
		case CompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/componentmodels.rapyuta?Composite", RapyutaComponentModelElementTypes.Composite_2003); //$NON-NLS-1$
		case ContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/componentmodels.rapyuta?Container", RapyutaComponentModelElementTypes.Container_2004); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?Node", RapyutaComponentModelElementTypes.Node_3041); //$NON-NLS-1$
		case NodeParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeParameter", RapyutaComponentModelElementTypes.NodeParameter_3042); //$NON-NLS-1$
		case NodePublisherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodePublisher", RapyutaComponentModelElementTypes.NodePublisher_3043); //$NON-NLS-1$
		case NodeSubscriberEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeSubscriber", RapyutaComponentModelElementTypes.NodeSubscriber_3044); //$NON-NLS-1$
		case NodeSrvServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeSrvServer", RapyutaComponentModelElementTypes.NodeSrvServer_3045); //$NON-NLS-1$
		case NodeSrvClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeSrvClient", RapyutaComponentModelElementTypes.NodeSrvClient_3046); //$NON-NLS-1$
		case Composite2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?Composite", RapyutaComponentModelElementTypes.Composite_3047); //$NON-NLS-1$
		case CompositePublisherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositePublisher", RapyutaComponentModelElementTypes.CompositePublisher_3048); //$NON-NLS-1$
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSubscriber", RapyutaComponentModelElementTypes.CompositeSubscriber_3049); //$NON-NLS-1$
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSrvServer", RapyutaComponentModelElementTypes.CompositeSrvServer_3050); //$NON-NLS-1$
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSrvClient", RapyutaComponentModelElementTypes.CompositeSrvClient_3051); //$NON-NLS-1$
		case CompositePublisher2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositePublisher", RapyutaComponentModelElementTypes.CompositePublisher_3052); //$NON-NLS-1$
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSubscriber", RapyutaComponentModelElementTypes.CompositeSubscriber_3053); //$NON-NLS-1$
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSrvServer", RapyutaComponentModelElementTypes.CompositeSrvServer_3054); //$NON-NLS-1$
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSrvClient", RapyutaComponentModelElementTypes.CompositeSrvClient_3055); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?Topic", RapyutaComponentModelElementTypes.Topic_3056); //$NON-NLS-1$
		case RobotEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?RobotEndPoint", RapyutaComponentModelElementTypes.RobotEndPoint_3057); //$NON-NLS-1$
		case EndPointParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointParameter", RapyutaComponentModelElementTypes.EndPointParameter_3058); //$NON-NLS-1$
		case EndPointPublisherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointPublisher", RapyutaComponentModelElementTypes.EndPointPublisher_3059); //$NON-NLS-1$
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSubscriber", RapyutaComponentModelElementTypes.EndPointSubscriber_3060); //$NON-NLS-1$
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSrvServer", RapyutaComponentModelElementTypes.EndPointSrvServer_3061); //$NON-NLS-1$
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSrvClient", RapyutaComponentModelElementTypes.EndPointSrvClient_3062); //$NON-NLS-1$
		case Node2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?Node", RapyutaComponentModelElementTypes.Node_3063); //$NON-NLS-1$
		case NodeParameter2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeParameter", RapyutaComponentModelElementTypes.NodeParameter_3064); //$NON-NLS-1$
		case NodePublisher2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodePublisher", RapyutaComponentModelElementTypes.NodePublisher_3065); //$NON-NLS-1$
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeSubscriber", RapyutaComponentModelElementTypes.NodeSubscriber_3066); //$NON-NLS-1$
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeSrvServer", RapyutaComponentModelElementTypes.NodeSrvServer_3067); //$NON-NLS-1$
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?NodeSrvClient", RapyutaComponentModelElementTypes.NodeSrvClient_3068); //$NON-NLS-1$
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EnvironmentEndPoint", RapyutaComponentModelElementTypes.EnvironmentEndPoint_3069); //$NON-NLS-1$
		case EndPointParameter2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointParameter", RapyutaComponentModelElementTypes.EndPointParameter_3070); //$NON-NLS-1$
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointPublisher", RapyutaComponentModelElementTypes.EndPointPublisher_3071); //$NON-NLS-1$
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSubscriber", RapyutaComponentModelElementTypes.EndPointSubscriber_3072); //$NON-NLS-1$
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSrvServer", RapyutaComponentModelElementTypes.EndPointSrvServer_3073); //$NON-NLS-1$
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSrvClient", RapyutaComponentModelElementTypes.EndPointSrvClient_3074); //$NON-NLS-1$
		case Topic2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.rapyuta?Topic", RapyutaComponentModelElementTypes.Topic_3075); //$NON-NLS-1$
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?MsgInterface?connection", RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011); //$NON-NLS-1$
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?MsgInterface?connection", RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012); //$NON-NLS-1$
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?CompositeMsgInterface?exposed", RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013); //$NON-NLS-1$
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?CompositeMsgInterface?exposed", RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014); //$NON-NLS-1$
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?EndPointSrvConnection", RapyutaComponentModelElementTypes.EndPointSrvConnection_4015); //$NON-NLS-1$
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?EndPointMsgConnection", RapyutaComponentModelElementTypes.EndPointMsgConnection_4016); //$NON-NLS-1$
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?CompositeSrvConnection", RapyutaComponentModelElementTypes.CompositeSrvConnection_4017); //$NON-NLS-1$
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.rapyuta?ContainerSrvConnection", RapyutaComponentModelElementTypes.ContainerSrvConnection_4018); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RapyutaComponentModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& RapyutaComponentModelElementTypes
						.isKnownElementType(elementType)) {
			image = RapyutaComponentModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RapyutaComponentModelNavigatorGroup) {
			RapyutaComponentModelNavigatorGroup group = (RapyutaComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RapyutaComponentModelNavigatorItem) {
			RapyutaComponentModelNavigatorItem navigatorItem = (RapyutaComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2003Text(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2004Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3041Text(view);
		case NodeParameterEditPart.VISUAL_ID:
			return getNodeParameter_3042Text(view);
		case NodePublisherEditPart.VISUAL_ID:
			return getNodePublisher_3043Text(view);
		case NodeSubscriberEditPart.VISUAL_ID:
			return getNodeSubscriber_3044Text(view);
		case NodeSrvServerEditPart.VISUAL_ID:
			return getNodeSrvServer_3045Text(view);
		case NodeSrvClientEditPart.VISUAL_ID:
			return getNodeSrvClient_3046Text(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3047Text(view);
		case CompositePublisherEditPart.VISUAL_ID:
			return getCompositePublisher_3048Text(view);
		case CompositeSubscriberEditPart.VISUAL_ID:
			return getCompositeSubscriber_3049Text(view);
		case CompositeSrvServerEditPart.VISUAL_ID:
			return getCompositeSrvServer_3050Text(view);
		case CompositeSrvClientEditPart.VISUAL_ID:
			return getCompositeSrvClient_3051Text(view);
		case CompositePublisher2EditPart.VISUAL_ID:
			return getCompositePublisher_3052Text(view);
		case CompositeSubscriber2EditPart.VISUAL_ID:
			return getCompositeSubscriber_3053Text(view);
		case CompositeSrvServer2EditPart.VISUAL_ID:
			return getCompositeSrvServer_3054Text(view);
		case CompositeSrvClient2EditPart.VISUAL_ID:
			return getCompositeSrvClient_3055Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3056Text(view);
		case RobotEndPointEditPart.VISUAL_ID:
			return getRobotEndPoint_3057Text(view);
		case EndPointParameterEditPart.VISUAL_ID:
			return getEndPointParameter_3058Text(view);
		case EndPointPublisherEditPart.VISUAL_ID:
			return getEndPointPublisher_3059Text(view);
		case EndPointSubscriberEditPart.VISUAL_ID:
			return getEndPointSubscriber_3060Text(view);
		case EndPointSrvServerEditPart.VISUAL_ID:
			return getEndPointSrvServer_3061Text(view);
		case EndPointSrvClientEditPart.VISUAL_ID:
			return getEndPointSrvClient_3062Text(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_3063Text(view);
		case NodeParameter2EditPart.VISUAL_ID:
			return getNodeParameter_3064Text(view);
		case NodePublisher2EditPart.VISUAL_ID:
			return getNodePublisher_3065Text(view);
		case NodeSubscriber2EditPart.VISUAL_ID:
			return getNodeSubscriber_3066Text(view);
		case NodeSrvServer2EditPart.VISUAL_ID:
			return getNodeSrvServer_3067Text(view);
		case NodeSrvClient2EditPart.VISUAL_ID:
			return getNodeSrvClient_3068Text(view);
		case EnvironmentEndPointEditPart.VISUAL_ID:
			return getEnvironmentEndPoint_3069Text(view);
		case EndPointParameter2EditPart.VISUAL_ID:
			return getEndPointParameter_3070Text(view);
		case EndPointPublisher2EditPart.VISUAL_ID:
			return getEndPointPublisher_3071Text(view);
		case EndPointSubscriber2EditPart.VISUAL_ID:
			return getEndPointSubscriber_3072Text(view);
		case EndPointSrvServer2EditPart.VISUAL_ID:
			return getEndPointSrvServer_3073Text(view);
		case EndPointSrvClient2EditPart.VISUAL_ID:
			return getEndPointSrvClient_3074Text(view);
		case Topic2EditPart.VISUAL_ID:
			return getTopic_3075Text(view);
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4011Text(view);
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4012Text(view);
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4013Text(view);
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4014Text(view);
		case EndPointSrvConnectionEditPart.VISUAL_ID:
			return getEndPointSrvConnection_4015Text(view);
		case EndPointMsgConnectionEditPart.VISUAL_ID:
			return getEndPointMsgConnection_4016Text(view);
		case CompositeSrvConnectionEditPart.VISUAL_ID:
			return getCompositeSrvConnection_4017Text(view);
		case ContainerSrvConnectionEditPart.VISUAL_ID:
			return getContainerSrvConnection_4018Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		System domainModelElement = (System) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposite_2003Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Composite_2003, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(CompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContainer_2004Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Container_2004, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(ContainerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_3041Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Node_3041,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeParameter_3042Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.NodeParameter_3042, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(NodeParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodePublisher_3043Text(View view) {
		NodePublisher domainModelElement = (NodePublisher) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSubscriber_3044Text(View view) {
		NodeSubscriber domainModelElement = (NodeSubscriber) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSrvServer_3045Text(View view) {
		NodeSrvServer domainModelElement = (NodeSrvServer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSrvClient_3046Text(View view) {
		NodeSrvClient domainModelElement = (NodeSrvClient) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposite_3047Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Composite_3047, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(CompositeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositePublisher_3048Text(View view) {
		CompositePublisher domainModelElement = (CompositePublisher) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSubscriber_3049Text(View view) {
		CompositeSubscriber domainModelElement = (CompositeSubscriber) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvServer_3050Text(View view) {
		CompositeSrvServer domainModelElement = (CompositeSrvServer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvClient_3051Text(View view) {
		CompositeSrvClient domainModelElement = (CompositeSrvClient) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositePublisher_3052Text(View view) {
		CompositePublisher domainModelElement = (CompositePublisher) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSubscriber_3053Text(View view) {
		CompositeSubscriber domainModelElement = (CompositeSubscriber) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvServer_3054Text(View view) {
		CompositeSrvServer domainModelElement = (CompositeSrvServer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvClient_3055Text(View view) {
		CompositeSrvClient domainModelElement = (CompositeSrvClient) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_3056Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Topic_3056,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(TopicNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRobotEndPoint_3057Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.RobotEndPoint_3057, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(RobotEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointParameter_3058Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.EndPointParameter_3058, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(EndPointParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointPublisher_3059Text(View view) {
		EndPointPublisher domainModelElement = (EndPointPublisher) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointSubscriber_3060Text(View view) {
		EndPointSubscriber domainModelElement = (EndPointSubscriber) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointSrvServer_3061Text(View view) {
		EndPointSrvServer domainModelElement = (EndPointSrvServer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointSrvClient_3062Text(View view) {
		EndPointSrvClient domainModelElement = (EndPointSrvClient) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_3063Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Node_3063,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(NodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeParameter_3064Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.NodeParameter_3064, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(NodeParameterName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodePublisher_3065Text(View view) {
		NodePublisher domainModelElement = (NodePublisher) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSubscriber_3066Text(View view) {
		NodeSubscriber domainModelElement = (NodeSubscriber) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSrvServer_3067Text(View view) {
		NodeSrvServer domainModelElement = (NodeSrvServer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeSrvClient_3068Text(View view) {
		NodeSrvClient domainModelElement = (NodeSrvClient) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnvironmentEndPoint_3069Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.EnvironmentEndPoint_3069,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(EnvironmentEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointParameter_3070Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.EndPointParameter_3070, view
						.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(EndPointParameterName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointPublisher_3071Text(View view) {
		EndPointPublisher domainModelElement = (EndPointPublisher) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointSubscriber_3072Text(View view) {
		EndPointSubscriber domainModelElement = (EndPointSubscriber) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointSrvServer_3073Text(View view) {
		EndPointSrvServer domainModelElement = (EndPointSrvServer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointSrvClient_3074Text(View view) {
		EndPointSrvClient domainModelElement = (EndPointSrvClient) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_3075Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.Topic_3075,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(TopicName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMsgInterfaceConnection_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMsgInterfaceConnection_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgInterfaceExposed_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgInterfaceExposed_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEndPointSrvConnection_4015Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.EndPointSrvConnection_4015,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndPointMsgConnection_4016Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.EndPointMsgConnection_4016,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSrvConnection_4017Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.CompositeSrvConnection_4017,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContainerSrvConnection_4018Text(View view) {
		IParser parser = RapyutaComponentModelParserProvider.getParser(
				RapyutaComponentModelElementTypes.ContainerSrvConnection_4018,
				view.getElement() != null ? view.getElement() : view,
				RapyutaComponentModelVisualIDRegistry
						.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RapyutaComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SystemEditPart.MODEL_ID
				.equals(RapyutaComponentModelVisualIDRegistry.getModelID(view));
	}

}
