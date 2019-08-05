package com.android_project_mvp_framework.di.module;

import com.android_project_mvp_framework.service.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by xiaolong.wei on 2017/9/14.
 */

@Module
public class ServiceModule {

    @Provides
    @Singleton
    ApiService provideAuthService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }
}
