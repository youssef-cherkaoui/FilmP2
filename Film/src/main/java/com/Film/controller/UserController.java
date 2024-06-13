package com.Film.controller;


import com.Film.model.FilmModel;
import com.Film.model.UserModel;
import com.Film.repostorie.FilmRepositorie;
import com.Film.repostorie.UserRepositorie;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepositorie userRepositorie;

    @GetMapping
    public List<UserModel> getAllUsers(){
        return userRepositorie.findAll();
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user){
        return userRepositorie.save(user);
    }

    @GetMapping("/R/{id}")
    public UserModel getUserById(@PathVariable long id){
        return userRepositorie.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        userRepositorie.deleteById(id);
    }

    @PutMapping("/{id}")
    public UserModel updateUser(@PathVariable long id, @RequestBody UserModel user){
        user.setIdUser(id);
        return userRepositorie.save(user);
    }

}
