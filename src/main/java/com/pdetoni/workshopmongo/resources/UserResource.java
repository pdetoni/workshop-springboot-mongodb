package com.pdetoni.workshopmongo.resources;

import com.pdetoni.workshopmongo.domain.User;
import com.pdetoni.workshopmongo.repository.UserRepository;
import com.pdetoni.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {

        List<User> users = service.findAll();
        return  ResponseEntity.ok().body(users);
    }

}
