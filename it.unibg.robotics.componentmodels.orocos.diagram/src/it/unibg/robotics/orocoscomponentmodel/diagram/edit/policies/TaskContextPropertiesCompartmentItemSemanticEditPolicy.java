/*
 * Variability Analysis And Resolution Plugins (VARP)
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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package it.unibg.robotics.orocoscomponentmodel.diagram.edit.policies;

import it.unibg.robotics.orocoscomponentmodel.diagram.edit.commands.NodePropertyCreateCommand;
import it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TaskContextPropertiesCompartmentItemSemanticEditPolicy extends
		OrocosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskContextPropertiesCompartmentItemSemanticEditPolicy() {
		super(OrocosComponentModelElementTypes.TaskContext_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OrocosComponentModelElementTypes.NodeProperty_3004 == req
				.getElementType()) {
			return getGEFWrapper(new NodePropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
