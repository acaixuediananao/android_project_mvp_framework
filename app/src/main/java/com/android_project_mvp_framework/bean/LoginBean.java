package com.android_project_mvp_framework.bean;

import com.android_project_mvp_framework.net.ResponseResult;

import java.io.Serializable;

/**
 * Created by xiaolong.wei on 2017/9/27.
 */

public class LoginBean implements Serializable {

    /**
     * t : /
     * ticket : 552e24f1308730a8d11ac5fd28fd1b7f
     * has_invest : invested
     * has_open : opened
     */

    private String t;
    private String ticket;
    private String has_invest;
    private String has_open;

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getHas_invest() {
        return has_invest;
    }

    public void setHas_invest(String has_invest) {
        this.has_invest = has_invest;
    }

    public String getHas_open() {
        return has_open;
    }

    public void setHas_open(String has_open) {
        this.has_open = has_open;
    }
}
