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
		solo.assertCurrentActivity("进入LauncherUI", "LauncherUI");
		if (true) {
			// 点击通讯录
			solo.waitForText("通讯录");
			solo.clickOnText("通讯录");
			solo.waitForView(ListView.class);
			Log.d(TAG, "进入通讯录");
			solo.sleep(200);
			ListView lv = solo.getView(ListView.class, 1);
			int contact_num = 0;
			if (null != lv) {
				contact_num = lv.getCount() - 3;
			}
			Log.d(TAG, "通讯录条数: " + contact_num);
			solo.sleep(2000);

		}

	}

}
