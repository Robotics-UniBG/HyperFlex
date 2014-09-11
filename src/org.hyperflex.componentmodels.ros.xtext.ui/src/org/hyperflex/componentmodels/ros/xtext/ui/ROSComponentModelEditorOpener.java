package org.hyperflex.componentmodels.ros.xtext.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.hyperflex.roscomponentmodel.presentation.roscomponentmodelEditor;

public class ROSComponentModelEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	roscomponentmodelEditor rosComponentModelEditor = (roscomponentmodelEditor) openEditor.getAdapter(roscomponentmodelEditor.class);
        if (rosComponentModelEditor != null) {
            EObject eObject = rosComponentModelEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            rosComponentModelEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
