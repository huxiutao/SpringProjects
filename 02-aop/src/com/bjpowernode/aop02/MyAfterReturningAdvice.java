package com.bjpowernode.aop02;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

// ����֪ͨ
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	/**
	 * returnValue��Ŀ�귽���ķ���ֵ����Ŀ�귽��û�з���ֵ����Ϊnull
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("����֪ͨ");
		System.out.println("==>>> " + returnValue);
	}

}
