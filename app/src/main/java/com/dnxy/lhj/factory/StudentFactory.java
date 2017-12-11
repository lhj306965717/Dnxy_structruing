package com.dnxy.lhj.factory;

/**
 * Created by liaohongjie on 2017/12/5.
 */

public class StudentFactory {

    // 最优雅的内部类单列模式写法

    public static class Student{
        private static final Student sStudent = new Student();

        public String name(){
            return getClass().getSimpleName();
        }
    }

    public static Student getSigle(){
        return Student.sStudent;
    }
}
