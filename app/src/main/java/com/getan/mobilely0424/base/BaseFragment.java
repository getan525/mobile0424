package com.getan.mobilely0424.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.getan.mobilely0424.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public abstract class BaseFragment<P extends IBasePresenter> extends Fragment implements IBaseView{
    private View mRootView;
    private View mSuccessView;
    private Unbinder mUnbinder;
    private P mP;
    private FrameLayout mFl_container;
    private View mLoadingView;

    private State currentState = State.NONE;
    private View mErrorview;
    private View mEmptyView;

    public enum State{
        NONE,SUCCESS,LOADING,ERROR,EMPTY
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mRootView = initDefaultView(inflater,container);
        mFl_container = mRootView.findViewById(R.id.fl_fragment_state);

        initStateView(inflater,container,savedInstanceState);

        mUnbinder = ButterKnife.bind(this, mRootView);

        mP = initPresenter();
        initAttachView();
        initView(mRootView);
        initData();
        return mRootView;
    }

    @OnClick(R.id.ll_fail)
    public void retry(View v) {
        clickRetry();
    }

    protected void clickRetry() {

    }

    protected void initView(View rootView) {

    }

    protected View initDefaultView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_state_default, container, false);
    }

    private void initStateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //成功的view
        initSuccessView(inflater,container,savedInstanceState);
        mFl_container.addView(mSuccessView);
        //加载中的view
        initLoadingView(inflater,container);
        mFl_container.addView(mLoadingView);
        //错误时的view
        initErrorView(inflater,container);
        mFl_container.addView(mErrorview);
        //数据为空时的view
        initEmptyView(inflater,container);
        mFl_container.addView(mEmptyView);
        //根据状态切换view
        changeViewByState(State.NONE);

    }

    private void initEmptyView(LayoutInflater inflater, ViewGroup container) {
        mEmptyView = inflater.inflate(R.layout.fragment_empty, container, false);
    }


    protected void changeViewByState(State state) {
        this.currentState = state;
        if (currentState==State.SUCCESS){
            mSuccessView.setVisibility(View.VISIBLE);
        }else {
            mSuccessView.setVisibility(View.GONE);
        }

        if (currentState==State.LOADING){
            mLoadingView.setVisibility(View.VISIBLE);
        }else {
            mLoadingView.setVisibility(View.GONE);
        }

        mErrorview.setVisibility(currentState==State.ERROR? View.VISIBLE:View.GONE);
        mEmptyView.setVisibility(currentState==State.EMPTY? View.VISIBLE:View.GONE);
    }


    private void initErrorView(LayoutInflater inflater, ViewGroup container) {
        mErrorview = inflater.inflate(R.layout.fragment_error, container, false);
    }
    private void initLoadingView(LayoutInflater inflater, ViewGroup container) {
        mLoadingView = inflater.inflate(R.layout.fragment_loading, container, false);

    }
    private void initSuccessView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mSuccessView =inflater.inflate(getLayoutRes(), null);
    }


    private void initAttachView() {
        if (mP!= null){
            mP.attachView(this);
        }
    }

    protected void initData() {

    }

    protected  P initPresenter(){
        return mP;
    };




    protected abstract int getLayoutRes();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder!=null){
            mUnbinder.unbind();
        }
    }
}
