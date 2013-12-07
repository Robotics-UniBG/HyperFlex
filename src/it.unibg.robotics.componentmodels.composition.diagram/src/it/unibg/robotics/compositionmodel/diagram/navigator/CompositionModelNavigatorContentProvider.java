package org.hyperflex.compositionmodel.diagram.navigator;

import org.hyperflex.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSMsgConsumerEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSMsgProducerEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.System2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeContainerCompartmentEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;
import org.hyperflex.compositionmodel.diagram.part.Messages;

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

/**
 * @generated
 */
public class CompositionModelNavigatorContentProvider implements
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
	public CompositionModelNavigatorContentProvider() {
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
			ArrayList<CompositionModelNavigatorItem> result = new ArrayList<CompositionModelNavigatorItem>();
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

		if (parentElement instanceof CompositionModelNavigatorGroup) {
			CompositionModelNavigatorGroup group = (CompositionModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CompositionModelNavigatorItem) {
			CompositionModelNavigatorItem navigatorItem = (CompositionModelNavigatorItem) parentElement;
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
		switch (CompositionModelVisualIDRegistry.getVisualID(view)) {

		case SystemEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			CompositionModelNavigatorGroup links = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_ArchitectureModel_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(System2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case System2EditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemProvidedInterfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemRequiredInterfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CompositionModelVisualIDRegistry
							.getType(ROSCompositeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SystemProvidedInterfEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			CompositionModelNavigatorGroup incominglinks = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_SystemProvidedInterf_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SystemRequiredInterfEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			CompositionModelNavigatorGroup outgoinglinks = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_SystemRequiredInterf_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SystemCompositeEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeProvidedInterfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeRequiredInterfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SystemCompositeProvidedInterfEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			CompositionModelNavigatorGroup incominglinks = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_SystemCompositeProvidedInterf_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SystemCompositeRequiredInterfEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			CompositionModelNavigatorGroup outgoinglinks = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_SystemCompositeRequiredInterf_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ROSCompositeEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ROSMsgProducerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ROSMsgConsumerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ROSMsgProducerEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			CompositionModelNavigatorGroup incominglinks = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_ROSMsgProducer_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ROSMsgConsumerEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			CompositionModelNavigatorGroup outgoinglinks = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_ROSMsgConsumer_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConnectionEditPart.VISUAL_ID: {
			LinkedList<CompositionModelAbstractNavigatorItem> result = new LinkedList<CompositionModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CompositionModelNavigatorGroup target = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_Connection_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CompositionModelNavigatorGroup source = new CompositionModelNavigatorGroup(
					Messages.NavigatorGroupName_Connection_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemProvidedInterfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeProvidedInterfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ROSMsgProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemRequiredInterfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(SystemCompositeRequiredInterfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CompositionModelVisualIDRegistry
							.getType(ROSMsgConsumerEditPart.VISUAL_ID));
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
		return SystemEditPart.MODEL_ID.equals(CompositionModelVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CompositionModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<CompositionModelNavigatorItem> result = new ArrayList<CompositionModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new CompositionModelNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof CompositionModelAbstractNavigatorItem) {
			CompositionModelAbstractNavigatorItem abstractNavigatorItem = (CompositionModelAbstractNavigatorItem) element;
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
