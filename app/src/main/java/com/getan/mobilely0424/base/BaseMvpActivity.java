package com.getan.mobilely0424.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public abstract class BaseMvpActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView {
    private P mP;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutRes());
        ButterKnife.bind(this);
        mP = initPresenter();
        initView();
        initData();
    }

    public P getPresenter() {
        return mP;
    }

    private void initData() {

    }

    protected abstract void initView();

    protected abstract int initLayoutRes();

    protected abstract P initPresenter();

}
