package com.android_project_mvp_framework;

import com.android_project_mvp_framework.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


/**
 *
 * @author xiaolong.wei
 * @date 2017/9/14
 */

public class AndroidApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        return DaggerAppComponent.builder().create(this);
        return DaggerAppComponent.builder().context(this.getApplicationContext()).build();

    }
}
