package com.getan.mobilely0424.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.getan.mobilely0424.R;
import com.getan.mobilely0424.base.BaseFragment;

/**
 * Created by Administrator on 2020/4/24.
 * 邮箱：405181076@qq.com
 */
public class RecommendFragment extends BaseFragment {

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected View initDefaultView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_state_default,container,false);
    }
    @Override
    protected void initView(View rootView) {
        super.initView(rootView);
        changeViewByState(State.SUCCESS);
    }
    @Override
    public void showError(String s) {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void showSuccess() {

    }
}
