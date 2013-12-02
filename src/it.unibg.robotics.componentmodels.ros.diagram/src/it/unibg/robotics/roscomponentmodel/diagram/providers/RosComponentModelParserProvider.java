package it.unibg.robotics.roscomponentmodel.diagram.providers;

import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodePropertyNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.TopicNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.parsers.MessageFormatParser;
import it.unibg.robotics.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RosComponentModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5022Parser() {
		if (compositeName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5022Parser = parser;
		}
		return compositeName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5019Parser() {
		if (nodeName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5019Parser = parser;
		}
		return nodeName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodePropertyName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getNodePropertyName_5018Parser() {
		if (nodePropertyName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodePropertyName_5018Parser = parser;
		}
		return nodePropertyName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5020Parser() {
		if (compositeName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5020Parser = parser;
		}
		return compositeName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5021Parser() {
		if (topicName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5021Parser = parser;
		}
		return topicName_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5022Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5019Parser();
		case NodePropertyNameEditPart.VISUAL_ID:
			return getNodePropertyName_5018Parser();
		case CompositeName2EditPart.VISUAL_ID:
			return getCompositeName_5020Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5021Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RosComponentModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RosComponentModelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RosComponentModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
