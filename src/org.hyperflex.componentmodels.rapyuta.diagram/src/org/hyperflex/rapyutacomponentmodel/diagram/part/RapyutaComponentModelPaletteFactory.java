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
package org.hyperflex.rapyutacomponentmodel.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class RapyutaComponentModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEntities1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Entities" palette tool group
	 * @generated
	 */
	private PaletteContainer createEntities1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Entities1Group_title);
		paletteContainer.setId("createEntities1Group"); //$NON-NLS-1$
		paletteContainer.add(createRobotContainer1CreationTool());
		paletteContainer.add(createCloudContainer2CreationTool());
		paletteContainer.add(createNode3CreationTool());
		paletteContainer.add(createImportComposite4CreationTool());
		paletteContainer.add(createEndPoint5CreationTool());
		paletteContainer.add(createPublisher6CreationTool());
		paletteContainer.add(createSubscriber7CreationTool());
		paletteContainer.add(createServiceServer8CreationTool());
		paletteContainer.add(createServiceClient9CreationTool());
		paletteContainer.add(createParameter10CreationTool());
		paletteContainer.add(createTopic11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createPromoteConnection1CreationTool());
		paletteContainer.add(createConnection2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRobotContainer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RobotContainer1CreationTool_title,
				Messages.RobotContainer1CreationTool_desc,
				Collections
						.singletonList(RapyutaComponentModelElementTypes.RobotContainer_2005));
		entry.setId("createRobotContainer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloudContainer2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CloudContainer2CreationTool_title,
				Messages.CloudContainer2CreationTool_desc,
				Collections
						.singletonList(RapyutaComponentModelElementTypes.CloudContainer_2006));
		entry.setId("createCloudContainer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Container.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.Node_3063);
		types.add(RapyutaComponentModelElementTypes.Node_3078);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node3CreationTool_title,
				Messages.Node3CreationTool_desc, types);
		entry.setId("createNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportComposite4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.Composite_3076);
		types.add(RapyutaComponentModelElementTypes.Composite_3081);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ImportComposite4CreationTool_title,
				Messages.ImportComposite4CreationTool_desc, types);
		entry.setId("createImportComposite4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndPoint5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.RobotEndPoint_3077);
		types.add(RapyutaComponentModelElementTypes.EnvironmentEndPoint_3079);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EndPoint5CreationTool_title,
				Messages.EndPoint5CreationTool_desc, types);
		entry.setId("createEndPoint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/EndPoint.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPublisher6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.NodePublisher_3043);
		types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
		types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3059);
		types.add(RapyutaComponentModelElementTypes.NodePublisher_3065);
		types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3071);
		types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Publisher6CreationTool_title,
				Messages.Publisher6CreationTool_desc, types);
		entry.setId("createPublisher6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Publisher.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubscriber7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3044);
		types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
		types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3060);
		types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3066);
		types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3072);
		types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subscriber7CreationTool_title,
				Messages.Subscriber7CreationTool_desc, types);
		entry.setId("createSubscriber7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Subscriber.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceServer8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.NodeSrvServer_3045);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvServer_3050);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvServer_3061);
		types.add(RapyutaComponentModelElementTypes.NodeSrvServer_3067);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvServer_3073);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvServer_3054);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceServer8CreationTool_title,
				Messages.ServiceServer8CreationTool_desc, types);
		entry.setId("createServiceServer8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ServiceServer.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceClient9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.NodeSrvClient_3046);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvClient_3051);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvClient_3062);
		types.add(RapyutaComponentModelElementTypes.NodeSrvClient_3068);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvClient_3074);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvClient_3055);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceClient9CreationTool_title,
				Messages.ServiceClient9CreationTool_desc, types);
		entry.setId("createServiceClient9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ServiceClient.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(RapyutaComponentModelElementTypes.NodeParameter_3042);
		types.add(RapyutaComponentModelElementTypes.EndPointParameter_3058);
		types.add(RapyutaComponentModelElementTypes.NodeParameter_3064);
		types.add(RapyutaComponentModelElementTypes.EndPointParameter_3070);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parameter10CreationTool_title,
				Messages.Parameter10CreationTool_desc, types);
		entry.setId("createParameter10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Parameter.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTopic11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.Topic_3075);
		types.add(RapyutaComponentModelElementTypes.Topic_3080);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Topic11CreationTool_title,
				Messages.Topic11CreationTool_desc, types);
		entry.setId("createTopic11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Topic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPromoteConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4013);
		types.add(RapyutaComponentModelElementTypes.CompositeMsgInterfaceExposed_4014);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PromoteConnection1CreationTool_title,
				Messages.PromoteConnection1CreationTool_desc, types);
		entry.setId("createPromoteConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Connection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.MsgInterfaceConnection_4011);
		types.add(RapyutaComponentModelElementTypes.MsgInterfaceConnection_4012);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvConnection_4015);
		types.add(RapyutaComponentModelElementTypes.EndPointMsgConnection_4016);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvConnection_4017);
		types.add(RapyutaComponentModelElementTypes.ContainerSrvConnection_4018);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection2CreationTool_title,
				Messages.Connection2CreationTool_desc, types);
		entry.setId("createConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Connection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
