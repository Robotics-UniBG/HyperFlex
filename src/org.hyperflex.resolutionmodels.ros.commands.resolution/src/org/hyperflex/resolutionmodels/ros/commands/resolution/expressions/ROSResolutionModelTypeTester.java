package org.hyperflex.resolutionmodels.ros.commands.resolution.expressions;

import org.eclipse.core.expressions.PropertyTester;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTemplateSystemModel;

public class ROSResolutionModelTypeTester extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if (property.equals("is_a_ROS_resolution_model")) {
			ResolutionModel model = (ResolutionModel)receiver;
			
			if(model.getTemplateSystemModel() instanceof ROSTemplateSystemModel){
				return true;
			}
			
//			for(RMResolutionElement resElem : model.getResolutionElements()){
//				
//				if(resElem.getRequiredComponents() instanceof ROSRequiredComponents){
//					return true;
//				}
//				if(resElem.getRequiredConnections() instanceof ROSRequiredConnections){
//					return true;
//				}
//				for(RMAbstractTransformation transf : resElem.getTransformations()){
//					
//					if(transf instanceof ROSTransfImplementation ||
//							transf instanceof ROSTransfProperty ||
//							transf instanceof ROSTransfConnection){
//						return true;
//					}
//					
//					
//				}
//				
//			}
			
		}
		return false;
	}

}
