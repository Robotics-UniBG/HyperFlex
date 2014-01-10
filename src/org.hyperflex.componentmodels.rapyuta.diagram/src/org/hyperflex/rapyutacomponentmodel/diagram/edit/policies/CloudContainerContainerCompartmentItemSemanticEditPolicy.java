/*
 * HyperFlex Toolchain
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
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.EnvironmentEndPointCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.NodeCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.TopicCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class CloudContainerContainerCompartmentItemSemanticEditPolicy extends
		RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CloudContainerContainerCompartmentItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.CloudContainer_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RapyutaComponentModelElementTypes.Node_3078 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.EnvironmentEndPoint_3079 == req
				.getElementType()) {
			return getGEFWrapper(new EnvironmentEndPointCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.Topic_3080 == req
				.getElementType()) {
			return getGEFWrapper(new TopicCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
