package it.unibg.robotics.featuremodels.ui.wizards;


import it.unibg.robotics.featuremodels.ui.messages.Messages;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;


public class FMProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private IProject project;

	private IPath myProjectLocation;

	private IPath myContainerPath;

	private IWorkbench myWorkbench;

	private IConfigurationElement myConfig;

	private WizardNewProjectCreationPage projectPage;

	public FMProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		projectPage = new WizardNewProjectCreationPage("projectPage"); //$NON-NLS-1$
		projectPage.setTitle(Messages.ProjectPage_title);
		projectPage.setDescription(Messages.ProjectPage_descr);
		addPage(projectPage);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.myWorkbench = workbench;
		setWindowTitle(Messages.ProjectWizard_wizard_title);
	}

	public boolean performFinish() {
		IPath locationPath = projectPage.getLocationPath();
		myProjectLocation = Platform.getLocation().equals(locationPath) ? null : locationPath;
		myContainerPath = projectPage.getProjectHandle().getFullPath();

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
				project = createProject(myProjectLocation, myContainerPath, monitor);
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			String message = (t != null) ? t.getMessage() : Messages.ProjectWizard_error;
			setErrorMessage(message);
			return false;
		} catch (InterruptedException e) {
			setErrorMessage(e.getMessage());
			return false;
		}
		selectReveal(project);
		BasicNewProjectResourceWizard.updatePerspective(myConfig);
		return true;
	}

	private void setErrorMessage(String message) {
		WizardDialog wd = (WizardDialog) getContainer();
		wd.setErrorMessage(message);
	}

	private void selectReveal(Object target) {
		if (target == null || myWorkbench == null)
			return;

		IWorkbenchPage page = myWorkbench.getActiveWorkbenchWindow().getActivePage();
		final IWorkbenchPart part = page.getActivePart();
		if (part instanceof ISetSelectionTarget) {
			final ISelection targetSelection = new StructuredSelection(target);
			part.getSite().getShell().getDisplay().asyncExec(new Runnable() {

				public void run() {
					((ISetSelectionTarget) part).selectReveal(targetSelection);
				}
			});
		}
	}

	private static IProject createProject(IPath projectlocation, IPath path, IProgressMonitor monitor) throws InterruptedException, CoreException {
		try {
			monitor.beginTask("", 4); //$NON-NLS-1$
			monitor.subTask(Messages.ProjectWizard_perform_title);

			String projectName = path.segment(0);
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IProject project = workspace.getRoot().getProject(projectName);
			URI projectLocationURI = projectlocation == null ? null : URI.createFileURI(projectlocation.toOSString());

			// Clean up any old project information.
			//
			if (!project.exists()) {
				URI location = projectLocationURI;
				if (location == null) {
					location = URI.createFileURI(workspace.getRoot().getLocation().append(projectName).toOSString());
				}
				location = location.appendSegment(IProjectDescription.DESCRIPTION_FILE_NAME);
				File projectFile = new File(location.toString());
				if (projectFile.exists()) {
					projectFile.renameTo(new File(location.toString() + ".old")); //$NON-NLS-1$
				}
			}

			IProjectDescription projectDescription = null;
			projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
			if (projectLocationURI != null) {
				projectDescription.setLocationURI(new java.net.URI(projectLocationURI.toString()));
			}
			project.create(projectDescription, new SubProgressMonitor(monitor, 1));
			project.open(new SubProgressMonitor(monitor, 1));

			return project;
		} catch (URISyntaxException ex) {
			throw new InterruptedException();
		} finally {
			monitor.done();
		}
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) {
		this.myConfig = config;
	}
}
