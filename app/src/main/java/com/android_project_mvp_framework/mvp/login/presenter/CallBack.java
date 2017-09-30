package com.android_project_mvp_framework.mvp.login.presenter;

import com.android_project_mvp_framework.bean.ErrorBean;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.ResponseResult;

import java.util.List;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public interface CallBack {

    void onSuccess(ResponseResult<LoginBean> loginBeanResponseResult);
    void onFailure(String s);
    void onNoResponse(int code, String msg);
}
