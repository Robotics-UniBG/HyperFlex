package org.hyperflex.roscomponentmodel.diagram.part;

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
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

/**
 * @generated
 */
public class RosComponentModelPaletteFactory {

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
		paletteContainer.add(createComposite1CreationTool());
		paletteContainer.add(createImportComposite2CreationTool());
		paletteContainer.add(createNode3CreationTool());
		paletteContainer.add(createPublisher4CreationTool());
		paletteContainer.add(createSubscriber5CreationTool());
		paletteContainer.add(createTopic6CreationTool());
		paletteContainer.add(createServiceServer7CreationTool());
		paletteContainer.add(createServiceClient8CreationTool());
		paletteContainer.add(createParameter9CreationTool());
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
		paletteContainer.add(createConnection1CreationTool());
		paletteContainer.add(createPromoteConnection2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposite1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Composite1CreationTool_title,
				Messages.Composite1CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Composite_2001));
		entry.setId("createComposite1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportComposite2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ImportComposite2CreationTool_title,
				Messages.ImportComposite2CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Composite_3007));
		entry.setId("createImportComposite2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Package.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node3CreationTool_title,
				Messages.Node3CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Node_3001));
		entry.setId("createNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPublisher4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.NodeMsgProducer_3003);
		types.add(RosComponentModelElementTypes.CompositeMsgProducer_3008);
		types.add(RosComponentModelElementTypes.CompositeMsgProducer_3012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Publisher4CreationTool_title,
				Messages.Publisher4CreationTool_desc, types);
		entry.setId("createPublisher4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Publisher.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubscriber5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.NodeMsgConsumer_3004);
		types.add(RosComponentModelElementTypes.CompositeMsgConsumer_3009);
		types.add(RosComponentModelElementTypes.CompositeMsgConsumer_3013);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subscriber5CreationTool_title,
				Messages.Subscriber5CreationTool_desc, types);
		entry.setId("createSubscriber5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Subscriber.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTopic6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Topic6CreationTool_title,
				Messages.Topic6CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Topic_3014));
		entry.setId("createTopic6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Topic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceServer7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.NodeSrvProducer_3005);
		types.add(RosComponentModelElementTypes.CompositeSrvProducer_3010);
		types.add(RosComponentModelElementTypes.CompositeSrvProducer_3015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceServer7CreationTool_title,
				Messages.ServiceServer7CreationTool_desc, types);
		entry.setId("createServiceServer7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Topic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceClient8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.NodeSrvConsumer_3006);
		types.add(RosComponentModelElementTypes.CompositeSrvConsumer_3011);
		types.add(RosComponentModelElementTypes.CompositeSrvConsumer_3016);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceClient8CreationTool_title,
				Messages.ServiceClient8CreationTool_desc, types);
		entry.setId("createServiceClient8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Topic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parameter9CreationTool_title,
				Messages.Parameter9CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.NodeProperty_3002));
		entry.setId("createParameter9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Parameter.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.MsgInterfaceConnection_4001);
		types.add(RosComponentModelElementTypes.MsgInterfaceConnection_4002);
		types.add(RosComponentModelElementTypes.Wire_4007);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection1CreationTool_title,
				Messages.Connection1CreationTool_desc, types);
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ContinueConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPromoteConnection2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4003);
		types.add(RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4004);
		types.add(RosComponentModelElementTypes.CompositeSrvProducerPromote_4005);
		types.add(RosComponentModelElementTypes.CompositeSrvProducerPromote_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PromoteConnection2CreationTool_title,
				Messages.PromoteConnection2CreationTool_desc, types);
		entry.setId("createPromoteConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/PromoteConnection.gif")); //$NON-NLS-1$
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
