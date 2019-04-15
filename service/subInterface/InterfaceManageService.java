package com.hld.service.subInterface;

import com.hld.entity.InterfaceManage;

import java.util.List;


/**
 * @TODO: 接口认证服务
 * @author:ykbian@qq.com
 * @date:2019/4/12 11:35
 */

public interface InterfaceManageService {

    /**
     * 接口认证
     * @return
     */
    public    String interfaceManage()  throws Exception;


    /**
     * 第三方应用更新SM4加密密钥接口
     */
    public Boolean changeEncrypt(String encryption) throws  Exception;
}