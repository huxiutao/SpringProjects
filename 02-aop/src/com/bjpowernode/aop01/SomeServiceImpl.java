package com.bjpowernode.aop01;

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

}
