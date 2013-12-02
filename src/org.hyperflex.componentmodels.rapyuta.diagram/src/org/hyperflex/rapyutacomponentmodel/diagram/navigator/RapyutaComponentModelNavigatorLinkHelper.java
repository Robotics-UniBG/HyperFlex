/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.diagram.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.navigator.ILinkHelper;
import org.eclipse.ui.part.FileEditorInput;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class RapyutaComponentModelNavigatorLinkHelper implements ILinkHelper {

	/**
	 * @generated
	 */
	private static IEditorInput getEditorInput(Diagram diagram) {
		Resource diagramResource = diagram.eResource();
		for (EObject nextEObject : diagramResource.getContents()) {
			if (nextEObject == diagram) {
				return new FileEditorInput(
						WorkspaceSynchronizer.getFile(diagramResource));
			}
			if (nextEObject instanceof Diagram) {
				break;
			}
		}
		URI uri = EcoreUtil.getURI(diagram);
		String editorName = uri.lastSegment() + '#'
				+ diagram.eResource().getContents().indexOf(diagram);
		IEditorInput editorInput = new URIEditorInput(uri, editorName);
		return editorInput;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection findSelection(IEditorInput anInput) {
		IDiagramDocument document = RapyutaComponentModelDiagramEditorPlugin
				.getInstance().getDocumentProvider()
				.getDiagramDocument(anInput);
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		if (diagram == null || diagram.eResource() == null) {
			return StructuredSelection.EMPTY;
		}
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			RapyutaComponentModelNavigatorItem item = new RapyutaComponentModelNavigatorItem(
					diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	public void activateEditor(IWorkbenchPage aPage,
			IStructuredSelection aSelection) {
		if (aSelection == null || aSelection.isEmpty()) {
			return;
		}
		if (false == aSelection.getFirstElement() instanceof RapyutaComponentModelAbstractNavigatorItem) {
			return;
		}

		RapyutaComponentModelAbstractNavigatorItem abstractNavigatorItem = (RapyutaComponentModelAbstractNavigatorItem) aSelection
				.getFirstElement();
		View navigatorView = null;
		if (abstractNavigatorItem instanceof RapyutaComponentModelNavigatorItem) {
			navigatorView = ((RapyutaComponentModelNavigatorItem) abstractNavigatorItem)
					.getView();
		} else if (abstractNavigatorItem instanceof RapyutaComponentModelNavigatorGroup) {
			RapyutaComponentModelNavigatorGroup navigatorGroup = (RapyutaComponentModelNavigatorGroup) abstractNavigatorItem;
			if (navigatorGroup.getParent() instanceof RapyutaComponentModelNavigatorItem) {
				navigatorView = ((RapyutaComponentModelNavigatorItem) navigatorGroup
						.getParent()).getView();
			}
		}
		if (navigatorView == null) {
			return;
		}
		IEditorInput editorInput = getEditorInput(navigatorView.getDiagram());
		IEditorPart editor = aPage.findEditor(editorInput);
		if (editor == null) {
			return;
		}
		aPage.bringToTop(editor);
		if (editor instanceof DiagramEditor) {
			DiagramEditor diagramEditor = (DiagramEditor) editor;
			ResourceSet diagramEditorResourceSet = diagramEditor
					.getEditingDomain().getResourceSet();
			EObject selectedView = diagramEditorResourceSet.getEObject(
					EcoreUtil.getURI(navigatorView), true);
			if (selectedView == null) {
				return;
			}
			GraphicalViewer graphicalViewer = (GraphicalViewer) diagramEditor
					.getAdapter(GraphicalViewer.class);
			EditPart selectedEditPart = (EditPart) graphicalViewer
					.getEditPartRegistry().get(selectedView);
			if (selectedEditPart != null) {
				graphicalViewer.select(selectedEditPart);
			}
		}
	}

}
