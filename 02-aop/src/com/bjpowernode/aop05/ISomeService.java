package com.bjpowernode.aop05;

public interface ISomeService {
	void doSome();
	String doOther();
	boolean check(String userName, String password) throws UserException;
}
