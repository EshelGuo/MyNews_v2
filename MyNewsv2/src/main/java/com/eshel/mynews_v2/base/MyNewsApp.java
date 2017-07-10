package com.eshel.mynews_v2.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * 项目名称: MyNews_v2
 * 创建人: Eshel
 * 创建时间:2017/7/10 11时06分
 * 描述: 全局 Application
 */

public class MyNewsApp extends Application{
private static Context mContext;
private static Handler mMainThreadHandler;
	@Override
	public void onCreate() {
		super.onCreate();
		this.mContext = getApplicationContext();
		this.mMainThreadHandler = new Handler();
	}

	public static Context getContext() {
		return mContext;
	}

	public static Handler getMainThreadHandler() {
		return mMainThreadHandler;
	}
}
