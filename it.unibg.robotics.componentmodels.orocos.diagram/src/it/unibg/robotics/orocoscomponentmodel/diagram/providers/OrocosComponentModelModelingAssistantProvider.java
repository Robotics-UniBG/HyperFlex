/*
 * Variability Analysis And Resolution Plugins (VARP)
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
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
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
package it.unibg.robotics.orocoscomponentmodel.diagram.providers;

import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.Messages;
import it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelDiagramEditorPlugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class OrocosComponentModelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(OrocosComponentModelElementTypes.Composite_2001);
			return types;
		}
		if (editPart instanceof CompositeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(OrocosComponentModelElementTypes.CompInputPort_3008);
			types.add(OrocosComponentModelElementTypes.CompOutputPort_3009);
			types.add(OrocosComponentModelElementTypes.CompOperation_3014);
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_3015);
			return types;
		}
		if (editPart instanceof TaskContextEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(OrocosComponentModelElementTypes.TCInputDataPort_3002);
			types.add(OrocosComponentModelElementTypes.TCOutputDataPort_3003);
			types.add(OrocosComponentModelElementTypes.TCOperation_3010);
			types.add(OrocosComponentModelElementTypes.TCOperationCaller_3011);
			types.add(OrocosComponentModelElementTypes.TCProperty_3016);
			return types;
		}
		if (editPart instanceof Composite2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(OrocosComponentModelElementTypes.CompInputPort_3006);
			types.add(OrocosComponentModelElementTypes.CompOutputPort_3007);
			types.add(OrocosComponentModelElementTypes.CompOperation_3012);
			types.add(OrocosComponentModelElementTypes.CompOperationCaller_3013);
			return types;
		}
		if (editPart instanceof CompositeCompositeContainerCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(OrocosComponentModelElementTypes.TaskContext_3001);
			types.add(OrocosComponentModelElementTypes.Composite_3005);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompositeEditPart) {
			return ((CompositeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TCInputDataPortEditPart) {
			return ((TCInputDataPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TCOperationCallerEditPart) {
			return ((TCOperationCallerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Composite2EditPart) {
			return ((Composite2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompInputPortEditPart) {
			return ((CompInputPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompOperationCallerEditPart) {
			return ((CompOperationCallerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompInputPort2EditPart) {
			return ((CompInputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompOperationCaller2EditPart) {
			return ((CompOperationCaller2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof TCInputDataPortEditPart) {
			return ((TCInputDataPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TCOutputDataPortEditPart) {
			return ((TCOutputDataPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TCOperationEditPart) {
			return ((TCOperationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TCOperationCallerEditPart) {
			return ((TCOperationCallerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompInputPortEditPart) {
			return ((CompInputPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompOutputPortEditPart) {
			return ((CompOutputPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompOperationEditPart) {
			return ((CompOperationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompOperationCallerEditPart) {
			return ((CompOperationCallerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompInputPort2EditPart) {
			return ((CompInputPort2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompOutputPort2EditPart) {
			return ((CompOutputPort2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompOperation2EditPart) {
			return ((CompOperation2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompOperationCaller2EditPart) {
			return ((CompOperationCaller2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompositeEditPart) {
			return ((CompositeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TCInputDataPortEditPart) {
			return ((TCInputDataPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TCOperationCallerEditPart) {
			return ((TCOperationCallerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Composite2EditPart) {
			return ((Composite2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompInputPortEditPart) {
			return ((CompInputPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompOperationCallerEditPart) {
			return ((CompOperationCallerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompInputPort2EditPart) {
			return ((CompInputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompOperationCaller2EditPart) {
			return ((CompOperationCaller2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof TCInputDataPortEditPart) {
			return ((TCInputDataPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TCOutputDataPortEditPart) {
			return ((TCOutputDataPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TCOperationEditPart) {
			return ((TCOperationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TCOperationCallerEditPart) {
			return ((TCOperationCallerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompInputPortEditPart) {
			return ((CompInputPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompOutputPortEditPart) {
			return ((CompOutputPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompOperationEditPart) {
			return ((CompOperationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompOperationCallerEditPart) {
			return ((CompOperationCallerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompInputPort2EditPart) {
			return ((CompInputPort2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompOutputPort2EditPart) {
			return ((CompOutputPort2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompOperation2EditPart) {
			return ((CompOperation2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompOperationCaller2EditPart) {
			return ((CompOperationCaller2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompositeEditPart) {
			return ((CompositeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TCInputDataPortEditPart) {
			return ((TCInputDataPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TCOperationCallerEditPart) {
			return ((TCOperationCallerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Composite2EditPart) {
			return ((Composite2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompInputPortEditPart) {
			return ((CompInputPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompOperationCallerEditPart) {
			return ((CompOperationCallerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompInputPort2EditPart) {
			return ((CompInputPort2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompOperationCaller2EditPart) {
			return ((CompOperationCaller2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				OrocosComponentModelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.OrocosComponentModelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.OrocosComponentModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
