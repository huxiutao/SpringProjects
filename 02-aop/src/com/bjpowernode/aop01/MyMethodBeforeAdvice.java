package com.bjpowernode.aop01;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		// ����ҵ�����
		System.out.println("ִ��ǰ��֪ͨ������������");
	}

}
