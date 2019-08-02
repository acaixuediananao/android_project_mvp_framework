package com.android_project_mvp_framework.di;

import com.android_project_mvp_framework.mvp.login.LoginActivity;
import com.android_project_mvp_framework.mvp.login.module.LoginModule;
import com.android_project_mvp_framework.mvp.register.RegisterActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BindActivityModule {

    @ActivitySocped
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();


    @ActivitySocped
    @ContributesAndroidInjector
    abstract RegisterActivity registerActivity();
}
