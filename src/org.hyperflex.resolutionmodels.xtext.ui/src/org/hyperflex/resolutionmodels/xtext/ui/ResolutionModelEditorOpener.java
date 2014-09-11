package org.hyperflex.resolutionmodels.xtext.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.hyperflex.resolutionmodels.presentation.resolutionmodelsEditor;

public class ResolutionModelEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	resolutionmodelsEditor resolutionModelEditor = (resolutionmodelsEditor) openEditor.getAdapter(resolutionmodelsEditor.class);
        if (resolutionModelEditor != null) {
            EObject eObject = resolutionModelEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            resolutionModelEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
