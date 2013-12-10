package org.hyperflex.roscomponentmodel.diagram.providers;

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
import org.hyperflex.roscomponentmodel.diagram.edit.parts.ArchitectureModelEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducer2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeMsgProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvConsumerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeSrvProducerEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicEditPart;
import org.hyperflex.roscomponentmodel.diagram.part.Messages;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class RosComponentModelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ArchitectureModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(RosComponentModelElementTypes.Composite_2001);
			return types;
		}
		if (editPart instanceof CompositeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(RosComponentModelElementTypes.CompositeMsgProducer_3012);
			types.add(RosComponentModelElementTypes.CompositeMsgConsumer_3013);
			types.add(RosComponentModelElementTypes.CompositeSrvProducer_3015);
			types.add(RosComponentModelElementTypes.CompositeSrvConsumer_3016);
			return types;
		}
		if (editPart instanceof NodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(RosComponentModelElementTypes.NodeMsgProducer_3003);
			types.add(RosComponentModelElementTypes.NodeMsgConsumer_3004);
			types.add(RosComponentModelElementTypes.NodeSrvProducer_3005);
			types.add(RosComponentModelElementTypes.NodeSrvConsumer_3006);
			types.add(RosComponentModelElementTypes.NodeProperty_3002);
			return types;
		}
		if (editPart instanceof Composite2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(RosComponentModelElementTypes.CompositeMsgProducer_3008);
			types.add(RosComponentModelElementTypes.CompositeMsgConsumer_3009);
			types.add(RosComponentModelElementTypes.CompositeSrvProducer_3010);
			types.add(RosComponentModelElementTypes.CompositeSrvConsumer_3011);
			return types;
		}
		if (editPart instanceof CompositeCompositeContainerCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(RosComponentModelElementTypes.Node_3001);
			types.add(RosComponentModelElementTypes.Composite_3007);
			types.add(RosComponentModelElementTypes.Topic_3014);
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
		if (sourceEditPart instanceof NodeMsgProducerEditPart) {
			return ((NodeMsgProducerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodeMsgConsumerEditPart) {
			return ((NodeMsgConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NodeSrvConsumerEditPart) {
			return ((NodeSrvConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeMsgProducerEditPart) {
			return ((CompositeMsgProducerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeMsgConsumerEditPart) {
			return ((CompositeMsgConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSrvProducerEditPart) {
			return ((CompositeSrvProducerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSrvConsumerEditPart) {
			return ((CompositeSrvConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeMsgProducer2EditPart) {
			return ((CompositeMsgProducer2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeMsgConsumer2EditPart) {
			return ((CompositeMsgConsumer2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSrvProducer2EditPart) {
			return ((CompositeSrvProducer2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeSrvConsumer2EditPart) {
			return ((CompositeSrvConsumer2EditPart) sourceEditPart)
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
		if (targetEditPart instanceof NodeSrvProducerEditPart) {
			return ((NodeSrvProducerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeSrvProducerEditPart) {
			return ((CompositeSrvProducerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TopicEditPart) {
			return ((TopicEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeSrvProducer2EditPart) {
			return ((CompositeSrvProducer2EditPart) targetEditPart)
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
		if (sourceEditPart instanceof NodeMsgProducerEditPart) {
			return ((NodeMsgProducerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodeMsgConsumerEditPart) {
			return ((NodeMsgConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NodeSrvConsumerEditPart) {
			return ((NodeSrvConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeMsgProducerEditPart) {
			return ((CompositeMsgProducerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeMsgConsumerEditPart) {
			return ((CompositeMsgConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSrvProducerEditPart) {
			return ((CompositeSrvProducerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSrvConsumerEditPart) {
			return ((CompositeSrvConsumerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeMsgProducer2EditPart) {
			return ((CompositeMsgProducer2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeMsgConsumer2EditPart) {
			return ((CompositeMsgConsumer2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSrvProducer2EditPart) {
			return ((CompositeSrvProducer2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeSrvConsumer2EditPart) {
			return ((CompositeSrvConsumer2EditPart) sourceEditPart)
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
		if (targetEditPart instanceof NodeSrvProducerEditPart) {
			return ((NodeSrvProducerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeSrvProducerEditPart) {
			return ((CompositeSrvProducerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TopicEditPart) {
			return ((TopicEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeSrvProducer2EditPart) {
			return ((CompositeSrvProducer2EditPart) targetEditPart)
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
		if (sourceEditPart instanceof NodeMsgProducerEditPart) {
			return ((NodeMsgProducerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodeMsgConsumerEditPart) {
			return ((NodeMsgConsumerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NodeSrvConsumerEditPart) {
			return ((NodeSrvConsumerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeMsgProducerEditPart) {
			return ((CompositeMsgProducerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeMsgConsumerEditPart) {
			return ((CompositeMsgConsumerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSrvProducerEditPart) {
			return ((CompositeSrvProducerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSrvConsumerEditPart) {
			return ((CompositeSrvConsumerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeMsgProducer2EditPart) {
			return ((CompositeMsgProducer2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeMsgConsumer2EditPart) {
			return ((CompositeMsgConsumer2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSrvProducer2EditPart) {
			return ((CompositeSrvProducer2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeSrvConsumer2EditPart) {
			return ((CompositeSrvConsumer2EditPart) sourceEditPart)
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
				RosComponentModelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.RosComponentModelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.RosComponentModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
