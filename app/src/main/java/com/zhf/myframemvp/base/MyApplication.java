package com.zhf.myframemvp.base;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.zhf.myframemvp.di.component.AppComponent;
import com.zhf.myframemvp.di.component.DaggerAppComponent;
import com.zhf.myframemvp.di.module.AppModule;
import com.zhf.myframemvp.di.module.HttpModule;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/29 11:49
 */
public class MyApplication  extends Application {

    private static MyApplication instance;

    private static AppComponent appComponent;

    public static MyApplication getInstance() {
        return instance;
    }

    private void setInstance(MyApplication instance) {
        MyApplication.instance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);
        initLeakCanary();
    }

    /**
     * 初始化内存检测工具
     * 用于检测项目中内存泄漏情况
     */
    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }

    /**
     * 获取AppComponent.
     *
     * @return AppComponent
     */
    public static synchronized AppComponent getAppComponent() {
        if (null == appComponent) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(getInstance()))
                    .httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }

}

