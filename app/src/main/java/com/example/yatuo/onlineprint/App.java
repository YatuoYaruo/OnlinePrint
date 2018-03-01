package com.example.yatuo.onlineprint;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by yatuo on 2018/2/28.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
