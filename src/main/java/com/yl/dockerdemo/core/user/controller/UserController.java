package com.yl.dockerdemo.core.user.controller;

import com.yl.dockerdemo.core.user.domain.User;
import com.yl.dockerdemo.core.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.List;


/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/8 20:04
 */
@Api(tags = "用户管理")
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    @NonNull
    private final UserService userService;

    @ApiOperation(value = "用户列表")
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    public static String encode(String value) {
        return new String(Base64.encodeBase64(value.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    }

}
