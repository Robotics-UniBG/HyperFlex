package org.hyperflex.componentmodels.ros.xtext.utils;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class ROSComponentModelSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new ROSComponentModelRuntimeModule();
    }
 
}