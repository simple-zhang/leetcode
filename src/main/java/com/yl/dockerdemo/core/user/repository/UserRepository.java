package com.yl.dockerdemo.core.user.repository;

import com.yl.dockerdemo.core.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/9 8:48
 */
@Repository
public class UserRepository {

    private static final Map<String, User> USER_MAP;
    public static final Integer USER_COUNT = 3;

    static {
        USER_MAP = new HashMap<>(USER_COUNT);
        for (Integer i = 0; i < USER_COUNT; i++) {
            long time = System.currentTimeMillis();
            Random random = new Random(2);

            User user = new User();
            user.setId(String.valueOf(time));
            user.setUsername("王" + i);
            user.setSex(random.nextInt() == 1 ? "男" : "女");
            user.setAge(random.nextInt() + i);
            USER_MAP.put(user.getId(), user);
        }
    }

    public List<User> list() {
        return USER_MAP.values()
                .stream()
                .sorted(Comparator.comparing(User::getId))
                .collect(Collectors.toList());
    }

}
