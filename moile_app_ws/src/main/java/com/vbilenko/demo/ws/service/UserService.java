package com.vbilenko.demo.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vbilenko.demo.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto user);
	
}
