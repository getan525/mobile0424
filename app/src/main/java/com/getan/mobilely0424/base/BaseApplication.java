package com.getan.mobilely0424.base;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class BaseApplication extends Application {
    private static BaseApplication mInstance;
    public static BaseApplication getInstance() {
        if (mInstance!=null){
            mInstance = new BaseApplication();
        }
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}
