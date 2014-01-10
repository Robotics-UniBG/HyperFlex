/*
 * HyperFlex Plugins
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
package org.hyperflex.orocoscomponentmodel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.OrocosComponentModelEditPartFactory;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class OrocosComponentModelEditPartProvider extends
		DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public OrocosComponentModelEditPartProvider() {
		super(new OrocosComponentModelEditPartFactory(),
				OrocosComponentModelVisualIDRegistry.TYPED_INSTANCE,
				SystemEditPart.MODEL_ID);
	}

}
