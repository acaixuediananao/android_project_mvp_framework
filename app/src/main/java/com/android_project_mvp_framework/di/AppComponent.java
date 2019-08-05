package com.android_project_mvp_framework.di;

import android.content.Context;

import com.android_project_mvp_framework.AndroidApplication;
import com.android_project_mvp_framework.di.module.NetWorkModule;
//import com.android_project_mvp_framework.di.module.ResponseCallBackModule;
import com.android_project_mvp_framework.di.module.RxAndroidModule;
import com.android_project_mvp_framework.di.module.ServiceModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        NetWorkModule.class,
        BindActivityModule.class,
        ServiceModule.class,
        RxAndroidModule.class
})
public interface AppComponent extends AndroidInjector<AndroidApplication> {

//  @Component.Builder
//  abstract class Build extends AndroidInjector.Builder<AndroidApplication>{}
    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder context(Context context);

        AppComponent build();
    }
}
