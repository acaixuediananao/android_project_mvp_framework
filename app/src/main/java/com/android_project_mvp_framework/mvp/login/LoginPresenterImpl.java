package com.android_project_mvp_framework.mvp.login;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.CallBack;

import javax.inject.Inject;

/**
 *
 * @author xiaolong.wei
 * @date 2017/9/29
 */

public class LoginPresenterImpl implements LoginContract.ILoginPresenter, CallBack<LoginBean> {
    private LoginContract.ILoginView mILoginView;

    @Inject
    LoginContract.ILoginModel mILoginModel;
    @Inject
    public LoginPresenterImpl() {}

    @Override
    public void login(String username,String password) {
        mILoginView.showProgress();
        mILoginModel.login(username,password,"",this);
    }

    @Override
    public void attachView(LoginContract.ILoginView iView) {
        this.mILoginView =  iView;
    }

    @Override
    public void onNoResponse(int code, String msg) {
        mILoginView.showToast(msg);
    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        mILoginView.hideProgress();
        mILoginView.setDate(loginBean);
        mILoginView.showToast("success");
    }

    @Override
    public void onFailure(String s) {
        mILoginView.showToast(s);
        mILoginView.hideProgress();
    }

    @Override
    public void onDestroy() {
        mILoginModel.onDestroy();
    }
}
