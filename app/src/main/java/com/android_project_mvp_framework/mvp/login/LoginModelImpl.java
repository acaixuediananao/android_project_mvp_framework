package com.android_project_mvp_framework.mvp.login;

import android.util.Log;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.CallBack;
//import com.android_project_mvp_framework.net.ResponseCallBack;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.net.RxRequestCallBack;
import com.android_project_mvp_framework.service.ApiService;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 *
 * @author xiaolong.wei
 * @date 2017/9/29
 */

public class LoginModelImpl implements LoginContract.ILoginModel{

    private static final String TAG = "LoginModelImpl";

    @Inject
    CompositeDisposable mDisposableContainer;
    @Inject
    ApiService apiService;
    @Inject
    RxRequestCallBack<ResponseResult<LoginBean>> rxRequestObservable;

    @Inject
    public LoginModelImpl() {
    }

    @Override
    public void login(String username, String password,String registrationId,CallBack callBack) {
        mDisposableContainer.add(rxRequestObservable.createRequest(apiService.login(username,password,registrationId),callBack));
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ------------mDisposableContainer.clear()");
        mDisposableContainer.clear();
    }
}
