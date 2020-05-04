package com.getan.mobilely0424.ui.activity;

import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.getan.mobilely0424.R;
import com.getan.mobilely0424.base.BaseMvpActivity;
import com.getan.mobilely0424.presenter.impl.HomePresenterImpl;
import com.getan.mobilely0424.presenter.IHomePresenter;
import com.getan.mobilely0424.ui.fragment.HomeFragment;
import com.getan.mobilely0424.ui.fragment.PeopleFragment;
import com.getan.mobilely0424.ui.fragment.RechargeFragment;
import com.getan.mobilely0424.ui.fragment.RecommendFragment;
import com.getan.mobilely0424.view.IHomeView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<IHomePresenter> implements IHomeView {
    private static final String TAG = "MainActivity";
    private IHomePresenter mHomePresenter;
    @BindView(R.id.fl_main)
    FrameLayout mFrameLayout;
    @BindView(R.id.navigate_main)
    BottomNavigationView mBottomNavigationView;
    private FragmentManager mFm;
    private List<Fragment> mFragmentList;


    @Override
    protected void initView() {
        Log.d(TAG, "initView: 走初始化view的方法了");
        initFragment();
        initListener();
        mFm = getSupportFragmentManager();
        switchFragment(0);
        //getPresenter().getHomeNews_p();
    }

    @Override
    protected int initLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected IHomePresenter initPresenter() {
        return new HomePresenterImpl();
    }


    private void initListener() {
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_news:
                        switchFragment(0);
                        break;
                    case R.id.bottom_people:
                        switchFragment(1);
                        break;
                    case R.id.bottom_recharge:
                        switchFragment(2);
                        break;
                    case R.id.bottom_recommend:
                        switchFragment(3);
                        break;
                }
                return true;
            }
        });
    }


    private void initFragment() {
        HomeFragment homeFragment = new HomeFragment();
        PeopleFragment peopleFragment = new PeopleFragment();
        RechargeFragment rechargeFragment = new RechargeFragment();
        RecommendFragment recommendFragment = new RecommendFragment();

        mFragmentList = new ArrayList<>();
        mFragmentList.add(homeFragment);
        mFragmentList.add(peopleFragment);
        mFragmentList.add(rechargeFragment);
        mFragmentList.add(recommendFragment);



    }


    private void switchFragment(int i) {
        FragmentTransaction fragmentTransaction = mFm.beginTransaction();
        fragmentTransaction.replace(R.id.fl_main,mFragmentList.get(i));
        fragmentTransaction.commit();
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

    @Override
    public void showCate(Object data) {
        //HomeBean.DataBean.CateListBean listBean = (HomeBean.DataBean.CateListBean) data;
        //listBean.get
    }
}
