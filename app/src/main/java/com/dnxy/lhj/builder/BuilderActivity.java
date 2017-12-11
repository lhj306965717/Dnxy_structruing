package com.dnxy.lhj.builder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.dnxy.lhj.R;

import lhj.dnxy.com.common.base.BaseActivity;

/**
 * Created by liaohongjie on 2017/12/8.
 */

public class BuilderActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_builder);
    }

    public void make(View view) {

        init();

        init2();
    }

    /**
     * 这是优化的方式
     * 跟创建Dialog的方式相同
     * 说明Dialog也是使用的建造者设计模式
     */
    void init2() {
        com.dnxy.lhj.builder.optimize.Room room = (new com.dnxy.lhj.builder.optimize.WorkBuilder())
                .makeWindow("黑窗")
                .makeFloor("白地板")
                .builde();

        Log.e("TAG", room.toString());
    }

    /**
     * 完全按照建造者设计模式来写
     */
    void init() {

        // 用户需要找设计公司的设计者 绘制 房子的设计图
        Designer designer = new Designer();

        // 用户需要找工人
        WorkBuilder workBuilder = new WorkBuilder();

        // 设计者指挥工人干活
        designer.order(workBuilder);

        Room room = workBuilder.make();

        Log.e("TAG", room.toString());
    }
}
