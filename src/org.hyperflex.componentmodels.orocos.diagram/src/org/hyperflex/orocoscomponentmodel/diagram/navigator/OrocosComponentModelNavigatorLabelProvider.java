/*
 * HyperFlex Plugins
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
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
package org.hyperflex.orocoscomponentmodel.diagram.navigator;

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
import org.hyperflex.orocoscomponentmodel.CompInputPort;
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.CompOutputPort;
import org.hyperflex.orocoscomponentmodel.TCInputDataPort;
import org.hyperflex.orocoscomponentmodel.TCOperation;
import org.hyperflex.orocoscomponentmodel.TCOperationCaller;
import org.hyperflex.orocoscomponentmodel.TCOutputDataPort;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPortNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPortNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.PeersConnectionNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCPropertyNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelDiagramEditorPlugin;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelParserProvider;

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
					"Navigator?Diagram?http://www.hyperflex.org/componentmodels.orocos?System", OrocosComponentModelElementTypes.System_1000); //$NON-NLS-1$
		case CompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.hyperflex.org/componentmodels.orocos?Composite", OrocosComponentModelElementTypes.Composite_2002); //$NON-NLS-1$
		case TaskContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?TaskContext", OrocosComponentModelElementTypes.TaskContext_3017); //$NON-NLS-1$
		case TCInputDataPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?TCInputDataPort", OrocosComponentModelElementTypes.TCInputDataPort_3018); //$NON-NLS-1$
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?TCOutputDataPort", OrocosComponentModelElementTypes.TCOutputDataPort_3019); //$NON-NLS-1$
		case TCPropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?TCProperty", OrocosComponentModelElementTypes.TCProperty_3020); //$NON-NLS-1$
		case TCOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?TCOperation", OrocosComponentModelElementTypes.TCOperation_3021); //$NON-NLS-1$
		case TCOperationCallerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?TCOperationCaller", OrocosComponentModelElementTypes.TCOperationCaller_3022); //$NON-NLS-1$
		case Composite2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?Composite", OrocosComponentModelElementTypes.Composite_3023); //$NON-NLS-1$
		case CompInputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompInputPort", OrocosComponentModelElementTypes.CompInputPort_3024); //$NON-NLS-1$
		case CompOutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompOutputPort", OrocosComponentModelElementTypes.CompOutputPort_3025); //$NON-NLS-1$
		case CompOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompOperation", OrocosComponentModelElementTypes.CompOperation_3026); //$NON-NLS-1$
		case CompOperationCallerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompOperationCaller", OrocosComponentModelElementTypes.CompOperationCaller_3027); //$NON-NLS-1$
		case CompInputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompInputPort", OrocosComponentModelElementTypes.CompInputPort_3028); //$NON-NLS-1$
		case CompOutputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompOutputPort", OrocosComponentModelElementTypes.CompOutputPort_3029); //$NON-NLS-1$
		case CompOperation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompOperation", OrocosComponentModelElementTypes.CompOperation_3030); //$NON-NLS-1$
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.hyperflex.org/componentmodels.orocos?CompOperationCaller", OrocosComponentModelElementTypes.CompOperationCaller_3031); //$NON-NLS-1$
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.orocos?ConnectionPolicy", OrocosComponentModelElementTypes.ConnectionPolicy_4010); //$NON-NLS-1$
		case CompOutputPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.orocos?CompOutputPort", OrocosComponentModelElementTypes.CompOutputPort_4011); //$NON-NLS-1$
		case CompInputPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.orocos?CompInputPort", OrocosComponentModelElementTypes.CompInputPort_4012); //$NON-NLS-1$
		case PeersConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.orocos?PeersConnection", OrocosComponentModelElementTypes.PeersConnection_4013); //$NON-NLS-1$
		case CompOperation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.orocos?CompOperation", OrocosComponentModelElementTypes.CompOperation_4014); //$NON-NLS-1$
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.hyperflex.org/componentmodels.orocos?CompOperationCaller", OrocosComponentModelElementTypes.CompOperationCaller_4015); //$NON-NLS-1$
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
			return getComposite_2002Text(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3017Text(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3018Text(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3019Text(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3020Text(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3021Text(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3022Text(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3023Text(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3024Text(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3025Text(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3026Text(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3027Text(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3028Text(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3029Text(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3030Text(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3031Text(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4010Text(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4011Text(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4012Text(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4013Text(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4014Text(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4015Text(view);
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
	private String getComposite_2002Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.Composite_2002, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskContext_3017Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.TaskContext_3017, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(TaskContextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCInputDataPort_3018Text(View view) {
		TCInputDataPort domainModelElement = (TCInputDataPort) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCOutputDataPort_3019Text(View view) {
		TCOutputDataPort domainModelElement = (TCOutputDataPort) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCProperty_3020Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.TCProperty_3020, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(TCPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCOperation_3021Text(View view) {
		TCOperation domainModelElement = (TCOperation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTCOperationCaller_3022Text(View view) {
		TCOperationCaller domainModelElement = (TCOperationCaller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposite_3023Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.Composite_3023, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompositeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompInputPort_3024Text(View view) {
		CompInputPort domainModelElement = (CompInputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOutputPort_3025Text(View view) {
		CompOutputPort domainModelElement = (CompOutputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperation_3026Text(View view) {
		CompOperation domainModelElement = (CompOperation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperationCaller_3027Text(View view) {
		CompOperationCaller domainModelElement = (CompOperationCaller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompInputPort_3028Text(View view) {
		CompInputPort domainModelElement = (CompInputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOutputPort_3029Text(View view) {
		CompOutputPort domainModelElement = (CompOutputPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperation_3030Text(View view) {
		CompOperation domainModelElement = (CompOperation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperationCaller_3031Text(View view) {
		CompOperationCaller domainModelElement = (CompOperationCaller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionPolicy_4010Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.ConnectionPolicy_4010, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(ConnectionPolicyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOutputPort_4011Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompOutputPort_4011, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompOutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompInputPort_4012Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompInputPort_4012, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompInputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPeersConnection_4013Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.PeersConnection_4013, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(PeersConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperation_4014Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompOperation_4014, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompOperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompOperationCaller_4015Text(View view) {
		IParser parser = OrocosComponentModelParserProvider.getParser(
				OrocosComponentModelElementTypes.CompOperationCaller_4015, view
						.getElement() != null ? view.getElement() : view,
				OrocosComponentModelVisualIDRegistry
						.getType(CompOperationCallerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
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
