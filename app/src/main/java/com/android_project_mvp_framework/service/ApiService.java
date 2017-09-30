package com.android_project_mvp_framework.service;

import com.android_project_mvp_framework.bean.DataBean;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.ResponseResult;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by xiaolong.wei on 2017/9/13.
 */

public interface ApiService {

    @GET("account/membership/exchange")
    Call<DataBean> getData(@Header("t") String t);

    @FormUrlEncoded
    @POST("login")
    Call<ResponseResult<LoginBean>> login(@Field("accname") String accname, @Field("password") String password , @Field("t") String t);
}
