package com.hld.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.hld.entity.InterfaceManage;
import com.hld.service.AppManagementService;
import com.hld.service.Assist;
import com.hld.service.subInterface.InterfaceManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class InterfaceManageServiceImpl  implements InterfaceManageService {


    @Resource(name = "manageService")
    private AppManagementService manageService;



    private static Map<String ,Object> tokenMap= null;

    private static final String parentDepartment = "edbce14094424ba583cbaca7a05de547";

    @Override
    public String interfaceManage() throws Exception {
        String tokenId = null;
        Object object = tokenMap.get("expiredDate");
        if (object == null){
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1970-01-01 01:01:01");
            tokenMap.put("expiredDate",date);
        }
        Long expiredDate  = ((Date)tokenMap.get("expiredDate")).getTime();
        Long newTime = System.currentTimeMillis();
        if (expiredDate-newTime> 5000){
            tokenId = (String) tokenMap.get("tokenId");
            return tokenId;
        }
        /**
         * 此处要从数据库获取用户信息
         */
        JSONObject json = new JSONObject();
//        json.put("userName", userName);
//        json.put("password", password);
//        json.put("hash",hash);
        //从数据库获取用户信息
        List<InterfaceManage> interfaceManages = manageService.getInterfaceWithUrl(parentDepartment);
        if (!interfaceManages.isEmpty()) {
            for (int i = 0; i < interfaceManages.size(); i++) {
                Assist assist = new Assist();
//                String postStr = "{ \"errcode\": \"0\",\"errmsg\": \"get token successfully.\", \"data\": {  \"expiredDate\": \"2019-04-14 23:06:43\",  \"token_id\":\"C20370EE48794E50:5389E103B430435382CBD4DEE3DEE773686E65130E9F4169B047831C9CC95992\" }}";

                String postStr = assist.createUrlAndPost("/controller/iot/sg/v1/tokens", interfaceManages.get(i), json);
                //解析第一层数据
                JSONObject object2 = assist.getData(postStr);
                if (!object2.isEmpty()) {
                    //解析第二层数据
                    JSONObject object1 = assist.parSecondResponsebody(object2);
                    tokenId = object1.getString("token_id");
                    Date expiredDate1 = object1.getDate("expiredDate");
                    tokenMap.put("tokenId", tokenId);
                    tokenMap.put("expiredDate", expiredDate1);
                }
            }
        }else {
            System.out.println("接口信息为空");
            return null;
        }
        return tokenId;
    }

    @Override
    public Boolean changeEncrypt(String encryption) throws Exception {
        Boolean b = false;
        JSONObject json = new JSONObject();
        json.put("encryption",encryption);
        List<InterfaceManage> interfaceManages = manageService.getInterfaceWithUrl(parentDepartment);
        if (!interfaceManages.isEmpty()) {
            for (int i = 0; i < interfaceManages.size(); i++) {
                Assist assist = new Assist();
                String post = assist.createUrlAndPost("/controller/iot/sg/v1/changeencrypt", interfaceManages.get(i), json);
                b = assist.isSuccess(post);
            }
        }
        return b;
    }

    public static void main(String[] args) {
        InterfaceManageServiceImpl interfaceManageService = new InterfaceManageServiceImpl();
        try {
            String token = interfaceManageService.interfaceManage();
            System.out.println(token);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
