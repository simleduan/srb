package com.study.srb.core.service.impl;

import com.study.srb.core.pojo.entity.UserLoginRecord;
import com.study.srb.core.mapper.UserLoginRecordMapper;
import com.study.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author xiaocai
 * @since 2021-11-16
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
