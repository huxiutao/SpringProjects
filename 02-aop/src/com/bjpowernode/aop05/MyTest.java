package com.bjpowernode.aop05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() throws UserException {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\bjpowernode\\aop05\\applicationContext.xml");
		ISomeService bean = (ISomeService)ac.getBean("someServiceProxy");
		bean.doSome();
		String doOther = bean.doOther();
		System.out.println("---> " + doOther);
		
		boolean check = bean.check("admin", "12346");
		
		System.out.println("++++++ > " + check);
		
	}
	
}
