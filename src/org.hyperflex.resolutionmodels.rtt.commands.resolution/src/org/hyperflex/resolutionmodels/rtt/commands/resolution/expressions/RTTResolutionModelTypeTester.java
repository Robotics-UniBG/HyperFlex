package org.hyperflex.resolutionmodels.rtt.commands.resolution.expressions;

import org.eclipse.core.expressions.PropertyTester;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel;

public class RTTResolutionModelTypeTester extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if (property.equals("is_a_RTT_resolution_model")) {
			ResolutionModel model = (ResolutionModel)receiver;
			
			if(model.getTemplateSystemModel() instanceof OrocosTemplateSystemModel){
				return true;
			}
			
//			for(RMResolutionElement resElem : model.getResolutionElements()){
//				
//				if(resElem.getRequiredComponents() instanceof RTTRequiredComponents){
//					return true;
//				}
//				if(resElem.getRequiredConnections() instanceof RTTRequiredConnections){
//					return true;
//				}
//				for(RMAbstractTransformation transf : resElem.getTransformations()){
//					
//					if(transf instanceof RTTTransfImplementation ||
//							transf instanceof RTTTransfProperty ||
//							transf instanceof RTTTransfConnection){
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
