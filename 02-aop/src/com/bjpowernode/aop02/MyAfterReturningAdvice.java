package com.bjpowernode.aop02;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

// 后置通知
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	/**
	 * returnValue：目标方法的返回值，若目标方法没有返回值，则为null
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("后置通知");
		System.out.println("==>>> " + returnValue);
	}

}
