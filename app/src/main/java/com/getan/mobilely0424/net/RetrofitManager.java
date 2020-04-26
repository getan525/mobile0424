package com.getan.mobilely0424.net;

import com.getan.mobilely0424.utils.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class RetrofitManager {
    private static final long TIME_OUT = 10 ;
    private static final long DEFAULT_DIR_CACHE = 1;
    private static Retrofit mRetrofit;
    private static OkHttpClient httpClient;

    public static ApiService mApiService(){
        //设置缓存路径
        //File cacheFile = new File(BaseApplication.getInstance().getCacheDir(), "cacheData");
        //设置缓存大小
        //Cache cache = new Cache(cacheFile, DEFAULT_DIR_CACHE);

        //new File(BaseApp.getInstance().getCacheDir(),"cacheData");
       /* httpClient=new OkHttpClient.Builder()
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT,TimeUnit.SECONDS)
                .addNetworkInterceptor(new CacheInterceptor())
                .addInterceptor(new CacheInterceptor())
                //.cache(cache)
                .build();*/


        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                //.client(client)
                .build();

        return mRetrofit.create(ApiService.class);
    }






 /*
            2.设置Interceptor这个大家注意了和之前设置的不同。也就一点点不同而已。我给出我的良心代码吧，等下还有良心截
    //        //设置缓存路径
    File cacheFile = new File(BaseApp.getInstance().getCacheDir(), "caheData");
    //设置缓存大小
    Cache cache = new Cache(cacheFile, DEFAULT_DIR_CACHE);
    OkHttpClient client = new OkHttpClient.Builder()
            .retryOnConnectionFailure(true)//连接失败后是否重新连接
            .connectTimeout(15, TimeUnit.SECONDS)//超时时间15S
            .addInterceptor(new CacheInterceptor())//也就这里不同
            .addNetworkInterceptor(new CacheInterceptor())//也就这里不同
            .cache(cache)
            .build();

    Retrofit retrofit = new Retrofit
            .Builder()
            .baseUrl(AppConstants.RequestPath.HOST)//baseURL提倡以“/”结尾
            .client(client)//设置okhttp
            .addConverterFactory(GsonConverterFactory.create(new Gson()))//解析数据
            .build();
    server = retrofit.create(ApiServer.class);*/



    /**
     * 提供OkhttpClient实例对象
     *
     * @return
     */
   /* private static OkHttpClient providerOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(TOME_OUT, TimeUnit.SECONDS)
                .readTimeout(TOME_OUT, TimeUnit.SECONDS)
                .addNetworkInterceptor(providerNetworkInterceptor())
                .addInterceptor(providerInterceptor());

        return builder.build();
    }*/
    /**
     * 提供网络请求返回信息打印拦截器
     * //原文链接：https://blog.csdn.net/ding_GC/article/details/80492229
     * @return
     */
   /* private static Interceptor providerNetworkInterceptor() {
        return new RequestIntercept(null);
    }*/

    /**
     * 基础公共参数拦截器
     *
     * @return
     */
   /* private static Interceptor providerInterceptor() {
        return new CommonParamInterceptor();
    }*/


}































