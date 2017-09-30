package com.android_project_mvp_framework.mvp.login.module;

import com.android_project_mvp_framework.mvp.login.presenter.CallBack;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public interface ILoginModule {

    void login(String username, String password, CallBack callBack);
}
