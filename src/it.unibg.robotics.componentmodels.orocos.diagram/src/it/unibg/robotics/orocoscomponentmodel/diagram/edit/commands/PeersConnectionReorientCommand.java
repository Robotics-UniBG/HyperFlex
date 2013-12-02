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
package it.unibg.robotics.orocoscomponentmodel.diagram.edit.commands;

import it.unibg.robotics.orocoscomponentmodel.Composite;
import it.unibg.robotics.orocoscomponentmodel.Operation;
import it.unibg.robotics.orocoscomponentmodel.OperationCaller;
import it.unibg.robotics.orocoscomponentmodel.PeersConnection;
import it.unibg.robotics.orocoscomponentmodel.diagram.edit.policies.OrocosComponentModelBaseItemSemanticEditPolicy;

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
public class PeersConnectionReorientCommand extends EditElementCommand {

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
	public PeersConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PeersConnection) {
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
		if (!(oldEnd instanceof OperationCaller && newEnd instanceof OperationCaller)) {
			return false;
		}
		Operation target = getLink().getSource();
		if (!(getLink().eContainer() instanceof Composite)) {
			return false;
		}
		Composite container = (Composite) getLink().eContainer();
		return OrocosComponentModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPeersConnection_4007(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Operation && newEnd instanceof Operation)) {
			return false;
		}
		OperationCaller source = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Composite)) {
			return false;
		}
		Composite container = (Composite) getLink().eContainer();
		return OrocosComponentModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPeersConnection_4007(container,
						getLink(), source, getNewTarget());
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
		getLink().setTarget(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSource(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected PeersConnection getLink() {
		return (PeersConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OperationCaller getOldSource() {
		return (OperationCaller) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OperationCaller getNewSource() {
		return (OperationCaller) newEnd;
	}

	/**
	 * @generated
	 */
	protected Operation getOldTarget() {
		return (Operation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Operation getNewTarget() {
		return (Operation) newEnd;
	}
}
