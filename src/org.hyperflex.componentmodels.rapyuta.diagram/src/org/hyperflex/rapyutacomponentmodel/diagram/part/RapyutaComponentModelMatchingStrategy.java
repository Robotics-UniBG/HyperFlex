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
package org.hyperflex.rapyutacomponentmodel.diagram.part;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class RapyutaComponentModelMatchingStrategy implements
		IEditorMatchingStrategy {

	/**
	 * @generated
	 */
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		IEditorInput editorInput;
		try {
			editorInput = editorRef.getEditorInput();
		} catch (PartInitException e) {
			return false;
		}

		if (editorInput.equals(input)) {
			return true;
		}
		if (editorInput instanceof URIEditorInput
				&& input instanceof URIEditorInput) {
			return ((URIEditorInput) editorInput).getURI().equals(
					((URIEditorInput) input).getURI());
		}
		return false;
	}

}
