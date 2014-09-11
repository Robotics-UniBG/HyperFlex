package org.hyperflex.resolutionmodels.xtext.utils;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class ResolutionModelSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new ResolutionModelRuntimeModule();
    }
 
}