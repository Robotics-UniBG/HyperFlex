package it.unibg.robotics.roscomponentmodel.diagram.navigator;

import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.PackageMsgConsumer;
import it.unibg.robotics.roscomponentmodel.PackageMsgProducer;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.Package2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducer2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerEditPart;
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
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeMsgConsumer", RosComponentModelElementTypes.NodeMsgConsumer_3004); //$NON-NLS-1$
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?NodeMsgProducer", RosComponentModelElementTypes.NodeMsgProducer_3003); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/componentmodels.ros?Package", RosComponentModelElementTypes.Package_2002); //$NON-NLS-1$
		case Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Package", RosComponentModelElementTypes.Package_3011); //$NON-NLS-1$
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgProducer", RosComponentModelElementTypes.PackageMsgProducer_3006); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Node", RosComponentModelElementTypes.Node_3001); //$NON-NLS-1$
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?MsgInterface?connection", RosComponentModelElementTypes.MsgInterfaceConnection_4010); //$NON-NLS-1$
		case ParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Parameter", RosComponentModelElementTypes.Parameter_3002); //$NON-NLS-1$
		case ArchitectureModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://robotics.unibg.it/componentmodels.ros?ArchitectureModel", RosComponentModelElementTypes.ArchitectureModel_1000); //$NON-NLS-1$
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?CompositeMsgInterface?exposed", RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4012); //$NON-NLS-1$
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?CompositeMsgInterface?exposed", RosComponentModelElementTypes.CompositeMsgInterfaceExposed_4007); //$NON-NLS-1$
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.ros?MsgInterface?connection", RosComponentModelElementTypes.MsgInterfaceConnection_4011); //$NON-NLS-1$
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgConsumer", RosComponentModelElementTypes.PackageMsgConsumer_3010); //$NON-NLS-1$
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgProducer", RosComponentModelElementTypes.PackageMsgProducer_3009); //$NON-NLS-1$
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?PackageMsgConsumer", RosComponentModelElementTypes.PackageMsgConsumer_3007); //$NON-NLS-1$
		case TopicEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.ros?Topic", RosComponentModelElementTypes.Topic_3008); //$NON-NLS-1$
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
		case NodeMsgConsumerEditPart.VISUAL_ID:
			return getNodeMsgConsumer_3004Text(view);
		case NodeMsgProducerEditPart.VISUAL_ID:
			return getNodeMsgProducer_3003Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2002Text(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3011Text(view);
		case PackageMsgProducerEditPart.VISUAL_ID:
			return getPackageMsgProducer_3006Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_3001Text(view);
		case MsgInterfaceConnectionEditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4010Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002Text(view);
		case ArchitectureModelEditPart.VISUAL_ID:
			return getArchitectureModel_1000Text(view);
		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4012Text(view);
		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
			return getCompositeMsgInterfaceExposed_4007Text(view);
		case MsgInterfaceConnection2EditPart.VISUAL_ID:
			return getMsgInterfaceConnection_4011Text(view);
		case PackageMsgConsumer2EditPart.VISUAL_ID:
			return getPackageMsgConsumer_3010Text(view);
		case PackageMsgProducer2EditPart.VISUAL_ID:
			return getPackageMsgProducer_3009Text(view);
		case PackageMsgConsumerEditPart.VISUAL_ID:
			return getPackageMsgConsumer_3007Text(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_3008Text(view);
		}
		return getUnknownElementText(view);
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
					"Parser was not found for label " + 5017); //$NON-NLS-1$
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
	private String getPackageMsgConsumer_3010Text(View view) {
		PackageMsgConsumer domainModelElement = (PackageMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackageMsgConsumer_3007Text(View view) {
		PackageMsgConsumer domainModelElement = (PackageMsgConsumer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
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
	private String getPackageMsgProducer_3009Text(View view) {
		PackageMsgProducer domainModelElement = (PackageMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
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
	private String getPackageMsgProducer_3006Text(View view) {
		PackageMsgProducer domainModelElement = (PackageMsgProducer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCompositeMsgInterfaceExposed_4012Text(View view) {
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
	private String getPackage_3011Text(View view) {
		IParser parser = RosComponentModelParserProvider.getParser(
				RosComponentModelElementTypes.Package_3011,
				view.getElement() != null ? view.getElement() : view,
				RosComponentModelVisualIDRegistry
						.getType(PackageName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
