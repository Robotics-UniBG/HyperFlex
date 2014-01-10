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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.CompositeCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.Node2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.RobotEndPointCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.Topic2CreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class RobotContainerCompositeContainerCompartmentItemSemanticEditPolicy
		extends RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RobotContainerCompositeContainerCompartmentItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.RobotContainer_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RapyutaComponentModelElementTypes.Node_3063 == req.getElementType()) {
			return getGEFWrapper(new Node2CreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.Composite_3076 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeCreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.Topic_3075 == req
				.getElementType()) {
			return getGEFWrapper(new Topic2CreateCommand(req));
		}
		if (RapyutaComponentModelElementTypes.RobotEndPoint_3077 == req
				.getElementType()) {
			return getGEFWrapper(new RobotEndPointCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
