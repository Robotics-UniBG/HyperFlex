/*
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
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
package org.hyperflex.roscomponentmodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.hyperflex.roscomponentmodel.Composite;
import org.hyperflex.roscomponentmodel.SrvConsumer;
import org.hyperflex.roscomponentmodel.SrvProducer;
import org.hyperflex.roscomponentmodel.Wire;
import org.hyperflex.roscomponentmodel.diagram.edit.policies.RosComponentModelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class WireReorientCommand extends EditElementCommand {

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
	public WireReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Wire) {
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
		if (!(oldEnd instanceof SrvConsumer && newEnd instanceof SrvConsumer)) {
			return false;
		}
		SrvProducer target = getLink().getSource();
		if (!(getLink().eContainer() instanceof Composite)) {
			return false;
		}
		Composite container = (Composite) getLink().eContainer();
		return RosComponentModelBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistWire_4007(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SrvProducer && newEnd instanceof SrvProducer)) {
			return false;
		}
		SrvConsumer source = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Composite)) {
			return false;
		}
		Composite container = (Composite) getLink().eContainer();
		return RosComponentModelBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistWire_4007(container, getLink(), source, getNewTarget());
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
	protected Wire getLink() {
		return (Wire) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected SrvConsumer getOldSource() {
		return (SrvConsumer) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SrvConsumer getNewSource() {
		return (SrvConsumer) newEnd;
	}

	/**
	 * @generated
	 */
	protected SrvProducer getOldTarget() {
		return (SrvProducer) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SrvProducer getNewTarget() {
		return (SrvProducer) newEnd;
	}
}
