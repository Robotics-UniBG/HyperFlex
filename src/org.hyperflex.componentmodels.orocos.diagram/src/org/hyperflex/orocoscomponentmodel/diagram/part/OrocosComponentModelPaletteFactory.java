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
package org.hyperflex.orocoscomponentmodel.diagram.part;

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
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

/**
 * @generated
 */
public class OrocosComponentModelPaletteFactory {

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
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createOutputPort2CreationTool());
		paletteContainer.add(createInputPort3CreationTool());
		paletteContainer.add(createProperty4CreationTool());
		paletteContainer.add(createComposite5CreationTool());
		paletteContainer.add(createImportComposite6CreationTool());
		paletteContainer.add(createOperation7CreationTool());
		paletteContainer.add(createOperationCaller8CreationTool());
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
		paletteContainer.add(createContinueconnection2CreationTool());
		paletteContainer.add(createEventconnection3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections
						.singletonList(OrocosComponentModelElementTypes.TaskContext_3017));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Component.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(OrocosComponentModelElementTypes.TCOutputDataPort_3019);
		types.add(OrocosComponentModelElementTypes.CompOutputPort_3025);
		types.add(OrocosComponentModelElementTypes.CompOutputPort_3029);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputPort2CreationTool_title,
				Messages.OutputPort2CreationTool_desc, types);
		entry.setId("createOutputPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/OutputPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPort3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(OrocosComponentModelElementTypes.TCInputDataPort_3018);
		types.add(OrocosComponentModelElementTypes.CompInputPort_3024);
		types.add(OrocosComponentModelElementTypes.CompInputPort_3028);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputPort3CreationTool_title,
				Messages.InputPort3CreationTool_desc, types);
		entry.setId("createInputPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/InputPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property4CreationTool_title,
				Messages.Property4CreationTool_desc,
				Collections
						.singletonList(OrocosComponentModelElementTypes.TCProperty_3020));
		entry.setId("createProperty4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Property.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposite5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Composite5CreationTool_title,
				Messages.Composite5CreationTool_desc,
				Collections
						.singletonList(OrocosComponentModelElementTypes.Composite_2002));
		entry.setId("createComposite5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportComposite6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ImportComposite6CreationTool_title,
				Messages.ImportComposite6CreationTool_desc,
				Collections
						.singletonList(OrocosComponentModelElementTypes.Composite_3023));
		entry.setId("createImportComposite6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(OrocosComponentModelElementTypes.TCOperation_3021);
		types.add(OrocosComponentModelElementTypes.CompOperation_3026);
		types.add(OrocosComponentModelElementTypes.CompOperation_3030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation7CreationTool_title,
				Messages.Operation7CreationTool_desc, types);
		entry.setId("createOperation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/OutputPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperationCaller8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(OrocosComponentModelElementTypes.TCOperationCaller_3022);
		types.add(OrocosComponentModelElementTypes.CompOperationCaller_3027);
		types.add(OrocosComponentModelElementTypes.CompOperationCaller_3031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OperationCaller8CreationTool_title,
				Messages.OperationCaller8CreationTool_desc, types);
		entry.setId("createOperationCaller8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/InputPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPromoteConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(OrocosComponentModelElementTypes.CompOutputPort_4011);
		types.add(OrocosComponentModelElementTypes.CompInputPort_4012);
		types.add(OrocosComponentModelElementTypes.CompOperation_4014);
		types.add(OrocosComponentModelElementTypes.CompOperationCaller_4015);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PromoteConnection1CreationTool_title,
				Messages.PromoteConnection1CreationTool_desc, types);
		entry.setId("createPromoteConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/PromoteConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinueconnection2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(OrocosComponentModelElementTypes.ConnectionPolicy_4010);
		types.add(OrocosComponentModelElementTypes.PeersConnection_4013);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Continueconnection2CreationTool_title,
				Messages.Continueconnection2CreationTool_desc, types);
		entry.setId("createContinueconnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ContinueConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventconnection3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Eventconnection3CreationTool_title,
				Messages.Eventconnection3CreationTool_desc, null, null) {
		};
		entry.setId("createEventconnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrocosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/EventConnection.gif")); //$NON-NLS-1$
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
