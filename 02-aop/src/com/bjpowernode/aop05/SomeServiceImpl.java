package com.bjpowernode.aop05;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行dosome（）");
	}

	@Override
	public String doOther() {
		// TODO Auto-generated method stub
		System.out.println("执行doOther（）方法");
		return "Other !!";
	}

	@Override
	public boolean check(String userName, String password) throws UserException {
		// TODO Auto-generated method stub
		if (!"admin".equals(userName)) {
			throw new UserNameException("输入的  用户名  有错。。。。");
		}
		
		if(!"123456".equals(password)) {
			throw new UserNameException("输入的  密码  有错。。。。");
		}
		return true;
	}

}
