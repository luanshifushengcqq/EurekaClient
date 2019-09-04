package com.eureka.client.dal.entity;

import lombok.Data;

@Data
public class SysUser {
    private Integer Id;
    private String loginName;
    private String password;
    private String displayName;
    private String status;
    private String createTime;
    private String reasonDesc;
}
