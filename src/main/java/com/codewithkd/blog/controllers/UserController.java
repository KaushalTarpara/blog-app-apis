package com.codewithkd.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithkd.blog.payloads.UserDto;
import com.codewithkd.blog.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private  UserServices userServices;

	//POST - Create user	
	@GetMapping("/")
	private ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		
		UserDto createUserDto=this.userServices.createUser(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	
	//PUT - update user 
	
	//DELETE - delete user
	
	//GET - user get
}
