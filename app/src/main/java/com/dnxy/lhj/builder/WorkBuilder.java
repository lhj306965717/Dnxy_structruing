package com.dnxy.lhj.builder;


/**
 * Created by liaohongjie on 2017/12/8.
 * <p>
 * 具体的工人
 */

public class WorkBuilder implements Builder {

    private Room mRoom;

    public WorkBuilder() {
        mRoom = new Room();
    }

    public void makeWindow() {
        mRoom.setWindow("窗子");
    }

    @Override
    public void makeFloor() {
        mRoom.setFloor("地板");
    }

    public Room make(){
        return mRoom;
    }
}
