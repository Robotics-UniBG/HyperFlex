/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
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
package org.hyperflex.componentmodels.rapyuta.m2t.tools;



import java.util.ArrayList;

import org.hyperflex.rapyutacomponentmodel.AbstractComponent;
import org.hyperflex.rapyutacomponentmodel.CloudContainer;
import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.Container;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection;
import org.hyperflex.rapyutacomponentmodel.Node;
import org.hyperflex.rapyutacomponentmodel.RobotEndPoint;
import org.hyperflex.rapyutacomponentmodel.System;


public class RapyutaLaunchTools {

	public RapyutaLaunchTools() {	

	}

	/**
	 * Returns the root of the model starting from one of the composites
	 * @generated NOT
	 */
	public org.hyperflex.rapyutacomponentmodel.System getSystem(Composite composite){

		Composite tmpComposite = composite;
		while((tmpComposite.eContainer() instanceof org.hyperflex.rapyutacomponentmodel.Container) == false){

			tmpComposite = (Composite)tmpComposite.eContainer();

		}

		return (org.hyperflex.rapyutacomponentmodel.System)tmpComposite.eContainer().eContainer();

	}

	/**
	 * Returns the root of the model starting from one of the containers
	 * @generated NOT
	 */
	public org.hyperflex.rapyutacomponentmodel.System getSystem(Container container){

		Container tmpContainer = container;
		while((tmpContainer.eContainer() instanceof org.hyperflex.rapyutacomponentmodel.System) == false){

			tmpContainer = (Container)tmpContainer.eContainer();

		}

		return (org.hyperflex.rapyutacomponentmodel.System)tmpContainer.eContainer();

	}

	/**
	 * Returns the list of containers directly contained in the System
	 * @generated NOT
	 */
	public ArrayList<Container> getSystemContainers(Container container){

		Container tmpContainer = container;
		while((tmpContainer.eContainer() instanceof org.hyperflex.rapyutacomponentmodel.System) == false){

			tmpContainer = (Container)tmpContainer.eContainer();

		}

		org.hyperflex.rapyutacomponentmodel.System system = (org.hyperflex.rapyutacomponentmodel.System)tmpContainer.eContainer();

		ArrayList<Container> result = new ArrayList<Container>();

		for(Container cont : system.getRobotContainers()){
			result.add(cont);
		}
		for(Container cont : system.getCloudContainers()){
			result.add(cont);
		}

		return result;

	}

	/**
	 * Returns the list of all the nodes of a certain container
	 * @generated NOT
	 */
	public ArrayList<Node> getAllNodes(Container container){

		ArrayList<Node> result = new  ArrayList<Node>();

		for(AbstractComponent component : container.getComponents()){
			if(component instanceof Node){
				result.add((Node)component);
			}else if(component instanceof Composite){
				result.addAll(getAllNodes((Composite)component));
			}
		}

		return result;

	}

	public ArrayList<Node> getAllNodes(Composite composite){ 
		ArrayList<Node> result = new  ArrayList<Node>();

		for(AbstractComponent component : composite.getComponents()){
			if(component instanceof Node){
				result.add((Node)component);
			}else if(component instanceof Composite){
				result.addAll(getAllNodes((Composite)component));
			}
		}

		return result;

	}

	/**
	 * Returns the list of all the cloud containers associated to a certain robot end point
	 * @generated NOT
	 */
	public ArrayList<CloudContainer> getAssociatedCloudContainer(RobotEndPoint robotEndPoint){

		ArrayList<CloudContainer> result = new ArrayList<CloudContainer>();

		System system = (System)robotEndPoint.eContainer().eContainer();


		for(EndPointMsgConnection connection : system.getEndPointMsgConnections()){

			boolean connectEndPointPublisher = robotEndPoint.getPublishers().contains(connection.getPublisher());
			boolean connectEndPointSubsriber = robotEndPoint.getSubscribers().contains(connection.getSubscriber());

			if(connectEndPointPublisher){

				result.add((CloudContainer)connection.getSubscriber().eContainer().eContainer());

			}else if(connectEndPointSubsriber){

				result.add((CloudContainer)connection.getPublisher().eContainer().eContainer());

			}

		}

		for(EndPointSrvConnection connection : system.getEndPointSrvConnections()){

			boolean connectEndPointServiceServer = robotEndPoint.getSrvServers().contains(connection.getServer());
			boolean connectEndPointServiceClient = robotEndPoint.getSrvClients().contains(connection.getClient());

			if(connectEndPointServiceServer){

				result.add((CloudContainer)connection.getClient().eContainer().eContainer());

			}else if(connectEndPointServiceClient){

				result.add((CloudContainer)connection.getServer().eContainer().eContainer());

			}

		}

		return result;

	}
	
	/**
	 * Returns the list of all the the message connections which connect publishers and subscribers of a 
	 * certain robot end point
	 * @generated NOT
	 */
	public ArrayList<EndPointMsgConnection> getAssociatedEndPointMsgConnection(RobotEndPoint robotEndPoint){

		ArrayList<EndPointMsgConnection> result = new ArrayList<EndPointMsgConnection>();

		System system = (System)robotEndPoint.eContainer().eContainer();


		for(EndPointMsgConnection connection : system.getEndPointMsgConnections()){

			boolean connectEndPointPublisher = robotEndPoint.getPublishers().contains(connection.getPublisher());
			boolean connectEndPointSubsriber = robotEndPoint.getSubscribers().contains(connection.getSubscriber());

			if(connectEndPointPublisher || connectEndPointSubsriber){

				result.add(connection);

			}
		}
		
		return result;
		
	}

	/**
	 * Returns the list of all the the service connections which connect service servers and clients of a 
	 * certain robot end point
	 * @generated NOT
	 */
	public ArrayList<EndPointSrvConnection> getAssociatedEndPointSrvConnection(RobotEndPoint robotEndPoint){	

		ArrayList<EndPointSrvConnection> result = new ArrayList<EndPointSrvConnection>();

		System system = (System)robotEndPoint.eContainer().eContainer();
		
		for(EndPointSrvConnection connection : system.getEndPointSrvConnections()){
			
			boolean connectEndPointServiceServer = robotEndPoint.getSrvServers().contains(connection.getServer());
			boolean connectEndPointServiceClient = robotEndPoint.getSrvClients().contains(connection.getClient());

			if(connectEndPointServiceServer || connectEndPointServiceClient){

				result.add(connection);

			}

		}
			
		return result;

	}

}
