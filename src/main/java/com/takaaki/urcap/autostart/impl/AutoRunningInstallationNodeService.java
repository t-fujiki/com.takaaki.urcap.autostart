package com.takaaki.urcap.autostart.impl;

import com.ur.urcap.api.contribution.InstallationNodeContribution;
import com.ur.urcap.api.contribution.InstallationNodeService;
import com.ur.urcap.api.domain.URCapAPI;

import java.io.InputStream;

import com.ur.urcap.api.domain.data.DataModel;

public class AutoRunningInstallationNodeService implements InstallationNodeService {

	public AutoRunningInstallationNodeContribution contribution = null;

	public AutoRunningInstallationNodeService() {

	}

	@Override
	public InstallationNodeContribution createInstallationNode(URCapAPI api, DataModel model) {

		contribution = new AutoRunningInstallationNodeContribution(api, model);

		return contribution;
	}

	@Override
	public String getTitle() {
		return ThisConstants.INSTALLATION_TITLE_EN;
	}

	@Override
	public InputStream getHTML() {

		return this.getClass()
				.getResourceAsStream("/com/takaaki/urcap/" + ThisConstants.ARTIFACTID + "/impl/installation_en.html");

	}
}
