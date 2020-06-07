package com.gxw.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知
 *    在切点执行方法之后通知
 * @author GXW工作室
 * @date 2020/6/6 0006 - 13:02
 */
public class MyAfterAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("切点方法对象："+method);
        System.out.println("切点方法参数："+objects);
        System.out.println("类的对象："+o);
        System.out.println("执行后置通知!");
    }
}
