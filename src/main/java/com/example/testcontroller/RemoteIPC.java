package com.example.testcontroller;

import lombok.Data;

import java.util.List;

/**
 * 工控机和远程电脑数据
 * @author wangqiang
 * @Date: 2022/6/15 19:51
 */

public class RemoteIPC {
    //设备类型0远程电脑 1 工控机
    private String type;
    private String status;
    private String name;
    private String ip;
    private Integer childconut;
    List<deviceData>list;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public Integer getChildconut() {
        return childconut;
    }

    public void setChildconut(Integer childconut) {
        this.childconut = childconut;
    }

    public List<deviceData> getList() {
        return list;
    }

    public void setList(List<deviceData> list) {
        this.list = list;
    }
}
