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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.Composite2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.NodeCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.RobotEndPointCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.TopicCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class CompositeCompositeContainerCompartmentItemSemanticEditPolicy
		extends RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeCompositeContainerCompartmentItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.Composite_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RapyutaComponentModelElementTypes.Node_3041 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.Composite_3047 == req
				.getElementType()) {
			return getGEFWrapper(new Composite2CreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.Topic_3056 == req
				.getElementType()) {
			return getGEFWrapper(new TopicCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.RobotEndPoint_3057 == req
				.getElementType()) {
			return getGEFWrapper(new RobotEndPointCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
