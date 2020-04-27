package com.getan.mobilely0424.base;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public interface IBasePresenter<V extends IBaseView> {
    /**
     * 绑定view
     * @param view
     */
    void attachView(V view);
    //void attachModel(M model);

    /**
     * 解绑
     */
    void detach();

    /**
     *
     * @return
     */
    //V getIView();
}
