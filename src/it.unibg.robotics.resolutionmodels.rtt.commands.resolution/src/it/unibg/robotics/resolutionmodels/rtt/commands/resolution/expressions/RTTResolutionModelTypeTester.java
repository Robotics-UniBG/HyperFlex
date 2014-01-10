package org.hyperflex.resolutionmodels.rtt.commands.resolution.expressions;

import org.hyperflex.resolutionmodels.RMAbstractTransformation;
import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty;

import org.eclipse.core.expressions.PropertyTester;

public class RTTResolutionModelTypeTester extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if (property.equals("is_a_RTT_resolution_model")) {
			ResolutionModel model = (ResolutionModel)receiver;
			
			
			for(RMResolutionElement resElem : model.getResolutionElements()){
				
				if(resElem.getRequiredComponents() instanceof RTTRequiredComponents){
					return true;
				}
				if(resElem.getRequiredConnections() instanceof RTTRequiredConnections){
					return true;
				}
				for(RMAbstractTransformation transf : resElem.getTransformations()){
					
					if(transf instanceof RTTTransfImplementation ||
							transf instanceof RTTTransfProperty ||
							transf instanceof RTTTransfConnection){
						return true;
					}
					
					
				}
				
			}
			
		}
		return false;
	}

}
