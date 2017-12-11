package com.dnxy.lhj.builder;


/**
 * Created by liaohongjie on 2017/12/8.
 *
 *  抽象层，包工头
 */

public interface Builder {

    void makeWindow();

    void makeFloor();

    Room make();
}
