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
import org.hyperflex.rapyutacomponentmodel.diagram.edit.commands.EndPointParameterCreateCommand;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class RobotEndPointEndPointPropertiesCompartmentItemSemanticEditPolicy
		extends RapyutaComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RobotEndPointEndPointPropertiesCompartmentItemSemanticEditPolicy() {
		super(RapyutaComponentModelElementTypes.RobotEndPoint_3077);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RapyutaComponentModelElementTypes.EndPointParameter_3058 == req
				.getElementType()) {
			return getGEFWrapper(new EndPointParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
