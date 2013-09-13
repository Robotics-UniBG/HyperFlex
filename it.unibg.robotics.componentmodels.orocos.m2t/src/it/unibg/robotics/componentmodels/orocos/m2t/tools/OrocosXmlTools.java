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

import it.unibg.robotics.orocoscomponentmodel.AbstractComponent;
import it.unibg.robotics.orocoscomponentmodel.Composite;
import it.unibg.robotics.orocoscomponentmodel.ConnectionPolicy;
import it.unibg.robotics.orocoscomponentmodel.DataPort;
import it.unibg.robotics.orocoscomponentmodel.TaskContext;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;


public class OrocosXmlTools {
	
	public OrocosXmlTools() {	
		
	}

	public ArrayList<ConnectionPolicy> getConnections(DataPort port){
		
		ArrayList<ConnectionPolicy> result = new ArrayList<ConnectionPolicy>();
		
		AbstractComponent component = (AbstractComponent) port.eContainer();
		
		if(component instanceof TaskContext){
			
			Composite composite = (Composite)component.eContainer();
			
			EList<ConnectionPolicy> compositeConnections = composite.getConnectionPolicies();
			
			for(ConnectionPolicy conn : compositeConnections){
				
				if(conn.getSource().equals(port) || conn.getTarget().equals(port)){
					result.add(conn);
				}
				
			}
			
			
		}else if(component instanceof Composite){
			
		}
		
		return result;
	}
	
	

}
