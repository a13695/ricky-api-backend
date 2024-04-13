package com.rickyapi.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ricky.rickyapicommon.model.entity.InterfaceInfo;
import com.ricky.rickyapicommon.service.InnerInterfaceInfoService;
import com.rickyapi.project.mapper.InterfaceInfoMapper;
import com.rickyapi.project.common.ErrorCode;
import com.rickyapi.project.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url,method)){

            throw new BusinessException(ErrorCode.PARAMS_ERROR);

        }

        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("url",url);

        queryWrapper.eq("method",method);

        InterfaceInfo interfaceInfo = interfaceInfoMapper.selectOne(queryWrapper);

        return interfaceInfo;
    }
}
