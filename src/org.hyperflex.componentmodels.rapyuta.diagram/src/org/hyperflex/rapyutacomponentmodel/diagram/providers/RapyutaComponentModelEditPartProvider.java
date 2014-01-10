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
package org.hyperflex.rapyutacomponentmodel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.RapyutaComponentModelEditPartFactory;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class RapyutaComponentModelEditPartProvider extends
		DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public RapyutaComponentModelEditPartProvider() {
		super(new RapyutaComponentModelEditPartFactory(),
				RapyutaComponentModelVisualIDRegistry.TYPED_INSTANCE,
				SystemEditPart.MODEL_ID);
	}

}
