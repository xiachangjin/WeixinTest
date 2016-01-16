package com.weixin.command;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;

public class TestLoginCommand implements Command{
	public static final String TAG = "xiacj";
	private static final String name = "+8613600941025";
	private static final String name1 = "13600941025";
	private static final String password = "Keke0210";
	
	private Solo solo;
	private TestWxBase receiver;

	public TestLoginCommand(TestWxBase receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
		this.solo = receiver.getSolo();
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		SharedPreferences preferences = receiver.getInstrumentation().getTargetContext().getSharedPreferences("com.tencent.mm_preferences", 0);
		String login_user_name = preferences.getString("login_user_name", "");
		// �жϵ�ǰ����
		String className = solo.getCurrentActivity().getClass().getSimpleName();
		Log.e(TAG, "className:" + className + "  user:" +  login_user_name);
		
		if (className.equals("LauncherUI"))
		{
			Boolean b1 = solo.searchText("��ݷ�ʽ");
			if (b1) {
				Log.d(TAG, "found ���棺  ��ݷ�ʽ");
				solo.clickOnButton("ȡ��");
			}
			
			Boolean b2 = solo.searchText("��¼");
			Boolean b3 = solo.searchText("����");
			if (b2 && b3) {
				Log.d(TAG, "found ���棺  ��¼������");
				solo.clickOnButton("��¼");
				solo.sleep(2000);
				
				EditText editText;
				String str;
				editText = solo.getEditText(0);
				str = editText.getHint().toString();
				Log.e(TAG, "hint text: " +  str);
				solo.enterText(editText, name1);
				
				editText = solo.getEditText(0);
				str = editText.getHint().toString();
				Log.e(TAG, "hint text: " +  str);
				solo.enterText(editText, password);
				solo.clickOnText("��¼");
			} else {
				Boolean b4 = solo.searchText("��������");
				if (b4) {
					Log.d(TAG, "found ���棺  ��������");
					EditText editText = solo.getEditText(0);
					String str = editText.getHint().toString();
					Log.e(TAG, "hint text: " +  str);
					solo.enterText(editText, password);
					solo.clickOnText("��¼");
				}
			}
		} else {
			solo.assertCurrentActivity("����LoginHistoryUI", "LoginHistoryUI");
			solo.waitForText("�л��ʺ�");
			solo.clickOnText("�л��ʺ�");

			solo.waitForView(ListView.class);
			ListView lv = solo.getView(ListView.class, 0);
			View itemView = lv.getChildAt(1);
			solo.clickOnView(itemView);
			solo.sleep(1000);

			// ���Խ����¼����
			solo.assertCurrentActivity("����LoginUI", "LoginUI");
			solo.waitForView(solo.getButton(0));
			solo.enterText(0, name);
			solo.enterText(1, password);
			solo.clickOnButton(0);
			solo.sleep(1000 * 3);
		}
	}

}
