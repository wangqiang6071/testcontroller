package com.example.testcontroller;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangqiang
 * @Date: 2022/6/28 15:28
 */
public class AjaxJson {
    private boolean success = true;// 是否成功
    private String errorCode = "-1";//错误代码

    private String msg = "";// 提示信息
    private String object = "";// 传字符串
    private Object data = "";// 数据
    private LinkedHashMap<String, Object> body = new LinkedHashMap<String, Object>();//封装json的map
    private List<Map<String, Object>> listdata = new ArrayList<Map<String, Object>>();//封装json的map
    private List list = new ArrayList();//封装json的list
    //返回成功
    public static AjaxJson successFun() {
        AjaxJson json = new AjaxJson();
        json.setSuccess(true);
        json.setMsg("操作成功");
        return json;
    }
    //返回成功
    public static AjaxJson successFun(String msg) {
        AjaxJson json = new AjaxJson();
        json.setSuccess(true);
        json.setMsg(msg);
        return json;
    }
    //返回成功
    public static AjaxJson successFun(Object data) {
        AjaxJson json = new AjaxJson();
        json.setSuccess(true);
        json.setMsg("操作成功");
        json.setData(data);
        return json;
    }
    //返回失败
    public static AjaxJson fail(String msg) {
        AjaxJson json = new AjaxJson();
        json.setSuccess(false);
        json.setMsg(msg);
        return json;
    }

    //返回失败
    public static AjaxJson fail(String msg,String errorCode) {
        AjaxJson json = new AjaxJson();
        json.setSuccess(false);
        json.setErrorCode(errorCode);
        json.setMsg(msg);
        return json;
    }

    public LinkedHashMap<String, Object> getBody() {
        return body;
    }

    public void setBody(LinkedHashMap<String, Object> body) {
        this.body = body;
    }

    public void put(String key, Object value){//向json中添加属性，在js中访问，请调用data.map.key
        body.put(key, value);
    }

    public void remove(String key){
        body.remove(key);
    }

    public List<Map<String, Object>> getListdata() {
        return listdata;
    }

    public void setListdata(List<Map<String, Object>> listdata) {
        this.listdata = listdata;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {//向json中添加属性，在js中访问，请调用data.msg
        this.msg = msg;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }


    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
