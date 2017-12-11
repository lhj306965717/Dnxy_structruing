package com.dnxy.lhj.factory;

/**
 * Created by liaohongjie on 2017/12/4.
 */

public class IOSFactory implements IFactory {
    @Override
    public IApi create() {
        return new IOSApi();
    }
}
