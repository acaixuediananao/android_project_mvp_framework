package com.android_project_mvp_framework.di.module;

import com.android_project_mvp_framework.di.ActivitySocped;
import com.android_project_mvp_framework.net.ResponseCallBack;
import com.android_project_mvp_framework.net.ResponseResult;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ResponseCallBackModule<T extends ResponseResult> {
    @Binds
    @ActivitySocped
    abstract ResponseCallBack<T> provideResponseCallBack(ResponseCallBack<T> responseCallBack);

}
