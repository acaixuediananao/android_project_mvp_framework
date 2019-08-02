package com.android_project_mvp_framework.mvp.login.module;

import com.android_project_mvp_framework.di.ActivitySocped;
import com.android_project_mvp_framework.mvp.login.model.ILoginModel;
import com.android_project_mvp_framework.mvp.login.model.LoginModelImpl;
import com.android_project_mvp_framework.mvp.login.presenter.ILoginPresenter;
import com.android_project_mvp_framework.mvp.login.presenter.LoginPresenterImpl;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginModule {

    @Binds
    @ActivitySocped
    abstract ILoginPresenter iLoginPresenter(LoginPresenterImpl loginPresenter);

    @Binds
    @ActivitySocped
    abstract ILoginModel iLoginModel(LoginModelImpl loginModel);
}
