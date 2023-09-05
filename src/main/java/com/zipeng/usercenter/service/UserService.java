package com.zipeng.usercenter.service;

import com.zipeng.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
 * @author liang.zi.peng
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2023-09-04 15:51:02
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

}
