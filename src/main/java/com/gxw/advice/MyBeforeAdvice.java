package com.gxw.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知
 *    在切点执行方法之前通知
 * @author GXW工作室
 * @date 2020/6/6 0006 - 12:49
 */
public class MyBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("切点方法对象："+method);
        System.out.println("切点方法参数："+objects);
        System.out.println("类的对象："+o);
        System.out.println("执行前置通知!");
    }
}
