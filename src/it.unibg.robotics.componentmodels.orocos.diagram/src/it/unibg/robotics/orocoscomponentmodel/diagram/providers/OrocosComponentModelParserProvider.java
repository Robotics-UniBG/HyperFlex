/*
 * HyperFlex Plugins (VARP)
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
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
package it.unibg.robotics.orocoscomponentmodel.diagram.providers;

import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.parsers.MessageFormatParser;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;

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
public class OrocosComponentModelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5003Parser() {
		if (compositeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5003Parser = parser;
		}
		return compositeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskContextName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTaskContextName_5001Parser() {
		if (taskContextName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskContextName_5001Parser = parser;
		}
		return taskContextName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser tCPropertyName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTCPropertyName_5005Parser() {
		if (tCPropertyName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tCPropertyName_5005Parser = parser;
		}
		return tCPropertyName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5002Parser() {
		if (compositeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5002Parser = parser;
		}
		return compositeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPolicyName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPolicyName_6001Parser() {
		if (connectionPolicyName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getConnectionPolicy_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionPolicyName_6001Parser = parser;
		}
		return connectionPolicyName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser compOutputPortName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getCompOutputPortName_6002Parser() {
		if (compOutputPortName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getDataPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compOutputPortName_6002Parser = parser;
		}
		return compOutputPortName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser compInputPortName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getCompInputPortName_6003Parser() {
		if (compInputPortName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getDataPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compInputPortName_6003Parser = parser;
		}
		return compInputPortName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser peersConnectionName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getPeersConnectionName_6005Parser() {
		if (peersConnectionName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getPeersConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			peersConnectionName_6005Parser = parser;
		}
		return peersConnectionName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser compOperationName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getCompOperationName_6006Parser() {
		if (compOperationName_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compOperationName_6006Parser = parser;
		}
		return compOperationName_6006Parser;
	}

	/**
	 * @generated
	 */
	private IParser compOperationCallerName_6007Parser;

	/**
	 * @generated
	 */
	private IParser getCompOperationCallerName_6007Parser() {
		if (compOperationCallerName_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getOperationCaller_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compOperationCallerName_6007Parser = parser;
		}
		return compOperationCallerName_6007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5003Parser();
		case TaskContextNameEditPart.VISUAL_ID:
			return getTaskContextName_5001Parser();
		case TCPropertyNameEditPart.VISUAL_ID:
			return getTCPropertyName_5005Parser();
		case CompositeName2EditPart.VISUAL_ID:
			return getCompositeName_5002Parser();
		case ConnectionPolicyNameEditPart.VISUAL_ID:
			return getConnectionPolicyName_6001Parser();
		case CompOutputPortNameEditPart.VISUAL_ID:
			return getCompOutputPortName_6002Parser();
		case CompInputPortNameEditPart.VISUAL_ID:
			return getCompInputPortName_6003Parser();
		case PeersConnectionNameEditPart.VISUAL_ID:
			return getPeersConnectionName_6005Parser();
		case CompOperationNameEditPart.VISUAL_ID:
			return getCompOperationName_6006Parser();
		case CompOperationCallerNameEditPart.VISUAL_ID:
			return getCompOperationCallerName_6007Parser();
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
