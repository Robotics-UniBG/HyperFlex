package it.unibg.robotics.resolutionmodels.rtt.commands.resolution.expressions;

import it.unibg.robotics.resolutionmodels.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodels.RMResolutionElement;
import it.unibg.robotics.resolutionmodels.ResolutionModel;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfConnection;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfImplementation;
import it.unibg.robotics.resolutionmodels.rttresolutionmodels.RTTTransfProperty;

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
