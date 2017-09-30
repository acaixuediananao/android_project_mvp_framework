package com.android_project_mvp_framework.mvp.login.module;

import android.widget.Toast;

import com.android_project_mvp_framework.IModule;
import com.android_project_mvp_framework.app.DaggerModuleInjector;
import com.android_project_mvp_framework.bean.ErrorBean;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.mvp.login.presenter.CallBack;
import com.android_project_mvp_framework.net.ResponseCallBack;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.service.ApiService;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public class LoginModuleImpl implements ILoginModule,IModule {

    @Inject
    ApiService apiService;


    public LoginModuleImpl() {
        DaggerModuleInjector.create().inject(this);
//        App.cmptActivity(this).inject(this);
    }

    @Override
    public void login(String username, String password, final CallBack callBack) {
        apiService.login(username,password,"/").enqueue(new ResponseCallBack<ResponseResult<LoginBean>>() {
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
