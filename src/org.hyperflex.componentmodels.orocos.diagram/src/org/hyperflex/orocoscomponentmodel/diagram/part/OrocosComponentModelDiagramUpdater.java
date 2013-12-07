/*
 * HyperFlex Plugins
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
package org.hyperflex.orocoscomponentmodel.diagram.part;

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
import org.hyperflex.orocoscomponentmodel.AbstractComponent;
import org.hyperflex.orocoscomponentmodel.CompInputPort;
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.CompOutputPort;
import org.hyperflex.orocoscomponentmodel.Composite;
import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.InputDataPort;
import org.hyperflex.orocoscomponentmodel.Operation;
import org.hyperflex.orocoscomponentmodel.OperationCaller;
import org.hyperflex.orocoscomponentmodel.OutputDataPort;
import org.hyperflex.orocoscomponentmodel.PeersConnection;
import org.hyperflex.orocoscomponentmodel.System;
import org.hyperflex.orocoscomponentmodel.TCInputDataPort;
import org.hyperflex.orocoscomponentmodel.TCOperation;
import org.hyperflex.orocoscomponentmodel.TCOperationCaller;
import org.hyperflex.orocoscomponentmodel.TCOutputDataPort;
import org.hyperflex.orocoscomponentmodel.TCProperty;
import org.hyperflex.orocoscomponentmodel.TaskContext;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompInputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperation3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCaller3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPort3EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompOutputPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.Composite2EditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeCompositeContainerCompartmentEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.CompositeEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.ConnectionPolicyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.PeersConnectionEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCInputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationCallerEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOperationEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCOutputDataPortEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TCPropertyEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.edit.parts.TaskContextPropertiesCompartmentEditPart;
import org.hyperflex.orocoscomponentmodel.diagram.providers.OrocosComponentModelElementTypes;

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
			return getComposite_2002SemanticChildren(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3017SemanticChildren(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3023SemanticChildren(view);
		case CompositeCompositeContainerCompartmentEditPart.VISUAL_ID:
			return getCompositeCompositeContainerCompartment_7003SemanticChildren(view);
		case TaskContextPropertiesCompartmentEditPart.VISUAL_ID:
			return getTaskContextPropertiesCompartment_7004SemanticChildren(view);
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
	public static List<OrocosComponentModelNodeDescriptor> getComposite_2002SemanticChildren(
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
	public static List<OrocosComponentModelNodeDescriptor> getTaskContext_3017SemanticChildren(
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
	public static List<OrocosComponentModelNodeDescriptor> getComposite_3023SemanticChildren(
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
	public static List<OrocosComponentModelNodeDescriptor> getCompositeCompositeContainerCompartment_7003SemanticChildren(
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
	public static List<OrocosComponentModelNodeDescriptor> getTaskContextPropertiesCompartment_7004SemanticChildren(
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
			return getComposite_2002ContainedLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3017ContainedLinks(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3018ContainedLinks(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3019ContainedLinks(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3020ContainedLinks(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3021ContainedLinks(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3022ContainedLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3023ContainedLinks(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3024ContainedLinks(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3025ContainedLinks(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3026ContainedLinks(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3027ContainedLinks(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3028ContainedLinks(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3029ContainedLinks(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3030ContainedLinks(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3031ContainedLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4010ContainedLinks(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4011ContainedLinks(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4012ContainedLinks(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4013ContainedLinks(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4014ContainedLinks(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4015ContainedLinks(view);
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
			return getComposite_2002IncomingLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3017IncomingLinks(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3018IncomingLinks(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3019IncomingLinks(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3020IncomingLinks(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3021IncomingLinks(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3022IncomingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3023IncomingLinks(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3024IncomingLinks(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3025IncomingLinks(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3026IncomingLinks(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3027IncomingLinks(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3028IncomingLinks(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3029IncomingLinks(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3030IncomingLinks(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3031IncomingLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4010IncomingLinks(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4011IncomingLinks(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4012IncomingLinks(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4013IncomingLinks(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4014IncomingLinks(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4015IncomingLinks(view);
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
			return getComposite_2002OutgoingLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_3017OutgoingLinks(view);
		case TCInputDataPortEditPart.VISUAL_ID:
			return getTCInputDataPort_3018OutgoingLinks(view);
		case TCOutputDataPortEditPart.VISUAL_ID:
			return getTCOutputDataPort_3019OutgoingLinks(view);
		case TCPropertyEditPart.VISUAL_ID:
			return getTCProperty_3020OutgoingLinks(view);
		case TCOperationEditPart.VISUAL_ID:
			return getTCOperation_3021OutgoingLinks(view);
		case TCOperationCallerEditPart.VISUAL_ID:
			return getTCOperationCaller_3022OutgoingLinks(view);
		case Composite2EditPart.VISUAL_ID:
			return getComposite_3023OutgoingLinks(view);
		case CompInputPortEditPart.VISUAL_ID:
			return getCompInputPort_3024OutgoingLinks(view);
		case CompOutputPortEditPart.VISUAL_ID:
			return getCompOutputPort_3025OutgoingLinks(view);
		case CompOperationEditPart.VISUAL_ID:
			return getCompOperation_3026OutgoingLinks(view);
		case CompOperationCallerEditPart.VISUAL_ID:
			return getCompOperationCaller_3027OutgoingLinks(view);
		case CompInputPort2EditPart.VISUAL_ID:
			return getCompInputPort_3028OutgoingLinks(view);
		case CompOutputPort2EditPart.VISUAL_ID:
			return getCompOutputPort_3029OutgoingLinks(view);
		case CompOperation2EditPart.VISUAL_ID:
			return getCompOperation_3030OutgoingLinks(view);
		case CompOperationCaller2EditPart.VISUAL_ID:
			return getCompOperationCaller_3031OutgoingLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4010OutgoingLinks(view);
		case CompOutputPort3EditPart.VISUAL_ID:
			return getCompOutputPort_4011OutgoingLinks(view);
		case CompInputPort3EditPart.VISUAL_ID:
			return getCompInputPort_4012OutgoingLinks(view);
		case PeersConnectionEditPart.VISUAL_ID:
			return getPeersConnection_4013OutgoingLinks(view);
		case CompOperation3EditPart.VISUAL_ID:
			return getCompOperation_4014OutgoingLinks(view);
		case CompOperationCaller3EditPart.VISUAL_ID:
			return getCompOperationCaller_4015OutgoingLinks(view);
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
	public static List<OrocosComponentModelLinkDescriptor> getComposite_2002ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionPolicy_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PeersConnection_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTaskContext_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCInputDataPort_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOutputDataPort_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCProperty_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperation_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperationCaller_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_3023ContainedLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionPolicy_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PeersConnection_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getConnectionPolicy_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getPeersConnection_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_4014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTaskContext_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCInputDataPort_3018IncomingLinks(
			View view) {
		TCInputDataPort modelElement = (TCInputDataPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOutputDataPort_3019IncomingLinks(
			View view) {
		TCOutputDataPort modelElement = (TCOutputDataPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCProperty_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperation_3021IncomingLinks(
			View view) {
		TCOperation modelElement = (TCOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperationCaller_3022IncomingLinks(
			View view) {
		TCOperationCaller modelElement = (TCOperationCaller) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3024IncomingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3025IncomingLinks(
			View view) {
		CompOutputPort modelElement = (CompOutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3026IncomingLinks(
			View view) {
		CompOperation modelElement = (CompOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3027IncomingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3028IncomingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3029IncomingLinks(
			View view) {
		CompOutputPort modelElement = (CompOutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3030IncomingLinks(
			View view) {
		CompOperation modelElement = (CompOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3031IncomingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getConnectionPolicy_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_4011IncomingLinks(
			View view) {
		CompOutputPort modelElement = (CompOutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOutputPort_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_4012IncomingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompInputPort_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getPeersConnection_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_4014IncomingLinks(
			View view) {
		CompOperation modelElement = (CompOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PeersConnection_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CompOperation_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_4015IncomingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompOperationCaller_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_2002OutgoingLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTaskContext_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCInputDataPort_3018OutgoingLinks(
			View view) {
		TCInputDataPort modelElement = (TCInputDataPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOutputDataPort_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCProperty_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperation_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getTCOperationCaller_3022OutgoingLinks(
			View view) {
		TCOperationCaller modelElement = (TCOperationCaller) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getComposite_3023OutgoingLinks(
			View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompOutputPort_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompInputPort_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperation_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CompOperationCaller_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3024OutgoingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3026OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3027OutgoingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_3028OutgoingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_3029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_3031OutgoingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getConnectionPolicy_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOutputPort_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompInputPort_4012OutgoingLinks(
			View view) {
		CompInputPort modelElement = (CompInputPort) view.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getPeersConnection_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperation_4014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OrocosComponentModelLinkDescriptor> getCompOperationCaller_4015OutgoingLinks(
			View view) {
		CompOperationCaller modelElement = (CompOperationCaller) view
				.getElement();
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PeersConnection_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_ConnectionPolicy_4010(
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
					OrocosComponentModelElementTypes.ConnectionPolicy_4010,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompOutputPort_4011(
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
					link, OrocosComponentModelElementTypes.CompOutputPort_4011,
					CompOutputPort3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompInputPort_4012(
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
					link, OrocosComponentModelElementTypes.CompInputPort_4012,
					CompInputPort3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_PeersConnection_4013(
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
					OrocosComponentModelElementTypes.PeersConnection_4013,
					PeersConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompOperation_4014(
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
					link, OrocosComponentModelElementTypes.CompOperation_4014,
					CompOperation3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_CompOperationCaller_4015(
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
					OrocosComponentModelElementTypes.CompOperationCaller_4015,
					CompOperationCaller3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectionPolicy_4010(
			OutputDataPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
					OrocosComponentModelElementTypes.ConnectionPolicy_4010,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompOutputPort_4011(
			OutputDataPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
					OrocosComponentModelElementTypes.CompOutputPort_4011,
					CompOutputPort3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompInputPort_4012(
			InputDataPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
					OrocosComponentModelElementTypes.CompInputPort_4012,
					CompInputPort3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_PeersConnection_4013(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
					OrocosComponentModelElementTypes.PeersConnection_4013,
					PeersConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompOperation_4014(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
					OrocosComponentModelElementTypes.CompOperation_4014,
					CompOperation3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_CompOperationCaller_4015(
			OperationCaller target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OrocosComponentModelLinkDescriptor> result = new LinkedList<OrocosComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage.eINSTANCE
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
					OrocosComponentModelElementTypes.CompOperationCaller_4015,
					CompOperationCaller3EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectionPolicy_4010(
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
					OrocosComponentModelElementTypes.ConnectionPolicy_4010,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OrocosComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_PeersConnection_4013(
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
					OrocosComponentModelElementTypes.PeersConnection_4013,
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
