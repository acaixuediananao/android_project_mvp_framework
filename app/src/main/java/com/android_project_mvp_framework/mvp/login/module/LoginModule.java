package com.android_project_mvp_framework.mvp.login.module;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.di.ActivityScoped;
import com.android_project_mvp_framework.mvp.login.LoginContract;
import com.android_project_mvp_framework.mvp.login.LoginModelImpl;
import com.android_project_mvp_framework.mvp.login.LoginPresenterImpl;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.net.RxRequestCallBack;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author xiaolong.wei
 */
@Module
public abstract class LoginModule{

    @Binds
    @ActivityScoped
    abstract LoginContract.ILoginPresenter iLoginPresenter(LoginPresenterImpl loginPresenter);

    @Binds
    @ActivityScoped
    abstract LoginContract.ILoginModel iLoginModel(LoginModelImpl loginModel);

    @Provides
    @ActivityScoped
    static  RxRequestCallBack<ResponseResult<LoginBean>> provideRxRequestCallBack(){return new RxRequestCallBack<ResponseResult<LoginBean>>();}
}

