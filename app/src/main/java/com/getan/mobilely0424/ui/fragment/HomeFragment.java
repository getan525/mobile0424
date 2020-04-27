package com.getan.mobilely0424.ui.fragment;

import com.getan.mobilely0424.R;
import com.getan.mobilely0424.base.BaseFragment;
import com.getan.mobilely0424.model.bean.HomeBean;
import com.getan.mobilely0424.presenter.HomePresenterImpl;
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
    private HomePagerAdapter mHomePagerAdapter;
    private IHomePresenter mHomePresenter;

    @Override
    protected IHomePresenter initPresenter() {
        mHomePresenter = new HomePresenterImpl();
        return mHomePresenter;
    }


    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        super.initData();
        mHomePresenter.getHomeNews_p();
    }

    @Override
    public void showCate(Object data) {
        //HomeBean.DataBean.CateListBean listBean = (HomeBean.DataBean.CateListBean) data;
        HomeBean homeBean= (HomeBean) data;

        mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        mHomePagerAdapter.setCateList(homeBean.getData());
        Logger.d("HomeFragment里的showcate");
        mViewPager.setAdapter(mHomePagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
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
        Logger.d("HomeFragment里的showSuccess");
    }
}
