/*
 * HyperFlex toolchain
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
package org.hyperflex.roscomponentmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.hyperflex.roscomponentmodel.diagram.edit.commands.Composite2CreateCommand;
import org.hyperflex.roscomponentmodel.diagram.edit.commands.NodeCreateCommand;
import org.hyperflex.roscomponentmodel.diagram.edit.commands.TopicCreateCommand;
import org.hyperflex.roscomponentmodel.diagram.providers.RosComponentModelElementTypes;

/**
 * @generated
 */
public class CompositeCompositeContainerCompartmentItemSemanticEditPolicy
		extends RosComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeCompositeContainerCompartmentItemSemanticEditPolicy() {
		super(RosComponentModelElementTypes.Composite_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RosComponentModelElementTypes.Node_3001 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (RosComponentModelElementTypes.Composite_3007 == req
				.getElementType()) {
			return getGEFWrapper(new Composite2CreateCommand(req));
		}
		if (RosComponentModelElementTypes.Topic_3014 == req.getElementType()) {
			return getGEFWrapper(new TopicCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
