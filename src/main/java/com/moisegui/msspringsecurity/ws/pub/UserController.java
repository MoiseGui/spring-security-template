package com.moisegui.msspringsecurity.ws.pub;

import com.moisegui.msspringsecurity.bean.User;
import com.moisegui.msspringsecurity.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userControllerPub")
@RequestMapping("/auth-service/api/v1/pub/user")
public class UserController {

    @PostMapping("/sign-in")
    public String signIn(@RequestBody User user) {
        return userService.signIn(user);
    }

    @Autowired
    private UserService userService;
}
