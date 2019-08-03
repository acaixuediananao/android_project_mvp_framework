package com.android_project_mvp_framework.mvp.login.module;

import com.android_project_mvp_framework.di.ActivitySocped;
import com.android_project_mvp_framework.mvp.login.LoginContract;
import com.android_project_mvp_framework.mvp.login.LoginModelImpl;
import com.android_project_mvp_framework.mvp.login.LoginPresenterImpl;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginModule{

    @Binds
    @ActivitySocped
    abstract LoginContract.ILoginPresenter iLoginPresenter(LoginPresenterImpl loginPresenter);

    @Binds
    @ActivitySocped
    abstract LoginContract.ILoginModel iLoginModel(LoginModelImpl loginModel);
}
