/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
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
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.featuremodels.diagram.part;

import it.unibg.robotics.featuremodels.diagram.providers.FeatureModelElementTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FeatureModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createFeature1CreationTool());
		paletteContainer.add(createContainmentAssociation2CreationTool());
		paletteContainer.add(createSimpleAttribute3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFeature1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FeatureModelElementTypes.Feature_2005);
		types.add(FeatureModelElementTypes.Feature_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Feature1CreationTool_title, null, types);
		entry.setId("createFeature1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeatureModelDiagramEditorPlugin
				.findImageDescriptor("icons/Feature.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContainmentAssociation2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContainmentAssociation2CreationTool_title,
				null,
				Collections
						.singletonList(FeatureModelElementTypes.ContainmentAssociation_3001));
		entry.setId("createContainmentAssociation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeatureModelDiagramEditorPlugin
				.findImageDescriptor("icons/ContainmentAssociation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimpleAttribute3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SimpleAttribute3CreationTool_title,
				Messages.SimpleAttribute3CreationTool_desc,
				Collections
						.singletonList(FeatureModelElementTypes.SimpleAttribute_2008));
		entry.setId("createSimpleAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeatureModelDiagramEditorPlugin
				.findImageDescriptor("icons/SimpleAttribute.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(FeatureModelElementTypes.FeatureSubFeatures_4007);
		types.add(FeatureModelElementTypes.FeatureSubFeatures_4008);
		types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013);
		types.add(FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014);
		types.add(FeatureModelElementTypes.FeatureAttributes_4012);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection1CreationTool_title, null, types);
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FeatureModelDiagramEditorPlugin
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
