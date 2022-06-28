package com.example.testcontroller;

import lombok.Data;

/**
 * 工控机器和远程电脑的下的设备数据
 * @author wangqiang
 * @Date: 2022/6/15 19:53
 */

public class deviceData {
    private String status;
    private String name;
    private String ip;
    private String childcount;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getChildcount() {
        return childcount;
    }

    public void setChildcount(String childcount) {
        this.childcount = childcount;
    }
}
