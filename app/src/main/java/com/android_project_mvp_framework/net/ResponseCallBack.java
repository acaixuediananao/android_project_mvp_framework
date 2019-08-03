package com.android_project_mvp_framework.net;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author xiaolong.wei
 * @date 2017/9/18
 */

public  class ResponseCallBack<T extends ResponseResult> implements Callback<T> {
    CallBack callBack;
    @Inject
    public ResponseCallBack() {}

    public void setCallBack(CallBack callBack){
        this.callBack = callBack;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        T t = ((T) response.body());
        int code = response.raw().code();

        if (code == 200){
            if (t.getCd() == 0){
                callBack.onSuccess(t.getData());
            }else {
                callBack.onFailure(t.getMsg());
            }
        }else {
            callBack.onNoResponse(code,response.message());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        callBack.onFailure(t.getMessage());
    }

}
