package com.zipeng.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登陆请求体
 *
 * @author liang.zi.peng
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -2925429025699139526L;

    private String userAccount;

    private String userPassword;
}
