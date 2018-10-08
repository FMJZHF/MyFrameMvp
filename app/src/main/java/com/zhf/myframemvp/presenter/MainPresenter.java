package com.zhf.myframemvp.presenter;

import com.zhf.myframemvp.base.BaseMvpPresenter;
import com.zhf.myframemvp.base.MyApplication;
import com.zhf.myframemvp.contract.MainContract;
import com.zhf.myframemvp.model.DataHelper;
import com.zhf.myframemvp.model.http.HttpNoResult;
import com.zhf.myframemvp.model.http.MyRxUtils;
import com.zhf.myframemvp.model.http.MySubscriber;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:46
 */
public class MainPresenter extends BaseMvpPresenter<MainContract.IView>
        implements MainContract.Presenter {

    private DataHelper dataHelper;

    @Inject
    MainPresenter() {
        dataHelper = MyApplication.getAppComponent().getDataHelper();
    }

    @Override
    public void loadData() {
//        addSubscribe(dataHelper.loginCode("134xxxxxxxx")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe());

        addSubscribe(dataHelper.loginCode("134xxxxxxxx")
                .compose(MyRxUtils.toMain(Schedulers.io()))
                .subscribeWith(new MySubscriber<HttpNoResult>(baseView, true) {
                    @Override
                    public void onNext(HttpNoResult httpNoResult) {

                    }
                }));


//        baseView.showTipMsg("加载数据");
    }
}
