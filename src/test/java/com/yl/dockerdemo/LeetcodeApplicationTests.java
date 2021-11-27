package com.yl.dockerdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

@SpringBootTest
class LeetcodeApplicationTests {

    public static List<User> USER_LIST = Collections.emptyList();

    {
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setUsername("张三" + i);
            USER_LIST.add(user);
        }
    }

    @Test
    void contextLoads() {
    }

    private User findOne() {
        return USER_LIST.get(0);
    }

    class User {
        private String username;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public User(String username) {
            this.username = username;
        }

        public User() {
        }
    }

}
