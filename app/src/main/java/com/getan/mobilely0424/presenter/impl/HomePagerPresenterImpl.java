package com.getan.mobilely0424.presenter.impl;

import com.getan.mobilely0424.model.HomeNewsModelImpl;
import com.getan.mobilely0424.model.IModel;
import com.getan.mobilely0424.presenter.IHomePagerPresenter;
import com.getan.mobilely0424.view.IHomePagerView;

/**
 * Created by Administrator on 2020/4/28.
 * 邮箱：405181076@qq.com
 */
public class HomePagerPresenterImpl implements IHomePagerPresenter {

    private static HomePagerPresenterImpl sInstance;
    private IHomePagerView mIHomePagerView;
    private IModel mIModel;

    public static HomePagerPresenterImpl getInstance(){
        if (sInstance == null){
            sInstance = new HomePagerPresenterImpl();
        }
        return sInstance;
    }

    public HomePagerPresenterImpl(){
        mIModel = new HomeNewsModelImpl();
    }

    @Override
    public void attachView(IHomePagerView view) {
        mIHomePagerView = view;
    }

    @Override
    public void detach() {
        mIHomePagerView = null;
    }

    @Override
    public void getCateNewsList(String url) {
        mIModel.getPagerNewsList_m(url,new IModel.HomeCallback() {
            @Override
            public void setData(Object data) {
                mIHomePagerView.showCateNewsList(data);
            }

            @Override
            public void onError(String e) {

            }

            @Override
            public void onRequestComplete() {

            }
        });
    }

    @Override
    public void gteLoadMore(String url_loadmore) {
        mIModel.getLoadMore_m(url_loadmore,new IModel.HomeCallback() {
            @Override
            public void setData(Object data) {
                mIHomePagerView.showCateNewsMore(data);
            }

            @Override
            public void onError(String e) {

            }

            @Override
            public void onRequestComplete() {
                mIHomePagerView.showSuccess();
            }
        });
    }
}
