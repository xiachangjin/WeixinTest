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
		solo.assertCurrentActivity("����LauncherUI", "LauncherUI");
		if (true)
		{
			// �������
			solo.waitForText("����");
			solo.clickOnText("����");
			solo.sleep(1000);
			Boolean b = solo.searchText("����Ȧ") && solo.searchText("����");
			if (b) {
				Log.d(TAG, "���뷢��");
			}
			solo.sleep(2000);
		}
	}

}
