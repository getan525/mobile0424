package com.getan.mobilely0424.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public abstract class BaseFragment extends Fragment {
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        initView(inflater,container,savedInstanceState);
        return mRootView;
    }

    private void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutRes(), null);
    }


    protected abstract int getLayoutRes();
}
