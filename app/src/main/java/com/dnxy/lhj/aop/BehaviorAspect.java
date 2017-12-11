package com.dnxy.lhj.aop;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liaohongjie on 2017/12/7.
 *
 * 开始切功能模块
 */
@Aspect // 注意：一定要有注解
public class BehaviorAspect {

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /** 一定要按照这个标准来写，否则会出现问题 */
    /**  注意：  * *(..)  这部分怎么解释：* *表示任何的方法名(只要是使用了BehaviorTrace的)，而括号中的..表示任何参数类型  */
    @Pointcut("execution(@com.dnxy.lhj.aop.BehaviorTrace  * *(..))")
    public void annoBehavior(){
        Log.e("TAG", "执行切点....");
    }

    /** 注意：切点 和执行方法上面注解一定不能写错，否则就不会调用成功 */

    // 注意：这里的切点
    @Around("annoBehavior()")
    public Object dealPoint(ProceedingJoinPoint point) { // 如果有异常不要抛，直接try

        // 返回方法签名
        MethodSignature signature = (MethodSignature) point.getSignature();

        // 拿到注解对象
        BehaviorTrace behaviorTrace = signature.getMethod().getAnnotation(BehaviorTrace.class);

        // 得到注解值
        String value = behaviorTrace.value();
        int type = behaviorTrace.type();

        Log.e("TAG","当前时间：   "+simpleDateFormat.format(new Date()));

        long begin = System.currentTimeMillis();

        Object obj = null;

        try {
            // 重点代码：执行注解方法
            obj = point.proceed();
        } catch (Throwable throwable) {

        }

        Log.e("TAG", value + "--->消耗时间："+ (System.currentTimeMillis() - begin) + " ms");

        return obj;
    }
}
