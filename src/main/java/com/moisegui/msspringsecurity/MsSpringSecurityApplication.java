package com.moisegui.msspringsecurity;

import com.moisegui.msspringsecurity.bean.Role;
import com.moisegui.msspringsecurity.bean.User;
import com.moisegui.msspringsecurity.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class MsSpringSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MsSpringSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (userService.findByUsername("admin") == null) {
            User admin = new User("admin", "admin");
            admin.setAuthorities(Collections.singletonList(new Role("ROLE_ADMIN")));
            userService.save(admin);
        }

    }

    @Autowired
    private UserService userService;

}
