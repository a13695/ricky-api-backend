package com.rickyapi.project.model.vo;


import com.ricky.rickyapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 *
 * @author ricky
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 是否已点赞
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}