package org.hyperflex.ui.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private Messages() {
	}

	private static final String BUNDLE_NAME = "messages"; //$NON-NLS-1$

	
	public static String ProjectWizard_wizard_title;

	public static String ProjectWizard_perform_title;

	public static String ProjectWizard_error;

	public static String ProjectPage_title;

	public static String ProjectPage_descr;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
