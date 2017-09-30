package com.android_project_mvp_framework.module;

import com.android_project_mvp_framework.net.LoggingInterceptor;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xiaolong.wei on 2017/9/14.
 */

@Module
public class NetWorkModule {

    @Provides
    Retrofit provideRetrofit(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.1.36.118:18080/zrcf-site/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }

    @Provides
    OkHttpClient provideOkHttpClient(){
        return  new OkHttpClient()
                .newBuilder()
                .addInterceptor(new LoggingInterceptor())
                .connectTimeout(20000, TimeUnit.MILLISECONDS)
                .build();
    }
}
