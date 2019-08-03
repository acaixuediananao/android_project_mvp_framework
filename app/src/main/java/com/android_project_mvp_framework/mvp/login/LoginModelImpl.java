package com.android_project_mvp_framework.mvp.login;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.CallBack;
import com.android_project_mvp_framework.net.ResponseCallBack;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.service.ApiService;

import javax.inject.Inject;

/**
 *
 * @author xiaolong.wei
 * @date 2017/9/29
 */

public class LoginModelImpl implements LoginContract.ILoginModel{

    @Inject
    ApiService apiService;
    @Inject
    ResponseCallBack<ResponseResult<LoginBean>> responseCallBack;

    @Inject
    public LoginModelImpl() {}

    @Override
    public void login(String username, String password) {
        apiService.login(username,password,"999").enqueue(responseCallBack);
    }

    @Override
    public void setCallBack(CallBack callBack) {
        responseCallBack.setCallBack(callBack);
    }
}
