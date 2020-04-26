package com.getan.mobilely0424.net;

import com.getan.mobilely0424.utils.Constants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public abstract class RetrofitUtil {
    private static final long TOME_OUT = 10;
    private static Retrofit mRetrofit;

    /**
     * 获取Retrofit对象
     *     * @return Retrofit
     */
    public static Retrofit getRetrofit() {
/**
 * 设置拦截器
 * 动态设置统一请求Header
 */
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(TOME_OUT, TimeUnit.SECONDS)
                .readTimeout(TOME_OUT, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder()
                                .addHeader("deviceId", Constants.deviceId)
                                .build();
                        return chain.proceed(request);
                    }
                })
                .build();
        if (null == mRetrofit) {
            mRetrofit = new Retrofit.Builder()
                    .client(httpClient)
                    .baseUrl(Constants.URL + "/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

}

