package com.bjpowernode.aop04;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知
 * @author Administrator
 *
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("异常通知");
	}
}
