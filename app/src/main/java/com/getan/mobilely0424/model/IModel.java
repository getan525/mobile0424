package com.getan.mobilely0424.model;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public interface IModel {


    void getLoadMore_m(String url_loadmore, HomeCallback callback);

    public interface HomeCallback<T>{
        void setData(T data);
        void onError(String e);
        void onRequestComplete();
    };

    void getHomeNews_m(HomeCallback callback);
    void getPagerNewsList_m(String s, HomeCallback callback);
}
