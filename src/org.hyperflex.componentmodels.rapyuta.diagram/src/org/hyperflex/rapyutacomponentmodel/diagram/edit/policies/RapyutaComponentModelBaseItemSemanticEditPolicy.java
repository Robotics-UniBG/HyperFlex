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
package org.hyperflex.rapyutacomponentmodel.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface;
import org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection;
import org.hyperflex.rapyutacomponentmodel.Container;
import org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointPublisher;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvClient;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvServer;
import org.hyperflex.rapyutacomponentmodel.EndPointSubscriber;
import org.hyperflex.rapyutacomponentmodel.MsgInterface;
import org.hyperflex.rapyutacomponentmodel.SrvClient;
import org.hyperflex.rapyutacomponentmodel.SrvServer;
import org.hyperflex.rapyutacomponentmodel.System;
import org.hyperflex.rapyutacomponentmodel.Topic;
import org.hyperflex.rapyutacomponentmodel.diagram.expressions.RapyutaComponentModelOCLFactory;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelDiagramEditorPlugin;
import org.hyperflex.rapyutacomponentmodel.diagram.part.RapyutaComponentModelVisualIDRegistry;
import org.hyperflex.rapyutacomponentmodel.diagram.providers.RapyutaComponentModelElementTypes;

/**
 * @generated
 */
public class RapyutaComponentModelBaseItemSemanticEditPolicy extends
		SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected RapyutaComponentModelBaseItemSemanticEditPolicy(
			IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						RapyutaComponentModelVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = RapyutaComponentModelElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = RapyutaComponentModelDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			RapyutaComponentModelDiagramEditorPlugin.getInstance()
					.setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateMsgInterfaceConnection_4011(
				MsgInterface source, Topic target) {
			if (source != null) {
				if (source.getConnection() != null) {
					return false;
				}
			}

			return canExistMsgInterfaceConnection_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMsgInterfaceConnection_4012(
				MsgInterface source, Topic target) {
			if (source != null) {
				if (source.getConnection() != null) {
					return false;
				}
			}

			return canExistMsgInterfaceConnection_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCompositeMsgInterfaceExposed_4013(
				CompositeMsgInterface source, Topic target) {
			if (source != null) {
				if (source.getExposed() != null) {
					return false;
				}
			}

			return canExistCompositeMsgInterfaceExposed_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCompositeMsgInterfaceExposed_4014(
				CompositeMsgInterface source, Topic target) {
			if (source != null) {
				if (source.getExposed() != null) {
					return false;
				}
			}

			return canExistCompositeMsgInterfaceExposed_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEndPointSrvConnection_4015(System container,
				EndPointSrvClient source, EndPointSrvServer target) {
			return canExistEndPointSrvConnection_4015(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEndPointMsgConnection_4016(System container,
				EndPointPublisher source, EndPointSubscriber target) {
			return canExistEndPointMsgConnection_4016(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCompositeSrvConnection_4017(
				Composite container, SrvClient source, SrvServer target) {
			return canExistCompositeSrvConnection_4017(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateContainerSrvConnection_4018(
				Container container, SrvClient source, SrvServer target) {
			return canExistContainerSrvConnection_4018(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canExistMsgInterfaceConnection_4011(MsgInterface source,
				Topic target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getTopic()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									0,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getMsgInterface(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistMsgInterfaceConnection_4012(MsgInterface source,
				Topic target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getTopic()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									1,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getMsgInterface(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistCompositeMsgInterfaceExposed_4013(
				CompositeMsgInterface source, Topic target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getTopic()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									2,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getCompositeMsgInterface(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistCompositeMsgInterfaceExposed_4014(
				CompositeMsgInterface source, Topic target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getTopic()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									3,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getCompositeMsgInterface(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistEndPointSrvConnection_4015(System container,
				EndPointSrvConnection linkInstance, EndPointSrvClient source,
				EndPointSrvServer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getEndPointSrvServer()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									4,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getEndPointSrvClient(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getEndPointSrvClient()); //$NON-NLS-1$
					Object targetVal = RapyutaComponentModelOCLFactory
							.getExpression(
									5,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getEndPointSrvServer(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistEndPointMsgConnection_4016(System container,
				EndPointMsgConnection linkInstance, EndPointPublisher source,
				EndPointSubscriber target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getEndPointSubscriber()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									6,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getEndPointPublisher(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getEndPointPublisher()); //$NON-NLS-1$
					Object targetVal = RapyutaComponentModelOCLFactory
							.getExpression(
									7,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getEndPointSubscriber(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistCompositeSrvConnection_4017(Composite container,
				CompositeSrvConnection linkInstance, SrvClient source,
				SrvServer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getSrvServer()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									8,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getSrvClient(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getSrvClient()); //$NON-NLS-1$
					Object targetVal = RapyutaComponentModelOCLFactory
							.getExpression(
									9,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getSrvServer(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistContainerSrvConnection_4018(Container container,
				ContainerSrvConnection linkInstance, SrvClient source,
				SrvServer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getSrvServer()); //$NON-NLS-1$
					Object sourceVal = RapyutaComponentModelOCLFactory
							.getExpression(
									10,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getSrvClient(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE.getSrvClient()); //$NON-NLS-1$
					Object targetVal = RapyutaComponentModelOCLFactory
							.getExpression(
									11,
									org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage.eINSTANCE
											.getSrvServer(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				RapyutaComponentModelDiagramEditorPlugin.getInstance()
						.logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
