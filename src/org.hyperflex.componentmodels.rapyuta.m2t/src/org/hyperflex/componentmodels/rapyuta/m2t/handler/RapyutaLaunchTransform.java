/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
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
package org.hyperflex.componentmodels.rapyuta.m2t.handler;

import java.io.IOException;
import java.net.URL;

import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;
import org.best_of_robotics.transform.service.parameter.TransformParameterFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.hyperflex.componentmodels.m2t.EGLTransformer;
import org.hyperflex.componentmodels.rapyuta.m2t.Activator;

public class RapyutaLaunchTransform extends AbstractHandler {
	
	public RapyutaLaunchTransform() {	
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile sourcefile = null;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
            IEditorInput input = editor.getEditorInput();
            if (input instanceof IFileEditorInput) {
            	sourcefile = ((IFileEditorInput)input).getFile();
            	System.out.println("File from editor: " + sourcefile.getLocation().toOSString());
            	if(sourcefile.getFileExtension().compareTo("rapyutacomponentmodel") != 0 && sourcefile.getFileExtension().compareTo("rapyutacomponentmodel_diagram")!=0)
            	{
            		sourcefile = null;
            		MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error on Editor Selection 2",
							"Please select the editor from which you want to generate code and execute command again.");
            	}
                
            }
            
        }
		
				
		if(sourcefile == null)
			return null;
		
	    
		URL url = Platform.getBundle(Activator.PLUGIN_ID).getEntry("epsilon/main.egl");
	    String fileURL = "";
		try {
			fileURL = FileLocator.toFileURL(url).toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		System.out.println("Taking transformation: " + fileURL );
		
		IEglTransformParameter eglTransformParameter = TransformParameterFactory.createEglTransformParameter();
		eglTransformParameter.setTransformName("Rapyuta System to roslaunch implementation");
		eglTransformParameter.setEglTransform(fileURL);
		eglTransformParameter.setPluginID(Activator.PLUGIN_ID);
		eglTransformParameter.setSourceMetaModelURI("http://www.hyperflex.org/componentmodels.rapyuta");
		eglTransformParameter.setSourceModelFilePath(sourcefile.getLocation().removeFileExtension().toOSString() + ".rapyutacomponentmodel");
		eglTransformParameter.setSourceName("Source");
		eglTransformParameter.setSourceReadOnLoad(true);
		eglTransformParameter.setSourceStoreOnDisposal(false);
		
		eglTransformParameter.setOutputRoot("file:" + sourcefile.getProject().getLocation().toOSString());
		
		//get transform service
		
		
		//do transform
		EGLTransformer transformer = new EGLTransformer(eglTransformParameter);
		transformer.transform();
		
		
		
		return null;
	}

}
