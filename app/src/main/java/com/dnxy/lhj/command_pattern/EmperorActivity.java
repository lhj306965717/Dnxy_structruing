package com.dnxy.lhj.command_pattern;

import android.os.Bundle;
import android.support.annotation.Nullable;

import lhj.dnxy.com.common.base.BaseActivity;

/**
 * 其他代码都是复制的，但是仔细阅读过
 * */

public class EmperorActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView();

        General general = new General();
        general.attach();
        general.undo();
        /**
         * 不仅仅做隔离
         */
    }
}
