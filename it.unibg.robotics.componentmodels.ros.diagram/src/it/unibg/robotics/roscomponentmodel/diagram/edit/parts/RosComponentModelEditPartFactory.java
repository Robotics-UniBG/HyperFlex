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

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case NodeEditPart.VISUAL_ID:
				return new NodeEditPart(view);

			case NodeNameEditPart.VISUAL_ID:
				return new NodeNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameEditPart.VISUAL_ID:
				return new ParameterNameEditPart(view);

			case NodeMsgProducerEditPart.VISUAL_ID:
				return new NodeMsgProducerEditPart(view);

			case NodeMsgConsumerEditPart.VISUAL_ID:
				return new NodeMsgConsumerEditPart(view);

			case Package2EditPart.VISUAL_ID:
				return new Package2EditPart(view);

			case PackageName2EditPart.VISUAL_ID:
				return new PackageName2EditPart(view);

			case PackageMsgProducerEditPart.VISUAL_ID:
				return new PackageMsgProducerEditPart(view);

			case PackageMsgConsumerEditPart.VISUAL_ID:
				return new PackageMsgConsumerEditPart(view);

			case PackageMsgProducer2EditPart.VISUAL_ID:
				return new PackageMsgProducer2EditPart(view);

			case PackageMsgConsumer2EditPart.VISUAL_ID:
				return new PackageMsgConsumer2EditPart(view);

			case TopicEditPart.VISUAL_ID:
				return new TopicEditPart(view);

			case TopicNameEditPart.VISUAL_ID:
				return new TopicNameEditPart(view);

			case PackagePackageContainerCompartmentEditPart.VISUAL_ID:
				return new PackagePackageContainerCompartmentEditPart(view);

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
