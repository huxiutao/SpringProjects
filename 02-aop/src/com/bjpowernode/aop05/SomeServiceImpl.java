package com.bjpowernode.aop05;

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

	@Override
	public boolean check(String userName, String password) throws UserException {
		// TODO Auto-generated method stub
		if (!"admin".equals(userName)) {
			throw new UserNameException("�����  �û���  �д�������");
		}
		
		if(!"123456".equals(password)) {
			throw new UserNameException("�����  ����  �д�������");
		}
		return true;
	}

}
