package com.bjpowernode.aop04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\bjpowernode\\aop04\\applicationContext.xml");
		ISomeService bean = (ISomeService)ac.getBean("someServiceProxy");
		bean.doSome();
		String doOther = bean.doOther();
		System.out.println("---> " + doOther);
		
	}
	
}
