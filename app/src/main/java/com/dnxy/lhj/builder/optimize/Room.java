package com.dnxy.lhj.builder.optimize;

import android.util.Log;

/**
 * Created by liaohongjie on 2017/12/8.
 *  创造的房子
 */

public class Room {

    private String window;
    private String floor;

    public void applay(WorkBuilder.RoomOption option){
        this.window = option.window;
        this.floor = option.floor;
    }

    @Override
    public String toString() {
        return "房子："+ window + "  :  "+floor;
    }
}
