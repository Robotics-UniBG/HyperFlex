package it.unibg.robotics.roscomponentmodel.diagram.navigator;

import it.unibg.robotics.roscomponentmodel.CompositeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.CompositeMsgProducer;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;
import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;
import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;
import it.unibg.robotics.roscomponentmodel.diagram.providers.RosComponentModelParserProvider;

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

/**
 * @generated
 */
public class RosComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RosComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RosComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RosComponentModelNavigatorItem
				&& !isOwnView(((RosComponentModelNavigatorItem) element)
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
		if (element instanceof RosComponentModelNavigatorGroup) {
			RosComponentModelNavigatorGroup group = (RosComponentModelNavigatorGroup) element;
			return RosComponentModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof RosComponentModelNavigatorItem) {
			RosComponentModelNavigatorItem navigatorItem = (RosComponentModelNavigatorItem) element;
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
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://robotics.unibg.it/componentmodels.ros?System", RosComponentModelElementTypes.System_1000); //$NON-NLS-1$
		case CompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/componentmodels.ros?Composite", RosComponentModelElementTypes.Composite_2003); //$NON-NLS-1$
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeMsgProducer", RosComponentModelElementTypes.NodeMsgProducer_3003); //$NON-NLS-1$
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeMsgConsumer", RosComponentModelElementTypes.NodeMsgConsumer_3004); //$NON-NLS-1$
		case NodePropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeProperty", RosComponentModelElementTypes.NodeProperty_3012); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Node", RosComponentModelElementTypes.Node_3013); //$NON-NLS-1$
		case Composite2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Composite", RosComponentModelElementTypes.Composite_3014); //$NON-NLS-1$
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?CompositeMsgProducer", RosComponentModelElementTypes.CompositeMsgProducer_3015); //$NON-NLS-1$
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?CompositeMsgConsumer", RosComponentModelElementTypes.CompositeMsgConsumer_3016); //$NON-NLS-1$
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?CompositeMsgProducer", RosComponentModelElementTypes.CompositeMsgProducer_3017); //$NON-NLS-1$
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?CompositeMsgConsumer", RosComponentModelElementTypes.CompositeMsgConsumer_3018); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Topic", RosComponentModelElementTypes.Topic_3019); //$NON-NLS-1$
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?CompositeMsgInterface?exposed", RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4007); //$NON-NLS-1$
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?MsgInterface?connection", RosComponentModelElementTypes.MsgInterfaceConnection_4010); //$NON-NLS-1$
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?MsgInterface?connection", RosComponentModelElementTypes.MsgInterfaceConnection_4011); //$NON-NLS-1$
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?CompositeMsgInterface?exposed", RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4012); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RosComponentModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& RosComponentModelElementTypes
						.isKnownElementType(elementType)) {
			image = RosComponentModelElementTypes.getImage(elementType);
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
		if (element instanceof RosComponentModelNavigatorGroup) {
			RosComponentModelNavigatorGroup group = (RosComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RosComponentModelNavigatorItem) {
			RosComponentModelNavigatorItem navigatorItem = (RosComponentModelNavigatorItem) element;
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
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {
		case ArchitectureModelEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2003Text(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003Text(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004Text(view);
		case NodePropertyEditPart.VISUAL_ID:
			return getNodeProperty_3012Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3013Text(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3014Text(view);
		case CompositeMsgProducerEditPart.VISUAL_ID:
			return getCompositeMsgProducer_3015Text(view);
		case CompositeMsgConsumerEditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3016Text(view);
		case CompositeMsgProducer2EditPart.VISUAL_ID:
			return getCompositeMsgProducer_3017Text(view);
		case CompositeMsgConsumer2EditPart.VISUAL_ID:
			return getCompositeMsgConsumer_3018Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3019Text(view);
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4007Text(view);
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4010Text(view);
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4011Text(view);
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4012Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComposite_2003Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Composite_2003,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(CompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgInterfaceExposed_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMsgInterfaceConnection_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNodeMsgProducer_3003Text(View view) {
		NodeMsgProducer domainModelElement = (NodeMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeMsgConsumer_3004Text(View view) {
		NodeMsgConsumer domainModelElement = (NodeMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
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
	private String getCompositeMsgInterfaceExposed_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNodeProperty_3012Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.NodeProperty_3012, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodePropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_3013Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Node_3013,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposite_3014Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Composite_3014,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(CompositeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgProducer_3015Text(View view) {
		CompositeMsgProducer domainModelElement = (CompositeMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgConsumer_3016Text(View view) {
		CompositeMsgConsumer domainModelElement = (CompositeMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgProducer_3017Text(View view) {
		CompositeMsgProducer domainModelElement = (CompositeMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeMsgConsumer_3018Text(View view) {
		CompositeMsgConsumer domainModelElement = (CompositeMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_3019Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Topic_3019,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(TopicNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
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
		return ArchitectureModelEditPart.MODEL_ID
				.equals(RosComponentModelVisualIDRegistry.getModelID(view));
	}

}
