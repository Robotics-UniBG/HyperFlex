package it.unibg.robotics.roscomponentmodel.diagram.navigator;

import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgConsumerSourceEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgProducerTargetEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Package2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerPromoteEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerPromoteEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ParameterEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ParameterNameEditPart;
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
		case MsgProducerTargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?MsgProducer?target", RosComponentModelElementTypes.MsgProducerTarget_4003); //$NON-NLS-1$
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgConsumer", RosComponentModelElementTypes.PackageMsgConsumer_3010); //$NON-NLS-1$
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeMsgConsumer", RosComponentModelElementTypes.NodeMsgConsumer_3004); //$NON-NLS-1$
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgProducer", RosComponentModelElementTypes.PackageMsgProducer_3009); //$NON-NLS-1$
		case PackageMsgConsumerPromoteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?PackageMsgConsumer?promote", RosComponentModelElementTypes.PackageMsgConsumerPromote_4005); //$NON-NLS-1$
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgProducer", RosComponentModelElementTypes.PackageMsgProducer_3006); //$NON-NLS-1$
		case ArchitectureModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://robotics.unibg.it/componentmodels.ros?ArchitectureModel", RosComponentModelElementTypes.ArchitectureModel_1000); //$NON-NLS-1$
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeMsgProducer", RosComponentModelElementTypes.NodeMsgProducer_3003); //$NON-NLS-1$
		case ParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Parameter", RosComponentModelElementTypes.Parameter_3002); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/componentmodels.ros?Package", RosComponentModelElementTypes.Package_2002); //$NON-NLS-1$
		case PackageMsgProducerPromoteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?PackageMsgProducer?promote", RosComponentModelElementTypes.PackageMsgProducerPromote_4004); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Topic", RosComponentModelElementTypes.Topic_3008); //$NON-NLS-1$
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgConsumer", RosComponentModelElementTypes.PackageMsgConsumer_3007); //$NON-NLS-1$
		case Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Package", RosComponentModelElementTypes.Package_3005); //$NON-NLS-1$
		case MsgConsumerSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?MsgConsumer?source", RosComponentModelElementTypes.MsgConsumerSource_4002); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Node", RosComponentModelElementTypes.Node_3001); //$NON-NLS-1$
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
		case MsgProducerTargetEditPart.VISUAL_ID:
			return getMsgProducerTarget_4003Text(view);
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getPackageMsgConsumer_3010Text(view);
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004Text(view);
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getPackageMsgProducer_3009Text(view);
		case PackageMsgConsumerPromoteEditPart.VISUAL_ID:
			return getPackageMsgConsumerPromote_4005Text(view);
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getPackageMsgProducer_3006Text(view);
		case ArchitectureModelEditPart.VISUAL_ID:
			return getArchitectureModel_1000Text(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2002Text(view);
		case PackageMsgProducerPromoteEditPart.VISUAL_ID:
			return getPackageMsgProducerPromote_4004Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3008Text(view);
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getPackageMsgConsumer_3007Text(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3005Text(view);
		case MsgConsumerSourceEditPart.VISUAL_ID:
			return getMsgConsumerSource_4002Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getNode_3001Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Node_3001,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTopic_3008Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Topic_3008,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(TopicNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackageMsgProducer_3009Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.PackageMsgProducer_3009, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageMsgProducerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMsgConsumerSource_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArchitectureModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPackageMsgConsumerPromote_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPackageMsgConsumer_3007Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.PackageMsgConsumer_3007, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageMsgConsumerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackageMsgProducerPromote_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPackage_2002Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Package_2002,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3002Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Parameter_3002,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(ParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeMsgConsumer_3004Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.NodeMsgConsumer_3004, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodeMsgConsumerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_3005Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Package_3005,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMsgProducerTarget_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNodeMsgProducer_3003Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.NodeMsgProducer_3003, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(NodeMsgProducerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackageMsgConsumer_3010Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.PackageMsgConsumer_3010, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageMsgConsumerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackageMsgProducer_3006Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.PackageMsgProducer_3006, view
						.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageMsgProducerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
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
