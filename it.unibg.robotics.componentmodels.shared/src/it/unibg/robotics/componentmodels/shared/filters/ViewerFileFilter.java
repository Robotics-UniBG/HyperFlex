package it.unibg.robotics.componentmodels.shared.filters;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class ViewerFileFilter extends ViewerFilter {

	private String extension;
	
	public ViewerFileFilter(String extension){
		this.extension = extension;
	}
	
	public String getExtension(){
		return extension;
	}
	
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		
		if(element instanceof IFile){
			if(((IFile)element).getFileExtension().equals(extension)){
				return true;
			}else{
				return false;
			}
		}else if(element instanceof IFolder){
			return true;
		}else if(element instanceof IProject){
			return true;
		}else{
			return false;
		}
		
	}

}
