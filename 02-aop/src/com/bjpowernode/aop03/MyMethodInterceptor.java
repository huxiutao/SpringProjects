package com.bjpowernode.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��֮ǰ������");
		Object result = invocation.proceed();
		
		if(result !=null) {
			result = ((String)result).toUpperCase();
		}
		
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��֮�󡣡�");
		return result;
	}

}
