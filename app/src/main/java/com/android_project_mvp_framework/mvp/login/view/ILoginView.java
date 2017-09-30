package com.android_project_mvp_framework.mvp.login.view;

import com.android_project_mvp_framework.bean.LoginBean;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public interface ILoginView {

    void showProgress();
    void hideProgress();
    String getUserName();
    String getPassword();
    void setDate(LoginBean loginBean);
    void showToast(String msg);
}
