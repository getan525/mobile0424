package com.getan.mobilely0424.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.getan.mobilely0424.R;
import com.getan.mobilely0424.base.BaseFragment;
import com.getan.mobilely0424.model.bean.CateNewsListBean;
import com.getan.mobilely0424.model.bean.HomeBean;
import com.getan.mobilely0424.presenter.IHomePagerPresenter;
import com.getan.mobilely0424.presenter.impl.HomePagerPresenterImpl;
import com.getan.mobilely0424.ui.adapter.BannerAdapter;
import com.getan.mobilely0424.ui.adapter.HomePagerRecycleAdapter;
import com.getan.mobilely0424.utils.Constants;
import com.getan.mobilely0424.utils.UrlUtils;
import com.getan.mobilely0424.view.IHomePagerView;
import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.orhanobut.logger.Logger;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

/**
 * Created by Administrator on 2020/4/27.
 * 邮箱：405181076@qq.com
 */
public class HomePagerFragment extends BaseFragment<IHomePagerPresenter> implements IHomePagerView {

    @BindView(R.id.recycle_home)
    RecyclerView mRecyclerView;
    @BindView(R.id.banner_vp)
    ViewPager mBanner;
    @BindView(R.id.refresh)
    TwinklingRefreshLayout mRefreshLayout;
    private IHomePagerPresenter mIHomePagerPresenter;
    private HomePagerRecycleAdapter mHomePagerRecycleAdapter;
    private CateNewsListBean mCateNewsListBean;
    private CateNewsListBean mMCateNewsListMore;

    public static HomePagerFragment newInstance(HomeBean.DataBean.CateListBean cateListBean){
        HomePagerFragment homePagerFragment = new HomePagerFragment();
        String cateName = cateListBean.getCateName();
        String cateId = cateListBean.getCateId();
        String cate = cateListBean.getCate();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_HOMEPAGER_CATE_NAME,cateName);
        bundle.putString(Constants.KEY_HOMEPAGER_CATE_ID,cateId);
        bundle.putString(Constants.KEY_HOMEPAGER_CATE,cate);
        homePagerFragment.setArguments(bundle);
        return homePagerFragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home_page;
    }

    @Override
    protected View initDefaultView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_state_default,container,false);
    }

    @Override
    protected void initView(View rootView) {
        super.initView(rootView);
        changeViewByState(State.SUCCESS);


        //设置轮播viewpager的适配器
        BannerAdapter bannerAdapter = new BannerAdapter();
        mBanner.setAdapter(bannerAdapter);


        //设置recycleview的适配器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mHomePagerRecycleAdapter = new HomePagerRecycleAdapter();
        mRecyclerView.setAdapter(mHomePagerRecycleAdapter);
        mRefreshLayout.setEnableRefresh(false);
        mRefreshLayout.setEnableLoadmore(true);
    }

    @Override
    protected IHomePagerPresenter initPresenter() {
        mIHomePagerPresenter = HomePagerPresenterImpl.getInstance();
        return mIHomePagerPresenter;
    }

    @Override
    protected void initData() {
        Bundle arguments = getArguments();
        String cate = arguments.getString(Constants.KEY_HOMEPAGER_CATE);
        //String cateid = arguments.getString(Constants.KEY_HOMEPAGER_CATE_ID);
        String url = UrlUtils.creatCateListUrl(cate);
        //changeViewByState(State.LOADING);
        mIHomePagerPresenter.getCateNewsList(url);

        //下拉刷新

        //上拉加载更多
        //mRefreshLayout.setEnableLoadmore(true);
        mRefreshLayout.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onLoadMore(TwinklingRefreshLayout refreshLayout) {
                super.onLoadMore(refreshLayout);

                int curpage = mCateNewsListBean.getData().getCurpage();
                curpage++;
                String url_loadmore = UrlUtils.creatCateListMoreUrl(cate, curpage);
                mIHomePagerPresenter.gteLoadMore(url_loadmore);
            }
        });

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
    public void showCateNewsList(Object data) {
        mCateNewsListBean = (CateNewsListBean) data;
        if (mCateNewsListBean ==null|| mCateNewsListBean.getData().getNews_list().size()==0){
            changeViewByState(State.EMPTY);
        }else {
            changeViewByState(State.SUCCESS);
        }

        mHomePagerRecycleAdapter.setData(mCateNewsListBean.getData());


    }

    @Override
    public void showCateNewsMore(Object data) {
        mMCateNewsListMore = (CateNewsListBean) data;
        if (mMCateNewsListMore ==null|| mMCateNewsListMore.getData().getNews_list().size()==0){
            changeViewByState(State.EMPTY);
        }else {
            changeViewByState(State.SUCCESS);
        }

        //mHomePagerRecycleAdapter.setData(mMCateNewsListMore.getData());
        mHomePagerRecycleAdapter.addMoreData(mMCateNewsListMore.getData());

        Logger.d("把加载更多的数据给适配器//////////////");

        mRefreshLayout.finishLoadmore();
        Logger.d("把加载更多取消//////////////");
    }
}
