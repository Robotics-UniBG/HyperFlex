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
package it.unibg.robotics.componentmodels.orocos.m2t.tools;

import it.unibg.robotics.orocoscomponentmodel.CompInputPort;
import it.unibg.robotics.orocoscomponentmodel.CompOperation;
import it.unibg.robotics.orocoscomponentmodel.CompOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.CompOutputPort;
import it.unibg.robotics.orocoscomponentmodel.Composite;
import it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy;
import it.unibg.robotics.orocoscomponentmodel.DataPort;
import it.unibg.robotics.orocoscomponentmodel.Operation;
import it.unibg.robotics.orocoscomponentmodel.OperationCaller;
import it.unibg.robotics.orocoscomponentmodel.PeersConnection;
import it.unibg.robotics.orocoscomponentmodel.TCInputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TCOperation;
import it.unibg.robotics.orocoscomponentmodel.TCOperationCaller;
import it.unibg.robotics.orocoscomponentmodel.TCOutputDataPort;
import it.unibg.robotics.orocoscomponentmodel.TaskContext;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;


public class OrocosXmlTools {

	public OrocosXmlTools() {	

	}

	/**
	 * Returns the list of connections which have the input port as source
	 * or output
	 * @generated NOT
	 */
	public ArrayList<ConnectionPolicy> getConnections(DataPort port){

		return getAllConnections(port);

	}

	/**
	 * Returns the list of connections which connect a port directly or 
	 * through promotions.
	 * It performs a recursive search.
	 * @generated NOT
	 */
	private ArrayList<ConnectionPolicy> getAllConnections(DataPort port){

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
						result.addAll(getAllConnections(parentPort));
					}
				}

			}else if (port instanceof TCOutputDataPort){
				for(CompOutputPort parentPort : composite.getOutputPorts()){
					// check if the port is exposed...this is recursive
					if(parentPort.getExposedPort().equals(port)){
						result.addAll(getAllConnections(parentPort));
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
	public ArrayList<TaskContext> getPeers(Operation operation){

		return getAllPeers(operation);

	}

	/**
	 * Returns the list of peers connections which connect an operation directly or 
	 * through promotions.
	 * It performs a recursive search.
	 * @generated NOT
	 */
	private ArrayList<TaskContext> getAllPeers(Operation operation){

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
					result.addAll(getAllPeers(parentOperation));
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
	public ArrayList<TaskContext> getPeers(OperationCaller operationCaller){

		return getAllPeers(operationCaller);

	}

	/**
	 * Returns the list of peers connections which connect an operation caller
	 * directly or through promotions.
	 * It performs a recursive search.
	 * @generated NOT
	 */
	private ArrayList<TaskContext> getAllPeers(OperationCaller opCaller){

		ArrayList<TaskContext> result = new ArrayList<TaskContext>();

		if(opCaller.eContainer().eContainer() == null || 
				!(opCaller.eContainer().eContainer() instanceof Composite)){
			return result;
		}

		Composite composite = (Composite)opCaller.eContainer().eContainer();
		EList<PeersConnection> compositePeersConnections = composite.getPeersConnections();

		// first look for direct connection

		for(PeersConnection conn : compositePeersConnections){

			if(conn.getTarget().equals(opCaller)){
				result.add(getTaskContextFromOperation(conn.getSource()));
			}

		}

		// then look for indirect connection (though promotion)

		if(composite.eContainer() != null && composite.eContainer() instanceof Composite){
			// this means that the composite containing the component is contained in another composite
			// explore the composite. Look for op that expose this op and retrieve connection name.

			for(CompOperationCaller parentOpCaller : composite.getOperationCallers()){
				// check if the port is exposed...this is recursive
				if(parentOpCaller.getExposedOpCaller().equals(opCaller)){
					result.addAll(getAllPeers(parentOpCaller));
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

}
