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
package it.unibg.robotics.orocoscomponentmodel.diagram.part;

import it.unibg.robotics.orocoscomponentmodel.System;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeName2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextNameEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextPropertiesCompartmentEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OrocosComponentModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "it.unibg.robotics.componentmodels.orocos.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemEditPart.MODEL_ID.equals(view.getType())) {
				return SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				OrocosComponentModelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getSystem().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((System) domainElement)) {
			return SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return CompositeEditPart.VISUAL_ID;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompInputPort().isSuperTypeOf(domainElement.eClass())) {
				return CompInputPort2EditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return CompOutputPort2EditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOperation().isSuperTypeOf(domainElement.eClass())) {
				return CompOperation2EditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOperationCaller().isSuperTypeOf(
							domainElement.eClass())) {
				return CompOperationCaller2EditPart.VISUAL_ID;
			}
			break;
		case TaskContextEditPart.VISUAL_ID:
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getTCInputDataPort().isSuperTypeOf(domainElement.eClass())) {
				return TCInputDataPortEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getTCOutputDataPort()
					.isSuperTypeOf(domainElement.eClass())) {
				return TCOutputDataPortEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getTCOperation().isSuperTypeOf(domainElement.eClass())) {
				return TCOperationEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getTCOperationCaller().isSuperTypeOf(
							domainElement.eClass())) {
				return TCOperationCallerEditPart.VISUAL_ID;
			}
			break;
		case Composite2EditPart.VISUAL_ID:
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompInputPort().isSuperTypeOf(domainElement.eClass())) {
				return CompInputPortEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return CompOutputPortEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOperation().isSuperTypeOf(domainElement.eClass())) {
				return CompOperationEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOperationCaller().isSuperTypeOf(
							domainElement.eClass())) {
				return CompOperationCallerEditPart.VISUAL_ID;
			}
			break;
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getTaskContext().isSuperTypeOf(domainElement.eClass())) {
				return TaskContextEditPart.VISUAL_ID;
			}
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return Composite2EditPart.VISUAL_ID;
			}
			break;
		case TaskContextPropertiesCompartmentEditPart.VISUAL_ID:
			if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getTCProperty().isSuperTypeOf(domainElement.eClass())) {
				return TCPropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (CompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (CompositeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeCompositeContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompOperation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompOperationCaller2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskContextEditPart.VISUAL_ID:
			if (TaskContextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskContextPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TCInputDataPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TCOutputDataPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TCOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TCOperationCallerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TCPropertyEditPart.VISUAL_ID:
			if (TCPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Composite2EditPart.VISUAL_ID:
			if (CompositeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompOperationCallerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			if (TaskContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Composite2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskContextPropertiesCompartmentEditPart.VISUAL_ID:
			if (TCPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionPolicyEditPart.VISUAL_ID:
			if (ConnectionPolicyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompOutputPort3EditPart.VISUAL_ID:
			if (CompOutputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompInputPort3EditPart.VISUAL_ID:
			if (CompInputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PeersConnectionEditPart.VISUAL_ID:
			if (PeersConnectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompOperation3EditPart.VISUAL_ID:
			if (CompOperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompOperationCaller3EditPart.VISUAL_ID:
			if (CompOperationCallerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getConnectionPolicy().isSuperTypeOf(domainElement.eClass())) {
			return ConnectionPolicyEditPart.VISUAL_ID;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getCompOutputPort().isSuperTypeOf(domainElement.eClass())) {
			return CompOutputPort3EditPart.VISUAL_ID;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getCompInputPort().isSuperTypeOf(domainElement.eClass())) {
			return CompInputPort3EditPart.VISUAL_ID;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getPeersConnection().isSuperTypeOf(domainElement.eClass())) {
			return PeersConnectionEditPart.VISUAL_ID;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getCompOperation().isSuperTypeOf(domainElement.eClass())) {
			return CompOperation3EditPart.VISUAL_ID;
		}
		if (it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
				.getCompOperationCaller().isSuperTypeOf(domainElement.eClass())) {
			return CompOperationCaller3EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(System element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
		case TaskContextPropertiesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return false;
		case TCInputDataPortEditPart.VISUAL_ID:
		case TCOutputDataPortEditPart.VISUAL_ID:
		case CompInputPortEditPart.VISUAL_ID:
		case CompOutputPortEditPart.VISUAL_ID:
		case CompInputPort2EditPart.VISUAL_ID:
		case CompOutputPort2EditPart.VISUAL_ID:
		case TCOperationEditPart.VISUAL_ID:
		case TCOperationCallerEditPart.VISUAL_ID:
		case CompOperationEditPart.VISUAL_ID:
		case CompOperationCallerEditPart.VISUAL_ID:
		case CompOperation2EditPart.VISUAL_ID:
		case CompOperationCaller2EditPart.VISUAL_ID:
		case TCPropertyEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return it.unibg.robotics.orocoscomponentmodel.diagram.part.OrocosComponentModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
