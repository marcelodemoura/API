package com.br.marcelo.API.Deploy.controller;

import com.br.marcelo.API.Deploy.model.User;
import com.br.marcelo.API.Deploy.service.UserService;
import jakarta.servlet.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserControler {

    private final UserService userService;

    public UserControler(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User>create(@RequestBody User userCreate){
        var user = userService.create(userCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreate);
    }


    @GetMapping("/{id}")

    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }


}
