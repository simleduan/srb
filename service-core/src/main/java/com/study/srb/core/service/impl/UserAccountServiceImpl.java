package com.study.srb.core.service.impl;

import com.study.srb.core.pojo.entity.UserAccount;
import com.study.srb.core.mapper.UserAccountMapper;
import com.study.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author xiaocai
 * @since 2021-11-16
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
