package org.hyperflex.roscomponentmodel.diagram.providers;

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
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.NodePropertyNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.edit.parts.WireSrvNameEditPart;
import org.hyperflex.roscomponentmodel.diagram.parsers.MessageFormatParser;
import org.hyperflex.roscomponentmodel.diagram.part.RosComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RosComponentModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5005Parser() {
		if (compositeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5005Parser = parser;
		}
		return compositeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5002Parser() {
		if (nodeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5002Parser = parser;
		}
		return nodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodePropertyName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodePropertyName_5001Parser() {
		if (nodePropertyName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodePropertyName_5001Parser = parser;
		}
		return nodePropertyName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5003Parser() {
		if (compositeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5003Parser = parser;
		}
		return compositeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5004Parser() {
		if (topicName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5004Parser = parser;
		}
		return topicName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser wireSrvName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getWireSrvName_6001Parser() {
		if (wireSrvName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getWire_SrvName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wireSrvName_6001Parser = parser;
		}
		return wireSrvName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5005Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5002Parser();
		case NodePropertyNameEditPart.VISUAL_ID:
			return getNodePropertyName_5001Parser();
		case CompositeName2EditPart.VISUAL_ID:
			return getCompositeName_5003Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5004Parser();
		case WireSrvNameEditPart.VISUAL_ID:
			return getWireSrvName_6001Parser();
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
