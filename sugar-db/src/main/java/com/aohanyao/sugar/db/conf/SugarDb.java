package com.aohanyao.sugar.db.conf;

import android.content.Context;

/**
 * Created by jc on 2018-06-16.
 * Version:1.0
 * Description: 数据库配置
 * ChangeLog:
 */
public class SugarDb {
    private static Context mContext;


    public static void init(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        return mContext;
    }
}
