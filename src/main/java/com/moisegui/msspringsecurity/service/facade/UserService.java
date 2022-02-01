package com.moisegui.msspringsecurity.service.facade;

import com.moisegui.msspringsecurity.bean.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    String signIn(User user);

    User save(User user);
    List<User> findAll();
    User findByUsername(String username);
}
