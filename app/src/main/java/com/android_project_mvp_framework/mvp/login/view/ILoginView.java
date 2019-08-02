package com.android_project_mvp_framework.mvp.login.view;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.mvp.IView;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public interface ILoginView extends IView {

    void showProgress();
    void hideProgress();
    String getUserName();
    String getPassword();
    void setDate(LoginBean loginBean);
    void showToast(String msg);
}
