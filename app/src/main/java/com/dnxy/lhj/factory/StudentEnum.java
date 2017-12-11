package com.dnxy.lhj.factory;

/**
 * Created by liaohongjie on 2017/12/5.
 */

public enum StudentEnum {

    // 通过枚举实现单例

    STU_1(1), STU_2(2), STU_3(3);

    int a;
    StudentEnum(int a){
        this.a = a;
    }
}
