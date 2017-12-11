package com.dnxy.lhj.factory;

/**
 * Created by liaohongjie on 2017/12/4.
 */

public class AndroidFactory implements IFactory {
    @Override
    public IApi create() {
        return new AndroidApi();
    }
}
