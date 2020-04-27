package com.getan.mobilely0424.presenter;

import android.util.Log;

import com.getan.mobilely0424.model.HomeNewsModelImpl;
import com.getan.mobilely0424.model.IModel;
import com.getan.mobilely0424.view.IHomeView;
import com.orhanobut.logger.Logger;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class HomePresenterImpl implements IHomePresenter {
    private IHomeView mIHomeView=null;
    private IModel mIModel = null;

    /*private WeakReference<V> mViewRef; // View接口类型的弱引用
    private WeakReference<M> mModelRef; // View接口类型的弱引用*/
    public HomePresenterImpl(){
        mIModel=new HomeNewsModelImpl();
    }


    @Override
    public void attachView(IHomeView view) {
        this.mIHomeView = view;
    }

    @Override
    public void detach() {
        this.mIHomeView=null;
        mIModel = null;
    }

   /* @Override
    public IHomeView getIView() {
        return null;
    }*/


    //@@@@@@@@@@@@@@@@找了半天的回调接口空指针异常，原来原因是出在这里,mImodel一直为null
     //原因是attachView要在basemvpactivity中用present的对象进行调用初始化
    @Override
    public void getHomeNews_p() {
        Log.d(TAG, "getHomeNews_p: 走gethomenews_p的方法了");
            Log.d(TAG, "getHomeNews_p: 走getHomeNews_m的方法了");
            mIModel.getHomeNews_m(new IModel.HomeCallback() {
                @Override
                public void setData(Object data) {
                    Logger.d("mIHomeView="+mIHomeView);
                    mIHomeView.showCate(data);
                }

                @Override
                public void onError(String e) {
                    mIHomeView.showError(e);
                }

                @Override
                public void onSuccess() {
                    mIHomeView.showSuccess();
                }
            });
        //}
    }

}
