/**
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
package it.unibg.robotics.featuremodels.diagram.edit.policies;

import it.unibg.robotics.featuremodels.diagram.edit.commands.ContainmentAssociationCreateCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.ContainmentAssociationSubFeatures2CreateCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.ContainmentAssociationSubFeatures2ReorientCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.ContainmentAssociationSubFeaturesCreateCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.ContainmentAssociationSubFeaturesReorientCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.FeatureAttributesCreateCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.FeatureAttributesReorientCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.FeatureSubFeatures2CreateCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.FeatureSubFeatures2ReorientCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.FeatureSubFeaturesCreateCommand;
import it.unibg.robotics.featuremodels.diagram.edit.commands.FeatureSubFeaturesReorientCommand;
import it.unibg.robotics.featuremodels.diagram.edit.parts.ContainmentAssociationEditPart;
import it.unibg.robotics.featuremodels.diagram.edit.parts.ContainmentAssociationSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.diagram.edit.parts.ContainmentAssociationSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.diagram.edit.parts.FeatureAttributesEditPart;
import it.unibg.robotics.featuremodels.diagram.edit.parts.FeatureSubFeatures2EditPart;
import it.unibg.robotics.featuremodels.diagram.edit.parts.FeatureSubFeaturesEditPart;
import it.unibg.robotics.featuremodels.diagram.part.FeatureModelVisualIDRegistry;
import it.unibg.robotics.featuremodels.diagram.providers.FeatureModelElementTypes;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
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
		super(FeatureModelElementTypes.Feature_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FeatureModelElementTypes.ContainmentAssociation_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ContainmentAssociationCreateCommand(req));
		}
		return super.getCreateCommand(req);
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
			if (FeatureModelVisualIDRegistry.getVisualID(incomingLink) == ContainmentAssociationSubFeaturesEditPart.VISUAL_ID) {
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
			if (FeatureModelVisualIDRegistry.getVisualID(incomingLink) == ContainmentAssociationSubFeatures2EditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (FeatureModelVisualIDRegistry.getVisualID(node)) {
			case ContainmentAssociationEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (FeatureModelVisualIDRegistry.getVisualID(outgoingLink) == ContainmentAssociationSubFeaturesEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r) {
							protected CommandResult doExecuteWithResult(
									IProgressMonitor progressMonitor,
									IAdaptable info) throws ExecutionException {
								EObject referencedObject = getReferencedObject();
								Resource resource = referencedObject
										.eResource();
								CommandResult result = super
										.doExecuteWithResult(progressMonitor,
												info);
								if (resource != null) {
									resource.getContents()
											.add(referencedObject);
								}
								return result;
							}
						});
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (FeatureModelVisualIDRegistry.getVisualID(outgoingLink) == ContainmentAssociationSubFeatures2EditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r) {
							protected CommandResult doExecuteWithResult(
									IProgressMonitor progressMonitor,
									IAdaptable info) throws ExecutionException {
								EObject referencedObject = getReferencedObject();
								Resource resource = referencedObject
										.eResource();
								CommandResult result = super
										.doExecuteWithResult(progressMonitor,
												info);
								if (resource != null) {
									resource.getContents()
											.add(referencedObject);
								}
								return result;
							}
						});
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
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
		if (FeatureModelElementTypes.FeatureSubFeatures_4007 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeaturesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureSubFeatures_4008 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeatures2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013 == req
				.getElementType()) {
			return null;
		}
		if (FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014 == req
				.getElementType()) {
			return null;
		}
		if (FeatureModelElementTypes.FeatureAttributes_4012 == req
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
		if (FeatureModelElementTypes.FeatureSubFeatures_4007 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeaturesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureSubFeatures_4008 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSubFeatures2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.ContainmentAssociationSubFeatures_4013 == req
				.getElementType()) {
			return getGEFWrapper(new ContainmentAssociationSubFeaturesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.ContainmentAssociationSubFeatures_4014 == req
				.getElementType()) {
			return getGEFWrapper(new ContainmentAssociationSubFeatures2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (FeatureModelElementTypes.FeatureAttributes_4012 == req
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
		case ContainmentAssociationSubFeaturesEditPart.VISUAL_ID:
			return getGEFWrapper(new ContainmentAssociationSubFeaturesReorientCommand(
					req));
		case ContainmentAssociationSubFeatures2EditPart.VISUAL_ID:
			return getGEFWrapper(new ContainmentAssociationSubFeatures2ReorientCommand(
					req));
		case FeatureAttributesEditPart.VISUAL_ID:
			return getGEFWrapper(new FeatureAttributesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
