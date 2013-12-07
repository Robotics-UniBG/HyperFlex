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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CloudContainerNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EndPointParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.EnvironmentEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.NodeParameterNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotContainerNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RobotEndPointNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicName2EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.TopicNameEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel3EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabel4EditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.WrappingLabelEditPart;
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
	private IParser robotContainerName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getRobotContainerName_5034Parser() {
		if (robotContainerName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			robotContainerName_5034Parser = parser;
		}
		return robotContainerName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloudContainerName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getCloudContainerName_5039Parser() {
		if (cloudContainerName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloudContainerName_5039Parser = parser;
		}
		return cloudContainerName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeParameterName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getNodeParameterName_5019Parser() {
		if (nodeParameterName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeParameterName_5019Parser = parser;
		}
		return nodeParameterName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5032Parser() {
		if (compositeName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5032Parser = parser;
		}
		return compositeName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser endPointParameterName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getEndPointParameterName_5023Parser() {
		if (endPointParameterName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endPointParameterName_5023Parser = parser;
		}
		return endPointParameterName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5035Parser() {
		if (nodeName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5035Parser = parser;
		}
		return nodeName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5027Parser() {
		if (nodeName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5027Parser = parser;
		}
		return nodeName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeParameterName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getNodeParameterName_5026Parser() {
		if (nodeParameterName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeParameterName_5026Parser = parser;
		}
		return nodeParameterName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser environmentEndPointName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getEnvironmentEndPointName_5036Parser() {
		if (environmentEndPointName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPoint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			environmentEndPointName_5036Parser = parser;
		}
		return environmentEndPointName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser endPointParameterName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getEndPointParameterName_5028Parser() {
		if (endPointParameterName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endPointParameterName_5028Parser = parser;
		}
		return endPointParameterName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5037Parser() {
		if (topicName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5037Parser = parser;
		}
		return topicName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeName_5038Parser() {
		if (compositeName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getAbstractComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5038Parser = parser;
		}
		return compositeName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser topicName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getTopicName_5030Parser() {
		if (topicName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getTopic_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			topicName_5030Parser = parser;
		}
		return topicName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser robotEndPointName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getRobotEndPointName_5033Parser() {
		if (robotEndPointName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPoint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			robotEndPointName_5033Parser = parser;
		}
		return robotEndPointName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser endPointSrvConnectionName_6007Parser;

	/**
	 * @generated
	 */
	private IParser getEndPointSrvConnectionName_6007Parser() {
		if (endPointSrvConnectionName_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getEndPointSrvConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endPointSrvConnectionName_6007Parser = parser;
		}
		return endPointSrvConnectionName_6007Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeSrvConnectionName_6009Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeSrvConnectionName_6009Parser() {
		if (compositeSrvConnectionName_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getSrvConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeSrvConnectionName_6009Parser = parser;
		}
		return compositeSrvConnectionName_6009Parser;
	}

	/**
	 * @generated
	 */
	private IParser containerSrvConnectionName_6010Parser;

	/**
	 * @generated
	 */
	private IParser getContainerSrvConnectionName_6010Parser() {
		if (containerSrvConnectionName_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
					.getSrvConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containerSrvConnectionName_6010Parser = parser;
		}
		return containerSrvConnectionName_6010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RobotContainerNameEditPart.VISUAL_ID:
			return getRobotContainerName_5034Parser();
		case CloudContainerNameEditPart.VISUAL_ID:
			return getCloudContainerName_5039Parser();
		case NodeName2EditPart.VISUAL_ID:
			return getNodeName_5027Parser();
		case NodeParameterNameEditPart.VISUAL_ID:
			return getNodeParameterName_5019Parser();
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5032Parser();
		case TopicName2EditPart.VISUAL_ID:
			return getTopicName_5030Parser();
		case RobotEndPointNameEditPart.VISUAL_ID:
			return getRobotEndPointName_5033Parser();
		case EndPointParameterNameEditPart.VISUAL_ID:
			return getEndPointParameterName_5023Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5035Parser();
		case NodeParameterName2EditPart.VISUAL_ID:
			return getNodeParameterName_5026Parser();
		case EnvironmentEndPointNameEditPart.VISUAL_ID:
			return getEnvironmentEndPointName_5036Parser();
		case EndPointParameterName2EditPart.VISUAL_ID:
			return getEndPointParameterName_5028Parser();
		case TopicNameEditPart.VISUAL_ID:
			return getTopicName_5037Parser();
		case CompositeName2EditPart.VISUAL_ID:
			return getCompositeName_5038Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getEndPointSrvConnectionName_6007Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getCompositeSrvConnectionName_6009Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getContainerSrvConnectionName_6010Parser();
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
