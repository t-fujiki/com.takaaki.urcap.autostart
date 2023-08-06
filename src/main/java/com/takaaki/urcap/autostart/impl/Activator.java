package com.takaaki.urcap.autostart.impl;

import com.ur.urcap.api.contribution.InstallationNodeService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {

		AutoRunningInstallationNodeService statusMonitorInstallationNodeService = new AutoRunningInstallationNodeService();

		context.registerService(InstallationNodeService.class, statusMonitorInstallationNodeService, null);

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {

	}
}
