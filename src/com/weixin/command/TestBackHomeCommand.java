package com.weixin.command;

import android.util.Log;

import com.robotium.solo.Solo;

public class TestBackHomeCommand implements Command{
	public static final String TAG = "xiacj";
	
	private Solo solo;
	private TestWxBase receiver;

	public TestBackHomeCommand(TestWxBase receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
		this.solo = receiver.getSolo();
	}
	
	@Override
	public void execute() {
		Log.e(TAG, "try>>>>>>>>>>>>>>>>>>>>>>>>");

		if (true)
		{
			// 点击发现
			solo.goBackToActivity("LauncherUI");
			solo.sleep(1000);
			Boolean b = solo.searchText("微信") && solo.searchText("我");
			if (b) {
				Log.d(TAG, "进入LauncherUI");
			}
			solo.clickOnText("微信");
			solo.assertCurrentActivity("进入LauncherUI", "LauncherUI");
			solo.sleep(2000);
		}
	}

}
