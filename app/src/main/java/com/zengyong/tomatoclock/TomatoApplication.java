package com.zengyong.tomatoclock;

import android.app.Application;
import android.util.Log;

import com.zengyong.tomatoclock.utils.ObjectBox;

import io.objectbox.android.AndroidObjectBrowser;

/**
 * @author : Zeyo
 * e-mail : zengyongsun@163.com
 * date   : 2019/4/11 13:13
 * desc   :
 * version: 1.0
 */
public class TomatoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ObjectBox.init(this);

    }
}
