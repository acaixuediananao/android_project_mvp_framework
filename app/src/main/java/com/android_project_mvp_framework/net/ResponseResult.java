package com.android_project_mvp_framework.net;
import java.io.Serializable;

/**
 * Created by xiaolong.wei on 2017/9/18.
 */

public class ResponseResult<T>  implements Serializable{

    private int cd;
    private String msg;
    private T data;

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
