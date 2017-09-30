package com.android_project_mvp_framework.mvp.login.presenter;

import com.android_project_mvp_framework.bean.ErrorBean;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.mvp.login.module.ILoginModule;
import com.android_project_mvp_framework.mvp.login.module.LoginModuleImpl;
import com.android_project_mvp_framework.mvp.login.view.ILoginView;
import com.android_project_mvp_framework.net.ResponseResult;

import java.util.List;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public class LoginPresenterImpl implements ILoginPresenter,CallBack{
    private ILoginView mILoginView;
    private ILoginModule mILoginModule;


    public LoginPresenterImpl(ILoginView mILoginView) {
        this.mILoginView = mILoginView;
        mILoginModule = new LoginModuleImpl();
    }

    @Override
    public void login(String username,String password) {
        mILoginView.showProgress();
        mILoginModule.login(username,password,this);
    }

    @Override
    public void onSuccess(ResponseResult<LoginBean> loginBeanResponseResult) {
        mILoginView.hideProgress();
        mILoginView.setDate(loginBeanResponseResult.getData());
        mILoginView.showToast("success");
    }

    @Override
    public void onNoResponse(int code, String msg) {
        mILoginView.showToast(msg);
    }

    @Override
    public void onFailure(String s) {
        mILoginView.showToast(s);
        mILoginView.hideProgress();
    }
}
