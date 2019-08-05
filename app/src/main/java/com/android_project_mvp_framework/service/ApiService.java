package com.android_project_mvp_framework.service;

import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.ResponseResult;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by xiaolong.wei on 2017/9/13.
 */

public interface ApiService {

//    @FormUrlEncoded
//    @POST("housekeeper/login")
//    Call<ResponseResult<LoginBean>> login(@Field("phone") String phone, @Field("passwd") String passwd , @Field("registration_id") String registration_id);


    @FormUrlEncoded
    @POST("housekeeper/login")
    public Observable<ResponseResult<LoginBean>> login(@Field("phone") String phone, @Field("passwd") String passwd , @Field("registration_id") String registration_id);
}
