package com.rickyapi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ricky.rickyapicommon.model.entity.InterfaceInfo;


/**
* @author Administrator
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2023-11-30 00:18:06
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
