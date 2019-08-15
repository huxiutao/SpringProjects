package com.bjpowernode.aop05;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知
 * @author Administrator
 *
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(UserException ex) {
		System.out.println("用户名有错误，异常通知");
	}
	
	public void afterThrowing(PasswordException ex) {
		System.out.println("密码有错误，异常通知");
	}
}
