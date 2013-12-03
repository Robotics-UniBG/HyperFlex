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
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createPublisher2CreationTool());
		paletteContainer.add(createSubscriber3CreationTool());
		paletteContainer.add(createParameter4CreationTool());
		paletteContainer.add(createComposite5CreationTool());
		paletteContainer.add(createContainer6CreationTool());
		paletteContainer.add(createImportComposite7CreationTool());
		paletteContainer.add(createTopic8CreationTool());
		paletteContainer.add(createEndPoint9CreationTool());
		paletteContainer.add(createServiceServer10CreationTool());
		paletteContainer.add(createServiceClient11CreationTool());
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
	private ToolEntry createNode1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.Node_3041);
		types.add(RapyutaComponentModelElementTypes.Node_3063);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node1CreationTool_title,
				Messages.Node1CreationTool_desc, types);
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPublisher2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.NodePublisher_3043);
		types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
		types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
		types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3059);
		types.add(RapyutaComponentModelElementTypes.NodePublisher_3065);
		types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3071);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Publisher2CreationTool_title,
				Messages.Publisher2CreationTool_desc, types);
		entry.setId("createPublisher2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Publisher.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubscriber3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3044);
		types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
		types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
		types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3060);
		types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3066);
		types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3072);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subscriber3CreationTool_title,
				Messages.Subscriber3CreationTool_desc, types);
		entry.setId("createSubscriber3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Subscriber.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(RapyutaComponentModelElementTypes.NodeParameter_3042);
		types.add(RapyutaComponentModelElementTypes.EndPointParameter_3058);
		types.add(RapyutaComponentModelElementTypes.NodeParameter_3064);
		types.add(RapyutaComponentModelElementTypes.EndPointParameter_3070);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parameter4CreationTool_title,
				Messages.Parameter4CreationTool_desc, types);
		entry.setId("createParameter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Parameter.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposite5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.Composite_2003);
		types.add(RapyutaComponentModelElementTypes.Composite_3047);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Composite5CreationTool_title,
				Messages.Composite5CreationTool_desc, types);
		entry.setId("createComposite5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContainer6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Container6CreationTool_title,
				Messages.Container6CreationTool_desc,
				Collections
						.singletonList(RapyutaComponentModelElementTypes.Container_2004));
		entry.setId("createContainer6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Container.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportComposite7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ImportComposite7CreationTool_title,
				Messages.ImportComposite7CreationTool_desc, null, null) {
		};
		entry.setId("createImportComposite7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTopic8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.Topic_3056);
		types.add(RapyutaComponentModelElementTypes.Topic_3075);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Topic8CreationTool_title,
				Messages.Topic8CreationTool_desc, types);
		entry.setId("createTopic8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Topic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndPoint9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RapyutaComponentModelElementTypes.RobotEndPoint_3057);
		types.add(RapyutaComponentModelElementTypes.EnvironmentEndPoint_3069);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EndPoint9CreationTool_title,
				Messages.EndPoint9CreationTool_desc, types);
		entry.setId("createEndPoint9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/EndPoint.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceServer10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(RapyutaComponentModelElementTypes.NodeSrvServer_3045);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvServer_3054);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvServer_3061);
		types.add(RapyutaComponentModelElementTypes.NodeSrvServer_3067);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvServer_3073);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceServer10CreationTool_title,
				Messages.ServiceServer10CreationTool_desc, types);
		entry.setId("createServiceServer10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ServiceServer.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceClient11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(RapyutaComponentModelElementTypes.NodeSrvClient_3046);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvServer_3050);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvClient_3051);
		types.add(RapyutaComponentModelElementTypes.CompositeSrvClient_3055);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvClient_3062);
		types.add(RapyutaComponentModelElementTypes.NodeSrvClient_3068);
		types.add(RapyutaComponentModelElementTypes.EndPointSrvClient_3074);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceClient11CreationTool_title,
				Messages.ServiceClient11CreationTool_desc, types);
		entry.setId("createServiceClient11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RapyutaComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ServiceClient.gif")); //$NON-NLS-1$
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
