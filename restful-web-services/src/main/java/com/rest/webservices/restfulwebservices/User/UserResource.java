package com.rest.webservices.restfulwebservices.User;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
@Autowired

private UserDaoService service;

@GetMapping("/users")
public List<User> retrieveAllUsers(){
	
	return service.findAll();
}

@GetMapping("/users/{id}")
public User retrieveUser(@PathVariable int id) {
	return service.FindOne(id);
	
	
}
}


