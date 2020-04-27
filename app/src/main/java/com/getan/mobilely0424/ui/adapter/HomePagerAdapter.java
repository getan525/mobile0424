package com.getan.mobilely0424.ui.adapter;

import com.getan.mobilely0424.model.bean.HomeBean;
import com.getan.mobilely0424.ui.fragment.HomePagerFragment;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2020/4/27.
 * 邮箱：405181076@qq.com
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    //private HomeBean.DataBean.CateListBean mCateList ;
    private List<HomeBean.DataBean.CateListBean> cateList = new ArrayList<>();
    public HomePagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        //mCateList =
        // TODO: 2020/4/27  
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return cateList.get(position).getCateName();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        HomePagerFragment pagerFragment = new HomePagerFragment();
        return pagerFragment;
    }

    @Override
    public int getCount() {
        return cateList.size();
    }

    public void setCateList(HomeBean.DataBean listBean) {
        //List<HomeBean.DataBean.CateListBean> data = listBean.getCate_list();
        //this.cateList.addAll(data);
        Logger.d("homepageradapter+="+cateList.size());
        List<HomeBean.DataBean.CateListBean> cate_list = listBean.getCate_list();
        cateList.addAll(cate_list);
        notifyDataSetChanged();
    }
}
