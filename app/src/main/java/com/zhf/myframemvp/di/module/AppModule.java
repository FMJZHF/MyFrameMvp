package com.zhf.myframemvp.di.module;

import com.zhf.myframemvp.base.MyApplication;

import dagger.Module;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:34
 */
@Module
public class AppModule {
    private MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }
}
