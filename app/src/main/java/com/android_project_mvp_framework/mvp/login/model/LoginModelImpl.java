package com.android_project_mvp_framework.mvp.login.model;

import com.android_project_mvp_framework.IModel;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.mvp.login.presenter.CallBack;
import com.android_project_mvp_framework.net.ResponseCallBack;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.service.ApiService;

import javax.inject.Inject;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public class LoginModelImpl implements ILoginModel, IModel {

    @Inject
    ApiService apiService;

    @Inject
    public LoginModelImpl() {}

    @Override
    public void login(String username, String password, final CallBack callBack) {
        apiService.login(username,password,"999").enqueue(new ResponseCallBack<ResponseResult<LoginBean>>() {
            @Override
            public void onSuccess(ResponseResult<LoginBean> loginBeanResponseResult) {
                callBack.onSuccess(loginBeanResponseResult);
            }

            @Override
            public void onFailure(String s) {
                callBack.onFailure(s);
            }

            @Override
            public void onNoResponse(int code, String msg) {
                callBack.onNoResponse(code ,msg);
            }

        });
    }
}
