/*
 * HyperFlex Plugins
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
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextPropertiesCompartmentEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.part.Messages;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class OrocosComponentModelNavigatorContentProvider implements
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
	public OrocosComponentModelNavigatorContentProvider() {
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
			ArrayList<OrocosComponentModelNavigatorItem> result = new ArrayList<OrocosComponentModelNavigatorItem>();
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

		if (parentElement instanceof OrocosComponentModelNavigatorGroup) {
			OrocosComponentModelNavigatorGroup group = (OrocosComponentModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof OrocosComponentModelNavigatorItem) {
			OrocosComponentModelNavigatorItem navigatorItem = (OrocosComponentModelNavigatorItem) parentElement;
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
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {

		case SystemEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			OrocosComponentModelNavigatorGroup links = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_System_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CompositeEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Composite_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OrocosComponentModelVisualIDRegistry
							.getType(TaskContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OrocosComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TaskContextEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCInputDataPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOutputDataPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TaskContextPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					OrocosComponentModelVisualIDRegistry
							.getType(TCPropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOperationCallerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TCInputDataPortEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_TCInputDataPort_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_TCInputDataPort_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort3EditPart.VISUAL_ID));
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

		case TCOutputDataPortEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_TCOutputDataPort_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TCOperationEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_TCOperation_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TCOperationCallerEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_TCOperationCaller_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_TCOperationCaller_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller3EditPart.VISUAL_ID));
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

		case Composite2EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Composite_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCallerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompInputPortEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort3EditPart.VISUAL_ID));
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

		case CompOutputPortEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOutputPort_3025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompOperationEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperation_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompOperationCallerEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller3EditPart.VISUAL_ID));
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

		case CompInputPort2EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort3EditPart.VISUAL_ID));
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

		case CompOutputPort2EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOutputPort_3029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(ConnectionPolicyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompOperation2EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperation_3030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompOperationCaller2EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OrocosComponentModelNavigatorGroup outgoinglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(PeersConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller3EditPart.VISUAL_ID));
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

		case ConnectionPolicyEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OrocosComponentModelNavigatorGroup target = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_ConnectionPolicy_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup source = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_ConnectionPolicy_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOutputDataPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCInputDataPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort2EditPart.VISUAL_ID));
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

		case CompOutputPort3EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OrocosComponentModelNavigatorGroup target = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOutputPort_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOutputPort_4011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup source = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOutputPort_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOutputDataPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOutputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompInputPort3EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OrocosComponentModelNavigatorGroup target = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_4012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup source = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompInputPort_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCInputDataPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompInputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PeersConnectionEditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OrocosComponentModelNavigatorGroup target = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_PeersConnection_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup source = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_PeersConnection_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOperationCallerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCallerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller2EditPart.VISUAL_ID));
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

		case CompOperation3EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OrocosComponentModelNavigatorGroup target = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperation_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperation_4014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup source = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperation_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompOperationCaller3EditPart.VISUAL_ID: {
			LinkedList<OrocosComponentModelAbstractNavigatorItem> result = new LinkedList<OrocosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OrocosComponentModelNavigatorGroup target = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup incominglinks = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_4015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OrocosComponentModelNavigatorGroup source = new OrocosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompOperationCaller_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(TCOperationCallerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCallerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompOperationCaller2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OrocosComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
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
				.equals(OrocosComponentModelVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<OrocosComponentModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<OrocosComponentModelNavigatorItem> result = new ArrayList<OrocosComponentModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new OrocosComponentModelNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof OrocosComponentModelAbstractNavigatorItem) {
			OrocosComponentModelAbstractNavigatorItem abstractNavigatorItem = (OrocosComponentModelAbstractNavigatorItem) element;
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
