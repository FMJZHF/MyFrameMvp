package com.zhf.myframemvp.di.component;

import com.zhf.myframemvp.di.module.AppModule;
import com.zhf.myframemvp.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:34
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
}