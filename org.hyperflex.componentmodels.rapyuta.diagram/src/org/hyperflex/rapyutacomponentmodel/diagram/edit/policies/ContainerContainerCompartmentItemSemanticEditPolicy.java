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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.EnvironmentEndPointCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.Node2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.Topic2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class ContainerContainerCompartmentItemSemanticEditPolicy extends
		RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContainerContainerCompartmentItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.Container_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RapyutaComponentModelElementTypes.Node_3040 == req.getElementType()) {
			return getGEFWrapper(new Node2CreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.EnvironmentEndPoint_3039 == req
				.getElementType()) {
			return getGEFWrapper(new EnvironmentEndPointCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.Topic_3035 == req
				.getElementType()) {
			return getGEFWrapper(new Topic2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
