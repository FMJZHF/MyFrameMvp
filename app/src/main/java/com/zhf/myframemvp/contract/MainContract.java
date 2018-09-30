package com.zhf.myframemvp.contract;

import com.zhf.myframemvp.base.BasePresenter;
import com.zhf.myframemvp.base.BaseView;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:45
 */
public interface MainContract {
    interface IView extends BaseView {

    }
    interface Presenter extends BasePresenter<IView> {
        void loadData();
    }
}
