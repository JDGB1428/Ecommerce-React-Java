package com.juan.ecommerceBackend.controller;

import com.juan.ecommerceBackend.models.user;
import com.juan.ecommerceBackend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private UserRepository userRepository;

    public List<user>getAlluser(){
        return userRepository.findAll();
    }
    public user createUser(user user){

    }
    public ResponseEntity<user> getUserById(Long id){

    }
    public ResponseEntity<user> updateUser(@PathVariable Long id, @RequestBody user user){

    }
    public Map<String, Boolean> deleteUser(long id){

    }
}
