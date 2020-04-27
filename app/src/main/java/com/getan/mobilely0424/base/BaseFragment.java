package com.getan.mobilely0424.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public abstract class BaseFragment<P extends IBasePresenter> extends Fragment implements IBaseView{
    private View mRootView;
    private Unbinder mUnbinder;
    private P mP;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        initView(inflater,container,savedInstanceState);
        mUnbinder = ButterKnife.bind(this, mRootView);

        mP = initPresenter();
        initAttachView();
        initData();
        return mRootView;
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

    private void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutRes(), null);
    }


    protected abstract int getLayoutRes();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder!=null){
            mUnbinder.unbind();
        }
    }
}
