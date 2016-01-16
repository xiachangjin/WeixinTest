package com.weixin.command;


public class TestAll extends TestWxBase {

	public TestAll() throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	protected void doTest() {
		// TODO Auto-generated method stub
		super.doTest();
		
		new TestTongxunluCommand(this).execute();
		new TestBackHomeCommand(this).execute();
		new TestFaxianCommand(this).execute();
		new TestBackHomeCommand(this).execute();
	}

	@Override
	protected void doFinally() {
		// TODO Auto-generated method stub
		super.doFinally();
	}

}
