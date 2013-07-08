package it.unibg.robotics.roscomponentmodel.diagram.providers;

import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.NodeNameEditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageName2EditPart;
import it.unibg.robotics.roscomponentmodel.diagram.edit.parts.PackageNameEditPart;
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
	private IParser packageName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5016Parser() {
		if (packageName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_5016Parser = parser;
		}
		return packageName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5017Parser() {
		if (topicName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5017Parser = parser;
		}
		return topicName_5017Parser;
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
		case ParameterNameEditPart.VISUAL_ID:
			return getParameterName_5013Parser();
		case PackageName2EditPart.VISUAL_ID:
			return getPackageName_5016Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5017Parser();
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
