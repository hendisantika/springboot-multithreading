package com.hendisantika.springbootmultithreading.repository;

import com.hendisantika.springbootmultithreading.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multithreading
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/11/20
 * Time: 08.21
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
