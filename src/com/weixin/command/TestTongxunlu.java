package com.weixin.command;


public class TestTongxunlu extends TestWxBase {

	public TestTongxunlu() throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	protected void doTest() {
		// TODO Auto-generated method stub
		super.doTest();
		
		new TestTongxunluCommand(this).execute();
	}

	@Override
	protected void doFinally() {
		// TODO Auto-generated method stub
		super.doFinally();
	}

}
