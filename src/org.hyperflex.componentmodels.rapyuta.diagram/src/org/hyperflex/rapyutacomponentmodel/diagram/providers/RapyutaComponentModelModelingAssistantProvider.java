/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Node2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotContainerCompositeContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Topic2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.Messages;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class RapyutaComponentModelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(RapyutaComponentModelElementTypes.RobotContainer_2005);
			types.add(RapyutaComponentModelElementTypes.CloudContainer_2006);
			return types;
		}
		if (editPart instanceof CloudContainerEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(RapyutaComponentModelElementTypes.Composite_3081);
			return types;
		}
		if (editPart instanceof Node2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(RapyutaComponentModelElementTypes.NodePublisher_3043);
			types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3044);
			types.add(RapyutaComponentModelElementTypes.NodeSrvServer_3045);
			types.add(RapyutaComponentModelElementTypes.NodeSrvClient_3046);
			types.add(RapyutaComponentModelElementTypes.NodeParameter_3042);
			return types;
		}
		if (editPart instanceof CompositeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3048);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3049);
			types.add(RapyutaComponentModelElementTypes.CompositeSrvServer_3050);
			types.add(RapyutaComponentModelElementTypes.CompositeSrvClient_3051);
			return types;
		}
		if (editPart instanceof RobotEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3059);
			types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3060);
			types.add(RapyutaComponentModelElementTypes.EndPointSrvServer_3061);
			types.add(RapyutaComponentModelElementTypes.EndPointSrvClient_3062);
			types.add(RapyutaComponentModelElementTypes.EndPointParameter_3058);
			return types;
		}
		if (editPart instanceof NodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(RapyutaComponentModelElementTypes.NodePublisher_3065);
			types.add(RapyutaComponentModelElementTypes.NodeSubscriber_3066);
			types.add(RapyutaComponentModelElementTypes.NodeSrvServer_3067);
			types.add(RapyutaComponentModelElementTypes.NodeSrvClient_3068);
			types.add(RapyutaComponentModelElementTypes.NodeParameter_3064);
			return types;
		}
		if (editPart instanceof EnvironmentEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(RapyutaComponentModelElementTypes.EndPointPublisher_3071);
			types.add(RapyutaComponentModelElementTypes.EndPointSubscriber_3072);
			types.add(RapyutaComponentModelElementTypes.EndPointSrvServer_3073);
			types.add(RapyutaComponentModelElementTypes.EndPointSrvClient_3074);
			types.add(RapyutaComponentModelElementTypes.EndPointParameter_3070);
			return types;
		}
		if (editPart instanceof Composite2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(RapyutaComponentModelElementTypes.CompositePublisher_3052);
			types.add(RapyutaComponentModelElementTypes.CompositeSubscriber_3053);
			types.add(RapyutaComponentModelElementTypes.CompositeSrvServer_3054);
			types.add(RapyutaComponentModelElementTypes.CompositeSrvClient_3055);
			return types;
		}
		if (editPart instanceof RobotContainerCompositeContainerCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(RapyutaComponentModelElementTypes.Node_3063);
			types.add(RapyutaComponentModelElementTypes.Composite_3076);
			types.add(RapyutaComponentModelElementTypes.Topic_3075);
			types.add(RapyutaComponentModelElementTypes.RobotEndPoint_3077);
			return types;
		}
		if (editPart instanceof CloudContainerContainerCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(RapyutaComponentModelElementTypes.Node_3078);
			types.add(RapyutaComponentModelElementTypes.EnvironmentEndPoint_3079);
			types.add(RapyutaComponentModelElementTypes.Topic_3080);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof NodePublisherEditPart) {
			return ((NodePublisherEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodeSubscriberEditPart) {
			return ((NodeSubscriberEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodeSrvClientEditPart) {
			return ((NodeSrvClientEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositePublisherEditPart) {
			return ((CompositePublisherEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSubscriberEditPart) {
			return ((CompositeSubscriberEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSrvClientEditPart) {
			return ((CompositeSrvClientEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndPointPublisherEditPart) {
			return ((EndPointPublisherEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndPointSubscriberEditPart) {
			return ((EndPointSubscriberEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndPointSrvClientEditPart) {
			return ((EndPointSrvClientEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodePublisher2EditPart) {
			return ((NodePublisher2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodeSubscriber2EditPart) {
			return ((NodeSubscriber2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodeSrvClient2EditPart) {
			return ((NodeSrvClient2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndPointPublisher2EditPart) {
			return ((EndPointPublisher2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndPointSubscriber2EditPart) {
			return ((EndPointSubscriber2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndPointSrvClient2EditPart) {
			return ((EndPointSrvClient2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositePublisher2EditPart) {
			return ((CompositePublisher2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSubscriber2EditPart) {
			return ((CompositeSubscriber2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSrvClient2EditPart) {
			return ((CompositeSrvClient2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof NodeSrvServerEditPart) {
			return ((NodeSrvServerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeSrvServerEditPart) {
			return ((CompositeSrvServerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Topic2EditPart) {
			return ((Topic2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EndPointSubscriberEditPart) {
			return ((EndPointSubscriberEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EndPointSrvServerEditPart) {
			return ((EndPointSrvServerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NodeSrvServer2EditPart) {
			return ((NodeSrvServer2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EndPointSubscriber2EditPart) {
			return ((EndPointSubscriber2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EndPointSrvServer2EditPart) {
			return ((EndPointSrvServer2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TopicEditPart) {
			return ((TopicEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeSrvServer2EditPart) {
			return ((CompositeSrvServer2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof NodePublisherEditPart) {
			return ((NodePublisherEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodeSubscriberEditPart) {
			return ((NodeSubscriberEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodeSrvClientEditPart) {
			return ((NodeSrvClientEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositePublisherEditPart) {
			return ((CompositePublisherEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSubscriberEditPart) {
			return ((CompositeSubscriberEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSrvClientEditPart) {
			return ((CompositeSrvClientEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndPointPublisherEditPart) {
			return ((EndPointPublisherEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndPointSubscriberEditPart) {
			return ((EndPointSubscriberEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndPointSrvClientEditPart) {
			return ((EndPointSrvClientEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodePublisher2EditPart) {
			return ((NodePublisher2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodeSubscriber2EditPart) {
			return ((NodeSubscriber2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodeSrvClient2EditPart) {
			return ((NodeSrvClient2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndPointPublisher2EditPart) {
			return ((EndPointPublisher2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndPointSubscriber2EditPart) {
			return ((EndPointSubscriber2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndPointSrvClient2EditPart) {
			return ((EndPointSrvClient2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositePublisher2EditPart) {
			return ((CompositePublisher2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSubscriber2EditPart) {
			return ((CompositeSubscriber2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSrvClient2EditPart) {
			return ((CompositeSrvClient2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof NodeSrvServerEditPart) {
			return ((NodeSrvServerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeSrvServerEditPart) {
			return ((CompositeSrvServerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Topic2EditPart) {
			return ((Topic2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EndPointSubscriberEditPart) {
			return ((EndPointSubscriberEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EndPointSrvServerEditPart) {
			return ((EndPointSrvServerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NodeSrvServer2EditPart) {
			return ((NodeSrvServer2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EndPointSubscriber2EditPart) {
			return ((EndPointSubscriber2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EndPointSrvServer2EditPart) {
			return ((EndPointSrvServer2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TopicEditPart) {
			return ((TopicEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeSrvServer2EditPart) {
			return ((CompositeSrvServer2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof NodePublisherEditPart) {
			return ((NodePublisherEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodeSubscriberEditPart) {
			return ((NodeSubscriberEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodeSrvClientEditPart) {
			return ((NodeSrvClientEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositePublisherEditPart) {
			return ((CompositePublisherEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSubscriberEditPart) {
			return ((CompositeSubscriberEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSrvClientEditPart) {
			return ((CompositeSrvClientEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndPointPublisherEditPart) {
			return ((EndPointPublisherEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndPointSubscriberEditPart) {
			return ((EndPointSubscriberEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndPointSrvClientEditPart) {
			return ((EndPointSrvClientEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodePublisher2EditPart) {
			return ((NodePublisher2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodeSubscriber2EditPart) {
			return ((NodeSubscriber2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodeSrvClient2EditPart) {
			return ((NodeSrvClient2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndPointPublisher2EditPart) {
			return ((EndPointPublisher2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndPointSubscriber2EditPart) {
			return ((EndPointSubscriber2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndPointSrvClient2EditPart) {
			return ((EndPointSrvClient2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositePublisher2EditPart) {
			return ((CompositePublisher2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSubscriber2EditPart) {
			return ((CompositeSubscriber2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSrvClient2EditPart) {
			return ((CompositeSrvClient2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.RapyutaComponentModelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.RapyutaComponentModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
