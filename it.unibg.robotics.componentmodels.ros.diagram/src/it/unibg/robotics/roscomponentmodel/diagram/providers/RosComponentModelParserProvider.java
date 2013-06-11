package it.unibg.robotics.roscomponentmodel.diagram.providers;

import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgConsumerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeMsgProducerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeTypeEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgConsumerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageMsgProducerNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ParameterEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.ParameterNameEditPart;
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
	private IParser packageName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5010Parser() {
		if (packageName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_5010Parser = parser;
		}
		return packageName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5003Parser() {
		if (nodeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5003Parser = parser;
		}
		return nodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeType_5004Parser;

	/**
	 * @generated
	 */
	private IParser getNodeType_5004Parser() {
		if (nodeType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getNode_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeType_5004Parser = parser;
		}
		return nodeType_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser parameterName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getParameterName_5013Parser() {
		if (parameterName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterName_5013Parser = parser;
		}
		return parameterName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeMsgProducerName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodeMsgProducerName_5001Parser() {
		if (nodeMsgProducerName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgProducer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeMsgProducerName_5001Parser = parser;
		}
		return nodeMsgProducerName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeMsgConsumerName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNodeMsgConsumerName_5002Parser() {
		if (nodeMsgConsumerName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgConsumer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeMsgConsumerName_5002Parser = parser;
		}
		return nodeMsgConsumerName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5005Parser() {
		if (packageName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_5005Parser = parser;
		}
		return packageName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageMsgProducerName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPackageMsgProducerName_5007Parser() {
		if (packageMsgProducerName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgProducer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageMsgProducerName_5007Parser = parser;
		}
		return packageMsgProducerName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageMsgConsumerName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getPackageMsgConsumerName_5008Parser() {
		if (packageMsgConsumerName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgConsumer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageMsgConsumerName_5008Parser = parser;
		}
		return packageMsgConsumerName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageMsgProducerName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getPackageMsgProducerName_5011Parser() {
		if (packageMsgProducerName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgProducer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageMsgProducerName_5011Parser = parser;
		}
		return packageMsgProducerName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageMsgConsumerName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getPackageMsgConsumerName_5012Parser() {
		if (packageMsgConsumerName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getMsgConsumer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageMsgConsumerName_5012Parser = parser;
		}
		return packageMsgConsumerName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5009Parser() {
		if (topicName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5009Parser = parser;
		}
		return topicName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5010Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5003Parser();
		case NodeTypeEditPart.VISUAL_ID:
			return getNodeType_5004Parser();
		case ParameterNameEditPart.VISUAL_ID:
			return getParameterName_5013Parser();
		case NodeMsgProducerNameEditPart.VISUAL_ID:
			return getNodeMsgProducerName_5001Parser();
		case NodeMsgConsumerNameEditPart.VISUAL_ID:
			return getNodeMsgConsumerName_5002Parser();
		case PackageName2EditPart.VISUAL_ID:
			return getPackageName_5005Parser();
		case PackageMsgProducerNameEditPart.VISUAL_ID:
			return getPackageMsgProducerName_5007Parser();
		case PackageMsgConsumerNameEditPart.VISUAL_ID:
			return getPackageMsgConsumerName_5008Parser();
		case PackageMsgProducerName2EditPart.VISUAL_ID:
			return getPackageMsgProducerName_5011Parser();
		case PackageMsgConsumerName2EditPart.VISUAL_ID:
			return getPackageMsgConsumerName_5012Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5009Parser();
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
