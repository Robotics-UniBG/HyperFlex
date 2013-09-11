/*
 * Variability Analysis And Resolution Plugins (VARP)
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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package it.unibg.robotics.orocoscomponentmodel.diagram.navigator;

import it.unibg.robotics.orocoscomponentmodel.CompInputPort;
import it.unibg.robotics.orocoscomponentmodel.CompOperation;
import it.unibg.robotics.orocoscomponentmodel.CompOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.CompOutputPort;
import it.unibg.robotics.orocoscomponentmodel.TCInputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCOperation;
import it.unibg.robotics.orocoscomponentmodel.TCOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelDiagramEditorPlugin;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;
import it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;
import it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelParserProvider;

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
public class OrocosComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OrocosComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OrocosComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof OrocosComponentModelNavigatorItem
				&& !isOwnView(((OrocosComponentModelNavigatorItem) element)
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
		if (element instanceof OrocosComponentModelNavigatorGroup) {
			OrocosComponentModelNavigatorGroup group = (OrocosComponentModelNavigatorGroup) element;
			return OrocosComponentModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof OrocosComponentModelNavigatorItem) {
			OrocosComponentModelNavigatorItem navigatorItem = (OrocosComponentModelNavigatorItem) element;
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
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://robotics.unibg.it/componentmodels.orocos?System", OrocosComponentModelElementTypes.System_1000); //$NON-NLS-1$
		case CompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://robotics.unibg.it/componentmodels.orocos?Composite", OrocosComponentModelElementTypes.Composite_2001); //$NON-NLS-1$
		case TaskContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?TaskContext", OrocosComponentModelElementTypes.TaskContext_3001); //$NON-NLS-1$
		case TCInputDataPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?TCInputDataPort", OrocosComponentModelElementTypes.TCInputDataPort_3002); //$NON-NLS-1$
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?TCOutputDataPort", OrocosComponentModelElementTypes.TCOutputDataPort_3003); //$NON-NLS-1$
		case Composite2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?Composite", OrocosComponentModelElementTypes.Composite_3005); //$NON-NLS-1$
		case CompInputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompInputPort", OrocosComponentModelElementTypes.CompInputPort_3006); //$NON-NLS-1$
		case CompOutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompOutputPort", OrocosComponentModelElementTypes.CompOutputPort_3007); //$NON-NLS-1$
		case CompInputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompInputPort", OrocosComponentModelElementTypes.CompInputPort_3008); //$NON-NLS-1$
		case CompOutputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompOutputPort", OrocosComponentModelElementTypes.CompOutputPort_3009); //$NON-NLS-1$
		case TCOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?TCOperation", OrocosComponentModelElementTypes.TCOperation_3010); //$NON-NLS-1$
		case TCOperationCallerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?TCOperationCaller", OrocosComponentModelElementTypes.TCOperationCaller_3011); //$NON-NLS-1$
		case CompOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompOperation", OrocosComponentModelElementTypes.CompOperation_3012); //$NON-NLS-1$
		case CompOperationCallerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompOperationCaller", OrocosComponentModelElementTypes.CompOperationCaller_3013); //$NON-NLS-1$
		case CompOperation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompOperation", OrocosComponentModelElementTypes.CompOperation_3014); //$NON-NLS-1$
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?CompOperationCaller", OrocosComponentModelElementTypes.CompOperationCaller_3015); //$NON-NLS-1$
		case TCPropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://robotics.unibg.it/componentmodels.orocos?TCProperty", OrocosComponentModelElementTypes.TCProperty_3016); //$NON-NLS-1$
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.orocos?ConnectionPolicy", OrocosComponentModelElementTypes.ConnectionPolicy_4001); //$NON-NLS-1$
		case CompOutputPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.orocos?CompOutputPort", OrocosComponentModelElementTypes.CompOutputPort_4004); //$NON-NLS-1$
		case CompInputPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.orocos?CompInputPort", OrocosComponentModelElementTypes.CompInputPort_4005); //$NON-NLS-1$
		case PeersConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.orocos?PeersConnection", OrocosComponentModelElementTypes.PeersConnection_4007); //$NON-NLS-1$
		case CompOperation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.orocos?CompOperation", OrocosComponentModelElementTypes.CompOperation_4008); //$NON-NLS-1$
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://robotics.unibg.it/componentmodels.orocos?CompOperationCaller", OrocosComponentModelElementTypes.CompOperationCaller_4009); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OrocosComponentModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& OrocosComponentModelElementTypes
						.isKnownElementType(elementType)) {
			image = OrocosComponentModelElementTypes.getImage(elementType);
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
		if (element instanceof OrocosComponentModelNavigatorGroup) {
			OrocosComponentModelNavigatorGroup group = (OrocosComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof OrocosComponentModelNavigatorItem) {
			OrocosComponentModelNavigatorItem navigatorItem = (OrocosComponentModelNavigatorItem) element;
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
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001Text(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3001Text(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3002Text(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3003Text(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3005Text(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3006Text(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3007Text(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3008Text(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3009Text(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3010Text(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3011Text(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3012Text(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3013Text(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3014Text(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3015Text(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3016Text(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001Text(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4004Text(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4005Text(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4007Text(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4008Text(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4009Text(view);
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
	private String getComposite_2001Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.Composite_2001, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskContext_3001Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.TaskContext_3001, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(TaskContextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCInputDataPort_3002Text(View view) {
		TCInputDataPort domainModelElement = (TCInputDataPort) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCOutputDataPort_3003Text(View view) {
		TCOutputDataPort domainModelElement = (TCOutputDataPort) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposite_3005Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.Composite_3005, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompositeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompInputPort_3006Text(View view) {
		CompInputPort domainModelElement = (CompInputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOutputPort_3007Text(View view) {
		CompOutputPort domainModelElement = (CompOutputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompInputPort_3008Text(View view) {
		CompInputPort domainModelElement = (CompInputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOutputPort_3009Text(View view) {
		CompOutputPort domainModelElement = (CompOutputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCOperation_3010Text(View view) {
		TCOperation domainModelElement = (TCOperation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCOperationCaller_3011Text(View view) {
		TCOperationCaller domainModelElement = (TCOperationCaller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperation_3012Text(View view) {
		CompOperation domainModelElement = (CompOperation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperationCaller_3013Text(View view) {
		CompOperationCaller domainModelElement = (CompOperationCaller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperation_3014Text(View view) {
		CompOperation domainModelElement = (CompOperation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperationCaller_3015Text(View view) {
		CompOperationCaller domainModelElement = (CompOperationCaller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCProperty_3016Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.TCProperty_3016, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(TCPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionPolicy_4001Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.ConnectionPolicy_4001, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(ConnectionPolicyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOutputPort_4004Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompOutputPort_4004, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompOutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompInputPort_4005Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompInputPort_4005, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompInputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPeersConnection_4007Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.PeersConnection_4007, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(PeersConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperation_4008Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompOperation_4008, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompOperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperationCaller_4009Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompOperationCaller_4009, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompOperationCallerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
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
		return SystemEditPart.MODEL_ID
				.equals(OrocosComponentModelVisualIDRegistry.getModelID(view));
	}

}
