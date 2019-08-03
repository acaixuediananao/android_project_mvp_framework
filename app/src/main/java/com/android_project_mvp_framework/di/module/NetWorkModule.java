package com.android_project_mvp_framework.di.module;

import android.content.Context;

import com.android_project_mvp_framework.R;
import com.android_project_mvp_framework.net.LoggingInterceptor;
import com.android_project_mvp_framework.net.ResponseCallBack;

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
    Retrofit provideRetrofit(Context context ,OkHttpClient client){
        String apiUrl = context.getResources().getString(R.string.api_url);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
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
