package com.weixin.command;

import android.util.Log;

import com.robotium.solo.Solo;

public class TestFaxianCommand implements Command{
	public static final String TAG = "xiacj";
	
	private Solo solo;
	private TestWxBase receiver;

	public TestFaxianCommand(TestWxBase receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
		this.solo = receiver.getSolo();
	}
	
	@Override
	public void execute() {
		Log.e(TAG, "try>>>>>>>>>>>>>>>>>>>>>>>>");
		solo.assertCurrentActivity("进入LauncherUI", "LauncherUI");
		if (true)
		{
			// 点击发现
			solo.waitForText("发现");
			solo.clickOnText("发现");
			solo.sleep(1000);
			Boolean b = solo.searchText("朋友圈") && solo.searchText("购物");
			if (b) {
				Log.d(TAG, "进入发现");
			}
			solo.sleep(2000);
		}
	}

}
