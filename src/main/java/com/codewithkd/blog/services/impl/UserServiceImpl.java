package com.codewithkd.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codewithkd.blog.entities.User;
import com.codewithkd.blog.payloads.UserDto;
import com.codewithkd.blog.repositories.UserRepo;
import com.codewithkd.blog.services.UserServices;

public class UserServiceImpl implements UserServices {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDto createUser(UserDto userDto) {
 
		User user =this.dtoToUser(userDto);
		
		User sevedUser=this.userRepo.save(user);
		return this.userToDto(sevedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	//Convert UserDto to User object 
	public User dtoToUser(UserDto userDto) {
		User user=new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		return user;
	}	

	//Convert User to UserDto Object 
	public UserDto userToDto(User user) {
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());
		return userDto;
	}
}
