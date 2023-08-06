package com.takaaki.urcap.autostart.impl;

import com.takaaki.urcap.autostart.impl.dashboard.DashboardClient;
import com.takaaki.urcap.autostart.impl.rtde.ROBOT_MODE;
import com.takaaki.urcap.autostart.impl.rtde.RTDEClientOfState;
import com.ur.urcap.api.contribution.InstallationNodeContribution;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;
import com.ur.urcap.api.ui.annotation.Input;
import com.ur.urcap.api.ui.component.InputEvent;
import com.ur.urcap.api.ui.component.*;
import com.ur.urcap.api.ui.component.InputEvent.EventType;



public class AutoRunningInstallationNodeContribution implements InstallationNodeContribution {

	public URCapAPI api;
	public DataModel model;

	public DashboardClient dashboardClient;
	public RTDEClientOfState rtdeClientOfState;

	public ROBOT_MODE prev_robotMode;
	public ROBOT_MODE robotMode;

	public boolean goto_powerOn;
	public boolean goto_brakeRelease;

	@Input(id = "inputCheckPower")
	private InputCheckBox inputCheckPower;

	@Input(id = "inputCheckPower")
	private void onChange_inputCheckPower(InputEvent event) {
		if (event.getEventType() == EventType.ON_CHANGE) {
			model.set("inputCheckPower", inputCheckPower.isSelected());
		}
	}

	private void updateForm() {
		inputCheckPower.setSelected(model.get("inputCheckPower", false));

	}

	/**
	 * コストラクタ
	 * 
	 * @param api   urcapAPI
	 * @param model データモデル
	 */
	public AutoRunningInstallationNodeContribution(URCapAPI api, DataModel model) {
		this.api = api;
		this.model = model;

		dashboardClient = new DashboardClient("127.0.0.1");

		if (model.get("inputCheckPower", false)) {

			rtdeClientOfState = new RTDEClientOfState(20) {
				@Override
				public void OnIdle() {
					dashboardClient.brakeRelease();
				}

				@Override
				public void OnPowerOFF() {
					dashboardClient.powerOn();

				}
			};

			rtdeClientOfState.start();

		}

	}

	@Override
	public void openView() {

		updateForm();

	}

	@Override
	public void closeView() {

	}

	public boolean isDefined() {
		return false;
	}

	@Override
	public void generateScript(ScriptWriter writer) {

	}

}