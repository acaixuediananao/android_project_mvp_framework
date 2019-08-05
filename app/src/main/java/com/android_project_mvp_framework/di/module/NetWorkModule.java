package com.android_project_mvp_framework.di.module;

import android.content.Context;

import com.android_project_mvp_framework.R;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author xiaolong.wei
 * @date 2017/9/14
 */

@Module
public class NetWorkModule {

    @Provides
    @Singleton
    HttpLoggingInterceptor provideHttpLoggingInterceptor(){
        HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
        logger.level(HttpLoggingInterceptor.Level.BODY);
        return logger;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Context context ,OkHttpClient client){
        String apiUrl = context.getResources().getString(R.string.api_url);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor logger){
        return  new OkHttpClient()
                .newBuilder()
                .addInterceptor(logger)
                .connectTimeout(20000, TimeUnit.MILLISECONDS)
                .build();
    }
}
