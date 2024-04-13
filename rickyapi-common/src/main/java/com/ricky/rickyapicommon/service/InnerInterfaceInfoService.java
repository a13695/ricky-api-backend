package com.ricky.rickyapicommon.service;


import com.ricky.rickyapicommon.model.entity.InterfaceInfo;

/**
* @author Administrator
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2023-11-30 00:18:06
*/
public interface InnerInterfaceInfoService{

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数，返回接口信息，为空表示不存在）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
