package com.bjpowernode.aop02;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("ִ��dosome����");
	}

	@Override
	public String doOther() {
		// TODO Auto-generated method stub
		System.out.println("ִ��doOther��������");
		return "Other !!";
	}

}
