package com.getan.mobilely0424.presenter;

import com.getan.mobilely0424.base.IBasePresenter;
import com.getan.mobilely0424.view.IHomePagerView;

/**
 * Created by Administrator on 2020/4/28.
 * 邮箱：405181076@qq.com
 */
public interface IHomePagerPresenter extends IBasePresenter<IHomePagerView> {

    void getCateNewsList(String url);

    void gteLoadMore(String url_loadmore);
}
