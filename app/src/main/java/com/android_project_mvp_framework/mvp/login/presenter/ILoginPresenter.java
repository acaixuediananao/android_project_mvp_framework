package com.android_project_mvp_framework.mvp.login.presenter;

import com.android_project_mvp_framework.mvp.IPresenter;
import com.android_project_mvp_framework.mvp.IView;
import com.android_project_mvp_framework.mvp.login.view.ILoginView;

/**
 * Created by xiaolong.wei on 2017/9/29.
 */

public interface ILoginPresenter extends IPresenter {
    void login(String username, String password);

    @Override
    void attachView(IView iView);
}
