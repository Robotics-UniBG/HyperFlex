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
package org.hyperflex.rapyutacomponentmodel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerContainerCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointMsgConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointPublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointEndPointPropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Node2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameter2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePropertiesCompartment2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisher2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodePublisherEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClient2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvClientEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServer2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSrvServerEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriber2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeSubscriberEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointEndPointPropertiesCompartmentEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.Topic2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.Messages;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RapyutaComponentModelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public RapyutaComponentModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<RapyutaComponentModelNavigatorItem> result = new ArrayList<RapyutaComponentModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, SystemEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof RapyutaComponentModelNavigatorGroup) {
			RapyutaComponentModelNavigatorGroup group = (RapyutaComponentModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof RapyutaComponentModelNavigatorItem) {
			RapyutaComponentModelNavigatorItem navigatorItem = (RapyutaComponentModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {

		case SystemEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			RapyutaComponentModelNavigatorGroup links = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_System_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointMsgConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CompositeEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisher2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriber2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvServer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvClient2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(RobotEndPointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ContainerEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(Node2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(EnvironmentEndPointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(Topic2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case NodeEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePublisherEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSubscriberEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvServerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvClientEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case NodePublisherEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodePublisher_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeSubscriberEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSubscriber_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeSrvServerEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSrvServer_3045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case NodeSrvClientEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSrvClient_3046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Composite2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisherEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriberEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvServerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvClientEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositePublisherEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositePublisher_3048_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSubscriberEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSubscriber_3049_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSrvServerEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvServer_3050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompositeSrvClientEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvClient_3051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositePublisher2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositePublisher_3052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSubscriber2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSubscriber_3053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSrvServer2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvServer_3054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompositeSrvClient2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvClient_3055_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TopicEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Topic_3056_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RobotEndPointEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisherEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriberEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClientEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EndPointPublisherEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointPublisher_3059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointMsgConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EndPointSubscriberEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSubscriber_3060_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSubscriber_3060_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointMsgConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EndPointSrvServerEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSrvServer_3061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EndPointSrvClientEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSrvClient_3062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Node2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeParameter2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePublisher2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSubscriber2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvServer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvClient2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case NodePublisher2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodePublisher_3065_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeSubscriber2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSubscriber_3066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeSrvServer2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSrvServer_3067_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case NodeSrvClient2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSrvClient_3068_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EnvironmentEndPointEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointParameter2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisher2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriber2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClient2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EndPointPublisher2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointPublisher_3071_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointMsgConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EndPointSubscriber2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSubscriber_3072_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSubscriber_3072_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointMsgConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EndPointSrvServer2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSrvServer_3073_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EndPointSrvClient2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup outgoinglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSrvClient_3074_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(ContainerSrvConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Topic2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RapyutaComponentModelNavigatorGroup incominglinks = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Topic_3075_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MsgInterfaceConnectionEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(Topic2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MsgInterfaceConnection2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(Topic2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodePublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompositeMsgInterfaceExposedEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(Topic2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(Topic2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriberEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositePublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSubscriber2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EndPointSrvConnectionEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSrvConnection_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointSrvConnection_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EndPointMsgConnectionEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointMsgConnection_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_EndPointMsgConnection_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriberEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSubscriber2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointPublisher2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompositeSrvConnectionEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvConnection_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvConnection_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContainerSrvConnectionEditPart.VISUAL_ID: {
			LinkedList<RapyutaComponentModelAbstractNavigatorItem> result = new LinkedList<RapyutaComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RapyutaComponentModelNavigatorGroup target = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_ContainerSrvConnection_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RapyutaComponentModelNavigatorGroup source = new RapyutaComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_ContainerSrvConnection_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvServer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(CompositeSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClientEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(NodeSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RapyutaComponentModelVisualIDRegistry
							.getType(EndPointSrvClient2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SystemEditPart.MODEL_ID
				.equals(RapyutaComponentModelVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<RapyutaComponentModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<RapyutaComponentModelNavigatorItem> result = new ArrayList<RapyutaComponentModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new RapyutaComponentModelNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof RapyutaComponentModelAbstractNavigatorItem) {
			RapyutaComponentModelAbstractNavigatorItem abstractNavigatorItem = (RapyutaComponentModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
