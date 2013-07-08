package it.unibg.robotics.compositionmodel.diagram.providers;

import it.unibg.robotics.compositionmodel.diagram.edit.parts.ConnectionNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.ROSCompositeNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemCompositeNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.edit.parts.SystemNameEditPart;
import it.unibg.robotics.compositionmodel.diagram.parsers.MessageFormatParser;
import it.unibg.robotics.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;

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
public class CompositionModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser systemName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getSystemName_5006Parser() {
		if (systemName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getSystem_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			systemName_5006Parser = parser;
		}
		return systemName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser systemCompositeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getSystemCompositeName_5007Parser() {
		if (systemCompositeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getComposite_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			systemCompositeName_5007Parser = parser;
		}
		return systemCompositeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser rOSCompositeName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getROSCompositeName_5008Parser() {
		if (rOSCompositeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getComposite_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rOSCompositeName_5008Parser = parser;
		}
		return rOSCompositeName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionName_6001Parser() {
		if (connectionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.compositionmodel.compositionmodelPackage.eINSTANCE
					.getConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionName_6001Parser = parser;
		}
		return connectionName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SystemNameEditPart.VISUAL_ID:
			return getSystemName_5006Parser();
		case SystemCompositeNameEditPart.VISUAL_ID:
			return getSystemCompositeName_5007Parser();
		case ROSCompositeNameEditPart.VISUAL_ID:
			return getROSCompositeName_5008Parser();
		case ConnectionNameEditPart.VISUAL_ID:
			return getConnectionName_6001Parser();
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
			return getParser(CompositionModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CompositionModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CompositionModelElementTypes.getElement(hint) == null) {
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
