package com.zhf.myframemvp;


import android.os.Bundle;

import com.zhf.myframemvp.base.BaseActivity;

/**
 *
 * @author zhf QQ:578121695
 * @time 2018/9/29 14:57
 */
public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        super.initData();
        initToolbar(true,false,true).setMyTitle("主页").setMoreTitle("更多");
    }
}
