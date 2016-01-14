package com.weixin.test;

public class Constants
{
	// 表名
	public static final String TABLE_CALL_TASK = "call_task";// 微招呼任务表
	public static final String TABLE_COMM_TASK = "comm_task";// 微公众任务表
	public static final String TABLE_CHAT_TASK = "chat_task";// 微友聊任务表
	public static final String TABLE_SEARCH_TASK = "search_task";// 微查找任务表

	public static final String TABLE_ACCOUNT = "account";// 账号�?
	public static final String TABLE_POSITION = "position";// 位置�?

	public static final String TABLE_CALL_LOG = "call_log";// 微招呼日志表
	public static final String TABLE_COMM_LOG = "comm_log";// 微公众日志表
	public static final String TABLE_CHAT_LOG = "chat_log";// 微友聊日志表
	public static final String TABLE_GROUP_LOG = "group_log";// 群内添加好友日志�?
	public static final String TABLE_SEARCH_LOG = "search_log";// 微查找日志表

	public static final String TABLE_CALL_LOG_DETAIL = "call_log_detail";// 微招呼日志明细表
	public static final String TABLE_COMM_LOG_DETAIL = "comm_log_detail";// 微公众日志明细表
	public static final String TABLE_CHAT_LOG_DETAIL = "chat_log_detail";// 微友聊日志明细表
	public static final String TABLE_SEARCH_LOG_DETAIL = "search_log_detail";// 微查找日志明细表
	// public static final String TABLE_GROUP_LOG_DETAIL = "group_log_detail";//
	// 群内添加好友日志明细�?
	public static final String TABLE_LINK_LOG_DETAIL = "link_log_detail";// 收藏链接日志明细�?
	public static final String TABLE_CONTACT_LOG_DETAIL = "contact_log_detail";// 联系人加好友日志明细�?
	public static final String TABLE_QQ_LOG_DETAIL = "qq_log_detail";// 联系人加好友日志明细�?
	public static final String TABLE_PRAISE_LOG_DETAIL = "praise_log_detail";// 赞日志明细表
	public static final String TABLE_COMMENT_LOG_DETAIL = "comment_log_detail";// 评论日志明细�?
	public static final String TABLE_SEARCH_UNGO_LOG = "search_ungo_log";// 微查找日志明细表

	public static final String TABLE_UPLOAD_BOOK = "upload_book";// 上传通讯录表
	public static final String TABLE_ACCOUNT_BOOK = "account_book";// 通讯录表
	public static final String TABLE_ACCOUNT_BOOK_LOG_DETAIL = "account_book_log_detail";// 通讯录详情表

	public static final String TABLE_ADDRESS_BOOK = "address_book";// 城市列表

	// 任务服务位置
	public static final String TASK_SERVICE = "com.zyj.weicall.service.WeicallService";
	// 任务广播
	public static final String LOGIN_BROADCAST = "com.zyj.weicall.broadcast.LoginBroadcastReceiver";
	public static final String TASK_BROADCAST = "com.zyj.weicall.broadcast.TaskBroadcastReceiver";
	public static final String TEST_BROADCAST = "com.zyj.weicall.broadcast.TestBroadcastReceiver";
	public static final String TASK_ONEKEY_BROADCAST = "com.zyj.weicall.broadcast.TaskOneKeyBroadcastReceiver";
	public static final String TEST_ONEKEY_BROADCAST = "com.zyj.weicall.broadcast.TestOneKeyBroadcastReceiver";

	// 广播===收到绑定信息
	public static final String BINDING_DEVICE_BROADCAST = "com.zyj.broadcast.BindDeviceReceiver";
	public static final String LINKING_DEVICE_BROADCAST = "com.zyj.broadcast.LinkDeviceReceiver";

	// 默认经纬度�??
	public static final double latitude = 24.489228;
	public static final double longitude = 118.103881;

	// 添加任务
	public static final Integer ADD_TASK = 101;
	public static final Integer ADD_ACCOUNT = 102;

	// 文件选择
	public static final Integer FILE_SELECT_CODE = 201;

	// 默认图片大小
	public static final int IMG_WIDTH = 720;
	public static final int IMG_HEIGHT = 1080;

	// 微信部分AcitivityName
	public static final String WEIXIN = "com.tencent.mm";
	public static final int WX_VERSION_581 = 581;
	// 微信启动后的�?
	public static final String WEIXIN_MAIN = "com.tencent.mm.ui.LauncherUI";
	public static final String WEIXIN_MAIN_SAM = "LauncherUI";
	// 手机号码登录�?
	public static final String WEIXIN_MOBILE = "com.tencent.mm.ui.account.mobile.MobileInputUI";
	// 历史账号登录
	public static final String WEIXIN_HIS_LOGIN = "com.tencent.mm.ui.account.LoginHistoryUI";
	// 账号登录
	public static final String WEIXIN_ACC_LOGIN = "com.tencent.mm.ui.account.LoginUI";
	// 附近的人
	public static final String WEIXIN_NEAR = "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI";
	public static final String WEIXIN_NEAR_SAM = "NearbyFriendsUI";
	// 联系人详�?
	public static final String WEIXIN_CONTACT_INFO = "com.tencent.mm.ui.contact.profile.ContactInfoUI";
	public static final String WEIXIN_CONTACT_SAM = "ContactInfoUI";
	// 打招�?
	public static final String WEIXIN_SAY_HI = "com.tencent.mm.ui.contact.SayHiEditUI";
	public static final String WEIXIN_SAY_SAM = "SayHiEditUI";
	// 设置�?
	public static final String WEIXIN_SETTING = "com.tencent.mm.ui.setting.SettingsUI";
	// 查找公众号页
	public static final String WEIXIN_COMM_SEARCH = "com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI";
	// 搜号码页
	public static final String WEIXIN_CODE_SEARCH = "com.tencent.mm.ui.pluginapp.ContactSearchUI";
	// 搜号码查询结果页
	public static final String WEIXIN_RESULT_SEARCH = "com.tencent.mm.ui.pluginapp.ContactSearchResultUI";
	// 推荐给朋友页
	public static final String WEIXIN_CONV_FRIEND = "com.tencent.mm.ui.transmit.SelectConversationUI";
	// 更多联系人页
	public static final String WEIXIN_SELECT_FRIEND = "com.tencent.mm.ui.contact.SelectContactUI";
	// 聊天�?
	public static final String WEIXIN_CHAT = "com.tencent.mm.ui.chatting.ChattingUI";
	public static final String WEIXIN_CHAT_SAM = "ChattingUI";
	// 查找�?
	public static final String WEIXIN_SEARCH = "com.tencent.mm.plugin.search.ui.SearchUI";
	// 发�?�验证界�?
	public static final String WEIXIN_SAYHI_SNS = "com.tencent.mm.ui.contact.profile.SayHiWithSnsPermissionUI";
	// 个人信息�?6.0.0
	public static final String WEIXIN_PERSON_INFO = "com.tencent.mm.ui.setting.SettingsPersonalInfoUI";
	// 个人信息�?6.2.2
	public static final String WEIXIN_PERSON_INFO_2 = "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI";
	// 绑定手机�?
	public static final String WEIXIN_BIND_PHONE = "com.tencent.mm.ui.bindmobile.BindMContactIntroUI";
	// 选择图片
	public static final String WEIXIN_GALLEY_ALBUMPREVIEWUI = "com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI";
	public static final String WEIXIN_ALBUMPREVIEWUI = "AlbumPreviewUI";

	public static final String WEIXIN_GALLEY_IMAGEPREVIEWUI = "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI";
	public static final String WEIXIN_IMAGEPREVIEWUI = "ImagePreviewUI";

	// 聊天界面选择收藏
	public static final String WEIXIN_SELLECT_COLLECT = "com.tencent.mm.plugin.favorite.ui.FavSelectUI";
	public static final String WEIXIN_SELLECT_SAM = "FavSelectUI";
	// 收藏界面
	public static final String WEIXIN_COLLECT = "com.tencent.mm.plugin.favorite.ui.FavoriteIndexUI";
	public static final String WEIXIN_COLLECT_SAM = "FavoriteIndexUI";

	// 添加好友
	public static final String WEIXIN_ADD_FRIENDS = "com.tencent.mm.ui.pluginapp.AddMoreFriendsUI";
	// 搜索好友
	public static final String WEIXIN_SEARCH_FRIENDS = "com.tencent.mm.plugin.search.ui.FTSAddFriendUI";
	// 搜索好友结果
	public static final String WEIXIN_SEARCH_FRIENDS_DETAILS = "com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI";
	// 联系人详�?
	public static final String WEIXIN_CONTACT_DETAILS = "com.tencent.mm.plugin.profile.ui.ContactInfoUI";
	public static final String WEIXIN_CONTACT_DETAILS_SAM = "ContactInfoUI";

	// 添加好友
	public static final String WEIXIN_CHATROOMINFOUI = "com.tencent.mm.plugin.chatroom.ui.ChatroomInfoUI";

	// 4种任务类�?
	/**
	 * 附近的人加好友任�?
	 * */
	public static final int TASK_CALL_MODE = 1;
	/**
	 * 文字任务
	 * */
	public static final int TASK_WORD_MODE = 2;
	/**
	 * 公众号任�?
	 * */
	public static final int TASK_COMM_MODE = 3;

	/**
	 * 群加好友
	 * */
	public static final int TASK_GROUP_MODE = 4;
	/**
	 * 点赞任务
	 * */
	public static final int TASK_PRAISE_MODE = 5;
	/**
	 * 评论任务
	 * */
	public static final int TASK_COMMENT_MODE = 6;
	/**
	 * 收藏链接任务
	 * */
	public static final int TASK_LINK_MODE = 7;

	/**
	 * 手机通讯录加任务
	 * */
	public static final int TASK_ADDRESS_BOOK_MODE = 8;

	/**
	 * qq增加好友任务
	 * */
	public static final int TASK_QQ_MODE = 9;

	/**
	 * �?键任�?
	 * */
	public static final int TASK_ONE_KEY_MODE = 10;

	// 当前账号�?大支持设置地理位置数
	public static final int MAX_POSITION_SIZE = 5;
	// 附近的人添加好友�?大支持添加时
	public static final int MAX_CALL_DAY_SEND_NUME = 30;// 30,2

	public static final int MAX_WORDS = 48;
	public static final int SEND_TIME_INTERVAL = 1;// 发�?�时间间隔秒�?
	public static final int ONCE_SEND_NUM = 10;// 每个账号每轮发�?�数�?
	public static final int SEND_SAME_MESSAGE_INTERVAL = 1;// 同一个好友接收此信息的间�?

	public static final int DAY_SEND_NUME = 10000;// 群内添加好友总数,10000代指发�?�给该微信号�?有好友，�?有群内好�?

	/**
	 * 附近的人加好友，时间间隔
	 * */
	// public static final int NEARBY_INTRVALTIME = 300000;//5分钟
	public static final int NEARBY_INTRVALTIME = 10800000;// 3小时
}
