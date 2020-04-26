package com.getan.mobilely0424.presenter;

import android.util.Log;

import com.getan.mobilely0424.model.HomeNewsModelImpl;
import com.getan.mobilely0424.model.IModel;
import com.getan.mobilely0424.view.IHomeView;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class HomePresenterImpl<V extends IHomeView,M extends IModel> implements IHomePresenter {
    private IHomeView mIHomeView;
    private IModel mIModel = null;

    /*private WeakReference<V> mViewRef; // View接口类型的弱引用
    private WeakReference<M> mModelRef; // View接口类型的弱引用*/
    public HomePresenterImpl(){
        mIModel=new HomeNewsModelImpl();
    }

    @Override
    public void attachView(IHomeView view) {
        //this.mViewRef = new WeakReference(view);
        this.mIHomeView = view;

    }

/*    @Override
    public void attachModel(IModel m) {
        m = new HomeNewsModelImpl();
        this.mModelRef = new WeakReference(m);
    }*/

    /*@Override
    public void attachModel(IModel m){
        this.mIModel = new HomeNewsModelImpl();
    }*/

    @Override
    public void detach() {
        mIHomeView=null;
        mIModel = null;
        /*if (mViewRef!=null){
            mViewRef.clear();
            mViewRef=null;
        }
        if (mModelRef!=null){
            mModelRef.clear();
            mModelRef=null;
        }*/
    }

    @Override
    public boolean isAttachView() {
         return false;
    }

    /*找了半天的回调接口空指针异常，原来原因是出在这里,mImodel一直为null*/
    @Override
    public void getHomeNews_p() {
        Log.d(TAG, "getHomeNews_p: 走gethomenews_p的方法了");
      /*  if(mIModel==null){
            //mModelRef=new HomeNewsModelImpl();
            Log.d(TAG, "getHomeNews_p: 走mIModel==null的方法了");
        }else{*/
            Log.d(TAG, "getHomeNews_p: 走getHomeNews_m的方法了");
            mIModel.getHomeNews_m(new IModel.HomeCallback() {
                @Override
                public void setData(Object data) {
                    mIHomeView.showSuccess();
                }

                @Override
                public void onError(String e) {

                }

                @Override
                public void onSuccess() {
                    mIHomeView.showSuccess();
                }
            });
        //}
    }

}
