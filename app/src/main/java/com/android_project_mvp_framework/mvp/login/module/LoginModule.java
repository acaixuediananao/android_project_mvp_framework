package com.android_project_mvp_framework.mvp.login.module;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.di.ActivitySocped;
import com.android_project_mvp_framework.mvp.login.LoginContract;
import com.android_project_mvp_framework.mvp.login.LoginModelImpl;
import com.android_project_mvp_framework.mvp.login.LoginPresenterImpl;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.net.RxRequestCallBack;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * @author xiaolong.wei
 */
@Module
public abstract class LoginModule{

    @Binds
    @ActivitySocped
    abstract LoginContract.ILoginPresenter iLoginPresenter(LoginPresenterImpl loginPresenter);

    @Binds
    @ActivitySocped
    abstract LoginContract.ILoginModel iLoginModel(LoginModelImpl loginModel);

    @Provides
    @ActivitySocped
    static  RxRequestCallBack<ResponseResult<LoginBean>> provideRxRequestCallBack(){return new RxRequestCallBack<ResponseResult<LoginBean>>();}
}

