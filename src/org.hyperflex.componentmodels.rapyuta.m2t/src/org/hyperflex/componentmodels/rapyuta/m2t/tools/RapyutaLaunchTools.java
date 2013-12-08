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

		ArrayList<CloudContainer> result = new ArrayList<>();

		System system = (System)robotEndPoint.eContainer().eContainer();


		for(EndPointMsgConnection connection : system.getEndPointMsgConnections()){

			boolean connectEndPointPublisher = robotEndPoint.getPublishers().contains(connection.getPublisher());
			boolean connectEndPointSubsriber = robotEndPoint.getPublishers().contains(connection.getSubscriber());

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

}
