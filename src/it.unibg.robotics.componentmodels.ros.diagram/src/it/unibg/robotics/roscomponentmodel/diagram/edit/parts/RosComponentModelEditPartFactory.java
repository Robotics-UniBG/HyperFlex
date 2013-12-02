package it.unibg.robotics.roscomponentmodel.diagram.edit.parts;

import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class RosComponentModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RosComponentModelVisualIDRegistry.getVisualID(view)) {

			case ArchitectureModelEditPart.VISUAL_ID:
				return new ArchitectureModelEditPart(view);

			case CompositeEditPart.VISUAL_ID:
				return new CompositeEditPart(view);

			case CompositeNameEditPart.VISUAL_ID:
				return new CompositeNameEditPart(view);

			case NodeEditPart.VISUAL_ID:
				return new NodeEditPart(view);

			case NodeNameEditPart.VISUAL_ID:
				return new NodeNameEditPart(view);

			case NodePropertyEditPart.VISUAL_ID:
				return new NodePropertyEditPart(view);

			case NodePropertyNameEditPart.VISUAL_ID:
				return new NodePropertyNameEditPart(view);

			case NodeMsgProducerEditPart.VISUAL_ID:
				return new NodeMsgProducerEditPart(view);

			case NodeMsgConsumerEditPart.VISUAL_ID:
				return new NodeMsgConsumerEditPart(view);

			case Composite2EditPart.VISUAL_ID:
				return new Composite2EditPart(view);

			case CompositeName2EditPart.VISUAL_ID:
				return new CompositeName2EditPart(view);

			case CompositeMsgProducerEditPart.VISUAL_ID:
				return new CompositeMsgProducerEditPart(view);

			case CompositeMsgConsumerEditPart.VISUAL_ID:
				return new CompositeMsgConsumerEditPart(view);

			case CompositeMsgProducer2EditPart.VISUAL_ID:
				return new CompositeMsgProducer2EditPart(view);

			case CompositeMsgConsumer2EditPart.VISUAL_ID:
				return new CompositeMsgConsumer2EditPart(view);

			case TopicEditPart.VISUAL_ID:
				return new TopicEditPart(view);

			case TopicNameEditPart.VISUAL_ID:
				return new TopicNameEditPart(view);

			case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
				return new CompositeCompositeContainerCompartmentEditPart(view);

			case NodePropertiesCompartmentEditPart.VISUAL_ID:
				return new NodePropertiesCompartmentEditPart(view);

			case MsgInterfaceConnectionEditPart.VISUAL_ID:
				return new MsgInterfaceConnectionEditPart(view);

			case MsgInterfaceConnection2EditPart.VISUAL_ID:
				return new MsgInterfaceConnection2EditPart(view);

			case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
				return new CompositeMsgInterfaceExposedEditPart(view);

			case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
				return new CompositeMsgInterfaceExposed2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
