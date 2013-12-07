/**
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
package org.hyperflex.componentmodels.orocos.m2t.tools;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.hyperflex.orocoscomponentmodel.AbstractComponent;
import org.hyperflex.orocoscomponentmodel.CompInputPort;
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.CompOutputPort;
import org.hyperflex.orocoscomponentmodel.Composite;
import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.DataPort;
import org.hyperflex.orocoscomponentmodel.Operation;
import org.hyperflex.orocoscomponentmodel.OperationCaller;
import org.hyperflex.orocoscomponentmodel.PeersConnection;
import org.hyperflex.orocoscomponentmodel.TCInputDataPort;
import org.hyperflex.orocoscomponentmodel.TCOperation;
import org.hyperflex.orocoscomponentmodel.TCOperationCaller;
import org.hyperflex.orocoscomponentmodel.TCOutputDataPort;
import org.hyperflex.orocoscomponentmodel.TaskContext;


public class OrocosXmlTools {

	public OrocosXmlTools() {	

	}

	/**
	 * Returns the list of connections which have the input port as source
	 * or output
	 * @generated NOT
	 */
	public ArrayList<ConnectionPolicy> getPortConnectionPolicies(DataPort port){

		//		return getAllPortConnectionPlocies(port);
		//
		//	}
		//
		//	/**
		//	 * Returns the list of connections which connect a port directly or 
		//	 * through promotions.
		//	 * It performs a recursive search.
		//	 * @generated NOT
		//	 */
		//	private ArrayList<ConnectionPolicy> getAllPortConnectionPolicies(DataPort port){

		ArrayList<ConnectionPolicy> result = new ArrayList<ConnectionPolicy>();

		if(port.eContainer().eContainer() == null || 
				!(port.eContainer().eContainer() instanceof Composite)){
			return result;
		}
		Composite composite = (Composite)port.eContainer().eContainer();
		EList<ConnectionPolicy> compositeConnections = composite.getConnectionPolicies();

		for(ConnectionPolicy conn : compositeConnections){
			
			if(conn.getSource().equals(port) || conn.getTarget().equals(port)){
				result.add(conn);
			}

		}

		if(composite.eContainer() != null && composite.eContainer() instanceof Composite){
			// this means that the composite containing the component is contained in another composite
			// explore the composite. Look for ports that expose this port and retrieve connection name.
			if(port instanceof TCInputDataPort){

				for(CompInputPort parentPort : composite.getInputPorts()){
					// check if the port is exposed...this is recursive
					if(parentPort.getExposedPort().equals(port)){
						result.addAll(getPortConnectionPolicies(parentPort));
					}
				}

			}else if (port instanceof TCOutputDataPort){
				for(CompOutputPort parentPort : composite.getOutputPorts()){
					// check if the port is exposed...this is recursive
					if(parentPort.getExposedPort().equals(port)){
						result.addAll(getPortConnectionPolicies(parentPort));
					}

				}
			}

		}

		return result;
	}

	/**
	 * Returns the list of peer connections which have the connect the input 
	 * operation 
	 * @generated NOT
	 */
	public ArrayList<TaskContext> getOperationPeers(Operation operation){

		//		return getAllPeers(operation);
		//
		//	}
		//
		//	/**
		//	 * Returns the list of peers connections which connect an operation directly or 
		//	 * through promotions.
		//	 * It performs a recursive search.
		//	 * @generated NOT
		//	 */
		//	private ArrayList<TaskContext> getAllPeers(Operation operation){

		ArrayList<TaskContext> result = new ArrayList<TaskContext>();

		if(operation.eContainer().eContainer() == null || 
				!(operation.eContainer().eContainer() instanceof Composite)){
			return result;
		}

		Composite composite = (Composite)operation.eContainer().eContainer();
		EList<PeersConnection> compositePeersConnections = composite.getPeersConnections();
		// first look for direct connection

		for(PeersConnection conn : compositePeersConnections){

			if(conn.getSource().equals(operation)){
				result.add(getTaskContextFromOperationCaller(conn.getTarget()));
			}

		}

		// then look for indirect connection (though promotion)

		if(composite.eContainer() != null && composite.eContainer() instanceof Composite){
			// this means that the composite containing the component is contained in another composite
			// explore the composite. Look for op that expose this op and retrieve connection name.
			for(CompOperation parentOperation : composite.getOperations()){
				// check if the port is exposed...this is recursive
				if(parentOperation.getExposedOp().equals(operation)){
					result.addAll(getOperationPeers(parentOperation));
				}
			}

		}

		return result;
	}

	/**
	 * Returns the task context who is providing the input operation caller.
	 * It performs a recursive search.
	 * @generated NOT
	 */
	private TaskContext getTaskContextFromOperationCaller(OperationCaller opCall){

		TaskContext result = null;

		if(opCall instanceof TCOperationCaller){

			result = (TaskContext) opCall.eContainer();

		}else if (opCall instanceof CompOperationCaller){

			OperationCaller exposedOpCaller = ((CompOperationCaller) opCall).getExposedOpCaller();
			result = getTaskContextFromOperationCaller(exposedOpCaller);

		}

		return result;

	}

	/**
	 * Returns the list of peer connections which have the connect the input 
	 * operation caller
	 * @generated NOT
	 */
	public ArrayList<TaskContext> getOperationCallerPeers(OperationCaller operationCaller){

		//		return getAllPeers(operationCaller);
		//
		//	}
		//
		//	/**
		//	 * Returns the list of peers connections which connect an operation caller
		//	 * directly or through promotions.
		//	 * It performs a recursive search.
		//	 * @generated NOT
		//	 */
		//	private ArrayList<TaskContext> getAllPeers(OperationCaller operationCaller){

		ArrayList<TaskContext> result = new ArrayList<TaskContext>();

		if(operationCaller.eContainer().eContainer() == null || 
				!(operationCaller.eContainer().eContainer() instanceof Composite)){
			return result;
		}

		Composite composite = (Composite)operationCaller.eContainer().eContainer();
		EList<PeersConnection> compositePeersConnections = composite.getPeersConnections();

		// first look for direct connection

		for(PeersConnection conn : compositePeersConnections){

			if(conn.getTarget().equals(operationCaller)){
				result.add(getTaskContextFromOperation(conn.getSource()));
			}

		}

		// then look for indirect connection (though promotion)

		if(composite.eContainer() != null && composite.eContainer() instanceof Composite){
			// this means that the composite containing the component is contained in another composite
			// explore the composite. Look for op that expose this op and retrieve connection name.

			for(CompOperationCaller parentOpCaller : composite.getOperationCallers()){
				// check if the port is exposed...this is recursive
				if(parentOpCaller.getExposedOpCaller().equals(operationCaller)){
					result.addAll(getOperationCallerPeers(parentOpCaller));
				}
			}

		}

		return result;
	}



	/**
	 * Returns the task context who is providing the input operation.
	 * It performs a recursive search.
	 * @generated NOT
	 */
	private TaskContext getTaskContextFromOperation(Operation op){

		TaskContext result = null;

		if(op instanceof TCOperation){

			result = (TaskContext) op.eContainer();

		}else if (op instanceof CompOperation){

			Operation exposedOp = ((CompOperation) op).getExposedOp();
			result = getTaskContextFromOperation(exposedOp);

		}

		return result;

	}

	/**
	 * Returns the list of connections policies contained in the input composite
	 * @generated NOT
	 */
	public ArrayList<ConnectionPolicy> getCompositeConnectionPolicies(Composite composite){

		ArrayList<ConnectionPolicy> result = new ArrayList<ConnectionPolicy>();

		for(ConnectionPolicy conn : composite.getConnectionPolicies()){
			if(result.contains(conn) == false){
				result.add(conn);
			}
		}

		for(AbstractComponent comp : composite.getComponents()){

			if(comp instanceof Composite){
				result.addAll(getCompositeConnectionPolicies((Composite)comp));
			}

		}

		return result;

	}

}
