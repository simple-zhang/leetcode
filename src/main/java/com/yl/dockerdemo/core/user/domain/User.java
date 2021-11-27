package com.yl.dockerdemo.core.user.domain;

import lombok.Data;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/9 8:50
 */
@Data
public class User {

    private String id;
    private String username;
    private String sex;
    private Integer age;

}
