package com.spring.transaction;


import com.spring.transaction.domain.User;
import com.spring.transaction.domain.UserRequest;
import com.spring.transaction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getUsers(){

        List<User> users = userRepository.findAll();
        return users;
    }

    @PostMapping(value = "/users/create")
    public void createUser(@RequestBody UserRequest userRequest){

        User user = new User();
        user.setCity(userRequest.getCity());
        user.setName(userRequest.getName());

        userRepository.save(user);
    }
}
