package com.rickyapi.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ricky.rickyapicommon.model.entity.User;
import com.ricky.rickyapicommon.service.InnerUserService;
import com.rickyapi.project.mapper.UserMapper;
import com.rickyapi.project.common.ErrorCode;
import com.rickyapi.project.exception.BusinessException;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        User user = userMapper.selectOne(queryWrapper);
        return user;
}
}
