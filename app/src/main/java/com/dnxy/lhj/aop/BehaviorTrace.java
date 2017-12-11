package com.dnxy.lhj.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liaohongjie on 2017/12/7.
 */

@Target(ElementType.METHOD) // 此注解会使用位置
@Retention(RetentionPolicy.RUNTIME) // 注解保留的时效
public @interface BehaviorTrace {

    //注意： 如果在注解中 没有给方法设置默认的返回值，那么在使用注解的地方一定需要设置值

    String value(); // 注解中只有方法，没有属性
    int type();
}
