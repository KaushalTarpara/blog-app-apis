package com.codewithkd.blog.services;

import java.util.List;

import com.codewithkd.blog.payloads.UserDto;

public interface UserServices {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);	
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
	
}
