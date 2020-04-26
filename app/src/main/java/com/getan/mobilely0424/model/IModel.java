package com.getan.mobilely0424.model;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public interface IModel {



    public interface HomeCallback<T>{
        void setData(T data);
        void onError(String e);
        void onSuccess();
    };

    void getHomeNews_m(HomeCallback callback);
}
