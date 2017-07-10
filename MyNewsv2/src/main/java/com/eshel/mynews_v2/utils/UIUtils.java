package com.eshel.mynews_v2.utils;

import android.content.Context;
import android.content.res.Resources;

import com.eshel.mynews_v2.base.MyNewsApp;

/**
 * 项目名称: MyNews_v2
 * 创建人: Eshel
 * 创建时间:2017/7/10 11时21分
 * 描述: TODO
 */

public class UIUtils {

	public static Context getContext(){
		return MyNewsApp.getContext();
	}
	public static String getPackageName() {
		return getContext().getPackageName();
	}
	public static Resources getResources(){
		return getContext().getResources();
	}

	public static String getString(int resId) {
		return getResources().getString(resId);
	}
}
