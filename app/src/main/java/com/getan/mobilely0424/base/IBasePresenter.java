package com.getan.mobilely0424.base;

import com.getan.mobilely0424.model.IModel;
import com.getan.mobilely0424.view.IHomeView;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public interface IBasePresenter<V extends IHomeView,M extends IModel> {
    void attachView(V view);
    //void attachModel(M model);
    void detach();
    boolean isAttachView();
}
