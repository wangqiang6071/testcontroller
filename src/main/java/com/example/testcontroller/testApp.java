package com.example.testcontroller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangqiang
 * @Date: 2022/6/16 11:51
 */
@Controller
@RequestMapping("test")
public class testApp {

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "apps")
    public AjaxJson pushDeviceStateInfo(@RequestBody RemoteIPC json, HttpServletRequest request,HttpServletResponse response) {
        System.out.println(JSON.toJSONString(json));
        return AjaxJson.successFun("接收到数据");
    }
}
