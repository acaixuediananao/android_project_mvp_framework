package com.android_project_mvp_framework.base;

public interface IPresenter<T>{

    void attachView(T iView);
    void onDestroy();
}
