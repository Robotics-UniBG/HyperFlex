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

import it.unibg.robotics.orocoscomponentmodel.AbstractComponent;
import it.unibg.robotics.orocoscomponentmodel.CompInputPort;
import it.unibg.robotics.orocoscomponentmodel.CompOperation;
import it.unibg.robotics.orocoscomponentmodel.CompOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.CompOutputPort;
import it.unibg.robotics.orocoscomponentmodel.Composite;
import it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy;
import it.unibg.robotics.orocoscomponentmodel.InputDataPort;
import it.unibg.robotics.orocoscomponentmodel.Operation;
import it.unibg.robotics.orocoscomponentmodel.OperationCaller;
import it.unibg.robotics.orocoscomponentmodel.OutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.PeersConnection;
import it.unibg.robotics.orocoscomponentmodel.System;
import it.unibg.robotics.orocoscomponentmodel.TCInputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCOperation;
import it.unibg.robotics.orocoscomponentmodel.TCOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCProperty;
import it.unibg.robotics.orocoscomponentmodel.TaskContext;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.parts.TaskContextPropertiesCompartmentEditPart;
import it.unibg.robotics.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class OrocosComponentModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001SemanticChildren(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3001SemanticChildren(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3005SemanticChildren(view);
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getCompositeCompositeContainerCompartment_7001SemanticChildren(view);
		case TaskContextPropertiesCompartmentEditPart.VISUAL_ID:
			return getTaskContextPropertiesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) view.getElement();
		LinkedList<OrocosComponentModelNodeDescriptor> result = new LinkedList<OrocosComponentModelNodeDescriptor>();
		{
			Composite childElement = modelElement.getComposite();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompositeEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getComposite_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelNodeDescriptor> result = new LinkedList<OrocosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			CompInputPort childElement = (CompInputPort) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompInputPort2EditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputPorts().iterator(); it
				.hasNext();) {
			CompOutputPort childElement = (CompOutputPort) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompOutputPort2EditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			CompOperation childElement = (CompOperation) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompOperation2EditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperationCallers().iterator(); it
				.hasNext();) {
			CompOperationCaller childElement = (CompOperationCaller) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompOperationCaller2EditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getTaskContext_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TaskContext modelElement = (TaskContext) view.getElement();
		LinkedList<OrocosComponentModelNodeDescriptor> result = new LinkedList<OrocosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			TCInputDataPort childElement = (TCInputDataPort) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TCInputDataPortEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputPorts().iterator(); it
				.hasNext();) {
			TCOutputDataPort childElement = (TCOutputDataPort) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TCOutputDataPortEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			TCOperation childElement = (TCOperation) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TCOperationEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperationCallers().iterator(); it
				.hasNext();) {
			TCOperationCaller childElement = (TCOperationCaller) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TCOperationCallerEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getComposite_3005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelNodeDescriptor> result = new LinkedList<OrocosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			CompInputPort childElement = (CompInputPort) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompInputPortEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputPorts().iterator(); it
				.hasNext();) {
			CompOutputPort childElement = (CompOutputPort) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompOutputPortEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			CompOperation childElement = (CompOperation) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompOperationEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperationCallers().iterator(); it
				.hasNext();) {
			CompOperationCaller childElement = (CompOperationCaller) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CompOperationCallerEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getCompositeCompositeContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Composite modelElement = (Composite) containerView.getElement();
		LinkedList<OrocosComponentModelNodeDescriptor> result = new LinkedList<OrocosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			AbstractComponent childElement = (AbstractComponent) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TaskContextEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Composite2EditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelNodeDescriptor> getTaskContextPropertiesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TaskContext modelElement = (TaskContext) containerView.getElement();
		LinkedList<OrocosComponentModelNodeDescriptor> result = new LinkedList<OrocosComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it
				.hasNext();) {
			TCProperty childElement = (TCProperty) it.next();
			int visualID = OrocosComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TCPropertyEditPart.VISUAL_ID) {
				result.add(new OrocosComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001ContainedLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3001ContainedLinks(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3002ContainedLinks(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3003ContainedLinks(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3016ContainedLinks(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3010ContainedLinks(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3011ContainedLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3005ContainedLinks(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3006ContainedLinks(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3007ContainedLinks(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3012ContainedLinks(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3013ContainedLinks(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3008ContainedLinks(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3009ContainedLinks(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3014ContainedLinks(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3015ContainedLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001ContainedLinks(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4004ContainedLinks(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4005ContainedLinks(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4007ContainedLinks(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4008ContainedLinks(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001IncomingLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3001IncomingLinks(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3002IncomingLinks(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3003IncomingLinks(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3016IncomingLinks(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3010IncomingLinks(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3011IncomingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3005IncomingLinks(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3006IncomingLinks(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3007IncomingLinks(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3012IncomingLinks(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3013IncomingLinks(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3008IncomingLinks(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3009IncomingLinks(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3014IncomingLinks(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3015IncomingLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001IncomingLinks(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4004IncomingLinks(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4005IncomingLinks(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4007IncomingLinks(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4008IncomingLinks(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (OrocosComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2001OutgoingLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3001OutgoingLinks(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3002OutgoingLinks(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3003OutgoingLinks(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3016OutgoingLinks(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3010OutgoingLinks(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3011OutgoingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3005OutgoingLinks(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3006OutgoingLinks(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3007OutgoingLinks(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3012OutgoingLinks(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3013OutgoingLinks(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3008OutgoingLinks(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3009OutgoingLinks(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3014OutgoingLinks(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3015OutgoingLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001OutgoingLinks(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4004OutgoingLinks(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4005OutgoingLinks(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4007OutgoingLinks(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4008OutgoingLinks(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_2001ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PeersConnection_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTaskContext_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCInputDataPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOutputDataPort_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCProperty_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperation_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperationCaller_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_3005ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PeersConnection_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getConnectionPolicy_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getPeersConnection_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTaskContext_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCInputDataPort_3002IncomingLinks(
			View view) {
		TCInputDataPort modelElement = (TCInputDataPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOutputDataPort_3003IncomingLinks(
			View view) {
		TCOutputDataPort modelElement = (TCOutputDataPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCProperty_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperation_3010IncomingLinks(
			View view) {
		TCOperation modelElement = (TCOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperationCaller_3011IncomingLinks(
			View view) {
		TCOperationCaller modelElement = (TCOperationCaller) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3006IncomingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3007IncomingLinks(
			View view) {
		CompOutputPort modelElement = (CompOutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3012IncomingLinks(
			View view) {
		CompOperation modelElement = (CompOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3013IncomingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3008IncomingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3009IncomingLinks(
			View view) {
		CompOutputPort modelElement = (CompOutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3014IncomingLinks(
			View view) {
		CompOperation modelElement = (CompOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3015IncomingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getConnectionPolicy_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_4004IncomingLinks(
			View view) {
		CompOutputPort modelElement = (CompOutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_4005IncomingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getPeersConnection_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_4008IncomingLinks(
			View view) {
		CompOperation modelElement = (CompOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_4009IncomingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_2001OutgoingLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTaskContext_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCInputDataPort_3002OutgoingLinks(
			View view) {
		TCInputDataPort modelElement = (TCInputDataPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOutputDataPort_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCProperty_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperation_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperationCaller_3011OutgoingLinks(
			View view) {
		TCOperationCaller modelElement = (TCOperationCaller) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_3005OutgoingLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3006OutgoingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3013OutgoingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3008OutgoingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3015OutgoingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getConnectionPolicy_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_4005OutgoingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getPeersConnection_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_4009OutgoingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_ConnectionPolicy_4001(
			Composite container) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getConnectionPolicies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionPolicy) {
				continue;
			}
			ConnectionPolicy link = (ConnectionPolicy) linkObject;
			if (ConnectionPolicyEditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OutputDataPort dst = link.getSource();
			InputDataPort src = link.getTarget();
			result.add(new OrocosComponentModelLinkDescriptor(src, dst, link,
					OrocosComponentModelElementTypes.ConnectionPolicy_4001,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompOutputPort_4004(
			Composite container) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getOutputPorts().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompOutputPort) {
				continue;
			}
			CompOutputPort link = (CompOutputPort) linkObject;
			if (CompOutputPort3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OutputDataPort dst = link.getExposedPort();
			result.add(new OrocosComponentModelLinkDescriptor(container, dst,
					link, OrocosComponentModelElementTypes.CompOutputPort_4004,
					CompOutputPort3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompInputPort_4005(
			Composite container) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getInputPorts().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompInputPort) {
				continue;
			}
			CompInputPort link = (CompInputPort) linkObject;
			if (CompInputPort3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputDataPort dst = link.getExposedPort();
			result.add(new OrocosComponentModelLinkDescriptor(container, dst,
					link, OrocosComponentModelElementTypes.CompInputPort_4005,
					CompInputPort3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_PeersConnection_4007(
			Composite container) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getPeersConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PeersConnection) {
				continue;
			}
			PeersConnection link = (PeersConnection) linkObject;
			if (PeersConnectionEditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operation dst = link.getSource();
			OperationCaller src = link.getTarget();
			result.add(new OrocosComponentModelLinkDescriptor(src, dst, link,
					OrocosComponentModelElementTypes.PeersConnection_4007,
					PeersConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompOperation_4008(
			Composite container) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getOperations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompOperation) {
				continue;
			}
			CompOperation link = (CompOperation) linkObject;
			if (CompOperation3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operation dst = link.getExposedOp();
			result.add(new OrocosComponentModelLinkDescriptor(container, dst,
					link, OrocosComponentModelElementTypes.CompOperation_4008,
					CompOperation3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompOperationCaller_4009(
			Composite container) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getOperationCallers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompOperationCaller) {
				continue;
			}
			CompOperationCaller link = (CompOperationCaller) linkObject;
			if (CompOperationCaller3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OperationCaller dst = link.getExposedOpCaller();
			result.add(new OrocosComponentModelLinkDescriptor(container, dst,
					link,
					OrocosComponentModelElementTypes.CompOperationCaller_4009,
					CompOperationCaller3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
			OutputDataPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getConnectionPolicy_Source()
					|| false == setting.getEObject() instanceof ConnectionPolicy) {
				continue;
			}
			ConnectionPolicy link = (ConnectionPolicy) setting.getEObject();
			if (ConnectionPolicyEditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputDataPort src = link.getTarget();
			result.add(new OrocosComponentModelLinkDescriptor(src, target,
					link,
					OrocosComponentModelElementTypes.ConnectionPolicy_4001,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompOutputPort_4004(
			OutputDataPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOutputPort_ExposedPort()
					|| false == setting.getEObject() instanceof CompOutputPort) {
				continue;
			}
			CompOutputPort link = (CompOutputPort) setting.getEObject();
			if (CompOutputPort3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Composite) {
				continue;
			}
			Composite container = (Composite) link.eContainer();
			result.add(new OrocosComponentModelLinkDescriptor(container,
					target, link,
					OrocosComponentModelElementTypes.CompOutputPort_4004,
					CompOutputPort3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompInputPort_4005(
			InputDataPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompInputPort_ExposedPort()
					|| false == setting.getEObject() instanceof CompInputPort) {
				continue;
			}
			CompInputPort link = (CompInputPort) setting.getEObject();
			if (CompInputPort3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Composite) {
				continue;
			}
			Composite container = (Composite) link.eContainer();
			result.add(new OrocosComponentModelLinkDescriptor(container,
					target, link,
					OrocosComponentModelElementTypes.CompInputPort_4005,
					CompInputPort3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_PeersConnection_4007(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getPeersConnection_Source()
					|| false == setting.getEObject() instanceof PeersConnection) {
				continue;
			}
			PeersConnection link = (PeersConnection) setting.getEObject();
			if (PeersConnectionEditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OperationCaller src = link.getTarget();
			result.add(new OrocosComponentModelLinkDescriptor(src, target,
					link,
					OrocosComponentModelElementTypes.PeersConnection_4007,
					PeersConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompOperation_4008(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOperation_ExposedOp()
					|| false == setting.getEObject() instanceof CompOperation) {
				continue;
			}
			CompOperation link = (CompOperation) setting.getEObject();
			if (CompOperation3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Composite) {
				continue;
			}
			Composite container = (Composite) link.eContainer();
			result.add(new OrocosComponentModelLinkDescriptor(container,
					target, link,
					OrocosComponentModelElementTypes.CompOperation_4008,
					CompOperation3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompOperationCaller_4009(
			OperationCaller target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != it.unibg.robotics.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
					.getCompOperationCaller_ExposedOpCaller()
					|| false == setting.getEObject() instanceof CompOperationCaller) {
				continue;
			}
			CompOperationCaller link = (CompOperationCaller) setting
					.getEObject();
			if (CompOperationCaller3EditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Composite) {
				continue;
			}
			Composite container = (Composite) link.eContainer();
			result.add(new OrocosComponentModelLinkDescriptor(container,
					target, link,
					OrocosComponentModelElementTypes.CompOperationCaller_4009,
					CompOperationCaller3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(
			InputDataPort source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getConnectionPolicies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionPolicy) {
				continue;
			}
			ConnectionPolicy link = (ConnectionPolicy) linkObject;
			if (ConnectionPolicyEditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OutputDataPort dst = link.getSource();
			InputDataPort src = link.getTarget();
			if (src != source) {
				continue;
			}
			result.add(new OrocosComponentModelLinkDescriptor(src, dst, link,
					OrocosComponentModelElementTypes.ConnectionPolicy_4001,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_PeersConnection_4007(
			OperationCaller source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getPeersConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PeersConnection) {
				continue;
			}
			PeersConnection link = (PeersConnection) linkObject;
			if (PeersConnectionEditPart.VISUAL_ID != OrocosComponentModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operation dst = link.getSource();
			OperationCaller src = link.getTarget();
			if (src != source) {
				continue;
			}
			result.add(new OrocosComponentModelLinkDescriptor(src, dst, link,
					OrocosComponentModelElementTypes.PeersConnection_4007,
					PeersConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<OrocosComponentModelNodeDescriptor> getSemanticChildren(
				View view) {
			return OrocosComponentModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<OrocosComponentModelLinkDescriptor> getContainedLinks(
				View view) {
			return OrocosComponentModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<OrocosComponentModelLinkDescriptor> getIncomingLinks(
				View view) {
			return OrocosComponentModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<OrocosComponentModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return OrocosComponentModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
