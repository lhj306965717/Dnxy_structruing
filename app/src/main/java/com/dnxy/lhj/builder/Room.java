package com.dnxy.lhj.builder;

import com.dnxy.lhj.builder.optimize.WorkBuilder;

/**
 * Created by liaohongjie on 2017/12/8.
 *  创造的房子
 */

public class Room {

    private String window;
    private String floor;

    public void setWindow(String window) {
        this.window = window;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "房子："+ window + "  :  "+floor;
    }
}
