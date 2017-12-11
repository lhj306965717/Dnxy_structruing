package com.dnxy.lhj.factory;

import android.util.Log;

/**
 * Created by liaohongjie on 2017/12/7.
 */

public class TestFactory {

    /**
     * 工厂模式
     *@author liaohongjie
     *created on 2017/12/7 10:13
     */
    public static void run(){
        // 抽象工厂模式，适用于多种类型的时候使用，便于维护
//        IFactory factory = new AndroidFactory();
//        factory.create();

        // 通过 枚举实现 工厂模式
        StudentEnum studentEnum = StudentEnum.STU_1;
        Log.e("TAG", studentEnum.name());


        // 通过内部类的方式来实现
        StudentFactory.Student student = StudentFactory.getSigle();
        Log.e("TAG", student.name());
    }
}
