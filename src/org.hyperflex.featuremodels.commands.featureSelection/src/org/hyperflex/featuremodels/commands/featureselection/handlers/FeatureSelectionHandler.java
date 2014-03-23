/**
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
package org.hyperflex.featuremodels.commands.featureselection.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.featuremodels.diagram.edit.parts.Feature2EditPart;
import org.hyperflex.featuremodels.diagram.part.FeatureModelDiagramEditor;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class FeatureSelectionHandler extends AbstractHandler {
	
	private Feature2EditPart featureEditPart;
	private Feature feature;
	private Instance instance;
	
	/**
	 * The constructor.
	 */
	public FeatureSelectionHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		FeatureModelDiagramEditor featureEditor = null;
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		if(activeEditor instanceof FeatureModelDiagramEditor){
			featureEditor = (FeatureModelDiagramEditor)activeEditor;
			StructuredSelection structSelect = (StructuredSelection)featureEditor.getSite().getSelectionProvider().getSelection();
			if(structSelect.getFirstElement() instanceof Feature2EditPart){
				featureEditPart = (Feature2EditPart)structSelect.getFirstElement();
				feature = featureEditPart.getFeature();
				//FeatureModel model = featureEditPart.getFeatureModel();
				instance = featureEditPart.getFeatureModel().getSelectedInstance();
				if(instance == null){
					MessageDialog.openWarning(window.getShell(), "Warning", 
					"You have to select an instance!!!");
					return null;
				}
				if(instance.getSelectedFeatures().contains(feature)){
					return null;
				}
				TransactionalEditingDomain editingDomain = featureEditor.getEditingDomain();
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain){
					@Override
					protected void doExecute() {
//						instance.getSelectedFeatures().add(feature);
						featureEditPart.getFeatureModel().addFeatureToInstance(instance, feature);
						//featureEditPart.getPrimaryShape().updateColor();
					}
				});

			}
		}

//		MessageDialog.openInformation(
//				window.getShell(),
//				"Feature Selection",
//				"Feature Selected");
		return null;
	}
}
