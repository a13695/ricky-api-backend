package com.rickyapi.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ricky.rickyapicommon.model.entity.UserInterfaceInfo;
import com.rickyapi.project.common.ErrorCode;
import com.rickyapi.project.exception.BusinessException;
import com.rickyapi.project.service.UserInterfaceInfoService;
import com.rickyapi.project.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-03-23 20:11:33
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userinterfaceInfo, boolean add) {
        if (userinterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，所有参数必须非空
        if (add) {
            if (userinterfaceInfo.getInterfaceInfoId() <=0 || userinterfaceInfo.getUserId() <=0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR,"接口或用户不存在");
            }
        }
        if (userinterfaceInfo.getLeftNum() <=0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不得小于0");
        }
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 判断
        if (interfaceInfoId <= 0 || userId <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("interfaceInfoId", interfaceInfoId);
        updateWrapper.eq("userId", userId);

//        updateWrapper.gt("leftNum", 0);
        updateWrapper.setSql("leftNum = leftNum - 1, totalNum = totalNum + 1");
        return this.update(updateWrapper);
    }

}




