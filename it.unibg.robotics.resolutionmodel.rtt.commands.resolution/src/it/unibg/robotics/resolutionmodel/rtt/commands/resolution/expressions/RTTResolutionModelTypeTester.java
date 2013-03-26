package it.unibg.robotics.resolutionmodel.rtt.commands.resolution.expressions;

import it.unibg.robotics.resolutionmodel.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodel.RMResolutionElement;
import it.unibg.robotics.resolutionmodel.ResolutionModel;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTRequiredComponents;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTRequiredConnections;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTTransfConnection;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTTransfImplementation;
import it.unibg.robotics.resolutionmodel.rttresolutionmodel.RTTTransfProperty;

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
