package com.android_project_mvp_framework.net;

import android.telecom.Call;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.CallBack;
import com.android_project_mvp_framework.net.ResponseResult;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public  class RxRequestCallBack<T extends ResponseResult> {

    public Disposable createRequest(Observable<T> observable,final CallBack callBack){
        Disposable subscribe = observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<T>() {
                    @Override
                    public void accept(T t) throws Exception {
                        if (t.getCd() == 0){
                            callBack.onSuccess(t.getData());
                        }else {
                            callBack.onFailure(t.getMsg());
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                            callBack.onNoResponse(-1,throwable.getMessage());
                    }
                });
        return subscribe;
    }
}
