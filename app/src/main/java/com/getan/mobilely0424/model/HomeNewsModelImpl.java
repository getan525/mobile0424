package com.getan.mobilely0424.model;

import android.util.Log;

import com.getan.mobilely0424.model.bean.HomeBean;
import com.getan.mobilely0424.net.RetrofitManager;
import com.orhanobut.logger.Logger;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static androidx.constraintlayout.widget.Constraints.TAG;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class HomeNewsModelImpl implements IModel{
    //private HomeCallback mHomeCallback;

    @Override
    public void getHomeNews_m(HomeCallback callback) {
        Log.d(TAG, "getHomeNews_m: 走网络请求的方法了");
        RetrofitManager.getApiService().getHomeNewsCate()
                .subscribeOn(Schedulers.io())//在io线程加载数据
                .observeOn(AndroidSchedulers.mainThread())//在主线程显示数据
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean homeBean) {
                        Log.d(TAG, homeBean.getData().getCate_list().get(1).getCateName()+"onNext: 成功了");
                        Logger.d("");
                        //callback.setData(homeBean.getData().getCate_list().get(1).getCateName());
                        callback.setData(homeBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.toString());
                    }

                    @Override
                    public void onComplete() {
                        callback.onSuccess();
                    }
                });

    }
}

   /* @Override
    public void getHomeNews_m(HomeCallback callback) {
        this.mHomeCallback= callback;
        *//*RetrofitManager.mApiService().getHomeNewsCate().subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io())
                .doOnNext*//*
        //RetrofitManager.mApiService().getHomeNewsCate().
        RetrofitManager.mApiService().getHomeNewsCate()
                .subscribeOn(Schedulers.io())//在io线程加载数据
                .observeOn(AndroidSchedulers.mainThread())//在主线程显示数据
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean homeBean) {
                        Log.d(TAG, homeBean.getData().getCate_list().get(1).getCateName()+"onNext: 成功了");
                        //callback.setData(homeBean.getData().getCate_list().get(1).getCateName());
                        callback.setData(homeBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.toString());
                    }

                    @Override
                    public void onComplete() {
                        callback.onSuccess();
                    }
                });

    }*/

