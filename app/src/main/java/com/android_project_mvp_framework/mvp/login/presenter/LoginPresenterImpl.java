package com.android_project_mvp_framework.mvp.login.presenter;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.mvp.IView;
import com.android_project_mvp_framework.mvp.login.model.ILoginModel;
import com.android_project_mvp_framework.mvp.login.model.LoginModelImpl;
import com.android_project_mvp_framework.mvp.login.view.ILoginView;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.service.ApiService;

import javax.inject.Inject;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public class LoginPresenterImpl implements ILoginPresenter,CallBack{
    private ILoginView mILoginView;

    @Inject
    ILoginModel mILoginModel;
    @Inject
    public LoginPresenterImpl() {}

    @Override
    public void login(String username,String password) {
        mILoginView.showProgress();
        mILoginModel.login(username,password,this);
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

    @Override
    public void attachView(IView iView) {
        this.mILoginView = ((ILoginView) iView);
    }
}
