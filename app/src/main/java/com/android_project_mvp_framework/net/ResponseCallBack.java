package com.android_project_mvp_framework.net;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by xiaolong.wei on 2017/9/18.
 */

public abstract class ResponseCallBack<T extends ResponseResult> implements Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        T t = ((T) response.body());
        int code = response.raw().code();

        if (code == 200){
            if (t.getCd() == 0){
                onSuccess(t);
            }else {
                onFailure(t.getMsg());
            }
        }else {
            onNoResponse(code,response.message());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onFailure(t.getMessage());
    }


    public abstract  void onSuccess(T t);

    public abstract void onFailure(String s);

    public abstract void onNoResponse(int code , String msg);

}
