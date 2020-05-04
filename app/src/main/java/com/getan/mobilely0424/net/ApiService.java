package com.getan.mobilely0424.net;


import com.getan.mobilely0424.model.bean.CateNewsListBean;
import com.getan.mobilely0424.model.bean.HomeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public interface ApiService {
    //获取home页分类名
    @GET("tools/service/getNewsCate")
    Observable<HomeBean> getHomeNewsCate();

    //获取各分类下的新闻列表
    //@GET("tools/service/getNewsList/{cate}/{curpage}/{default}/{pagesize}")
    @GET()
    Observable<CateNewsListBean> getCateList(@Url String url);

    @GET()
    Observable<CateNewsListBean> getMore(@Url String url);

}
/*
    @GET(ApiConstants.QQ_SPORT_API)
    Observable<NewsResult> getQQSportNews(@Query("baid") String baid, @Query("apikey") String apiKey);

    */
/**
     * 文件上传示例
     * 可传递普通参数及文件参数
     * 普通参数需使用RequestBody进行封装，将其值封装进RequestBody中
     *
     * @param userName 普通参数,通过RequestBody进行封装，
     * @param filePart 封装了文件Content-type(文件类型)、文件名称及路径的 Part
     * @Part("userName") 中的userName相当于普通参数的key
     *//*

    @Multipart
    @POST(ApiConstants.QQ_SPORT_API)
    Observable<String> uploadFile(@Part("userName") RequestBody userName, @Part MultipartBody.Part filePart);*/
