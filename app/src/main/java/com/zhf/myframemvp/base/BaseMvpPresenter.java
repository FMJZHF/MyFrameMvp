package com.zhf.myframemvp.base;

/**
 * 带mvp的presenter的基类
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:31
 */
public class BaseMvpPresenter <T extends BaseView> implements BasePresenter<T> {
    protected T baseView;

    @Override
    public void attachView(T baseView) {
        this.baseView = baseView;
    }

    @Override
    public void detachView() {
        this.baseView = null;
    }
}