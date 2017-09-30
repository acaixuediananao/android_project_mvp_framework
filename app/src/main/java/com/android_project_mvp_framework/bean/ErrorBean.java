package com.android_project_mvp_framework.bean;

import java.io.Serializable;

/**
 * Created by xiaolong.wei on 2017/9/18.
 */

public class ErrorBean implements Serializable {

    private String msg;
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
