package com.getan.mobilely0424.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.getan.mobilely0424.R;
import com.getan.mobilely0424.base.BaseFragment;
import com.getan.mobilely0424.model.bean.HomeBean;
import com.getan.mobilely0424.presenter.impl.HomePresenterImpl;
import com.getan.mobilely0424.presenter.IHomePresenter;
import com.getan.mobilely0424.ui.adapter.HomePagerAdapter;
import com.getan.mobilely0424.view.IHomeView;
import com.google.android.material.tabs.TabLayout;
import com.orhanobut.logger.Logger;

import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

/**
 * Created by Administrator on 2020/4/24.
 * 邮箱：405181076@qq.com
 */
public class HomeFragment extends BaseFragment<IHomePresenter> implements IHomeView {
    @BindView(R.id.tab_home)
    TabLayout mTabLayout;
    @BindView(R.id.vp_home)
    ViewPager mViewPager;
    @BindView(R.id.ll_fail)
    LinearLayout mLinearLayout_fail;
    private HomePagerAdapter mHomePagerAdapter;
    private IHomePresenter mHomePresenter;
    private HomeBean mHomeBean =null;

    @Override
    protected IHomePresenter initPresenter() {
        mHomePresenter = new HomePresenterImpl();
        return mHomePresenter;
    }

    @Override
    protected View initDefaultView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_state_home,container,false);
    }

    @Override
    protected void initView(View rootView) {
        super.initView(rootView);
        changeViewByState(State.SUCCESS);




    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        super.initData();
        changeViewByState(State.LOADING);
        mHomePresenter.getHomeNews_p();
    }

    @Override
    public void showCate(Object data) {
        //HomeBean.DataBean.CateListBean listBean = (HomeBean.DataBean.CateListBean) data;
        mHomeBean = (HomeBean) data;

        if (mHomeBean.getData().getCate_list().size()==0||mHomeBean==null){
            changeViewByState(State.EMPTY);
        }else {
            changeViewByState(State.SUCCESS);
        }
        mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        mHomePagerAdapter.setCateList(mHomeBean.getData());
        Logger.d("HomeFragment里的showcate");
        mViewPager.setAdapter(mHomePagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    @Override
    protected void clickRetry() {
        super.clickRetry();
        mHomePresenter.getHomeNews_p();
    }

    @Override
    public void showError(String s) {
        changeViewByState(State.ERROR);
        Logger.d("展示网络中的error-->="+s);
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showProgress() {
    }

    @Override
    public void showSuccess() {
        Logger.d("HomeFragment里的showSuccess");
        //changeViewByState(State.SUCCESS);
        //Toast.makeText(getContext(),"加载完成",Toast.LENGTH_SHORT).show();
    }
}
