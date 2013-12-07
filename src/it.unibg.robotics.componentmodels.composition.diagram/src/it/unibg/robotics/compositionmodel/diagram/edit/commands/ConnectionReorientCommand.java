package org.hyperflex.compositionmodel.diagram.edit.commands;

import org.hyperflex.compositionmodel.Connection;
import org.hyperflex.compositionmodel.ProvidedInterface;
import org.hyperflex.compositionmodel.RequiredInterface;
import org.hyperflex.compositionmodel.System;
import org.hyperflex.compositionmodel.diagram.edit.policies.CompositionModelBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Connection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof RequiredInterface && newEnd instanceof RequiredInterface)) {
			return false;
		}
		ProvidedInterface target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof System)) {
			return false;
		}
		System container = (System) getLink().eContainer();
		return CompositionModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4002(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ProvidedInterface && newEnd instanceof ProvidedInterface)) {
			return false;
		}
		RequiredInterface source = getLink().getSource();
		if (!(getLink().eContainer() instanceof System)) {
			return false;
		}
		System container = (System) getLink().eContainer();
		return CompositionModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Connection getLink() {
		return (Connection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected RequiredInterface getOldSource() {
		return (RequiredInterface) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RequiredInterface getNewSource() {
		return (RequiredInterface) newEnd;
	}

	/**
	 * @generated
	 */
	protected ProvidedInterface getOldTarget() {
		return (ProvidedInterface) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ProvidedInterface getNewTarget() {
		return (ProvidedInterface) newEnd;
	}
}
