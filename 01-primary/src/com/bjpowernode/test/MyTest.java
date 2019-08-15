package com.bjpowernode.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjpowernode.service.ISomeService;

public class MyTest {
	
	@Test
	public void test01() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService bean = (ISomeService)ac.getBean("someService");
		bean.doSome();
		
	}
	
}
