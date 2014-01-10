package org.hyperflex.resolutionmodels.ros.commands.resolution.expressions;

import org.hyperflex.resolutionmodels.RMAbstractTransformation;
import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfProperty;

import org.eclipse.core.expressions.PropertyTester;

public class ROSResolutionModelTypeTester extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if (property.equals("is_a_ROS_resolution_model")) {
			ResolutionModel model = (ResolutionModel)receiver;
			
			for(RMResolutionElement resElem : model.getResolutionElements()){
				
				if(resElem.getRequiredComponents() instanceof ROSRequiredComponents){
					return true;
				}
				if(resElem.getRequiredConnections() instanceof ROSRequiredConnections){
					return true;
				}
				for(RMAbstractTransformation transf : resElem.getTransformations()){
					
					if(transf instanceof ROSTransfImplementation ||
							transf instanceof ROSTransfProperty ||
							transf instanceof ROSTransfConnection){
						return true;
					}
					
					
				}
				
			}
			
		}
		return false;
	}

}
