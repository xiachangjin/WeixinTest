package com.weixin.command;

import android.util.Log;
import android.widget.ListView;

import com.robotium.solo.Solo;

public class TestTongxunluCommand implements Command {
	public static final String TAG = "xiacj";

	private TestWxBase receiver;
	private Solo solo;

	public TestTongxunluCommand(TestWxBase receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
		this.solo = receiver.getSolo();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Log.e(TAG, "TestTongxunluCommand::execute");
		solo.assertCurrentActivity("����LauncherUI", "LauncherUI");
		if (true) {
			// ���ͨѶ¼
			solo.waitForText("ͨѶ¼");
			solo.clickOnText("ͨѶ¼");
			solo.waitForView(ListView.class);
			Log.d(TAG, "����ͨѶ¼");
			solo.sleep(200);
			ListView lv = solo.getView(ListView.class, 1);
			int contact_num = 0;
			if (null != lv) {
				contact_num = lv.getCount() - 3;
			}
			Log.d(TAG, "ͨѶ¼����: " + contact_num);
			solo.sleep(2000);

		}

	}

}
