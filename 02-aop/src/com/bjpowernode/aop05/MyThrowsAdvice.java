package com.bjpowernode.aop05;

import org.springframework.aop.ThrowsAdvice;

/**
 * �쳣֪ͨ
 * @author Administrator
 *
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(UserException ex) {
		System.out.println("�û����д����쳣֪ͨ");
	}
	
	public void afterThrowing(PasswordException ex) {
		System.out.println("�����д����쳣֪ͨ");
	}
}
