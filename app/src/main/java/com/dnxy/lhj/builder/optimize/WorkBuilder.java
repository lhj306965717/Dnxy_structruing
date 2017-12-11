package com.dnxy.lhj.builder.optimize;

/**
 * Created by liaohongjie on 2017/12/8.
 * <p>
 * 具体的工人
 */

public class WorkBuilder {

    private RoomOption mMakeOption;

    public WorkBuilder() {
        mMakeOption = new RoomOption();
    }

    public WorkBuilder makeWindow(String window) {
        mMakeOption.window = window;
        return this;
    }

    public WorkBuilder makeFloor(String floor) {
        mMakeOption.floor = floor;
        return this;
    }

    public Room builde() {
        Room room = new Room();
        room.applay(mMakeOption);
        return room;
    }

    public class RoomOption {
        public String window;
        public String floor;
    }
}
