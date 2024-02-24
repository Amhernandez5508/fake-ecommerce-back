package com.hernandezalejandro.apiloginforjs.rest;

import com.hernandezalejandro.apiloginforjs.model.User;
import com.hernandezalejandro.apiloginforjs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public @ResponseBody List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
