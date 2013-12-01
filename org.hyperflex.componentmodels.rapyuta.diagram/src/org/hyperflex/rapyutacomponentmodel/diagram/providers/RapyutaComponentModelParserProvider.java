/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.providers;

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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.ContainerNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.parsers.MessageFormatParser;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RapyutaComponentModelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5007Parser() {
		if (compositeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Composite - {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Composite - {0}"); //$NON-NLS-1$
			parser.setEditPattern("Composite - {0}"); //$NON-NLS-1$
			compositeName_5007Parser = parser;
		}
		return compositeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser containerName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getContainerName_5013Parser() {
		if (containerName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Container - {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Container - {0}"); //$NON-NLS-1$
			parser.setEditPattern("Container - {0}"); //$NON-NLS-1$
			containerName_5013Parser = parser;
		}
		return containerName_5013Parser;
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
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5002Parser = parser;
		}
		return nodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeParameterName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodeParameterName_5001Parser() {
		if (nodeParameterName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeParameterName_5001Parser = parser;
		}
		return nodeParameterName_5001Parser;
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
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
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
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5004Parser = parser;
		}
		return topicName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser robotEndPointName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getRobotEndPointName_5016Parser() {
		if (robotEndPointName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			robotEndPointName_5016Parser = parser;
		}
		return robotEndPointName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser endPointParameterName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEndPointParameterName_5005Parser() {
		if (endPointParameterName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endPointParameterName_5005Parser = parser;
		}
		return endPointParameterName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5018Parser() {
		if (nodeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5018Parser = parser;
		}
		return nodeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeParameterName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getNodeParameterName_5008Parser() {
		if (nodeParameterName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeParameterName_5008Parser = parser;
		}
		return nodeParameterName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser environmentEndPointName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getEnvironmentEndPointName_5017Parser() {
		if (environmentEndPointName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			environmentEndPointName_5017Parser = parser;
		}
		return environmentEndPointName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser endPointParameterName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEndPointParameterName_5010Parser() {
		if (endPointParameterName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endPointParameterName_5010Parser = parser;
		}
		return endPointParameterName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5012Parser() {
		if (topicName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5012Parser = parser;
		}
		return topicName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5007Parser();
		case ContainerNameEditPart.VISUAL_ID:
			return getContainerName_5013Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5002Parser();
		case NodeParameterNameEditPart.VISUAL_ID:
			return getNodeParameterName_5001Parser();
		case CompositeName2EditPart.VISUAL_ID:
			return getCompositeName_5003Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5004Parser();
		case RobotEndPointNameEditPart.VISUAL_ID:
			return getRobotEndPointName_5016Parser();
		case EndPointParameterNameEditPart.VISUAL_ID:
			return getEndPointParameterName_5005Parser();
		case NodeName2EditPart.VISUAL_ID:
			return getNodeName_5018Parser();
		case NodeParameterName2EditPart.VISUAL_ID:
			return getNodeParameterName_5008Parser();
		case EnvironmentEndPointNameEditPart.VISUAL_ID:
			return getEnvironmentEndPointName_5017Parser();
		case EndPointParameterName2EditPart.VISUAL_ID:
			return getEndPointParameterName_5010Parser();
		case TopicName2EditPart.VISUAL_ID:
			return getTopicName_5012Parser();
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
			return getParser(RapyutaComponentModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RapyutaComponentModelVisualIDRegistry
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
			if (RapyutaComponentModelElementTypes.getElement(hint) == null) {
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
