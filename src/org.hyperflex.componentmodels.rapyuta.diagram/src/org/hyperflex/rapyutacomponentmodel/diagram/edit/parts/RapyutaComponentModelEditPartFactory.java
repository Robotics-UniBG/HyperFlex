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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RapyutaComponentModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RapyutaComponentModelVisualIDRegistry.getVisualID(view)) {

			case SystemEditPart.VISUAL_ID:
				return new SystemEditPart(view);

			case RobotContainerEditPart.VISUAL_ID:
				return new RobotContainerEditPart(view);

			case RobotContainerNameEditPart.VISUAL_ID:
				return new RobotContainerNameEditPart(view);

			case CloudContainerEditPart.VISUAL_ID:
				return new CloudContainerEditPart(view);

			case CloudContainerNameEditPart.VISUAL_ID:
				return new CloudContainerNameEditPart(view);

			case Node2EditPart.VISUAL_ID:
				return new Node2EditPart(view);

			case NodeName2EditPart.VISUAL_ID:
				return new NodeName2EditPart(view);

			case NodeParameterEditPart.VISUAL_ID:
				return new NodeParameterEditPart(view);

			case NodeParameterNameEditPart.VISUAL_ID:
				return new NodeParameterNameEditPart(view);

			case NodePublisherEditPart.VISUAL_ID:
				return new NodePublisherEditPart(view);

			case NodeSubscriberEditPart.VISUAL_ID:
				return new NodeSubscriberEditPart(view);

			case NodeSrvServerEditPart.VISUAL_ID:
				return new NodeSrvServerEditPart(view);

			case NodeSrvClientEditPart.VISUAL_ID:
				return new NodeSrvClientEditPart(view);

			case CompositeEditPart.VISUAL_ID:
				return new CompositeEditPart(view);

			case CompositeNameEditPart.VISUAL_ID:
				return new CompositeNameEditPart(view);

			case CompositePublisherEditPart.VISUAL_ID:
				return new CompositePublisherEditPart(view);

			case CompositeSubscriberEditPart.VISUAL_ID:
				return new CompositeSubscriberEditPart(view);

			case CompositeSrvServerEditPart.VISUAL_ID:
				return new CompositeSrvServerEditPart(view);

			case CompositeSrvClientEditPart.VISUAL_ID:
				return new CompositeSrvClientEditPart(view);

			case Topic2EditPart.VISUAL_ID:
				return new Topic2EditPart(view);

			case TopicName2EditPart.VISUAL_ID:
				return new TopicName2EditPart(view);

			case RobotEndPointEditPart.VISUAL_ID:
				return new RobotEndPointEditPart(view);

			case RobotEndPointNameEditPart.VISUAL_ID:
				return new RobotEndPointNameEditPart(view);

			case EndPointParameterEditPart.VISUAL_ID:
				return new EndPointParameterEditPart(view);

			case EndPointParameterNameEditPart.VISUAL_ID:
				return new EndPointParameterNameEditPart(view);

			case EndPointPublisherEditPart.VISUAL_ID:
				return new EndPointPublisherEditPart(view);

			case EndPointSubscriberEditPart.VISUAL_ID:
				return new EndPointSubscriberEditPart(view);

			case EndPointSrvServerEditPart.VISUAL_ID:
				return new EndPointSrvServerEditPart(view);

			case EndPointSrvClientEditPart.VISUAL_ID:
				return new EndPointSrvClientEditPart(view);

			case NodeEditPart.VISUAL_ID:
				return new NodeEditPart(view);

			case NodeNameEditPart.VISUAL_ID:
				return new NodeNameEditPart(view);

			case NodeParameter2EditPart.VISUAL_ID:
				return new NodeParameter2EditPart(view);

			case NodeParameterName2EditPart.VISUAL_ID:
				return new NodeParameterName2EditPart(view);

			case NodePublisher2EditPart.VISUAL_ID:
				return new NodePublisher2EditPart(view);

			case NodeSubscriber2EditPart.VISUAL_ID:
				return new NodeSubscriber2EditPart(view);

			case NodeSrvServer2EditPart.VISUAL_ID:
				return new NodeSrvServer2EditPart(view);

			case NodeSrvClient2EditPart.VISUAL_ID:
				return new NodeSrvClient2EditPart(view);

			case EnvironmentEndPointEditPart.VISUAL_ID:
				return new EnvironmentEndPointEditPart(view);

			case EnvironmentEndPointNameEditPart.VISUAL_ID:
				return new EnvironmentEndPointNameEditPart(view);

			case EndPointParameter2EditPart.VISUAL_ID:
				return new EndPointParameter2EditPart(view);

			case EndPointParameterName2EditPart.VISUAL_ID:
				return new EndPointParameterName2EditPart(view);

			case EndPointPublisher2EditPart.VISUAL_ID:
				return new EndPointPublisher2EditPart(view);

			case EndPointSubscriber2EditPart.VISUAL_ID:
				return new EndPointSubscriber2EditPart(view);

			case EndPointSrvServer2EditPart.VISUAL_ID:
				return new EndPointSrvServer2EditPart(view);

			case EndPointSrvClient2EditPart.VISUAL_ID:
				return new EndPointSrvClient2EditPart(view);

			case TopicEditPart.VISUAL_ID:
				return new TopicEditPart(view);

			case TopicNameEditPart.VISUAL_ID:
				return new TopicNameEditPart(view);

			case Composite2EditPart.VISUAL_ID:
				return new Composite2EditPart(view);

			case CompositeName2EditPart.VISUAL_ID:
				return new CompositeName2EditPart(view);

			case CompositePublisher2EditPart.VISUAL_ID:
				return new CompositePublisher2EditPart(view);

			case CompositeSubscriber2EditPart.VISUAL_ID:
				return new CompositeSubscriber2EditPart(view);

			case CompositeSrvServer2EditPart.VISUAL_ID:
				return new CompositeSrvServer2EditPart(view);

			case CompositeSrvClient2EditPart.VISUAL_ID:
				return new CompositeSrvClient2EditPart(view);

			case RobotContainerCompositeContainerCompartmentEditPart.VISUAL_ID:
				return new RobotContainerCompositeContainerCompartmentEditPart(
						view);

			case NodePropertiesCompartment2EditPart.VISUAL_ID:
				return new NodePropertiesCompartment2EditPart(view);

			case RobotEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
				return new RobotEndPointEndPointPropertiesCompartmentEditPart(
						view);

			case CloudContainerContainerCompartmentEditPart.VISUAL_ID:
				return new CloudContainerContainerCompartmentEditPart(view);

			case NodePropertiesCompartmentEditPart.VISUAL_ID:
				return new NodePropertiesCompartmentEditPart(view);

			case EnvironmentEndPointEndPointPropertiesCompartmentEditPart.VISUAL_ID:
				return new EnvironmentEndPointEndPointPropertiesCompartmentEditPart(
						view);

			case MsgInterfaceConnectionEditPart.VISUAL_ID:
				return new MsgInterfaceConnectionEditPart(view);

			case MsgInterfaceConnection2EditPart.VISUAL_ID:
				return new MsgInterfaceConnection2EditPart(view);

			case CompositeMsgInterfaceExposedEditPart.VISUAL_ID:
				return new CompositeMsgInterfaceExposedEditPart(view);

			case CompositeMsgInterfaceExposed2EditPart.VISUAL_ID:
				return new CompositeMsgInterfaceExposed2EditPart(view);

			case EndPointSrvConnectionEditPart.VISUAL_ID:
				return new EndPointSrvConnectionEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case EndPointMsgConnectionEditPart.VISUAL_ID:
				return new EndPointMsgConnectionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case CompositeSrvConnectionEditPart.VISUAL_ID:
				return new CompositeSrvConnectionEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ContainerSrvConnectionEditPart.VISUAL_ID:
				return new ContainerSrvConnectionEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

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
