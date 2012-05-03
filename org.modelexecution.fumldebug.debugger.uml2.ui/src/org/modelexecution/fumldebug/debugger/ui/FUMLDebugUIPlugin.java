package org.modelexecution.fumldebug.debugger.ui;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class FUMLDebugUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.modelexecution.fumldebug.debugger.ui"; //$NON-NLS-1$
	private final static String ICONS_PATH = "icons/"; //$NON-NLS-1$

	// The shared instance
	private static FUMLDebugUIPlugin plugin;

	// Images
	public final static String IMG_ACTIVITY_LAUNCH = "IMG_ACTIVITY_LAUNCH"; //$NON-NLS-1$
	public final static String IMG_ACTIVITY = "IMG_ACTIVITY"; //$NON-NLS-1$

	public FUMLDebugUIPlugin() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static FUMLDebugUIPlugin getDefault() {
		return plugin;
	}

	protected void initializeImageRegistry(ImageRegistry reg) {
		declareImage(IMG_ACTIVITY_LAUNCH, ICONS_PATH + "ActivityLaunch.png"); //$NON-NLS-1$
		declareImage(IMG_ACTIVITY, ICONS_PATH + "Activity.gif"); //$NON-NLS-1$
	}

	private void declareImage(String key, String path) {
		Bundle bundle = Platform.getBundle(PLUGIN_ID);
		if (path != null) {
			URL iconURL = FileLocator.find(bundle, new Path(path), null);
			if (iconURL != null) {
				ImageDescriptor descriptor = ImageDescriptor
						.createFromURL(iconURL);
				super.getImageRegistry().put(key, descriptor);
			}
		}
	}

}
