package com.bjpowernode.aop04;

import org.springframework.aop.ThrowsAdvice;

/**
 * �쳣֪ͨ
 * @author Administrator
 *
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("�쳣֪ͨ");
	}
}
