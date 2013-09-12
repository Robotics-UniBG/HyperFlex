package it.unibg.robotics.componentmodels.ros.m2t.tools;

import java.util.List;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.types.AbstractToolNativeTypeDelegate;

public class ConfigFileCreatorNativeTypeDelegate extends AbstractToolNativeTypeDelegate {
	public Object createInstance(String clazz, List<Object> parameters) throws EolRuntimeException {
		return new ConfigFileCreator();
	}

	public boolean knowsAbout(String clazz) {
		if(clazz == ConfigFileCreator.class.toString())
			return true;
		else
			return false;
	}

}
