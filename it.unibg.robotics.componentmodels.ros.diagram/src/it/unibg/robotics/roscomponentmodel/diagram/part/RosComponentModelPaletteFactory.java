package it.unibg.robotics.roscomponentmodel.diagram.part;

import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

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
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createPublisher2CreationTool());
		paletteContainer.add(createSubscriber3CreationTool());
		paletteContainer.add(createProperties4CreationTool());
		paletteContainer.add(createPackage5CreationTool());
		paletteContainer.add(createImportPackage6CreationTool());
		paletteContainer.add(createTopic7CreationTool());
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
						.singletonList(RosComponentModelElementTypes.Node_3001));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPublisher2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.NodeMsgProducer_3003);
		types.add(RosComponentModelElementTypes.PackageMsgProducer_3006);
		types.add(RosComponentModelElementTypes.PackageMsgProducer_3009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Publisher2CreationTool_title,
				Messages.Publisher2CreationTool_desc, types);
		entry.setId("createPublisher2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Publisher.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubscriber3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RosComponentModelElementTypes.NodeMsgConsumer_3004);
		types.add(RosComponentModelElementTypes.PackageMsgConsumer_3007);
		types.add(RosComponentModelElementTypes.PackageMsgConsumer_3010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subscriber3CreationTool_title,
				Messages.Subscriber3CreationTool_desc, types);
		entry.setId("createSubscriber3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Subscriber.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperties4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Properties4CreationTool_title,
				Messages.Properties4CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Parameter_3002));
		entry.setId("createProperties4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Parameter.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package5CreationTool_title,
				Messages.Package5CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Package_2002));
		entry.setId("createPackage5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Package.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportPackage6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ImportPackage6CreationTool_title,
				Messages.ImportPackage6CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Package_3005));
		entry.setId("createImportPackage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Package.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTopic7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Topic7CreationTool_title,
				Messages.Topic7CreationTool_desc,
				Collections
						.singletonList(RosComponentModelElementTypes.Topic_3008));
		entry.setId("createTopic7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/Topic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPromoteConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RosComponentModelElementTypes.PackageMsgProducerPromote_4004);
		types.add(RosComponentModelElementTypes.PackageMsgConsumerPromote_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PromoteConnection1CreationTool_title,
				Messages.PromoteConnection1CreationTool_desc, types);
		entry.setId("createPromoteConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/PromoteConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinueconnection2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RosComponentModelElementTypes.MsgConsumerSource_4002);
		types.add(RosComponentModelElementTypes.MsgProducerTarget_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Continueconnection2CreationTool_title,
				Messages.Continueconnection2CreationTool_desc, types);
		entry.setId("createContinueconnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosComponentModelDiagramEditorPlugin
				.findImageDescriptor("icons/ContinueConnection.gif")); //$NON-NLS-1$
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
