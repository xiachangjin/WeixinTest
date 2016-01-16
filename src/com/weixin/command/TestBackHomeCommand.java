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
			// �������
			solo.goBackToActivity("LauncherUI");
			solo.sleep(1000);
			Boolean b = solo.searchText("΢��") && solo.searchText("��");
			if (b) {
				Log.d(TAG, "����LauncherUI");
			}
			solo.clickOnText("΢��");
			solo.assertCurrentActivity("����LauncherUI", "LauncherUI");
			solo.sleep(2000);
		}
	}

}
