package org.hyperflex.resolutionmodels.xtext.utils;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class ResolutionModelRuntimeModule extends AbstractGenericResourceRuntimeModule{
	
	
    @Override
    protected String getLanguageName() {
        return "org.hyperflex.resolutionmodels.presentation.resolutionmodelsEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
    	return "resolutionmodel";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return ResolutionModelResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return ResolutionModelQualifiedNameProvider.class;
    }

}
