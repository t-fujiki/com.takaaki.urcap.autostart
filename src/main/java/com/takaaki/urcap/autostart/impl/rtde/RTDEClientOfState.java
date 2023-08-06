package com.takaaki.urcap.autostart.impl.rtde;

import java.io.IOException;

public abstract class RTDEClientOfState extends RTDEClient {
    public ROBOT_MODE prev_robotMode;
    public ROBOT_MODE robotMode;

    public RTDEClientOfState(int frequency) {
        super("127.0.0.1", frequency, "States");

        addOutput(RTDEOutput.robot_mode);
    }

    public abstract void OnPowerOFF();

    public abstract void OnIdle();

    @Override
    public void onReceive(Object[] values) throws IOException {

        int rtde_robot_mode = (Integer) values[0];

        for (ROBOT_MODE _mode : ROBOT_MODE.values()) {
            if (_mode.getType() == rtde_robot_mode) {
                robotMode = _mode;
                break;
            }
        }

        switch (robotMode) {
            case ROBOT_MODE_NO_CONTROLLER:
                break;
            case ROBOT_MODE_DISCONNECTED:
                break;
            case ROBOT_MODE_CONFIRM_SAFETY:
                break;
            case ROBOT_MODE_BOOTING:
                break;
            case ROBOT_MODE_POWER_OFF:
                OnPowerOFF();
                break;
            case ROBOT_MODE_POWER_ON:
                break;
            case ROBOT_MODE_IDLE:
                OnIdle();
                break;
            case ROBOT_MODE_BACKDRIVE:
                break;
            case ROBOT_MODE_RUNNING:
                break;
            case ROBOT_MODE_UPDATING_FIRMWARE:
                break;
            default:
        }

        prev_robotMode = robotMode;
    }

    @Override
    public Object[] onSend() throws IOException {

        return null;
    }

}