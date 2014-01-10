/*
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointPublisher;
import org.hyperflex.rapyutacomponentmodel.EndPointSubscriber;
import org.hyperflex.rapyutacomponentmodel.System;
import org.hyperflex.rapyutacomponentmodel.diagram.edit.policies.RapyutaComponentModelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class EndPointMsgConnectionReorientCommand extends EditElementCommand {

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
	public EndPointMsgConnectionReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof EndPointMsgConnection) {
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
		if (!(oldEnd instanceof EndPointPublisher && newEnd instanceof EndPointPublisher)) {
			return false;
		}
		EndPointSubscriber target = getLink().getSubscriber();
		if (!(getLink().eContainer() instanceof System)) {
			return false;
		}
		System container = (System) getLink().eContainer();
		return RapyutaComponentModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEndPointMsgConnection_4016(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof EndPointSubscriber && newEnd instanceof EndPointSubscriber)) {
			return false;
		}
		EndPointPublisher source = getLink().getPublisher();
		if (!(getLink().eContainer() instanceof System)) {
			return false;
		}
		System container = (System) getLink().eContainer();
		return RapyutaComponentModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEndPointMsgConnection_4016(
						container, getLink(), source, getNewTarget());
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
		getLink().setPublisher(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSubscriber(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected EndPointMsgConnection getLink() {
		return (EndPointMsgConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected EndPointPublisher getOldSource() {
		return (EndPointPublisher) oldEnd;
	}

	/**
	 * @generated
	 */
	protected EndPointPublisher getNewSource() {
		return (EndPointPublisher) newEnd;
	}

	/**
	 * @generated
	 */
	protected EndPointSubscriber getOldTarget() {
		return (EndPointSubscriber) oldEnd;
	}

	/**
	 * @generated
	 */
	protected EndPointSubscriber getNewTarget() {
		return (EndPointSubscriber) newEnd;
	}
}
