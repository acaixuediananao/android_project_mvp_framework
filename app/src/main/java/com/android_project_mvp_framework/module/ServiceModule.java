package com.android_project_mvp_framework.module;

import com.android_project_mvp_framework.service.ApiService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by xiaolong.wei on 2017/9/14.
 */

@Module
public class ServiceModule {

    @Provides
    ApiService provideAuthService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }
}
