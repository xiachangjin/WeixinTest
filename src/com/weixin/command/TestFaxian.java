package com.weixin.command;


public class TestFaxian extends TestWxBase {

	public TestFaxian() throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	protected void doTest() {
		// TODO Auto-generated method stub
		super.doTest();

		new TestFaxianCommand(this).execute();
	}

	@Override
	protected void doFinally() {
		// TODO Auto-generated method stub
		super.doFinally();
	}

}
