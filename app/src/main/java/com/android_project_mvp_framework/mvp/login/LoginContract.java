package com.android_project_mvp_framework.mvp.login;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.base.IModel;
import com.android_project_mvp_framework.base.IPresenter;
import com.android_project_mvp_framework.base.IView;

public interface LoginContract {

    public interface ILoginView extends IView {
        void showProgress();
        void hideProgress();
        String getUserName();
        String getPassword();
        void setDate(LoginBean loginBean);
    }

    public interface ILoginPresenter extends IPresenter<ILoginView>{
        void login(String username, String password);
    }

    public interface ILoginModel extends IModel {
        void login(String username, String password);
    }
}
