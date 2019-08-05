package com.android_project_mvp_framework.net;

/**
 *
 * @author xiaolong.wei
 * @date 2017/9/29
 */

public interface CallBack<T> {

    void onSuccess(T t);
    void onFailure(String s);
    void onNoResponse(int code, String msg);
}
