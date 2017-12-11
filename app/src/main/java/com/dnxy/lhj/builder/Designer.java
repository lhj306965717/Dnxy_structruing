package com.dnxy.lhj.builder;

/**
 * Created by liaohongjie on 2017/12/8.
 *
 *  设计者（公司）
 */

public class Designer {

    public void order(Builder builder){
        builder.makeWindow();
        builder.makeFloor();
    }
}
