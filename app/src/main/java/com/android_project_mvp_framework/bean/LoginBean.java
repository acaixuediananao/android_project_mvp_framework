package com.android_project_mvp_framework.bean;

import java.io.Serializable;

/**
 * Created by xiaolong.wei on 2017/9/27.
 */

public class LoginBean implements Serializable {


    /**
     * userId : 154
     * userType : HouseKeeper
     * deviceId : 0
     * ticket : 93e4eedbfc5d56681485b6a75da3c910
     * account : null
     * appId : 0
     * accountOrigin : 0
     * thirdPartyToken : null
     * createTime : 0
     * userSecretKey : null
     * uuid : null
     * easemob_kefu_name : fengdi@hechangre.com
     * easemob_kefu_pwd : Fd123456
     * productKey : null
     * role : 1
     */

    private int userId;
    private String userType;
    private int deviceId;
    private String ticket;
    private Object account;
    private int appId;
    private int accountOrigin;
    private Object thirdPartyToken;
    private int createTime;
    private Object userSecretKey;
    private Object uuid;
    private String easemob_kefu_name;
    private String easemob_kefu_pwd;
    private Object productKey;
    private int role;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Object getAccount() {
        return account;
    }

    public void setAccount(Object account) {
        this.account = account;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getAccountOrigin() {
        return accountOrigin;
    }

    public void setAccountOrigin(int accountOrigin) {
        this.accountOrigin = accountOrigin;
    }

    public Object getThirdPartyToken() {
        return thirdPartyToken;
    }

    public void setThirdPartyToken(Object thirdPartyToken) {
        this.thirdPartyToken = thirdPartyToken;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public Object getUserSecretKey() {
        return userSecretKey;
    }

    public void setUserSecretKey(Object userSecretKey) {
        this.userSecretKey = userSecretKey;
    }

    public Object getUuid() {
        return uuid;
    }

    public void setUuid(Object uuid) {
        this.uuid = uuid;
    }

    public String getEasemob_kefu_name() {
        return easemob_kefu_name;
    }

    public void setEasemob_kefu_name(String easemob_kefu_name) {
        this.easemob_kefu_name = easemob_kefu_name;
    }

    public String getEasemob_kefu_pwd() {
        return easemob_kefu_pwd;
    }

    public void setEasemob_kefu_pwd(String easemob_kefu_pwd) {
        this.easemob_kefu_pwd = easemob_kefu_pwd;
    }

    public Object getProductKey() {
        return productKey;
    }

    public void setProductKey(Object productKey) {
        this.productKey = productKey;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
