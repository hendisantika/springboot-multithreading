package com.hendisantika.springbootmultithreading.service;

import com.hendisantika.springbootmultithreading.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multithreading
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/11/20
 * Time: 08.22
 */
@Service
@Log4j2
public class UserService {

    @Autowired
    private UserRepository repository;

    private Object target;

}
