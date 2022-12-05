package com.saber.designjava.service.impl;

import com.saber.designjava.pojo.SysUser;
import com.saber.designjava.mapper.SysUserMapper;
import com.saber.designjava.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author caochenlei
 * @since 2022-12-06
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
