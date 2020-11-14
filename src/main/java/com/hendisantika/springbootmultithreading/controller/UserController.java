package com.hendisantika.springbootmultithreading.controller;

import com.hendisantika.springbootmultithreading.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multithreading
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/11/20
 * Time: 08.52
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;
}
