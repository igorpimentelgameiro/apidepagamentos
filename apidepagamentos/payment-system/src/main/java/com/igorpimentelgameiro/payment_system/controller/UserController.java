package com.igorpimentelgameiro.payment_system.controller;

import com.igorpimentelgameiro.payment_system.dto.UserRequest;
import com.igorpimentelgameiro.payment_system.dto.UserResponse;
import com.igorpimentelgameiro.payment_system.entity.User;
import com.igorpimentelgameiro.payment_system.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> registerUser(@RequestBody @Valid UserRequest userRequest){
        User user = userRequest.toModel();
        UserResponse usersaved = userService.registerUser(user);
        return ResponseEntity.ok().body(usersaved);
    }


}
