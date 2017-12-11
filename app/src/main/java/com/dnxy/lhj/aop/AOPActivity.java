package com.dnxy.lhj.aop;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.dnxy.lhj.R;

import lhj.dnxy.com.common.base.BaseActivity;

/**
 * Created by liaohongjie on 2017/12/7.
 */

public class AOPActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aop);
    }

    /**
     * 读书
     *
     * @param view
     */
    @BehaviorTrace(value="读书", type = 1) // 注意：方式
    public void dushu(View view) {

        /**
         * 现在需要统计读书的时间，并且不能直接在这里面写
         * 把读书这个功能模块给切出来
         * */

        {
            Log.e("TAG","正在读书...");
            SystemClock.sleep(5000);
        }
    }

    /**
     * 写字
     *
     * @param view
     */
    public void xiezi(View view) {
        {
            Log.e("TAG","正在写字...");
            SystemClock.sleep(3000);
        }
    }

    /**
     * 上课
     *
     * @param view
     */
    public void shangke(View view) {
        {
            Log.e("TAG","正在上课...");
            SystemClock.sleep(8000);
        }
    }
}
