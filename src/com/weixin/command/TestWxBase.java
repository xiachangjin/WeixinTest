package com.weixin.command;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import com.robotium.solo.Solo;
import com.weixin.test.Constants;

@SuppressWarnings("rawtypes")
public class TestWxBase extends ActivityInstrumentationTestCase2 {
	private static final String TAG = "xiacj";
	protected Solo solo;

	@SuppressWarnings({ "unchecked", "deprecation" })
	public TestWxBase() throws ClassNotFoundException {
		super(Constants.WEIXIN, Class.forName(Constants.WEIXIN_MAIN));
		Log.w(TAG, "TestWxBase::TestWxLogin ...");
	}

	@Override
	protected void setUp() throws Exception {
		Log.d("xiacj", "TestWxBase::setUp()");
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	protected void tearDown() throws Exception {
		Log.d("xiacj", "TestWxBase::tearDown()");
		// TODO Auto-generated method stub
		try {
			solo.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		// this.getActivity().fileList();
		super.tearDown();
	}

	protected void doTest() {
		Log.d("xiacj", "TestWxBase::doTest()");
	}

	protected void doFinally() {
		Log.d("xiacj", "TestWxBase::doFinally()");
	}

	public Solo getSolo() {
		return solo;
	}
	
	public void testBase() {
		Log.d("xiacj", "TestWxBase::testBase()");

		new TestLoginCommand(this).execute();

		try {
			Log.d(TAG, "Test>>>>>>>>>>>>>>>>>>>>>>>>doTest");
			doTest();
		} catch (Exception e) {
			Log.e(TAG, "catch£ºException e:" + e.getMessage());
		} finally {
			Log.d(TAG, "finally>>>>>>>>>>>>>>>>>>>>>>>>doFinally");
			doFinally();
		}
		solo.sleep(1000 * 3);
	}
}
