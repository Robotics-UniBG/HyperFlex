/*
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
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
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.featuremodels.model.diagram.edit.policies;

import it.unibg.robotics.featuremodels.model.diagram.edit.commands.CompositeFeatureSubFeatures2CreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.CompositeFeatureSubFeatures2ReorientCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.CompositeFeatureSubFeaturesCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.CompositeFeatureSubFeaturesReorientCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureAttributesCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureAttributesReorientCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureSubCompositeFeaturesCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureSubCompositeFeaturesReorientCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureSubFeatures2CreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureSubFeatures2ReorientCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureSubFeaturesCreateCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.commands.FeatureSubFeaturesReorientCommand;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.CompositeFeatureSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureAttributesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubCompositeFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.model.diagram.edit.parts.FeatureSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.model.diagram.part.FeatureModelVisualIDRegistry;
import it.unibg.robotics.featuremodels.model.diagram.providers.FeatureModelElementTypes;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Feature2ItemSemanticEditPolicy extends
		FeatureModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Feature2ItemSemanticEditPolicy() {
		super(FeatureModelElementTypes.Feature_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (FeatureModelVisualIDRegistry.getVisualID(incomingLink) == FeatureSubFeaturesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeatureModelVisualIDRegistry.getVisualID(incomingLink) == FeatureSubFeatures2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeatureModelVisualIDRegistry.getVisualID(incomingLink) == CompositeFeatureSubFeaturesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FeatureModelVisualIDRegistry.getVisualID(incomingLink) == CompositeFeatureSubFeatures2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (FeatureModelVisualIDRegistry.getVisualID(outgoingLink) == FeatureSubFeaturesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeatureModelVisualIDRegistry.getVisualID(outgoingLink) == FeatureSubFeatures2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeatureModelVisualIDRegistry.getVisualID(outgoingLink) == FeatureSubCompositeFeaturesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FeatureModelVisualIDRegistry.getVisualID(outgoingLink) == FeatureAttributesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (FeatureModelElementTypes.FeatureSubFeatures_4001 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeaturesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureSubFeatures_4002 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeatures2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.CompositeFeatureSubFeatures_4003 == req
				.getElementType()) {
			return null;
		}
		if (FeatureModelElementTypes.CompositeFeatureSubFeatures_4004 == req
				.getElementType()) {
			return null;
		}
		if (FeatureModelElementTypes.FeatureSubCompositeFeatures_4005 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubCompositeFeaturesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureAttributes_4006 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureAttributesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (FeatureModelElementTypes.FeatureSubFeatures_4001 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeaturesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureSubFeatures_4002 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeatures2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.CompositeFeatureSubFeatures_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeFeatureSubFeaturesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.CompositeFeatureSubFeatures_4004 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeFeatureSubFeatures2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureSubCompositeFeatures_4005 == req
				.getElementType()) {
			return null;
		}
		if (FeatureModelElementTypes.FeatureAttributes_4006 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case FeatureSubFeaturesEditPart.VISUAL_ID:
			return getGEFWrapper(new FeatureSubFeaturesReorientCommand(req));
		case FeatureSubFeatures2EditPart.VISUAL_ID:
			return getGEFWrapper(new FeatureSubFeatures2ReorientCommand(req));
		case CompositeFeatureSubFeaturesEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeFeatureSubFeaturesReorientCommand(
					req));
		case CompositeFeatureSubFeatures2EditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeFeatureSubFeatures2ReorientCommand(
					req));
		case FeatureSubCompositeFeaturesEditPart.VISUAL_ID:
			return getGEFWrapper(new FeatureSubCompositeFeaturesReorientCommand(
					req));
		case FeatureAttributesEditPart.VISUAL_ID:
			return getGEFWrapper(new FeatureAttributesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
