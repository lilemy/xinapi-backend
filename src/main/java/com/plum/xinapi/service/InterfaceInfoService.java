package com.plum.xinapi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plum.xinapi.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.plum.xinapi.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.plum.xinapi.model.vo.InterfaceInfoVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qq233
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-03-09 16:51:15
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 获取查询条件
     *
     * @param interfaceInfoQueryRequest
     * @return
     */
    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);

    /**
     * 获取帖子封装
     *
     * @param interfaceInfo
     * @return
     */
    InterfaceInfoVO getInterfaceInfoVO(InterfaceInfo interfaceInfo);

    /**
     * 分页获取帖子封装
     *
     * @param interfaceInfoPage
     * @param request
     * @return
     */
    Page<InterfaceInfoVO> getInterfaceInfoVOPage(Page<InterfaceInfo> interfaceInfoPage, HttpServletRequest request);
}
