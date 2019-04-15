package com.hld.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hld.entity.InterfaceManage;
import com.hld.service.entity.*;
import com.hld.service.subInterface.InterfaceManageService;
import com.hld.util.HttpsUtils;
import com.jfinal.template.ext.directive.Str;
import org.apache.http.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @TODO:  数据解析
 * @author:ykbian@qq.com
 * @date:2019/4/12 17:37
 */
@Component
public class Assist {

    @Autowired
    private InterfaceManageService interfaceManageService;
    private static final String successCode = "0";


    /**
     * 拼接url,发出请求，返回请求结果
     */
    public String createUrlAndPost(String url, InterfaceManage interfaceManage, JSONObject json) throws Exception{
        StringEntity stringEntity = new StringEntity(json.toString());
        Map<String, String> header = new HashMap<String, String>();
        header.put("Content-Type", "application/json");
        header.put("Accept", "application/json");
        header.put("X-ACCESS-TOKEN",interfaceManageService.interfaceManage());
        String post = HttpsUtils.post(
                "https://" + interfaceManage + ":" + interfaceManage.getJkport() + url, header,stringEntity);
        return post;
    }



    /**
     * @TODO:  判断是否成功
     * @author:ykbian@qq.com
     * @date:2019/4/13 10:58
     * @param:
     * @return:
     */
    public boolean isSuccess(String string){
        Boolean b = false;
        JSONObject jsonObject = JSONObject.parseObject(string);
        String errcord = jsonObject.getString("errcode");
        if (successCode.equalsIgnoreCase(errcord)){
            b = true;
        }
        return b;
    }

    /**
     * @TODO: 如果失败的话返回失败信息
     * @author:ykbian@qq.com
     * @date:2019/4/13 11:03
     * @param:
     * @return:
     */
    public JSONObject ifFail(String body){
        JSONObject jsonObject = new JSONObject();
        JSONObject jsondata = JSON.parseObject(body);
        String errcode = jsondata.getString("errcode");
        String errmsg  = jsondata.getString("errmsg");
        jsonObject.put("errcode",errcode);
        jsonObject.put("errmsg",errmsg);
        return jsonObject;
    }

    /**
     * 解析返回的第一层数据,只返回data信息，一般是单条数据
     * @param body
     * @return
     */
    public JSONObject getData(String body) {
        JSONObject jsondata = JSON.parseObject(body);
        JSONObject data = jsondata.getJSONObject("data");
        return data;
    }

    /**
     * @TODO:  返回携带分页信息和data或者devices数据
     * @author:ykbian@qq.com
     * @date:2019/4/12 22:57
     * @param:
     * @return:
     */
    public JSONObject parDataWithhPage(String string) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsondata = JSON.parseObject(string);
        int pageIndex = jsondata.getIntValue("pageIndex");
        int pageSize = jsondata.getIntValue("pageSize");
        int totalRecord = jsondata.getIntValue("totalRecord");
        JSONObject data = jsondata.getJSONObject("data");
        JSONObject devices = jsondata.getJSONObject("devices");
        JSONObject apps = jsondata.getJSONObject("apps");
        jsonObject.put("pageIndex", pageIndex);
        jsonObject.put("pageSize", pageSize);
        jsonObject.put("totalRecord", totalRecord);
        //一般情况下，data和devices只存在一个。
        jsonObject.put("data", data);
        jsonObject.put("devices", devices);
        jsonObject.put("apps",apps);
        return jsonObject;
    }
    /**
     * @TODO: 解析data
     * @author:ykbian@qq.com
     * @date:2019/4/13 9:35
     * @param:
     * @return:
     */
    public JSONObject parSecondResponsebody(JSONObject object){

        return object;
    }

    /**
     * @TODO:  返回成功和失败列表
     * @author:ykbian@qq.com
     * @date:2019/4/13 9:11
     */
    public JSONObject parSuccessAndFail(String body) {
        JSONObject jsondata = JSON.parseObject(body);
        JSONObject jsonObject = new JSONObject();
        JSONArray success = jsondata.getJSONArray("success");
        JSONArray fail = jsondata.getJSONArray("fail");
        jsonObject.put("success", success);
        jsonObject.put("fail", fail);
        return jsonObject;
    }


    /**
     * @TODO:  解析success信息
     * @author:ykbian@qq.com
     * @date:2019/4/13 9:15
     * @param:
     * @return:
     */


    /**
     * @TODO: 解析fail信息
     * @author:ykbian@qq.com
     * @date:2019/4/13 9:16
     * @param:
     * @return:
     */
    public JSONObject parFail(JSONObject jsonObject){

        /**
         * 可以套用 ifFail()方法，待定。
         */
        return null;
    }





    /**
     * @TODO: 解析获取apps信息
     * @author:ykbian@qq.com
     * @date:2019/4/13 9:50
     * @param:
     * @return:
     */
    public Apps getApps(String esn, String containerName, List<AppInfo> appInfos){
        Apps apps = new Apps();
        apps.setAppInfo(appInfos);
        apps.setEsn(esn);
        apps.setContainerName(containerName);
        return apps;
    }

    public AppInfo getAppInfo(String appName,int operateType){
        AppInfo info = new AppInfo();
        info.setAppName(appName);
        info.setOperateType(operateType);
        return info;
    }


    public containerinfo createContainerInfo(){
        containerinfo containerInfo = new containerinfo();



        return containerInfo;
    }


    /**
     * @Author：ykbian
     * @Description:   返回带分页信息的data 或者apps  或者devices数据
     * @Date:  2019/4/14 21:46
     * @Param:
     * @return:
     */
    public JSONObject  getDataWithPage(String string){
        JSONObject jsonObject = new JSONObject();
        JSONObject js = jsonObject.getJSONObject(string);
        int pageIndex = js.getInteger("pageIndex");
        int pageSize = js.getInteger("pageSize");
        int totalRecord = js.getInteger("totalRecord");
        jsonObject.put("pageIndex",pageIndex);
        jsonObject.put("pageSize",pageSize);
        jsonObject.put("totalRecord",totalRecord);
        //如果返回key的是apps
        JSONArray appArr = js.getJSONArray("apps");
        if(!appArr.isEmpty()){
            String appStr = JSONObject.toJSONString(appArr);
            List<Object> appList = JSONObject.parseArray(appStr,  Object.class);
            jsonObject.put("apps",appList);
        }

        //--key是data
        JSONArray dataArr = js.getJSONArray("data");
        if(!dataArr.isEmpty()){
            String dataStr = JSONObject.toJSONString(dataArr);
            List<Object> dataList = JSONObject.parseArray(dataStr,  Object.class);
            jsonObject.put("data",dataList);
        }
        //key是devices
        JSONArray devicesArr = js.getJSONArray("devices");
        if(!dataArr.isEmpty()){
            String devicesStr = JSONObject.toJSONString(devicesArr);
            List<Object> devicesList = JSONObject.parseArray(devicesStr,  Object.class);
            jsonObject.put("devices",devicesList);
        }
        return jsonObject;

    }





    /**
     * @Author：ykbian
     * @Description:  创建时间域对象
     * @Date:  2019/4/14 22:42
     * @Param:
     * @return:
     */
    public timerange createTimerange(String startTime,String endTime){
        timerange time  = new timerange();
        time.setStarttime(startTime);
        time.setEndtime(endTime);
        return time;

    }

    /**
     * @Author：ykbian
     * @Description:   创建取值范围对象
     * @Date:  2019/4/14 22:43
     * @Param:
     * @return:
     */
    public numrange createNumrange(int max,int min){
        numrange num = new numrange();
        num.setMax(max);
        num.setMin(min);
        return num;
    }

    /**
     * @Author：ykbian
     * @Description:   创建condition对象，
     * @Date:  2019/4/14 22:34
     * @Param:  user,如果是在应用管理/apps/files接口使用，user为apps,如果是在容器管理containers使用，user为containers
     * @return:
     */
    public condition createcondition(String name, String status, String type, String vendor, String version,
                                     timerange appReleaseTime, String containerType, String containerVersion,
                                     List<Object> physicalInterfaces, String user){
        condition cond = new condition();
        cond.setName(name);
        cond.setType(type);
        cond.setVersion(version);
        if ("apps".equalsIgnoreCase(user)){
            cond.setVendor(vendor);
            cond.setContainerVersion(containerVersion);
            cond.setStatus(status);
            cond.setPhysicalInterfaces(physicalInterfaces);
            cond.setContainerVersion(version);
            cond.setContainerType(containerType);
            cond.setAppReleaseTime(appReleaseTime);
        }else {
            cond.setReleaseTime(appReleaseTime);
        }
        return cond;
    }



    /**
     * @Author：ykbian
     * @Description:   容器管理部分解析data数据
     * @Date:  2019/4/14 23:32
     * @Param:
     * @return:
     */
    public JSONObject parContainerManagerDataObject(String methodName, String jsonStr){
        JSONObject json = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject js = jsonObject.getJSONObject(jsonStr);
        //查看可安装容器文件列表
        if ("files".equalsIgnoreCase(methodName)){
            JSONArray dataArr = js.getJSONArray("containerfiles");
            String dataStr = JSONObject.toJSONString(dataArr);
            String name = js.getString("name");
            String type = js.getString("type");
            String vendor = js.getString("type");
            List<containerfiles> dataList = JSONObject.parseArray(dataStr,  containerfiles.class);
            json.put("containerfiles",dataList);
            json.put("name",name);
            json.put("type",type);
            json.put("vendor",vendor);
        }
        //安装容器
        else if ("deploy".equalsIgnoreCase(methodName)){
            containerinfo containerInfo = (containerinfo)js.get("containerinfo");
            String esn = js.getString("esn");
            containerconfig config = (containerconfig)js.get("containerconfig");
            json.put("containerinfo",containerInfo);
            json.put("esn",esn);
            json.put("containerconfig",config);
        }
        //卸载容器
        else if ("uninstall".equalsIgnoreCase(methodName)){
            String esn = js.getString("esn");
            String containerName = js.getString("containerName");
            json.put("esn",esn);
            json.put("containerName",containerName);
        }
        //启动和停止容器（选择容器执行开启或者停止操作） //修改容器配置
        else if ("operate".equalsIgnoreCase(methodName)  || "config".equalsIgnoreCase(methodName)){
            String errcode = js.getString("errcode");
            String errmsg = js.getString("errmsg");
            String containerName = js.getString("containerName");
            String esn = js.getString("esn");
            json.put("errcode",errcode);
            json.put("errmsg",errmsg);
            json.put("containerName",containerName);
            json.put("esn",esn);
        }
        //监控容器
        else if ("monitor".equalsIgnoreCase(methodName)){
            String esn = js.getString("esn");
            String containerName = js.getString("containerName");
            String cpuStatus = js.getString("cpuStatus");
            String memoryStatus = js.getString("memoryStatus");
            String flashStatus = js.getString("flashStatus");
            int runningStatus = js.getInteger("runningStatus");
            json.put("cpuStatus",cpuStatus);
            json.put("memoryStatus",memoryStatus);
            json.put("flashStatus",flashStatus);
            json.put("runningStatus",runningStatus);
            json.put("containerName",containerName);
            json.put("esn",esn);
        }else {
            System.out.println("方法名选择错误");
            json = null;
        }
        return json;
    }


    /**
     * @TODO:  容器查询部分解析data、containers/devices数据
     * @author:ykbian@qq.com
     * @date:2019/4/15 9:25
     * @param:
     * @return:
     */
    public JSONObject parContainerQueryData(String methodName, String jsonStr){
        JSONObject json = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject js = jsonObject.getJSONObject(jsonStr);
        int containerNum = js.getInteger("containerNum");
        int containerDeployProgress = js.getInteger("containerDeployProgress");
        if ("devicesdeployinfo".equalsIgnoreCase(methodName)){   //批量查询设备容器安装信息

            int containerDeployStatus = js.getInteger("containerDeployStatus");
            devicequeryresult dev = (devicequeryresult)js.get("device");
            json.put("containerNum",containerNum);
            json.put("containerDeployProgress",containerDeployProgress);
            json.put("containerDeployStatus",containerDeployStatus);
            json.put("devicequeryresult",dev);
        }else if ("devicesruninfo".equalsIgnoreCase(methodName)){   //批量查询设备容器运行信息
            int containerDeployStatus = js.getInteger("containerDeployStatus");
            devicequeryresult dev = (devicequeryresult)js.get("device");
            json.put("containerNum",containerNum);
            json.put("containerDeployStatus",containerDeployStatus);
            json.put("devicequeryresult",dev);
        }else if ("devicedeployinfo".equalsIgnoreCase(methodName)){   //查询指定设备容器安装信息
            containerinfo containerInfo = (containerinfo) js.get("containerInfo");
            containerdeploystatus containerDeployStatus = (containerdeploystatus)js.get("containerDeployStatus");
            containerconfig containerConfig = (containerconfig)js.get("containerConfig");
            boolean isPresetContainer = js.getBoolean("isPresetContainer");
            json.put("containerInfo",containerInfo);
            json.put("containerDeployStatus",containerDeployStatus);
            json.put("containerConfig",containerConfig);
            json.put("isPresetContainer",isPresetContainer);
        }else if ("deviceruninfo".equalsIgnoreCase(methodName)){   //查询指定设备容器运行信息t_container_list
            containerinfo containerInfo = (containerinfo) js.get("containerInfo");
            containerconfig containerConfig = (containerconfig) js.get("containerConfig");
            int containerRunStatus = js.getInteger("containerRunStatus");
            json.put("containerInfo",containerInfo);
            json.put("containerConfig",containerConfig);
            json.put("containerRunStatus",containerRunStatus);
        }else if ("containersdeployinfo".equalsIgnoreCase(methodName)){//批量查询容器安装信息
            int deviceNum = js.getInteger("deviceNum");
//            int containerDeployProgress = js.getInteger("containerDeployProgress");
            int containerDeployStatus = js.getInteger("containerDeployStatus");
            containerinfo cf = (containerinfo)js.get("containerInfo");
            json.put("deviceNum",deviceNum);
            json.put("containerDeployProgress",containerDeployProgress);
            json.put("containerDeployStatus",containerDeployStatus);
            json.put("containerinfo",cf);
        }else if ("containersruninfo".equalsIgnoreCase(methodName)){  //批量查询容器运行信息
            containerinfo container = (containerinfo)js.get("container");
            int deviceNum = js.getInteger("deviceNum");
            int containerRunStatus = js.getInteger("containerRunStatus");
            json.put("container",container);
            json.put("deviceNum",deviceNum);
            json.put("containerRunStatus",containerRunStatus);
        }else if ("containerdeployinfo".equalsIgnoreCase(methodName)  || //查询指定容器安装信息
                "containerruninfo".equalsIgnoreCase(methodName)) { //查询指定容器运行信息
            devicequeryresult deviceInfo = (devicequeryresult)js.get("deviceInfo");
            int containerRunStatus = js.getInteger("containerRunStatus");
            containerconfig containerConfig = (containerconfig) js.get("containerConfig");
            boolean isPresetContainer = js.getBoolean("isPresetContainer");
            json.put("isPresetContainer",isPresetContainer);
            json.put("deviceInfo",deviceInfo);
            json.put("containerRunStatus",containerRunStatus);
            json.put("containerConfig",containerConfig);
        }else if ("statistics".equalsIgnoreCase(methodName)){//指定容器查看安装与统计信息
            containerinfo containerInfo = (containerinfo)js.get("containerInfo");
            deployStats deployStats = (deployStats)js.get("deployStats");
            runStats runStats = (runStats)js.get("runStats");
            json.put("runStats",runStats);
            json.put("deployStats",deployStats);
            json.put("containerInfo",containerInfo);
        }else {
            System.out.println("方法名称输入错误");
            return null;
        }
        return json;
    }

    
    /**
     * @TODO:
     * @author:ykbian@qq.com
     * @date:2019/4/15 10:41
     * @param:
     * @return:
     */
    public JSONObject parAppManageData(String methodName, String jsonStr) {
        JSONObject json = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject js = jsonObject.getJSONObject(jsonStr);
        String esn = js.getString("esn");
        String appName = js.getString("appName");
        String containerName = js.getString("containerName");
        json.put("esn", esn);
        json.put("appName",appName);
        json.put("containerName",containerName);
        if ("files".equalsIgnoreCase(methodName)) {   //查询应用商店中应用列表
            String name = js.getString("name");
            String type = js.getString("type");
            String vendor = js.getString("vendor");
            JSONArray appFilesArr = js.getJSONArray("appFiles");
            String appFilesStr = JSONObject.toJSONString(appFilesArr);
            List<appFiles> appFiles1 = JSONObject.parseArray(appFilesStr, appFiles.class);
            json.put("name", name);
            json.put("type", type);
            json.put("vendor", vendor);
            json.put("appFiles", appFiles1);
        } else if ("deploy".equalsIgnoreCase(methodName)) {  //安装app
            appInfo2 appInfo = (appInfo2) js.get("appInfo");
            json.put("appName", appName);
            json.put("appInfo",appInfo);
        } else if ("uninstall".equalsIgnoreCase(methodName)) {  //卸载app（在指定设备上卸载指定app）
//            json.put("esn", esn);
//            json.put("containerName", containerName);
//            json.put("appName", appName);
        } else if ("monitor".equalsIgnoreCase(methodName)) {  //监控
            JSONArray servicesArr = js.getJSONArray("services");
            String servicesStr = JSONObject.toJSONString(servicesArr);
            List<services> services = JSONObject.parseArray(servicesStr, services.class);
//            json.put("esn", esn);
//            json.put("containerName", containerName);
//            json.put("appName", appName);
            json.put("services", services);
        } else if ("operate".equalsIgnoreCase(methodName)) {  //启动停止app
            String errcode = js.getString("errcode");
            String errmsg = js.getString("errmsg");
            json.put("errcode", errcode);
            json.put("errmsg", errmsg);
//            json.put("esn", esn);
//            json.put("containerName", containerName);
//            json.put("appName", appName);
        } else {
            System.out.println("容器管理方法名传输错误");
            json = null;
        }

        return json;
    }



    /**
     * @TODO:  应用查询部分的data解析
     * @author:ykbian@qq.com
     * @date:2019/4/15 11:20
     * @param:
     * @return:
     */

    public JSONObject parAppQueryData(String methodName, String jsonStr){
        JSONObject json = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject js = jsonObject.getJSONObject(jsonStr);
        int appNum = js.getInteger("appNum");
        json.put("appNum",appNum);
        appinfo3 appInfo = (appinfo3) js.get("appInfo");
        json.put("appInfo", appInfo);
        String containerName = js.getString("containerName");
        json.put("containerName", containerName);
        int appRunStatus = js.getInteger("appRunStatus");
        json.put("appRunStatus",appRunStatus);

        if ("devicesdeployinfo".equalsIgnoreCase(methodName)){   //批量查询设备应用安装信息
            devicequeryresult device = (devicequeryresult)js.get("device");
            json.put("device",device);
//            int appNum = js.getInteger("appNum");
//            json.put("appNum",appNum);
            int appDeployStatus = js.getInteger("appDeployStatus");
            json.put("appDeployStatus",appDeployStatus);
            int appDeployProgress = js.getInteger("appDeployProgress");
            json.put("appDeployProgress",appDeployProgress);
        }else if ("devicesruninfo".equalsIgnoreCase(methodName)){  // 批量查询设备应用运行信息
            devicequeryresult device = (devicequeryresult)js.get("device");
//            int appNum = js.getInteger("appNum");
//            int appRunStatus = js.getInteger("appRunStatus");
            json.put("device",device);
//            json.put("appNum",appNum);
//            json.put("appRunStatus",appRunStatus);
        }else if ("devicedeployinfo".equalsIgnoreCase(methodName)){  // 查询指定设备应用安装信息
//            appinfo3 appInfo = (appinfo3) js.get("appInfo");
//            json.put("appInfo", appInfo);
//            String containerName = js.getString("containerName");
//            json.put("containerName", containerName);
            appdeploystatus appDeployStatus = (appdeploystatus)js.get("appDeployStatus");
            json.put("appDeployStatus", appDeployStatus);
        }else if ("deviceruninfo".equalsIgnoreCase(methodName)){  //查询指定设备应用运行信息
//            appinfo3 appInfo = (appinfo3) js.get("appInfo");
//            json.put("appInfo", appInfo);
//            String containerName = js.getString("containerName");
//            json.put("containerName", containerName);
//            int appRunStatus = js.getInteger("appRunStatus");
//            json.put("appRunStatus", appRunStatus);
        }else if ("appsdeployinfo".equalsIgnoreCase(methodName)){  //批量查询应用安装信息
//            appinfo3 appInfo = (appinfo3)js.get("appInfo");
//            json.put("appInfo",appInfo);
            int deviceNum = js.getInteger("deviceNum");
            json.put("deviceNum",deviceNum);
            int appDeployStatus = js.getInteger("appDeployStatus");
            json.put("appDeployStatus",appDeployStatus);
            int appDeployProgress = js.getInteger("appDeployProgress");
            json.put("appDeployProgress",appDeployProgress);
        }
        else if ("appsruninfo".equalsIgnoreCase(methodName)){  //  批量查询应用运行信息
//            appinfo3 appInfo = (appinfo3)js.get("appInfo");
            int deviceNum = js.getInteger("deviceNum");
//            int appRunStatus = js.getInteger("appRunStatus");
//            json.put("appInfo",appInfo);
            json.put("deviceNum",deviceNum);
//            json.put("appRunStatus",appRunStatus);
        }else if ("appdeployinfo".equalsIgnoreCase(methodName)){  //  查询指定应用安装信息
            devicequeryresult deviceInfo = (devicequeryresult)js.get("deviceInfo");
//            String containerName = js.getString("containerName");
            int appDeployStatus = js.getInteger("appDeployStatus");
//            json.put("containerName",containerName);
            json.put("deviceInfo",deviceInfo);
            json.put("appDeployStatus",appDeployStatus);
        }else if ("appruninfo".equalsIgnoreCase(methodName)){  //查询指定应用运行信息
            devicequeryresult deviceInfo = (devicequeryresult)js.get("deviceInfo");
//            String containerName = js.getString("containerName");
//            int appRunStatus = js.getInteger("appRunStatus");
            json.put("deviceInfo",deviceInfo);
//            json.put("containerName",containerName);
//            json.put("appRunStatus",appRunStatus);
        }else if ("statistics".equalsIgnoreCase(methodName)){  //指定应用查看安装与统计信息
            appinfo3 appinfo3 = (appinfo3) js.get("app");
            deployStats deployStats = (deployStats)js.get("deployStats");
            runStats runStats = (runStats)js.get("runStats");
            json.put("app",appinfo3);
            json.put("deployStats",deployStats);
            json.put("runStats",runStats);
        }else {
            System.out.println("应用信息查询方法名错误");
            json = null;
        }

        return json;
    }
}
