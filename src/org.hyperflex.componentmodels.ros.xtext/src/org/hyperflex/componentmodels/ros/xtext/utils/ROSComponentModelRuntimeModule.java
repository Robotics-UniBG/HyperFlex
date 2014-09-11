package org.hyperflex.componentmodels.ros.xtext.utils;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class ROSComponentModelRuntimeModule extends AbstractGenericResourceRuntimeModule{
	
	
    @Override
    protected String getLanguageName() {
        return "org.hyperflex.roscomponentmodel.presentation.roscomponentmodelEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
    	return "roscomponentmodel";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return ROSComponentModelResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return ROSComponentModelQualifiedNameProvider.class;
    }

}
