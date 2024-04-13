package com.rickyapi.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author yupi
 */
@SpringBootTest
class UserRegisterTest {

    @Resource
    private UserService userService;

    @Test
    void userRegister() {
        String userAccount = "rickyTest1";
        String userPassword = "rickyTest123";
        String checkPassword = "rickyTest123";
        try {
            long result = userService.userRegister(userAccount, userPassword, checkPassword);
            Assertions.assertEquals(-1, result);
        } catch (Exception e) {

        }
    }
}