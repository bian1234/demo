package com.hld.service.entity;

/**
 * @author: ykbian
 * @date: 2019/4/14 23:02
 * @Description:  运行应用统计
 */
public class runStats {

    String start; //启动设备个数
    String stop;   //停止设备个数

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }
}
