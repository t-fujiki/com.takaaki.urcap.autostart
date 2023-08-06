package com.takaaki.urcap.autostart.impl.rtde;


public enum RUNTIME_STATE {
    RUNTIME_STATE_STOPPING(0), /* */
    RUNTIME_STATE_STOPPED(1), /* */
    RUNTIME_STATE_PLAYING(2), /* */
    RUNTIME_STATE_PAUSING(3), /* */
    RUNTIME_STATE_PAUSED(4), /* */
    RUNTIME_STATE_RESUMING(5);

    private int ptype;


    private RUNTIME_STATE(int ptype) {
        this.ptype = ptype;
    }


    public int getType() {
        return ptype;
    }

}