package com.hld.service.entity;

/**
 * @author: ykbian
 * @date: 2019/4/14 23:04
 * @Description: 安装应用统计
 */
public class deployStats {

    public String success;   //cheng
    public String fail;     //失败
    public String  pending;   //正在安装

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }
}
