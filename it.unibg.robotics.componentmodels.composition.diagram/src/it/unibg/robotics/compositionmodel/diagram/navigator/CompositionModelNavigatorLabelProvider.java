package it.unibg.robotics.compositionmodel.diagram.navigator;

import it.unibg.robotics.compositionmodel.ArchitectureModel;
import it.unibg.robotics.compositionmodel.SystemComposite;
import it.unibg.robotics.compositionmodel.SystemCompositeProvidedInterf;
import it.unibg.robotics.compositionmodel.SystemCompositeRequiredInterf;
import it.unibg.robotics.compositionmodel.SystemProvidedInterf;
import it.unibg.robotics.compositionmodel.SystemRequiredInterf;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.System2EditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;
import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelDiagramEditorPlugin;
import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;
import it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelElementTypes;
import it.unibg.robotics.compositionmodel.diagram.providers.CompositionModelParserProvider;

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
public class CompositionModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CompositionModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CompositionModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CompositionModelNavigatorItem
				&& !isOwnView(((CompositionModelNavigatorItem) element)
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
		if (element instanceof CompositionModelNavigatorGroup) {
			CompositionModelNavigatorGroup group = (CompositionModelNavigatorGroup) element;
			return CompositionModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof CompositionModelNavigatorItem) {
			CompositionModelNavigatorItem navigatorItem = (CompositionModelNavigatorItem) element;
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
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/compositionmodels?SystemCompositeProvidedInterf", CompositionModelElementTypes.SystemCompositeProvidedInterf_3010); //$NON-NLS-1$
		case SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://robotics.unibg.it/compositionmodels?ArchitectureModel", CompositionModelElementTypes.ArchitectureModel_1000); //$NON-NLS-1$
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/compositionmodels?SystemProvidedInterf", CompositionModelElementTypes.SystemProvidedInterf_3007); //$NON-NLS-1$
		case System2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/compositionmodels?System", CompositionModelElementTypes.System_2002); //$NON-NLS-1$
		case ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/compositionmodels?Connection", CompositionModelElementTypes.Connection_4002); //$NON-NLS-1$
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/compositionmodels?SystemRequiredInterf", CompositionModelElementTypes.SystemRequiredInterf_3008); //$NON-NLS-1$
		case SystemCompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/compositionmodels?SystemComposite", CompositionModelElementTypes.SystemComposite_3009); //$NON-NLS-1$
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/compositionmodels?SystemCompositeRequiredInterf", CompositionModelElementTypes.SystemCompositeRequiredInterf_3011); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CompositionModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CompositionModelElementTypes.isKnownElementType(elementType)) {
			image = CompositionModelElementTypes.getImage(elementType);
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
		if (element instanceof CompositionModelNavigatorGroup) {
			CompositionModelNavigatorGroup group = (CompositionModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CompositionModelNavigatorItem) {
			CompositionModelNavigatorItem navigatorItem = (CompositionModelNavigatorItem) element;
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
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return getSystemCompositeProvidedInterf_3010Text(view);
		case SystemEditPart.VISUAL_ID:
			return getArchitectureModel_1000Text(view);
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return getSystemProvidedInterf_3007Text(view);
		case System2EditPart.VISUAL_ID:
			return getSystem_2002Text(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4002Text(view);
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return getSystemRequiredInterf_3008Text(view);
		case SystemCompositeEditPart.VISUAL_ID:
			return getSystemComposite_3009Text(view);
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return getSystemCompositeRequiredInterf_3011Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getArchitectureModel_1000Text(View view) {
		ArchitectureModel domainModelElement = (ArchitectureModel) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystem_2002Text(View view) {
		IParser parser = CompositionModelParserProvider.getParser(
				CompositionModelElementTypes.System_2002,
				view.getElement() != null ? view.getElement() : view,
				CompositionModelVisualIDRegistry
						.getType(SystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystemProvidedInterf_3007Text(View view) {
		SystemProvidedInterf domainModelElement = (SystemProvidedInterf) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystemRequiredInterf_3008Text(View view) {
		SystemRequiredInterf domainModelElement = (SystemRequiredInterf) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_4002Text(View view) {
		IParser parser = CompositionModelParserProvider.getParser(
				CompositionModelElementTypes.Connection_4002,
				view.getElement() != null ? view.getElement() : view,
				CompositionModelVisualIDRegistry
						.getType(ConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystemComposite_3009Text(View view) {
		IParser parser = CompositionModelParserProvider.getParser(
				CompositionModelElementTypes.SystemComposite_3009, view
						.getElement() != null ? view.getElement() : view,
				CompositionModelVisualIDRegistry
						.getType(SystemCompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystemCompositeProvidedInterf_3010Text(View view) {
		SystemCompositeProvidedInterf domainModelElement = (SystemCompositeProvidedInterf) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystemCompositeRequiredInterf_3011Text(View view) {
		SystemCompositeRequiredInterf domainModelElement = (SystemCompositeRequiredInterf) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CompositionModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
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
		return SystemEditPart.MODEL_ID.equals(CompositionModelVisualIDRegistry
				.getModelID(view));
	}

}
