package com.getan.mobilely0424.presenter;

import com.getan.mobilely0424.base.IBasePresenter;
import com.getan.mobilely0424.base.IBaseView;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2020/4/26.
 * 邮箱：405181076@qq.com
 */
public abstract class HomePresenter<V extends IBaseView> implements IBasePresenter {

    private WeakReference<V> mViewRef;

    @Override
    public void attachView(IBaseView view) {
        mViewRef = new WeakReference(view);
    }

    @Override
    public void detach() {
        if (mViewRef != null) {

            mViewRef = null;
            mViewRef.clear();
        }
    }

   /* @Override
    public V getIView() {
        return mViewRef.get();
    }
*/
    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }


    public abstract void getHomeNews_p();
}
