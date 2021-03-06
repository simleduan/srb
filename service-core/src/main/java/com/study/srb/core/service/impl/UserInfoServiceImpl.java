package com.study.srb.core.service.impl;

import com.study.srb.core.pojo.entity.UserInfo;
import com.study.srb.core.mapper.UserInfoMapper;
import com.study.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author xiaocai
 * @since 2021-11-16
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
