package org.hyperflex.roscomponentmodel.diagram.navigator;

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
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposed2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgInterfaceExposedEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromote2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerPromoteEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnection2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.MsgInterfaceConnectionEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertiesCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.Messages;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RosComponentModelNavigatorContentProvider implements
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
	public RosComponentModelNavigatorContentProvider() {
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
			ArrayList<RosComponentModelNavigatorItem> result = new ArrayList<RosComponentModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							ArchitectureModelEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof RosComponentModelNavigatorGroup) {
			RosComponentModelNavigatorGroup group = (RosComponentModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof RosComponentModelNavigatorItem) {
			RosComponentModelNavigatorItem navigatorItem = (RosComponentModelNavigatorItem) parentElement;
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
		switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {

		case ArchitectureModelEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			RosComponentModelNavigatorGroup links = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_System_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CompositeEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RosComponentModelVisualIDRegistry
							.getType(NodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RosComponentModelVisualIDRegistry
							.getType(Composite2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeCompositeContainerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RosComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvConsumer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case NodeEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodePropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RosComponentModelVisualIDRegistry
							.getType(NodePropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeMsgProducerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeMsgConsumerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeSrvProducerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeSrvConsumerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case NodeMsgProducerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeMsgProducer_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeMsgConsumerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeMsgConsumer_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeSrvProducerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup incominglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSrvProducer_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case NodeSrvConsumerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_NodeSrvConsumer_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Composite2EditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvConsumerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CompositeMsgProducerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgProducer_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeMsgConsumerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgConsumer_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSrvProducerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup incominglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducer_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducer_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSrvConsumerEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvConsumer_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeMsgProducer2EditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgProducer_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeMsgConsumer2EditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgConsumer_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TopicEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup incominglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Topic_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(MsgInterfaceConnection2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgInterfaceExposed2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CompositeSrvProducer2EditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup incominglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducer_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducer_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromoteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerPromote2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeSrvConsumer2EditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			RosComponentModelNavigatorGroup outgoinglinks = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvConsumer_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(WireEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MsgInterfaceConnectionEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeMsgProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeMsgConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumer2EditPart.VISUAL_ID));
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
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_MsgInterfaceConnection_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeMsgProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeMsgConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumer2EditPart.VISUAL_ID));
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
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumer2EditPart.VISUAL_ID));
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
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeMsgInterfaceExposed_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(TopicEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgProducer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeMsgConsumer2EditPart.VISUAL_ID));
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

		case CompositeSrvProducerPromoteEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducerPromote_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducerPromote_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeSrvProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducer2EditPart.VISUAL_ID));
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

		case CompositeSrvProducerPromote2EditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducerPromote_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeSrvProducerPromote_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeSrvProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducer2EditPart.VISUAL_ID));
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

		case WireEditPart.VISUAL_ID: {
			LinkedList<RosComponentModelAbstractNavigatorItem> result = new LinkedList<RosComponentModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RosComponentModelNavigatorGroup target = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Wire_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RosComponentModelNavigatorGroup source = new RosComponentModelNavigatorGroup(
					Messages.NavigatorGroupName_Wire_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeSrvProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvProducer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(NodeSrvConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvConsumerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RosComponentModelVisualIDRegistry
							.getType(CompositeSrvConsumer2EditPart.VISUAL_ID));
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
		return ArchitectureModelEditPart.MODEL_ID
				.equals(RosComponentModelVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<RosComponentModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<RosComponentModelNavigatorItem> result = new ArrayList<RosComponentModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new RosComponentModelNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof RosComponentModelAbstractNavigatorItem) {
			RosComponentModelAbstractNavigatorItem abstractNavigatorItem = (RosComponentModelAbstractNavigatorItem) element;
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
