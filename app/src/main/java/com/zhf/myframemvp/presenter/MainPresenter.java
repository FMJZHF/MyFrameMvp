package com.zhf.myframemvp.presenter;

import com.zhf.myframemvp.base.BaseMvpPresenter;
import com.zhf.myframemvp.contract.MainContract;

import javax.inject.Inject;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:46
 */
public class MainPresenter extends BaseMvpPresenter<MainContract.IView>
        implements MainContract.Presenter {

    @Inject
    MainPresenter() {
    }

    @Override
    public void loadData() {
        baseView.showTipMsg("加载数据");
    }
}
