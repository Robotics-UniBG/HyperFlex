/*
 * HyperFlex Plugins
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.hyperflex.orocoscomponentmodel.diagram.providers;

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
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPortNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPortNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.PeersConnectionNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCPropertyNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextNameEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.parsers.MessageFormatParser;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class OrocosComponentModelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5009Parser() {
		if (compositeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5009Parser = parser;
		}
		return compositeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskContextName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getTaskContextName_5007Parser() {
		if (taskContextName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskContextName_5007Parser = parser;
		}
		return taskContextName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser tCPropertyName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTCPropertyName_5006Parser() {
		if (tCPropertyName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tCPropertyName_5006Parser = parser;
		}
		return tCPropertyName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5008Parser() {
		if (compositeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5008Parser = parser;
		}
		return compositeName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPolicyName_6008Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPolicyName_6008Parser() {
		if (connectionPolicyName_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getConnectionPolicy_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionPolicyName_6008Parser = parser;
		}
		return connectionPolicyName_6008Parser;
	}

	/**
	 * @generated
	 */
	private IParser compOutputPortName_6009Parser;

	/**
	 * @generated
	 */
	private IParser getCompOutputPortName_6009Parser() {
		if (compOutputPortName_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getDataPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compOutputPortName_6009Parser = parser;
		}
		return compOutputPortName_6009Parser;
	}

	/**
	 * @generated
	 */
	private IParser compInputPortName_6010Parser;

	/**
	 * @generated
	 */
	private IParser getCompInputPortName_6010Parser() {
		if (compInputPortName_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getDataPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compInputPortName_6010Parser = parser;
		}
		return compInputPortName_6010Parser;
	}

	/**
	 * @generated
	 */
	private IParser peersConnectionName_6011Parser;

	/**
	 * @generated
	 */
	private IParser getPeersConnectionName_6011Parser() {
		if (peersConnectionName_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getPeersConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			peersConnectionName_6011Parser = parser;
		}
		return peersConnectionName_6011Parser;
	}

	/**
	 * @generated
	 */
	private IParser compOperationName_6012Parser;

	/**
	 * @generated
	 */
	private IParser getCompOperationName_6012Parser() {
		if (compOperationName_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compOperationName_6012Parser = parser;
		}
		return compOperationName_6012Parser;
	}

	/**
	 * @generated
	 */
	private IParser compOperationCallerName_6013Parser;

	/**
	 * @generated
	 */
	private IParser getCompOperationCallerName_6013Parser() {
		if (compOperationCallerName_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getOperationCaller_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compOperationCallerName_6013Parser = parser;
		}
		return compOperationCallerName_6013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5009Parser();
		case TaskContextNameEditPart.VISUAL_ID:
			return getTaskContextName_5007Parser();
		case TCPropertyNameEditPart.VISUAL_ID:
			return getTCPropertyName_5006Parser();
		case CompositeName2EditPart.VISUAL_ID:
			return getCompositeName_5008Parser();
		case ConnectionPolicyNameEditPart.VISUAL_ID:
			return getConnectionPolicyName_6008Parser();
		case CompOutputPortNameEditPart.VISUAL_ID:
			return getCompOutputPortName_6009Parser();
		case CompInputPortNameEditPart.VISUAL_ID:
			return getCompInputPortName_6010Parser();
		case PeersConnectionNameEditPart.VISUAL_ID:
			return getPeersConnectionName_6011Parser();
		case CompOperationNameEditPart.VISUAL_ID:
			return getCompOperationName_6012Parser();
		case CompOperationCallerNameEditPart.VISUAL_ID:
			return getCompOperationCallerName_6013Parser();
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
			return getParser(OrocosComponentModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(OrocosComponentModelVisualIDRegistry
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
			if (OrocosComponentModelElementTypes.getElement(hint) == null) {
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
