package com.ricky.rickyapicommon.service;


import com.ricky.rickyapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService{

    /**
     * 数据库中查是否已分配给用户秘钥（根据 accessKey ,secretKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
