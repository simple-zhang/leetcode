package com.yl.dockerdemo.core.user.service;

import com.yl.dockerdemo.core.user.domain.User;
import com.yl.dockerdemo.core.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/9 8:48
 */
@Service
@RequiredArgsConstructor
public class UserService {

    @NonNull
    private final UserRepository userRepository;

    public List<User> list() {
        return userRepository.list();
    }
}
