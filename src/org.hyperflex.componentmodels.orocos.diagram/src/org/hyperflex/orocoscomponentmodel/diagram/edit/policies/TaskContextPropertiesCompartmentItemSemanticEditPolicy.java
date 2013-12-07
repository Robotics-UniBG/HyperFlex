/*
 * HyperFlex Plugins
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
package org.hyperflex.orocoscomponentmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.hyperflex.orocoscomponentmodel.diagram.edit.commands.TCPropertyCreateCommand;
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

/**
 * @generated
 */
public class TaskContextPropertiesCompartmentItemSemanticEditPolicy extends
		OrocosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskContextPropertiesCompartmentItemSemanticEditPolicy() {
		super(OrocosComponentModelElementTypes.TaskContext_3017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OrocosComponentModelElementTypes.TCProperty_3020 == req
				.getElementType()) {
			return getGEFWrapper(new TCPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
