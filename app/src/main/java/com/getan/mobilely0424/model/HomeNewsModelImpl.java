package com.getan.mobilely0424.model;

import android.util.Log;

import com.getan.mobilely0424.model.bean.CateNewsListBean;
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
    public void getLoadMore_m(String url_loadmore, HomeCallback callback) {
        RetrofitManager.getApiService().getMore(url_loadmore)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CateNewsListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CateNewsListBean cateNewsListBean) {
                        callback.setData(cateNewsListBean);
                        callback.onRequestComplete();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

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
                        //Log.d(TAG, homeBean.getData().getCate_list().get(1).getCateName()+"onNext: 成功了");
                        //Logger.d("");
                        //callback.setData(homeBean.getData().getCate_list().get(1).getCateName());
                        //callback.setData(homeBean.getData().getCate_list());
                        Logger.d("HomeNewsModelImpl方法里的onNext,准备好把数据给回调了");
                        if (callback!=null){

                            callback.setData(homeBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.toString());
                        Logger.d("HomeNewsModelImpl方法里的onError,网络请求走了error");
                    }

                    @Override
                    public void onComplete() {
                        //callback.onRequestComplete();
                        Logger.d("HomeNewsModelImpl方法里的onComplete,网络请求走了onComplete");
                    }
                });

    }

    @Override
    public void getPagerNewsList_m(String url, HomeCallback callback) {
        RetrofitManager.getApiService().getCateList(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CateNewsListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CateNewsListBean cateListBean) {
                        Logger.d("请求分类的列表成功了"+cateListBean.getData().toString());
                        callback.setData(cateListBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.toString());
                    }

                    @Override
                    public void onComplete() {

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

