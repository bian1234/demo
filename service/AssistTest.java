package com.hld.service;

import com.hld.service.subInterface.InterfaceManageService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AssistTest {

    @Autowired
    private static  InterfaceManageService interfaceManageService;

    public static String postStr = "{ \"errcode\": \"0\",\"errmsg\": \"get token successfully.\", \"data\": {  \"expiredDate\": \"2019-04-14 23:06:43\",  \"token_id\":\"C20370EE48794E50:5389E103B430435382CBD4DEE3DEE773686E65130E9F4169B047831C9CC95992\" }}";

    public static void main(String[] args) {
        Assist assist = new Assist();
//        if (assist.isSuccess(postStr)){
//            System.out.println("成功");
//        }else {
//           JSONObject jsonObject =  assist.ifFail(postStr);
//            System.out.println("错误代码:"+jsonObject.getString("errcode"));
//            System.out.println("错误信息:"+jsonObject.getString("errmsg"));
//        }
        try {
            String token = interfaceManageService.interfaceManage();
            System.out.println("获取到的token是"+token);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
