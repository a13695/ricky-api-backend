package com.ricky.rickyapicommon.service;


/**
* @author Administrator
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-03-23 20:11:33
*/
public interface InnerUserInterfaceInfoService {

    boolean invokeCount(long interfaceInfoId, long userId);

}
