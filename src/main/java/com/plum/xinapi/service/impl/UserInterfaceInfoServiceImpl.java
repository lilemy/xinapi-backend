package com.plum.xinapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plum.xinapi.model.entity.UserInterfaceInfo;
import com.plum.xinapi.service.UserInterfaceInfoService;
import com.plum.xinapi.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author qq233
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-03-09 16:51:15
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




